package i1;

import i2.b2;
import i2.v3;
import j1.g2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f70749r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f70750s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g2 f70751t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v3 f70752u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g2 g2Var, v3 v3Var, bl2.c cVar) {
        super(2, cVar);
        this.f70751t = g2Var;
        this.f70752u = v3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e0 e0Var = new e0(this.f70751t, this.f70752u, cVar);
        e0Var.f70750s = obj;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((b2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f70749r;
        if (i13 == 0) {
            ue.c.H(obj);
            b2 b2Var = (b2) this.f70750s;
            g2 g2Var = this.f70751t;
            int i14 = 0;
            pb.k Z1 = bs1.c.Z1(new c0(g2Var, i14));
            d0 d0Var = new d0(b2Var, g2Var, this.f70752u, i14);
            this.f70749r = 1;
            if (Z1.collect(d0Var, this) == aVar) {
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
