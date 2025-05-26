package y4;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

/* loaded from: classes3.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageFilterButton f136866b;

    public /* synthetic */ a(ImageFilterButton imageFilterButton, int i13) {
        this.f136865a = i13;
        this.f136866b = imageFilterButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i13 = this.f136865a;
        ImageFilterButton imageFilterButton = this.f136866b;
        switch (i13) {
            case 0:
                outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), (Math.min(r10, r11) * imageFilterButton.f17565f) / 2.0f);
                break;
            default:
                outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), imageFilterButton.f17566g);
                break;
        }
    }
}
