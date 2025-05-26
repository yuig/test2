package ads_mobile_sdk;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bw2 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f3627a;

    public bw2(Iterator delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3627a = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3627a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f3627a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
