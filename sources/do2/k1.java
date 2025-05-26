package do2;

import kotlin.Unit;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes2.dex */
public final class k1 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f55837a;

    public k1(kotlin.jvm.internal.j0 j0Var) {
        this.f55837a = j0Var;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        kotlin.jvm.internal.j0 j0Var = this.f55837a;
        Object obj2 = j0Var.f80434a;
        fi.b bVar = eo2.j0.f59783a;
        if (obj2 == bVar) {
            j0Var.f80434a = obj;
            return Unit.f80348a;
        }
        j0Var.f80434a = bVar;
        throw new AbortFlowException(this);
    }
}
