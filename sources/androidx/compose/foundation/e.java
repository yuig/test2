package androidx.compose.foundation;

import i2.o;
import k1.t2;
import kl2.l;
import kotlin.jvm.internal.s;
import m1.c1;
import m1.f1;
import u2.q;

/* loaded from: classes.dex */
public final class e extends s implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t2 f17121i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f17122j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c1 f17123k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f17124l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f17125m = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t2 t2Var, boolean z13, c1 c1Var, boolean z14) {
        super(3);
        this.f17121i = t2Var;
        this.f17122j = z13;
        this.f17123k = c1Var;
        this.f17124l = z14;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        i2.s sVar = (i2.s) ((o) obj2);
        sVar.W(1478351300);
        t2 t2Var = this.f17121i;
        boolean z13 = this.f17122j;
        c1 c1Var = this.f17123k;
        boolean z14 = this.f17124l;
        boolean z15 = this.f17125m;
        q j13 = bs1.c.O1(new ScrollSemanticsElement(t2Var, z13, c1Var, z14, z15), t2Var, z15 ? f1.Vertical : f1.Horizontal, z14, z13, c1Var, t2Var.f78029c, null, sVar, 64).j(new ScrollingLayoutElement(this.f17121i, this.f17122j, this.f17125m));
        sVar.r(false);
        return j13;
    }
}
