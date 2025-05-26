package t3;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116284i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f116285j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(c0 c0Var, int i13) {
        super(0);
        this.f116284i = i13;
        this.f116285j = c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        int i13 = this.f116284i;
        c0 c0Var = this.f116285j;
        switch (i13) {
            case 0:
                MotionEvent motionEvent = c0Var.f115894m0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c0Var.f115896n0 = SystemClock.uptimeMillis();
                    c0Var.post(c0Var.f115902q0);
                }
                return Unit.f80348a;
            default:
                return (n) c0Var.R.getValue();
        }
    }
}
