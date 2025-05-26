package nl0;

import com.pinterest.api.model.e8;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tu.d0;
import u50.r;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public int f91254r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f91255s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e8 f91256t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f91257u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d0 d0Var, e8 e8Var, r rVar, bl2.c cVar) {
        super(1, cVar);
        this.f91255s = d0Var;
        this.f91256t = e8Var;
        this.f91257u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new g(this.f91255s, this.f91256t, this.f91257u, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g) create((bl2.c) obj)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f91254r;
        if (i13 == 0) {
            ue.c.H(obj);
            e8 e8Var = this.f91256t;
            String l13 = e8Var.l();
            Intrinsics.checkNotNullExpressionValue(l13, "getRootPinId(...)");
            d0 d0Var = this.f91255s;
            r rVar = this.f91257u;
            e eVar = new e(d0Var, e8Var, rVar, null);
            f fVar = new f(d0Var, e8Var, rVar, null);
            this.f91254r = 1;
            if (d0.j(d0Var, l13, eVar, fVar, this) == aVar) {
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
