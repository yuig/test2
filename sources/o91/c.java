package o91;

import ao2.j0;
import dl2.j;
import k22.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n91.i;
import n91.u;
import u50.r;
import uj2.b0;
import yk2.g;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93821r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f93822s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f93823t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u f93824u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, r rVar, u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f93822s = eVar;
        this.f93823t = rVar;
        this.f93824u = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f93822s, this.f93823t, this.f93824u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93821r;
        r rVar = this.f93823t;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                m mVar = this.f93822s.f93829a;
                u uVar = this.f93824u;
                g builder = new g();
                builder.putAll(uVar.f90070a);
                builder.put("otp", uVar.f90071b);
                Unit unit = Unit.f80348a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                b0<tt1.a<nm.u>> c13 = mVar.c("p", builder.c());
                this.f93821r = 1;
                if (kh2.j.p(c13, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            rVar.a(i.f90045a);
        } catch (Exception e13) {
            rVar.a(new n91.g(e13));
        }
        return Unit.f80348a;
    }
}
