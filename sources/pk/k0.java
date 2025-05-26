package pk;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class k0 extends t2 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator[] f100440a;

    public k0(z zVar, z zVar2) {
        this.f100440a = new Comparator[]{zVar, zVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f100440a;
            if (i13 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i13].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i13++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            return Arrays.equals(this.f100440a, ((k0) obj).f100440a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f100440a);
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Ordering.compound("), Arrays.toString(this.f100440a), ")");
    }
}
