package ip1;

import bk2.d;
import ck2.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tb0.p;
import vb0.j;
import xj2.e;
import xj2.f;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final f f73374a = new f();

    /* renamed from: b, reason: collision with root package name */
    public Function0 f73375b = a.f73367k;

    public void a(Function0 onCompleteCallback) {
        Intrinsics.checkNotNullParameter(onCompleteCallback, "onCompleteCallback");
        this.f73375b = onCompleteCallback;
        Object obj = (xj2.c) this.f73374a.f135164a.get();
        if (obj == bk2.c.DISPOSED) {
            obj = d.INSTANCE;
        }
        j.f125466a.M(Boolean.valueOf(obj != null), "must set prefetching disposable to currentFetch in PrefetchTask", p.PREFETCH_MANAGER, new Object[0]);
    }

    public final void b() {
        bk2.c.set(this.f73374a.f135164a, new e(i.f27922b));
        this.f73375b.invoke();
    }
}
