package u2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public interface r extends CoroutineContext.Element {
    float c();

    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.h getKey() {
        return b.f120028p;
    }
}
