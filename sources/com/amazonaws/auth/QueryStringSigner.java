package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import n60.o;

/* loaded from: classes3.dex */
public class QueryStringSigner extends AbstractAWSSigner implements Signer {
    private Date overriddenDate;

    private String calculateStringToSignV1(Map<String, String> map) {
        StringBuilder sb3 = new StringBuilder();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(map);
        for (Map.Entry entry : treeMap.entrySet()) {
            sb3.append((String) entry.getKey());
            sb3.append((String) entry.getValue());
        }
        return sb3.toString();
    }

    private String calculateStringToSignV2(Request<?> request) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        return "POST\n" + getCanonicalizedEndpoint(defaultRequest.f28535e) + "\n" + getCanonicalizedResourcePath(request) + "\n" + getCanonicalizedQueryString(defaultRequest.f28533c);
    }

    private String getCanonicalizedResourcePath(Request<?> request) {
        String str = "";
        if (((DefaultRequest) request).f28535e.getPath() != null) {
            str = "" + ((DefaultRequest) request).f28535e.getPath();
        }
        DefaultRequest defaultRequest = (DefaultRequest) request;
        if (defaultRequest.f28531a != null) {
            if (str.length() > 0 && !str.endsWith("/") && !defaultRequest.f28531a.startsWith("/")) {
                str = str.concat("/");
            }
            StringBuilder i13 = o.i(str);
            i13.append(defaultRequest.f28531a);
            str = i13.toString();
        } else if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return str.startsWith("//") ? str.substring(1) : str;
    }

    private String getFormattedTimestamp(long j13) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = this.overriddenDate;
        return date != null ? simpleDateFormat.format(date) : simpleDateFormat.format(getSignatureDate(j13));
    }

    public void addSessionCredentials(Request<?> request, AWSSessionCredentials aWSSessionCredentials) {
        ((DefaultRequest) request).b("SecurityToken", ((BasicSessionCredentials) aWSSessionCredentials).f28568c);
    }

    public void overrideDate(Date date) {
        this.overriddenDate = date;
    }

    @Override // com.amazonaws.auth.Signer
    public void sign(Request<?> request, AWSCredentials aWSCredentials) {
        sign(request, SignatureVersion.V2, SigningAlgorithm.HmacSHA256, aWSCredentials);
    }

    public void sign(Request<?> request, SignatureVersion signatureVersion, SigningAlgorithm signingAlgorithm, AWSCredentials aWSCredentials) {
        String calculateStringToSignV2;
        AWSCredentials sanitizeCredentials = sanitizeCredentials(aWSCredentials);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.b("AWSAccessKeyId", sanitizeCredentials.a());
        defaultRequest.b("SignatureVersion", signatureVersion.toString());
        defaultRequest.b("Timestamp", getFormattedTimestamp(getTimeOffset(defaultRequest)));
        if (sanitizeCredentials instanceof AWSSessionCredentials) {
            addSessionCredentials(defaultRequest, (AWSSessionCredentials) sanitizeCredentials);
        }
        if (signatureVersion.equals(SignatureVersion.V1)) {
            calculateStringToSignV2 = calculateStringToSignV1(defaultRequest.f28533c);
        } else {
            if (!signatureVersion.equals(SignatureVersion.V2)) {
                throw new AmazonClientException("Invalid Signature Version specified");
            }
            defaultRequest.b("SignatureMethod", signingAlgorithm.toString());
            calculateStringToSignV2 = calculateStringToSignV2(defaultRequest);
        }
        defaultRequest.b("Signature", signAndBase64Encode(calculateStringToSignV2, sanitizeCredentials.b(), signingAlgorithm));
    }
}
