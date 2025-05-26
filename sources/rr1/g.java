package rr1;

import ho.k;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.x1;
import lh0.z3;
import s2.y;
import yq1.u1;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f109942a;

    /* renamed from: b, reason: collision with root package name */
    public final j f109943b;

    public g(x1 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f109942a = experiments;
        this.f109943b = new j();
    }

    public final yk2.b a(int i13, boolean z13) {
        yk2.b bVar = new yk2.b();
        bVar.add(e.f109941a);
        bVar.add(new c(i13));
        if (z13) {
            x1 x1Var = this.f109942a;
            x1Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) x1Var.f83504a;
            if (g1Var.o("android_strong_password", "enabled", z3Var) || g1Var.l("android_strong_password")) {
                bVar.add(new d(new u1(this, 5)));
            }
        }
        return e0.a(bVar);
    }

    public final boolean b(String password) {
        y yVar;
        Intrinsics.checkNotNullParameter(password, "password");
        yk2.b a13 = a(6, false);
        if (!(a13 instanceof Collection) || !a13.isEmpty()) {
            ListIterator listIterator = a13.listIterator(0);
            do {
                yVar = (y) listIterator;
                if (yVar.hasNext()) {
                }
            } while (((f) yVar.next()).test(password));
            return false;
        }
        return true;
    }

    public final boolean c(String password, boolean z13) {
        y yVar;
        Intrinsics.checkNotNullParameter(password, "password");
        yk2.b a13 = a(8, z13);
        if ((a13 instanceof Collection) && a13.isEmpty()) {
            return true;
        }
        ListIterator listIterator = a13.listIterator(0);
        do {
            yVar = (y) listIterator;
            if (!yVar.hasNext()) {
                return true;
            }
        } while (((f) yVar.next()).test(password));
        return false;
    }

    public final a e(String password) {
        int i13;
        Intrinsics.checkNotNullParameter(password, "password");
        j jVar = this.f109943b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(password, "password");
        try {
            i13 = ((k) jVar.f109946c.getValue()).a(password).f69675a;
        } catch (Exception unused) {
            i13 = 5;
        }
        return new a(i13, jVar.f109937a, jVar.f109938b);
    }
}
