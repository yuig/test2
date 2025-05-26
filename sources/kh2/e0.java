package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79465i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l3 f79466j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f79467k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(l3 l3Var, b1 b1Var, int i13) {
        super(0);
        this.f79465i = i13;
        this.f79466j = l3Var;
        this.f79467k = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79465i;
        b1 b1Var = this.f79467k;
        l3 l3Var = this.f79466j;
        switch (i13) {
            case 0:
                return new tf2.b(((m3) l3Var).a(ki2.g.f79814f), ((d1) b1Var).f79456b);
            default:
                return new zh2.a(((m3) l3Var).a(ki2.g.f79815g), ((d1) b1Var).f79456b);
        }
    }
}
