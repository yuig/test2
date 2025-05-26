package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.s7;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class z1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18175a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ListIterator f18176b;

    public z1(com.google.android.gms.internal.recaptcha.d1 d1Var, int i13) {
        this.f18176b = d1Var.f31747a.listIterator(i13);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        switch (this.f18175a) {
            case 0:
                b();
                throw null;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                b();
                throw null;
            case 4:
                b();
                throw null;
            default:
                b();
                throw null;
        }
    }

    public final void b() {
        switch (this.f18175a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
            case 2:
            default:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
        }
    }

    public final String c() {
        switch (this.f18175a) {
        }
        return (String) this.f18176b.next();
    }

    public final String d() {
        switch (this.f18175a) {
        }
        return (String) this.f18176b.previous();
    }

    public final void e() {
        switch (this.f18175a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
            case 2:
            default:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18175a) {
        }
        return this.f18176b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f18175a) {
        }
        return this.f18176b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f18175a) {
        }
        return c();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f18175a) {
        }
        return this.f18176b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        switch (this.f18175a) {
        }
        return d();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f18175a) {
        }
        return this.f18176b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f18175a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        switch (this.f18175a) {
            case 0:
                e();
                throw null;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                e();
                throw null;
            case 4:
                e();
                throw null;
            default:
                e();
                throw null;
        }
    }

    public z1(s7 s7Var, int i13) {
        this.f18176b = s7Var.f31638a.listIterator(i13);
    }

    public z1(com.google.crypto.tink.shaded.protobuf.y1 y1Var, int i13) {
        this.f18176b = y1Var.f33714a.listIterator(i13);
    }

    public z1(zm2.k0 k0Var, int i13) {
        this.f18176b = k0Var.f142234a.listIterator(i13);
    }

    public z1(b2 b2Var, int i13) {
        this.f18176b = b2Var.f18034a.listIterator(i13);
    }

    public z1(com.google.protobuf.l2 l2Var, int i13) {
        this.f18176b = l2Var.f33926a.listIterator(i13);
    }
}
