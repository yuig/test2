package w1;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class l2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127380i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p2 f127381j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(p2 p2Var, int i13) {
        super(0);
        this.f127380i = i13;
        this.f127381j = p2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f127380i;
        p2 p2Var = this.f127381j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(p2Var.f127443a.h() > 0.0f);
            default:
                return Boolean.valueOf(p2Var.f127443a.h() < p2Var.f127444b.h());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f127380i) {
        }
        return invoke();
    }
}
