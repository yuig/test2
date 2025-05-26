package ads_mobile_sdk;

import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public abstract class hn2 extends yr0 implements a.t5 {

    /* renamed from: d, reason: collision with root package name */
    public a.ad f6027d;

    public /* synthetic */ hn2() {
        this(null);
    }

    @Override // a.t5
    public final Object a(bl2.c cVar) {
        il0 il0Var = il0.CUI_NAME_SIGNAL;
        WeakHashMap weakHashMap = qs2.f10249a;
        cs2 a13 = qs2.a(il0Var, kotlin.collections.q0.f80391a, true);
        try {
            qs2.a().f().f6995q = new xi2(a(), hl0.CACHED, 4);
            a.ad adVar = this.f6027d;
            if (adVar == null) {
                Intrinsics.r("result");
                throw null;
            }
            if (adVar instanceof jk0) {
                ft2.a((jk0) adVar);
            }
            dl2.b.J(a13, null);
            return adVar;
        } catch (Throwable th3) {
            try {
                a13.b(th3);
                if (th3 instanceof a.jf) {
                    throw th3;
                }
                a13.a(th3);
                if (th3 instanceof TimeoutCancellationException) {
                    throw new xl0(th3);
                }
                if (th3 instanceof CancellationException) {
                    throw new yj0(th3);
                }
                if (th3 instanceof uk0) {
                    throw th3;
                }
                throw new dk0(th3);
            } finally {
            }
        }
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        return a(this, cVar);
    }

    public hn2(il0 il0Var) {
        super(il0Var, false, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.hn2 r4, bl2.c r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.gn2
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.gn2 r0 = (ads_mobile_sdk.gn2) r0
            int r1 = r0.f5636d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5636d = r1
            goto L18
        L13:
            ads_mobile_sdk.gn2 r0 = new ads_mobile_sdk.gn2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f5634b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5636d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ads_mobile_sdk.hn2 r4 = r0.f5633a
            ue.c.H(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r5)
            r0.f5633a = r4
            r0.f5636d = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            a.ad r5 = (a.ad) r5
            r4.f6027d = r5
            ads_mobile_sdk.pk0 r4 = new ads_mobile_sdk.pk0
            kotlin.Unit r5 = kotlin.Unit.f80348a
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hn2.a(ads_mobile_sdk.hn2, bl2.c):java.lang.Object");
    }
}
