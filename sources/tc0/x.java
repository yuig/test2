package tc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117349i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f117350j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f117351k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f117352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f117353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u2.q f117354n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f117355o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f117356p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f117357q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i13, String str, Function1 function1, int i14, String str2, u2.q qVar, Function1 function12, int i15, int i16) {
        super(2);
        this.f117349i = i13;
        this.f117350j = str;
        this.f117351k = function1;
        this.f117352l = i14;
        this.f117353m = str2;
        this.f117354n = qVar;
        this.f117355o = function12;
        this.f117356p = i15;
        this.f117357q = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f117356p | 1);
        u2.q qVar = this.f117354n;
        Function1 function1 = this.f117355o;
        kh2.j.i(this.f117349i, this.f117350j, this.f117351k, this.f117352l, this.f117353m, qVar, function1, (i2.o) obj, p13, this.f117357q);
        return Unit.f80348a;
    }
}
