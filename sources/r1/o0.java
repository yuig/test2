package r1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m1.m1;
import q3.f1;

/* loaded from: classes2.dex */
public final class o0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f105949r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f105950s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f105951t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, int i13, int i14, bl2.c cVar) {
        super(2, cVar);
        this.f105949r = p0Var;
        this.f105950s = i13;
        this.f105951t = i14;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o0(this.f105949r, this.f105950s, this.f105951t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((m1) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        p0 p0Var = this.f105949r;
        f0 f0Var = p0Var.f105955b;
        int h10 = f0Var.f105888a.h();
        int i13 = this.f105951t;
        int i14 = this.f105950s;
        if (h10 != i14 || f0Var.f105889b.h() != i13) {
            p0Var.f105964k.e();
        }
        f0Var.b(i14, i13);
        f0Var.f105891d = null;
        f1 f1Var = p0Var.f105961h;
        if (f1Var != null) {
            ((s3.k0) f1Var).k();
        }
        return Unit.f80348a;
    }
}
