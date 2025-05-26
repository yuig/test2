package gm2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final o f65784i = new o(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!ym2.g.f(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return ym2.g.e(simpleName);
        }
        return null;
    }
}
