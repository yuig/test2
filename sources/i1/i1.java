package i1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f70791i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f70792j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f70793k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f70794l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(q3.c1 c1Var, long j13, long j14, a1 a1Var) {
        super(1);
        this.f70791i = c1Var;
        this.f70792j = j13;
        this.f70793k = j14;
        this.f70794l = a1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q3.b1 b1Var = (q3.b1) obj;
        long j13 = this.f70792j;
        long j14 = this.f70793k;
        b1Var.getClass();
        long a13 = d7.b.a(((int) (j13 >> 32)) + ((int) (j14 >> 32)), ((int) (j13 & 4294967295L)) + ((int) (j14 & 4294967295L)));
        q3.c1 c1Var = this.f70791i;
        q3.b1.c(b1Var, c1Var);
        c1Var.u0(n4.h.c(a13, c1Var.f102182e), 0.0f, this.f70794l);
        return Unit.f80348a;
    }
}
