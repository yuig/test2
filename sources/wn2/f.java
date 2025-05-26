package wn2;

import a.cb;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class f extends AbstractList implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public int f130600a;

    /* renamed from: b, reason: collision with root package name */
    public Object f130601b;

    public static /* synthetic */ void b(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : 3];
        switch (i13) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i13 == 2 || i13 == 3) {
            objArr[1] = "iterator";
        } else if (i13 == 5 || i13 == 6 || i13 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i13) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 5 && i13 != 6 && i13 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        if (i13 < 0 || i13 > (i14 = this.f130600a)) {
            StringBuilder s13 = a.a.s("Index: ", i13, ", Size: ");
            s13.append(this.f130600a);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        if (i14 == 0) {
            this.f130601b = obj;
        } else if (i14 == 1 && i13 == 0) {
            this.f130601b = new Object[]{obj, this.f130601b};
        } else {
            Object[] objArr = new Object[i14 + 1];
            if (i14 == 1) {
                objArr[0] = this.f130601b;
            } else {
                Object[] objArr2 = (Object[]) this.f130601b;
                System.arraycopy(objArr2, 0, objArr, 0, i13);
                System.arraycopy(objArr2, i13, objArr, i13 + 1, this.f130600a - i13);
            }
            objArr[i13] = obj;
            this.f130601b = objArr;
        }
        this.f130600a++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f130601b = null;
        this.f130600a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        int i14;
        if (i13 >= 0 && i13 < (i14 = this.f130600a)) {
            return i14 == 1 ? this.f130601b : ((Object[]) this.f130601b)[i13];
        }
        StringBuilder s13 = a.a.s("Index: ", i13, ", Size: ");
        s13.append(this.f130600a);
        throw new IndexOutOfBoundsException(s13.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i13 = this.f130600a;
        if (i13 == 0) {
            return d.f130596a;
        }
        if (i13 == 1) {
            return new e(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        b(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        int i14;
        Object obj;
        if (i13 < 0 || i13 >= (i14 = this.f130600a)) {
            StringBuilder s13 = a.a.s("Index: ", i13, ", Size: ");
            s13.append(this.f130600a);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        if (i14 == 1) {
            obj = this.f130601b;
            this.f130601b = null;
        } else {
            Object[] objArr = (Object[]) this.f130601b;
            Object obj2 = objArr[i13];
            if (i14 == 2) {
                this.f130601b = objArr[1 - i13];
            } else {
                int i15 = (i14 - i13) - 1;
                if (i15 > 0) {
                    System.arraycopy(objArr, i13 + 1, objArr, i13, i15);
                }
                objArr[this.f130600a - 1] = null;
            }
            obj = obj2;
        }
        this.f130600a--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        int i14;
        if (i13 < 0 || i13 >= (i14 = this.f130600a)) {
            StringBuilder s13 = a.a.s("Index: ", i13, ", Size: ");
            s13.append(this.f130600a);
            throw new IndexOutOfBoundsException(s13.toString());
        }
        if (i14 == 1) {
            Object obj2 = this.f130601b;
            this.f130601b = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f130601b;
        Object obj3 = objArr[i13];
        objArr[i13] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f130600a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i13 = this.f130600a;
        if (i13 >= 2) {
            Arrays.sort((Object[]) this.f130601b, 0, i13, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            b(4);
            throw null;
        }
        int length = objArr.length;
        int i13 = this.f130600a;
        if (i13 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f130601b;
                return objArr2;
            }
            objArr[0] = this.f130601b;
        } else {
            if (length < i13) {
                Object[] copyOf = Arrays.copyOf((Object[]) this.f130601b, i13, objArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                b(6);
                throw null;
            }
            if (i13 != 0) {
                System.arraycopy(this.f130601b, 0, objArr, 0, i13);
            }
        }
        int i14 = this.f130600a;
        if (length > i14) {
            objArr[i14] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i13 = this.f130600a;
        if (i13 == 0) {
            this.f130601b = obj;
        } else if (i13 == 1) {
            this.f130601b = new Object[]{this.f130601b, obj};
        } else {
            Object[] objArr = (Object[]) this.f130601b;
            int length = objArr.length;
            if (i13 >= length) {
                int B = cb.B(length, 3, 2, 1);
                int i14 = i13 + 1;
                if (B < i14) {
                    B = i14;
                }
                Object[] objArr2 = new Object[B];
                this.f130601b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f130600a] = obj;
        }
        this.f130600a++;
        ((AbstractList) this).modCount++;
        return true;
    }
}
