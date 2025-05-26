package ads_mobile_sdk;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class mu2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu2 f8396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f8397b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu2(nu2 nu2Var, Context context, bl2.c cVar) {
        super(2, cVar);
        this.f8396a = nu2Var;
        this.f8397b = context;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new mu2(this.f8396a, this.f8397b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new mu2(this.f8396a, this.f8397b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        nu2 nu2Var = this.f8396a;
        Context context = this.f8397b;
        int i13 = nu2.f8995p;
        return Boolean.valueOf(nu2Var.a(context));
    }
}
