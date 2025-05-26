package dl2;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class c implements bl2.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f55296a = new c();

    @Override // bl2.c
    public final CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // bl2.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
