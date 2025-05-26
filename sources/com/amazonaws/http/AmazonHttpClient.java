package com.amazonaws.http;

import a.a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.s3.internal.S3ErrorResponseHandler;
import com.amazonaws.services.s3.internal.S3ExecutionContext;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.DateUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class AmazonHttpClient {

    /* renamed from: d, reason: collision with root package name */
    public static final Log f28590d = LogFactory.b("com.amazonaws.request");

    /* renamed from: e, reason: collision with root package name */
    public static final Log f28591e = LogFactory.a(AmazonHttpClient.class);

    /* renamed from: a, reason: collision with root package name */
    public final HttpClient f28592a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientConfiguration f28593b;

    /* renamed from: c, reason: collision with root package name */
    public final HttpRequestFactory f28594c = new HttpRequestFactory();

    public AmazonHttpClient(ClientConfiguration clientConfiguration, HttpClient httpClient) {
        this.f28593b = clientConfiguration;
        this.f28592a = httpClient;
    }

    public static String a(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str.trim() + " " + str2.trim();
    }

    public static AmazonServiceException d(DefaultRequest defaultRequest, S3ErrorResponseHandler s3ErrorResponseHandler, HttpResponse httpResponse) {
        AmazonServiceException amazonServiceException;
        int i13 = httpResponse.f28604b;
        try {
            amazonServiceException = (AmazonServiceException) s3ErrorResponseHandler.a(httpResponse);
            f28590d.f("Received error response: " + amazonServiceException.toString());
        } catch (Exception e13) {
            if (i13 == 413) {
                amazonServiceException = new AmazonServiceException("Request entity too large");
                amazonServiceException.f28511e = defaultRequest.f28536f;
                amazonServiceException.f28510d = 413;
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonServiceException.f28508b = "Request entity too large";
            } else {
                String str = httpResponse.f28603a;
                if (i13 != 503 || !"Service Unavailable".equalsIgnoreCase(str)) {
                    if (e13 instanceof IOException) {
                        throw ((IOException) e13);
                    }
                    throw new AmazonClientException("Unable to unmarshall error response (" + e13.getMessage() + "). Response Code: " + i13 + ", Response Text: " + str + ", Response Headers: " + httpResponse.f28606d, e13);
                }
                amazonServiceException = new AmazonServiceException("Service unavailable");
                amazonServiceException.f28511e = defaultRequest.f28536f;
                amazonServiceException.f28510d = 503;
                AmazonServiceException.ErrorType errorType2 = AmazonServiceException.ErrorType.Client;
                amazonServiceException.f28508b = "Service unavailable";
            }
        }
        amazonServiceException.f28510d = i13;
        amazonServiceException.f28511e = defaultRequest.f28536f;
        amazonServiceException.fillInStackTrace();
        return amazonServiceException;
    }

    public static Object e(AbstractS3ResponseHandler abstractS3ResponseHandler, HttpResponse httpResponse, S3ExecutionContext s3ExecutionContext) {
        String str = httpResponse.f28603a;
        int i13 = httpResponse.f28604b;
        try {
            AWSRequestMetrics aWSRequestMetrics = s3ExecutionContext.f28595a;
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ResponseProcessingTime;
            aWSRequestMetrics.e(field);
            try {
                AmazonWebServiceResponse amazonWebServiceResponse = (AmazonWebServiceResponse) abstractS3ResponseHandler.a(httpResponse);
                aWSRequestMetrics.b(field);
                if (amazonWebServiceResponse == null) {
                    throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " + i13 + ", Response Text: " + str);
                }
                Log log = f28590d;
                String str2 = null;
                if (log.b()) {
                    StringBuilder sb3 = new StringBuilder("Received successful response: ");
                    sb3.append(i13);
                    sb3.append(", AWS Request ID: ");
                    ResponseMetadata responseMetadata = amazonWebServiceResponse.f28522b;
                    sb3.append(responseMetadata == null ? null : (String) responseMetadata.f28544a.get("AWS_REQUEST_ID"));
                    log.f(sb3.toString());
                }
                AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.AWSRequestID;
                ResponseMetadata responseMetadata2 = amazonWebServiceResponse.f28522b;
                if (responseMetadata2 != null) {
                    str2 = (String) responseMetadata2.f28544a.get("AWS_REQUEST_ID");
                }
                aWSRequestMetrics.a(field2, str2);
                return amazonWebServiceResponse.f28521a;
            } catch (Throwable th3) {
                aWSRequestMetrics.b(AWSRequestMetrics.Field.ResponseProcessingTime);
                throw th3;
            }
        } catch (CRC32MismatchException e13) {
            throw e13;
        } catch (IOException e14) {
            throw e14;
        } catch (Exception e15) {
            throw new AmazonClientException("Unable to unmarshall response (" + e15.getMessage() + "). Response Code: " + i13 + ", Response Text: " + str, e15);
        }
    }

    public static boolean f(HttpResponse httpResponse) {
        String str = (String) httpResponse.f28606d.get("Location");
        return (httpResponse.f28604b != 307 || str == null || str.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    public static long g(HttpResponse httpResponse, AmazonServiceException amazonServiceException) {
        Date d2;
        String message;
        Date date = new Date();
        String str = (String) httpResponse.f28606d.get("Date");
        try {
        } catch (RuntimeException e13) {
            e = e13;
        }
        try {
            if (str != 0) {
                try {
                    if (!str.isEmpty()) {
                        d2 = DateUtils.d("EEE, dd MMM yyyy HH:mm:ss z", str);
                        long time = date.getTime() - d2.getTime();
                        str = 1000;
                        return time / 1000;
                    }
                } catch (RuntimeException e14) {
                    e = e14;
                    str = 0;
                    f28591e.j(a.j("Unable to parse clock skew offset from response: ", str), e);
                    return 0L;
                }
            }
            d2 = DateUtils.d("yyyyMMdd'T'HHmmss'Z'", message.substring(message.indexOf("(") + 1, message.contains(" + 15") ? message.indexOf(" + 15") : message.indexOf(" - 15")));
            long time2 = date.getTime() - d2.getTime();
            str = 1000;
            return time2 / 1000;
        } catch (RuntimeException e15) {
            e = e15;
            str = 0;
            f28591e.j(a.j("Unable to parse clock skew offset from response: ", str), e);
            return 0L;
        }
        message = amazonServiceException.getMessage();
    }

    public static long h(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i13, RetryPolicy retryPolicy) {
        int i14 = i13 - 2;
        long a13 = retryPolicy.f28770b.a(i14);
        Log log = f28591e;
        if (log.b()) {
            log.f("Retriable error detected, will retry in " + a13 + "ms, attempt number: " + i14);
        }
        try {
            Thread.sleep(a13);
            return a13;
        } catch (InterruptedException e13) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e13.getMessage(), e13);
        }
    }

    public static void i(DefaultRequest defaultRequest, Exception exc) {
        InputStream inputStream = defaultRequest.f28539i;
        if (inputStream == null) {
            return;
        }
        if (!inputStream.markSupported()) {
            throw new AmazonClientException("Encountered an exception and stream is not resettable", exc);
        }
        try {
            defaultRequest.f28539i.reset();
        } catch (IOException unused) {
            throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exc);
        }
    }

    public final Response b(DefaultRequest defaultRequest, AbstractS3ResponseHandler abstractS3ResponseHandler, S3ErrorResponseHandler s3ErrorResponseHandler, S3ExecutionContext s3ExecutionContext) {
        List list = s3ExecutionContext.f28596b;
        if (list == null) {
            list = Collections.emptyList();
        } else {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                ((RequestHandler2) it.next()).c();
                throw null;
            }
        }
        AWSRequestMetrics aWSRequestMetrics = s3ExecutionContext.f28595a;
        try {
            Response c13 = c(defaultRequest, abstractS3ResponseHandler, s3ErrorResponseHandler, s3ExecutionContext);
            aWSRequestMetrics.f29031a.b();
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                return c13;
            }
            ((RequestHandler2) it2.next()).b(defaultRequest);
            throw null;
        } catch (AmazonClientException e13) {
            Iterator it3 = list.iterator();
            if (!it3.hasNext()) {
                throw e13;
            }
            ((RequestHandler2) it3.next()).a();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x052c A[EDGE_INSN: B:105:0x052c->B:106:0x052c BREAK  A[LOOP:0: B:17:0x0084->B:104:0x051a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04a9 A[Catch: all -> 0x04c0, TRY_ENTER, TryCatch #13 {all -> 0x04c0, blocks: (B:86:0x04a1, B:89:0x04a9, B:90:0x04c3, B:92:0x0501, B:106:0x052c), top: B:85:0x04a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0501 A[Catch: all -> 0x04c0, TRY_LEAVE, TryCatch #13 {all -> 0x04c0, blocks: (B:86:0x04a1, B:89:0x04a9, B:90:0x04c3, B:92:0x0501, B:106:0x052c), top: B:85:0x04a1 }] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.amazonaws.http.AmazonHttpClient] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.amazonaws.logging.Log] */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.amazonaws.Response c(com.amazonaws.DefaultRequest r33, com.amazonaws.services.s3.internal.AbstractS3ResponseHandler r34, com.amazonaws.services.s3.internal.S3ErrorResponseHandler r35, com.amazonaws.services.s3.internal.S3ExecutionContext r36) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.http.AmazonHttpClient.c(com.amazonaws.DefaultRequest, com.amazonaws.services.s3.internal.AbstractS3ResponseHandler, com.amazonaws.services.s3.internal.S3ErrorResponseHandler, com.amazonaws.services.s3.internal.S3ExecutionContext):com.amazonaws.Response");
    }

    public final void finalize() {
        this.f28592a.shutdown();
        super.finalize();
    }

    public final boolean j(AmazonWebServiceRequest amazonWebServiceRequest, InputStream inputStream, AmazonClientException amazonClientException, int i13, RetryPolicy retryPolicy) {
        int i14 = i13 - 1;
        int i15 = this.f28593b.f28526b;
        if (i15 < 0 || !retryPolicy.f28772d) {
            i15 = retryPolicy.f28771c;
        }
        if (i14 >= i15) {
            return false;
        }
        if (inputStream == null || inputStream.markSupported()) {
            return retryPolicy.f28769a.a(amazonClientException, i14);
        }
        Log log = f28591e;
        if (log.b()) {
            log.f("Content not repeatable");
        }
        return false;
    }
}
