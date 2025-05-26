package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class bg extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eg f2870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gf f2871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(eg egVar, gf gfVar, bl2.c cVar) {
        super(2, cVar);
        this.f2870b = egVar;
        this.f2871c = gfVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new bg(this.f2870b, this.f2871c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bg(this.f2870b, this.f2871c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f2869a;
        if (i13 == 0) {
            ue.c.H(obj);
            jf jfVar = this.f2870b.f4845b;
            gf gfVar = this.f2871c;
            this.f2869a = 1;
            Object a13 = ((a6.h) jfVar.f6774a.get()).a(new Cif(gfVar, null), this);
            if (a13 != aVar) {
                a13 = Unit.f80348a;
            }
            if (a13 == aVar) {
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
