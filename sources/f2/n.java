package f2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f60875i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o1.l f60876j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f60877k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f60878l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f60879m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f60880n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f60881o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f60882p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, o1.l lVar, u2.q qVar, k kVar, boolean z13, long j13, int i13, int i14) {
        super(2);
        this.f60875i = sVar;
        this.f60876j = lVar;
        this.f60877k = qVar;
        this.f60878l = kVar;
        this.f60879m = z13;
        this.f60880n = j13;
        this.f60881o = i13;
        this.f60882p = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f60881o | 1);
        boolean z13 = this.f60879m;
        long j13 = this.f60880n;
        this.f60875i.a(this.f60876j, this.f60877k, this.f60878l, z13, j13, (i2.o) obj, p13, this.f60882p);
        return Unit.f80348a;
    }
}
