package y4;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterView;

/* loaded from: classes3.dex */
public final class b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageFilterView f136868b;

    public /* synthetic */ b(ImageFilterView imageFilterView, int i13) {
        this.f136867a = i13;
        this.f136868b = imageFilterView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i13 = this.f136867a;
        ImageFilterView imageFilterView = this.f136868b;
        switch (i13) {
            case 0:
                outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), (Math.min(r10, r11) * imageFilterView.f17582e) / 2.0f);
                break;
            default:
                outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), imageFilterView.f17583f);
                break;
        }
    }
}
