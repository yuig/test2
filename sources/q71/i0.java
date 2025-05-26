package q71;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends FrameLayout implements k71.k {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f102719e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f102720a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f102721b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f102722c;

    /* renamed from: d, reason: collision with root package name */
    public final int f102723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        this.f102722c = arrayList;
        boolean q13 = hf0.b.q();
        View.inflate(context, q13 ? n42.d.search_autocomplete_recent_pins_tablet_module : n42.d.search_autocomplete_recent_pins_module, this);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        View findViewById = findViewById(n42.c.pin_image_1);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(n42.c.pin_image_2);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(n42.c.pin_image_3);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(n42.c.pin_image_4);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        arrayList.addAll(kotlin.collections.f0.j((ProportionalImageView) findViewById, (ProportionalImageView) findViewById2, (ProportionalImageView) findViewById3, (ProportionalImageView) findViewById4));
        if (q13) {
            ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById(n42.c.pin_image_5);
            ProportionalImageView proportionalImageView2 = (ProportionalImageView) findViewById(n42.c.pin_image_6);
            ProportionalImageView proportionalImageView3 = (ProportionalImageView) findViewById(n42.c.pin_image_7);
            Intrinsics.f(proportionalImageView);
            Intrinsics.f(proportionalImageView2);
            Intrinsics.f(proportionalImageView3);
            arrayList.addAll(kotlin.collections.f0.j(proportionalImageView, proportionalImageView2, proportionalImageView3));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ProportionalImageView) it.next()).f52576J = 1.33f;
        }
        View findViewById5 = findViewById(n42.c.see_more_view);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f102720a = (FrameLayout) findViewById5;
        View findViewById6 = findViewById(n42.c.module_header);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f102721b = (GestaltText) findViewById6;
        this.f102723d = q13 ? 7 : 4;
    }
}
