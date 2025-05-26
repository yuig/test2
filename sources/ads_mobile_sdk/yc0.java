package ads_mobile_sdk;

import android.os.Bundle;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class yc0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ad0 f14190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f14191c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(ad0 ad0Var, Bundle bundle, String str, bl2.c cVar) {
        super(2, cVar);
        this.f14190b = ad0Var;
        this.f14191c = bundle;
        this.f14192d = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new yc0(this.f14190b, this.f14191c, this.f14192d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yc0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14189a;
        if (i13 == 0) {
            ue.c.H(obj);
            fd0 fd0Var = this.f14190b.f2360b;
            cd0 cd0Var = cd0.f3867d;
            Bundle bundle = this.f14191c;
            String str = this.f14192d;
            this.f14189a = 1;
            fd0Var.getClass();
            if (fd0.a(fd0Var, cd0Var, bundle, str) == aVar) {
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
