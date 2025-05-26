package s3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class o1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q1 f110852i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.p f110853j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m1 f110854k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f110855l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f110856m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f110857n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f110858o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(q1 q1Var, u2.p pVar, m1 m1Var, long j13, v vVar, boolean z13, boolean z14) {
        super(0);
        this.f110852i = q1Var;
        this.f110853j = pVar;
        this.f110854k = m1Var;
        this.f110855l = j13;
        this.f110856m = vVar;
        this.f110857n = z13;
        this.f110858o = z14;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13;
        switch (((vb0.i) this.f110854k).f125465a) {
            case 0:
                i13 = 16;
                break;
            default:
                i13 = 8;
                break;
        }
        this.f110852i.a1(kh2.r.h(this.f110853j, i13), this.f110854k, this.f110855l, this.f110856m, this.f110857n, this.f110858o);
        return Unit.f80348a;
    }
}
