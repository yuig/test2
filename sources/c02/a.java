package c02;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.y2;

/* loaded from: classes4.dex */
public final class a extends q7.s implements l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24435d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a() {
        /*
            r8 = this;
            r0 = 1
            r8.f24435d = r0
            android.view.animation.LinearInterpolator r6 = c02.i.f24439b
            r4 = 0
            r7 = 1
            r2 = 120(0x78, double:5.93E-322)
            r1 = r8
            r1.<init>(r2, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c02.a.<init>():void");
    }

    @Override // c02.l
    public final void d(y2 y2Var) {
        switch (this.f24435d) {
            case 0:
                View view = y2Var.f19717a;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                break;
            default:
                y2Var.f19717a.setAlpha(1.0f);
                break;
        }
    }

    @Override // c02.l
    public final ViewPropertyAnimator e(ViewPropertyAnimator viewPropertyAnimator) {
        switch (this.f24435d) {
            case 0:
                return viewPropertyAnimator.scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
            default:
                return viewPropertyAnimator.alpha(1.0f);
        }
    }

    @Override // c02.l
    public final void f(y2 y2Var) {
        switch (this.f24435d) {
            case 0:
                View view = y2Var.f19717a;
                view.setAlpha(0.0f);
                view.setScaleX(0.9f);
                view.setScaleY(0.9f);
                break;
            default:
                y2Var.f19717a.setAlpha(0.0f);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i13) {
        this(1000L, 200L);
        this.f24435d = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(long j13, long j14) {
        this(j13, j14, new AccelerateDecelerateInterpolator(), 0);
        this.f24435d = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(long j13, long j14, BaseInterpolator baseInterpolator, int i13) {
        super(j13, j14, baseInterpolator);
        this.f24435d = i13;
    }
}
