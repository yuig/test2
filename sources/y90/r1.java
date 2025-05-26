package y90;

import android.view.View;
import android.widget.EditText;
import com.pinterest.collagesCoreLibrary.effects.EffectSliderView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final c f138234a;

    /* renamed from: b, reason: collision with root package name */
    public final va0.o f138235b;

    public r1(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        View findViewById = root.findViewById(x1.text_editor);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f138234a = new c((EditText) findViewById);
        View findViewById2 = root.findViewById(x1.text_size_slider);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f138235b = new va0.o((EffectSliderView) findViewById2, true);
    }
}
