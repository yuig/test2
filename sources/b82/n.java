package b82;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends FrameLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f22219a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22220b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f22221c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22222d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, f30 f30Var) {
        super(context, null, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f22220b) {
            this.f22220b = true;
            ((o) generatedComponent()).getClass();
        }
        int E = com.bumptech.glide.c.E(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.toolbar_height);
        int dimensionPixelSize2 = E - (getResources().getDimensionPixelSize(eo1.c.margin_double) * 2);
        this.f22222d = dimensionPixelSize2;
        int i13 = bb0.a.collages_cutout_border;
        Object obj = d5.a.f53679a;
        this.f22223e = context.getColor(i13);
        setLayoutParams(new FrameLayout.LayoutParams(E, E));
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(E, E));
        view.setBackground(context.getDrawable(qa0.c.collages_grid_background_pattern));
        addView(view);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, dimensionPixelSize, 0, 0);
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
        this.f22221c = imageView;
        if (f30Var != null) {
            a(f30Var);
        }
    }

    public final void a(f30 pin) {
        String j13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        sr m13 = b40.m(pin);
        if (m13 == null || (j13 = m13.j()) == null) {
            return;
        }
        com.bumptech.glide.l K = com.bumptech.glide.b.g(this).a(Drawable.class).K(j13);
        int i13 = this.f22222d;
        ((com.bumptech.glide.l) ((com.bumptech.glide.l) ((com.bumptech.glide.l) K.m(i13, i13)).b()).x(new u72.a(j13, this.f22223e), true)).G(this.f22221c);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f22219a == null) {
            this.f22219a = new ye2.o(this);
        }
        return this.f22219a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f22219a == null) {
            this.f22219a = new ye2.o(this);
        }
        return this.f22219a.generatedComponent();
    }
}
