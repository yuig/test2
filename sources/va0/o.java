package va0;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.pinterest.collagesCoreLibrary.effects.EffectSliderView;
import df.j1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ql2.s;
import ra0.l0;

/* loaded from: classes5.dex */
public final class o implements s62.e {

    /* renamed from: a, reason: collision with root package name */
    public final EffectSliderView f125138a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125139b;

    /* renamed from: c, reason: collision with root package name */
    public Function2 f125140c;

    /* renamed from: d, reason: collision with root package name */
    public Function2 f125141d;

    /* renamed from: e, reason: collision with root package name */
    public kl2.l f125142e;

    public o(EffectSliderView slider, boolean z13) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        this.f125138a = slider;
        this.f125139b = z13;
        this.f125140c = m.f125134j;
        this.f125141d = m.f125135k;
        this.f125142e = n.f125137i;
        Context context = slider.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean Y0 = j1.Y0(context);
        int b03 = bs1.c.b0(slider, qa0.b.collage_effect_slider_width);
        int b04 = bs1.c.b0(slider, qa0.b.collage_effect_slider_height);
        float b05 = bs1.c.b0(slider, eo1.c.space_300);
        float a13 = s.a((b03 / 2.0f) - (b04 / 2.0f), 0.0f);
        a13 = Y0 ? -a13 : a13;
        float f13 = (Y0 ? b05 : -b05) + a13;
        if (z13) {
            slider.setRotation(Y0 ? 90.0f : 270.0f);
            slider.setTranslationX(a13);
        }
        l onStartTrackingTouch = new l(this, f13, 0);
        l onStopTrackingTouch = new l(this, a13, 1);
        l0 onValueChange = new l0(this, 4);
        Intrinsics.checkNotNullParameter(onStartTrackingTouch, "onStartTrackingTouch");
        Intrinsics.checkNotNullParameter(onStopTrackingTouch, "onStopTrackingTouch");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        slider.f44676i.setValue(onStartTrackingTouch);
        slider.f44677j.setValue(onStopTrackingTouch);
        slider.f44678k = onValueChange;
    }

    public final void a(float f13) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f125138a.f44675h;
        parcelableSnapshotMutableState.setValue(j.a((j) parcelableSnapshotMutableState.getValue(), f13, 0.0f, 0.0f, 6));
    }

    public final void b(float f13) {
        EffectSliderView effectSliderView = this.f125138a;
        effectSliderView.f44675h.setValue(j.a((j) effectSliderView.f44675h.getValue(), 0.0f, f13, 0.0f, 5));
    }

    public final void c(float f13) {
        EffectSliderView effectSliderView = this.f125138a;
        effectSliderView.f44675h.setValue(j.a((j) effectSliderView.f44675h.getValue(), 0.0f, 0.0f, f13, 3));
    }

    public final void d(boolean z13) {
        this.f125138a.setVisibility(z13 ? 0 : 8);
    }
}
