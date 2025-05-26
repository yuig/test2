package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f127717i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f127718j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f127719k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f127720l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u2.q f127721m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f127722n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f127723o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(float f13, float f14, m mVar, long j13, u2.q qVar, int i13, int i14) {
        super(2);
        this.f127717i = f13;
        this.f127718j = f14;
        this.f127719k = mVar;
        this.f127720l = j13;
        this.f127721m = qVar;
        this.f127722n = i13;
        this.f127723o = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f127722n | 1);
        long j13 = this.f127720l;
        u2.q qVar = this.f127721m;
        e1.b(this.f127717i, this.f127718j, this.f127719k, j13, qVar, (i2.o) obj, p13, this.f127723o);
        return Unit.f80348a;
    }
}
