package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class s implements n, Serializable {
    private final int arity;

    public s(int i13) {
        this.arity = i13;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String i13 = k0.f80436a.i(this);
        Intrinsics.checkNotNullExpressionValue(i13, "renderLambdaToString(...)");
        return i13;
    }
}
