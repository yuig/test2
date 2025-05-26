package ra0;

import kh2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107029i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s1.o0 f107030j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f107031k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f107032l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f107033m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f107034n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f107035o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f107036p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f107037q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f107038r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(int i13, s1.o0 o0Var, u2.q qVar, long j13, float f13, float f14, float f15, float f16, int i14, int i15) {
        super(2);
        this.f107029i = i13;
        this.f107030j = o0Var;
        this.f107031k = qVar;
        this.f107032l = j13;
        this.f107033m = f13;
        this.f107034n = f14;
        this.f107035o = f15;
        this.f107036p = f16;
        this.f107037q = i14;
        this.f107038r = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f107037q | 1);
        float f13 = this.f107035o;
        float f14 = this.f107036p;
        j1.l(this.f107029i, this.f107030j, this.f107031k, this.f107032l, this.f107033m, this.f107034n, f13, f14, (i2.o) obj, p13, this.f107038r);
        return Unit.f80348a;
    }
}
