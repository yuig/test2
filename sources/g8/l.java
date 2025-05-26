package g8;

import java.util.List;
import pk.v2;

/* loaded from: classes.dex */
public final class l implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final v2 f64329a;

    /* renamed from: b, reason: collision with root package name */
    public long f64330b;

    public l(List list, List list2) {
        pk.x0 n13 = pk.c1.n();
        bf.b.i(list.size() == list2.size());
        for (int i13 = 0; i13 < list.size(); i13++) {
            n13.e(new k((d1) list.get(i13), (List) list2.get(i13)));
        }
        this.f64329a = n13.i();
        this.f64330b = -9223372036854775807L;
    }

    @Override // g8.d1
    public final long a() {
        int i13 = 0;
        long j13 = Long.MAX_VALUE;
        while (true) {
            v2 v2Var = this.f64329a;
            if (i13 >= v2Var.size()) {
                break;
            }
            long a13 = ((k) v2Var.get(i13)).a();
            if (a13 != Long.MIN_VALUE) {
                j13 = Math.min(j13, a13);
            }
            i13++;
        }
        if (j13 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // g8.d1
    public final boolean g() {
        int i13 = 0;
        while (true) {
            v2 v2Var = this.f64329a;
            if (i13 >= v2Var.size()) {
                return false;
            }
            if (((k) v2Var.get(i13)).g()) {
                return true;
            }
            i13++;
        }
    }

    @Override // g8.d1
    public final boolean q(m7.y0 y0Var) {
        boolean z13;
        boolean z14 = false;
        do {
            long a13 = a();
            if (a13 == Long.MIN_VALUE) {
                break;
            }
            int i13 = 0;
            z13 = false;
            while (true) {
                v2 v2Var = this.f64329a;
                if (i13 >= v2Var.size()) {
                    break;
                }
                long a14 = ((k) v2Var.get(i13)).a();
                boolean z15 = a14 != Long.MIN_VALUE && a14 <= y0Var.f86486a;
                if (a14 == a13 || z15) {
                    z13 |= ((k) v2Var.get(i13)).q(y0Var);
                }
                i13++;
            }
            z14 |= z13;
        } while (z13);
        return z14;
    }

    @Override // g8.d1
    public final long t() {
        int i13 = 0;
        long j13 = Long.MAX_VALUE;
        long j14 = Long.MAX_VALUE;
        while (true) {
            v2 v2Var = this.f64329a;
            if (i13 >= v2Var.size()) {
                break;
            }
            k kVar = (k) v2Var.get(i13);
            long t13 = kVar.t();
            if ((kVar.b().contains(1) || kVar.b().contains(2) || kVar.b().contains(4)) && t13 != Long.MIN_VALUE) {
                j13 = Math.min(j13, t13);
            }
            if (t13 != Long.MIN_VALUE) {
                j14 = Math.min(j14, t13);
            }
            i13++;
        }
        if (j13 != Long.MAX_VALUE) {
            this.f64330b = j13;
            return j13;
        }
        if (j14 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j15 = this.f64330b;
        return j15 != -9223372036854775807L ? j15 : j14;
    }

    @Override // g8.d1
    public final void v(long j13) {
        int i13 = 0;
        while (true) {
            v2 v2Var = this.f64329a;
            if (i13 >= v2Var.size()) {
                return;
            }
            ((k) v2Var.get(i13)).v(j13);
            i13++;
        }
    }
}
