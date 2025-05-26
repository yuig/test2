package ads_mobile_sdk;

import android.app.Activity;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h60 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t60 f5862b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h60(t60 t60Var, bl2.c cVar) {
        super(2, cVar);
        this.f5862b = t60Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h60(this.f5862b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h60(this.f5862b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5861a;
        if (i13 == 0) {
            ue.c.H(obj);
            t60 t60Var = this.f5862b;
            this.f5861a = 1;
            Uri uri = t60.f11407q;
            if (t60Var.a((Activity) null, this) == aVar) {
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
