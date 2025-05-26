package pn2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class m1 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((ym2.c) obj) != null) {
            return Boolean.valueOf(!r2.equals(xl2.q.f135319y));
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
    }
}
