package do2;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes4.dex */
public final class h1 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f55810a;

    public h1(kotlin.jvm.internal.j0 j0Var) {
        this.f55810a = j0Var;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        this.f55810a.f80434a = obj;
        throw new AbortFlowException(this);
    }
}
