package g1;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f63227b;

    public /* synthetic */ a(int i13, Map map) {
        this.f63226a = i13;
        this.f63227b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f63226a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((zm2.e0) this.f63227b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f63226a) {
            case 1:
                ((zm2.e0) this.f63227b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f63226a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((zm2.e0) this.f63227b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i13 = this.f63226a;
        Map map = this.f63227b;
        switch (i13) {
            case 0:
                return new d((g) map);
            default:
                return new zm2.j0((zm2.e0) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f63226a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((zm2.e0) this.f63227b).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i13 = this.f63226a;
        Map map = this.f63227b;
        switch (i13) {
            case 0:
                return ((g) map).f63294c;
            default:
                return ((zm2.e0) map).size();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(zm2.e0 e0Var) {
        this(1, e0Var);
        this.f63226a = 1;
    }
}
