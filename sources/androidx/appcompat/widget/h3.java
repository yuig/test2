package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes2.dex */
public final class h3 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f16581a;

    /* renamed from: b, reason: collision with root package name */
    public int f16582b;

    /* renamed from: c, reason: collision with root package name */
    public final View f16583c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f16584d;

    /* renamed from: e, reason: collision with root package name */
    public final Drawable f16585e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f16586f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16587g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f16588h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f16589i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f16590j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f16591k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16592l;

    /* renamed from: m, reason: collision with root package name */
    public n f16593m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16594n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f16595o;

    public h3(Toolbar toolbar, boolean z13) {
        int i13;
        Drawable drawable;
        int i14 = i.h.abc_action_bar_up_description;
        this.f16594n = 0;
        this.f16581a = toolbar;
        CharSequence charSequence = toolbar.f16492x;
        this.f16588h = charSequence;
        this.f16589i = toolbar.f16493y;
        this.f16587g = charSequence != null;
        this.f16586f = toolbar.o();
        x92.b N = x92.b.N(toolbar.getContext(), null, i.j.ActionBar, i.a.actionBarStyle, 0);
        this.f16595o = N.x(i.j.ActionBar_homeAsUpIndicator);
        if (z13) {
            CharSequence E = N.E(i.j.ActionBar_title);
            if (!TextUtils.isEmpty(E)) {
                this.f16587g = true;
                this.f16588h = E;
                if ((this.f16582b & 8) != 0) {
                    Toolbar toolbar2 = this.f16581a;
                    toolbar2.D(E);
                    if (this.f16587g) {
                        q5.v0.p(toolbar2.getRootView(), E);
                    }
                }
            }
            CharSequence E2 = N.E(i.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(E2)) {
                this.f16589i = E2;
                if ((this.f16582b & 8) != 0) {
                    toolbar.C(E2);
                }
            }
            Drawable x13 = N.x(i.j.ActionBar_logo);
            if (x13 != null) {
                this.f16585e = x13;
                c();
            }
            Drawable x14 = N.x(i.j.ActionBar_icon);
            if (x14 != null) {
                this.f16584d = x14;
                c();
            }
            if (this.f16586f == null && (drawable = this.f16595o) != null) {
                this.f16586f = drawable;
                int i15 = this.f16582b & 4;
                Toolbar toolbar3 = this.f16581a;
                if (i15 != 0) {
                    toolbar3.A(drawable);
                } else {
                    toolbar3.A(null);
                }
            }
            a(N.B(i.j.ActionBar_displayOptions, 0));
            int C = N.C(i.j.ActionBar_customNavigationLayout, 0);
            if (C != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(C, (ViewGroup) toolbar, false);
                View view = this.f16583c;
                if (view != null && (this.f16582b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f16583c = inflate;
                if (inflate != null && (this.f16582b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f16582b | 16);
            }
            int layoutDimension = ((TypedArray) N.f134366c).getLayoutDimension(i.j.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int v13 = N.v(i.j.ActionBar_contentInsetStart, -1);
            int v14 = N.v(i.j.ActionBar_contentInsetEnd, -1);
            if (v13 >= 0 || v14 >= 0) {
                int max = Math.max(v13, 0);
                int max2 = Math.max(v14, 0);
                toolbar.d();
                toolbar.f16488t.a(max, max2);
            }
            int C2 = N.C(i.j.ActionBar_titleTextStyle, 0);
            if (C2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f16480l = C2;
                AppCompatTextView appCompatTextView = toolbar.f16470b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, C2);
                }
            }
            int C3 = N.C(i.j.ActionBar_subtitleTextStyle, 0);
            if (C3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f16481m = C3;
                AppCompatTextView appCompatTextView2 = toolbar.f16471c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, C3);
                }
            }
            int C4 = N.C(i.j.ActionBar_popupTheme, 0);
            if (C4 != 0 && toolbar.f16479k != C4) {
                toolbar.f16479k = C4;
                if (C4 == 0) {
                    toolbar.f16478j = toolbar.getContext();
                } else {
                    toolbar.f16478j = new ContextThemeWrapper(toolbar.getContext(), C4);
                }
            }
        } else {
            if (toolbar.o() != null) {
                this.f16595o = toolbar.o();
                i13 = 15;
            } else {
                i13 = 11;
            }
            this.f16582b = i13;
        }
        N.O();
        if (i14 != this.f16594n) {
            this.f16594n = i14;
            AppCompatImageButton appCompatImageButton = toolbar.f16472d;
            if (TextUtils.isEmpty(appCompatImageButton != null ? appCompatImageButton.getContentDescription() : null)) {
                int i16 = this.f16594n;
                this.f16590j = i16 == 0 ? null : toolbar.getContext().getString(i16);
                b();
            }
        }
        AppCompatImageButton appCompatImageButton2 = toolbar.f16472d;
        this.f16590j = appCompatImageButton2 != null ? appCompatImageButton2.getContentDescription() : null;
        toolbar.B(new c(this));
    }

    public final void a(int i13) {
        View view;
        int i14 = this.f16582b ^ i13;
        this.f16582b = i13;
        if (i14 != 0) {
            if ((i14 & 4) != 0) {
                if ((i13 & 4) != 0) {
                    b();
                }
                int i15 = this.f16582b & 4;
                Toolbar toolbar = this.f16581a;
                if (i15 != 0) {
                    Drawable drawable = this.f16586f;
                    if (drawable == null) {
                        drawable = this.f16595o;
                    }
                    toolbar.A(drawable);
                } else {
                    toolbar.A(null);
                }
            }
            if ((i14 & 3) != 0) {
                c();
            }
            int i16 = i14 & 8;
            Toolbar toolbar2 = this.f16581a;
            if (i16 != 0) {
                if ((i13 & 8) != 0) {
                    toolbar2.D(this.f16588h);
                    toolbar2.C(this.f16589i);
                } else {
                    toolbar2.D(null);
                    toolbar2.C(null);
                }
            }
            if ((i14 & 16) == 0 || (view = this.f16583c) == null) {
                return;
            }
            if ((i13 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f16582b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f16590j);
            Toolbar toolbar = this.f16581a;
            if (!isEmpty) {
                toolbar.z(this.f16590j);
            } else {
                int i13 = this.f16594n;
                toolbar.z(i13 != 0 ? toolbar.getContext().getText(i13) : null);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i13 = this.f16582b;
        if ((i13 & 2) == 0) {
            drawable = null;
        } else if ((i13 & 1) != 0) {
            drawable = this.f16585e;
            if (drawable == null) {
                drawable = this.f16584d;
            }
        } else {
            drawable = this.f16584d;
        }
        this.f16581a.y(drawable);
    }
}
