package ads_mobile_sdk;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class dw2 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f4478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f4479b;

    public dw2(Iterator it) {
        this.f4479b = it;
        this.f4478a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4478a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new fw2((Map.Entry) this.f4479b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
