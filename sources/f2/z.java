package f2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class z extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f60947r;

    /* renamed from: s, reason: collision with root package name */
    public int f60948s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f60949t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, bl2.c cVar, int i13) {
        super(3, cVar);
        this.f60947r = i13;
        this.f60949t = obj;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f60947r;
        Object obj4 = this.f60949t;
        switch (i13) {
            case 0:
                ((Number) obj2).floatValue();
                return new z((e0) obj4, (bl2.c) obj3, 0).invokeSuspend(Unit.f80348a);
            default:
                return new z((Function1) obj4, (bl2.c) obj3, 1).invokeSuspend(Unit.f80348a);
        }
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f60947r;
        Object obj2 = this.f60949t;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                if (this.f60948s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                ((e0) obj2).f60845l.invoke();
                return Unit.f80348a;
            default:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                int i14 = this.f60948s;
                if (i14 == 0) {
                    ue.c.H(obj);
                    this.f60948s = 1;
                    if (((Function1) obj2).invoke(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
        }
    }
}
