package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class a implements CoroutineContext.Element {

    @NotNull
    private final h key;

    public a(h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r13, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) g.a(this, r13, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull h hVar) {
        return (E) g.b(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public h getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull h hVar) {
        return g.c(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return g.d(coroutineContext, this);
    }
}
