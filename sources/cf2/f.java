package cf2;

import do2.t2;
import do2.u2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import s3.n;

/* loaded from: classes4.dex */
public final class f extends n {

    /* renamed from: p, reason: collision with root package name */
    public final t2 f27666p;

    public f(df2.b controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f27666p = u2.a(controller);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object P0(cf2.f r4, bl2.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof cf2.b
            if (r0 == 0) goto L16
            r0 = r5
            cf2.b r0 = (cf2.b) r0
            int r1 = r0.f27656u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f27656u = r1
            goto L1b
        L16:
            cf2.b r0 = new cf2.b
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f27654s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f27656u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            android.graphics.Picture r4 = r0.f27653r
            ue.c.H(r5)
            r1 = r4
            goto L49
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ue.c.H(r5)
            android.graphics.Picture r5 = new android.graphics.Picture
            r5.<init>()
            r0.f27653r = r5
            r0.f27656u = r3
            java.lang.Object r4 = r4.Q0(r5, r0)
            if (r4 != r1) goto L48
            goto L49
        L48:
            r1 = r5
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cf2.f.P0(cf2.f, bl2.c):java.lang.Object");
    }

    @Override // u2.p
    public final void D0() {
        j.z(z0(), null, null, new e(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Q0(android.graphics.Picture r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof cf2.a
            if (r0 == 0) goto L13
            r0 = r7
            cf2.a r0 = (cf2.a) r0
            int r1 = r0.f27652v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27652v = r1
            goto L18
        L13:
            cf2.a r0 = new cf2.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f27650t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f27652v
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            y2.b r6 = r0.f27649s
            cf2.f r0 = r0.f27648r
            ue.c.H(r7)
            goto L5c
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            ue.c.H(r7)
            ao2.w r7 = ue.c.a()
            ha2.i r2 = new ha2.i
            r4 = 21
            r2.<init>(r4, r6, r7)
            y2.c r6 = new y2.c
            y2.d r4 = new y2.d
            r4.<init>()
            r6.<init>(r4, r2)
            r5.M0(r6)
            r0.f27648r = r5
            r0.f27649s = r6
            r0.f27652v = r3
            java.lang.Object r7 = r7.v(r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r0 = r5
        L5c:
            r0.N0(r6)
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cf2.f.Q0(android.graphics.Picture, bl2.c):java.lang.Object");
    }
}
