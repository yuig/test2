package qp1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import x02.i2;

/* loaded from: classes5.dex */
public final class g0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f104781r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f104782s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0 f104783t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f104784u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u50.r f104785v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f104786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(l0 l0Var, String str, u50.r rVar, String str2, bl2.c cVar) {
        super(2, cVar);
        this.f104783t = l0Var;
        this.f104784u = str;
        this.f104785v = rVar;
        this.f104786w = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        g0 g0Var = new g0(this.f104783t, this.f104784u, this.f104785v, this.f104786w, cVar);
        g0Var.f104782s = obj;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f104781r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f104782s;
            i2 i2Var = this.f104783t.f104804b;
            String str = this.f104784u;
            do2.j0 j0Var2 = new do2.j0(ve.h.x(i2Var, str), new d0(this.f104785v, str, null, 0));
            f0 f0Var = new f0(this.f104786w, j0Var, this.f104783t, this.f104785v, this.f104784u);
            this.f104781r = 1;
            if (j0Var2.collect(f0Var, this) == aVar) {
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
