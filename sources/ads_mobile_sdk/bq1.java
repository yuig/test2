package ads_mobile_sdk;

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
public final class bq1 extends UrlRequest.Callback {

    /* renamed from: f, reason: collision with root package name */
    public final long f3559f;

    /* renamed from: h, reason: collision with root package name */
    public final a.j7 f3561h;

    /* renamed from: i, reason: collision with root package name */
    public volatile UrlRequest f3562i;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.common.util.concurrent.k0 f3554a = new com.google.common.util.concurrent.k0();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f3555b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f3556c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayBlockingQueue f3557d = new ArrayBlockingQueue(2);

    /* renamed from: e, reason: collision with root package name */
    public final com.google.common.util.concurrent.k0 f3558e = new com.google.common.util.concurrent.k0();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3560g = new ArrayList();

    public bq1(long j13, a.j7 j7Var) {
        bf.b.k(j13 >= 0);
        if (j13 == 0) {
            this.f3559f = 2147483647L;
        } else {
            this.f3559f = j13;
        }
        this.f3561h = j7Var;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f3556c.set(true);
        this.f3557d.add(new zp1(4, null, null));
        IOException iOException = new IOException("The request was canceled!");
        this.f3558e.w(iOException);
        this.f3554a.w(iOException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (this.f3558e.w(cronetException) && this.f3554a.w(cronetException)) {
            return;
        }
        this.f3557d.add(new zp1(3, null, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.f3557d.add(new zp1(1, byteBuffer, null));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.f3561h.getClass();
        this.f3560g.add(urlResponseInfo);
        int size = urlResponseInfo.getUrlChain().size();
        this.f3561h.getClass();
        if (size <= 16) {
            urlRequest.followRedirect();
            return;
        }
        urlRequest.cancel();
        this.f3561h.getClass();
        ProtocolException protocolException = new ProtocolException("Too many follow-up requests: 17");
        this.f3558e.w(protocolException);
        this.f3554a.w(protocolException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f3562i = urlRequest;
        bf.b.v(this.f3558e.v(urlResponseInfo));
        bf.b.v(this.f3554a.v(new aq1(this)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.f3557d.add(new zp1(2, null, null));
    }
}
