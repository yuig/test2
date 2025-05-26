package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f127633i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f127634j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f127635k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f127636l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f127637m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f127638n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f127639o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f127640p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(float f13, float f14, long j13, long j14, float f15, float f16, float f17, float f18) {
        super(2);
        this.f127633i = f13;
        this.f127634j = f14;
        this.f127635k = j13;
        this.f127636l = j14;
        this.f127637m = f15;
        this.f127638n = f16;
        this.f127639o = f17;
        this.f127640p = f18;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        u2.n nVar = u2.n.f120041b;
        float f13 = this.f127633i;
        float f14 = this.f127634j;
        u2.q b13 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.k(nVar, f13, f14), this.f127635k, b3.s0.f21349a);
        i2.s sVar2 = (i2.s) oVar;
        sVar2.W(169245533);
        boolean e13 = sVar2.e(f13) | sVar2.g(this.f127636l) | sVar2.e(this.f127637m) | sVar2.e(f14) | sVar2.e(this.f127638n) | sVar2.e(this.f127639o) | sVar2.e(this.f127640p);
        Object J2 = sVar2.J();
        if (e13 || J2 == i2.n.f71185a) {
            J2 = new z0(this.f127636l, this.f127637m, this.f127633i, this.f127634j, this.f127638n, this.f127639o, this.f127640p);
            sVar2.g0(J2);
        }
        sVar2.r(false);
        androidx.compose.foundation.a.a(b13, (Function1) J2, sVar2, 0);
        return Unit.f80348a;
    }
}
