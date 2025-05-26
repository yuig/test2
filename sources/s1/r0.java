package s1;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110529i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f110530j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f110531k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(int i13, float f13, Function0 function0) {
        super(0);
        this.f110529i = i13;
        this.f110530j = f13;
        this.f110531k = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new e(this.f110529i, this.f110530j, this.f110531k);
    }
}
