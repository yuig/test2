package com.amazonaws.services.s3;

import a.a;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.event.ProgressListenerCallbackExecutor;
import com.amazonaws.event.ProgressReportingInputStream;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.services.s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.s3.internal.BucketNameUtils;
import com.amazonaws.services.s3.internal.CompleteMultipartUploadRetryCondition;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.s3.internal.S3ErrorResponseHandler;
import com.amazonaws.services.s3.internal.S3ExecutionContext;
import com.amazonaws.services.s3.internal.S3HttpUtils;
import com.amazonaws.services.s3.internal.S3MetadataResponseHandler;
import com.amazonaws.services.s3.internal.S3ObjectResponseHandler;
import com.amazonaws.services.s3.internal.S3Signer;
import com.amazonaws.services.s3.internal.S3XmlResponseHandler;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.HeadBucketRequest;
import com.amazonaws.services.s3.model.HeadBucketResult;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectIdBuilder;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.HeadBucketResultHandler;
import com.amazonaws.services.s3.model.transform.RequestPaymentConfigurationXmlFactory;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.LengthCheckInputStream;
import com.amazonaws.util.Md5Utils;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.util.ServiceClientHolderInputStream;
import com.amazonaws.util.ValidationUtils;
import com.google.android.gms.ads.AdSize;
import ep.b;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import n60.o;

/* loaded from: classes3.dex */
public class AmazonS3Client extends AmazonWebServiceClient implements AmazonS3 {

    /* renamed from: n, reason: collision with root package name */
    public static final Log f28775n = LogFactory.a(AmazonS3Client.class);

    /* renamed from: o, reason: collision with root package name */
    public static final Map f28776o;

    /* renamed from: g, reason: collision with root package name */
    public final S3ErrorResponseHandler f28777g;

    /* renamed from: h, reason: collision with root package name */
    public final S3XmlResponseHandler f28778h;

    /* renamed from: i, reason: collision with root package name */
    public S3ClientOptions f28779i;

    /* renamed from: j, reason: collision with root package name */
    public final AWSCredentialsProvider f28780j;

    /* renamed from: k, reason: collision with root package name */
    public volatile String f28781k;

    /* renamed from: l, reason: collision with root package name */
    public final int f28782l;

    /* renamed from: m, reason: collision with root package name */
    public final CompleteMultipartUploadRetryCondition f28783m;

