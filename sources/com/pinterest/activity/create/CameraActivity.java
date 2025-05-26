package com.pinterest.activity.create;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.q;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.pinterest.activity.create.CameraActivity;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.ui.camera.CameraPreview;
import com.pinterest.ui.imageview.WebImageView;
import fa2.b;
import g92.g;
import h32.a4;
import h32.d4;
import java.io.File;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import m60.n0;
import me.o;
import n.e;
import np.c;
import np.d;
import np.i;
import sh.f;
import so1.a;
import xo.j;

/* loaded from: classes.dex */
public class CameraActivity extends i {

    /* renamed from: J, reason: collision with root package name */
    public static int f34890J;
    public static boolean K;
    public final q B;
    public d C;
    public final c E;

    /* renamed from: b, reason: collision with root package name */
    public CameraPreview f34891b;

    /* renamed from: c, reason: collision with root package name */
    public WebImageView f34892c;

    /* renamed from: d, reason: collision with root package name */
    public FrameLayout f34893d;

    /* renamed from: e, reason: collision with root package name */
    public LinearLayout f34894e;

    /* renamed from: f, reason: collision with root package name */
    public LinearLayout f34895f;

    /* renamed from: g, reason: collision with root package name */
    public RelativeLayout f34896g;

    /* renamed from: h, reason: collision with root package name */
    public RelativeLayout f34897h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f34898i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltButton f34899j;

    /* renamed from: k, reason: collision with root package name */
    public ImageButton f34900k;

    /* renamed from: l, reason: collision with root package name */
    public ImageButton f34901l;

    /* renamed from: m, reason: collision with root package name */
    public ImageButton f34902m;

    /* renamed from: n, reason: collision with root package name */
    public ImageButton f34903n;

    /* renamed from: o, reason: collision with root package name */
    public GestaltButton f34904o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f34905p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f34906q;

    /* renamed from: r, reason: collision with root package name */
    public a f34907r;

    /* renamed from: s, reason: collision with root package name */
    public b f34908s;

    /* renamed from: t, reason: collision with root package name */
    public int f34909t;

    /* renamed from: u, reason: collision with root package name */
    public int f34910u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34911v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34912w;

    /* renamed from: x, reason: collision with root package name */
    public File f34913x;

    /* renamed from: y, reason: collision with root package name */
    public g f34914y;

    /* renamed from: z, reason: collision with root package name */
    public lb0.q f34915z;
    public final np.g A = new np.g(this);
    public final c D = new c(this, 6);
    public final c F = new c(this, 1);
    public final c G = new c(this, 2);
    public final c H = new c(this, 3);
    public final c I = new c(this, 4);

    public CameraActivity() {
        int i13 = 0;
        this.B = new q(this, i13);
        this.E = new c(this, i13);
    }

    public static void x(CameraActivity cameraActivity, File file) {
        cameraActivity.f34896g.setVisibility(8);
        cameraActivity.f34900k.setClickable(true);
        cameraActivity.f34897h.setVisibility(0);
        cameraActivity.f34897h.getViewTreeObserver().addOnGlobalLayoutListener(new e(cameraActivity, 3));
        k3.R1(cameraActivity.f34897h, true ^ cameraActivity.f34911v);
        cameraActivity.f34891b.setClickable(false);
        cameraActivity.f34904o.d(new j(12));
        cameraActivity.f34915z.b("PREF_CAMERA_PHOTO_STATE_PATH", file.getAbsolutePath());
        cameraActivity.f34892c.P0(file, cameraActivity.f34893d.getWidth(), cameraActivity.f34893d.getHeight());
    }

    public static void y(CameraActivity cameraActivity, ImageButton imageButton, Drawable drawable) {
        cameraActivity.getClass();
        Animation loadAnimation = AnimationUtils.loadAnimation(cameraActivity, n0.anim_slide_out_bottom);
        loadAnimation.setAnimationListener(new np.e(imageButton, drawable, AnimationUtils.loadAnimation(cameraActivity, n0.anim_slide_in_top)));
        imageButton.startAnimation(loadAnimation);
    }

    public final void A(int i13, int i14) {
        Drawable drawable;
        if (i13 == 0) {
            int i15 = f80.a.ic_camera_rear_nonpds;
            Object obj = d5.a.f53679a;
            drawable = getDrawable(i15);
        } else {
            int i16 = f80.a.ic_camera_front_nonpds;
            Object obj2 = d5.a.f53679a;
            drawable = getDrawable(i16);
        }
        ImageButton imageButton = this.f34901l;
        Context context = imageButton.getContext();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int t13 = b7.c.t(context, i14, 0);
        if (t13 != 0) {
            drawable = drawable.mutate();
            Intrinsics.checkNotNullExpressionValue(drawable, "mutate(...)");
            drawable.setTint(t13);
        }
        imageButton.setImageDrawable(drawable);
    }

