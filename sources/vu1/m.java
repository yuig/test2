package vu1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f126689r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f126690s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f126690s = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f126690s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f126689r;
        if (i13 == 0) {
            ue.c.H(obj);
            l lVar = new l(this.f126690s, null);
            this.f126689r = 1;
            obj = bs1.c.w2(3000L, lVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
