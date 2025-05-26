package tu1;

import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class t0 extends UrlRequest.Callback {

    /* renamed from: j, reason: collision with root package name */
    public final com.google.common.util.concurrent.k0 f119444j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f119445k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f119446l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayBlockingQueue f119447m;

    /* renamed from: n, reason: collision with root package name */
    public final com.google.common.util.concurrent.k0 f119448n;

    /* renamed from: o, reason: collision with root package name */
    public final long f119449o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f119450p;

    /* renamed from: q, reason: collision with root package name */
    public final m60.f0 f119451q;

    /* renamed from: r, reason: collision with root package name */
    public volatile UrlRequest f119452r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f119453s;

    /* renamed from: t, reason: collision with root package name */
    public final o0 f119454t;

    public t0(long j13, boolean z13, o0 o0Var) {
        m60.f0 f0Var = u0.f119457a;
        this.f119444j = new com.google.common.util.concurrent.k0();
        this.f119445k = new AtomicBoolean(false);
        this.f119446l = new AtomicBoolean(false);
        this.f119447m = new ArrayBlockingQueue(2);
        this.f119448n = new com.google.common.util.concurrent.k0();
        this.f119450p = new ArrayList();
        bf.b.k(j13 >= 0);
        if (j13 == 0) {
            this.f119449o = 2147483647L;
        } else {
            this.f119449o = j13;
        }
        this.f119451q = f0Var;
        this.f119453s = z13;
        this.f119454t = o0Var;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f119446l.set(true);
        this.f119447m.add(new q0(r0.ON_CANCELED, null, null));
        IOException iOException = new IOException("The request was canceled!");
        this.f119448n.w(iOException);
        this.f119444j.w(iOException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (this.f119448n.w(cronetException) && this.f119444j.w(cronetException)) {
            return;
        }
        this.f119447m.add(new q0(r0.ON_FAILED, null, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f119447m.add(new q0(r0.ON_READ_COMPLETED, byteBuffer, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.f119451q.getClass();
        this.f119450p.add(urlResponseInfo);
        if (urlResponseInfo.getUrlChain().size() <= 16) {
            urlRequest.followRedirect();
            return;
        }
        urlRequest.cancel();
        ProtocolException protocolException = new ProtocolException("Too many follow-up requests: 17");
        this.f119448n.w(protocolException);
        this.f119444j.w(protocolException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f119452r = urlRequest;
        bf.b.v(this.f119448n.v(urlResponseInfo));
        bf.b.v(this.f119444j.v(new s0(this)));
        this.f119454t.a(urlResponseInfo.getUrl(), urlResponseInfo.getAllHeadersAsList());
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f119447m.add(new q0(r0.ON_SUCCESS, null, null));
    }
}
