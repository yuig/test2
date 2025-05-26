package com.amazonaws.services.s3.internal;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AbstractAWSSigner;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.auth.SigningAlgorithm;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class S3Signer extends AbstractAWSSigner {

    /* renamed from: c, reason: collision with root package name */
    public static final Log f28816c = LogFactory.a(S3Signer.class);

    /* renamed from: a, reason: collision with root package name */
    public final String f28817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28818b;

    public S3Signer(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException("Parameter resourcePath is empty");
        }
        this.f28817a = str;
        this.f28818b = str2;
    }

    @Override // com.amazonaws.auth.Signer
    public final void sign(Request request, AWSCredentials aWSCredentials) {
        String str = this.f28818b;
        if (str == null) {
            throw new UnsupportedOperationException("Cannot sign a request using a dummy S3Signer instance with no resource path");
        }
        String b13 = aWSCredentials.b();
        Log log = f28816c;
        if (b13 == null) {
            log.f("Canonical string will not be signed, as no AWS Secret Key was provided");
            return;
        }
        AWSCredentials sanitizeCredentials = sanitizeCredentials(aWSCredentials);
        if (sanitizeCredentials instanceof AWSSessionCredentials) {
            ((DefaultRequest) request).a("x-amz-security-token", ((BasicSessionCredentials) ((AWSSessionCredentials) sanitizeCredentials)).f28568c);
        }
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String a13 = HttpUtils.a(defaultRequest.f28535e.getPath(), str, true);
        Date signatureDate = getSignatureDate(getTimeOffset(request));
        int i13 = ServiceUtils.f28822a;
        defaultRequest.a("Date", DateUtils.b("EEE, dd MMM yyyy HH:mm:ss z", signatureDate));
        List list = RestUtils.f28812a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f28817a + "\n");
        HashMap hashMap = defaultRequest.f28534d;
        TreeMap treeMap = new TreeMap();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (str2 != null) {
                    String a14 = StringUtils.a(str2);
                    if ("content-type".equals(a14) || "content-md5".equals(a14) || "date".equals(a14) || a14.startsWith("x-amz-")) {
                        treeMap.put(a14, str3);
                    }
                }
            }
        }
        if (treeMap.containsKey("x-amz-date")) {
            treeMap.put("date", "");
        }
        if (!treeMap.containsKey("content-type")) {
            treeMap.put("content-type", "");
        }
        if (!treeMap.containsKey("content-md5")) {
            treeMap.put("content-md5", "");
        }
        LinkedHashMap linkedHashMap = defaultRequest.f28533c;
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((String) entry2.getKey()).startsWith("x-amz-")) {
                treeMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            String str4 = (String) entry3.getKey();
            String str5 = (String) entry3.getValue();
            if (str4.startsWith("x-amz-")) {
                sb3.append(str4);
                sb3.append(':');
                if (str5 != null) {
                    sb3.append(str5);
                }
            } else if (str5 != null) {
                sb3.append(str5);
            }
            sb3.append("\n");
        }
        sb3.append(a13);
        String[] strArr = (String[]) linkedHashMap.keySet().toArray(new String[linkedHashMap.size()]);
        Arrays.sort(strArr);
        char c13 = '?';
        for (String str6 : strArr) {
            if (RestUtils.f28812a.contains(str6)) {
                if (sb3.length() == 0) {
                    sb3.append(c13);
                }
                sb3.append(str6);
                String str7 = (String) linkedHashMap.get(str6);
                if (str7 != null) {
                    sb3.append("=");
                    sb3.append(str7);
                }
                c13 = '&';
            }
        }
        String sb4 = sb3.toString();
        log.f("Calculated string to sign:\n\"" + sb4 + "\"");
        defaultRequest.a("Authorization", "AWS " + sanitizeCredentials.a() + ":" + super.signAndBase64Encode(sb4, sanitizeCredentials.b(), SigningAlgorithm.HmacSHA1));
    }
}
