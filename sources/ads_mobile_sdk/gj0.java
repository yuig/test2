package ads_mobile_sdk;

import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class gj0 implements jh.b, jh.c {

    /* renamed from: a, reason: collision with root package name */
    public final hj0 f5584a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5585b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5586c;

    /* renamed from: d, reason: collision with root package name */
    public final ng f5587d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5588e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f5589f;

    /* renamed from: g, reason: collision with root package name */
    public final HandlerThread f5590g;

    /* renamed from: h, reason: collision with root package name */
    public final a.se f5591h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5592i;

    public gj0(Context context, ng ngVar, String str, String str2, a.se seVar) {
        this.f5585b = str;
        this.f5587d = ngVar;
        this.f5586c = str2;
        this.f5591h = seVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f5590g = handlerThread;
        handlerThread.start();
        this.f5592i = System.currentTimeMillis();
        this.f5584a = new hj0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f5589f = new LinkedBlockingQueue();
        a();
    }

    public final void a() {
        this.f5584a.checkAvailabilityAndConnect();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r8.f5584a.isConnecting() != false) goto L27;
     */
    @Override // jh.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onConnected(android.os.Bundle r9) {
        /*
            r8 = this;
            r9 = 0
            ads_mobile_sdk.hj0 r0 = r8.f5584a     // Catch: java.lang.Throwable -> La
            android.os.IInterface r0 = r0.getService()     // Catch: java.lang.Throwable -> La
            a.z8 r0 = (a.z8) r0     // Catch: java.lang.Throwable -> La
            goto Lb
        La:
            r0 = r9
        Lb:
            if (r0 == 0) goto Lb4
            ads_mobile_sdk.z12 r7 = new ads_mobile_sdk.z12     // Catch: java.lang.Throwable -> L6c
            int r3 = r8.f5588e     // Catch: java.lang.Throwable -> L6c
            ads_mobile_sdk.ng r1 = r8.f5587d     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = r8.f5585b     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r8.f5586c     // Catch: java.lang.Throwable -> L6c
            int r4 = r1.f8781a     // Catch: java.lang.Throwable -> L6c
            r2 = 1
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6c
            a.o7 r0 = (a.o7) r0     // Catch: java.lang.Throwable -> L6c
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = r0.f4297b     // Catch: java.lang.Throwable -> L6c
            r1.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L6c
            int r2 = a.i2.f57a     // Catch: java.lang.Throwable -> L6c
            r2 = 1
            r1.writeInt(r2)     // Catch: java.lang.Throwable -> L6c
            r2 = 0
            r7.writeToParcel(r1, r2)     // Catch: java.lang.Throwable -> L6c
            r2 = 3
            android.os.Parcel r0 = r0.a(r1, r2)     // Catch: java.lang.Throwable -> L6c
            android.os.Parcelable$Creator<ads_mobile_sdk.b22> r1 = ads_mobile_sdk.b22.CREATOR     // Catch: java.lang.Throwable -> L6c
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L42
            r1 = r9
            goto L48
        L42:
            java.lang.Object r1 = r1.createFromParcel(r0)     // Catch: java.lang.Throwable -> L6c
            android.os.Parcelable r1 = (android.os.Parcelable) r1     // Catch: java.lang.Throwable -> L6c
        L48:
            ads_mobile_sdk.b22 r1 = (ads_mobile_sdk.b22) r1     // Catch: java.lang.Throwable -> L6c
            r0.recycle()     // Catch: java.lang.Throwable -> L6c
            long r2 = r8.f5592i     // Catch: java.lang.Throwable -> L6c
            r0 = 5011(0x1393, float:7.022E-42)
            r8.a(r0, r2, r9)     // Catch: java.lang.Throwable -> L6c
            java.util.concurrent.LinkedBlockingQueue r9 = r8.f5589f     // Catch: java.lang.Throwable -> L6c
            r9.put(r1)     // Catch: java.lang.Throwable -> L6c
            ads_mobile_sdk.hj0 r9 = r8.f5584a
            if (r9 == 0) goto L90
            boolean r9 = r9.isConnected()
            if (r9 != 0) goto L8b
            ads_mobile_sdk.hj0 r9 = r8.f5584a
            boolean r9 = r9.isConnecting()
            if (r9 == 0) goto L90
            goto L8b
        L6c:
            r9 = move-exception
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L96
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L96
            long r1 = r8.f5592i     // Catch: java.lang.Throwable -> L96
            r9 = 2010(0x7da, float:2.817E-42)
            r8.a(r9, r1, r0)     // Catch: java.lang.Throwable -> L96
            ads_mobile_sdk.hj0 r9 = r8.f5584a
            if (r9 == 0) goto L90
            boolean r9 = r9.isConnected()
            if (r9 != 0) goto L8b
            ads_mobile_sdk.hj0 r9 = r8.f5584a
            boolean r9 = r9.isConnecting()
            if (r9 == 0) goto L90
        L8b:
            ads_mobile_sdk.hj0 r9 = r8.f5584a
            r9.disconnect()
        L90:
            android.os.HandlerThread r9 = r8.f5590g
            r9.quit()
            goto Lb4
        L96:
            r9 = move-exception
            ads_mobile_sdk.hj0 r0 = r8.f5584a
            if (r0 == 0) goto Lae
            boolean r0 = r0.isConnected()
            if (r0 != 0) goto La9
            ads_mobile_sdk.hj0 r0 = r8.f5584a
            boolean r0 = r0.isConnecting()
            if (r0 == 0) goto Lae
        La9:
            ads_mobile_sdk.hj0 r0 = r8.f5584a
            r0.disconnect()
        Lae:
            android.os.HandlerThread r0 = r8.f5590g
            r0.quit()
            throw r9
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.gj0.onConnected(android.os.Bundle):void");
    }

    @Override // jh.c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            a(4012, this.f5592i, null);
            this.f5589f.put(new b22(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // jh.b
    public final void onConnectionSuspended(int i13) {
        try {
            a(4011, this.f5592i, null);
            this.f5589f.put(new b22(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final void a(int i13, long j13, Exception exc) {
        a.se seVar = this.f5591h;
        if (seVar != null) {
            seVar.a(i13, System.currentTimeMillis() - j13, exc);
        }
    }
}
