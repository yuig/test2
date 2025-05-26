package com.google.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class f2 extends AbstractMap {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f33885g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f33886a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33889d;

    /* renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.v1 f33890e;

    /* renamed from: b, reason: collision with root package name */
    public List f33887b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public Map f33888c = Collections.emptyMap();

    /* renamed from: f, reason: collision with root package name */
    public Map f33891f = Collections.emptyMap();

    public f2(int i13) {
        this.f33886a = i13;
    }

    public final int a(Comparable comparable) {
        int i13;
        int size = this.f33887b.size();
        int i14 = size - 1;
        if (i14 >= 0) {
            int compareTo = comparable.compareTo(((h2) this.f33887b.get(i14)).f33905a);
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
            int compareTo2 = comparable.compareTo(((h2) this.f33887b.get(i16)).f33905a);
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
        if (this.f33889d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        b();
        if (!this.f33887b.isEmpty()) {
            this.f33887b.clear();
        }
        if (this.f33888c.isEmpty()) {
            return;
        }
        this.f33888c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f33888c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        if (this.f33890e == null) {
            this.f33890e = new androidx.datastore.preferences.protobuf.v1(this);
        }
        return this.f33890e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return super.equals(obj);
        }
        f2 f2Var = (f2) obj;
        int size = size();
        if (size != f2Var.size()) {
            return false;
        }
        int size2 = this.f33887b.size();
        if (size2 != f2Var.f33887b.size()) {
            return entrySet().equals(f2Var.entrySet());
        }
        for (int i13 = 0; i13 < size2; i13++) {
            if (!h(i13).equals(f2Var.h(i13))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f33888c.equals(f2Var.f33888c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a13 = a(comparable);
        return a13 >= 0 ? ((h2) this.f33887b.get(a13)).f33906b : this.f33888c.get(comparable);
    }

    public final Map.Entry h(int i13) {
        return (Map.Entry) this.f33887b.get(i13);
    }

    public final Iterable i() {
        return this.f33888c.isEmpty() ? g2.f33898b : this.f33888c.entrySet();
    }

    public final SortedMap j() {
        b();
        if (this.f33888c.isEmpty() && !(this.f33888c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f33888c = treeMap;
            this.f33891f = treeMap.descendingMap();
        }
        return (SortedMap) this.f33888c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int size = this.f33887b.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += ((h2) this.f33887b.get(i14)).hashCode();
        }
        return this.f33888c.size() > 0 ? i13 + this.f33888c.hashCode() : i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a13 = a(comparable);
        if (a13 >= 0) {
            return ((h2) this.f33887b.get(a13)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f33887b.isEmpty();
        int i13 = this.f33886a;
        if (isEmpty && !(this.f33887b instanceof ArrayList)) {
            this.f33887b = new ArrayList(i13);
        }
        int i14 = -(a13 + 1);
        if (i14 >= i13) {
            return j().put(comparable, obj);
        }
        if (this.f33887b.size() == i13) {
            h2 h2Var = (h2) this.f33887b.remove(i13 - 1);
            j().put(h2Var.f33905a, h2Var.f33906b);
        }
        this.f33887b.add(i14, new h2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a13 = a(comparable);
        if (a13 >= 0) {
            return o(a13);
        }
        if (this.f33888c.isEmpty()) {
            return null;
        }
        return this.f33888c.remove(comparable);
    }

    public final Object o(int i13) {
        b();
        Object obj = ((h2) this.f33887b.remove(i13)).f33906b;
        if (!this.f33888c.isEmpty()) {
            Iterator it = j().entrySet().iterator();
            List list = this.f33887b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new h2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f33888c.size() + this.f33887b.size();
    }
}
