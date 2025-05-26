package e;

import androidx.activity.x;
import i2.q1;
import i2.v3;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class h extends x {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v3 f56686p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z13, q1 q1Var) {
        super(z13);
        this.f56686p = q1Var;
    }

    @Override // androidx.activity.x
    public final void handleOnBackPressed() {
        ((Function0) this.f56686p.getValue()).invoke();
    }
}
