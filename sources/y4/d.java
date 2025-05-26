package y4;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.MotionButton;

/* loaded from: classes3.dex */
public final class d extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionButton f136877b;

    public /* synthetic */ d(MotionButton motionButton, int i13) {
        this.f136876a = i13;
        this.f136877b = motionButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i13 = this.f136876a;
        MotionButton motionButton = this.f136877b;
        switch (i13) {
            case 0:
                outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), (Math.min(r10, r11) * motionButton.f17604d) / 2.0f);
                break;
            default:
                outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), motionButton.f17605e);
                break;
        }
    }
}
