package w80;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128321i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s80.j f128322j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f128323k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u2.q f128324l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f128325m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f128326n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f128327o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f128328p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(s80.j jVar, u2.q qVar, u2.q qVar2, float f13, Function1 function1, int i13, int i14, int i15) {
        super(2);
        this.f128321i = i15;
        this.f128322j = jVar;
        this.f128323k = qVar;
        this.f128324l = qVar2;
        this.f128325m = f13;
        this.f128326n = function1;
        this.f128327o = i13;
        this.f128328p = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f128321i;
        int i15 = this.f128327o;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                el.a.e(this.f128322j, this.f128323k, this.f128324l, this.f128325m, this.f128326n, oVar, p13, this.f128328p);
                break;
            default:
                int p14 = i2.u.p(i15 | 1);
                el.a.f(this.f128322j, this.f128323k, this.f128324l, this.f128325m, this.f128326n, oVar, p14, this.f128328p);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f128321i) {
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
