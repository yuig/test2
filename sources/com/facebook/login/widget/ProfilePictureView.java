package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bb.p;
import com.bugsnag.android.a0;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.login.d0;
import com.facebook.login.e0;
import com.facebook.login.j0;
import df.o0;
import df.p0;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import le.e;
import me.f;
import mf.g;
import p001if.a;
import wc.j;

/* loaded from: classes3.dex */
public class ProfilePictureView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f30066h = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f30067a;

    /* renamed from: b, reason: collision with root package name */
    public int f30068b;

    /* renamed from: c, reason: collision with root package name */
    public int f30069c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30070d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f30071e;

    /* renamed from: f, reason: collision with root package name */
    public int f30072f;

    /* renamed from: g, reason: collision with root package name */
    public p0 f30073g;

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30068b = 0;
        this.f30069c = 0;
        this.f30070d = true;
        this.f30072f = -1;
        b(context);
        c(attributeSet);
    }

    public final int a(boolean z13) {
        int i13;
        if (a.b(this)) {
            return 0;
        }
        try {
            int i14 = this.f30072f;
            if (i14 == -4) {
                i13 = d0.com_facebook_profilepictureview_preset_size_large;
            } else if (i14 == -3) {
                i13 = d0.com_facebook_profilepictureview_preset_size_normal;
            } else if (i14 == -2) {
                i13 = d0.com_facebook_profilepictureview_preset_size_small;
            } else {
                if (i14 != -1 || !z13) {
                    return 0;
                }
                i13 = d0.com_facebook_profilepictureview_preset_size_normal;
            }
            return getResources().getDimensionPixelSize(i13);
        } catch (Throwable th3) {
            a.a(this, th3);
            return 0;
        }
    }

    public final void b(Context context) {
        if (a.b(this)) {
            return;
        }
        try {
            removeAllViews();
            this.f30071e = new ImageView(context);
            this.f30071e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f30071e.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.f30071e);
            new g(this);
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    public final void c(AttributeSet attributeSet) {
        if (a.b(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.com_facebook_profile_picture_view);
            int i13 = obtainStyledAttributes.getInt(j0.com_facebook_profile_picture_view_com_facebook_preset_size, -1);
            if (i13 != -4 && i13 != -3 && i13 != -2 && i13 != -1) {
                throw new IllegalArgumentException("Must use a predefined preset size");
            }
            this.f30072f = i13;
            requestLayout();
            this.f30070d = obtainStyledAttributes.getBoolean(j0.com_facebook_profile_picture_view_com_facebook_is_cropped, true);
            obtainStyledAttributes.recycle();
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    public final void d(boolean z13) {
        boolean z14;
        if (a.b(this)) {
            return;
        }
        try {
            boolean z15 = false;
            if (!a.b(this)) {
                try {
                    int height = getHeight();
                    int width = getWidth();
                    if (width >= 1 && height >= 1) {
                        int a13 = a(false);
                        if (a13 != 0) {
                            height = a13;
                            width = height;
                        }
                        if (width <= height) {
                            height = this.f30070d ? width : 0;
                        } else {
                            width = this.f30070d ? height : 0;
                        }
                        if (width == this.f30069c && height == this.f30068b) {
                            z14 = false;
                            this.f30069c = width;
                            this.f30068b = height;
                            z15 = z14;
                        }
                        z14 = true;
                        this.f30069c = width;
                        this.f30068b = height;
                        z15 = z14;
                    }
                } catch (Throwable th3) {
                    a.a(this, th3);
                }
            }
            String str = this.f30067a;
            if (str != null && str.length() != 0 && (this.f30069c != 0 || this.f30068b != 0)) {
                if (z15 || z13) {
                    e(true);
                    return;
                }
                return;
            }
            f();
        } catch (Throwable th4) {
            a.a(this, th4);
        }
    }

    public final void e(boolean z13) {
        String str;
        if (a.b(this)) {
            return;
        }
        try {
            Date date = AccessToken.f29844l;
            String str2 = "";
            Uri imageUri = f.l(this.f30067a, this.f30069c, this.f30068b, j.z() ? j.s().f29851e : "");
            String str3 = Profile.f29917h;
            Profile p13 = a0.p();
            AccessToken accessToken = e.f83036f.t().f83040c;
            if (accessToken != null && !accessToken.d() && (str = accessToken.f29857k) != null && str.equals("instagram") && p13 != null) {
                int i13 = this.f30069c;
                int i14 = this.f30068b;
                Uri uri = p13.f29924g;
                if (uri == null) {
                    if (j.z()) {
                        AccessToken s13 = j.s();
                        str2 = s13 == null ? null : s13.f29851e;
                    }
                    uri = f.l(p13.f29918a, i13, i14, str2);
                }
                if (uri != null) {
                    imageUri = uri;
                }
            }
            Context context = getContext();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            p0 p0Var = new p0(imageUri, new p(this, 8), z13, this);
            p0 p0Var2 = this.f30073g;
            if (p0Var2 != null) {
                o0.c(p0Var2);
            }
            this.f30073g = p0Var;
            o0.d(p0Var);
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    public final void f() {
        if (a.b(this)) {
            return;
        }
        try {
            p0 p0Var = this.f30073g;
            if (p0Var != null) {
                o0.c(p0Var);
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), this.f30070d ? e0.com_facebook_profile_picture_blank_square : e0.com_facebook_profile_picture_blank_portrait);
            if (a.b(this)) {
                return;
            }
            try {
                ImageView imageView = this.f30071e;
                if (imageView == null || decodeResource == null) {
                    return;
                }
                imageView.setImageBitmap(decodeResource);
            } catch (Throwable th3) {
                a.a(this, th3);
            }
        } catch (Throwable th4) {
            a.a(this, th4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30073g = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        d(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        boolean z13;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i14);
        int size2 = View.MeasureSpec.getSize(i13);
        boolean z14 = true;
        if (View.MeasureSpec.getMode(i14) == 1073741824 || layoutParams.height != -2) {
            z13 = false;
        } else {
            size = a(true);
            i14 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z13 = true;
        }
        if (View.MeasureSpec.getMode(i13) == 1073741824 || layoutParams.width != -2) {
            z14 = z13;
        } else {
            size2 = a(true);
            i13 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (!z14) {
            super.onMeasure(i13, i14);
        } else {
            setMeasuredDimension(size2, size);
            measureChildren(i13, i14);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.f30067a = bundle.getString("ProfilePictureView_profileId");
        this.f30072f = bundle.getInt("ProfilePictureView_presetSize");
        this.f30070d = bundle.getBoolean("ProfilePictureView_isCropped");
        this.f30069c = bundle.getInt("ProfilePictureView_width");
        this.f30068b = bundle.getInt("ProfilePictureView_height");
        d(true);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", onSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.f30067a);
        bundle.putInt("ProfilePictureView_presetSize", this.f30072f);
        bundle.putBoolean("ProfilePictureView_isCropped", this.f30070d);
        bundle.putInt("ProfilePictureView_width", this.f30069c);
        bundle.putInt("ProfilePictureView_height", this.f30068b);
        bundle.putBoolean("ProfilePictureView_refresh", this.f30073g != null);
        return bundle;
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f30068b = 0;
        this.f30069c = 0;
        this.f30070d = true;
        this.f30072f = -1;
        b(context);
        c(attributeSet);
    }
}
