package bl2;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f23480b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext[] f23481a;

    public b(CoroutineContext[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f23481a = elements;
    }

    private final Object readResolve() {
        CoroutineContext coroutineContext = j.f80412a;
        for (CoroutineContext coroutineContext2 : this.f23481a) {
            coroutineContext = coroutineContext.plus(coroutineContext2);
        }
        return coroutineContext;
    }
}
