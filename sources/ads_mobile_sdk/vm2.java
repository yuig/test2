package ads_mobile_sdk;

import a.fb;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class vm2 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f12567a;

    /* renamed from: b, reason: collision with root package name */
    public int f12568b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12570d;

    /* renamed from: e, reason: collision with root package name */
    public volatile um2 f12571e;

    /* renamed from: c, reason: collision with root package name */
    public Map f12569c = Collections.emptyMap();

    /* renamed from: f, reason: collision with root package name */
    public Map f12572f = Collections.emptyMap();

    public static fb d() {
        return new fb();
    }

    public final int a(Comparable comparable) {
        int i13;
        int i14 = this.f12568b;
        int i15 = i14 - 1;
        if (i15 >= 0) {
            int compareTo = comparable.compareTo(((sm2) this.f12567a[i15]).f11166a);
            if (compareTo > 0) {
                i13 = i14 + 1;
                return -i13;
            }
            if (compareTo == 0) {
                return i15;
            }
        }
        int i16 = 0;
        while (i16 <= i15) {
            int i17 = (i16 + i15) / 2;
            int compareTo2 = comparable.compareTo(((sm2) this.f12567a[i17]).f11166a);
            if (compareTo2 < 0) {
                i15 = i17 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i17;
                }
                i16 = i17 + 1;
            }
        }
        i13 = i16 + 1;
        return -i13;
    }

    public final Set b() {
        return this.f12569c.isEmpty() ? Collections.emptySet() : this.f12569c.entrySet();
    }

    public final SortedMap c() {
        a();
        if (this.f12569c.isEmpty() && !(this.f12569c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12569c = treeMap;
            this.f12572f = treeMap.descendingMap();
        }
        return (SortedMap) this.f12569c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (this.f12568b != 0) {
            this.f12567a = null;
            this.f12568b = 0;
        }
        if (this.f12569c.isEmpty()) {
            return;
        }
        this.f12569c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f12569c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f12571e == null) {
            this.f12571e = new um2(this);
        }
        return this.f12571e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm2)) {
            return super.equals(obj);
        }
        vm2 vm2Var = (vm2) obj;
        int size = this.f12569c.size() + this.f12568b;
        if (size != vm2Var.f12569c.size() + vm2Var.f12568b) {
            return false;
        }
        int i13 = this.f12568b;
        if (i13 != vm2Var.f12568b) {
            return entrySet().equals(vm2Var.entrySet());
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!a(i14).equals(vm2Var.a(i14))) {
                return false;
            }
        }
        if (i13 != size) {
            return this.f12569c.equals(vm2Var.f12569c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a13 = a(comparable);
        return a13 >= 0 ? ((sm2) this.f12567a[a13]).f11167b : this.f12569c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i13 = this.f12568b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 += this.f12567a[i15].hashCode();
        }
        return this.f12569c.size() > 0 ? i14 + this.f12569c.hashCode() : i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int a13 = a(comparable);
        if (a13 >= 0) {
            return b(a13);
        }
        if (this.f12569c.isEmpty()) {
            return null;
        }
        return this.f12569c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f12569c.size() + this.f12568b;
    }

    public final Object b(int i13) {
        a();
        Object[] objArr = this.f12567a;
        Object obj = ((sm2) objArr[i13]).f11167b;
        System.arraycopy(objArr, i13 + 1, objArr, i13, (this.f12568b - i13) - 1);
        this.f12568b--;
        if (!this.f12569c.isEmpty()) {
            Iterator it = c().entrySet().iterator();
            Object[] objArr2 = this.f12567a;
            int i14 = this.f12568b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i14] = new sm2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f12568b++;
            it.remove();
        }
        return obj;
    }

    public final void a() {
        if (this.f12570d) {
            throw new UnsupportedOperationException();
        }
    }

    public final sm2 a(int i13) {
        if (i13 < this.f12568b) {
            return (sm2) this.f12567a[i13];
        }
        throw new ArrayIndexOutOfBoundsException(i13);
    }

    public final Object a(Comparable comparable, Object obj) {
        a();
        int a13 = a(comparable);
        if (a13 >= 0) {
            sm2 sm2Var = (sm2) this.f12567a[a13];
            sm2Var.f11168c.a();
            Object obj2 = sm2Var.f11167b;
            sm2Var.f11167b = obj;
            return obj2;
        }
        a();
        if (this.f12567a == null) {
            this.f12567a = new Object[16];
        }
        int i13 = -(a13 + 1);
        if (i13 >= 16) {
            return c().put(comparable, obj);
        }
        int i14 = this.f12568b;
        if (i14 == 16) {
            sm2 sm2Var2 = (sm2) this.f12567a[15];
            this.f12568b = i14 - 1;
            c().put(sm2Var2.f11166a, sm2Var2.f11167b);
        }
        Object[] objArr = this.f12567a;
        System.arraycopy(objArr, i13, objArr, i13 + 1, (objArr.length - i13) - 1);
        this.f12567a[i13] = new sm2(this, comparable, obj);
        this.f12568b++;
        return null;
    }
}
