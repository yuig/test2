package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f31346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f31347b;

    public d(Iterator it, Iterator it2) {
        this.f31346a = it;
        this.f31347b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f31346a.hasNext()) {
            return true;
        }
        return this.f31347b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Iterator it = this.f31346a;
        if (it.hasNext()) {
            return new p(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f31347b;
        if (it2.hasNext()) {
            return new p((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
