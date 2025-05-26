package ia0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71964i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f71965j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f71966k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f71967l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f71968m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function0 f71969n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f71970o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f71971p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(q qVar, u2.q qVar2, float f13, long j13, Function0 function0, int i13, int i14, int i15) {
        super(2);
        this.f71964i = i15;
        this.f71965j = qVar;
        this.f71966k = qVar2;
        this.f71967l = f13;
        this.f71968m = j13;
        this.f71969n = function0;
        this.f71970o = i13;
        this.f71971p = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f71964i;
        int i15 = this.f71970o;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                l.c(this.f71965j, this.f71966k, this.f71967l, this.f71968m, this.f71969n, oVar, p13, this.f71971p);
                break;
            default:
                int p14 = i2.u.p(i15 | 1);
                z.b(this.f71965j, this.f71966k, this.f71967l, this.f71968m, this.f71969n, oVar, p14, this.f71971p);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f71964i) {
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
