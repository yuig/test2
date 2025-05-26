package ey;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a5 extends t0 {

    /* renamed from: o, reason: collision with root package name */
    public static final Set f60435o = kotlin.collections.h1.f(a0.class, x.class, z.class, y.class, g1.class, h1.class, d1.class, e1.class, a1.class, b1.class, w0.class, x0.class, y0.class, e2.class, f2.class, k1.class, l1.class, d4.class, s2.class);

    /* renamed from: p, reason: collision with root package name */
    public static final s92.l f60436p = s92.l.USER_NAVIGATION;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f60437i;

    /* renamed from: j, reason: collision with root package name */
    public String f60438j;

    /* renamed from: k, reason: collision with root package name */
    public int f60439k;

    /* renamed from: l, reason: collision with root package name */
    public q1 f60440l;

    /* renamed from: m, reason: collision with root package name */
    public z f60441m;

    /* renamed from: n, reason: collision with root package name */
    public x f60442n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(k3 perfLogger, boolean z13) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f60437i = z13;
        this.f60439k = -1;
    }

    public final void B(x xVar) {
        if (d()) {
            String str = xVar.f60620l;
            if (str != null) {
                j("vertical", str);
            }
            if (xVar.f60614f == s92.o.COMPLETE) {
                ny.f fVar = xVar.f60617i;
                if (fVar != null) {
                    h(fVar.f92526h, "model_count");
                    h(fVar.f92519a, "video_pin_count");
                    h(fVar.f92520b, "video_story_pin_count");
                    h(fVar.f92521c, "other_story_pin_count");
                    h(fVar.f92522d, "carousel_pin_count");
                    h(fVar.f92523e, "other_pin_count");
                    h(fVar.f92524f, "ads_model_count");
                    h(fVar.f92525g, "organic_model_count");
                }
                e0 e0Var = xVar.f60618j;
                if (e0Var != null) {
                    h(e0Var.f60478a, "story_object_carousel_count");
                    h(e0Var.f60479b, "story_object_grid_count");
                    h(e0Var.f60480c, "story_object_other_count");
                }
            }
            a(xVar.f60614f, f60436p, xVar.f60615g, xVar.f60616h, xVar.c(), false);
            z();
            this.f60438j = null;
        }
    }

    public final void C() {
        if (d()) {
            String str = this.f60438j;
            if (str == null) {
                str = "";
            }
            j("pwt_cause", str);
        }
    }

    public final void D() {
        if (d()) {
            String str = this.f60438j;
            if (str == null) {
                str = "";
            }
            j("pwt_cause", str);
        }
    }

    public final void E(a0 a0Var) {
        q(a0Var.c());
        q1 q1Var = a0Var.f60424e;
        Intrinsics.checkNotNullParameter(q1Var, "<set-?>");
        this.f60440l = q1Var;
        String value = a0Var.f60425f.getValue();
        this.f60438j = value;
        this.f60441m = null;
        this.f60442n = null;
        if (value == null) {
            value = "";
        }
        j("pwt_cause", value);
        j1.f60506c = true;
    }

    @Override // ey.t0, ey.s0, ey.v1
    public final Set b() {
        return kotlin.collections.i1.i(f60435o, super.b());
    }

    @Override // ey.s0, ey.v1
    public final void c() {
        throw null;
    }

    @Override // ey.t0, ey.s0, ey.k, ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof a0) {
            a0 a0Var = (a0) e13;
            this.f60439k = a0Var.l();
            E(a0Var);
            return true;
        }
        boolean z13 = e13 instanceof x;
        boolean z14 = this.f60437i;
        if (z13) {
            if (Intrinsics.d(this.f60438j, br.a.FILTER.getValue())) {
                x xVar = (x) e13;
                if (xVar.l() == s92.o.ABORTED) {
                    int m13 = xVar.m();
                    int i13 = this.f60439k;
                    if (m13 == i13 && i13 != -1) {
                        return false;
                    }
                }
            }
            x xVar2 = (x) e13;
            this.f60442n = xVar2;
            if (this.f60441m == null && z14) {
                return true;
            }
            B(xVar2);
            return true;
        }
        if (e13 instanceof z) {
            this.f60441m = (z) e13;
            x xVar3 = this.f60442n;
            if (xVar3 == null || !z14) {
                return true;
            }
            B(xVar3);
            return true;
        }
        if (e13 instanceof m2) {
            D();
            return true;
        }
        if (e13 instanceof i2) {
            C();
            return true;
        }
        if ((e13 instanceof g1) || (e13 instanceof d1) || (e13 instanceof a1) || (e13 instanceof w0) || (e13 instanceof e2) || (e13 instanceof k1) || (e13 instanceof d4)) {
            q(e13.c());
            return true;
        }
        if ((e13 instanceof h1) || (e13 instanceof e1) || (e13 instanceof b1) || (e13 instanceof f2) || (e13 instanceof l1)) {
            r(e13.c());
            return true;
        }
        if (e13 instanceof x0) {
            r(e13.c());
            return true;
        }
        if (!(e13 instanceof s2)) {
            if (!(e13 instanceof y0)) {
                return true;
            }
            e(e13.c(), "response_header_received");
            return true;
        }
        String str = this.f60438j;
        if (str == null) {
            str = "";
        }
        j("pwt_cause", str);
        return true;
    }

    @Override // ey.s0
    public final s92.i w() {
        q1 q1Var = this.f60440l;
        if (q1Var != null) {
            return q1Var.getPwtAction();
        }
        Intrinsics.r("pwtSearchType");
        throw null;
    }
}
