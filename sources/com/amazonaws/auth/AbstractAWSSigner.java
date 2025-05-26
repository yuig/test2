package com.amazonaws.auth;

import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.internal.SdkDigestInputStream;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import ep.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public abstract class AbstractAWSSigner implements Signer {
    private static final int BUFFER_SIZE_MULTIPLIER = 5;
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final int TIME_MILLISEC = 1000;
    private static final ThreadLocal<MessageDigest> SHA256_MESSAGE_DIGEST = new ThreadLocal<MessageDigest>() { // from class: com.amazonaws.auth.AbstractAWSSigner.1
        @Override // java.lang.ThreadLocal
        public final MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e13) {
                throw new AmazonClientException("Unable to get SHA256 Function" + e13.getMessage(), e13);
            }
        }
    };
    public static final String EMPTY_STRING_SHA256_HEX = BinaryUtils.a(a(""));

    public static byte[] a(String str) {
        try {
            MessageDigest messageDigest = SHA256_MESSAGE_DIGEST.get();
            messageDigest.reset();
            messageDigest.update(str.getBytes(StringUtils.f29048a));
            return messageDigest.digest();
        } catch (Exception e13) {
            throw new AmazonClientException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to compute hash while signing request: ")), e13);
        }
    }

    public byte[] getBinaryRequestPayload(Request<?> request) {
        if (!HttpUtils.e(request)) {
            return getBinaryRequestPayloadWithoutQueryParams(request);
        }
        String b13 = HttpUtils.b(request);
        return b13 == null ? new byte[0] : b13.getBytes(StringUtils.f29048a);
    }

    public InputStream getBinaryRequestPayloadStream(Request<?> request) {
        if (!HttpUtils.e(request)) {
            return getBinaryRequestPayloadStreamWithoutQueryParams(request);
        }
        String b13 = HttpUtils.b(request);
        return b13 == null ? new ByteArrayInputStream(new byte[0]) : new ByteArrayInputStream(b13.getBytes(StringUtils.f29048a));
    }

    public InputStream getBinaryRequestPayloadStreamWithoutQueryParams(Request<?> request) {
        try {
            InputStream inputStream = ((DefaultRequest) request).f28539i;
            if (inputStream == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            if (inputStream.markSupported()) {
                return ((DefaultRequest) request).f28539i;
            }
            throw new AmazonClientException("Unable to read request payload to sign request.");
        } catch (Exception e13) {
            throw new AmazonClientException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to read request payload to sign request: ")), e13);
        }
    }

    public byte[] getBinaryRequestPayloadWithoutQueryParams(Request<?> request) {
        InputStream binaryRequestPayloadStreamWithoutQueryParams = getBinaryRequestPayloadStreamWithoutQueryParams(request);
        try {
            binaryRequestPayloadStreamWithoutQueryParams.mark(-1);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[5120];
            while (true) {
                int read = binaryRequestPayloadStreamWithoutQueryParams.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.close();
                    binaryRequestPayloadStreamWithoutQueryParams.reset();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e13) {
            throw new AmazonClientException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to read request payload to sign request: ")), e13);
        }
    }

    public String getCanonicalizedEndpoint(URI uri) {
        String a13 = StringUtils.a(uri.getHost());
        if (!HttpUtils.c(uri)) {
            return a13;
        }
        StringBuilder D = b.D(a13, ":");
        D.append(uri.getPort());
        return D.toString();
    }

    public String getCanonicalizedQueryString(Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            treeMap.put(HttpUtils.d(entry.getKey(), false), HttpUtils.d(entry.getValue(), false));
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb3.append((String) entry2.getKey());
            sb3.append("=");
            sb3.append((String) entry2.getValue());
            if (it.hasNext()) {
                sb3.append("&");
            }
        }
        return sb3.toString();
    }

    public String getCanonicalizedResourcePath(String str) {
        return getCanonicalizedResourcePath(str, true);
    }

    public String getRequestPayload(Request<?> request) {
        return newString(getBinaryRequestPayload(request));
    }

    public String getRequestPayloadWithoutQueryParams(Request<?> request) {
        return newString(getBinaryRequestPayloadWithoutQueryParams(request));
    }

    public Date getSignatureDate(long j13) {
        Date date = new Date();
        return j13 != 0 ? new Date(date.getTime() - (j13 * 1000)) : date;
    }

    public long getTimeOffset(Request<?> request) {
        long j13 = ((DefaultRequest) request).f28540j;
        AtomicLong atomicLong = SDKGlobalConfiguration.f28545a;
        return atomicLong.get() != 0 ? atomicLong.get() : j13;
    }

    public byte[] hash(String str) {
        return a(str);
    }

    public String newString(byte[] bArr) {
        return new String(bArr, StringUtils.f29048a);
    }

    public AWSCredentials sanitizeCredentials(AWSCredentials aWSCredentials) {
        String a13;
        String b13;
        String str;
        synchronized (aWSCredentials) {
            try {
                a13 = aWSCredentials.a();
                b13 = aWSCredentials.b();
                str = aWSCredentials instanceof AWSSessionCredentials ? ((BasicSessionCredentials) ((AWSSessionCredentials) aWSCredentials)).f28568c : null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (b13 != null) {
            b13 = b13.trim();
        }
        if (a13 != null) {
            a13 = a13.trim();
        }
        if (str != null) {
            str = str.trim();
        }
        return aWSCredentials instanceof AWSSessionCredentials ? new BasicSessionCredentials(a13, b13, str) : new BasicAWSCredentials(a13, b13);
    }

    public byte[] sign(String str, byte[] bArr, SigningAlgorithm signingAlgorithm) {
        try {
            return sign(str.getBytes(StringUtils.f29048a), bArr, signingAlgorithm);
        } catch (Exception e13) {
            throw new AmazonClientException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to calculate a request signature: ")), e13);
        }
    }

    public String signAndBase64Encode(String str, String str2, SigningAlgorithm signingAlgorithm) {
        return signAndBase64Encode(str.getBytes(StringUtils.f29048a), str2, signingAlgorithm);
    }

    public String getCanonicalizedResourcePath(String str, boolean z13) {
        if (str == null || str.length() == 0) {
            return "/";
        }
        if (z13) {
            str = HttpUtils.d(str, true);
        }
        return str.startsWith("/") ? str : "/".concat(str);
    }

    public byte[] hash(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e13) {
            throw new AmazonClientException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to compute hash while signing request: ")), e13);
        }
    }

    public String signAndBase64Encode(byte[] bArr, String str, SigningAlgorithm signingAlgorithm) {
        try {
            return Base64.encodeAsString(sign(bArr, str.getBytes(StringUtils.f29048a), signingAlgorithm));
        } catch (Exception e13) {
            throw new AmazonClientException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to calculate a request signature: ")), e13);
        }
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, SigningAlgorithm signingAlgorithm) {
        try {
            Mac mac = Mac.getInstance(signingAlgorithm.toString());
            mac.init(new SecretKeySpec(bArr2, signingAlgorithm.toString()));
            return mac.doFinal(bArr);
        } catch (Exception e13) {
            throw new AmazonClientException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to calculate a request signature: ")), e13);
        }
    }

    public byte[] hash(InputStream inputStream) {
        try {
            MessageDigest messageDigest = SHA256_MESSAGE_DIGEST.get();
            messageDigest.reset();
            SdkDigestInputStream sdkDigestInputStream = new SdkDigestInputStream(inputStream, messageDigest);
            while (sdkDigestInputStream.read(new byte[DEFAULT_BUFFER_SIZE]) > -1) {
            }
            return sdkDigestInputStream.getMessageDigest().digest();
        } catch (Exception e13) {
            throw new AmazonClientException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to compute hash while signing request: ")), e13);
        }
    }

    public String getCanonicalizedQueryString(Request<?> request) {
        if (HttpUtils.e(request)) {
            return "";
        }
        return getCanonicalizedQueryString(((DefaultRequest) request).f28533c);
    }
}
