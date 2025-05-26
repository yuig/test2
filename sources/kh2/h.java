package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79513i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b1 f79514j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(b1 b1Var, int i13) {
        super(0);
        this.f79513i = i13;
        this.f79514j = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79513i;
        b1 b1Var = this.f79514j;
        switch (i13) {
            case 0:
                return new pf2.f(((d1) b1Var).f79455a);
            default:
                return new yh2.a(((d1) b1Var).f79456b);
        }
    }
}
