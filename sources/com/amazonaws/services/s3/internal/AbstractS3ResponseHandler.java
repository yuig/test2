package com.amazonaws.services.s3.internal;

import a.a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.S3ResponseMetadata;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.DateUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class AbstractS3ResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /* renamed from: a, reason: collision with root package name */
    public static final Log f28790a = LogFactory.a(S3MetadataResponseHandler.class);

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f28791b;

    static {
        HashSet hashSet = new HashSet();
        f28791b = hashSet;
        hashSet.add("Date");
        hashSet.add("Server");
        hashSet.add("x-amz-request-id");
        hashSet.add("x-amz-id-2");
        hashSet.add("X-Amz-Cf-Id");
        hashSet.add("Connection");
    }

    public static AmazonWebServiceResponse c(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponse = new AmazonWebServiceResponse();
        Map map = httpResponse.f28606d;
        String str = (String) map.get("x-amz-request-id");
        String str2 = (String) map.get("x-amz-id-2");
        String str3 = (String) map.get("X-Amz-Cf-Id");
        HashMap x13 = a.x("AWS_REQUEST_ID", str, "HOST_ID", str2);
        x13.put("CLOUD_FRONT_ID", str3);
        amazonWebServiceResponse.f28522b = new S3ResponseMetadata(x13);
        return amazonWebServiceResponse;
    }

    public static void d(HttpResponse httpResponse, ObjectMetadata objectMetadata) {
        Map map = httpResponse.f28606d;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str.startsWith("x-amz-meta-")) {
                objectMetadata.f28887a.put(str.substring(11), (String) entry.getValue());
            } else {
                boolean contains = f28791b.contains(str);
                Log log = f28790a;
                if (contains) {
                    log.f(str.concat(" is ignored."));
                } else if (str.equalsIgnoreCase("Last-Modified")) {
                    try {
                        String str2 = (String) entry.getValue();
                        int i13 = ServiceUtils.f28822a;
                        objectMetadata.f28888b.put(str, DateUtils.d("EEE, dd MMM yyyy HH:mm:ss z", str2));
                    } catch (Exception e13) {
                        log.j("Unable to parse last modified date: " + ((String) entry.getValue()), e13);
                    }
                } else if (str.equalsIgnoreCase("Content-Length")) {
                    try {
                        objectMetadata.f28888b.put(str, Long.valueOf(Long.parseLong((String) entry.getValue())));
                    } catch (NumberFormatException e14) {
                        log.j("Unable to parse content length: " + ((String) entry.getValue()), e14);
                    }
                } else if (str.equalsIgnoreCase("ETag")) {
                    objectMetadata.f28888b.put(str, ServiceUtils.a((String) entry.getValue()));
                } else if (str.equalsIgnoreCase("Expires")) {
                    try {
                        objectMetadata.f28889c = DateUtils.d("EEE, dd MMM yyyy HH:mm:ss z", (String) entry.getValue());
                    } catch (Exception e15) {
                        log.j("Unable to parse http expiration date: " + ((String) entry.getValue()), e15);
                    }
                } else if (str.equalsIgnoreCase("x-amz-expiration")) {
                    new ObjectExpirationHeaderHandler();
                    ObjectExpirationHeaderHandler.b(objectMetadata, httpResponse);
                } else if (str.equalsIgnoreCase("x-amz-restore")) {
                    new ObjectRestoreHeaderHandler();
                    ObjectRestoreHeaderHandler.b(objectMetadata, httpResponse);
                } else if (str.equalsIgnoreCase("x-amz-request-charged")) {
                    new S3RequesterChargedHeaderHandler();
                    objectMetadata.c(map.get("x-amz-request-charged") != null);
                } else if (str.equalsIgnoreCase("x-amz-mp-parts-count")) {
                    try {
                        objectMetadata.f28888b.put(str, Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    } catch (NumberFormatException e16) {
                        throw new AmazonClientException("Unable to parse part count. Header x-amz-mp-parts-count has corrupted data" + e16.getMessage(), e16);
                    }
                } else {
                    objectMetadata.f28888b.put(str, entry.getValue());
                }
            }
        }
    }

    public boolean b() {
        return this instanceof S3ObjectResponseHandler;
    }
}
