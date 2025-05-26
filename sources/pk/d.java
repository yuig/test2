package pk;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d extends w implements Serializable {

    /* renamed from: d */
    public transient Map f100375d;

    /* renamed from: e */
    public transient int f100376e;

    public d(Map map) {
        bf.b.k(map.isEmpty());
        this.f100375d = map;
    }

    @Override // pk.l2
    public final Map a() {
        Map map = this.f100507c;
        if (map != null) {
            return map;
        }
        Map g13 = g();
        this.f100507c = g13;
        return g13;
    }

    @Override // pk.l2
    public final void clear() {
        Iterator it = this.f100375d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f100375d.clear();
        this.f100376e = 0;
    }

    @Override // pk.w
    public final Iterator d() {
        return new f(this);
    }

    @Override // pk.w
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // pk.w
    public final Iterator f() {
        return new e(this);
    }

    public Map g() {
        return new i(this, this.f100375d);
    }

    @Override // pk.l2
    public final Collection get(Object obj) {
        Collection collection = (Collection) this.f100375d.get(obj);
        if (collection == null) {
            collection = h();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new n(this, obj, list, null) : new s(this, obj, list, null);
    }

    public abstract Collection h();

    public Set i() {
        return new k(this, this.f100375d);
    }

    public final Collection j() {
        return new v(this);
    }

    public final boolean k(Double d2, Integer num) {
        Collection collection = (Collection) this.f100375d.get(d2);
        if (collection != null) {
            if (!collection.add(num)) {
                return false;
            }
            this.f100376e++;
            return true;
        }
        Collection h10 = h();
        if (!h10.add(num)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f100376e++;
        this.f100375d.put(d2, h10);
        return true;
    }

    public final void l(Map map) {
        this.f100375d = map;
        this.f100376e = 0;
        for (Collection collection : map.values()) {
            bf.b.k(!collection.isEmpty());
            this.f100376e = collection.size() + this.f100376e;
        }
    }

    public final Collection m() {
        Collection collection = this.f100506b;
        if (collection != null) {
            return collection;
        }
        Collection j13 = j();
        this.f100506b = j13;
        return j13;
    }

    @Override // pk.l2
    public final int size() {
        return this.f100376e;
    }
}
