package k2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.f0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f78182a;

    /* renamed from: b, reason: collision with root package name */
    public b f78183b;

    /* renamed from: c, reason: collision with root package name */
    public int f78184c = 0;

    public e(Object[] objArr) {
        this.f78182a = objArr;
    }

    public final void a(int i13, Object obj) {
        j(this.f78184c + 1);
        Object[] objArr = this.f78182a;
        int i14 = this.f78184c;
        if (i13 != i14) {
            z.h(i13 + 1, i13, i14, objArr, objArr);
        }
        objArr[i13] = obj;
        this.f78184c++;
    }

    public final void b(Object obj) {
        j(this.f78184c + 1);
        Object[] objArr = this.f78182a;
        int i13 = this.f78184c;
        objArr[i13] = obj;
        this.f78184c = i13 + 1;
    }

    public final void c(int i13, List list) {
        if (list.isEmpty()) {
            return;
        }
        j(list.size() + this.f78184c);
        Object[] objArr = this.f78182a;
        if (i13 != this.f78184c) {
            z.h(list.size() + i13, i13, this.f78184c, objArr, objArr);
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            objArr[i13 + i14] = list.get(i14);
        }
        this.f78184c = list.size() + this.f78184c;
    }

    public final void d(int i13, e eVar) {
        if (eVar.l()) {
            return;
        }
        j(this.f78184c + eVar.f78184c);
        Object[] objArr = this.f78182a;
        int i14 = this.f78184c;
        if (i13 != i14) {
            z.h(eVar.f78184c + i13, i13, i14, objArr, objArr);
        }
        z.h(i13, 0, eVar.f78184c, eVar.f78182a, objArr);
        this.f78184c += eVar.f78184c;
    }

    public final boolean e(int i13, Collection collection) {
        int i14 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size() + this.f78184c);
        Object[] objArr = this.f78182a;
        if (i13 != this.f78184c) {
            z.h(collection.size() + i13, i13, this.f78184c, objArr, objArr);
        }
        for (Object obj : collection) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            objArr[i14 + i13] = obj;
            i14 = i15;
        }
        this.f78184c = collection.size() + this.f78184c;
        return true;
    }

    public final List f() {
        b bVar = this.f78183b;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f78183b = bVar2;
        return bVar2;
    }

    public final void h() {
        Object[] objArr = this.f78182a;
        int i13 = this.f78184c;
        while (true) {
            i13--;
            if (-1 >= i13) {
                this.f78184c = 0;
                return;
            }
            objArr[i13] = null;
        }
    }

    public final boolean i(Object obj) {
        int i13 = this.f78184c - 1;
        if (i13 >= 0) {
            for (int i14 = 0; !Intrinsics.d(this.f78182a[i14], obj); i14++) {
                if (i14 != i13) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j(int i13) {
        Object[] objArr = this.f78182a;
        if (objArr.length < i13) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i13, objArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f78182a = copyOf;
        }
    }

    public final int k(Object obj) {
        int i13 = this.f78184c;
        if (i13 <= 0) {
            return -1;
        }
        Object[] objArr = this.f78182a;
        int i14 = 0;
        while (!Intrinsics.d(obj, objArr[i14])) {
            i14++;
            if (i14 >= i13) {
                return -1;
            }
        }
        return i14;
    }

    public final boolean l() {
        return this.f78184c == 0;
    }

    public final boolean m() {
        return this.f78184c != 0;
    }

    public final boolean n(Object obj) {
        int k13 = k(obj);
        if (k13 < 0) {
            return false;
        }
        o(k13);
        return true;
    }

    public final Object o(int i13) {
        Object[] objArr = this.f78182a;
        Object obj = objArr[i13];
        int i14 = this.f78184c;
        if (i13 != i14 - 1) {
            z.h(i13, i13 + 1, i14, objArr, objArr);
        }
        int i15 = this.f78184c - 1;
        this.f78184c = i15;
        objArr[i15] = null;
        return obj;
    }

    public final void p(int i13, int i14) {
        if (i14 > i13) {
            int i15 = this.f78184c;
            if (i14 < i15) {
                Object[] objArr = this.f78182a;
                z.h(i13, i14, i15, objArr, objArr);
            }
            int i16 = this.f78184c;
            int i17 = i16 - (i14 - i13);
            int i18 = i16 - 1;
            if (i17 <= i18) {
                int i19 = i17;
                while (true) {
                    this.f78182a[i19] = null;
                    if (i19 == i18) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            this.f78184c = i17;
        }
    }

    public final void q(Comparator comparator) {
        Object[] objArr = this.f78182a;
        int i13 = this.f78184c;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(objArr, 0, i13, comparator);
    }
}
