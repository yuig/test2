package com.facebook.login.widget;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.c;
import com.facebook.AccessToken;
import com.facebook.login.b0;
import com.facebook.login.c0;
import com.facebook.login.h0;
import com.facebook.login.j0;
import com.facebook.login.x;
import df.k1;
import g.g;
import g.h;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;
import le.p;
import le.v;
import mf.b;
import mf.d;
import mf.f;
import mf.j;
import mf.k;
import p001if.a;

/* loaded from: classes3.dex */
public class LoginButton extends p {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f30049y = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30050i;

    /* renamed from: j, reason: collision with root package name */
    public String f30051j;

    /* renamed from: k, reason: collision with root package name */
    public String f30052k;

    /* renamed from: l, reason: collision with root package name */
    public final d f30053l;

    /* renamed from: m, reason: collision with root package name */
    public final String f30054m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30055n;

    /* renamed from: o, reason: collision with root package name */
    public final j f30056o;

    /* renamed from: p, reason: collision with root package name */
    public f f30057p;

    /* renamed from: q, reason: collision with root package name */
    public final long f30058q;

    /* renamed from: r, reason: collision with root package name */
    public k f30059r;

    /* renamed from: s, reason: collision with root package name */
    public b f30060s;

    /* renamed from: t, reason: collision with root package name */
    public x f30061t;

    /* renamed from: u, reason: collision with root package name */
    public Float f30062u;

    /* renamed from: v, reason: collision with root package name */
    public int f30063v;

    /* renamed from: w, reason: collision with root package name */
    public final String f30064w;

    /* renamed from: x, reason: collision with root package name */
    public g.d f30065x;

    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    @Override // le.p
    public final void a(Context context, AttributeSet attributeSet, int i13, int i14) {
        if (a.b(this)) {
            return;
        }
        try {
            super.a(context, attributeSet, i13, i14);
            c i15 = i();
            if (!a.b(this)) {
                try {
                    this.f83094d = i15;
                } catch (Throwable th3) {
                    a.a(this, th3);
                }
            }
            k(context, attributeSet, i13, i14);
            if (isInEditMode()) {
                setBackgroundColor(getResources().getColor(af.a.com_facebook_blue));
                this.f30051j = "Continue with Facebook";
            } else {
                this.f30060s = new b(this);
            }
            n();
            m();
            if (!a.b(this)) {
                try {
                    getBackground().setAlpha(this.f30063v);
                } catch (Throwable th4) {
                    a.a(this, th4);
                }
            }
            l();
        } catch (Throwable th5) {
            a.a(this, th5);
        }
    }

