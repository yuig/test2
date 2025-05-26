package ey;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q0 extends v1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f60564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(k3 perfLogger, int i13) {
        super(perfLogger);
        this.f60564f = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        } else {
            Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
            super(perfLogger);
        }
    }

    @Override // ey.v1
    public final Set b() {
        switch (this.f60564f) {
            case 0:
                return r0.f60567a;
            default:
                Set set = iy.c.f73814a;
                Intrinsics.checkNotNullExpressionValue(set, "access$getEVENT_TYPES$p(...)");
                return set;
        }
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        switch (this.f60564f) {
            case 0:
                Intrinsics.checkNotNullParameter(e13, "e");
                if (!super.o(e13)) {
                    return false;
                }
                long c13 = e13.c();
                if ((e13 instanceof l0) || (e13 instanceof m0) || (e13 instanceof j0) || (e13 instanceof h0) || (e13 instanceof f0)) {
                    if (!d()) {
                        q(c13);
                    }
                } else if (e13 instanceof n0) {
                    if (d()) {
                        r(c13);
                    }
                } else if (e13 instanceof k0) {
                    if (d()) {
                        r(c13);
                        s(new i0(1));
                        if (d()) {
                            a(s92.o.COMPLETE, s92.l.USER_NAVIGATION, h32.d4.USER, h32.a4.USER_FOLLOWED_USERS, c13, false);
                        } else {
                            c();
                        }
                    }
                } else if ((e13 instanceof g0) && d()) {
                    r(c13);
                    s(new i0(0));
                    if (d()) {
                        a(s92.o.COMPLETE, s92.l.USER_NAVIGATION, h32.d4.USER, h32.a4.USER_FOLLOWED_USERS, c13, false);
                    } else {
                        c();
                    }
                }
                return true;
            default:
                Intrinsics.checkNotNullParameter(e13, "e");
                return super.o(e13);
        }
    }
}
