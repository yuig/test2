package o91;

import ao2.j0;
import dl2.j;
import k22.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n91.t;
import nm.u;
import u50.r;
import uj2.b0;
import yk2.g;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93813r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f93814s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f93815t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t f93816u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, r rVar, t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f93814s = eVar;
        this.f93815t = rVar;
        this.f93816u = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f93814s, this.f93815t, this.f93816u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93813r;
        n91.e eVar = n91.e.f90041a;
        r rVar = this.f93815t;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                m mVar = this.f93814s.f93829a;
                t tVar = this.f93816u;
                g builder = new g();
                builder.putAll(tVar.f90069a);
                builder.put("otp", "");
                Unit unit = Unit.f80348a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                b0<tt1.a<u>> c13 = mVar.c("p", builder.c());
                this.f93813r = 1;
                if (kh2.j.p(c13, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            rVar.a(eVar);
        } catch (Exception e13) {
            if (r91.b.b(e13)) {
                rVar.a(eVar);
            } else {
                rVar.a(new n91.d(e13));
            }
        }
        return Unit.f80348a;
    }
}
