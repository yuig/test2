package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f55958r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f55959s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f55960t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f55960t = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        u uVar = new u(this.f55960t, cVar);
        uVar.f55959s = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((co2.z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f55958r;
        if (i13 == 0) {
            ue.c.H(obj);
            t tVar = new t((co2.z) this.f55959s, 0);
            this.f55958r = 1;
            if (this.f55960t.collect(tVar, this) == aVar) {
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
