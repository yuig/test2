package oy;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class y1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z1 f98245i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f98246j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f98247k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s92.o f98248l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, String str, long j13, s92.o oVar) {
        super(0);
        this.f98245i = z1Var;
        this.f98246j = str;
        this.f98247k = j13;
        this.f98248l = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z1 z1Var = this.f98245i;
        z1Var.getClass();
        o2 o2Var = new o2(this.f98248l, this.f98246j);
        o2Var.f60583a = this.f98247k;
        z1Var.o(o2Var);
        return Unit.f80348a;
    }
}
