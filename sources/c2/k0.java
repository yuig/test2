package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f24873i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f24874j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f24875k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f24876l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Function2 function2, Function2 function22, float f13, int i13) {
        super(2);
        this.f24873i = function2;
        this.f24874j = function22;
        this.f24875k = f13;
        this.f24876l = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f24876l | 1);
        Function2 function2 = this.f24874j;
        float f13 = this.f24875k;
        o0.e(this.f24873i, function2, f13, (i2.o) obj, p13);
        return Unit.f80348a;
    }
}
