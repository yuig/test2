package ads_mobile_sdk;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ai1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f2422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ci1 f2423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai1(ci1 ci1Var, ViewGroup viewGroup, bl2.c cVar) {
        super(2, cVar);
        this.f2423b = ci1Var;
        this.f2424c = viewGroup;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ai1(this.f2423b, this.f2424c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ai1(this.f2423b, this.f2424c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f2422a;
        if (i13 == 0) {
            ue.c.H(obj);
            ci1 ci1Var = this.f2423b;
            boolean z13 = this.f2424c != null;
            this.f2422a = 1;
            if1 if1Var = ci1Var.f3922c;
            if (if1Var.f6377j == null || if1Var.f6368a != 6) {
                obj2 = Unit.f80348a;
            } else {
                String l13 = ci1Var.f3926g.l();
                if (l13 == null || (obj2 = ci1Var.f3925f.a(l13, this, z13)) != aVar) {
                    obj2 = Unit.f80348a;
                }
            }
            if (obj2 == aVar) {
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
