package jp2;

import J.N;
import android.util.Log;
import java.util.HashSet;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes2.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CronetUrlRequest f77373b;

    public /* synthetic */ o(CronetUrlRequest cronetUrlRequest, int i13) {
        this.f77372a = i13;
        this.f77373b = cronetUrlRequest;
    }

    private void a() {
        CronetUploadDataStream cronetUploadDataStream = this.f77373b.f97413z;
        synchronized (cronetUploadDataStream.f97384i) {
            cronetUploadDataStream.f97386k = 2;
        }
        try {
            cronetUploadDataStream.f97378c.d();
            long length = cronetUploadDataStream.f97377b.f77335g.getLength();
            cronetUploadDataStream.f97379d = length;
            cronetUploadDataStream.f97380e = length;
        } catch (Throwable th3) {
            cronetUploadDataStream.d(th3);
        }
        synchronized (cronetUploadDataStream.f97384i) {
            cronetUploadDataStream.f97386k = 3;
        }
        synchronized (this.f77373b.f97393f) {
            try {
                if (this.f77373b.h()) {
                    return;
                }
                CronetUrlRequest cronetUrlRequest = this.f77373b;
                CronetUploadDataStream cronetUploadDataStream2 = cronetUrlRequest.f97413z;
                long j13 = cronetUrlRequest.f97389b;
                synchronized (cronetUploadDataStream2.f97384i) {
                    cronetUploadDataStream2.f97385j = N.MA4X1aZa(cronetUploadDataStream2, j13, cronetUploadDataStream2.f97379d);
                }
                CronetUrlRequest cronetUrlRequest2 = this.f77373b;
                N.MabZ5m6r(cronetUrlRequest2.f97389b, cronetUrlRequest2);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f77372a) {
            case 0:
                a();
                return;
            case 1:
                this.f77373b.d();
                synchronized (this.f77373b.f97393f) {
                    try {
                        if (this.f77373b.h()) {
                            return;
                        }
                        CronetUrlRequest cronetUrlRequest = this.f77373b;
                        cronetUrlRequest.f97392e = true;
                        try {
                            cronetUrlRequest.f97397j.onResponseStarted(cronetUrlRequest, cronetUrlRequest.A);
                            return;
                        } catch (Exception e13) {
                            CronetUrlRequest.b(this.f77373b, e13);
                            return;
                        }
                    } finally {
                    }
                }
            case 2:
                synchronized (this.f77373b.f97393f) {
                    try {
                        if (this.f77373b.h()) {
                            return;
                        }
                        this.f77373b.f(0);
                        try {
                            CronetUrlRequest cronetUrlRequest2 = this.f77373b;
                            cronetUrlRequest2.f97397j.onSucceeded(cronetUrlRequest2, cronetUrlRequest2.A);
                        } catch (Exception e14) {
                            HashSet hashSet = CronetUrlRequestContext.f97414w;
                            Log.e("cr_CronetUrlRequestContext", "Exception in onSucceeded method", e14);
                        }
                        CronetUrlRequest.a(this.f77373b);
                        return;
                    } finally {
                    }
                }
            default:
                CronetUrlRequest cronetUrlRequest3 = this.f77373b;
                try {
                    cronetUrlRequest3.f97397j.onCanceled(cronetUrlRequest3, cronetUrlRequest3.A);
                } catch (Exception e15) {
                    HashSet hashSet2 = CronetUrlRequestContext.f97414w;
                    Log.e("cr_CronetUrlRequestContext", "Exception in onCanceled method", e15);
                }
                CronetUrlRequest.a(cronetUrlRequest3);
                return;
        }
    }
}
