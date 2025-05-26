package s80;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111790i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ do2.x1 f111791j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f111792k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(do2.x1 x1Var, i2.q1 q1Var, int i13) {
        super(1);
        this.f111790i = i13;
        this.f111791j = x1Var;
        this.f111792k = q1Var;
    }

    public final void b(MotionEvent it) {
        int i13 = this.f111790i;
        do2.x1 x1Var = this.f111791j;
        i2.q1 q1Var = this.f111792k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (((Boolean) q1Var.getValue()).booleanValue()) {
                    if (it.getPointerCount() == 1) {
                        x1Var.b(it);
                    }
                    if (it.getAction() == 1 || it.getAction() == 3) {
                        q1Var.setValue(Boolean.FALSE);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (((Boolean) q1Var.getValue()).booleanValue()) {
                    if (it.getPointerCount() == 1) {
                        x1Var.b(it);
                    }
                    if (it.getAction() == 1 || it.getAction() == 3) {
                        q1Var.setValue(Boolean.FALSE);
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f111790i) {
            case 0:
                b((MotionEvent) obj);
                break;
            default:
                b((MotionEvent) obj);
                break;
        }
        return Unit.f80348a;
    }
}
