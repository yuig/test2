package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
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
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;

/* loaded from: classes3.dex */
public class PlayerView extends FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f18983p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b0 f18984a;

    /* renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f18985b;

    /* renamed from: c, reason: collision with root package name */
    public final View f18986c;

    /* renamed from: d, reason: collision with root package name */
    public final View f18987d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f18988e;

    /* renamed from: f, reason: collision with root package name */
    public final SubtitleView f18989f;

    /* renamed from: g, reason: collision with root package name */
    public final View f18990g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f18991h;

    /* renamed from: i, reason: collision with root package name */
    public final PlayerControlView f18992i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f18993j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f18994k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18995l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18996m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18997n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f18998o;

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        if (d()) {
            PlayerControlView playerControlView = this.f18992i;
            if (playerControlView.b()) {
                int i13 = playerControlView.Q;
            }
            if (d()) {
                playerControlView.Q = 0;
                boolean b13 = playerControlView.b();
                x xVar = playerControlView.f18957a;
                if (b13) {
                    xVar.g();
                }
                PlayerControlView playerControlView2 = xVar.f19116a;
                if (!playerControlView2.c()) {
                    playerControlView2.setVisibility(0);
                    playerControlView2.f();
                    playerControlView2.e();
                    playerControlView2.h();
                    playerControlView2.j();
                    i iVar = playerControlView2.f18963g;
                    iVar.getClass();
                    iVar.f19102d = Collections.emptyList();
                    i iVar2 = playerControlView2.f18964h;
                    iVar2.getClass();
                    iVar2.f19102d = Collections.emptyList();
                    playerControlView2.d(playerControlView2.f18974r, iVar.e() > 0);
                    n nVar = playerControlView2.f18961e;
                    nVar.getClass();
                    nVar.f19058g.getClass();
                    playerControlView2.d(playerControlView2.f18977u, false);
                    ImageView imageView = playerControlView2.f18969m;
                    if (imageView != null) {
                        imageView.requestFocus();
                    }
                }
                xVar.k();
            }
        }
    }

    public final void b() {
        PlayerControlView playerControlView = this.f18992i;
        if (playerControlView == null || !this.f18995l) {
            setContentDescription(null);
        } else if (playerControlView.b()) {
            setContentDescription(this.f18998o ? getResources().getString(k0.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(k0.exo_controls_show));
        }
    }

    public final void c() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f18988e;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float f13 = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f18996m == 1) {
            f13 = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f18985b) != null && aspectRatioFrameLayout.f18871b != f13) {
            aspectRatioFrameLayout.f18871b = f13;
            aspectRatioFrameLayout.requestLayout();
        }
        imageView.setScaleType(scaleType);
    }

    public final boolean d() {
        if (!this.f18995l) {
            return false;
        }
        bf.b.w(this.f18992i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i13 = d7.n0.f53866a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z13 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.f18992i;
        if (z13 && d() && !playerControlView.b()) {
            a();
        } else {
            if (d()) {
                playerControlView.getClass();
                keyEvent.getKeyCode();
            }
            if (!super.dispatchKeyEvent(keyEvent)) {
                if (!z13 || !d()) {
                    return false;
                }
                a();
                return false;
            }
            a();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        d();
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        d();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        View view = this.f18987d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i13);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        int i17;
        int i18;
        boolean z15;
        Object obj;
        boolean z16;
        b0 b0Var = new b0(this);
        this.f18984a = b0Var;
        this.f18993j = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f18985b = null;
            this.f18986c = null;
            this.f18987d = null;
            this.f18988e = null;
            this.f18989f = null;
            this.f18990g = null;
            this.f18991h = null;
            this.f18992i = null;
            ImageView imageView = new ImageView(context);
            if (d7.n0.f53866a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(f0.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(d0.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(f0.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(d0.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i19 = j0.exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m0.PlayerView, i13, 0);
            try {
                z14 = obtainStyledAttributes.hasValue(m0.PlayerView_shutter_background_color);
                i16 = obtainStyledAttributes.getColor(m0.PlayerView_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(m0.PlayerView_player_layout_id, i19);
                obtainStyledAttributes.getBoolean(m0.PlayerView_use_artwork, true);
                obtainStyledAttributes.getInt(m0.PlayerView_artwork_display_mode, 1);
                i17 = obtainStyledAttributes.getResourceId(m0.PlayerView_default_artwork, 0);
                i18 = obtainStyledAttributes.getInt(m0.PlayerView_image_display_mode, 0);
                z15 = obtainStyledAttributes.getBoolean(m0.PlayerView_use_controller, true);
                i14 = obtainStyledAttributes.getInt(m0.PlayerView_surface_type, 1);
                i15 = obtainStyledAttributes.getInt(m0.PlayerView_resize_mode, 0);
                obtainStyledAttributes.getInt(m0.PlayerView_show_timeout, 5000);
                boolean z17 = obtainStyledAttributes.getBoolean(m0.PlayerView_hide_on_touch, true);
                obtainStyledAttributes.getBoolean(m0.PlayerView_auto_show, true);
                obtainStyledAttributes.getInteger(m0.PlayerView_show_buffering, 0);
                this.f18997n = obtainStyledAttributes.getBoolean(m0.PlayerView_keep_content_on_player_reset, this.f18997n);
                obtainStyledAttributes.getBoolean(m0.PlayerView_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                i19 = resourceId;
                z13 = z17;
            } catch (Throwable th3) {
                obtainStyledAttributes.recycle();
                throw th3;
            }
        } else {
            i14 = 1;
            z13 = true;
            i15 = 0;
            z14 = false;
            i16 = 0;
            i17 = 0;
            i18 = 0;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i19, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(h0.exo_content_frame);
        this.f18985b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null && aspectRatioFrameLayout.f18872c != i15) {
            aspectRatioFrameLayout.f18872c = i15;
            aspectRatioFrameLayout.requestLayout();
        }
        View findViewById = findViewById(h0.exo_shutter);
        this.f18986c = findViewById;
        if (findViewById != null && z14) {
            findViewById.setBackgroundColor(i16);
        }
        if (aspectRatioFrameLayout == null || i14 == 0) {
            this.f18987d = null;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i14 == 2) {
                this.f18987d = new TextureView(context);
            } else if (i14 == 3) {
                try {
                    int i23 = SphericalGLSurfaceView.f18857l;
                    this.f18987d = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e13) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e13);
                }
            } else if (i14 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (d7.n0.f53866a >= 34) {
                    surfaceView.setSurfaceLifecycle(2);
                }
                this.f18987d = surfaceView;
            } else {
                try {
                    int i24 = VideoDecoderGLSurfaceView.f18855a;
                    this.f18987d = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e14) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e14);
                }
            }
            this.f18987d.setLayoutParams(layoutParams);
            this.f18987d.setOnClickListener(b0Var);
            this.f18987d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f18987d, 0);
        }
        int i25 = d7.n0.f53866a;
        this.f18988e = (ImageView) findViewById(h0.exo_image);
        this.f18996m = i18;
        try {
            ExoPlayer.class.getMethod("setImageOutput", ImageOutput.class);
            obj = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: androidx.media3.ui.y
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    int i26 = PlayerView.f18983p;
                    PlayerView playerView = PlayerView.this;
                    playerView.getClass();
                    if (!method.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    playerView.f18993j.post(new z(0, playerView, (Bitmap) objArr[1]));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            obj = null;
        }
        this.f18994k = obj;
        if (i17 != 0) {
            Context context2 = getContext();
            Object obj2 = d5.a.f53679a;
            context2.getDrawable(i17);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(h0.exo_subtitles);
        this.f18989f = subtitleView;
        if (subtitleView != null) {
            subtitleView.b();
            subtitleView.c();
        }
        View findViewById2 = findViewById(h0.exo_buffering);
        this.f18990g = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        TextView textView = (TextView) findViewById(h0.exo_error_message);
        this.f18991h = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(h0.exo_controller);
        View findViewById3 = findViewById(h0.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f18992i = playerControlView;
            z16 = false;
        } else if (findViewById3 != null) {
            z16 = false;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f18992i = playerControlView2;
            playerControlView2.setId(h0.exo_controller);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            z16 = false;
            this.f18992i = null;
        }
        PlayerControlView playerControlView3 = this.f18992i;
        this.f18998o = z13;
        this.f18995l = (!z15 || playerControlView3 == null) ? z16 : true;
        if (playerControlView3 != null) {
            x xVar = playerControlView3.f18957a;
            int i26 = xVar.f19141z;
            if (i26 != 3 && i26 != 2) {
                xVar.f();
                xVar.i(2);
            }
            PlayerControlView playerControlView4 = this.f18992i;
            b0 b0Var2 = this.f18984a;
            playerControlView4.getClass();
            b0Var2.getClass();
            playerControlView4.f18959c.add(b0Var2);
        }
        if (z15) {
            setClickable(true);
        }
        b();
    }
}
