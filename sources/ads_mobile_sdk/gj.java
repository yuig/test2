package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class gj extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jj f5582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py2 f5583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(jj jjVar, py2 py2Var, bl2.c cVar) {
        super(2, cVar);
        this.f5582b = jjVar;
        this.f5583c = py2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new gj(this.f5582b, this.f5583c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new gj(this.f5582b, this.f5583c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5581a;
        if (i13 == 0) {
            ue.c.H(obj);
            jj jjVar = this.f5582b;
            py2 py2Var = this.f5583c;
            this.f5581a = 1;
            if (jj.a(jjVar, py2Var, this) == aVar) {
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
