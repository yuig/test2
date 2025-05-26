package ads_mobile_sdk;

import a.w0;
import android.content.Context;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class y6 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f14094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f14095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n6 f14096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(w0 w0Var, Context context, n6 n6Var, bl2.c cVar) {
        super(2, cVar);
        this.f14094b = w0Var;
        this.f14095c = context;
        this.f14096d = n6Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y6(this.f14094b, this.f14095c, this.f14096d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y6) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14093a;
        if (i13 == 0) {
            ue.c.H(obj);
            w0 w0Var = this.f14094b;
            Context context = this.f14095c;
            n6 n6Var = this.f14096d;
            this.f14093a = 1;
            obj = w0Var.a(context, n6Var, this);
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
