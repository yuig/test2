package m1;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f85503r;

    /* renamed from: s, reason: collision with root package name */
    public j1.o f85504s;

    /* renamed from: t, reason: collision with root package name */
    public int f85505t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f85506u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f85507v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m1 f85508w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(float f13, q qVar, m1 m1Var, bl2.c cVar) {
        super(2, cVar);
        this.f85506u = f13;
        this.f85507v = qVar;
        this.f85508w = m1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f85506u, this.f85507v, this.f85508w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        float f13;
        kotlin.jvm.internal.g0 g0Var;
        j1.o oVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85505t;
        if (i13 == 0) {
            ue.c.H(obj);
            f13 = this.f85506u;
            if (Math.abs(f13) > 1.0f) {
                g0Var = new kotlin.jvm.internal.g0();
                g0Var.f80425a = f13;
                kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
                j1.o b13 = j1.e.b(0.0f, f13);
                try {
                    q qVar = this.f85507v;
                    j1.a0 a0Var = qVar.f85522a;
                    k kVar = new k(g0Var2, this.f85508w, g0Var, qVar, 1);
                    this.f85503r = g0Var;
                    this.f85504s = b13;
                    this.f85505t = 1;
                    if (j1.e.f(b13, a0Var, false, kVar, this) == aVar) {
                        return aVar;
                    }
                } catch (CancellationException unused) {
                    oVar = b13;
                    g0Var.f80425a = ((Number) oVar.b()).floatValue();
                    f13 = g0Var.f80425a;
                    return new Float(f13);
                }
            }
            return new Float(f13);
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oVar = this.f85504s;
        g0Var = this.f85503r;
        try {
            ue.c.H(obj);
        } catch (CancellationException unused2) {
            g0Var.f80425a = ((Number) oVar.b()).floatValue();
            f13 = g0Var.f80425a;
            return new Float(f13);
        }
        f13 = g0Var.f80425a;
        return new Float(f13);
    }
}
