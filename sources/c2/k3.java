package c2;

import a.cb;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class k3 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24883i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f24884j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f24885k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f24886l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f24887m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f24888n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f24889o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f24890p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l3 f24891q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q3.r0 f24892r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(int i13, int i14, q3.c1 c1Var, q3.c1 c1Var2, q3.c1 c1Var3, q3.c1 c1Var4, q3.c1 c1Var5, q3.c1 c1Var6, l3 l3Var, q3.r0 r0Var) {
        super(1);
        this.f24883i = i13;
        this.f24884j = i14;
        this.f24885k = c1Var;
        this.f24886l = c1Var2;
        this.f24887m = c1Var3;
        this.f24888n = c1Var4;
        this.f24889o = c1Var5;
        this.f24890p = c1Var6;
        this.f24891q = l3Var;
        this.f24892r = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        int i14;
        float e13;
        q3.b1 b1Var = (q3.b1) obj;
        l3 l3Var = this.f24891q;
        float f13 = l3Var.f24924c;
        q3.r0 r0Var = this.f24892r;
        float b13 = r0Var.b();
        n4.k layoutDirection = r0Var.getLayoutDirection();
        float f14 = j3.f24856a;
        p1.x0 x0Var = l3Var.f24925d;
        int c13 = ml2.c.c(x0Var.d() * b13);
        int c14 = ml2.c.c(androidx.compose.foundation.layout.b.f(x0Var, layoutDirection) * b13);
        float f15 = q5.f25109c * b13;
        int i15 = this.f24883i;
        q3.c1 c1Var = this.f24885k;
        if (c1Var != null) {
            q3.b1.f(b1Var, c1Var, 0, cb.b(1, 0.0f, (i15 - c1Var.f102179b) / 2.0f));
        }
        q3.c1 c1Var2 = this.f24886l;
        if (c1Var2 != null) {
            q3.b1.f(b1Var, c1Var2, this.f24884j - c1Var2.f102178a, cb.b(1, 0.0f, (i15 - c1Var2.f102179b) / 2.0f));
        }
        boolean z13 = l3Var.f24923b;
        q3.c1 c1Var3 = this.f24888n;
        if (c1Var3 != null) {
            if (z13) {
                i14 = cb.b(1, 0.0f, (i15 - c1Var3.f102179b) / 2.0f);
            } else {
                i14 = c13;
            }
            int V = tb.f.V(i14, f13, -(c1Var3.f102179b / 2));
            if (c1Var == null) {
                e13 = 0.0f;
            } else {
                e13 = (1 - f13) * (q5.e(c1Var) - f15);
            }
            q3.b1.f(b1Var, c1Var3, ml2.c.c(e13) + c14, V);
        }
        q3.c1 c1Var4 = this.f24887m;
        if (z13) {
            i13 = cb.b(1, 0.0f, (i15 - c1Var4.f102179b) / 2.0f);
        } else {
            i13 = c13;
        }
        q3.b1.f(b1Var, c1Var4, q5.e(c1Var), Math.max(i13, q5.d(c1Var3) / 2));
        q3.c1 c1Var5 = this.f24889o;
        if (c1Var5 != null) {
            if (z13) {
                c13 = cb.b(1, 0.0f, (i15 - c1Var5.f102179b) / 2.0f);
            }
            q3.b1.f(b1Var, c1Var5, q5.e(c1Var), Math.max(c13, q5.d(c1Var3) / 2));
        }
        q3.b1.e(b1Var, this.f24890p, 0L);
        return Unit.f80348a;
    }
}
