package v31;

import br1.e0;
import br1.f0;
import i2.o;
import i2.u;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class d extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123960i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f123961j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f123962k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f123963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f123964m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, q qVar, int i13, int i14, int i15) {
        super(2);
        this.f123960i = i15;
        this.f123964m = obj;
        this.f123961j = qVar;
        this.f123962k = i13;
        this.f123963l = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f123960i;
        q qVar = this.f123961j;
        int i15 = this.f123963l;
        int i16 = this.f123962k;
        Object obj = this.f123964m;
        switch (i14) {
            case 0:
                e.a((b) obj, qVar, oVar, u.p(i16 | 1), i15);
                break;
            case 1:
                u41.f.a((u41.e) obj, qVar, oVar, u.p(i16 | 1), i15);
                break;
            case 2:
                s0.f((jm1.b) obj, qVar, oVar, u.p(i16 | 1), i15);
                break;
            case 3:
                c0.d.a((ln1.d) obj, qVar, oVar, u.p(i16 | 1), i15);
                break;
            default:
                e0.m((f0) obj, qVar, oVar, u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f123960i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
