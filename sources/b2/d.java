package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f21122i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f21123j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m4.h f21124k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f21125l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f21126m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u2.q f21127n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f21128o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f21129p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, boolean z13, m4.h hVar, boolean z14, long j13, u2.q qVar, int i13, int i14) {
        super(2);
        this.f21122i = lVar;
        this.f21123j = z13;
        this.f21124k = hVar;
        this.f21125l = z14;
        this.f21126m = j13;
        this.f21127n = qVar;
        this.f21128o = i13;
        this.f21129p = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f21128o | 1);
        long j13 = this.f21126m;
        u2.q qVar = this.f21127n;
        c0.d.c(this.f21122i, this.f21123j, this.f21124k, this.f21125l, j13, qVar, (i2.o) obj, p13, this.f21129p);
        return Unit.f80348a;
    }
}
