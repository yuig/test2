package ko2;

import ao2.f0;
import ao2.m0;
import ho2.r;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class m extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m f80340c = new m();

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        f.f80328d.f80330c.c(runnable, true, false);
    }

    @Override // ao2.f0
    public final void h(CoroutineContext coroutineContext, Runnable runnable) {
        f.f80328d.f80330c.c(runnable, true, true);
    }

    @Override // ao2.f0
    public final f0 m(int i13, String str) {
        m0.m(i13);
        return i13 >= l.f80337d ? str != null ? new r(this, str) : this : super.m(i13, str);
    }

    @Override // ao2.f0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
