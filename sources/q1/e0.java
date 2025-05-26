package q1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m1.m1;
import q3.f1;

/* loaded from: classes2.dex */
public final class e0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f101892r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f101893s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f101894t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, int i13, int i14, bl2.c cVar) {
        super(2, cVar);
        this.f101892r = h0Var;
        this.f101893s = i13;
        this.f101894t = i14;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e0(this.f101892r, this.f101893s, this.f101894t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((m1) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        h0 h0Var = this.f101892r;
        y yVar = h0Var.f101911d;
        int h10 = yVar.f102035a.h();
        int i13 = this.f101894t;
        int i14 = this.f101893s;
        if (h10 != i14 || yVar.f102036b.h() != i13) {
            h0Var.f101920m.e();
        }
        yVar.c(i14, i13);
        yVar.f102038d = null;
        f1 f1Var = h0Var.f101917j;
        if (f1Var != null) {
            ((s3.k0) f1Var).k();
        }
        return Unit.f80348a;
    }
}
