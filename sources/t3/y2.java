package t3;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y2 implements u2.r {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f116281a = b7.c.J(1.0f);

    @Override // u2.r
    public final float c() {
        return this.f116281a.h();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return kotlin.coroutines.g.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.b(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.c(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.g.d(coroutineContext, this);
    }
}
