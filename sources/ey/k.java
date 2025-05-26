package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k extends v1 {
    @Override // ey.v1
    public boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if ((e13 instanceof s) || (e13 instanceof m) || (e13 instanceof e) || (e13 instanceof a) || (e13 instanceof p) || (e13 instanceof h)) {
            q(e13.c());
            return true;
        }
        if ((e13 instanceof t) || (e13 instanceof n) || (e13 instanceof f) || (e13 instanceof q) || (e13 instanceof i)) {
            r(e13.c());
            return true;
        }
        if (!(e13 instanceof b)) {
            return true;
        }
        r(e13.c());
        return true;
    }
}
