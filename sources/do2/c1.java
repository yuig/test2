package do2;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes2.dex */
public final class c1 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f55743a;

    public c1(kotlin.jvm.internal.j0 j0Var) {
        this.f55743a = j0Var;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        this.f55743a.f80434a = obj;
        throw new AbortFlowException(this);
    }
}
