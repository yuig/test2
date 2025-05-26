package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class rd1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vd1 f10589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f10590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd1(vd1 vd1Var, ym0 ym0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f10589b = vd1Var;
        this.f10590c = ym0Var;
        this.f10591d = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new rd1(this.f10589b, this.f10590c, this.f10591d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rd1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10588a;
        if (i13 == 0) {
            ue.c.H(obj);
            ub1 ub1Var = this.f10589b.f12456b;
            ym0 ym0Var = this.f10590c;
            String str = this.f10591d;
            this.f10588a = 1;
            ub1Var.getClass();
            if (ub1.a(ym0Var, str, "storePicture", this) == aVar) {
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
