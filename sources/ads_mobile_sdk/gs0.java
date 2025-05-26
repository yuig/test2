package ads_mobile_sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gs0 extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f5677b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: a, reason: collision with root package name */
    public final AnimationDrawable f5678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(Context context, qx0 attribution, RelativeLayout.LayoutParams groupLayoutParams) {
        super(context);
        AnimationDrawable animationDrawable;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attribution, "attribution");
        Intrinsics.checkNotNullParameter(groupLayoutParams, "groupLayoutParams");
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f5677b, null, null));
        shapeDrawable.getPaint().setColor(attribution.f10303c);
        setLayoutParams(groupLayoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(attribution.f10301a)) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams2);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(attribution.f10301a);
            textView.setTextColor(attribution.f10304d);
            textView.setTextSize(attribution.f10305e);
            textView.setPadding(kh2.j1.u(context, 4), 0, kh2.j1.u(context, 4), 0);
            addView(textView);
            layoutParams.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setId(1195835394);
        List list = attribution.f10302b;
        if (list.size() > 1) {
            this.f5678a = new AnimationDrawable();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Drawable drawable = ((rz0) it.next()).f10867a;
                    if (drawable != null && (animationDrawable = this.f5678a) != null) {
                        animationDrawable.addFrame(drawable, (int) zn2.b.e(attribution.a()));
                    }
                } catch (Exception e13) {
                    ok.e0 e0Var = gk0.f5596a;
                    gk0.c("Error while getting drawable. " + e13, null);
                }
            }
            imageView.setBackground(this.f5678a);
        } else if (list.size() == 1) {
            try {
                imageView.setImageDrawable(((rz0) list.get(0)).f10867a);
            } catch (Exception e14) {
                ok.e0 e0Var2 = gk0.f5596a;
                gk0.c("Error while getting drawable. " + e14, null);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f5678a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
