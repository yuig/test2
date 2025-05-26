package ra0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f106970a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106971b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106972c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f106973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context, int i13, int i14, int i15) {
        super(context, null, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f106970a = i13;
        this.f106971b = i14;
        this.f106972c = i15;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i13, i14));
        addView(imageView);
        this.f106973d = imageView;
    }

    public final void a(j0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        String str = state.f106950a;
        if (!(!kotlin.text.z.j(str))) {
            throw new IllegalArgumentException("Cutout image URL cannot be blank".toString());
        }
        ((com.bumptech.glide.l) ((com.bumptech.glide.l) ((com.bumptech.glide.l) com.bumptech.glide.b.g(this).a(Drawable.class).K(str).m(this.f106970a, this.f106971b)).b()).x(new u72.a(str, this.f106972c), true)).G(this.f106973d);
    }
}
