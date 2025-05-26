package br1;

import i1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23817i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f23818j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ vn1.g f23819k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f23820l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(f0 f0Var, vn1.g gVar, Function0 function0, int i13) {
        super(3);
        this.f23817i = i13;
        this.f23818j = f0Var;
        this.f23819k = gVar;
        this.f23820l = function0;
    }

    public final void b(m0 AnimatedVisibility, i2.o oVar) {
        am.d dVar = i2.n.f71185a;
        int i13 = this.f23817i;
        Function0 function0 = this.f23820l;
        f0 f0Var = this.f23818j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                i0 i0Var = f0Var.f23787h;
                i2.s sVar = (i2.s) oVar;
                sVar.W(-1889033418);
                boolean h10 = sVar.h(function0);
                Object J2 = sVar.J();
                if (h10 || J2 == dVar) {
                    J2 = new d6.e(3, function0);
                    sVar.g0(J2);
                }
                sVar.r(false);
                e0.g(i0Var, this.f23819k, null, (Function0) J2, sVar, 8, 4);
                break;
            default:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                i0 i0Var2 = f0Var.f23788i;
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(-1889021322);
                boolean h13 = sVar2.h(function0);
                Object J3 = sVar2.J();
                if (h13 || J3 == dVar) {
                    J3 = new d6.e(4, function0);
                    sVar2.g0(J3);
                }
                sVar2.r(false);
                e0.g(i0Var2, this.f23819k, null, (Function0) J3, sVar2, 8, 4);
                break;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f23817i) {
            case 0:
                ((Number) obj3).intValue();
                b((m0) obj, (i2.o) obj2);
                break;
            default:
                ((Number) obj3).intValue();
                b((m0) obj, (i2.o) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
