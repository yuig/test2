package wn2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import q5.x0;

/* loaded from: classes2.dex */
public final class g implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f130602a;

    public g(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f130602a = com.bumptech.glide.c.D0(array);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f130602a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f130602a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
