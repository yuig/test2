package y4;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.MotionLabel;

/* loaded from: classes3.dex */
public final class e extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionLabel f136879b;

    public /* synthetic */ e(MotionLabel motionLabel, int i13) {
        this.f136878a = i13;
        this.f136879b = motionLabel;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i13 = this.f136878a;
        MotionLabel motionLabel = this.f136879b;
        switch (i13) {
            case 0:
                outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), (Math.min(r10, r11) * motionLabel.f17615f) / 2.0f);
                break;
            default:
                outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), motionLabel.f17616g);
                break;
        }
    }
}
