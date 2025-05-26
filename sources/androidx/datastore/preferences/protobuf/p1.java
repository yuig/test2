package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class p1 extends AbstractMap {

    /* renamed from: g */
    public static final /* synthetic */ int f18122g = 0;

    /* renamed from: a */
    public final int f18123a;

    /* renamed from: d */
    public boolean f18126d;

    /* renamed from: e */
    public volatile v1 f18127e;

    /* renamed from: b */
    public List f18124b = Collections.emptyList();

    /* renamed from: c */
    public Map f18125c = Collections.emptyMap();

    /* renamed from: f */
    public Map f18128f = Collections.emptyMap();

    public p1(int i13) {
        this.f18123a = i13;
    }

    public final int a(Comparable comparable) {
        int i13;
        int size = this.f18124b.size();
        int i14 = size - 1;
        if (i14 >= 0) {
            int compareTo = comparable.compareTo(((t1) this.f18124b.get(i14)).f18141a);
            if (compareTo > 0) {
                i13 = size + 1;
                return -i13;
            }
            if (compareTo == 0) {
                return i14;
            }
        }
        int i15 = 0;
        while (i15 <= i14) {
            int i16 = (i15 + i14) / 2;
            int compareTo2 = comparable.compareTo(((t1) this.f18124b.get(i16)).f18141a);
            if (compareTo2 < 0) {
                i14 = i16 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i16;
                }
                i15 = i16 + 1;
            }
        }
        i13 = i15 + 1;
        return -i13;
    }

    public final void b() {
        if (this.f18126d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final void clear() {
        b();
        if (!this.f18124b.isEmpty()) {
            this.f18124b.clear();
        }
        if (this.f18125c.isEmpty()) {
            return;
        }
        this.f18125c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f18125c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final Set entrySet() {
        if (this.f18127e == null) {
            this.f18127e = new v1(this);
        }
        return this.f18127e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return super.equals(obj);
        }
        p1 p1Var = (p1) obj;
        int size = size();
        if (size != p1Var.size()) {
            return false;
        }
        int size2 = this.f18124b.size();
        if (size2 != p1Var.f18124b.size()) {
            return entrySet().equals(p1Var.entrySet());
        }
        for (int i13 = 0; i13 < size2; i13++) {
            if (!h(i13).equals(p1Var.h(i13))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f18125c.equals(p1Var.f18125c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a13 = a(comparable);
        return a13 >= 0 ? ((t1) this.f18124b.get(a13)).f18142b : this.f18125c.get(comparable);
    }

    public final Map.Entry h(int i13) {
        return (Map.Entry) this.f18124b.get(i13);
    }

    public final Iterable i() {
        return this.f18125c.isEmpty() ? s1.f18136b : this.f18125c.entrySet();
    }

    public final SortedMap j() {
        b();
        if (this.f18125c.isEmpty() && !(this.f18125c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18125c = treeMap;
            this.f18128f = treeMap.descendingMap();
        }
        return (SortedMap) this.f18125c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: k */
    public final int hashCode() {
        int size = this.f18124b.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += ((t1) this.f18124b.get(i14)).hashCode();
        }
        return this.f18125c.size() > 0 ? i13 + this.f18125c.hashCode() : i13;
    }

    public final Object m(Comparable comparable, Object obj) {
        b();
        int a13 = a(comparable);
        if (a13 >= 0) {
            return ((t1) this.f18124b.get(a13)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f18124b.isEmpty();
        int i13 = this.f18123a;
        if (isEmpty && !(this.f18124b instanceof ArrayList)) {
            this.f18124b = new ArrayList(i13);
        }
        int i14 = -(a13 + 1);
        if (i14 >= i13) {
            return j().put(comparable, obj);
        }
        if (this.f18124b.size() == i13) {
            t1 t1Var = (t1) this.f18124b.remove(i13 - 1);
            j().put(t1Var.f18141a, t1Var.f18142b);
        }
        this.f18124b.add(i14, new t1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: n */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a13 = a(comparable);
        if (a13 >= 0) {
            return o(a13);
        }
        if (this.f18125c.isEmpty()) {
            return null;
        }
        return this.f18125c.remove(comparable);
    }

    public final Object o(int i13) {
        b();
        Object obj = ((t1) this.f18124b.remove(i13)).f18142b;
        if (!this.f18125c.isEmpty()) {
            Iterator it = j().entrySet().iterator();
            List list = this.f18124b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new t1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: p */
    public final int size() {
        return this.f18125c.size() + this.f18124b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        ep.b.A(obj);
        return m(null, obj2);
    }
}
