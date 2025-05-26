package t3;

import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116177i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v0 f116178j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(v0 v0Var, int i13) {
        super(1);
        this.f116177i = i13;
        this.f116178j = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f116177i;
        v0 v0Var = this.f116178j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(v0Var.f116211d.getParent().requestSendAccessibilityEvent(v0Var.f116211d, (AccessibilityEvent) obj));
            default:
                o3 o3Var = (o3) obj;
                v0Var.getClass();
                if (o3Var.X()) {
                    v0Var.f116211d.A.b(o3Var, v0Var.M, new k1.v0(15, o3Var, v0Var));
                }
                return Unit.f80348a;
        }
    }
}
