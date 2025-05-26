package pk;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class s1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f100478a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f100479b;

    public s1(Comparator comparator, Object[] objArr) {
        this.f100478a = comparator;
        this.f100479b = objArr;
    }

    public Object readResolve() {
        c3 c3Var;
        r1 r1Var = new r1(this.f100478a);
        r1Var.n(this.f100479b);
        Object[] objArr = r1Var.f100481a;
        int i13 = r1Var.f100482b;
        Comparator comparator = r1Var.f100476f;
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
        r1Var.f100482b = c3Var.f100374g.size();
        r1Var.f100483c = true;
        return c3Var;
    }
}
