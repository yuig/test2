package ads_mobile_sdk;

import a.c7;
import a.hh;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import ao2.j0;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class au2 extends a.cc implements jh.b, jh.c {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f2549a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2550b;

    /* renamed from: c, reason: collision with root package name */
    public final a.j3 f2551c;

    /* renamed from: d, reason: collision with root package name */
    public final hh f2552d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2553e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f2554f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f2555g;

    /* renamed from: h, reason: collision with root package name */
    public final ao2.v f2556h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au2(j0 backgroundScope, Context context, a.j3 traceLogger) {
        super("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f2549a = backgroundScope;
        this.f2550b = context;
        this.f2551c = traceLogger;
        this.f2552d = new hh(context, Looper.getMainLooper(), 8, this, this);
        this.f2553e = new AtomicBoolean(false);
        this.f2554f = new AtomicBoolean(false);
        this.f2555g = new AtomicBoolean(false);
        this.f2556h = ue.c.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.xt2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.xt2 r0 = (ads_mobile_sdk.xt2) r0
            int r1 = r0.f13819d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13819d = r1
            goto L18
        L13:
            ads_mobile_sdk.xt2 r0 = new ads_mobile_sdk.xt2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13817b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13819d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ads_mobile_sdk.au2 r0 = r0.f13816a
            ue.c.H(r6)
            goto L62
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            goto L4e
        L38:
            ue.c.H(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f2553e
            boolean r6 = r6.getAndSet(r4)
            if (r6 == 0) goto L4f
            ao2.v r6 = r5.f2556h
            r0.f13819d = r4
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            return r6
        L4f:
            a.hh r6 = r5.f2552d
            r6.checkAvailabilityAndConnect()
            ao2.v r6 = r5.f2556h
            r0.f13816a = r5
            r0.f13819d = r3
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            r0 = r5
        L62:
            a.ad r6 = (a.ad) r6
            ao2.j0 r1 = r0.f2549a
            ads_mobile_sdk.yt2 r2 = new ads_mobile_sdk.yt2
            r3 = 0
            r2.<init>(r0, r3)
            r0 = 3
            kotlin.jvm.internal.j.z(r1, r3, r3, r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.au2.a(bl2.c):java.lang.Object");
    }

    @Override // jh.b
    public final void onConnected(Bundle bundle) {
        if (this.f2555g.getAndSet(true)) {
            return;
        }
        try {
            IInterface service = this.f2552d.getService();
            Intrinsics.checkNotNullExpressionValue(service, "getService(...)");
            String packageName = this.f2550b.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            ((a.v5) ((c7) service)).j(new h70(packageName), this);
        } catch (Throwable th3) {
            kk0 kk0Var = new kk0(th3, null, 0 == true ? 1 : 0, 6);
            if (!this.f2554f.getAndSet(true)) {
                ((ao2.w) this.f2556h).Q(kk0Var);
            }
            ((ks2) this.f2551c).a("Throwable caught getting trustless token", th3);
        }
    }

    @Override // jh.c
    public final void onConnectionFailed(ConnectionResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        nk0 nk0Var = new nk0("Failed to connect to GMSCore. Code: " + result.f30732g + ", message: " + result.f30734i);
        if (this.f2554f.getAndSet(true)) {
            return;
        }
        ((ao2.w) this.f2556h).Q(nk0Var);
    }

    @Override // jh.b
    public final void onConnectionSuspended(int i13) {
        nk0 nk0Var = new nk0(a.a.d("GMSCore connection suspended. Code: ", i13));
        if (this.f2554f.getAndSet(true)) {
            return;
        }
        ((ao2.w) this.f2556h).Q(nk0Var);
    }

    public final void a(zb0 exceptionParcel) {
        Intrinsics.checkNotNullParameter(exceptionParcel, "exceptionParcel");
        nk0 nk0Var = new nk0(exceptionParcel.b() + ". Error code: " + exceptionParcel.a());
        if (this.f2554f.getAndSet(true)) {
            return;
        }
        ((ao2.w) this.f2556h).Q(nk0Var);
    }
}
