package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f31486a;

    public k(Iterator it) {
        this.f31486a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31486a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new p((String) this.f31486a.next());
    }
}
