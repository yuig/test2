package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a5 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24528i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f24529j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f24530k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f24531l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f24532m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24533n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f24534o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(long j13, u2.q qVar, float f13, Function2 function2, int i13, int i14) {
        super(2);
        this.f24529j = j13;
        this.f24530k = qVar;
        this.f24531l = f13;
        this.f24534o = function2;
        this.f24532m = i13;
        this.f24533n = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f24528i;
        int i15 = this.f24532m;
        Object obj = this.f24534o;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                ((b5) obj).a(this.f24530k, this.f24531l, this.f24529j, oVar, p13, this.f24533n);
                break;
            default:
                int p14 = i2.u.p(i15 | 1);
                long j13 = this.f24529j;
                int i16 = this.f24533n;
                kh2.j1.s(j13, this.f24530k, this.f24531l, (Function2) obj, oVar, p14, i16);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24528i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(b5 b5Var, u2.q qVar, float f13, long j13, int i13, int i14) {
        super(2);
        this.f24534o = b5Var;
        this.f24530k = qVar;
        this.f24531l = f13;
        this.f24529j = j13;
        this.f24532m = i13;
        this.f24533n = i14;
    }
}
