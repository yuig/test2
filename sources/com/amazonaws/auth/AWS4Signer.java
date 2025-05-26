package com.amazonaws.auth;

import a.a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import ep.b;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class AWS4Signer extends AbstractAWSSigner implements ServiceAwareSigner, RegionAwareSigner {
    protected static final String ALGORITHM = "AWS4-HMAC-SHA256";
    private static final String DATE_PATTERN = "yyyyMMdd";
    private static final long MAX_EXPIRATION_TIME_IN_SECONDS = 604800;
    private static final long MILLISEC = 1000;
    protected static final String TERMINATOR = "aws4_request";
    private static final String TIME_PATTERN = "yyyyMMdd'T'HHmmss'Z'";
    protected static final Log log = LogFactory.a(AWS4Signer.class);
    protected boolean doubleUrlEncode;
    protected Date overriddenDate;
    protected String regionName;
    protected String serviceName;

    public static class HeaderSigningResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f28546a;

        /* renamed from: b, reason: collision with root package name */
        public final String f28547b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f28548c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f28549d;

        public HeaderSigningResult(String str, String str2, byte[] bArr, byte[] bArr2) {
            this.f28546a = str;
            this.f28547b = str2;
            this.f28548c = bArr;
            this.f28549d = bArr2;
        }
    }

    public AWS4Signer() {
        this(true);
    }

    public void addHostHeader(Request<?> request) {
        String host = ((DefaultRequest) request).f28535e.getHost();
        DefaultRequest defaultRequest = (DefaultRequest) request;
        if (HttpUtils.c(defaultRequest.f28535e)) {
            StringBuilder D = b.D(host, ":");
            D.append(defaultRequest.f28535e.getPort());
            host = D.toString();
        }
        defaultRequest.a("Host", host);
    }

    public void addSessionCredentials(Request<?> request, AWSSessionCredentials aWSSessionCredentials) {
        ((DefaultRequest) request).a("x-amz-security-token", ((BasicSessionCredentials) aWSSessionCredentials).f28568c);
    }

    public String calculateContentHash(Request<?> request) {
        InputStream binaryRequestPayloadStream = getBinaryRequestPayloadStream(request);
        binaryRequestPayloadStream.mark(-1);
        String a13 = BinaryUtils.a(hash(binaryRequestPayloadStream));
        try {
            binaryRequestPayloadStream.reset();
            return a13;
        } catch (IOException e13) {
            throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", e13);
        }
    }

    public String calculateContentHashPresign(Request<?> request) {
        return calculateContentHash(request);
    }

    public final HeaderSigningResult computeSignature(Request<?> request, String str, String str2, String str3, String str4, AWSCredentials aWSCredentials) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String extractRegionName = extractRegionName(defaultRequest.f28535e);
        String extractServiceName = extractServiceName(defaultRequest.f28535e);
        String str5 = str + "/" + extractRegionName + "/" + extractServiceName + "/aws4_request";
        String stringToSign = getStringToSign(str3, str2, str5, getCanonicalRequest(request, str4));
        String str6 = "AWS4" + aWSCredentials.b();
        Charset charset = StringUtils.f29048a;
        byte[] bytes = str6.getBytes(charset);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        byte[] sign = sign(TERMINATOR, sign(extractServiceName, sign(extractRegionName, sign(str, bytes, signingAlgorithm), signingAlgorithm), signingAlgorithm), signingAlgorithm);
        return new HeaderSigningResult(str2, str5, sign, sign(stringToSign.getBytes(charset), sign, signingAlgorithm));
    }

    public String extractRegionName(URI uri) {
        String str = this.regionName;
        return str != null ? str : AwsHostNameUtils.a(uri.getHost(), this.serviceName);
    }

    public String extractServiceName(URI uri) {
        String str = this.serviceName;
        if (str != null) {
            return str;
        }
        Pattern pattern = AwsHostNameUtils.f29034a;
        String host = uri.getHost();
        if (!host.endsWith(".amazonaws.com")) {
            throw new IllegalArgumentException(a.k("Cannot parse a service name from an unrecognized endpoint (", host, ")."));
        }
        String substring = host.substring(0, host.indexOf(".amazonaws.com"));
        return (substring.endsWith(".s3") || AwsHostNameUtils.f29034a.matcher(substring).matches()) ? "s3" : substring.indexOf(46) == -1 ? substring : substring.substring(0, substring.indexOf(46));
    }

    public String getCanonicalRequest(Request<?> request, String str) {
        request.getClass();
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String str2 = defaultRequest.f28538h.toString() + "\n" + getCanonicalizedResourcePath(HttpUtils.a(defaultRequest.f28535e.getPath(), defaultRequest.f28531a, false), this.doubleUrlEncode) + "\n" + getCanonicalizedQueryString(request) + "\n" + getCanonicalizedHeaderString(request) + "\n" + getSignedHeadersString(request) + "\n" + str;
        log.f("AWS4 Canonical Request: '\"" + str2 + "\"");
        return str2;
    }

    public String getCanonicalizedHeaderString(Request<?> request) {
        ArrayList arrayList = new ArrayList();
        DefaultRequest defaultRequest = (DefaultRequest) request;
        arrayList.addAll(defaultRequest.f28534d.keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (needsSign(str)) {
                String replaceAll = StringUtils.a(str).replaceAll("\\s+", " ");
                String str2 = (String) defaultRequest.f28534d.get(str);
                sb3.append(replaceAll);
                sb3.append(":");
                if (str2 != null) {
                    sb3.append(str2.replaceAll("\\s+", " "));
                }
                sb3.append("\n");
            }
        }
        return sb3.toString();
    }

    public final long getDateFromRequest(Request<?> request) {
        Date signatureDate = getSignatureDate(getTimeOffset(request));
        Date date = this.overriddenDate;
        if (date != null) {
            signatureDate = date;
        }
        return signatureDate.getTime();
    }

    public final String getDateStamp(long j13) {
        return DateUtils.b(DATE_PATTERN, new Date(j13));
    }

    public String getScope(Request<?> request, String str) {
        return str + "/" + extractRegionName(((DefaultRequest) request).f28535e) + "/" + extractServiceName(((DefaultRequest) request).f28535e) + "/aws4_request";
    }

    public String getSignedHeadersString(Request<?> request) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((DefaultRequest) request).f28534d.keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (needsSign(str)) {
                if (sb3.length() > 0) {
                    sb3.append(";");
                }
                sb3.append(StringUtils.a(str));
            }
        }
        return sb3.toString();
    }

    public String getStringToSign(String str, String str2, String str3, String str4) {
        String str5 = str + "\n" + str2 + "\n" + str3 + "\n" + BinaryUtils.a(hash(str4));
        log.f("AWS4 String to Sign: '\"" + str5 + "\"");
        return str5;
    }

    public final String getTimeStamp(long j13) {
        return DateUtils.b(TIME_PATTERN, new Date(j13));
    }

    public boolean needsSign(String str) {
        return "date".equalsIgnoreCase(str) || "Content-MD5".equalsIgnoreCase(str) || "host".equalsIgnoreCase(str) || str.startsWith("x-amz") || str.startsWith("X-Amz");
    }

    public void overrideDate(Date date) {
        this.overriddenDate = date;
    }

    public void presignRequest(Request<?> request, AWSCredentials aWSCredentials, Date date) {
        long time = date != null ? (date.getTime() - System.currentTimeMillis()) / 1000 : 604800L;
        if (time > MAX_EXPIRATION_TIME_IN_SECONDS) {
            throw new AmazonClientException("Requests that are pre-signed by SigV4 algorithm are valid for at most 7 days. The expiration date set on the current request [" + getTimeStamp(date.getTime()) + "] has exceeded this limit.");
        }
        addHostHeader(request);
        AWSCredentials sanitizeCredentials = sanitizeCredentials(aWSCredentials);
        if (sanitizeCredentials instanceof AWSSessionCredentials) {
            ((DefaultRequest) request).b("X-Amz-Security-Token", ((BasicSessionCredentials) ((AWSSessionCredentials) sanitizeCredentials)).f28568c);
        }
        long dateFromRequest = getDateFromRequest(request);
        String dateStamp = getDateStamp(dateFromRequest);
        String str = sanitizeCredentials.a() + "/" + getScope(request, dateStamp);
        String timeStamp = getTimeStamp(dateFromRequest);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.b("X-Amz-Algorithm", ALGORITHM);
        defaultRequest.b("X-Amz-Date", timeStamp);
        defaultRequest.b("X-Amz-SignedHeaders", getSignedHeadersString(defaultRequest));
        defaultRequest.b("X-Amz-Expires", Long.toString(time));
        defaultRequest.b("X-Amz-Credential", str);
        byte[] bArr = computeSignature(defaultRequest, dateStamp, timeStamp, ALGORITHM, calculateContentHashPresign(defaultRequest), sanitizeCredentials).f28549d;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        defaultRequest.b("X-Amz-Signature", BinaryUtils.a(bArr2));
    }

    public void processRequestPayload(Request<?> request, HeaderSigningResult headerSigningResult) {
    }

    @Override // com.amazonaws.auth.RegionAwareSigner
    public void setRegionName(String str) {
        this.regionName = str;
    }

    @Override // com.amazonaws.auth.ServiceAwareSigner
    public void setServiceName(String str) {
        this.serviceName = str;
    }

    @Override // com.amazonaws.auth.Signer
    public void sign(Request<?> request, AWSCredentials aWSCredentials) {
        AWSCredentials sanitizeCredentials = sanitizeCredentials(aWSCredentials);
        if (sanitizeCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(request, (AWSSessionCredentials) sanitizeCredentials);
        }
        addHostHeader(request);
        long dateFromRequest = getDateFromRequest(request);
        String dateStamp = getDateStamp(dateFromRequest);
        String scope = getScope(request, dateStamp);
        String calculateContentHash = calculateContentHash(request);
        String timeStamp = getTimeStamp(dateFromRequest);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.a("X-Amz-Date", timeStamp);
        HashMap hashMap = defaultRequest.f28534d;
        if (hashMap.get("x-amz-content-sha256") != null && "required".equals(hashMap.get("x-amz-content-sha256"))) {
            defaultRequest.a("x-amz-content-sha256", calculateContentHash);
        }
        String str = sanitizeCredentials.a() + "/" + scope;
        HeaderSigningResult computeSignature = computeSignature(defaultRequest, dateStamp, timeStamp, ALGORITHM, calculateContentHash, sanitizeCredentials);
        String j13 = a.j("Credential=", str);
        String str2 = "SignedHeaders=" + getSignedHeadersString(defaultRequest);
        StringBuilder sb3 = new StringBuilder("Signature=");
        byte[] bArr = computeSignature.f28549d;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        sb3.append(BinaryUtils.a(bArr2));
        String sb4 = sb3.toString();
        StringBuilder w13 = a.w("AWS4-HMAC-SHA256 ", j13, ", ", str2, ", ");
        w13.append(sb4);
        defaultRequest.a("Authorization", w13.toString());
        processRequestPayload(defaultRequest, computeSignature);
    }

    public AWS4Signer(boolean z13) {
        this.doubleUrlEncode = z13;
    }
}
