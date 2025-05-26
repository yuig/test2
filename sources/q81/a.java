package q81;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.component.camera.WhiteFlashView;
import com.pinterest.feature.camera2.view.BasePreviewCameraView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.lens.FullScreenPhotoCameraView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.d4;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import l11.p;
import m60.r0;
import m81.b;
import nx.d0;
import rm1.q;
import rq.o2;
import uc2.c;
import uc2.d;
import uc2.f;
import uc2.h;
import v.i0;
import x61.e;

/* loaded from: classes5.dex */
public final class a extends RelativeLayout implements b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f103013h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FragmentActivity f103014a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIconButton f103015b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f103016c;

    /* renamed from: d, reason: collision with root package name */
    public final FullScreenPhotoCameraView f103017d;

    /* renamed from: e, reason: collision with root package name */
    public final WhiteFlashView f103018e;

    /* renamed from: f, reason: collision with root package name */
    public m81.a f103019f;

    /* renamed from: g, reason: collision with root package name */
    public final d4 f103020g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, FragmentActivity hostActivity, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hostActivity, "hostActivity");
        this.f103014a = hostActivity;
        View inflate = LayoutInflater.from(context).inflate(f.lens_camera2_view, this);
        View findViewById = inflate.findViewById(d.camera_top_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        View findViewById2 = inflate.findViewById(d.camera_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f103017d = (FullScreenPhotoCameraView) findViewById2;
        View findViewById3 = inflate.findViewById(d.flash_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById3;
        this.f103015b = gestaltIconButton;
        View findViewById4 = inflate.findViewById(d.white_flash);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f103018e = (WhiteFlashView) findViewById4;
        int i13 = c.ic_camera_flip_nonpds;
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i13);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        imageView.setColorFilter(dl2.b.y0(imageView, eo1.a.base_color_grayscale_0), PorterDuff.Mode.SRC_IN);
        imageView.setContentDescription(imageView.getResources().getString(h.image_button_flip_camera));
        this.f103016c = imageView;
        if (drawable != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (z13) {
                layoutParams.addRule(16, d.flash_bt);
                layoutParams.topMargin = getResources().getDimensionPixelSize(uc2.b.lens_15_top_icons_vertical_margin);
                layoutParams.setMarginEnd(getResources().getDimensionPixelSize(r0.margin_double));
                relativeLayout.addView(imageView, layoutParams);
            } else {
                layoutParams.addRule(12);
                layoutParams.addRule(21);
                int dimensionPixelSize = getResources().getDimensionPixelSize(uc2.b.lens_shutter_size);
                layoutParams.bottomMargin = ((dimensionPixelSize - drawable.getIntrinsicHeight()) / 2) + getResources().getDimensionPixelSize(uc2.b.lens_15_camera_controls_margin);
                float f13 = hf0.b.f69002b - dimensionPixelSize;
                float f14 = 2;
                layoutParams.setMarginEnd((int) (((f13 / f14) - drawable.getIntrinsicWidth()) / f14));
                addView(imageView, layoutParams);
            }
        }
        gestaltIconButton.u(new p(this, 19));
        imageView.setOnClickListener(new e(this, 15));
        this.f103020g = d4.FLASHLIGHT_CAMERA;
    }

    public final FullScreenPhotoCameraView a() {
        return this.f103017d;
    }

    public final void b() {
        FullScreenPhotoCameraView fullScreenPhotoCameraView = this.f103017d;
        fullScreenPhotoCameraView.b();
        fullScreenPhotoCameraView.p();
    }

    public final void e() {
        m81.h hVar;
        FullScreenPhotoCameraView fullScreenPhotoCameraView = this.f103017d;
        fullScreenPhotoCameraView.getClass();
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        handlerThread.start();
        fullScreenPhotoCameraView.f45428k = new Handler(handlerThread.getLooper());
        fullScreenPhotoCameraView.f45427j = handlerThread;
        if (fullScreenPhotoCameraView.isAvailable()) {
            FragmentActivity fragmentActivity = ((m81.d) fullScreenPhotoCameraView.g()).f86531a;
            if (fragmentActivity != null) {
                fullScreenPhotoCameraView.n(fragmentActivity, fullScreenPhotoCameraView.getWidth(), fullScreenPhotoCameraView.getHeight());
            }
        } else {
            fullScreenPhotoCameraView.setSurfaceTextureListener(fullScreenPhotoCameraView.f45432o);
        }
        m81.a aVar = this.f103019f;
        if (aVar == null || (hVar = ((m81.d) aVar).f86532b) == null) {
            return;
        }
        ((s81.p) hVar).j4(true);
    }

    public final void g() {
        m81.a aVar = this.f103019f;
        if (aVar != null) {
            m81.d dVar = (m81.d) aVar;
            d0 pinalytics = dVar.getPinalytics();
            f1 f1Var = f1.TAP;
            u0 u0Var = u0.FLASHLIGHT_CAMERA_SCOPE;
            HashMap hashMap = new HashMap();
            hashMap.put("camera_direction", dVar.f86533c == 0 ? "back" : "front");
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : "", (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            a aVar2 = (a) ((b) dVar.getView());
            aVar2.f103015b.setEnabled(false);
            aVar2.f103016c.setEnabled(false);
            aVar2.f103018e.a();
            FullScreenPhotoCameraView fullScreenPhotoCameraView = aVar2.f103017d;
            if (fullScreenPhotoCameraView.f45433z) {
                return;
            }
            try {
                CaptureRequest.Builder builder = fullScreenPhotoCameraView.f45435q;
                if (builder != null) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                    builder.set(key, 1);
                    BasePreviewCameraView.r(fullScreenPhotoCameraView, builder);
                    fullScreenPhotoCameraView.f45433z = true;
                    fullScreenPhotoCameraView.A = ep0.b.WAITING_LOCK;
                    CameraCaptureSession cameraCaptureSession = fullScreenPhotoCameraView.f45425h;
                    i0 i0Var = fullScreenPhotoCameraView.E;
                    if (cameraCaptureSession != null) {
                        cameraCaptureSession.capture(builder.build(), i0Var, fullScreenPhotoCameraView.f45428k);
                    }
                    builder.set(key, 0);
                    CameraCaptureSession cameraCaptureSession2 = fullScreenPhotoCameraView.f45425h;
                    if (cameraCaptureSession2 != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), i0Var, fullScreenPhotoCameraView.f45428k);
                    }
                }
            } catch (CameraAccessException e13) {
                ((m81.d) ((dp0.b) fullScreenPhotoCameraView.g())).p3(dp0.a.CAPTURE_PICTURE, e13);
            }
        }
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getQ0() {
        return this.f103020g;
    }

    public final void i(q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f103015b.t(new o2(icon, 18));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f103019f = null;
        super.onDetachedFromWindow();
    }

    @Override // yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
    }
}
