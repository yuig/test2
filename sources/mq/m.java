package mq;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88004r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f88005s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f88006t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(StringBuilder sb3, u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f88005s = sb3;
        this.f88006t = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f88005s, this.f88006t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88004r;
        if (i13 == 0) {
            ue.c.H(obj);
            l lVar = new l(this.f88005s, this.f88006t, null);
            this.f88004r = 1;
            if (bs1.c.y2(5000L, lVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