    public final void B() {
        this.f34900k.setClickable(false);
        this.f34895f.setVisibility(8);
        this.f34898i.setVisibility(8);
        if (fa2.c.i() && this.f34891b.c()) {
            this.f34891b.d(false);
            fa2.c.m(this.f34910u);
            fa2.c.f().takePicture(null, null, this.A);
        }
    }

    @Override // cp1.p, uo1.a
    public final a getBaseActivityComponent() {
        return this.f34907r;
    }

    @Override // cp1.p
    public final Fragment getFragment() {
        return getSupportFragmentManager().E(ry1.c.fragment_wrapper);
    }

    @Override // cp1.p, uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getH0() {
        return a4.CAMERA_MEDIA_CREATE;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF87097a0() {
        return d4.CAMERA;
    }

    @Override // cp1.p
    public final void init() {
        int color;
        final int i13 = 0;
        K = false;
        fa2.c.c();
        int g13 = this.f34915z.g("PREFS_KEY_CAMERA_ID", 0);
        f34890J = g13;
        A(g13, eo1.a.color_white_mochimalist_0_opacity_80);
        ImageButton imageButton = this.f34903n;
        imageButton.setImageDrawable(f.c(imageButton.getContext(), f80.a.ic_flash_off_nonpds, eo1.a.color_white_mochimalist_0_opacity_80));
        ImageView imageView = this.f34905p;
        imageView.setImageDrawable(f.c(imageView.getContext(), ry1.b.ic_more_horiz_nonpds, eo1.a.base_color_grayscale_0));
        this.f34891b = new CameraPreview(this);
        this.f34892c = new WebImageView(this);
        this.f34893d.addView(this.f34891b);
        this.f34893d.addView(this.f34892c);
        CameraPreview.a(this.f34893d);
        DisplayMetrics c13 = hf0.b.c();
        int i14 = (int) (c13.density * 107.0f);
        if ((c13.widthPixels * 1.3333333333333333d) + i14 > c13.heightPixels) {
            ViewGroup.LayoutParams layoutParams = this.f34893d.getLayoutParams();
            int i15 = c13.heightPixels - i14;
            layoutParams.height = i15;
            layoutParams.width = (int) (i15 * 0.75d);
            this.f34893d.setLayoutParams(layoutParams);
        }
        this.f34903n.setOnClickListener(this.F);
        this.f34902m.setOnClickListener(this.I);
        this.f34898i.setOnClickListener(this.H);
        this.f34904o.d(new j(13)).e(new gm1.a(this) { // from class: np.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraActivity f91679b;

            {
                this.f91679b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i16 = i13;
                CameraActivity cameraActivity = this.f91679b;
                switch (i16) {
                    case 0:
                        cameraActivity.G.onClick(cameraActivity.f34904o);
                        break;
                    default:
                        int i17 = CameraActivity.f34890J;
                        cameraActivity.onBackPressed();
                        break;
                }
            }
        });
        Drawable drawable = null;
        this.f34892c.setOnClickListener(null);
        final int i16 = 1;
        if (Camera.getNumberOfCameras() > 1) {
            ImageButton imageButton2 = this.f34901l;
            Context context = imageButton2.getContext();
            Drawable drawable2 = this.f34901l.getDrawable();
            int i17 = eo1.b.color_white_0;
            Intrinsics.checkNotNullParameter(context, "context");
            if (drawable2 != null) {
                if (i17 == 0) {
                    int i18 = df0.a.f54892a;
                    Object obj = d5.a.f53679a;
                    color = context.getColor(i18);
                } else {
                    Object obj2 = d5.a.f53679a;
                    color = context.getColor(i17);
                }
                drawable = f.d(color, context, drawable2);
            }
            imageButton2.setImageDrawable(drawable);
            this.f34901l.setOnClickListener(this.D);
        }
        if (fa2.c.a(this)) {
            this.f34900k.setOnClickListener(this.E);
        }
        this.f34899j.e(new gm1.a(this) { // from class: np.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraActivity f91679b;

            {
                this.f91679b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i162 = i16;
                CameraActivity cameraActivity = this.f91679b;
                switch (i162) {
                    case 0:
                        cameraActivity.G.onClick(cameraActivity.f34904o);
                        break;
                    default:
                        int i172 = CameraActivity.f34890J;
                        cameraActivity.onBackPressed();
                        break;
                }
            }
        });
        this.f34895f.setOnClickListener(new c(this, 5));
        this.C = new d(this, this);
        this.f34891b.setOnTouchListener(new kj.e(this, i16));
        if (this.f34912w) {
            this.f34904o.d(new j(11));
        }
    }

