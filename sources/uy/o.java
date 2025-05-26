package uy;

import ey.j1;
import ey.k3;
import ey.s0;
import ey.u1;
import java.util.Set;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends s0 {

    /* renamed from: i, reason: collision with root package name */
    public final s92.i f123260i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f123260i = s92.i.LENS_FEED_RENDER;
    }

    @Override // ey.s0, ey.v1
    public final Set b() {
        return i1.i(p.f123261a, super.b());
    }

    @Override // ey.s0, ey.k, ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof t) {
            if (!d()) {
                q(e13.c());
                j1.f60506c = true;
            }
        } else if ((e13 instanceof r) || (e13 instanceof k) || (e13 instanceof m)) {
            q(e13.c());
        } else if (e13 instanceof s) {
            s sVar = (s) e13;
            a(sVar.l(), s92.l.USER_NAVIGATION, sVar.n(), sVar.m(), e13.c(), false);
            z();
        } else if ((e13 instanceof q) || (e13 instanceof j) || (e13 instanceof l)) {
            r(e13.c());
        }
        return true;
    }

    @Override // ey.s0
    public final s92.i w() {
        return this.f123260i;
    }
}
