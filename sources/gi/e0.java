package gi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class e0 extends a0 implements NavigableMap {

    /* renamed from: f, reason: collision with root package name */
    public static final i0 f65060f;

    /* renamed from: g, reason: collision with root package name */
    public static final e0 f65061g;

    /* renamed from: c, reason: collision with root package name */
    public final transient m0 f65062c;

    /* renamed from: d, reason: collision with root package name */
    public final transient z f65063d;

    /* renamed from: e, reason: collision with root package name */
    public final transient e0 f65064e;

    static {
        i0 i0Var = i0.f65074a;
        f65060f = i0Var;
        m0 t13 = f0.t(i0Var);
        v vVar = z.f65142b;
        f65061g = new e0(t13, k0.f65079e, null);
    }

    public e0(m0 m0Var, z zVar, e0 e0Var) {
        this.f65062c = m0Var;
        this.f65063d = zVar;
        this.f65064e = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e0 c(TreeMap treeMap) {
        Comparator comparator = treeMap.comparator();
        i0 i0Var = f65060f;
        int i13 = 1;
        boolean equals = comparator == null ? true : i0Var.equals(comparator);
        Set entrySet = treeMap.entrySet();
        Map.Entry[] entryArr = a0.f65043b;
        if (!(entrySet instanceof Collection)) {
            Iterator it = entrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) entrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return d(i0Var);
        }
        int i14 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr2[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i15 = 0; i15 < 1; i15++) {
                if (objArr[i15] == null) {
                    throw new NullPointerException(a.a.d("at index ", i15));
                }
            }
            m0 m0Var = new m0(z.l(1, objArr), i0Var);
            Object[] objArr2 = {value};
            while (i14 < 1) {
                if (objArr2[i14] == null) {
                    throw new NullPointerException(a.a.d("at index ", i14));
                }
                i14++;
            }
            return new e0(m0Var, z.l(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (equals) {
            while (i14 < length) {
                Map.Entry entry2 = entryArr2[i14];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                kh2.s0.d1(key2, value2);
                objArr3[i14] = key2;
                objArr4[i14] = value2;
                i14++;
            }
        } else {
            Arrays.sort(entryArr2, 0, length, new t3.t0(i0Var, i13));
            Map.Entry entry3 = entryArr2[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            kh2.s0.d1(objArr3[0], value3);
            while (i13 < length) {
                Map.Entry entry4 = entryArr2[i13 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr2[i13];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                kh2.s0.d1(key4, value4);
                objArr3[i13] = key4;
                objArr4[i13] = value4;
                if (i0Var.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(t3.s1.c("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i13++;
                key3 = key4;
            }
        }
        return new e0(new m0(z.l(length, objArr3), i0Var), z.l(length, objArr4), null);
    }

    public static e0 d(Comparator comparator) {
        if (i0.f65074a.equals(comparator)) {
            return f65061g;
        }
        m0 t13 = f0.t(comparator);
        v vVar = z.f65142b;
        return new e0(t13, k0.f65079e, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f65062c.f65065d;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f65062c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        e0 e0Var = this.f65064e;
        if (e0Var != null) {
            return e0Var;
        }
        boolean isEmpty = isEmpty();
        m0 m0Var = this.f65062c;
        if (!isEmpty) {
            return new e0((m0) m0Var.descendingSet(), this.f65063d.i(), this);
        }
        Comparator comparator = m0Var.f65065d;
        return d((comparator instanceof j0 ? (j0) comparator : new t(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final e0 headMap(Object obj, boolean z13) {
        obj.getClass();
        return i(0, this.f65062c.u(obj, z13));
    }

    @Override // java.util.NavigableMap
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final e0 subMap(Object obj, boolean z13, Object obj2, boolean z14) {
        obj.getClass();
        obj2.getClass();
        if (this.f65062c.f65065d.compare(obj, obj2) <= 0) {
            return headMap(obj2, z14).tailMap(obj, z13);
        }
        throw new IllegalArgumentException(kh2.g0.t0("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().n().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f65062c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    @Override // java.util.NavigableMap
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final e0 tailMap(Object obj, boolean z13) {
        obj.getClass();
        return i(this.f65062c.v(obj, z13), this.f65063d.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // gi.a0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            gi.m0 r0 = r3.f65062c
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            gi.z r2 = r0.f65097f     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.f65065d     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            gi.z r0 = r3.f65063d
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.e0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    public final e0 i(int i13, int i14) {
        z zVar = this.f65063d;
        if (i13 == 0) {
            if (i14 == zVar.size()) {
                return this;
            }
            i13 = 0;
        }
        m0 m0Var = this.f65062c;
        return i13 == i14 ? d(m0Var.f65065d) : new e0(m0Var.w(i13, i14), zVar.subList(i13, i14), null);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f65062c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().n().get(this.f65063d.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f65062c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f65062c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f65063d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f65063d;
    }
}
