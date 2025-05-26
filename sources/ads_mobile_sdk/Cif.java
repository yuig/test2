package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: ads_mobile_sdk.if, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cif extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gf f6364a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(gf gfVar, bl2.c cVar) {
        super(2, cVar);
        this.f6364a = gfVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new Cif(this.f6364a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gf gfVar = this.f6364a;
        new Cif(gfVar, (bl2.c) obj2);
        Unit unit = Unit.f80348a;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(unit);
        return gfVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return this.f6364a;
    }
}
