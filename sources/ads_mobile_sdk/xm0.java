package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class xm0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym0 f13724b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm0(ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f13724b = ym0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new xm0(this.f13724b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new xm0(this.f13724b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f13723a;
        if (i13 == 0) {
            ue.c.H(obj);
            dz dzVar = this.f13724b.f14318d;
            if (dzVar == null) {
                return null;
            }
            this.f13723a = 1;
            obj = dzVar.a("native:view_create", this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return (cr2) obj;
    }
}
