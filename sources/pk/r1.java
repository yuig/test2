package pk;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class r1 extends m1 {

    /* renamed from: f, reason: collision with root package name */
    public final Comparator f100476f;

    public r1(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f100476f = comparator;
    }

    @Override // pk.m1, pk.u0
    public final u0 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // pk.m1
    /* renamed from: i */
    public final m1 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // pk.m1
    public final m1 j(Object[] objArr) {
        throw null;
    }

    @Override // pk.m1
    public final m1 k(Iterable iterable) {
        throw null;
    }

    @Override // pk.m1
    public final o1 m() {
        c3 c3Var;
        Object[] objArr = this.f100481a;
        int i13 = this.f100482b;
        Comparator comparator = this.f100476f;
        if (i13 == 0) {
            c3Var = t1.v(comparator);
        } else {
            int i14 = t1.f100484f;
            bs1.c.v(i13, objArr);
            Arrays.sort(objArr, 0, i13, comparator);
            int i15 = 1;
            for (int i16 = 1; i16 < i13; i16++) {
                Object obj = objArr[i16];
                if (comparator.compare(obj, objArr[i15 - 1]) != 0) {
                    objArr[i15] = obj;
                    i15++;
                }
            }
            Arrays.fill(objArr, i15, i13, (Object) null);
            if (i15 < objArr.length / 2) {
                objArr = Arrays.copyOf(objArr, i15);
            }
            c3Var = new c3(c1.l(i15, objArr), comparator);
        }
        this.f100482b = c3Var.f100374g.size();
        this.f100483c = true;
        return c3Var;
    }

    public final void n(Object... objArr) {
        super.j(objArr);
    }
}
