package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u50 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v50 f11838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u50(v50 v50Var, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f11838b = v50Var;
        this.f11839c = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u50(this.f11838b, this.f11839c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u50(this.f11838b, this.f11839c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11837a;
        if (i13 == 0) {
            ue.c.H(obj);
            a6.h hVar = this.f11838b.f12354d;
            t50 t50Var = new t50(this.f11839c, null);
            this.f11837a = 1;
            if (hVar.a(t50Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return null;
    }
}
