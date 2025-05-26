package ou0;

import android.view.View;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinCreationSlider;

/* loaded from: classes5.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationSlider f97700a;

    public a(IdeaPinCreationSlider ideaPinCreationSlider) {
        this.f97700a = ideaPinCreationSlider;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        view.removeOnLayoutChangeListener(this);
        view.setTranslationY(IdeaPinCreationSlider.L(this.f97700a));
    }
}
