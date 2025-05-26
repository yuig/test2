package do2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f55882r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f55883s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f55884t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x1 f55885u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f55886v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(i iVar, x1 x1Var, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f55884t = iVar;
        this.f55885u = x1Var;
        this.f55886v = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        o1 o1Var = new o1(this.f55884t, this.f55885u, this.f55886v, cVar);
        o1Var.f55883s = obj;
        return o1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o1) create((i2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f55882r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = n1.f55868a[((i2) this.f55883s).ordinal()];
            x1 x1Var = this.f55885u;
            if (i14 == 1) {
                this.f55882r = 1;
                if (this.f55884t.collect(x1Var, this) == aVar) {
                    return aVar;
                }
            } else if (i14 != 2) {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fi.b bVar = g2.f55806a;
                Object obj2 = this.f55886v;
                if (obj2 == bVar) {
                    x1Var.l();
                } else {
                    x1Var.b(obj2);
                }
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
