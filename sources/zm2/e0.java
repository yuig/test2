package zm2;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class e0 extends AbstractMap {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f142195f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f142196a;

    /* renamed from: b, reason: collision with root package name */
    public List f142197b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public Map f142198c = Collections.emptyMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f142199d;

    /* renamed from: e, reason: collision with root package name */
    public volatile g1.a f142200e;

    public e0(int i13) {
        this.f142196a = i13;
    }

    public final int a(Comparable comparable) {
        int i13;
        int size = this.f142197b.size();
        int i14 = size - 1;
        if (i14 >= 0) {
            int compareTo = comparable.compareTo(((i0) this.f142197b.get(i14)).f142223a);
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
            int compareTo2 = comparable.compareTo(((i0) this.f142197b.get(i16)).f142223a);
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
        if (this.f142199d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        b();
        if (!this.f142197b.isEmpty()) {
            this.f142197b.clear();
        }
        if (this.f142198c.isEmpty()) {
            return;
        }
        this.f142198c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f142198c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        if (this.f142200e == null) {
            this.f142200e = new g1.a(this);
        }
        return this.f142200e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a13 = a(comparable);
        return a13 >= 0 ? ((i0) this.f142197b.get(a13)).f142224b : this.f142198c.get(comparable);
    }

    public final Iterable g() {
        return this.f142198c.isEmpty() ? h0.f142218b : this.f142198c.entrySet();
    }

    public final SortedMap h() {
        b();
        if (this.f142198c.isEmpty() && !(this.f142198c instanceof TreeMap)) {
            this.f142198c = new TreeMap();
        }
        return (SortedMap) this.f142198c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a13 = a(comparable);
        if (a13 >= 0) {
            return ((i0) this.f142197b.get(a13)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f142197b.isEmpty();
        int i13 = this.f142196a;
        if (isEmpty && !(this.f142197b instanceof ArrayList)) {
            this.f142197b = new ArrayList(i13);
        }
        int i14 = -(a13 + 1);
        if (i14 >= i13) {
            return h().put(comparable, obj);
        }
        if (this.f142197b.size() == i13) {
            i0 i0Var = (i0) this.f142197b.remove(i13 - 1);
            h().put(i0Var.f142223a, i0Var.f142224b);
        }
        this.f142197b.add(i14, new i0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a13 = a(comparable);
        if (a13 >= 0) {
            return k(a13);
        }
        if (this.f142198c.isEmpty()) {
            return null;
        }
        return this.f142198c.remove(comparable);
    }

    public final Object k(int i13) {
        b();
        Object obj = ((i0) this.f142197b.remove(i13)).f142224b;
        if (!this.f142198c.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            List list = this.f142197b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new i0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f142198c.size() + this.f142197b.size();
    }
}
