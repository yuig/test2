package i1;

import j1.g2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70815i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f70816j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70817k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f70818l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f70819m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f70820n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f70821o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f70822p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i13, int i14) {
        super(2);
        this.f70815i = i14;
        this.f70817k = obj;
        this.f70818l = obj2;
        this.f70819m = obj3;
        this.f70820n = obj4;
        this.f70821o = obj5;
        this.f70822p = obj6;
        this.f70816j = i13;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f70815i;
        int i15 = this.f70816j;
        Object obj = this.f70817k;
        switch (i14) {
            case 0:
                b7.c.d((g2) obj, (Function1) this.f70818l, (u2.q) this.f70819m, (n1) this.f70820n, (o1) this.f70821o, (kl2.l) this.f70822p, oVar, i2.u.p(i15 | 1));
                break;
            default:
                int p13 = i2.u.p(i15) | 1;
                ((q2.h) obj).i(this.f70818l, this.f70819m, this.f70820n, this.f70821o, this.f70822p, oVar, p13);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f70815i) {
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
