package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class f extends q5.x0 implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f80364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, int i13) {
        super(hVar, 1);
        this.f80364d = hVar;
        e eVar = h.f80373a;
        int b13 = hVar.b();
        eVar.getClass();
        e.c(i13, b13);
        this.f102537b = i13;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f102537b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f102537b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f102537b - 1;
        this.f102537b = i13;
        return this.f80364d.get(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f102537b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
