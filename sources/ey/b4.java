package ey;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b4 extends v1 {

    /* renamed from: j, reason: collision with root package name */
    public static final HashSet f60444j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f60445f;

    /* renamed from: g, reason: collision with root package name */
    public String f60446g;

    /* renamed from: h, reason: collision with root package name */
    public r3 f60447h;

    /* renamed from: i, reason: collision with root package name */
    public u3 f60448i;

    static {
        HashSet hashSet = new HashSet();
        f60444j = hashSet;
        hashSet.add(y3.class);
        hashSet.add(m3.class);
        hashSet.add(w3.class);
        hashSet.add(q3.class);
        hashSet.add(r3.class);
        hashSet.add(t3.class);
        hashSet.add(u3.class);
        hashSet.add(o3.class);
        hashSet.add(p3.class);
        hashSet.add(l2.class);
    }

    @Override // ey.v1
    public final Set b() {
        return f60444j;
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof y3) {
            y((y3) e13);
            return true;
        }
        if ((e13 instanceof q3) || (e13 instanceof t3) || (e13 instanceof o3)) {
            q(e13.c());
            return true;
        }
        if ((e13 instanceof r3) && d()) {
            w((r3) e13);
            return true;
        }
        if ((e13 instanceof u3) && d()) {
            x((u3) e13);
            return true;
        }
        if ((e13 instanceof m3) && d()) {
            v((m3) e13);
            return true;
        }
        if ((e13 instanceof p3) && d()) {
            r(e13.c());
            return true;
        }
        if ((e13 instanceof w3) && d()) {
            q(0L);
            z((v3) e13, s92.o.COMPLETE, 0L, true);
            return true;
        }
        if (!(e13 instanceof x3)) {
            return true;
        }
        c();
        return true;
    }

    public final void v(m3 m3Var) {
        if (m3Var.f60577c != this.f60445f) {
            return;
        }
        if (Intrinsics.d(m3Var.f60536d, this.f60446g)) {
            m60.u.f85943a.d(new z3());
            a(s92.o.ABORTED, s92.l.USER_NAVIGATION, h32.d4.USER, null, m3Var.c(), false);
        }
    }

    public final void w(r3 r3Var) {
        if (this.f60447h == null && r3Var.f60577c == this.f60445f) {
            if (Intrinsics.d(r3Var.f60568e, this.f60446g)) {
                r(r3Var.c());
                this.f60447h = r3Var;
                if (this.f60448i != null) {
                    z(new v3(this.f60446g, this.f60445f), r3Var.f60569f, r3Var.c(), false);
                }
            }
        }
    }

    public final void x(u3 u3Var) {
        if (this.f60448i == null && u3Var.f60577c == this.f60445f) {
            if (Intrinsics.d(u3Var.f60585e, this.f60446g)) {
                String str = u3Var.f60586f;
                if (str != null) {
                    j("board_view_type", str);
                }
                l("empty_board_feed", u3Var.f60587g);
                r(u3Var.c());
                this.f60448i = u3Var;
                r3 r3Var = this.f60447h;
                if (r3Var != null) {
                    z(new v3(this.f60446g, this.f60445f), r3Var.f60569f, u3Var.c(), false);
                }
            }
        }
    }

    public final void y(y3 y3Var) {
        String scenarioName = y3Var.f60577c ? "openOwnProfile" : "openOtherProfile";
        Intrinsics.checkNotNullParameter(scenarioName, "scenarioName");
        q(y3Var.c());
        boolean z13 = y3Var.f60577c;
        new q3(z13, 1).i();
        this.f60445f = z13;
        String str = y3Var.f60631d;
        this.f60446g = str;
        j("user_id", str);
    }

    public final void z(v3 v3Var, s92.o oVar, long j13, boolean z13) {
        t(v3Var.e(), null, null, v3Var);
        a(oVar, s92.l.USER_NAVIGATION, h32.d4.USER, null, j13, z13);
        m60.u.f85943a.d(new z3());
        this.f60447h = null;
        this.f60448i = null;
        String scenarioName = this.f60445f ? "openOwnProfile" : "openOtherProfile";
        Intrinsics.checkNotNullParameter(scenarioName, "scenarioName");
    }
}
