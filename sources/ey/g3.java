package ey;

import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f60489a = new g3();

    /* renamed from: b, reason: collision with root package name */
    public static final xk2.v f60490b = xk2.m.b(f3.f60483j);

    /* renamed from: c, reason: collision with root package name */
    public static final d3 f60491c = new d3();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (ps0.m.j(r10) == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.pinterest.api.model.f30 r10) {
        /*
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r1 = com.pinterest.api.model.b40.P0(r10)
            java.lang.String r2 = "getUid(...)"
            if (r1 == 0) goto L20
            ey.n4 r0 = new ey.n4
            java.lang.String r1 = r10.getId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r1)
            r0.i()
            kg.a.a0(r10)
            goto L8e
        L20:
            boolean r1 = com.pinterest.api.model.b40.Q0(r10)
            if (r1 == 0) goto L43
            oy.i0 r0 = new oy.i0
            java.lang.String r4 = r10.getId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            boolean r6 = com.pinterest.api.model.b40.R0(r10)
            com.pinterest.api.model.b40.d0(r10)
            r7 = 0
            r8 = 0
            r5 = 0
            r9 = 214(0xd6, float:3.0E-43)
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.i()
            goto L8e
        L43:
            boolean r1 = df.j1.F1(r10)
            if (r1 == 0) goto L5c
            jy.s r0 = new jy.s
            java.lang.String r1 = r10.getId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r1)
            r0.i()
            kg.a.a0(r10)
            goto L8e
        L5c:
            boolean r1 = com.pinterest.api.model.b40.D0(r10)
            if (r1 != 0) goto L8e
            java.lang.Boolean r1 = r10.m5()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L8e
            java.lang.String r1 = com.pinterest.api.model.b40.j0(r10)
            if (r1 == 0) goto L78
            int r1 = r1.length()
            if (r1 != 0) goto L8e
        L78:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = ps0.m.j(r10)     // Catch: java.lang.Exception -> L81
            if (r0 != 0) goto L8e
        L81:
            java.lang.String r0 = r10.getId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            lf.a.k(r0)
            kg.a.a0(r10)
        L8e:
            xk2.v r10 = ey.g3.f60490b
            java.lang.Object r10 = r10.getValue()
            mc.i r10 = (mc.i) r10
            r10.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ey.g3.a(com.pinterest.api.model.f30):void");
    }

    public static void b(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        String userUid = navigation.getF49940b();
        Intrinsics.checkNotNullExpressionValue(userUid, "getId(...)");
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        boolean o03 = com.bumptech.glide.d.o0(f13 != null ? Boolean.valueOf(Intrinsics.d(f13.getId(), userUid)) : null);
        if (navigation.q1(r41.e.Pinner.ordinal(), "PROFILE_DISPLAY") == r41.e.Business.ordinal()) {
            return;
        }
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        y3 y3Var = new y3(o03);
        y3Var.f60631d = userUid;
        y3Var.i();
    }
}
