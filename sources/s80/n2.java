package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class n2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f111685i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f111686j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f111687k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f111688l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(i iVar, long j13, Function1 function1, int i13) {
        super(2);
        this.f111685i = iVar;
        this.f111686j = j13;
        this.f111687k = function1;
        this.f111688l = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f111688l | 1);
        long j13 = this.f111686j;
        Function1 function1 = this.f111687k;
        kh2.b0.b(this.f111685i, j13, function1, (i2.o) obj, p13);
        return Unit.f80348a;
    }
}
