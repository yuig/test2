package androidx.appcompat.app;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* loaded from: classes2.dex */
public final class k0 extends ContentFrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0 f16059i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, m.e eVar) {
        super(eVar, null);
        this.f16059i = n0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f16059i.z(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x13 = (int) motionEvent.getX();
            int y13 = (int) motionEvent.getY();
            if (x13 < -5 || y13 < -5 || x13 > getWidth() + 5 || y13 > getHeight() + 5) {
                n0 n0Var = this.f16059i;
                n0Var.x(n0Var.G(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i13) {
        setBackgroundDrawable(com.bumptech.glide.c.I(getContext(), i13));
    }
}
