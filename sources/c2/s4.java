package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s4 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f25208i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f25209j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f25210k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b3.x0 f25211l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f25212m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f25213n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k1.y f25214o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f25215p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o1.l f25216q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function2 f25217r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f25218s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f25219t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(Function0 function0, u2.q qVar, boolean z13, b3.x0 x0Var, long j13, long j14, k1.y yVar, float f13, o1.l lVar, Function2 function2, int i13, int i14) {
        super(2);
        this.f25208i = function0;
        this.f25209j = qVar;
        this.f25210k = z13;
        this.f25211l = x0Var;
        this.f25212m = j13;
        this.f25213n = j14;
        this.f25214o = yVar;
        this.f25215p = f13;
        this.f25216q = lVar;
        this.f25217r = function2;
        this.f25218s = i13;
        this.f25219t = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f25218s | 1);
        o1.l lVar = this.f25216q;
        Function2 function2 = this.f25217r;
        j1.i(this.f25208i, this.f25209j, this.f25210k, this.f25211l, this.f25212m, this.f25213n, this.f25214o, this.f25215p, lVar, function2, (i2.o) obj, p13, this.f25219t);
        return Unit.f80348a;
    }
}
