package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class l extends AppCompatImageView implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f16624a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Context context) {
        super(context, null, i.a.actionOverflowButtonStyle);
        this.f16624a = nVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        i3.a(this, getContentDescription());
        setOnTouchListener(new k(this, this, nVar, 0));
    }

    @Override // androidx.appcompat.widget.o
    public final boolean g0() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f16624a.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i13, int i14, int i15, int i16) {
        boolean frame = super.setFrame(i13, i14, i15, i16);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.o
    public final boolean t0() {
        return false;
    }
}
