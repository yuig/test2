package tc0;

import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117313i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f117314j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f117315k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f117316l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f117317m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f117318n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f117319o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function0 f117320p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f117321q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f117322r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i13, Function1 function1, u2.q qVar, float f13, float f14, float f15, float f16, Function0 function0, int i14, int i15) {
        super(2);
        this.f117313i = i13;
        this.f117314j = function1;
        this.f117315k = qVar;
        this.f117316l = f13;
        this.f117317m = f14;
        this.f117318n = f15;
        this.f117319o = f16;
        this.f117320p = function0;
        this.f117321q = i14;
        this.f117322r = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f117321q | 1);
        float f13 = this.f117319o;
        Function0 function0 = this.f117320p;
        g3.e(this.f117313i, this.f117314j, this.f117315k, this.f117316l, this.f117317m, this.f117318n, f13, function0, (i2.o) obj, p13, this.f117322r);
        return Unit.f80348a;
    }
}
