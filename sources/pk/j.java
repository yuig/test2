package pk;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class j implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f100427a;

    /* renamed from: b, reason: collision with root package name */
    public Object f100428b = null;

    /* renamed from: c, reason: collision with root package name */
    public Collection f100429c = null;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f100430d = x1.INSTANCE;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f100431e;

    public j(d dVar) {
        this.f100431e = dVar;
        this.f100427a = dVar.f100375d.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f100427a.hasNext() || this.f100430d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f100430d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f100427a.next();
            this.f100428b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f100429c = collection;
            this.f100430d = collection.iterator();
        }
        return a(this.f100428b, this.f100430d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f100430d.remove();
        Collection collection = this.f100429c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f100427a.remove();
        }
        d dVar = this.f100431e;
        dVar.f100376e--;
    }
}
