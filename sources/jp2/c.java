package jp2;

import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetBidirectionalStream;

/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UrlResponseInfo.HeaderBlock f77314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CronetBidirectionalStream f77315b;

    public c(CronetBidirectionalStream cronetBidirectionalStream, a0 a0Var) {
        this.f77315b = cronetBidirectionalStream;
        this.f77314a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f77315b.f97359q) {
            try {
                if (this.f77315b.h()) {
                    return;
                }
                try {
                    CronetBidirectionalStream cronetBidirectionalStream = this.f77315b;
                    cronetBidirectionalStream.f97345c.onResponseTrailersReceived(cronetBidirectionalStream, cronetBidirectionalStream.f97368z, this.f77314a);
                } catch (Exception e13) {
                    CronetBidirectionalStream.b(this.f77315b, e13);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
