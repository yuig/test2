package z82;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141120r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f141121s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f141121s = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f141121s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141120r;
        j jVar = this.f141121s;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f141120r = 1;
            if (jVar.b(this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        this.f141120r = 2;
        if (jVar.a(this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
