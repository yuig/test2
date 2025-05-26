package ta0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f116876r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f116877s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f116878t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h0 f116879u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, u50.r rVar, h0 h0Var, bl2.c cVar) {
        super(2, cVar);
        this.f116877s = j0Var;
        this.f116878t = rVar;
        this.f116879u = h0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g0(this.f116877s, this.f116878t, this.f116879u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f116876r;
        h0 h0Var = this.f116879u;
        u50.r rVar = this.f116878t;
        try {
        } catch (Exception e13) {
            rVar.a(new y(qa0.f.collage_duplicate_failed));
            h0Var.f116882a.q(e13, "Failed to duplicate a collage", tb0.p.COLLAGES);
        }
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = this.f116877s;
            if (j0Var instanceof i0) {
                rVar.a(z.f116923a);
                f0 f0Var = h0Var.f116883b;
                String str = ((i0) j0Var).f116886a;
                this.f116876r = 1;
                if (f0Var.a(str, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f80348a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ue.c.H(obj);
        rVar.a(a0.f116848a);
        return Unit.f80348a;
    }
}
