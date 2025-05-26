package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private boolean mHasLevel;
    private final z mImageHelper;

    public AppCompatImageView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void H0(int i13, int i14) {
        setMeasuredDimension(i13, i14);
    }

    public void K1(Drawable drawable) {
        setForeground(drawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
        z zVar = this.mImageHelper;
        if (zVar != null) {
            zVar.a();
        }
    }

    public int getPWTImageHeight() {
        return getHeight();
    }

    public int getPWTImageWidth() {
        return getWidth();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        z2 z2Var;
        z zVar = this.mImageHelper;
        if (zVar == null || (z2Var = zVar.f16741b) == null) {
            return null;
        }
        return (ColorStateList) z2Var.f16750c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        z2 z2Var;
        z zVar = this.mImageHelper;
        if (zVar == null || (z2Var = zVar.f16741b) == null) {
            return null;
        }
        return (PorterDuff.Mode) z2Var.f16751d;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.mImageHelper.f16740a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i13);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        z zVar = this.mImageHelper;
        if (zVar != null) {
            zVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        z zVar = this.mImageHelper;
        if (zVar != null && drawable != null && !this.mHasLevel) {
            zVar.f16742c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        z zVar2 = this.mImageHelper;
        if (zVar2 != null) {
            zVar2.a();
            if (this.mHasLevel) {
                return;
            }
            z zVar3 = this.mImageHelper;
            ImageView imageView = zVar3.f16740a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(zVar3.f16742c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i13) {
        super.setImageLevel(i13);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i13) {
        z zVar = this.mImageHelper;
        if (zVar != null) {
            zVar.c(i13);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        z zVar = this.mImageHelper;
        if (zVar != null) {
            zVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        z zVar = this.mImageHelper;
        if (zVar != null) {
            if (zVar.f16741b == null) {
                zVar.f16741b = new z2();
            }
            z2 z2Var = zVar.f16741b;
            z2Var.f16750c = colorStateList;
            z2Var.f16749b = true;
            zVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        z zVar = this.mImageHelper;
        if (zVar != null) {
            if (zVar.f16741b == null) {
                zVar.f16741b = new z2();
            }
            z2 z2Var = zVar.f16741b;
            z2Var.f16751d = mode;
            z2Var.f16748a = true;
            zVar.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        y2.a(context);
        this.mHasLevel = false;
        x2.a(getContext(), this);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.e(attributeSet, i13);
        z zVar = new z(this);
        this.mImageHelper = zVar;
        zVar.b(attributeSet, i13);
    }
}
