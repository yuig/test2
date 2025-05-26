package wb0;

import i2.o;
import i2.u;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class h extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128990i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f128991j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f128992k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f128993l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f128994m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f128995n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, q qVar, i iVar, int i13, int i14, int i15) {
        super(2);
        this.f128990i = i15;
        this.f128991j = jVar;
        this.f128992k = qVar;
        this.f128993l = iVar;
        this.f128994m = i13;
        this.f128995n = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f128990i;
        int i15 = this.f128994m;
        switch (i14) {
            case 0:
                int p13 = u.p(i15 | 1);
                s0.b(this.f128991j, this.f128992k, this.f128993l, oVar, p13, this.f128995n);
                break;
            default:
                int p14 = u.p(i15 | 1);
                s0.c(this.f128991j, this.f128992k, this.f128993l, oVar, p14, this.f128995n);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f128990i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
