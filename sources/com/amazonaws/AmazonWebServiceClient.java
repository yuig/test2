package com.amazonaws;

import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.HttpClient;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.Classes;
import com.amazonaws.util.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class AmazonWebServiceClient {

    /* renamed from: a, reason: collision with root package name */
    public volatile URI f28512a;

    /* renamed from: b, reason: collision with root package name */
    public ClientConfiguration f28513b;

    /* renamed from: c, reason: collision with root package name */
    public final AmazonHttpClient f28514c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f28515d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile String f28516e;

    /* renamed from: f, reason: collision with root package name */
    public volatile String f28517f;

    static {
        LogFactory.a(AmazonWebServiceClient.class);
    }

    public AmazonWebServiceClient(ClientConfiguration clientConfiguration, HttpClient httpClient) {
        this.f28513b = clientConfiguration;
        this.f28514c = new AmazonHttpClient(clientConfiguration, httpClient);
    }

    public final String b() {
        int i13;
        String simpleName = Classes.childClassOf(AmazonWebServiceClient.class, this).getSimpleName();
        String serviceName = ServiceNameFactory.getServiceName(simpleName);
        if (serviceName != null) {
            return serviceName;
        }
        int indexOf = simpleName.indexOf("JavaClient");
        if (indexOf == -1 && (indexOf = simpleName.indexOf("Client")) == -1) {
            throw new IllegalStateException("Unrecognized suffix for the AWS http client class name ".concat(simpleName));
        }
        int indexOf2 = simpleName.indexOf("Amazon");
        if (indexOf2 == -1) {
            indexOf2 = simpleName.indexOf("AWS");
            if (indexOf2 == -1) {
                throw new IllegalStateException("Unrecognized prefix for the AWS http client class name ".concat(simpleName));
            }
            i13 = 3;
        } else {
            i13 = 6;
        }
        if (indexOf2 < indexOf) {
            return StringUtils.a(simpleName.substring(indexOf2 + i13, indexOf));
        }
        throw new IllegalStateException("Unrecognized AWS http client class name ".concat(simpleName));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.amazonaws.auth.Signer c(java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            com.amazonaws.ClientConfiguration r0 = r3.f28513b
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r0 = com.amazonaws.auth.SignerFactory.f28579a
            com.amazonaws.internal.config.InternalConfig r0 = com.amazonaws.internal.config.InternalConfig.Factory.f28623a
            r0.getClass()
            if (r4 == 0) goto L94
            if (r5 == 0) goto L2c
            java.lang.String r1 = "/"
            java.lang.String r1 = a.a.D(r4, r1, r5)
            java.util.HashMap r2 = r0.f28618b
            java.lang.Object r1 = r2.get(r1)
            com.amazonaws.internal.config.SignerConfig r1 = (com.amazonaws.internal.config.SignerConfig) r1
            if (r1 == 0) goto L21
            goto L39
        L21:
            java.util.HashMap r1 = r0.f28619c
            java.lang.Object r1 = r1.get(r5)
            com.amazonaws.internal.config.SignerConfig r1 = (com.amazonaws.internal.config.SignerConfig) r1
            if (r1 == 0) goto L2c
            goto L39
        L2c:
            java.util.HashMap r1 = r0.f28620d
            java.lang.Object r1 = r1.get(r4)
            com.amazonaws.internal.config.SignerConfig r1 = (com.amazonaws.internal.config.SignerConfig) r1
            if (r1 != 0) goto L39
            com.amazonaws.internal.config.SignerConfig r0 = r0.f28617a
            r1 = r0
        L39:
            java.lang.String r0 = r1.f28624a
            java.lang.String r1 = "Cannot create an instance of "
            java.util.concurrent.ConcurrentHashMap r2 = com.amazonaws.auth.SignerFactory.f28579a
            java.lang.Object r0 = r2.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L8e
            java.lang.Object r2 = r0.newInstance()     // Catch: java.lang.IllegalAccessException -> L6e java.lang.InstantiationException -> L70
            com.amazonaws.auth.Signer r2 = (com.amazonaws.auth.Signer) r2     // Catch: java.lang.IllegalAccessException -> L6e java.lang.InstantiationException -> L70
            boolean r0 = r2 instanceof com.amazonaws.auth.ServiceAwareSigner
            if (r0 == 0) goto L57
            r0 = r2
            com.amazonaws.auth.ServiceAwareSigner r0 = (com.amazonaws.auth.ServiceAwareSigner) r0
            r0.setServiceName(r4)
        L57:
            boolean r4 = r2 instanceof com.amazonaws.auth.RegionAwareSigner
            if (r4 == 0) goto L65
            r4 = r2
            com.amazonaws.auth.RegionAwareSigner r4 = (com.amazonaws.auth.RegionAwareSigner) r4
            if (r5 == 0) goto L65
            if (r6 == 0) goto L65
            r4.setRegionName(r5)
        L65:
            monitor-enter(r3)
            com.amazonaws.regions.RegionUtils.a(r5)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6b
            return r2
        L6b:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6b
            throw r4
        L6e:
            r4 = move-exception
            goto L72
        L70:
            r4 = move-exception
            goto L80
        L72:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r0.getName()
            java.lang.String r6 = r1.concat(r6)
            r5.<init>(r6, r4)
            throw r5
        L80:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r0.getName()
            java.lang.String r6 = r1.concat(r6)
            r5.<init>(r6, r4)
            throw r5
        L8e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L94:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.AmazonWebServiceClient.c(java.lang.String, java.lang.String, boolean):com.amazonaws.auth.Signer");
    }

    public final void d(AWSRequestMetrics aWSRequestMetrics, DefaultRequest defaultRequest) {
        aWSRequestMetrics.b(AWSRequestMetrics.Field.ClientExecuteTime);
        aWSRequestMetrics.f29031a.b();
        RequestMetricCollector requestMetricCollector = defaultRequest.f28537g.f28520c;
        if (requestMetricCollector == null) {
            this.f28514c.getClass();
            requestMetricCollector = AwsSdkMetrics.getRequestMetricCollector();
        }
        requestMetricCollector.getClass();
    }

    public final String e() {
        if (this.f28516e == null) {
            synchronized (this) {
                try {
                    if (this.f28516e == null) {
                        this.f28516e = b();
                        return this.f28516e;
                    }
                } finally {
                }
            }
        }
        return this.f28516e;
    }

    public final URI f(String str) {
        if (!str.contains("://")) {
            str = this.f28513b.f28528d.toString() + "://" + str;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e13) {
            throw new IllegalArgumentException(e13);
        }
    }
}
