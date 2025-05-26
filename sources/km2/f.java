package km2;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public enum f {
    NON_STABLE_DECLARED(false, false),
    STABLE_DECLARED(true, false),
    NON_STABLE_SYNTHESIZED(false, true),
    STABLE_SYNTHESIZED(true, true);

    public final boolean isStable;
    public final boolean isSynthesized;

    private static /* synthetic */ void $$$reportNull$$$0(int i13) {
        throw new IllegalStateException("@NotNull method kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus.get must not return null");
    }

    f(boolean z13, boolean z14) {
        this.isStable = z13;
        this.isSynthesized = z14;
    }

    @NotNull
    public static f get(boolean z13, boolean z14) {
        f fVar = z13 ? z14 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z14 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
        if (fVar == null) {
            $$$reportNull$$$0(0);
        }
        return fVar;
    }
}
