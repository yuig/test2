package b01;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final List f20762a;

    /* renamed from: b, reason: collision with root package name */
    public final c01.e f20763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, iy1.e.view_pear_style_summary_screenshot, this);
        setBackgroundColor(bs1.c.B(this, eo1.b.color_themed_background_default));
        this.f20762a = f0.j(findViewById(iy1.d.cover_pin_carousel_one), findViewById(iy1.d.cover_pin_carousel_two), findViewById(iy1.d.cover_pin_carousel_three), findViewById(iy1.d.cover_pin_carousel_four));
        View findViewById = findViewById(iy1.d.style_summary_header);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f20763b = (c01.e) findViewById;
    }

    public final void L(List coverPins, zz0.b headerModel) {
        Intrinsics.checkNotNullParameter(coverPins, "coverPins");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        List list = this.f20762a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new ArrayList());
        }
        int i15 = 0;
        for (Object obj : coverPins) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                f0.p();
                throw null;
            }
            ((List) arrayList.get(i15 % size)).add((f30) obj);
            i15 = i16;
        }
        for (Object obj2 : list) {
            int i17 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            ((AnimatedPinVerticalCarouselView) obj2).a((List) arrayList.get(i13));
            i13 = i17;
        }
        this.f20763b.X(headerModel);
    }
}
