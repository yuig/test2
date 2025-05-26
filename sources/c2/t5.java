package c2;

import a.cb;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class t5 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f25256i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f25257j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f25258k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f25259l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f25260m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f25261n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f25262o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f25263p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ q3.c1 f25264q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u5 f25265r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f25266s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f25267t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q3.r0 f25268u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(q3.c1 c1Var, int i13, int i14, int i15, int i16, q3.c1 c1Var2, q3.c1 c1Var3, q3.c1 c1Var4, q3.c1 c1Var5, u5 u5Var, int i17, int i18, q3.r0 r0Var) {
        super(1);
        this.f25256i = c1Var;
        this.f25257j = i13;
        this.f25258k = i14;
        this.f25259l = i15;
        this.f25260m = i16;
        this.f25261n = c1Var2;
        this.f25262o = c1Var3;
        this.f25263p = c1Var4;
        this.f25264q = c1Var5;
        this.f25265r = u5Var;
        this.f25266s = i17;
        this.f25267t = i18;
        this.f25268u = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        int c13;
        q3.b1 b1Var = (q3.b1) obj;
        q3.c1 c1Var = this.f25261n;
        q3.r0 r0Var = this.f25268u;
        q3.c1 c1Var2 = this.f25264q;
        q3.c1 c1Var3 = this.f25263p;
        q3.c1 c1Var4 = this.f25262o;
        int i14 = this.f25260m;
        int i15 = this.f25259l;
        u5 u5Var = this.f25265r;
        q3.c1 c1Var5 = this.f25256i;
        if (c1Var5 != null) {
            int i16 = this.f25257j - this.f25258k;
            if (i16 < 0) {
                i16 = 0;
            }
            boolean z13 = u5Var.f25292a;
            int i17 = this.f25266s + this.f25267t;
            float b13 = r0Var.b();
            float f13 = s5.f25220a;
            if (c1Var3 != null) {
                q3.b1.f(b1Var, c1Var3, 0, cb.b(1, 0.0f, (i14 - c1Var3.f102179b) / 2.0f));
            }
            if (c1Var2 != null) {
                q3.b1.f(b1Var, c1Var2, i15 - c1Var2.f102178a, cb.b(1, 0.0f, (i14 - c1Var2.f102179b) / 2.0f));
            }
            if (z13) {
                c13 = cb.b(1, 0.0f, (i14 - c1Var5.f102179b) / 2.0f);
            } else {
                c13 = ml2.c.c(q5.f25108b * b13);
            }
            q3.b1.f(b1Var, c1Var5, q5.e(c1Var3), c13 - ml2.c.c((c13 - i16) * u5Var.f25293b));
            q3.b1.f(b1Var, c1Var, q5.e(c1Var3), i17);
            if (c1Var4 != null) {
                q3.b1.f(b1Var, c1Var4, q5.e(c1Var3), i17);
            }
        } else {
            boolean z14 = u5Var.f25292a;
            float b14 = r0Var.b();
            float f14 = s5.f25220a;
            int c14 = ml2.c.c(u5Var.f25294c.d() * b14);
            if (c1Var3 != null) {
                q3.b1.f(b1Var, c1Var3, 0, cb.b(1, 0.0f, (i14 - c1Var3.f102179b) / 2.0f));
            }
            if (c1Var2 != null) {
                q3.b1.f(b1Var, c1Var2, i15 - c1Var2.f102178a, cb.b(1, 0.0f, (i14 - c1Var2.f102179b) / 2.0f));
            }
            if (z14) {
                i13 = cb.b(1, 0.0f, (i14 - c1Var.f102179b) / 2.0f);
            } else {
                i13 = c14;
            }
            q3.b1.f(b1Var, c1Var, q5.e(c1Var3), i13);
            if (c1Var4 != null) {
                if (z14) {
                    c14 = cb.b(1, 0.0f, (i14 - c1Var4.f102179b) / 2.0f);
                }
                q3.b1.f(b1Var, c1Var4, q5.e(c1Var3), c14);
            }
        }
        return Unit.f80348a;
    }
}
