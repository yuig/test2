package j8;

import a.y3;
import java.util.ArrayList;
import pk.c1;
import pk.d3;
import pk.k0;
import pk.s2;
import pk.v2;
import pk.x0;
import pk.z;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f74917b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f74918a = new ArrayList();

    static {
        s2 s2Var = s2.f100480a;
        y3 y3Var = new y3(16);
        s2Var.getClass();
        z zVar = new z(y3Var, s2Var);
        d3 d3Var = d3.f100381a;
        y3 y3Var2 = new y3(17);
        d3Var.getClass();
        f74917b = new k0(zVar, new z(y3Var2, d3Var));
    }

    @Override // j8.a
    public final c1 a(long j13) {
        ArrayList arrayList = this.f74918a;
        if (!arrayList.isEmpty()) {
            if (j13 >= ((l9.a) arrayList.get(0)).f82295b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    l9.a aVar = (l9.a) arrayList.get(i13);
                    if (j13 >= aVar.f82295b && j13 < aVar.f82297d) {
                        arrayList2.add(aVar);
                    }
                    if (j13 < aVar.f82295b) {
                        break;
                    }
                }
                v2 A = c1.A(arrayList2, f74917b);
                x0 n13 = c1.n();
                for (int i14 = 0; i14 < A.size(); i14++) {
                    n13.c(((l9.a) A.get(i14)).f82294a);
                }
                return n13.i();
            }
        }
        return c1.u();
    }

    @Override // j8.a
    public final long b(long j13) {
        ArrayList arrayList = this.f74918a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j13 < ((l9.a) arrayList.get(0)).f82295b) {
            return -9223372036854775807L;
        }
        long j14 = ((l9.a) arrayList.get(0)).f82295b;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            long j15 = ((l9.a) arrayList.get(i13)).f82295b;
            long j16 = ((l9.a) arrayList.get(i13)).f82297d;
            if (j16 > j13) {
                if (j15 > j13) {
                    break;
                }
                j14 = Math.max(j14, j15);
            } else {
                j14 = Math.max(j14, j16);
            }
        }
        return j14;
    }

    @Override // j8.a
    public final boolean c(l9.a aVar, long j13) {
        long j14 = aVar.f82295b;
        bf.b.i(j14 != -9223372036854775807L);
        bf.b.i(aVar.f82296c != -9223372036854775807L);
        boolean z13 = j14 <= j13 && j13 < aVar.f82297d;
        ArrayList arrayList = this.f74918a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j14 >= ((l9.a) arrayList.get(size)).f82295b) {
                arrayList.add(size + 1, aVar);
                return z13;
            }
        }
        arrayList.add(0, aVar);
        return z13;
    }

    @Override // j8.a
    public final void clear() {
        this.f74918a.clear();
    }

    @Override // j8.a
    public final long d(long j13) {
        int i13 = 0;
        long j14 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f74918a;
            if (i13 >= arrayList.size()) {
                break;
            }
            long j15 = ((l9.a) arrayList.get(i13)).f82295b;
            long j16 = ((l9.a) arrayList.get(i13)).f82297d;
            if (j13 < j15) {
                j14 = j14 == -9223372036854775807L ? j15 : Math.min(j14, j15);
            } else {
                if (j13 < j16) {
                    j14 = j14 == -9223372036854775807L ? j16 : Math.min(j14, j16);
                }
                i13++;
            }
        }
        if (j14 != -9223372036854775807L) {
            return j14;
        }
        return Long.MIN_VALUE;
    }

    @Override // j8.a
    public final void f(long j13) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f74918a;
            if (i13 >= arrayList.size()) {
                return;
            }
            long j14 = ((l9.a) arrayList.get(i13)).f82295b;
            if (j13 > j14 && j13 > ((l9.a) arrayList.get(i13)).f82297d) {
                arrayList.remove(i13);
                i13--;
            } else if (j13 < j14) {
                return;
            }
            i13++;
        }
    }
}
