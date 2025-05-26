package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class f2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79489i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j2 f79490j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ii2.d f79491k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(j2 j2Var, ii2.d dVar, int i13) {
        super(0);
        this.f79489i = i13;
        this.f79490j = j2Var;
        this.f79491k = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79489i;
        j2 j2Var = this.f79490j;
        switch (i13) {
            case 0:
                kl2.o oVar = j2Var.f79561m;
                sg2.a b13 = ((m) j2Var.c()).b();
                l3 m13 = j2Var.m();
                t0 h10 = j2Var.h();
                return (x) oVar.g(j2Var.f79550b, j2Var.f79551c, b13, m13, this.f79491k, h10);
            default:
                return (h3) j2Var.f79554f.invoke(j2Var.d(), this.f79491k);
        }
    }
}