    /* renamed from: com.amazonaws.services.s3.AmazonS3Client$1, reason: invalid class name */
    public static class AnonymousClass1 extends LinkedHashMap<String, String> {
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 300;
        }
    }

    static {
        AwsSdkMetrics.addAll(Arrays.asList((S3ServiceMetric[]) S3ServiceMetric.f28826c.clone()));
        SignerFactory.f28579a.put("AWSS3V4SignerType", AWSS3V4Signer.class);
        new BucketConfigurationXmlFactory();
        new RequestPaymentConfigurationXmlFactory();
        f28776o = Collections.synchronizedMap(new AnonymousClass1(AdSize.MEDIUM_RECTANGLE_WIDTH, 1.1f, true));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AmazonS3Client(sv0.b r4) {
        /*
            r3 = this;
            com.amazonaws.ClientConfiguration r0 = new com.amazonaws.ClientConfiguration
            r0.<init>()
            com.amazonaws.http.UrlHttpClient r1 = new com.amazonaws.http.UrlHttpClient
            r1.<init>(r0)
            r3.<init>(r0, r1)
            com.amazonaws.services.s3.internal.S3ErrorResponseHandler r0 = new com.amazonaws.services.s3.internal.S3ErrorResponseHandler
            r0.<init>()
            r3.f28777g = r0
            com.amazonaws.services.s3.internal.S3XmlResponseHandler r0 = new com.amazonaws.services.s3.internal.S3XmlResponseHandler
            r1 = 0
            r0.<init>(r1)
            r3.f28778h = r0
            com.amazonaws.services.s3.S3ClientOptions r0 = new com.amazonaws.services.s3.S3ClientOptions
            r0.<init>()
            r3.f28779i = r0
            r0 = 1024(0x400, float:1.435E-42)
            r3.f28782l = r0
            com.amazonaws.services.s3.internal.CompleteMultipartUploadRetryCondition r0 = new com.amazonaws.services.s3.internal.CompleteMultipartUploadRetryCondition
            r0.<init>()
            r3.f28783m = r0
            r3.f28780j = r4
            r3.r()
            java.lang.String r4 = "s3"
            r3.f28517f = r4
            com.amazonaws.handlers.HandlerChainFactory r4 = new com.amazonaws.handlers.HandlerChainFactory
            r4.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.f28515d
            java.lang.Class<com.amazonaws.handlers.RequestHandler> r1 = com.amazonaws.handlers.RequestHandler.class
            java.lang.String r2 = "/com/amazonaws/services/s3/request.handlers"
            java.util.ArrayList r1 = r4.a(r1, r2)
            r0.addAll(r1)
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.f28515d
            java.lang.Class<com.amazonaws.handlers.RequestHandler2> r1 = com.amazonaws.handlers.RequestHandler2.class
            java.lang.String r2 = "/com/amazonaws/services/s3/request.handler2s"
            java.util.ArrayList r4 = r4.a(r1, r2)
            r0.addAll(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.AmazonS3Client.<init>(sv0.b):void");
    }

    public static void h(DefaultRequest defaultRequest, String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int i13 = ServiceUtils.f28822a;
        Iterator it = arrayList.iterator();
        String str2 = "";
        boolean z13 = true;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!z13) {
                str2 = a.C(str2, ", ");
            }
            str2 = a.C(str2, str3);
            z13 = false;
        }
        defaultRequest.a(str, str2);
    }

    public static void l(ProgressListenerCallbackExecutor progressListenerCallbackExecutor, int i13) {
        if (progressListenerCallbackExecutor == null) {
            return;
        }
        ProgressEvent progressEvent = new ProgressEvent(0L);
        progressEvent.f28581b = i13;
        progressListenerCallbackExecutor.a(progressEvent);
    }

    public static void o(DefaultRequest defaultRequest, ObjectMetadata objectMetadata) {
        objectMetadata.getClass();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(objectMetadata.f28888b);
        Map unmodifiableMap = Collections.unmodifiableMap(treeMap);
        if (unmodifiableMap.get("x-amz-server-side-encryption-aws-kms-key-id") != null && !ObjectMetadata.f28886g.equals(unmodifiableMap.get("x-amz-server-side-encryption"))) {
            throw new IllegalArgumentException("If you specify a KMS key id for server side encryption, you must also set the SSEAlgorithm to ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION");
        }
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            defaultRequest.a((String) entry.getKey(), entry.getValue().toString());
        }
        Date a13 = DateUtils.a(objectMetadata.f28889c);
        if (a13 != null) {
            defaultRequest.a("Expires", DateUtils.b("EEE, dd MMM yyyy HH:mm:ss z", a13));
        }
        Map map = objectMetadata.f28887a;
        if (map != null) {
            for (Map.Entry entry2 : map.entrySet()) {
                String str = (String) entry2.getKey();
                String str2 = (String) entry2.getValue();
                if (str != null) {
                    str = str.trim();
                }
                if (str2 != null) {
                    str2 = str2.trim();
                }
                if (!"x-amz-tagging".equals(str)) {
                    defaultRequest.a("x-amz-meta-" + str, str2);
                }
            }
        }
    }

    public static String s(ObjectTagging objectTagging) {
        List list;
        if (objectTagging == null || (list = objectTagging.f28893a) == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            sb3.append(S3HttpUtils.a(tag.f28914a));
            sb3.append('=');
            sb3.append(S3HttpUtils.a(tag.f28915b));
            if (it.hasNext()) {
                sb3.append("&");
            }
        }
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.services.s3.AmazonS3
    public UploadPartResult a(UploadPartRequest uploadPartRequest) {
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        ValidationUtils.a(uploadPartRequest, "The request parameter must be specified when uploading a part");
        String str = uploadPartRequest.f28918e;
        String str2 = uploadPartRequest.f28919f;
        String str3 = uploadPartRequest.f28920g;
        int i13 = uploadPartRequest.f28921h;
        long j13 = uploadPartRequest.f28922i;
        ValidationUtils.a(str, "The bucket name parameter must be specified when uploading a part");
        ValidationUtils.a(str2, "The key parameter must be specified when uploading a part");
        ValidationUtils.a(str3, "The upload ID parameter must be specified when uploading a part");
        DefaultRequest i14 = i(str, str2, uploadPartRequest, HttpMethodName.PUT, null);
        i14.b("uploadId", str3);
        i14.b("partNumber", Integer.toString(i13));
        i14.a("Content-Length", Long.toString(j13));
        if (uploadPartRequest.f28923j == null) {
            throw new IllegalArgumentException("A File or InputStream must be specified when uploading part");
        }
        try {
            InputSubstream inputSubstream = new InputSubstream(new RepeatableFileInputStream(uploadPartRequest.f28923j), uploadPartRequest.f28924k, j13);
            if (!ServiceUtils.b(uploadPartRequest, this.f28779i) && inputSubstream.markSupported()) {
                try {
                    String encodeAsString = Base64.encodeAsString(Md5Utils.a(inputSubstream));
                    if (encodeAsString != null) {
                        i14.a("Content-MD5", encodeAsString);
                    }
                    inputSubstream.reset();
                } catch (Exception e13) {
                    throw new AmazonClientException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to calculate MD5 hash: ")), e13);
                }
            }
            ProgressListener progressListener = uploadPartRequest.f28518a;
            if (progressListener == null) {
                ExecutorService executorService = ProgressListenerCallbackExecutor.f28582b;
                progressListenerCallbackExecutor = null;
            } else {
                progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListener);
            }
            if (progressListenerCallbackExecutor != null) {
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputSubstream, progressListenerCallbackExecutor);
                progressReportingInputStream.f28586a = this.f28782l * 1024;
                l(progressListenerCallbackExecutor, 1024);
                inputSubstream = progressReportingInputStream;
            }
            try {
                try {
                    i14.f28539i = inputSubstream;
                    ObjectMetadata objectMetadata = (ObjectMetadata) n(i14, new S3MetadataResponseHandler(), str, str2);
                    l(progressListenerCallbackExecutor, 2048);
                    UploadPartResult uploadPartResult = new UploadPartResult();
                    uploadPartResult.f28925a = (String) objectMetadata.f28888b.get("ETag");
                    objectMetadata.f28888b.get("x-amz-request-charged");
                    return uploadPartResult;
                } catch (AmazonClientException e14) {
                    l(progressListenerCallbackExecutor, 4096);
                    throw e14;
                }
            } finally {
                try {
                    inputSubstream.close();
                } catch (Exception unused) {
                }
            }
        } catch (FileNotFoundException e15) {
            throw new IllegalArgumentException("The specified file doesn't exist", e15);
        }
    }

    public final void g(AbortMultipartUploadRequest abortMultipartUploadRequest) {
        ValidationUtils.a(abortMultipartUploadRequest.f28829d, "The bucket name parameter must be specified when aborting a multipart upload");
        ValidationUtils.a(abortMultipartUploadRequest.f28830e, "The key parameter must be specified when aborting a multipart upload");
        String str = abortMultipartUploadRequest.f28831f;
        ValidationUtils.a(str, "The upload ID parameter must be specified when aborting a multipart upload");
        HttpMethodName httpMethodName = HttpMethodName.DELETE;
        String str2 = abortMultipartUploadRequest.f28829d;
        String str3 = abortMultipartUploadRequest.f28830e;
        DefaultRequest i13 = i(str2, str3, abortMultipartUploadRequest, httpMethodName, null);
        i13.b("uploadId", str);
        n(i13, this.f28778h, str2, str3);
    }

    public final DefaultRequest i(String str, String str2, AmazonWebServiceRequest amazonWebServiceRequest, HttpMethodName httpMethodName, URI uri) {
        String str3;
        DefaultRequest defaultRequest = new DefaultRequest(amazonWebServiceRequest);
        S3ClientOptions s3ClientOptions = this.f28779i;
        if (s3ClientOptions.f28786c) {
            uri = s3ClientOptions.f28787d ? RuntimeHttpUtils.a(this.f28513b, "s3-accelerate.dualstack.amazonaws.com") : RuntimeHttpUtils.a(this.f28513b, "s3-accelerate.amazonaws.com");
        } else if (s3ClientOptions.f28787d) {
            String authority = this.f28512a.getAuthority();
            if ("s3.amazonaws.com".equals(authority)) {
                str3 = "us-east-1";
            } else {
                Matcher matcher = Region.S3_REGIONAL_ENDPOINT_PATTERN.matcher(authority);
                try {
                    matcher.matches();
                    str3 = RegionUtils.a(matcher.group(1)).f28755a;
                } catch (Exception e13) {
                    throw new IllegalStateException("No valid region has been specified. Unable to return region name", e13);
                }
            }
            uri = RuntimeHttpUtils.a(this.f28513b, a.k("s3.dualstack.", str3, ".amazonaws.com"));
        }
        defaultRequest.f28538h = httpMethodName;
        q(defaultRequest, str, str2, uri);
        return defaultRequest;
    }

    public final Signer j(DefaultRequest defaultRequest, String str, String str2) {
        URI uri = this.f28779i.f28786c ? this.f28512a : defaultRequest.f28535e;
        if (uri == null) {
            throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        }
        String e13 = e();
        Signer c13 = c(e13, AwsHostNameUtils.a(uri.getHost(), e13), true);
        if ((c13 instanceof AWSS3V4Signer) && defaultRequest.f28535e.getHost().endsWith("s3.amazonaws.com") && this.f28781k == null) {
            String str3 = this.f28781k == null ? (String) f28776o.get(str) : this.f28781k;
            if (str3 != null) {
                q(defaultRequest, str, str2, RuntimeHttpUtils.a(this.f28513b, (String) RegionUtils.a(str3).f28757c.get("s3")));
                AWSS3V4Signer aWSS3V4Signer = (AWSS3V4Signer) c13;
                aWSS3V4Signer.setServiceName(e());
                aWSS3V4Signer.setRegionName(str3);
                return aWSS3V4Signer;
            }
        }
        String str4 = this.f28781k == null ? (String) f28776o.get(str) : this.f28781k;
        if (str4 != null) {
            AWSS3V4Signer aWSS3V4Signer2 = new AWSS3V4Signer();
            aWSS3V4Signer2.setServiceName(e());
            aWSS3V4Signer2.setRegionName(str4);
            return aWSS3V4Signer2;
        }
        if (!(c13 instanceof S3Signer)) {
            return c13;
        }
        StringBuilder sb3 = new StringBuilder("/");
        sb3.append(str != null ? str.concat("/") : "");
        if (str2 == null) {
            str2 = "";
        }
        sb3.append(str2);
        return new S3Signer(defaultRequest.f28538h.toString(), sb3.toString());
    }

    public final void k(String str) {
        Map map = f28776o;
        String str2 = (String) map.get(str);
        Log log = f28775n;
        if (str2 == null) {
            if (log.b()) {
                log.f("Bucket region cache doesn't have an entry for " + str + ". Trying to get bucket region from Amazon S3.");
            }
            str2 = null;
            try {
                str2 = ((HeadBucketResult) n(i(str, null, new HeadBucketRequest(), HttpMethodName.HEAD, new URI("https://s3-us-west-1.amazonaws.com")), new HeadBucketResultHandler(), str, null)).f28875a;
            } catch (AmazonS3Exception e13) {
                Map map2 = e13.f28847g;
                if (map2 != null) {
                    str2 = (String) map2.get("x-amz-bucket-region");
                }
            } catch (URISyntaxException unused) {
                log.h("Error while creating URI");
            }
            if (str2 == null && log.b()) {
                log.f("Not able to derive region of the " + str + " from the HEAD Bucket requests.");
            }
            if (str2 != null) {
                map.put(str, str2);
            }
        }
        if (log.b()) {
            log.f("Region for " + str + " is " + str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final S3Object m(GetObjectRequest getObjectRequest) {
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        S3ObjectIdBuilder s3ObjectIdBuilder = getObjectRequest.f28867d;
        ValidationUtils.a(s3ObjectIdBuilder.f28904a, "The bucket name parameter must be specified when requesting an object");
        ValidationUtils.a(s3ObjectIdBuilder.f28905b, "The key parameter must be specified when requesting an object");
        DefaultRequest i13 = i(s3ObjectIdBuilder.f28904a, s3ObjectIdBuilder.f28905b, getObjectRequest, HttpMethodName.GET, null);
        String str = s3ObjectIdBuilder.f28906c;
        if (str != null) {
            i13.b("versionId", str);
        }
        long[] jArr = getObjectRequest.f28868e;
        long[] jArr2 = jArr == null ? null : (long[]) jArr.clone();
        long j13 = 0;
        if (jArr2 != null) {
            String str2 = "bytes=" + Long.toString(jArr2[0]) + "-";
            if (jArr2[1] >= 0) {
                StringBuilder i14 = o.i(str2);
                i14.append(Long.toString(jArr2[1]));
                str2 = i14.toString();
            }
            i13.a("Range", str2);
        }
        h(i13, "If-Match", getObjectRequest.f28869f);
        h(i13, "If-None-Match", getObjectRequest.f28870g);
        ProgressListener progressListener = getObjectRequest.f28871h;
        if (progressListener == null) {
            ExecutorService executorService = ProgressListenerCallbackExecutor.f28582b;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListener);
        }
        try {
            S3Object s3Object = (S3Object) n(i13, new S3ObjectResponseHandler(), s3ObjectIdBuilder.f28904a, s3ObjectIdBuilder.f28905b);
            s3Object.f28901b = s3ObjectIdBuilder.f28904a;
            s3Object.f28900a = s3ObjectIdBuilder.f28905b;
            ServiceClientHolderInputStream serviceClientHolderInputStream = new ServiceClientHolderInputStream(s3Object.f28903d);
            if (progressListenerCallbackExecutor != null) {
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(serviceClientHolderInputStream, progressListenerCallbackExecutor);
                progressReportingInputStream.f28589d = true;
                progressReportingInputStream.f28586a = this.f28782l * 1024;
                l(progressListenerCallbackExecutor, 2);
                serviceClientHolderInputStream = progressReportingInputStream;
            }
            Long l13 = (Long) s3Object.f28902c.f28888b.get("Content-Length");
            if (l13 != null) {
                j13 = l13.longValue();
            }
            s3Object.f28903d = new S3ObjectInputStream(new LengthCheckInputStream(serviceClientHolderInputStream, j13, true));
            return s3Object;
        } catch (AmazonS3Exception e13) {
            int i15 = e13.f28510d;
            if (i15 == 412 || i15 == 304) {
                l(progressListenerCallbackExecutor, 16);
                return null;
            }
            l(progressListenerCallbackExecutor, 8);
            throw e13;
        }
    }

    public final Object n(DefaultRequest defaultRequest, AbstractS3ResponseHandler abstractS3ResponseHandler, String str, String str2) {
        Map map;
        RequestMetricCollector requestMetricCollector = defaultRequest.f28537g.f28520c;
        AmazonHttpClient amazonHttpClient = this.f28514c;
        amazonHttpClient.getClass();
        AwsSdkMetrics.getRequestMetricCollector();
        S3ExecutionContext s3ExecutionContext = new S3ExecutionContext(this.f28515d, System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null);
        if (defaultRequest.f28541k != null) {
            throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
        }
        AWSRequestMetrics aWSRequestMetrics = s3ExecutionContext.f28595a;
        defaultRequest.f28541k = aWSRequestMetrics;
        aWSRequestMetrics.e(AWSRequestMetrics.Field.ClientExecuteTime);
        try {
            try {
                defaultRequest.f28540j = 0L;
                if (!defaultRequest.f28534d.containsKey("Content-Type")) {
                    defaultRequest.a("Content-Type", "application/octet-stream");
                }
                if (str != null && defaultRequest.f28535e.getHost().endsWith("s3.amazonaws.com") && this.f28781k == null) {
                    k(str);
                }
                AWSCredentials a13 = this.f28780j.a();
                s3ExecutionContext.f28814d = j(defaultRequest, str, str2);
                s3ExecutionContext.f28597c = a13;
                Object obj = amazonHttpClient.b(defaultRequest, abstractS3ResponseHandler, this.f28777g, s3ExecutionContext).f28543a;
                d(aWSRequestMetrics, defaultRequest);
                return obj;
            } catch (AmazonS3Exception e13) {
                if (e13.f28510d == 301 && (map = e13.f28847g) != null) {
                    String str3 = (String) map.get("x-amz-bucket-region");
                    f28776o.put(str, str3);
                    e13.f28509c = "The bucket is in this region: " + str3 + ". Please use this region to retry the request";
                }
                throw e13;
            }
        } catch (Throwable th3) {
            d(aWSRequestMetrics, defaultRequest);
            throw th3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:84|(19:86|87|(1:89)|90|(1:92)|93|(2:95|(4:97|(1:(4:99|100|101|(1:103)(1:104))(2:156|157))|105|(2:107|108)(2:150|151))(4:158|(3:159|160|(1:162)(1:163))|164|165))(2:170|(1:172))|(1:110)(1:149)|111|(1:113)|114|(4:116|(1:118)|119|(1:121))|122|123|124|126|127|128|129))|123|124|126|127|128|129) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02de, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02df, code lost:
    
        r5.a("Unable to cleanly close input stream: " + r0.getMessage(), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f2  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.amazonaws.services.s3.model.PutObjectResult p(com.amazonaws.services.s3.model.PutObjectRequest r24) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.AmazonS3Client.p(com.amazonaws.services.s3.model.PutObjectRequest):com.amazonaws.services.s3.model.PutObjectResult");
    }

    public final void q(DefaultRequest defaultRequest, String str, String str2, URI uri) {
        int i13;
        if (uri == null) {
            uri = this.f28512a;
        }
        if (!this.f28779i.f28785b && BucketNameUtils.isDNSBucketName(str)) {
            String host = uri.getHost();
            if (host != null) {
                String[] split = host.split("\\.");
                if (split.length == 4) {
                    int length = split.length;
                    while (i13 < length) {
                        try {
                            int parseInt = Integer.parseInt(split[i13]);
                            i13 = (parseInt >= 0 && parseInt <= 255) ? i13 + 1 : 0;
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
            f28775n.f("Using virtual style addressing. Endpoint = " + uri);
            try {
                defaultRequest.f28535e = new URI(uri.getScheme() + "://" + str + "." + uri.getAuthority());
                defaultRequest.f28531a = (str2 == null || !str2.startsWith("/")) ? str2 : "/".concat(str2);
                f28775n.f("Key: " + str2 + "; Request: " + defaultRequest);
            } catch (URISyntaxException e13) {
                throw new IllegalArgumentException(a.j("Invalid bucket name: ", str), e13);
            }
        }
        f28775n.f("Using path style addressing. Endpoint = " + uri);
        defaultRequest.f28535e = uri;
        if (str != null) {
            StringBuilder D = b.D(str, "/");
            D.append(str2 != null ? str2 : "");
            defaultRequest.f28531a = D.toString();
        }
        f28775n.f("Key: " + str2 + "; Request: " + defaultRequest);
    }

    public final void r() {
        URI f13 = f("s3.amazonaws.com");
        String e13 = e();
        c(e13, AwsHostNameUtils.a(f13.getHost(), e13), false);
        synchronized (this) {
            this.f28512a = f13;
        }
    }

    public AmazonS3Client(sv0.b bVar, com.amazonaws.regions.Region region, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(clientConfiguration, httpClient);
        String str;
        this.f28777g = new S3ErrorResponseHandler();
        this.f28778h = new S3XmlResponseHandler(null);
        this.f28779i = new S3ClientOptions();
        this.f28782l = 1024;
        this.f28783m = new CompleteMultipartUploadRetryCondition();
        this.f28780j = bVar;
        this.f28513b = clientConfiguration;
        this.f28517f = "s3";
        r();
        String e13 = e();
        if (region.f28757c.containsKey(e13)) {
            str = (String) region.f28757c.get(e13);
            int indexOf = str.indexOf("://");
            if (indexOf >= 0) {
                str = str.substring(indexOf + 3);
            }
        } else {
            str = this.f28517f + "." + region.f28755a + "." + region.f28756b;
        }
        URI f13 = f(str);
        c(e13, region.f28755a, false);
        synchronized (this) {
            this.f28512a = f13;
        }
        this.f28781k = region.f28755a;
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.f28515d.addAll(handlerChainFactory.a(RequestHandler.class, "/com/amazonaws/services/s3/request.handlers"));
        this.f28515d.addAll(handlerChainFactory.a(RequestHandler2.class, "/com/amazonaws/services/s3/request.handler2s"));
        f28775n.f("initialized with endpoint = " + this.f28512a);
    }
}
