package ou0;

import android.widget.ImageView;
import android.widget.SeekBar;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinCreationSlider;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import com.pinterest.gestalt.text.GestaltText;
import pk.a0;

/* loaded from: classes5.dex */
public final class b implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationSlider f97701a;

    public b(IdeaPinCreationSlider ideaPinCreationSlider) {
        this.f97701a = ideaPinCreationSlider;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i13, boolean z13) {
        int i14 = i13 + 1;
        IdeaPinCreationSlider ideaPinCreationSlider = this.f97701a;
        a0.p(ideaPinCreationSlider.f46479b, String.valueOf(i14));
        GestaltText gestaltText = ideaPinCreationSlider.f46479b;
        a0.w1(gestaltText);
        if (!gestaltText.isLaidOut() || gestaltText.isLayoutRequested()) {
            gestaltText.addOnLayoutChangeListener(new a(ideaPinCreationSlider));
        } else {
            gestaltText.setTranslationY(IdeaPinCreationSlider.L(ideaPinCreationSlider));
        }
        h hVar = ideaPinCreationSlider.f46482e;
        if (hVar != null) {
            IdeaPinHandDrawingEditor ideaPinHandDrawingEditor = hVar.f97711a;
            kg.a.s(ideaPinHandDrawingEditor.f46494l, 0L, null, 6);
            int intValue = (int) (((i14 / 100) * ((Number) ideaPinHandDrawingEditor.f46502t.getValue()).intValue()) + ((Number) ideaPinHandDrawingEditor.f46501s.getValue()).intValue());
            ImageView imageView = ideaPinHandDrawingEditor.f46493k;
            imageView.getLayoutParams().height = intValue;
            imageView.getLayoutParams().width = intValue;
            IdeaPinHandDrawingView ideaPinHandDrawingView = ideaPinHandDrawingEditor.f46483a;
            if (ideaPinHandDrawingView != null) {
                ideaPinHandDrawingView.f46511c = intValue;
            }
            bs1.c.R1(imageView, true);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i13 = dq1.a.idea_pin_slider_right_margin;
        IdeaPinCreationSlider ideaPinCreationSlider = this.f97701a;
        int W = bs1.c.W(ideaPinCreationSlider, i13);
        int i14 = IdeaPinCreationSlider.f46477f;
        ideaPinCreationSlider.T(W);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i13 = IdeaPinCreationSlider.f46477f;
        IdeaPinCreationSlider ideaPinCreationSlider = this.f97701a;
        ideaPinCreationSlider.T(0);
        h hVar = ideaPinCreationSlider.f46482e;
        if (hVar != null) {
            IdeaPinHandDrawingEditor ideaPinHandDrawingEditor = hVar.f97711a;
            kg.a.u(ideaPinHandDrawingEditor.f46494l, 0, 0L, 6);
            bs1.c.R1(ideaPinHandDrawingEditor.f46493k, false);
        }
        a0.k0(ideaPinCreationSlider.f46479b);
    }
}
