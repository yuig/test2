package lb;

import android.content.Context;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f82697r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1 f82698s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kb.a0 f82699t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kb.s f82700u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, kb.a0 a0Var, kb.s sVar, bl2.c cVar) {
        super(2, cVar);
        this.f82698s = a1Var;
        this.f82699t = a0Var;
        this.f82700u = sVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new z0(this.f82698s, this.f82699t, this.f82700u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f82697r;
        a1 a1Var = this.f82698s;
        if (i13 == 0) {
            ue.c.H(obj);
            Context context = a1Var.f82559b;
            this.f82697r = 1;
            String str = ub.o.f121682a;
            tb.s sVar = a1Var.f82558a;
            if (!sVar.f117032q || Build.VERSION.SDK_INT >= 31) {
                obj2 = Unit.f80348a;
            } else {
                vb.a aVar2 = a1Var.f82562e.f125447d;
                Intrinsics.checkNotNullExpressionValue(aVar2, "taskExecutor.mainThreadExecutor");
                obj2 = kotlin.jvm.internal.j.M(this, dl2.b.o0(aVar2), new ub.n(this.f82699t, sVar, this.f82700u, context, null));
                if (obj2 != aVar) {
                    obj2 = Unit.f80348a;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 == 2) {
                    ue.c.H(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        String str2 = b1.f82583a;
        kb.b0.e().a(str2, "Starting work for " + a1Var.f82558a.f117018c);
        kb.a0 a0Var = this.f82699t;
        r4.l g13 = a0Var.g();
        Intrinsics.checkNotNullExpressionValue(g13, "worker.startWork()");
        this.f82697r = 2;
        obj = b1.a(g13, a0Var, this);
        return obj == aVar ? aVar : obj;
    }
}
