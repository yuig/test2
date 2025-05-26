package ga0;

import i2.o;
import i2.u;
import kg.t;
import kh2.g3;
import kh2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class c extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ia0.b f64599j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f64600k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f64601l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f64602m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ia0.b bVar, q qVar, int i13, int i14, int i15) {
        super(2);
        this.f64598i = i15;
        this.f64599j = bVar;
        this.f64600k = qVar;
        this.f64601l = i13;
        this.f64602m = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f64598i;
        q qVar = this.f64600k;
        ia0.b bVar = this.f64599j;
        int i15 = this.f64602m;
        int i16 = this.f64601l;
        switch (i14) {
            case 0:
                j1.n(bVar, qVar, oVar, u.p(i16 | 1), i15);
                break;
            case 1:
                g3.i(bVar, qVar, oVar, u.p(i16 | 1), i15);
                break;
            default:
                t.b(bVar, qVar, oVar, u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f64598i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
