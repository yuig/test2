package ny;

import ey.u1;
import ey.v1;
import java.util.Set;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends v1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Set f92546g = h1.f(l.class, j.class, k.class);

    /* renamed from: f, reason: collision with root package name */
    public s92.l f92547f;

    @Override // ey.v1
    public final Set b() {
        return f92546g;
    }

    @Override // ey.v1
    public final void c() {
        Intrinsics.checkNotNullParameter("", "<set-?>");
        this.f60596d = "";
        super.c();
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof l) {
            if (d()) {
                return true;
            }
            l lVar = (l) e13;
            q(e13.c() + lVar.f92534d);
            this.f92547f = lVar.f92533c;
            return true;
        }
        if (!(e13 instanceof j)) {
            if (!(e13 instanceof k)) {
                return true;
            }
            c();
            return true;
        }
        if (!d()) {
            return true;
        }
        j jVar = (j) e13;
        a(jVar.m(), this.f92547f, jVar.o(), jVar.n(), e13.c() + jVar.l(), false);
        return true;
    }
}
