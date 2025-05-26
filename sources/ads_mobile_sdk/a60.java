package ads_mobile_sdk;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a60 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t60 f2281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wi.g f2282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(t60 t60Var, wi.g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f2281b = t60Var;
        this.f2282c = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a60(this.f2281b, this.f2282c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a60(this.f2281b, this.f2282c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f2280a;
        if (i13 == 0) {
            ue.c.H(obj);
            t60 t60Var = this.f2281b;
            String str = this.f2282c.f129941a;
            this.f2280a = 1;
            if (t60.a(t60Var, true, str, (Activity) null, false, (bl2.c) this, 12) == aVar) {
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
