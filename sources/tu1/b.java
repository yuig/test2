package tu1;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
public final class b extends UrlRequest.Callback {

    /* renamed from: j, reason: collision with root package name */
    public final String f119345j;

    /* renamed from: k, reason: collision with root package name */
    public final String f119346k;

    /* renamed from: l, reason: collision with root package name */
    public final CronetEngine f119347l;

    /* renamed from: m, reason: collision with root package name */
    public final Executor f119348m;

    /* renamed from: n, reason: collision with root package name */
    public int f119349n;

    public b(String hostUrl, CronetEngine cronetEngine, com.google.common.util.concurrent.r executor) {
        Intrinsics.checkNotNullParameter(hostUrl, "hostUrl");
        Intrinsics.checkNotNullParameter("HEAD", "httpMethod");
        Intrinsics.checkNotNullParameter(cronetEngine, "cronetEngine");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f119345j = hostUrl;
        this.f119346k = "HEAD";
        this.f119347l = cronetEngine;
        this.f119348m = executor;
    }

    public final void a() {
        int i13 = this.f119349n;
        if (i13 < 2) {
            this.f119349n = i13 + 1;
            this.f119347l.newUrlRequestBuilder(this.f119345j, this, this.f119348m).setHttpMethod(this.f119346k).build().start();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest request, UrlResponseInfo info2, CronetException error) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info2, "info");
        Intrinsics.checkNotNullParameter(error, "error");
        a();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest request, UrlResponseInfo info2, ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info2, "info");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest request, UrlResponseInfo info2, String newLocationUrl) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info2, "info");
        Intrinsics.checkNotNullParameter(newLocationUrl, "newLocationUrl");
        request.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest request, UrlResponseInfo info2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info2, "info");
        request.cancel();
        Intrinsics.checkNotNullParameter(info2, "<this>");
        int httpStatusCode = info2.getHttpStatusCode();
        if (200 > httpStatusCode || httpStatusCode >= 300) {
            a();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest request, UrlResponseInfo info2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(info2, "info");
    }
}
