package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a4 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f111462i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f111463j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f111464k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f111465l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(float f13, u2.q qVar, int i13, int i14) {
        super(2);
        this.f111462i = f13;
        this.f111463j = qVar;
        this.f111464k = i13;
        this.f111465l = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f111464k | 1);
        kh2.u2.k(this.f111462i, this.f111463j, (i2.o) obj, p13, this.f111465l);
        return Unit.f80348a;
    }
}
