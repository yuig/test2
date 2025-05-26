package androidx.media3.ui;

import a7.o1;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;

@Deprecated
/* loaded from: classes.dex */
public class LegacyPlayerView extends FrameLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f18935u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final f f18936a;

    /* renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f18937b;

    /* renamed from: c, reason: collision with root package name */
    public final View f18938c;

    /* renamed from: d, reason: collision with root package name */
    public final View f18939d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18940e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f18941f;

    /* renamed from: g, reason: collision with root package name */
    public final SubtitleView f18942g;

    /* renamed from: h, reason: collision with root package name */
    public final View f18943h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f18944i;

    /* renamed from: j, reason: collision with root package name */
    public final LegacyPlayerControlView f18945j;

    /* renamed from: k, reason: collision with root package name */
    public a7.v0 f18946k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18947l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18948m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f18949n;

    /* renamed from: o, reason: collision with root package name */
    public int f18950o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f18951p;

    /* renamed from: q, reason: collision with root package name */
    public int f18952q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18953r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f18954s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18955t;

    public LegacyPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void k(TextureView textureView, int i13) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i13 != 0) {
            float f13 = width / 2.0f;
            float f14 = height / 2.0f;
            matrix.postRotate(i13, f13, f14);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f13, f14);
        }
        textureView.setTransform(matrix);
    }

    public static void m(Context context, Resources resources, ImageView imageView) {
        int i13 = f0.exo_edit_mode_logo;
        int i14 = d7.n0.f53866a;
        imageView.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
        imageView.setBackgroundColor(resources.getColor(d0.exo_edit_mode_background_color));
    }

    public static void p(Context context, Resources resources, ImageView imageView) {
        int i13 = f0.exo_edit_mode_logo;
        int i14 = d7.n0.f53866a;
        imageView.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
        imageView.setBackgroundColor(resources.getColor(d0.exo_edit_mode_background_color, null));
    }

    public final void A(boolean z13) {
        boolean z14 = true;
        LegacyPlayerControlView legacyPlayerControlView = this.f18945j;
        bf.b.t((z13 && legacyPlayerControlView == null) ? false : true);
        if (!z13 && !hasOnClickListeners()) {
            z14 = false;
        }
        setClickable(z14);
        if (this.f18947l == z13) {
            return;
        }
        this.f18947l = z13;
        if (J()) {
            legacyPlayerControlView.g(this.f18946k);
        } else if (legacyPlayerControlView != null) {
            legacyPlayerControlView.c();
            legacyPlayerControlView.g(null);
        }
        G();
    }

    public final boolean B() {
        a7.v0 v0Var = this.f18946k;
        if (v0Var == null) {
            return true;
        }
        int L = v0Var.L();
        return this.f18953r && (L == 1 || L == 4 || !this.f18946k.z());
    }

    public final void C(boolean z13) {
        View view;
        View view2;
        if (J()) {
            int i13 = z13 ? 0 : this.f18952q;
            LegacyPlayerControlView legacyPlayerControlView = this.f18945j;
            legacyPlayerControlView.f18907J = i13;
            if (legacyPlayerControlView.e()) {
                legacyPlayerControlView.d();
            }
            if (!legacyPlayerControlView.e()) {
                legacyPlayerControlView.setVisibility(0);
                Iterator it = legacyPlayerControlView.f18910b.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    legacyPlayerControlView.getVisibility();
                    fVar.getClass();
                    fVar.f19035c.G();
                }
                legacyPlayerControlView.j();
                legacyPlayerControlView.i();
                legacyPlayerControlView.l();
                legacyPlayerControlView.m();
                legacyPlayerControlView.n();
                boolean i03 = d7.n0.i0(legacyPlayerControlView.F, legacyPlayerControlView.H);
                if (i03 && (view2 = legacyPlayerControlView.f18913e) != null) {
                    view2.requestFocus();
                } else if (!i03 && (view = legacyPlayerControlView.f18914f) != null) {
                    view.requestFocus();
                }
                legacyPlayerControlView.f();
            }
            legacyPlayerControlView.d();
        }
    }

    public final void D() {
        if (!J() || this.f18946k == null) {
            return;
        }
        LegacyPlayerControlView legacyPlayerControlView = this.f18945j;
        if (!legacyPlayerControlView.e()) {
            u(true);
        } else if (this.f18955t) {
            legacyPlayerControlView.c();
        }
    }

    public final void E() {
        a7.v0 v0Var = this.f18946k;
        o1 D = v0Var != null ? v0Var.D() : o1.f1158d;
        int i13 = D.f1159a;
        int i14 = D.f1160b;
        float f13 = (i14 == 0 || i13 == 0) ? 0.0f : (i13 * D.f1161c) / i14;
        View view = this.f18939d;
        if (view instanceof TextureView) {
            k((TextureView) view, 0);
        }
        v(this.f18937b, this.f18940e ? 0.0f : f13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r5.f18946k.z() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            r5 = this;
            android.view.View r0 = r5.f18943h
            if (r0 == 0) goto L29
            a7.v0 r1 = r5.f18946k
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.L()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.f18950o
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            a7.v0 r1 = r5.f18946k
            boolean r1 = r1.z()
            if (r1 == 0) goto L20
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == 0) goto L24
            goto L26
        L24:
            r2 = 8
        L26:
            r0.setVisibility(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.LegacyPlayerView.F():void");
    }

    public final void G() {
        LegacyPlayerControlView legacyPlayerControlView = this.f18945j;
        if (legacyPlayerControlView == null || !this.f18947l) {
            setContentDescription(null);
        } else if (legacyPlayerControlView.getVisibility() == 0) {
            setContentDescription(this.f18955t ? getResources().getString(k0.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(k0.exo_controls_show));
        }
    }

    public final void H(boolean z13) {
        a7.v0 v0Var = this.f18946k;
        boolean z14 = this.f18951p;
        ImageView imageView = this.f18941f;
        View view = this.f18938c;
        if (v0Var == null || !v0Var.r(30) || v0Var.o().f1079a.isEmpty()) {
            if (z14) {
                return;
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        if (z13 && !z14 && view != null) {
            view.setVisibility(0);
        }
        if (v0Var.o().b(2)) {
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
                return;
            }
            return;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if ((I() && (w(v0Var.V()) || x(this.f18949n))) || imageView == null) {
            return;
        }
        imageView.setImageResource(R.color.transparent);
        imageView.setVisibility(4);
    }

    public final boolean I() {
        if (!this.f18948m) {
            return false;
        }
        bf.b.w(this.f18941f);
        return true;
    }

    public final boolean J() {
        if (!this.f18947l) {
            return false;
        }
        bf.b.w(this.f18945j);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        a7.v0 v0Var = this.f18946k;
        if (v0Var != null && v0Var.g()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z13 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        LegacyPlayerControlView legacyPlayerControlView = this.f18945j;
        if (z13 && J() && !legacyPlayerControlView.e()) {
            u(true);
        } else {
            if ((!J() || !legacyPlayerControlView.a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z13 || !J()) {
                    return false;
                }
                u(true);
                return false;
            }
            u(true);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!J() || this.f18946k == null) {
            return false;
        }
        u(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        D();
        return super.performClick();
    }

    public final void r() {
        LegacyPlayerControlView legacyPlayerControlView = this.f18945j;
        if (legacyPlayerControlView != null) {
            legacyPlayerControlView.c();
        }
    }

    public final boolean s() {
        a7.v0 v0Var = this.f18946k;
        return v0Var != null && v0Var.g() && this.f18946k.z();
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        View view = this.f18939d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i13);
        }
    }

    public final void u(boolean z13) {
        if (!(s() && this.f18954s) && J()) {
            LegacyPlayerControlView legacyPlayerControlView = this.f18945j;
            boolean z14 = legacyPlayerControlView.e() && legacyPlayerControlView.b() <= 0;
            boolean B = B();
            if (z13 || z14 || B) {
                C(B);
            }
        }
    }

    public void v(AspectRatioFrameLayout aspectRatioFrameLayout, float f13) {
        if (aspectRatioFrameLayout == null || aspectRatioFrameLayout.f18871b == f13) {
            return;
        }
        aspectRatioFrameLayout.f18871b = f13;
        aspectRatioFrameLayout.requestLayout();
    }

    public final boolean w(a7.l0 l0Var) {
        byte[] bArr = l0Var.f1125i;
        if (bArr == null) {
            return false;
        }
        return x(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public final boolean x(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                v(this.f18937b, intrinsicWidth / intrinsicHeight);
                ImageView imageView = this.f18941f;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(androidx.media3.exoplayer.ExoPlayer r9) {
        /*
            r8 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            bf.b.t(r0)
            if (r9 == 0) goto L22
            r0 = r9
            m7.l0 r0 = (m7.l0) r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = r0.f86286u
            if (r0 != r1) goto L20
            goto L22
        L20:
            r0 = r2
            goto L23
        L22:
            r0 = r3
        L23:
            bf.b.i(r0)
            a7.v0 r0 = r8.f18946k
            if (r0 != r9) goto L2b
            return
        L2b:
            android.view.View r1 = r8.f18939d
            r4 = 27
            androidx.media3.ui.f r5 = r8.f18936a
            if (r0 == 0) goto L51
            r0.j(r5)
            boolean r6 = r0.r(r4)
            if (r6 == 0) goto L51
            boolean r6 = r1 instanceof android.view.TextureView
            if (r6 == 0) goto L47
            r6 = r1
            android.view.TextureView r6 = (android.view.TextureView) r6
            r0.C(r6)
            goto L51
        L47:
            boolean r6 = r1 instanceof android.view.SurfaceView
            if (r6 == 0) goto L51
            r6 = r1
            android.view.SurfaceView r6 = (android.view.SurfaceView) r6
            r0.P(r6)
        L51:
            androidx.media3.ui.SubtitleView r0 = r8.f18942g
            if (r0 == 0) goto L59
            r6 = 0
            r0.a(r6)
        L59:
            r8.f18946k = r9
            boolean r6 = r8.J()
            if (r6 == 0) goto L66
            androidx.media3.ui.LegacyPlayerControlView r6 = r8.f18945j
            r6.g(r9)
        L66:
            r8.F()
            android.widget.TextView r6 = r8.f18944i
            if (r6 == 0) goto L79
            a7.v0 r7 = r8.f18946k
            if (r7 == 0) goto L74
            r7.n()
        L74:
            r7 = 8
            r6.setVisibility(r7)
        L79:
            r8.H(r3)
            if (r9 == 0) goto Lc3
            r3 = r9
            a7.h r3 = (a7.h) r3
            boolean r4 = r3.r(r4)
            if (r4 == 0) goto La3
            boolean r4 = r1 instanceof android.view.TextureView
            if (r4 == 0) goto L94
            android.view.TextureView r1 = (android.view.TextureView) r1
            r4 = r9
            m7.l0 r4 = (m7.l0) r4
            r4.F0(r1)
            goto La0
        L94:
            boolean r4 = r1 instanceof android.view.SurfaceView
            if (r4 == 0) goto La0
            android.view.SurfaceView r1 = (android.view.SurfaceView) r1
            r4 = r9
            m7.l0 r4 = (m7.l0) r4
            r4.E0(r1)
        La0:
            r8.E()
        La3:
            if (r0 == 0) goto Lba
            r1 = 28
            boolean r1 = r3.r(r1)
            if (r1 == 0) goto Lba
            r1 = r9
            m7.l0 r1 = (m7.l0) r1
            r1.L0()
            c7.c r1 = r1.f86260e0
            pk.c1 r1 = r1.f26702a
            r0.a(r1)
        Lba:
            m7.l0 r9 = (m7.l0) r9
            r9.M(r5)
            r8.u(r2)
            goto Lc6
        Lc3:
            r8.r()
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.LegacyPlayerView.y(androidx.media3.exoplayer.ExoPlayer):void");
    }

    public final void z(int i13) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f18937b;
        bf.b.w(aspectRatioFrameLayout);
        if (aspectRatioFrameLayout.f18872c != i13) {
            aspectRatioFrameLayout.f18872c = i13;
            aspectRatioFrameLayout.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyPlayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        int i14;
        boolean z13;
        int i15;
        int i16;
        boolean z14;
        boolean z15;
        int i17;
        boolean z16;
        int i18;
        boolean z17;
        int i19;
        boolean z18;
        boolean z19;
        int i23;
        boolean z23;
        f fVar = new f(this);
        this.f18936a = fVar;
        if (isInEditMode()) {
            this.f18937b = null;
            this.f18938c = null;
            this.f18939d = null;
            this.f18940e = false;
            this.f18941f = null;
            this.f18942g = null;
            this.f18943h = null;
            this.f18944i = null;
            this.f18945j = null;
            ImageView imageView = new ImageView(context);
            if (d7.n0.f53866a >= 23) {
                p(context, getResources(), imageView);
            } else {
                m(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i24 = j0.exo_legacy_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m0.PlayerView, i13, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(m0.PlayerView_shutter_background_color);
                int color = obtainStyledAttributes.getColor(m0.PlayerView_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(m0.PlayerView_player_layout_id, i24);
                boolean z24 = obtainStyledAttributes.getBoolean(m0.PlayerView_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(m0.PlayerView_default_artwork, 0);
                boolean z25 = obtainStyledAttributes.getBoolean(m0.PlayerView_use_controller, true);
                int i25 = obtainStyledAttributes.getInt(m0.PlayerView_surface_type, 1);
                int i26 = obtainStyledAttributes.getInt(m0.PlayerView_resize_mode, 0);
                int i27 = obtainStyledAttributes.getInt(m0.PlayerView_show_timeout, 5000);
                boolean z26 = obtainStyledAttributes.getBoolean(m0.PlayerView_hide_on_touch, true);
                boolean z27 = obtainStyledAttributes.getBoolean(m0.PlayerView_auto_show, true);
                i16 = obtainStyledAttributes.getInteger(m0.PlayerView_show_buffering, 0);
                this.f18951p = obtainStyledAttributes.getBoolean(m0.PlayerView_keep_content_on_player_reset, this.f18951p);
                boolean z28 = obtainStyledAttributes.getBoolean(m0.PlayerView_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z15 = z26;
                z13 = z27;
                i15 = i26;
                z18 = z25;
                i19 = resourceId2;
                z17 = z24;
                i18 = color;
                z16 = hasValue;
                i17 = i25;
                i24 = resourceId;
                i14 = i27;
                z14 = z28;
            } catch (Throwable th3) {
                obtainStyledAttributes.recycle();
                throw th3;
            }
        } else {
            i14 = 5000;
            z13 = true;
            i15 = 0;
            i16 = 0;
            z14 = true;
            z15 = true;
            i17 = 1;
            z16 = false;
            i18 = 0;
            z17 = true;
            i19 = 0;
            z18 = true;
        }
        LayoutInflater.from(context).inflate(i24, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(h0.exo_content_frame);
        this.f18937b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null && aspectRatioFrameLayout.f18872c != i15) {
            aspectRatioFrameLayout.f18872c = i15;
            aspectRatioFrameLayout.requestLayout();
        }
        View findViewById = findViewById(h0.exo_shutter);
        this.f18938c = findViewById;
        if (findViewById != null && z16) {
            findViewById.setBackgroundColor(i18);
        }
        if (aspectRatioFrameLayout == null || i17 == 0) {
            this.f18939d = null;
            z19 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i17 == 2) {
                this.f18939d = new TextureView(context);
            } else if (i17 == 3) {
                try {
                    this.f18939d = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    z23 = true;
                    this.f18939d.setLayoutParams(layoutParams);
                    this.f18939d.setOnClickListener(fVar);
                    this.f18939d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f18939d, 0);
                    z19 = z23;
                } catch (Exception e13) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e13);
                }
            } else if (i17 != 4) {
                this.f18939d = new SurfaceView(context);
            } else {
                try {
                    this.f18939d = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                } catch (Exception e14) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e14);
                }
            }
            z23 = false;
            this.f18939d.setLayoutParams(layoutParams);
            this.f18939d.setOnClickListener(fVar);
            this.f18939d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f18939d, 0);
            z19 = z23;
        }
        this.f18940e = z19;
        ImageView imageView2 = (ImageView) findViewById(h0.exo_artwork);
        this.f18941f = imageView2;
        this.f18948m = z17 && imageView2 != null;
        if (i19 != 0) {
            Context context2 = getContext();
            Object obj = d5.a.f53679a;
            this.f18949n = context2.getDrawable(i19);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(h0.exo_subtitles);
        this.f18942g = subtitleView;
        if (subtitleView != null) {
            subtitleView.b();
            subtitleView.c();
        }
        View findViewById2 = findViewById(h0.exo_buffering);
        this.f18943h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f18950o = i16;
        TextView textView = (TextView) findViewById(h0.exo_error_message);
        this.f18944i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        LegacyPlayerControlView legacyPlayerControlView = (LegacyPlayerControlView) findViewById(h0.exo_controller);
        View findViewById3 = findViewById(h0.exo_controller_placeholder);
        if (legacyPlayerControlView != null) {
            this.f18945j = legacyPlayerControlView;
            i23 = 0;
        } else if (findViewById3 != null) {
            i23 = 0;
            LegacyPlayerControlView legacyPlayerControlView2 = new LegacyPlayerControlView(context, null, 0, attributeSet);
            this.f18945j = legacyPlayerControlView2;
            legacyPlayerControlView2.setId(h0.exo_controller);
            legacyPlayerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(legacyPlayerControlView2, indexOfChild);
        } else {
            i23 = 0;
            this.f18945j = null;
        }
        LegacyPlayerControlView legacyPlayerControlView3 = this.f18945j;
        this.f18952q = legacyPlayerControlView3 != null ? i14 : i23;
        this.f18955t = z15;
        this.f18953r = z13;
        this.f18954s = z14;
        this.f18947l = (!z18 || legacyPlayerControlView3 == null) ? i23 : 1;
        if (legacyPlayerControlView3 != null) {
            legacyPlayerControlView3.c();
            LegacyPlayerControlView legacyPlayerControlView4 = this.f18945j;
            legacyPlayerControlView4.getClass();
            legacyPlayerControlView4.f18910b.add(fVar);
        }
        if (z18) {
            setClickable(true);
        }
        G();
    }
}
