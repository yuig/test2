package dy0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56573i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xk2.w f56574j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f56575k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f56576l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f56577m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i13, xk2.w wVar, u2.q qVar, int i14, int i15) {
        super(2);
        this.f56573i = i13;
        this.f56574j = wVar;
        this.f56575k = qVar;
        this.f56576l = i14;
        this.f56577m = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f56576l | 1);
        u2.q qVar = this.f56575k;
        i0.d(this.f56573i, this.f56574j, qVar, (i2.o) obj, p13, this.f56577m);
        return Unit.f80348a;
    }
}
