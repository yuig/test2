package ads_mobile_sdk;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ly1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f8027a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f8028b;

    public ly1(Iterator it, Iterator it2) {
        this.f8027a = it;
        this.f8028b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8027a.hasNext() || this.f8028b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f8027a.hasNext() ? this.f8027a.next() : this.f8028b.next();
    }
}
