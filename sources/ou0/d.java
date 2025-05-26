package ou0;

import android.view.View;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinCreationSlider;

/* loaded from: classes5.dex */
public final class d implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationSlider f97703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97704b;

    public d(IdeaPinCreationSlider ideaPinCreationSlider, int i13) {
        this.f97703a = ideaPinCreationSlider;
        this.f97704b = i13;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        view.removeOnLayoutChangeListener(this);
        view.setTranslationX((((Number) this.f97703a.f46480c.getValue()).intValue() / 2) - this.f97704b);
    }
}
