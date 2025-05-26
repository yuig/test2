package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c5 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g5 f24582i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f24583j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f24584k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o1.k f24585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m1 f24586m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b3.x0 f24587n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f24588o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f24589p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f24590q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24591r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(g5 g5Var, boolean z13, boolean z14, o1.k kVar, m1 m1Var, b3.x0 x0Var, float f13, float f14, int i13, int i14) {
        super(2);
        this.f24582i = g5Var;
        this.f24583j = z13;
        this.f24584k = z14;
        this.f24585l = kVar;
        this.f24586m = m1Var;
        this.f24587n = x0Var;
        this.f24588o = f13;
        this.f24589p = f14;
        this.f24590q = i13;
        this.f24591r = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f24590q | 1);
        float f13 = this.f24588o;
        float f14 = this.f24589p;
        this.f24582i.a(this.f24583j, this.f24584k, this.f24585l, this.f24586m, this.f24587n, f13, f14, (i2.o) obj, p13, this.f24591r);
        return Unit.f80348a;
    }
}
