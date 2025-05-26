package wb0;

import i2.o;
import i2.u;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128973i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f128974j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f128975k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f128976l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f128977m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f128978n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(List list, float f13, q qVar, int i13, int i14, int i15) {
        super(2);
        this.f128973i = i15;
        this.f128974j = list;
        this.f128975k = f13;
        this.f128976l = qVar;
        this.f128977m = i13;
        this.f128978n = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f128973i;
        int i15 = this.f128977m;
        switch (i14) {
            case 0:
                int p13 = u.p(i15 | 1);
                f0.h.b(this.f128974j, this.f128975k, this.f128976l, oVar, p13, this.f128978n);
                break;
            default:
                int p14 = u.p(i15 | 1);
                oe.f.j(this.f128974j, this.f128975k, this.f128976l, oVar, p14, this.f128978n);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f128973i) {
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
