package uy;

import ey.j1;
import ey.k3;
import ey.s0;
import ey.u1;
import java.util.Set;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends s0 {

    /* renamed from: i, reason: collision with root package name */
    public final s92.i f123254i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f123254i = s92.i.FLASHLIGHT_FEED_RENDER;
    }

    @Override // ey.s0, ey.v1
    public final Set b() {
        return i1.i(g.f123255a, super.b());
    }

    @Override // ey.s0, ey.k, ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof i) {
            if (!d()) {
                q(e13.c());
                j1.f60506c = true;
            }
        } else if ((e13 instanceof b) || (e13 instanceof d)) {
            q(e13.c());
        } else if (e13 instanceof h) {
            h hVar = (h) e13;
            a(hVar.l(), s92.l.USER_NAVIGATION, hVar.n(), hVar.m(), e13.c(), false);
            z();
        } else if ((e13 instanceof a) || (e13 instanceof c)) {
            r(e13.c());
        }
        return true;
    }

    @Override // ey.s0
    public final s92.i w() {
        return this.f123254i;
    }
}
