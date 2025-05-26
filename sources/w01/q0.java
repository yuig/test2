package w01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends rr0.b {

    /* renamed from: c, reason: collision with root package name */
    public final m60.g0 f127098c;

    /* renamed from: d, reason: collision with root package name */
    public final int f127099d;

    /* renamed from: e, reason: collision with root package name */
    public final int f127100e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0(m60.g0 r5, lh0.o r6) {
        /*
            r4 = this;
            as1.b r0 = as1.b.a()
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "pinterestPageSizeProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r1 = "feedUrlFormatter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "experimentHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            r4.<init>(r5, r0)
            r4.f127098c = r5
            java.lang.String r0 = r5.e()
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r5 = r5.c()
            int r5 = java.lang.Integer.parseInt(r5)
            lh0.z3 r1 = lh0.z3.ACTIVATE_EXPERIMENT
            java.lang.String r2 = "android_responsive_p2p_page_tuning"
            java.lang.String r3 = "pagesizesec"
            int r0 = r6.j(r2, r3, r0, r1)
            r4.f127099d = r0
            java.lang.String r0 = "pagesizesub"
            int r5 = r6.j(r2, r0, r5, r1)
            r4.f127100e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w01.q0.<init>(m60.g0, lh0.o):void");
    }

    @Override // rr0.b
    public final String b(String str) {
        String d2 = this.f127098c.d();
        String valueOf = String.valueOf(this.f127099d);
        String valueOf2 = String.valueOf(this.f127100e);
        vb0.j.f125466a.R(!Intrinsics.d(d2, valueOf), "First and second page size should never be equal due to following logic", tb0.p.RELATED_PINS, new Object[0]);
        return Intrinsics.d(str, d2) ? valueOf : Intrinsics.d(str, valueOf) ? valueOf2 : str;
    }
}
