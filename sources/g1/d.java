package g1;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f63244a;

    /* renamed from: b, reason: collision with root package name */
    public int f63245b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63246c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f63247d;

    public d(g gVar) {
        this.f63247d = gVar;
        this.f63244a = gVar.f63294c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f63246c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i13 = this.f63245b;
        g gVar = this.f63247d;
        return Intrinsics.d(key, gVar.f(i13)) && Intrinsics.d(entry.getValue(), gVar.j(this.f63245b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f63246c) {
            return this.f63247d.f(this.f63245b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f63246c) {
            return this.f63247d.j(this.f63245b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63245b < this.f63244a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f63246c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i13 = this.f63245b;
        g gVar = this.f63247d;
        Object f13 = gVar.f(i13);
        Object j13 = gVar.j(this.f63245b);
        return (f13 == null ? 0 : f13.hashCode()) ^ (j13 != null ? j13.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f63245b++;
        this.f63246c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f63246c) {
            throw new IllegalStateException();
        }
        this.f63247d.h(this.f63245b);
        this.f63245b--;
        this.f63244a--;
        this.f63246c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f63246c) {
            return this.f63247d.i(this.f63245b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
