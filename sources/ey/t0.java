package ey;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class t0 extends s0 {
    public final void A(String str, String str2, Integer num, h32.d4 d4Var, h32.a4 a4Var, Boolean bool) {
        j("pin.id", str);
        if (str2 != null) {
            j("video.url", str2);
        }
        if (num != null) {
            h(num.intValue(), "video.slot_index");
        }
        if (d4Var != null) {
            h(d4Var.getValue(), "view.type");
        }
        if (a4Var != null) {
            h(a4Var.getValue(), "view.parameter");
        }
        if (bool != null) {
            l("video.player_is_cached", bool.booleanValue());
        }
    }

    @Override // ey.s0, ey.v1
    public Set b() {
        return kotlin.collections.i1.i(u0.f60581a, super.b());
    }

    @Override // ey.s0, ey.k, ey.v1
    public boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof y2) {
            if (d()) {
                return true;
            }
            q(e13.c());
            y2 y2Var = (y2) e13;
            A(y2Var.l(), y2Var.n(), y2Var.m(), y2Var.p(), y2Var.o(), Boolean.valueOf(y2Var.q()));
            return true;
        }
        if (e13 instanceof z2) {
            if (!d()) {
                return true;
            }
            r(e13.c());
            return true;
        }
        if (e13 instanceof w2) {
            if (!d()) {
                q(e13.c());
            }
            if (this.f60572g != null) {
                return true;
            }
            new k2().i();
            return true;
        }
        if (e13 instanceof v2) {
            if (!d()) {
                return true;
            }
            v2 v2Var = (v2) e13;
            A(v2Var.l(), v2Var.n(), v2Var.m(), v2Var.p(), v2Var.o(), null);
            return true;
        }
        if (!(e13 instanceof x2)) {
            return true;
        }
        if (d()) {
            r(e13.c());
        }
        x(r92.c.VIDEO);
        return true;
    }
}
