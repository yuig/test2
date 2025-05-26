package tu1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final z f119363a;

    /* renamed from: b, reason: collision with root package name */
    public final uu1.b f119364b;

    /* renamed from: c, reason: collision with root package name */
    public final int f119365c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119366d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f119367e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f119368f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f119369g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f119370h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f119371i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f119372j;

    public d0(z responseConverter, uu1.b requestListenerFactory, int i13, boolean z13, o0 linkHeaderMediaPrefetcher) {
        m60.f0 redirectStrategy = u0.f119457a;
        Intrinsics.checkNotNullParameter(responseConverter, "responseConverter");
        Intrinsics.checkNotNullParameter(redirectStrategy, "redirectStrategy");
        Intrinsics.checkNotNullParameter(requestListenerFactory, "requestListenerFactory");
        Intrinsics.checkNotNullParameter(linkHeaderMediaPrefetcher, "linkHeaderMediaPrefetcher");
        this.f119363a = responseConverter;
        this.f119364b = requestListenerFactory;
        this.f119365c = i13;
        this.f119366d = z13;
        this.f119367e = linkHeaderMediaPrefetcher;
        this.f119368f = xk2.m.b(c0.f119358l);
        this.f119369g = xk2.m.b(c0.f119359m);
        this.f119370h = xk2.m.b(c0.f119360n);
        this.f119371i = xk2.m.b(c0.f119356j);
        this.f119372j = xk2.m.b(c0.f119357k);
    }

    public final a0 a(CronetEngine engine, Executor executor, Request okHttpRequest, int i13, int i14, List requestInfoReceivers, boolean z13) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(okHttpRequest, "okHttpRequest");
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        t0 t0Var = new t0(i13, z13, this.f119367e);
        UrlRequest.Builder allowDirectExecutor = engine.newUrlRequestBuilder(okHttpRequest.f95700a.f95639i, t0Var, executor).allowDirectExecutor();
        String str = okHttpRequest.f95701b;
        allowDirectExecutor.setHttpMethod(str);
        Headers headers = okHttpRequest.f95702c;
        int size = headers.size();
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            if (!this.f119366d || !Intrinsics.d(headers.d(i15), "Accept-Encoding")) {
                allowDirectExecutor.addHeader(headers.d(i15), headers.j(i15));
            }
        }
        RequestBody requestBody = okHttpRequest.f95703d;
        if (requestBody != null && requestBody.a() != 0) {
            if (requestBody.getF95665d() != null) {
                allowDirectExecutor.addHeader("Content-Type", String.valueOf(requestBody.getF95665d()));
            } else if (okHttpRequest.a("Content-Type") == null) {
                allowDirectExecutor.addHeader("Content-Type", "application/octet-stream");
            }
            if (((Boolean) this.f119371i.getValue()).booleanValue()) {
                HttpUrl url = okHttpRequest.f95700a;
                Intrinsics.checkNotNullParameter(url, "url");
                String str2 = url.f95639i;
                List j13 = kotlin.collections.f0.j("v3/callback/event", "v3/callback/ping");
                if (!(j13 instanceof Collection) || !j13.isEmpty()) {
                    Iterator it = j13.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (StringsKt.E(str2, (String) it.next(), false)) {
                            z14 = true;
                            break;
                        }
                    }
                }
            }
            UploadDataProvider x0Var = new x0(requestBody, new b1(), (ExecutorService) this.f119372j.getValue(), i14);
            Intrinsics.checkNotNullExpressionValue(x0Var, "convertRequestBodyUsingStream(...)");
            if (z14) {
                allowDirectExecutor.setUploadDataProvider(x0Var, b());
            } else {
                allowDirectExecutor.setUploadDataProvider(x0Var, (ExecutorService) this.f119368f.getValue());
            }
        }
        ExperimentalUrlRequest.Builder builder = allowDirectExecutor instanceof ExperimentalUrlRequest.Builder ? (ExperimentalUrlRequest.Builder) allowDirectExecutor : null;
        if (builder != null) {
            if (true ^ requestInfoReceivers.isEmpty()) {
                builder.setRequestFinishedListener((RequestFinishedInfo.Listener) this.f119364b.a(requestInfoReceivers));
            }
            boolean d2 = Intrinsics.d(okHttpRequest.a("Content-Encoding"), "gzip");
            v0.a(builder, new a("annotation_request_headers_size_in_bytes", String.valueOf(headers.b())));
            v0.a(builder, new a("android_is_gzipped", String.valueOf(d2)));
            v0.a(builder, new a("annotation_request_type", str));
        }
        UrlRequest build = allowDirectExecutor.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return new a0(build, new b0(this, okHttpRequest, t0Var));
    }

    public final ExecutorService b() {
        int i13 = this.f119365c;
        if (i13 == 1) {
            ExecutorService executorService = (ExecutorService) this.f119370h.getValue();
            Intrinsics.checkNotNullExpressionValue(executorService, "<get-uploadDataProviderExecutorSingleThread>(...)");
            return executorService;
        }
        if (i13 != 8) {
            ExecutorService executorService2 = (ExecutorService) this.f119368f.getValue();
            Intrinsics.checkNotNullExpressionValue(executorService2, "<get-uploadDataProviderExecutor>(...)");
            return executorService2;
        }
        ExecutorService executorService3 = (ExecutorService) this.f119369g.getValue();
        Intrinsics.checkNotNullExpressionValue(executorService3, "<get-uploadDataProviderExecutorMoreThreads>(...)");
        return executorService3;
    }
}
