package ho2;

import ao2.j0;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class c implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f69751a;

    public c(CoroutineContext coroutineContext) {
        this.f69751a = coroutineContext;
    }

    @Override // ao2.j0
    public final CoroutineContext getCoroutineContext() {
        return this.f69751a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f69751a + ')';
    }
}
