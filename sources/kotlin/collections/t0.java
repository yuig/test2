package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t0 implements Iterable, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f80397a;

    public t0(Function0 iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f80397a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new q5.x0((Iterator) this.f80397a.invoke());
    }
}
