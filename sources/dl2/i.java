package dl2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.n;

/* loaded from: classes4.dex */
public abstract class i extends h implements n {

    /* renamed from: r, reason: collision with root package name */
    public final int f55300r;

    public i(int i13, bl2.c cVar) {
        super(cVar);
        this.f55300r = i13;
    }

    @Override // kotlin.jvm.internal.n
    public final int getArity() {
        return this.f55300r;
    }

    @Override // dl2.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h10 = k0.f80436a.h(this);
        Intrinsics.checkNotNullExpressionValue(h10, "renderLambdaToString(...)");
        return h10;
    }
}
