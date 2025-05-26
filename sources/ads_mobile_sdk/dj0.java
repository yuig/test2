package ads_mobile_sdk;

import a.pd;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class dj0 implements jh.b, jh.c {

    /* renamed from: a, reason: collision with root package name */
    public final hj0 f4298a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4299b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4300c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f4301d;

    /* renamed from: e, reason: collision with root package name */
    public final HandlerThread f4302e;

    public dj0(Context context, String str, String str2) {
        this.f4299b = str;
        this.f4300c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f4302e = handlerThread;
        handlerThread.start();
        this.f4298a = new hj0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f4301d = new LinkedBlockingQueue();
        a();
    }

    public final void a() {
        this.f4298a.checkAvailabilityAndConnect();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r5.f4298a.isConnecting() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r5.f4298a.isConnecting() != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    @Override // jh.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onConnected(android.os.Bundle r6) {
        /*
            r5 = this;
            r6 = 0
            ads_mobile_sdk.hj0 r0 = r5.f4298a     // Catch: java.lang.Throwable -> La
            android.os.IInterface r0 = r0.getService()     // Catch: java.lang.Throwable -> La
            a.z8 r0 = (a.z8) r0     // Catch: java.lang.Throwable -> La
            goto Lb
        La:
            r0 = r6
        Lb:
            if (r0 == 0) goto Lcd
            ads_mobile_sdk.kj0 r1 = new ads_mobile_sdk.kj0     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r5.f4299b     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = r5.f4300c     // Catch: java.lang.Throwable -> L7d
            r4 = 1
            r1.<init>(r4, r2, r3)     // Catch: java.lang.Throwable -> L7d
            a.o7 r0 = (a.o7) r0     // Catch: java.lang.Throwable -> L7d
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = r0.f4297b     // Catch: java.lang.Throwable -> L7d
            r2.writeInterfaceToken(r3)     // Catch: java.lang.Throwable -> L7d
            int r3 = a.i2.f57a     // Catch: java.lang.Throwable -> L7d
            r2.writeInt(r4)     // Catch: java.lang.Throwable -> L7d
            r3 = 0
            r1.writeToParcel(r2, r3)     // Catch: java.lang.Throwable -> L7d
            android.os.Parcel r0 = r0.a(r2, r4)     // Catch: java.lang.Throwable -> L7d
            android.os.Parcelable$Creator<ads_mobile_sdk.mj0> r1 = ads_mobile_sdk.mj0.CREATOR     // Catch: java.lang.Throwable -> L7d
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L7d
            if (r2 != 0) goto L39
            r1 = r6
            goto L3f
        L39:
            java.lang.Object r1 = r1.createFromParcel(r0)     // Catch: java.lang.Throwable -> L7d
            android.os.Parcelable r1 = (android.os.Parcelable) r1     // Catch: java.lang.Throwable -> L7d
        L3f:
            ads_mobile_sdk.mj0 r1 = (ads_mobile_sdk.mj0) r1     // Catch: java.lang.Throwable -> L7d
            r0.recycle()     // Catch: java.lang.Throwable -> L7d
            ads_mobile_sdk.wb r0 = r1.f8253b     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L49
            goto L57
        L49:
            byte[] r0 = r1.f8254c     // Catch: java.lang.NullPointerException -> L74 ads_mobile_sdk.e21 -> L76 java.lang.Throwable -> L7d
            ads_mobile_sdk.jc0 r2 = ads_mobile_sdk.jc0.a()     // Catch: java.lang.NullPointerException -> L74 ads_mobile_sdk.e21 -> L76 java.lang.Throwable -> L7d
            ads_mobile_sdk.wb r0 = ads_mobile_sdk.wb.a(r0, r2)     // Catch: java.lang.NullPointerException -> L74 ads_mobile_sdk.e21 -> L76 java.lang.Throwable -> L7d
            r1.f8253b = r0     // Catch: java.lang.NullPointerException -> L74 ads_mobile_sdk.e21 -> L76 java.lang.Throwable -> L7d
            r1.f8254c = r6     // Catch: java.lang.NullPointerException -> L74 ads_mobile_sdk.e21 -> L76 java.lang.Throwable -> L7d
        L57:
            r1.a()     // Catch: java.lang.Throwable -> L7d
            ads_mobile_sdk.wb r6 = r1.f8253b     // Catch: java.lang.Throwable -> L7d
            java.util.concurrent.LinkedBlockingQueue r0 = r5.f4301d     // Catch: java.lang.Throwable -> L7d
            r0.put(r6)     // Catch: java.lang.Throwable -> L7d
            ads_mobile_sdk.hj0 r6 = r5.f4298a
            if (r6 == 0) goto Lc8
            boolean r6 = r6.isConnected()
            if (r6 != 0) goto Lc3
            ads_mobile_sdk.hj0 r6 = r5.f4298a
            boolean r6 = r6.isConnecting()
            if (r6 == 0) goto Lc8
            goto Lc3
        L74:
            r6 = move-exception
            goto L77
        L76:
            r6 = move-exception
        L77:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L7d
            throw r0     // Catch: java.lang.Throwable -> L7d
        L7d:
            java.util.concurrent.LinkedBlockingQueue r6 = r5.f4301d     // Catch: java.lang.Throwable -> L93 java.lang.InterruptedException -> Lb1
            a.pd r0 = ads_mobile_sdk.wb.u()     // Catch: java.lang.Throwable -> L93 java.lang.InterruptedException -> Lb1
            r1 = 32768(0x8000, double:1.61895E-319)
            r0.h(r1)     // Catch: java.lang.Throwable -> L93 java.lang.InterruptedException -> Lb1
            ads_mobile_sdk.sj0 r0 = r0.a()     // Catch: java.lang.Throwable -> L93 java.lang.InterruptedException -> Lb1
            ads_mobile_sdk.wb r0 = (ads_mobile_sdk.wb) r0     // Catch: java.lang.Throwable -> L93 java.lang.InterruptedException -> Lb1
            r6.put(r0)     // Catch: java.lang.Throwable -> L93 java.lang.InterruptedException -> Lb1
            goto Lb1
        L93:
            r6 = move-exception
            ads_mobile_sdk.hj0 r0 = r5.f4298a
            if (r0 == 0) goto Lab
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto La6
            ads_mobile_sdk.hj0 r0 = r5.f4298a
            boolean r0 = r0.isConnecting()
            if (r0 == 0) goto Lab
        La6:
            ads_mobile_sdk.hj0 r0 = r5.f4298a
            r0.disconnect()
        Lab:
            android.os.HandlerThread r0 = r5.f4302e
            r0.quit()
            throw r6
        Lb1:
            ads_mobile_sdk.hj0 r6 = r5.f4298a
            if (r6 == 0) goto Lc8
            boolean r6 = r6.isConnected()
            if (r6 != 0) goto Lc3
            ads_mobile_sdk.hj0 r6 = r5.f4298a
            boolean r6 = r6.isConnecting()
            if (r6 == 0) goto Lc8
        Lc3:
            ads_mobile_sdk.hj0 r6 = r5.f4298a
            r6.disconnect()
        Lc8:
            android.os.HandlerThread r6 = r5.f4302e
            r6.quit()
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dj0.onConnected(android.os.Bundle):void");
    }

    @Override // jh.c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            LinkedBlockingQueue linkedBlockingQueue = this.f4301d;
            pd u13 = wb.u();
            u13.h(32768L);
            linkedBlockingQueue.put((wb) u13.a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // jh.b
    public final void onConnectionSuspended(int i13) {
        try {
            LinkedBlockingQueue linkedBlockingQueue = this.f4301d;
            pd u13 = wb.u();
            u13.h(32768L);
            linkedBlockingQueue.put((wb) u13.a());
        } catch (InterruptedException unused) {
        }
    }
}
