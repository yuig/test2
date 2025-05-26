package ab2;

import ac2.c1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kh2.j1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes4.dex */
public final class p extends sf1.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, View.OnClickListener onClickListener) {
        super(context, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, sc2.d.video_end_frame, this);
        int dimension = (int) getResources().getDimension(r0.corner_radius_large);
        g(dimension, dimension, dimension, dimension);
        LinearLayout linearLayout = (LinearLayout) findViewById(sc2.c.buttons_layout);
        String textString = getResources().getString(c1.video_end_frame_watch_again);
        Intrinsics.checkNotNullExpressionValue(textString, "getString(...)");
        int i13 = eo1.c.font_size_300;
        int i14 = sc2.b.end_frame_button_text_padding;
        int i15 = sm1.b.ic_circle_refresh_gestalt;
        int i16 = eo1.b.color_white_0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textString, "textString");
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        ImageView imageView = new ImageView(context);
        Drawable f03 = bs1.c.f0(imageView, i15, null, null, 6);
        f03.setTint(context.getColor(i16));
        imageView.setImageDrawable(f03);
        TextView textView = new TextView(context);
        j1.p1(textView, eo1.b.color_themed_text_light);
        j1.q1(textView, i13);
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(i14);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setText(textString);
        dl2.b.A2(textView);
        linearLayout2.addView(imageView);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        setOnClickListener(onClickListener);
        setImportantForAccessibility(2);
    }
}
