package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d3 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111495i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f111496j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f111497k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f111498l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f111499m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f111500n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f111501o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(j jVar, u2.q qVar, Function1 function1, Function1 function12, int i13, int i14, int i15) {
        super(2);
        this.f111495i = i15;
        this.f111496j = jVar;
        this.f111497k = qVar;
        this.f111498l = function1;
        this.f111499m = function12;
        this.f111500n = i13;
        this.f111501o = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f111495i;
        int i15 = this.f111500n;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                kh2.b0.k(this.f111496j, this.f111497k, this.f111498l, this.f111499m, oVar, p13, this.f111501o);
                break;
            default:
                int p14 = i2.u.p(i15 | 1);
                kh2.u2.g(this.f111496j, this.f111497k, this.f111498l, this.f111499m, oVar, p14, this.f111501o);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f111495i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
