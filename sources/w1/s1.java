package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class s1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127494i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y1 f127495j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(y1 y1Var, int i13) {
        super(0);
        this.f127494i = i13;
        this.f127495j = y1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        y1 y1Var = this.f127495j;
        int i13 = this.f127494i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        y1Var.b();
                        break;
                    default:
                        y1Var.onCancel();
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        y1Var.b();
                        break;
                    default:
                        y1Var.onCancel();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
