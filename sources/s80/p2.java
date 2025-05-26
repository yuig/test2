package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111744i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f111745j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n72.b f111746k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n72.m f111747l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t62.b f111748m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u2.q f111749n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f111750o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f111751p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f111752q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(j jVar, n72.b bVar, n72.m mVar, t62.b bVar2, u2.q qVar, Function1 function1, int i13, int i14, int i15) {
        super(2);
        this.f111744i = i15;
        this.f111745j = jVar;
        this.f111746k = bVar;
        this.f111747l = mVar;
        this.f111748m = bVar2;
        this.f111749n = qVar;
        this.f111750o = function1;
        this.f111751p = i13;
        this.f111752q = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f111744i;
        int i15 = this.f111751p;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                kh2.b0.e(this.f111745j, this.f111746k, this.f111747l, this.f111748m, this.f111749n, this.f111750o, oVar, p13, this.f111752q);
                break;
            case 1:
                int p14 = i2.u.p(i15 | 1);
                kh2.b0.f(this.f111745j, this.f111746k, this.f111747l, this.f111748m, this.f111749n, this.f111750o, oVar, p14, this.f111752q);
                break;
            default:
                int p15 = i2.u.p(i15 | 1);
                kh2.u2.e(this.f111745j, this.f111746k, this.f111747l, this.f111748m, this.f111749n, this.f111750o, oVar, p15, this.f111752q);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f111744i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
