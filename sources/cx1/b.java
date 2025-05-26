package cx1;

import ao2.j0;
import bl2.c;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o1.f;
import tu.d0;
import u50.r;
import vs.w;
import xk2.k;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f53382r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f53383s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f53384t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d0 d0Var, r rVar, c cVar) {
        super(2, cVar);
        this.f53383s = d0Var;
        this.f53384t = rVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new b(this.f53383s, this.f53384t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f53382r;
        if (i13 == 0) {
            ue.c.H(obj);
            d0 d0Var = this.f53383s;
            yw1.c cVar = (yw1.c) ((k) d0Var.f119285g).getValue();
            cVar.getClass();
            r rVar = this.f53384t;
            do2.j0 j0Var = new do2.j0(new pb.k(new yw1.a(cVar, null)), new w(8, rVar, null));
            f fVar = new f(19, d0Var, rVar);
            this.f53382r = 1;
            if (j0Var.collect(fVar, this) == aVar) {
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
