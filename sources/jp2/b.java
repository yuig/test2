package jp2;

import android.util.Log;
import java.util.HashSet;
import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes4.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CronetBidirectionalStream f77305b;

    public /* synthetic */ b(CronetBidirectionalStream cronetBidirectionalStream, int i13) {
        this.f77304a = i13;
        this.f77305b = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f77304a) {
            case 0:
                synchronized (this.f77305b.f97359q) {
                    try {
                        if (this.f77305b.h()) {
                            return;
                        }
                        CronetBidirectionalStream cronetBidirectionalStream = this.f77305b;
                        cronetBidirectionalStream.f97366x = 2;
                        try {
                            cronetBidirectionalStream.f97345c.onResponseHeadersReceived(cronetBidirectionalStream, cronetBidirectionalStream.f97368z);
                            return;
                        } catch (Exception e13) {
                            CronetBidirectionalStream.b(this.f77305b, e13);
                            return;
                        }
                    } finally {
                    }
                }
            default:
                CronetBidirectionalStream cronetBidirectionalStream2 = this.f77305b;
                try {
                    cronetBidirectionalStream2.f97345c.onCanceled(cronetBidirectionalStream2, cronetBidirectionalStream2.f97368z);
                } catch (Exception e14) {
                    HashSet hashSet = CronetUrlRequestContext.f97414w;
                    Log.e("cr_CronetUrlRequestContext", "Exception in onCanceled method", e14);
                }
                cronetBidirectionalStream2.f97357o.a();
                return;
        }
    }
}
