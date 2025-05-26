package ads_mobile_sdk;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k60 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t60 f7137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(t60 t60Var, bl2.c cVar) {
        super(2, cVar);
        this.f7137b = t60Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k60(this.f7137b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k60(this.f7137b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7136a;
        if (i13 == 0) {
            ue.c.H(obj);
            t60 t60Var = this.f7137b;
            this.f7136a = 1;
            Uri uri = t60.f11407q;
            if (t60Var.d(this) == aVar) {
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
