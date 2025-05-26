package rq;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.Group;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;

/* loaded from: classes3.dex */
public final class s2 extends PinCloseupBaseModule {

    /* renamed from: a, reason: collision with root package name */
    public Group f109540a;

    /* renamed from: b, reason: collision with root package name */
    public Group f109541b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f109542c;

    /* renamed from: d, reason: collision with root package name */
    public View f109543d;

    /* renamed from: e, reason: collision with root package name */
    public AnimatorSet f109544e;

    public final void b() {
        if (this.f109544e != null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.4f, 1.0f);
        ofFloat.setDuration(900L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.4f);
        ofFloat2.setDuration(900L);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new r2(0));
        animatorSet.playSequentially(ofFloat2, ofFloat);
        animatorSet.start();
        this.f109544e = animatorSet;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        Group group;
        View.inflate(getContext(), n80.d.pin_closeup_related_feed_placeholder_layout, this);
        this.f109543d = findViewById(n80.c.placeholder_grid_container);
        this.f109540a = (Group) findViewById(n80.c.placeholder_shop_group);
        this.f109541b = (Group) findViewById(n80.c.placeholder_grid_group);
        if (!this.f109542c || (group = this.f109540a) == null) {
            return;
        }
        group.setVisibility(0);
    }

    public final void e() {
        setAlpha(1.0f);
        AnimatorSet animatorSet = this.f109544e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        clearAnimation();
        this.f109544e = null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_LOADING_GRID;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        if (bs1.c.o1(this)) {
            Group group = this.f109540a;
            if (group != null && bs1.c.o1(group)) {
                return true;
            }
            Group group2 = this.f109541b;
            if (group2 != null && bs1.c.o1(group2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z13) {
        super.onWindowFocusChanged(z13);
        if (z13) {
            return;
        }
        e();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldSendPinCardView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateActive(boolean z13) {
        super.updateActive(z13);
        if (z13) {
            b();
        } else {
            e();
        }
    }
}
