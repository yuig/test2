package ps0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends rr0.b {

    /* renamed from: c, reason: collision with root package name */
    public final m60.h0 f101322c;

    /* renamed from: d, reason: collision with root package name */
    public final int f101323d;

    /* renamed from: e, reason: collision with root package name */
    public final int f101324e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x(m60.h0 r5, lh0.o r6) {
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
            r4.f101322c = r5
            java.lang.String r0 = r5.f85909e
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r5 = r5.f85906b
            int r5 = java.lang.Integer.parseInt(r5)
            lh0.z3 r1 = lh0.z3.ACTIVATE_EXPERIMENT
            java.lang.String r2 = "android_responsive_hf_page_tuning"
            java.lang.String r3 = "pagesizesec"
            int r0 = r6.j(r2, r3, r0, r1)
            r4.f101323d = r0
            java.lang.String r0 = "pagesizesub"
            int r5 = r6.j(r2, r0, r5, r1)
            r4.f101324e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ps0.x.<init>(m60.h0, lh0.o):void");
    }

    @Override // rr0.b
    public final String b(String str) {
        m60.h0 h0Var = this.f101322c;
        String valueOf = String.valueOf(h0Var.f85907c + h0Var.f85905a);
        String valueOf2 = String.valueOf(this.f101323d);
        String valueOf3 = String.valueOf(this.f101324e);
        vb0.j.f125466a.R(!Intrinsics.d(valueOf, valueOf2), "First and second page size should never be equal due to following logic", tb0.p.HOME_FEED, new Object[0]);
        return Intrinsics.d(str, valueOf) ? valueOf2 : Intrinsics.d(str, valueOf2) ? valueOf3 : str;
    }
}
