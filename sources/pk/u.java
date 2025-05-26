package pk;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class u extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100487a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f100488b;

    public u(Map map) {
        map.getClass();
        this.f100488b = map;
    }

    public final void b() {
        ((w) this.f100488b).clear();
    }

    public final boolean c(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((w) this.f100488b).b(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i13 = this.f100487a;
        Object obj = this.f100488b;
        switch (i13) {
            case 0:
                b();
                break;
            case 1:
                ((f0) obj).clear();
                break;
            default:
                ((Map) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f100487a) {
            case 0:
                return c(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((Map) this.f100488b).containsValue(obj);
        }
    }

    public final boolean d(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((w) this.f100488b).remove(entry.getKey(), entry.getValue());
    }

    public final int e() {
        return ((w) this.f100488b).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f100487a) {
            case 2:
                return ((Map) this.f100488b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i13 = this.f100487a;
        Object obj = this.f100488b;
        switch (i13) {
            case 0:
                return ((w) obj).d();
            case 1:
                f0 f0Var = (f0) obj;
                Map c13 = f0Var.c();
                return c13 != null ? c13.values().iterator() : new b0(f0Var, 2);
            default:
                return new e2(((Map) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f100487a) {
            case 0:
                return d(obj);
            case 1:
            default:
                return super.remove(obj);
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Map map = (Map) this.f100488b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (kh2.g0.m(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f100487a) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = (Map) this.f100488b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f100487a) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = (Map) this.f100488b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i13 = this.f100487a;
        Object obj = this.f100488b;
        switch (i13) {
            case 0:
                return e();
            case 1:
                return ((f0) obj).size();
            default:
                return ((Map) obj).size();
        }
    }

    public u(f0 f0Var) {
        this.f100488b = f0Var;
    }
}
