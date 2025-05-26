package ho2;

import ao2.n2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final fi.b f69792a = new fi.b("NO_THREAD_ELEMENTS", 4);

    /* renamed from: b, reason: collision with root package name */
    public static final ao2.b0 f69793b = new ao2.b0(4);

    /* renamed from: c, reason: collision with root package name */
    public static final ao2.b0 f69794c = new ao2.b0(5);

    /* renamed from: d, reason: collision with root package name */
    public static final ao2.b0 f69795d = new ao2.b0(6);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f69792a) {
            return;
        }
        if (obj instanceof a0) {
            ((a0) obj).b(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, f69794c);
        Intrinsics.g(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((n2) fold).restoreThreadContext(coroutineContext, obj);
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f69793b);
        Intrinsics.f(fold);
        return fold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? f69792a : obj instanceof Integer ? coroutineContext.fold(new a0(coroutineContext, ((Number) obj).intValue()), f69795d) : ((n2) obj).updateThreadContext(coroutineContext);
    }
}
