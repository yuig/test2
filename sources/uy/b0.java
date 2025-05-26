package uy;

import ey.j1;
import ey.k3;
import ey.s0;
import ey.u1;
import java.util.Set;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends s0 {

    /* renamed from: i, reason: collision with root package name */
    public final s92.i f123248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f123248i = s92.i.PINCH_TO_ZOOM_FEED_RENDER;
    }

    @Override // ey.s0, ey.v1
    public final Set b() {
        return i1.i(c0.f123249a, super.b());
    }

    @Override // ey.s0, ey.k, ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof e0) {
            if (!d()) {
                q(e13.c());
                j1.f60506c = true;
            }
        } else if ((e13 instanceof x) || (e13 instanceof z)) {
            q(e13.c());
        } else if (e13 instanceof d0) {
            d0 d0Var = (d0) e13;
            a(d0Var.l(), s92.l.USER_NAVIGATION, d0Var.n(), d0Var.m(), e13.c(), false);
            z();
        } else if ((e13 instanceof w) || (e13 instanceof y)) {
            r(e13.c());
        }
        return true;
    }

    @Override // ey.s0
    public final s92.i w() {
        return this.f123248i;
    }
}
