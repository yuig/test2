package a7;

import java.util.List;
import pk.v2;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f1078b;

    /* renamed from: a, reason: collision with root package name */
    public final pk.c1 f1079a;

    static {
        pk.y0 y0Var = pk.c1.f100372b;
        f1078b = new i1(v2.f100502e);
        d7.n0.Q(0);
    }

    public i1(List list) {
        this.f1079a = pk.c1.r(list);
    }

    public final boolean a() {
        int i13 = 0;
        while (true) {
            pk.c1 c1Var = this.f1079a;
            if (i13 >= c1Var.size()) {
                return false;
            }
            if (((h1) c1Var.get(i13)).b() == 1) {
                return true;
            }
            i13++;
        }
    }

    public final boolean b(int i13) {
        int i14 = 0;
        while (true) {
            pk.c1 c1Var = this.f1079a;
            if (i14 >= c1Var.size()) {
                return false;
            }
            h1 h1Var = (h1) c1Var.get(i14);
            if (h1Var.c() && h1Var.b() == i13) {
                return true;
            }
            i14++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i1.class != obj.getClass()) {
            return false;
        }
        return this.f1079a.equals(((i1) obj).f1079a);
    }

    public final int hashCode() {
        return this.f1079a.hashCode();
    }
}
