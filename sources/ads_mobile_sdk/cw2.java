package ads_mobile_sdk;

import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cw2 implements ListIterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListIterator f4051a;

    public cw2(ListIterator delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f4051a = delegate;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4051a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4051a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f4051a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4051a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f4051a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4051a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
