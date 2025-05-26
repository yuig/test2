package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f80404a;

    /* renamed from: b, reason: collision with root package name */
    public final h f80405b;

    public b(h baseKey, os.d safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f80404a = safeCast;
        this.f80405b = baseKey instanceof b ? ((b) baseKey).f80405b : baseKey;
    }

    public final boolean a(h key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.f80405b == key;
    }

    public final CoroutineContext.Element b(CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.f80404a.invoke(element);
    }
}
