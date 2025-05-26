package dl2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public abstract class h extends a {
    public h(bl2.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != kotlin.coroutines.j.f80412a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return kotlin.coroutines.j.f80412a;
    }
}
