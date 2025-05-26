package sa0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r72.n1;

/* loaded from: classes5.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f112196r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u50.r f112197s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f112198t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f0 f112199u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u50.r rVar, y yVar, f0 f0Var, bl2.c cVar) {
        super(2, cVar);
        this.f112197s = rVar;
        this.f112198t = yVar;
        this.f112199u = f0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x(this.f112197s, this.f112198t, this.f112199u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f112196r;
        u50.r rVar = this.f112197s;
        if (i13 == 0) {
            ue.c.H(obj);
            rVar.a(v.f112195a);
            t72.j jVar = this.f112198t.f112200a;
            e0 e0Var = (e0) this.f112199u;
            String value = e0Var.f112164a;
            Intrinsics.checkNotNullParameter(value, "value");
            r72.a aVar2 = e0Var.f112165b;
            this.f112196r = 1;
            obj = jVar.n(value, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        n72.k kVar = (n72.k) obj;
        if (kVar instanceof n72.i) {
            rVar.a(new t());
            return Unit.f80348a;
        }
        Intrinsics.g(kVar, "null cannot be cast to non-null type com.pinterest.shuffles.domain.Result.Success<kotlin.String>");
        String value2 = (String) ((n72.j) kVar).f89728a;
        int i14 = n1.f106581a;
        Intrinsics.checkNotNullParameter(value2, "value");
        rVar.a(new u(value2));
        return Unit.f80348a;
    }
}
