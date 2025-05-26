package hr1;

import kotlin.jvm.internal.Intrinsics;
import so.ia;
import uj2.b0;
import xk2.v;

/* loaded from: classes4.dex */
public final class g extends mr1.d {

    /* renamed from: b, reason: collision with root package name */
    public final ia f69991b;

    /* renamed from: c, reason: collision with root package name */
    public final mr1.c f69992c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.q f69993d;

    /* renamed from: e, reason: collision with root package name */
    public final v f69994e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(so.ia r3, mr1.c r4, uj2.q r5) {
        /*
            r2 = this;
            java.lang.String r0 = "authControllerFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "activityProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "resultsFeed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            qr1.f r0 = qr1.f.f104999b
            java.lang.String r1 = "authority"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r2.<init>(r0)
            r2.f69991b = r3
            r2.f69992c = r4
            r2.f69993d = r5
            yj1.d r3 = new yj1.d
            r4 = 20
            r3.<init>(r2, r4)
            xk2.v r3 = xk2.m.b(r3)
            r2.f69994e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hr1.g.<init>(so.ia, mr1.c, uj2.q):void");
    }

    @Override // or1.p
    public final String a() {
        return "FacebookFullAuthStrategy";
    }

    @Override // mr1.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final b0 b() {
        kk2.m mVar = new kk2.m(((lr1.b) this.f69994e.getValue()).a(lr1.h.FacebookLoginMethod, null).b(), new oo1.d(12, f.f69990i), 2);
        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
        return mVar;
    }
}
