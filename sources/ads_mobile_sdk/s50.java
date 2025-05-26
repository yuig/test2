package ads_mobile_sdk;

import do2.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes2.dex */
public final class s50 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v50 f10952b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(v50 v50Var, bl2.c cVar) {
        super(2, cVar);
        this.f10952b = v50Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s50(this.f10952b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new s50(this.f10952b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10951a;
        if (i13 == 0) {
            ue.c.H(obj);
            i data = this.f10952b.f12354d.getData();
            this.f10951a = 1;
            obj = l0.f0(data, this);
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
