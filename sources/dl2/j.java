package dl2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.n;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class j extends d implements n {
    private final int arity;

    public j(int i13, bl2.c cVar) {
        super(cVar);
        this.arity = i13;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    @Override // dl2.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h10 = k0.f80436a.h(this);
        Intrinsics.checkNotNullExpressionValue(h10, "renderLambdaToString(...)");
        return h10;
    }
}
