package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final AppCompatBackgroundHelper f16305a;

    /* renamed from: b, reason: collision with root package name */
    public final z f16306b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16307c;

    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16305a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        z zVar = this.f16306b;
        if (zVar != null) {
            zVar.a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return ((this.f16306b.f16740a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16305a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16305a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i13);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        z zVar = this.f16306b;
        if (zVar != null) {
            zVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        z zVar = this.f16306b;
        if (zVar != null && drawable != null && !this.f16307c) {
            zVar.f16742c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (zVar != null) {
            zVar.a();
            if (this.f16307c) {
                return;
            }
            ImageView imageView = zVar.f16740a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(zVar.f16742c);
            }
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i13) {
        super.setImageLevel(i13);
        this.f16307c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i13) {
        this.f16306b.c(i13);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        z zVar = this.f16306b;
        if (zVar != null) {
            zVar.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        y2.a(context);
        this.f16307c = false;
        x2.a(getContext(), this);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f16305a = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i13);
        z zVar = new z(this);
        this.f16306b = zVar;
        zVar.b(attributeSet, i13);
    }
}
