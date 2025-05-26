package pk;

import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f100498a;

    public v(w wVar) {
        this.f100498a = wVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f100498a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f100498a.c(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f100498a.f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f100498a.size();
    }
}
