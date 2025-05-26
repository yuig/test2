package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class db0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4218a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4220c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nm.u f4221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(nm.u uVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f4220c = str;
        this.f4221d = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        db0 db0Var = new db0(this.f4221d, this.f4220c, cVar);
        db0Var.f4219b = obj;
        return db0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((db0) create((sy0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f4218a;
        if (i13 == 0) {
            ue.c.H(obj);
            sy0 sy0Var = (sy0) this.f4219b;
            String str = this.f4220c;
            nm.u uVar = this.f4221d;
            this.f4218a = 1;
            if (sy0Var.a(uVar, str, this) == aVar) {
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
