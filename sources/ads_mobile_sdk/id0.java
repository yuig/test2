package ads_mobile_sdk;

import android.os.Bundle;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class id0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kd0 f6330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cd0 f6331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f6332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id0(kd0 kd0Var, cd0 cd0Var, Bundle bundle, String str, bl2.c cVar) {
        super(2, cVar);
        this.f6330b = kd0Var;
        this.f6331c = cd0Var;
        this.f6332d = bundle;
        this.f6333e = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new id0(this.f6330b, this.f6331c, this.f6332d, this.f6333e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((id0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f6329a;
        if (i13 == 0) {
            ue.c.H(obj);
            fd0 fd0Var = this.f6330b.f7232a;
            cd0 cd0Var = this.f6331c;
            Bundle bundle = this.f6332d;
            String str = this.f6333e;
            this.f6329a = 1;
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
