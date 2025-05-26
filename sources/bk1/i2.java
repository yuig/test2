package bk1;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ zw.a f23237r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f30 f23238s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(zw.a aVar, f30 f30Var, bl2.c cVar) {
        super(2, cVar);
        this.f23237r = aVar;
        this.f23238s = f30Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i2(this.f23237r, this.f23238s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((qa2.d0) this.f23237r.f142891b).onOpenPinCloseup(this.f23238s);
        return Unit.f80348a;
    }
}