    public final void g() {
        if (a.b(this)) {
            return;
        }
        try {
            int i13 = mf.c.f87067a[this.f30057p.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    return;
                }
                h(getResources().getString(h0.com_facebook_tooltip_default));
            } else {
                k1.d(getContext(), "context");
                v.d().execute(new androidx.appcompat.widget.j(18, this, v.b()));
            }
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    public final void h(String str) {
        if (a.b(this)) {
            return;
        }
        try {
            k kVar = new k(this, str);
            this.f30059r = kVar;
            j jVar = this.f30056o;
            if (!a.b(kVar)) {
                try {
                    kVar.f87086f = jVar;
                } catch (Throwable th3) {
                    a.a(kVar, th3);
                }
            }
            k kVar2 = this.f30059r;
            long j13 = this.f30058q;
            kVar2.getClass();
            if (!a.b(kVar2)) {
                try {
                    kVar2.f87087g = j13;
                } catch (Throwable th4) {
                    a.a(kVar2, th4);
                }
            }
            this.f30059r.c();
        } catch (Throwable th5) {
            a.a(this, th5);
        }
    }

    public c i() {
        return new c(this, 2);
    }

    public final int j(String str) {
        if (a.b(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + c(str) + getCompoundPaddingRight();
        } catch (Throwable th3) {
            a.a(this, th3);
            return 0;
        }
    }

    public final void k(Context context, AttributeSet attributeSet, int i13, int i14) {
        if (a.b(this)) {
            return;
        }
        try {
            this.f30057p = f.DEFAULT;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j0.com_facebook_login_view, i13, i14);
            try {
                this.f30050i = obtainStyledAttributes.getBoolean(j0.com_facebook_login_view_com_facebook_confirm_logout, true);
                this.f30051j = obtainStyledAttributes.getString(j0.com_facebook_login_view_com_facebook_login_text);
                this.f30052k = obtainStyledAttributes.getString(j0.com_facebook_login_view_com_facebook_logout_text);
                this.f30057p = f.fromInt(obtainStyledAttributes.getInt(j0.com_facebook_login_view_com_facebook_tooltip_mode, f.DEFAULT.getValue()));
                if (obtainStyledAttributes.hasValue(j0.com_facebook_login_view_com_facebook_login_button_radius)) {
                    this.f30062u = Float.valueOf(obtainStyledAttributes.getDimension(j0.com_facebook_login_view_com_facebook_login_button_radius, 0.0f));
                }
                int integer = obtainStyledAttributes.getInteger(j0.com_facebook_login_view_com_facebook_login_button_transparency, 255);
                this.f30063v = integer;
                if (integer < 0) {
                    this.f30063v = 0;
                }
                if (this.f30063v > 255) {
                    this.f30063v = 255;
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th3) {
                obtainStyledAttributes.recycle();
                throw th3;
            }
        } catch (Throwable th4) {
            a.a(this, th4);
        }
    }

    public final void l() {
        if (a.b(this)) {
            return;
        }
        try {
            setCompoundDrawablesWithIntrinsicBounds(com.bumptech.glide.c.I(getContext(), af.b.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:15:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r5 = this;
            boolean r0 = p001if.a.b(r5)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.Float r0 = r5.f30062u     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto Lc
            return
        Lc:
            android.graphics.drawable.Drawable r0 = r5.getBackground()     // Catch: java.lang.Throwable -> L36
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L36
            r2 = 29
            if (r1 < r2) goto L3b
            boolean r1 = r0 instanceof android.graphics.drawable.StateListDrawable     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L3b
            r1 = r0
            android.graphics.drawable.StateListDrawable r1 = (android.graphics.drawable.StateListDrawable) r1     // Catch: java.lang.Throwable -> L36
            r2 = 0
        L1e:
            int r3 = d4.c.b(r1)     // Catch: java.lang.Throwable -> L36
            if (r2 >= r3) goto L3b
            android.graphics.drawable.Drawable r3 = d4.c.f(r1, r2)     // Catch: java.lang.Throwable -> L36
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L38
            java.lang.Float r4 = r5.f30062u     // Catch: java.lang.Throwable -> L36
            float r4 = r4.floatValue()     // Catch: java.lang.Throwable -> L36
            r3.setCornerRadius(r4)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r0 = move-exception
            goto L4b
        L38:
            int r2 = r2 + 1
            goto L1e
        L3b:
            boolean r1 = r0 instanceof android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L4a
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0     // Catch: java.lang.Throwable -> L36
            java.lang.Float r1 = r5.f30062u     // Catch: java.lang.Throwable -> L36
            float r1 = r1.floatValue()     // Catch: java.lang.Throwable -> L36
            r0.setCornerRadius(r1)     // Catch: java.lang.Throwable -> L36
        L4a:
            return
        L4b:
            p001if.a.a(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.widget.LoginButton.m():void");
    }

    public final void n() {
        if (a.b(this)) {
            return;
        }
        try {
            Resources resources = getResources();
            if (!isInEditMode()) {
                Date date = AccessToken.f29844l;
                if (wc.j.z()) {
                    String str = this.f30052k;
                    if (str == null) {
                        str = resources.getString(h0.com_facebook_loginview_log_out_button);
                    }
                    setText(str);
                    return;
                }
            }
            String str2 = this.f30051j;
            if (str2 != null) {
                setText(str2);
                return;
            }
            String string = resources.getString(h0.com_facebook_loginview_log_in_button_continue);
            int width = getWidth();
            if (width != 0 && j(string) > width) {
                string = resources.getString(h0.com_facebook_loginview_log_in_button);
            }
            setText(string);
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    @Override // le.p, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        boolean z13;
        if (a.b(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (getContext() instanceof h) {
                g activityResultRegistry = ((h) getContext()).getActivityResultRegistry();
                if (this.f30061t == null) {
                    this.f30061t = x.f30074j.w();
                }
                x xVar = this.f30061t;
                String str = this.f30064w;
                xVar.getClass();
                this.f30065x = activityResultRegistry.e("facebook-login", new com.facebook.login.v(xVar, str), new bb.p(this, 7));
            }
            b bVar = this.f30060s;
            if (bVar == null || (z13 = bVar.f83052c)) {
                return;
            }
            if (!z13) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                bVar.f83051b.b(bVar.f83050a, intentFilter);
                bVar.f83052c = true;
            }
            n();
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (a.b(this)) {
            return;
        }
        try {
            super.onDetachedFromWindow();
            g.d dVar = this.f30065x;
            if (dVar != null) {
                dVar.b();
            }
            b bVar = this.f30060s;
            if (bVar != null && bVar.f83052c) {
                bVar.f83051b.d(bVar.f83050a);
                bVar.f83052c = false;
            }
            k kVar = this.f30059r;
            if (kVar != null) {
                kVar.b();
                this.f30059r = null;
            }
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    @Override // le.p, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (a.b(this)) {
            return;
        }
        try {
            super.onDraw(canvas);
            if (this.f30055n || isInEditMode()) {
                return;
            }
            this.f30055n = true;
            g();
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        if (a.b(this)) {
            return;
        }
        try {
            super.onLayout(z13, i13, i14, i15, i16);
            n();
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (a.b(this)) {
            return;
        }
        try {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil(Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom))) + getCompoundPaddingBottom();
            Resources resources = getResources();
            int i15 = 0;
            if (!a.b(this)) {
                try {
                    Resources resources2 = getResources();
                    String str = this.f30051j;
                    if (str == null) {
                        str = resources2.getString(h0.com_facebook_loginview_log_in_button_continue);
                        int j13 = j(str);
                        if (View.resolveSize(j13, i13) < j13) {
                            str = resources2.getString(h0.com_facebook_loginview_log_in_button);
                        }
                    }
                    i15 = j(str);
                } catch (Throwable th3) {
                    a.a(this, th3);
                }
            }
            String str2 = this.f30052k;
            if (str2 == null) {
                str2 = resources.getString(h0.com_facebook_loginview_log_out_button);
            }
            setMeasuredDimension(View.resolveSize(Math.max(i15, j(str2)), i13), compoundPaddingTop);
        } catch (Throwable th4) {
            a.a(this, th4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i13) {
        k kVar;
        if (a.b(this)) {
            return;
        }
        try {
            super.onVisibilityChanged(view, i13);
            if (i13 == 0 || (kVar = this.f30059r) == null) {
                return;
            }
            kVar.b();
            this.f30059r = null;
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13);
        d dVar = new d();
        dVar.f87068a = com.facebook.login.c.FRIENDS;
        dVar.f87069b = Collections.emptyList();
        dVar.f87070c = com.facebook.login.j.NATIVE_WITH_FALLBACK;
        dVar.f87071d = "rerequest";
        b0 b0Var = c0.Companion;
        this.f30053l = dVar;
        this.f30054m = "fb_login_view_usage";
        this.f30056o = j.BLUE;
        this.f30058q = 6000L;
        this.f30063v = 255;
        this.f30064w = UUID.randomUUID().toString();
        this.f30065x = null;
    }
}
