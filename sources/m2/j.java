package m2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.c0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends c implements l2.b {

    /* renamed from: c, reason: collision with root package name */
    public static final j f85687c = new j(new Object[0]);

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f85688b;

    public j(Object[] objArr) {
        this.f85688b = objArr;
        int length = objArr.length;
    }

    @Override // l2.c
    public final l2.c P(b bVar) {
        Object[] objArr = this.f85688b;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z13 = false;
        for (int i13 = 0; i13 < length2; i13++) {
            Object obj = objArr[i13];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z13) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(this, size)");
                    z13 = true;
                    length = i13;
                }
            } else if (z13) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f85687c : new j(z.n(0, length, objArr2));
    }

    @Override // l2.c
    public final l2.c W(int i13) {
        Object[] objArr = this.f85688b;
        ue.c.f(i13, objArr.length);
        if (objArr.length == 1) {
            return f85687c;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        z.h(i13, i13 + 1, objArr.length, objArr, copyOf);
        return new j(copyOf);
    }

    @Override // java.util.List, l2.c
    public final l2.c add(int i13, Object obj) {
        Object[] objArr = this.f85688b;
        ue.c.g(i13, objArr.length);
        if (i13 == objArr.length) {
            return add(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            z.l(objArr, objArr2, 0, i13, 6);
            z.h(i13 + 1, i13, objArr.length, objArr, objArr2);
            objArr2[i13] = obj;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        z.h(i13 + 1, i13, objArr.length - 1, objArr, copyOf);
        copyOf[i13] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArr.length + 1, 0, copyOf, objArr3);
    }

    @Override // m2.c, java.util.Collection, java.util.List, l2.c
    public final l2.c addAll(Collection collection) {
        Object[] objArr = this.f85688b;
        if (collection.size() + objArr.length > 32) {
            f q13 = q();
            q13.addAll(collection);
            return q13.d();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new j(copyOf);
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f85688b.length;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        ue.c.f(i13, b());
        return this.f85688b[i13];
    }

    @Override // kotlin.collections.h, java.util.List
    public final int indexOf(Object obj) {
        return c0.K(this.f85688b, obj);
    }

    @Override // kotlin.collections.h, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f85688b;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i13 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i13 < 0) {
                    return -1;
                }
                length = i13;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i14 = length2 - 1;
                if (Intrinsics.d(obj, objArr[length2])) {
                    return length2;
                }
                if (i14 < 0) {
                    return -1;
                }
                length2 = i14;
            }
        }
    }

    @Override // kotlin.collections.h, java.util.List
    public final ListIterator listIterator(int i13) {
        ue.c.g(i13, b());
        return new d(i13, b(), this.f85688b);
    }

    @Override // l2.c
    public final f q() {
        return new f(this, null, this.f85688b, 0);
    }

    @Override // kotlin.collections.h, java.util.List
    public final l2.c set(int i13, Object obj) {
        ue.c.f(i13, b());
        Object[] objArr = this.f85688b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i13] = obj;
        return new j(copyOf);
    }

    @Override // java.util.Collection, java.util.List, l2.c
    public final l2.c add(Object obj) {
        Object[] objArr = this.f85688b;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[objArr.length] = obj;
            return new j(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new e(objArr.length + 1, 0, objArr, objArr2);
    }
}