    @Override // cp1.p, androidx.activity.o, android.app.Activity
    public final void onBackPressed() {
        if (this.f34897h.getVisibility() != 0) {
            super.onBackPressed();
            return;
        }
        this.f34897h.setVisibility(8);
        this.f34896g.setVisibility(0);
        this.f34891b.setClickable(true);
        z();
        if (fa2.c.f() == null) {
            throw new IllegalStateException("Camera manager with empty camera");
        }
        fa2.c.f().startPreview();
        this.f34892c.setImageBitmap(null);
        this.f34891b.d(true);
        this.f34915z.b("PREF_CAMERA_PHOTO_STATE_PATH", "");
    }

    @Override // cp1.p, cp1.q, androidx.fragment.app.FragmentActivity, androidx.activity.o, c5.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        inject();
        this.f34914y.b(this);
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(4);
        setContentView(ry1.d.activity_camera_main);
        this.f34893d = (FrameLayout) findViewById(ry1.c.camera_preview);
        this.f34894e = (LinearLayout) findViewById(ry1.c.camera_preview_grid);
        this.f34895f = (LinearLayout) findViewById(ry1.c.settings);
        this.f34896g = (RelativeLayout) findViewById(ry1.c.capture_layout);
        this.f34897h = (RelativeLayout) findViewById(ry1.c.photo_layout);
        this.f34898i = (LinearLayout) findViewById(ry1.c.settings_button);
        this.f34899j = (GestaltButton) findViewById(ry1.c.retake_button);
        this.f34900k = (ImageButton) findViewById(ry1.c.capture_button);
        this.f34901l = (ImageButton) findViewById(ry1.c.switch_button);
        this.f34902m = (ImageButton) findViewById(ry1.c.grid_button);
        this.f34903n = (ImageButton) findViewById(ry1.c.flash_button);
        this.f34904o = (GestaltButton) findViewById(ry1.c.save_pinit_bt);
        this.f34905p = (ImageView) findViewById(ry1.c.overflow);
        this.f34906q = (ImageView) findViewById(ry1.c.flash_indicator);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f34911v = extras.getBoolean("com.pinterest.DID_IT_GALLERY", false);
            this.f34912w = extras.getBoolean("com.pinterest.EXTRA_IS_COMMENT_PHOTO", false);
        }
        init();
    }

    @Override // cp1.p, cp1.q, androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.f34915z.b("PREF_CAMERA_PHOTO_STATE_PATH", "");
        super.onDestroy();
    }

    @Override // cp1.p, androidx.appcompat.app.n, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (i13 == 25 || i13 == 24) {
            return true;
        }
        return super.onKeyDown(i13, keyEvent);
    }

    @Override // cp1.p, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i13, KeyEvent keyEvent) {
        if (i13 != 25 && i13 != 24) {
            return super.onKeyUp(i13, keyEvent);
        }
        if (!this.f34900k.isClickable()) {
            return true;
        }
        B();
        return true;
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        b bVar = this.f34908s;
        if (bVar != null) {
            bVar.cancel(true);
        }
        fa2.c.d(this.f34891b);
        this.C.disable();
        super.onPause();
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.C.enable();
        if (fa2.c.a(this)) {
            b bVar = this.f34908s;
            if (bVar != null && bVar.a()) {
                this.f34908s.cancel(true);
            }
            b bVar2 = new b(this, f34890J, this.f34891b, this.B);
            this.f34908s = bVar2;
            bVar2.execute(new Void[0]);
        }
    }

    @Override // androidx.appcompat.app.n, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        this.f34915z.i("PREFS_KEY_CAMERA_ID", f34890J);
        super.onStop();
    }

    public void setHeightOfCameraControls(View view) {
        int i13 = this.f34893d.getLayoutParams().height;
        int i14 = (int) (hf0.b.f69003c - i13);
        if (i14 > view.getHeight()) {
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(hf0.b.f69002b, i14);
            layoutParams.f17677l = ry1.c.camera_container;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // cp1.p
    public final void setupActivityComponent() {
        if (this.f34907r == null) {
            this.f34907r = (a) o.a(this, a.class);
        }
    }

    public final void z() {
        if (fa2.c.i()) {
            this.f34895f.clearAnimation();
            int i13 = 0;
            this.f34898i.setVisibility(0);
            if (this.f34895f.getVisibility() != 0) {
                this.f34895f.setVisibility(8);
                return;
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(this, ry1.a.anim_scale_and_fade_out);
            loadAnimation.setAnimationListener(new np.f(this, i13));
            this.f34895f.startAnimation(loadAnimation);
        }
    }
}
