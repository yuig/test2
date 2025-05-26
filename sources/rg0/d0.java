package rg0;

import i32.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final y0 f107979c;

    /* renamed from: d, reason: collision with root package name */
    public int f107980d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f107981e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f107982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(vd0.c json, y0 placement) {
        super(null, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f107979c = placement;
        Boolean h10 = json.h("hide_topic_picker_nag", Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
        this.f107981e = h10.booleanValue();
        this.f107982f = xk2.m.b(new tc0.c(json, 28));
    }

    public final int c() {
        return this.f107980d;
    }

    public final boolean d() {
        return this.f107981e;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List e(b60.b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "activeUserManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            i32.y0 r0 = r9.f107979c
            i32.y0 r1 = i32.y0.ANDROID_MAIN_USER_ED
            xk2.v r2 = r9.f107982f
            if (r0 != r1) goto Lc3
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r0.next()
            r3 = r2
            rg0.e0 r3 = (rg0.e0) r3
            int r3 = r3.f107992a
            i32.f r4 = i32.f.NUX_GENDER_STEP
            int r4 = r4.getValue()
            r5 = 1
            r6 = 0
            if (r3 != r4) goto L99
            r3 = r10
            b60.d r3 = (b60.d) r3
            com.pinterest.api.model.wy0 r3 = r3.f()
            if (r3 == 0) goto L45
            java.lang.Boolean r4 = r3.B2()
            goto L46
        L45:
            r4 = r6
        L46:
            boolean r4 = com.bumptech.glide.d.o0(r4)
            if (r4 != 0) goto L5a
            if (r3 == 0) goto L53
            java.lang.Boolean r4 = r3.A2()
            goto L54
        L53:
            r4 = r6
        L54:
            boolean r4 = com.bumptech.glide.d.o0(r4)
            if (r4 == 0) goto L83
        L5a:
            if (r3 == 0) goto L7c
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.lang.String r4 = r3.a3()
            r7 = 0
            if (r4 == 0) goto L77
            java.lang.String r8 = "unspecified"
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r8)
            if (r4 == 0) goto L77
            java.lang.String r4 = r3.J2()
            if (r4 != 0) goto L77
            r7 = r5
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            goto L7d
        L7c:
            r4 = r6
        L7d:
            boolean r4 = com.bumptech.glide.d.o0(r4)
            if (r4 == 0) goto L1e
        L83:
            if (r3 == 0) goto L92
            java.lang.Boolean r3 = r3.G3()
            boolean r3 = r3.booleanValue()
            r3 = r3 ^ r5
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
        L92:
            boolean r3 = com.bumptech.glide.d.o0(r6)
            if (r3 == 0) goto L1e
            goto Lbd
        L99:
            i32.f r4 = i32.f.NUX_COUNTRY_STEP
            int r4 = r4.getValue()
            if (r3 != r4) goto Lbd
            r3 = r10
            b60.d r3 = (b60.d) r3
            com.pinterest.api.model.wy0 r3 = r3.f()
            if (r3 == 0) goto Lb7
            java.lang.Boolean r3 = r3.G3()
            boolean r3 = r3.booleanValue()
            r3 = r3 ^ r5
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
        Lb7:
            boolean r3 = com.bumptech.glide.d.o0(r6)
            if (r3 == 0) goto L1e
        Lbd:
            r1.add(r2)
            goto L1e
        Lc2:
            return r1
        Lc3:
            java.lang.Object r10 = r2.getValue()
            java.util.List r10 = (java.util.List) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rg0.d0.e(b60.b):java.util.List");
    }

    public final void f(int i13) {
        this.f107980d = i13;
    }
}
