package om0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0 f96507i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f96508j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0 f96509k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f96510l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f96511m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f96512n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f96513o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f96514p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f96515q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(c0 c0Var, u2.q qVar, f0 f0Var, float f13, float f14, float f15, Function1 function1, int i13, int i14) {
        super(2);
        this.f96507i = c0Var;
        this.f96508j = qVar;
        this.f96509k = f0Var;
        this.f96510l = f13;
        this.f96511m = f14;
        this.f96512n = f15;
        this.f96513o = function1;
        this.f96514p = i13;
        this.f96515q = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f96514p | 1);
        Function1 function1 = this.f96513o;
        o1.b(this.f96507i, this.f96508j, this.f96509k, this.f96510l, this.f96511m, this.f96512n, function1, (i2.o) obj, p13, this.f96515q);
        return Unit.f80348a;
    }
}
