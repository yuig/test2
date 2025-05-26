package a6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f879r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k0 f880s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k0 k0Var, bl2.c cVar) {
        super(2, cVar);
        this.f880s = k0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        t tVar = new t(this.f880s, cVar);
        tVar.f879r = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((k0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        k0 k0Var = (k0) this.f879r;
        k0 k0Var2 = this.f880s;
        boolean z13 = false;
        if (!(k0Var2 instanceof b) && !(k0Var2 instanceof j) && k0Var == k0Var2) {
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }
}
