package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.q f24789i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f24790j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f24791k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f24792l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kl2.l f24793m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24794n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f24795o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(u2.q qVar, long j13, long j14, float f13, kl2.l lVar, int i13, int i14) {
        super(2);
        this.f24789i = qVar;
        this.f24790j = j13;
        this.f24791k = j14;
        this.f24792l = f13;
        this.f24793m = lVar;
        this.f24794n = i13;
        this.f24795o = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f24794n | 1);
        float f13 = this.f24792l;
        kl2.l lVar = this.f24793m;
        o0.a(this.f24789i, this.f24790j, this.f24791k, f13, lVar, (i2.o) obj, p13, this.f24795o);
        return Unit.f80348a;
    }
}
