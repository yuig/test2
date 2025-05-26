package pk;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class y1 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f100521a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f100522b;

    public y1(Object obj) {
        this.f100521a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f100522b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f100522b) {
            throw new NoSuchElementException();
        }
        this.f100522b = true;
        return this.f100521a;
    }
}
