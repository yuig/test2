package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f127396i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f127397j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b4.q0 f127398k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f127399l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f127400m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f127401n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f127402o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f127403p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b3.x f127404q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f127405r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f127406s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, u2.q qVar, b4.q0 q0Var, Function1 function1, int i13, boolean z13, int i14, int i15, b3.x xVar, int i16, int i17) {
        super(2);
        this.f127396i = str;
        this.f127397j = qVar;
        this.f127398k = q0Var;
        this.f127399l = function1;
        this.f127400m = i13;
        this.f127401n = z13;
        this.f127402o = i14;
        this.f127403p = i15;
        this.f127404q = xVar;
        this.f127405r = i16;
        this.f127406s = i17;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f127405r | 1);
        int i13 = this.f127403p;
        b3.x xVar = this.f127404q;
        g1.b(this.f127396i, this.f127397j, this.f127398k, this.f127399l, this.f127400m, this.f127401n, this.f127402o, i13, xVar, (i2.o) obj, p13, this.f127406s);
        return Unit.f80348a;
    }
}
