package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class zz extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a00 f14989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14990c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(a00 a00Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f14989b = a00Var;
        this.f14990c = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new zz(this.f14989b, this.f14990c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new zz(this.f14989b, this.f14990c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14988a;
        if (i13 == 0) {
            ue.c.H(obj);
            a00 a00Var = this.f14989b;
            String str = this.f14990c;
            this.f14988a = 1;
            if (a00.a(a00Var, str, this) == aVar) {
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
