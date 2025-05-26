package ri2;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n60.o;

/* loaded from: classes4.dex */
public final class j extends AbstractMap {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f108414c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f108415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108416b;

    public j(List list) {
        this.f108415a = list;
        this.f108416b = list.size() / 2;
    }

    public final int a(Object obj) {
        int i13 = 0;
        while (true) {
            List list = this.f108415a;
            if (i13 >= list.size()) {
                return -1;
            }
            if (obj.equals(list.get(i13))) {
                return i13;
            }
            i13 += 2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return (obj == null || a(obj) == -1) ? false : true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i13 = 0;
        while (true) {
            List list = this.f108415a;
            if (i13 >= list.size()) {
                return false;
            }
            if (list.get(i13 + 1).equals(obj)) {
                return true;
            }
            i13 += 2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int a13;
        if (obj == null || (a13 = a(obj)) == -1) {
            return null;
        }
        return this.f108415a.get(a13 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f108416b;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder i13 = o.i("ReadOnlyArrayMap{");
        int i14 = 0;
        while (true) {
            List list = this.f108415a;
            if (i14 >= list.size()) {
                i13.setLength(i13.length() - 1);
                i13.append("}");
                return i13.toString();
            }
            i13.append(list.get(i14));
            i13.append('=');
            i13.append(list.get(i14 + 1));
            i13.append(',');
            i14 += 2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new g(this, 2);
    }
}
