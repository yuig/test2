package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127237r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t1.b f127238s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h4.f0 f127239t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l1 f127240u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r2 f127241v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h4.y f127242w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(t1.b bVar, h4.f0 f0Var, l1 l1Var, r2 r2Var, h4.y yVar, bl2.c cVar) {
        super(2, cVar);
        this.f127238s = bVar;
        this.f127239t = f0Var;
        this.f127240u = l1Var;
        this.f127241v = r2Var;
        this.f127242w = yVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f0(this.f127238s, this.f127239t, this.f127240u, this.f127241v, this.f127242w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        long a13;
        a3.d dVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127237r;
        if (i13 == 0) {
            ue.c.H(obj);
            x1 x1Var = this.f127240u.f127355a;
            b4.m0 m0Var = this.f127241v.f127471a;
            this.f127237r = 1;
            int b13 = this.f127242w.b(b4.p0.d(this.f127239t.f67560b));
            if (b13 < m0Var.f21615a.f21603a.f21571a.length()) {
                dVar = m0Var.b(b13);
            } else if (b13 != 0) {
                dVar = m0Var.b(b13 - 1);
            } else {
                a13 = b2.a(x1Var.f127568b, x1Var.f127573g, x1Var.f127574h, b2.f127170a, 1);
                dVar = new a3.d(0.0f, 0.0f, 1.0f, (int) (a13 & 4294967295L));
            }
            Object a14 = ((t1.d) this.f127238s).a(dVar, this);
            if (a14 != aVar) {
                a14 = Unit.f80348a;
            }
            if (a14 == aVar) {
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
