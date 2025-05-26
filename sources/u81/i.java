package u81;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.component.camera.WhiteFlashView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.camera.CameraPreview;
import h32.d4;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.PipelineThreadListener;
import net.quikkly.android.Quikkly;

/* loaded from: classes5.dex */
public final class i extends RelativeLayout implements m81.f {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f121029o = 0;

    /* renamed from: a, reason: collision with root package name */
    public final m81.r f121030a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIconButton f121031b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIconButton f121032c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIconButton f121033d;

    /* renamed from: e, reason: collision with root package name */
    public final CameraPreview f121034e;

    /* renamed from: f, reason: collision with root package name */
    public final WhiteFlashView f121035f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f121036g;

    /* renamed from: h, reason: collision with root package name */
    public final Quikkly f121037h;

    /* renamed from: i, reason: collision with root package name */
    public fa2.b f121038i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.appcompat.widget.q f121039j;

    /* renamed from: k, reason: collision with root package name */
    public m81.e f121040k;

    /* renamed from: l, reason: collision with root package name */
    public final d4 f121041l;

    /* renamed from: m, reason: collision with root package name */
    public f f121042m;

    /* renamed from: n, reason: collision with root package name */
    public PipelineThreadListener f121043n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, boolean z13, m81.r rVar, ll.j pincodesUtil) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pincodesUtil, "pincodesUtil");
        this.f121030a = rVar;
        boolean t13 = ll.j.t();
        this.f121036g = t13;
        final int i13 = 1;
        this.f121039j = new androidx.appcompat.widget.q(this, i13);
        View inflate = LayoutInflater.from(context).inflate(uc2.f.lens_camera_view, this);
        View findViewById = inflate.findViewById(uc2.d.camera_top_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        View findViewById2 = inflate.findViewById(uc2.d.camera_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f121034e = (CameraPreview) findViewById2;
        View findViewById3 = inflate.findViewById(uc2.d.flash_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById3;
        this.f121031b = gestaltIconButton;
        View findViewById4 = inflate.findViewById(uc2.d.lens_history_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) findViewById4;
        this.f121033d = gestaltIconButton2;
        View findViewById5 = inflate.findViewById(uc2.d.white_flash);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f121035f = (WhiteFlashView) findViewById5;
        int drawableRes = rm1.q.CAMERA_FLIP.getDrawableRes();
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(drawableRes);
        GestaltIconButton t14 = new GestaltIconButton(6, context, (AttributeSet) null).t(c.f121002k);
        this.f121032c = t14;
        final int i14 = 2;
        final int i15 = 0;
        if (drawable != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (z13) {
                layoutParams.addRule(16, uc2.d.lens_history_icon);
                layoutParams.topMargin = getResources().getDimensionPixelSize(eo1.c.space_500);
                layoutParams.setMarginEnd(getResources().getDimensionPixelSize(eo1.c.space_200));
                setPaddingRelative(0, 0, 0, getResources().getDimensionPixelSize(eo1.c.space_200));
                relativeLayout.addView(t14, layoutParams);
            } else {
                layoutParams.addRule(12);
                layoutParams.addRule(21);
                int dimensionPixelSize = getResources().getDimensionPixelSize(uc2.b.lens_shutter_size);
                layoutParams.bottomMargin = ((dimensionPixelSize - drawable.getIntrinsicHeight()) / 2) + getResources().getDimensionPixelSize(eo1.c.space_1000);
                float f13 = hf0.b.f69002b - dimensionPixelSize;
                float f14 = 2;
                layoutParams.setMarginEnd(((int) (((f13 / f14) - drawable.getIntrinsicWidth()) / f14)) - getResources().getDimensionPixelSize(eo1.c.space_100));
                addView(t14, layoutParams);
            }
        }
        if (t13) {
            this.f121037h = ll.j.r(getContext());
        }
        gestaltIconButton.u(new gm1.a(this) { // from class: u81.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f121018b;

            {
                this.f121018b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                Camera camera;
                m81.e eVar;
                m81.e eVar2;
                m81.r rVar2;
                int i16 = i15;
                i this$0 = this.f121018b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.getClass();
                            if (fa2.c.i() && (camera = fa2.c.f61593a) != null && camera.getParameters() != null && !fa2.c.f61601i && fa2.c.i() && (eVar = this$0.f121040k) != null) {
                                s81.b bVar = (s81.b) eVar;
                                bVar.getPinalytics().X(u0.FLASHLIGHT_CAMERA_TORCH_BUTTON);
                                ArrayList arrayList = bVar.f111890f;
                                if (!arrayList.isEmpty()) {
                                    int size = bVar.f111889e % arrayList.size();
                                    bVar.f111889e = size;
                                    Object obj2 = arrayList.get(size);
                                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                    bVar.f111887c = (String) obj2;
                                }
                                rm1.q qVar = rm1.q.FLASH;
                                String str = bVar.f111887c;
                                int hashCode = str.hashCode();
                                if (hashCode == 3551) {
                                    str.equals("on");
                                } else if (hashCode != 109935) {
                                    if (hashCode == 3005871 && str.equals("auto")) {
                                        qVar = rm1.q.FLASH_AUTOMATIC;
                                    }
                                } else if (str.equals("off")) {
                                    qVar = rm1.q.FLASH_SLASH;
                                }
                                i iVar = (i) ((m81.f) bVar.getView());
                                iVar.k(bVar.f111887c);
                                iVar.m(qVar);
                                Camera camera2 = fa2.c.f61593a;
                                if (camera2 != null) {
                                    camera2.startPreview();
                                }
                                bVar.f111889e++;
                                break;
                            }
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (eVar2 = this$0.f121040k) != null) {
                            s81.b bVar2 = (s81.b) eVar2;
                            bVar2.getPinalytics().X(u0.FLASHLIGHT_CAMERA_ROTATE_CAMERA_BUTTON);
                            boolean z14 = false;
                            byte b13 = 0;
                            bVar2.f111888d = bVar2.f111888d == 0 ? 1 : 0;
                            i iVar2 = (i) ((m81.f) bVar2.getView());
                            iVar2.getClass();
                            h hVar = new h(z14, b13 == true ? 1 : 0);
                            GestaltIconButton gestaltIconButton3 = iVar2.f121032c;
                            gestaltIconButton3.t(hVar);
                            iVar2.l(false);
                            iVar2.f121034e.f52246f = false;
                            iVar2.a(bVar2.f111888d);
                            kg.a.b(gestaltIconButton3);
                            int i17 = bVar2.f111888d;
                            GestaltIconButton gestaltIconButton4 = iVar2.f121031b;
                            if (i17 != 1) {
                                gestaltIconButton4.setAlpha(1.0f);
                                iVar2.l(true);
                                break;
                            } else {
                                iVar2.m(rm1.q.FLASH);
                                gestaltIconButton4.setAlpha(0.5f);
                                iVar2.l(false);
                                break;
                            }
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (rVar2 = this$0.f121030a) != null) {
                            s81.p pVar = (s81.p) rVar2;
                            pVar.g4(s81.h.GALLERY_OR_HISTORY);
                            pVar.e4(m81.g.HISTORY);
                            break;
                        }
                        break;
                }
            }
        });
        t14.u(new gm1.a(this) { // from class: u81.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f121018b;

            {
                this.f121018b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                Camera camera;
                m81.e eVar;
                m81.e eVar2;
                m81.r rVar2;
                int i16 = i13;
                i this$0 = this.f121018b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.getClass();
                            if (fa2.c.i() && (camera = fa2.c.f61593a) != null && camera.getParameters() != null && !fa2.c.f61601i && fa2.c.i() && (eVar = this$0.f121040k) != null) {
                                s81.b bVar = (s81.b) eVar;
                                bVar.getPinalytics().X(u0.FLASHLIGHT_CAMERA_TORCH_BUTTON);
                                ArrayList arrayList = bVar.f111890f;
                                if (!arrayList.isEmpty()) {
                                    int size = bVar.f111889e % arrayList.size();
                                    bVar.f111889e = size;
                                    Object obj2 = arrayList.get(size);
                                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                    bVar.f111887c = (String) obj2;
                                }
                                rm1.q qVar = rm1.q.FLASH;
                                String str = bVar.f111887c;
                                int hashCode = str.hashCode();
                                if (hashCode == 3551) {
                                    str.equals("on");
                                } else if (hashCode != 109935) {
                                    if (hashCode == 3005871 && str.equals("auto")) {
                                        qVar = rm1.q.FLASH_AUTOMATIC;
                                    }
                                } else if (str.equals("off")) {
                                    qVar = rm1.q.FLASH_SLASH;
                                }
                                i iVar = (i) ((m81.f) bVar.getView());
                                iVar.k(bVar.f111887c);
                                iVar.m(qVar);
                                Camera camera2 = fa2.c.f61593a;
                                if (camera2 != null) {
                                    camera2.startPreview();
                                }
                                bVar.f111889e++;
                                break;
                            }
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (eVar2 = this$0.f121040k) != null) {
                            s81.b bVar2 = (s81.b) eVar2;
                            bVar2.getPinalytics().X(u0.FLASHLIGHT_CAMERA_ROTATE_CAMERA_BUTTON);
                            boolean z14 = false;
                            byte b13 = 0;
                            bVar2.f111888d = bVar2.f111888d == 0 ? 1 : 0;
                            i iVar2 = (i) ((m81.f) bVar2.getView());
                            iVar2.getClass();
                            h hVar = new h(z14, b13 == true ? 1 : 0);
                            GestaltIconButton gestaltIconButton3 = iVar2.f121032c;
                            gestaltIconButton3.t(hVar);
                            iVar2.l(false);
                            iVar2.f121034e.f52246f = false;
                            iVar2.a(bVar2.f111888d);
                            kg.a.b(gestaltIconButton3);
                            int i17 = bVar2.f111888d;
                            GestaltIconButton gestaltIconButton4 = iVar2.f121031b;
                            if (i17 != 1) {
                                gestaltIconButton4.setAlpha(1.0f);
                                iVar2.l(true);
                                break;
                            } else {
                                iVar2.m(rm1.q.FLASH);
                                gestaltIconButton4.setAlpha(0.5f);
                                iVar2.l(false);
                                break;
                            }
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (rVar2 = this$0.f121030a) != null) {
                            s81.p pVar = (s81.p) rVar2;
                            pVar.g4(s81.h.GALLERY_OR_HISTORY);
                            pVar.e4(m81.g.HISTORY);
                            break;
                        }
                        break;
                }
            }
        });
        gestaltIconButton2.u(new gm1.a(this) { // from class: u81.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f121018b;

            {
                this.f121018b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                Camera camera;
                m81.e eVar;
                m81.e eVar2;
                m81.r rVar2;
                int i16 = i14;
                i this$0 = this.f121018b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.getClass();
                            if (fa2.c.i() && (camera = fa2.c.f61593a) != null && camera.getParameters() != null && !fa2.c.f61601i && fa2.c.i() && (eVar = this$0.f121040k) != null) {
                                s81.b bVar = (s81.b) eVar;
                                bVar.getPinalytics().X(u0.FLASHLIGHT_CAMERA_TORCH_BUTTON);
                                ArrayList arrayList = bVar.f111890f;
                                if (!arrayList.isEmpty()) {
                                    int size = bVar.f111889e % arrayList.size();
                                    bVar.f111889e = size;
                                    Object obj2 = arrayList.get(size);
                                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                    bVar.f111887c = (String) obj2;
                                }
                                rm1.q qVar = rm1.q.FLASH;
                                String str = bVar.f111887c;
                                int hashCode = str.hashCode();
                                if (hashCode == 3551) {
                                    str.equals("on");
                                } else if (hashCode != 109935) {
                                    if (hashCode == 3005871 && str.equals("auto")) {
                                        qVar = rm1.q.FLASH_AUTOMATIC;
                                    }
                                } else if (str.equals("off")) {
                                    qVar = rm1.q.FLASH_SLASH;
                                }
                                i iVar = (i) ((m81.f) bVar.getView());
                                iVar.k(bVar.f111887c);
                                iVar.m(qVar);
                                Camera camera2 = fa2.c.f61593a;
                                if (camera2 != null) {
                                    camera2.startPreview();
                                }
                                bVar.f111889e++;
                                break;
                            }
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (eVar2 = this$0.f121040k) != null) {
                            s81.b bVar2 = (s81.b) eVar2;
                            bVar2.getPinalytics().X(u0.FLASHLIGHT_CAMERA_ROTATE_CAMERA_BUTTON);
                            boolean z14 = false;
                            byte b13 = 0;
                            bVar2.f111888d = bVar2.f111888d == 0 ? 1 : 0;
                            i iVar2 = (i) ((m81.f) bVar2.getView());
                            iVar2.getClass();
                            h hVar = new h(z14, b13 == true ? 1 : 0);
                            GestaltIconButton gestaltIconButton3 = iVar2.f121032c;
                            gestaltIconButton3.t(hVar);
                            iVar2.l(false);
                            iVar2.f121034e.f52246f = false;
                            iVar2.a(bVar2.f111888d);
                            kg.a.b(gestaltIconButton3);
                            int i17 = bVar2.f111888d;
                            GestaltIconButton gestaltIconButton4 = iVar2.f121031b;
                            if (i17 != 1) {
                                gestaltIconButton4.setAlpha(1.0f);
                                iVar2.l(true);
                                break;
                            } else {
                                iVar2.m(rm1.q.FLASH);
                                gestaltIconButton4.setAlpha(0.5f);
                                iVar2.l(false);
                                break;
                            }
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (rVar2 = this$0.f121030a) != null) {
                            s81.p pVar = (s81.p) rVar2;
                            pVar.g4(s81.h.GALLERY_OR_HISTORY);
                            pVar.e4(m81.g.HISTORY);
                            break;
                        }
                        break;
                }
            }
        });
        this.f121041l = d4.FLASHLIGHT_CAMERA;
    }

    public final void a(int i13) {
        fa2.c.f61599g = true;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity k03 = bs1.c.k0(context);
        CameraPreview cameraPreview = this.f121034e;
        fa2.b bVar = new fa2.b(k03, i13, cameraPreview, this.f121039j);
        this.f121038i = bVar;
        cameraPreview.f52244d = i13;
        bVar.execute(new Void[0]);
    }

    public final GestaltIconButton b() {
        return this.f121033d;
    }

    public final void e() {
        m81.e eVar = this.f121040k;
        if (eVar != null) {
            i iVar = (i) ((m81.f) ((s81.b) eVar).getView());
            fa2.b bVar = iVar.f121038i;
            if (bVar != null) {
                bVar.cancel(true);
            }
            if (fa2.c.f61601i) {
                return;
            }
            fa2.c.d(iVar.f121034e);
        }
    }

    public final void g() {
        i();
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getJ0() {
        return this.f121041l;
    }

    public final void i() {
        fa2.b bVar = this.f121038i;
        if ((bVar == null || !bVar.f61589b) && fa2.c.a(getContext())) {
            m81.e eVar = this.f121040k;
            if (eVar != null) {
                s81.b bVar2 = (s81.b) eVar;
                bVar2.f111892h = false;
                if (!bVar2.f111893i) {
                    bVar2.f111893i = true;
                    i iVar = (i) ((m81.f) bVar2.getView());
                    if (iVar.f121036g && iVar.f121037h != null && iVar.f121042m == null) {
                        f fVar = new f(iVar);
                        iVar.f121042m = fVar;
                        iVar.f121034e.f52245e = fVar;
                    }
                }
                i iVar2 = (i) ((m81.f) bVar2.getView());
                iVar2.a(bVar2.f111888d);
                m81.h hVar = bVar2.f111886b;
                if (hVar != null) {
                    ((s81.p) hVar).j4(true);
                }
                bs1.c.R1(iVar2.f121034e, true);
                bVar2.f111891g = true;
            }
            com.bumptech.glide.c.u1(this.f121032c);
            com.bumptech.glide.c.u1(this.f121031b);
        }
    }

    public final void j() {
        m81.e eVar;
        this.f121035f.a();
        if (this.f121034e.f52243c && fa2.c.i() && (eVar = this.f121040k) != null) {
            s81.b bVar = (s81.b) eVar;
            nx.d0 pinalytics = bVar.getPinalytics();
            f1 f1Var = f1.TAP;
            u0 u0Var = u0.FLASHLIGHT_CAMERA_SCOPE;
            HashMap hashMap = new HashMap();
            hashMap.put("flash", bVar.f111887c);
            hashMap.put("camera_direction", bVar.f111888d == 0 ? "back" : "front");
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : "", (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            if (bVar.f111891g) {
                new uy.t().i();
                new uy.r().i();
                try {
                    ((i) ((m81.f) bVar.getView())).l(false);
                    Camera camera = fa2.c.f61593a;
                    if (camera != null) {
                        camera.takePicture(null, null, bVar.f111895k);
                    }
                    bVar.f111891g = false;
                } catch (Exception e13) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.g.f117075a.o("Error taking a photo in LensCameraPresenter", e13);
                }
            }
        }
    }

    public final void k(String flashMode) {
        Intrinsics.checkNotNullParameter(flashMode, "flashMode");
        Camera camera = fa2.c.f61593a;
        Camera.Parameters parameters = camera != null ? camera.getParameters() : null;
        if (parameters != null) {
            parameters.setFlashMode(flashMode);
        }
        try {
            Camera camera2 = fa2.c.f61593a;
            if (camera2 != null) {
                camera2.setParameters(parameters);
            }
        } catch (RuntimeException e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.o("error setting flash mode in Lens", e13);
        }
    }

    public final void l(boolean z13) {
        this.f121031b.t(new i31.a(z13, 29));
    }

    public final void m(rm1.q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        String lowerCase = icon.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        GestaltIconButton gestaltIconButton = this.f121031b;
        gestaltIconButton.setContentDescription(lowerCase);
        gestaltIconButton.t(new g(icon, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f121040k = null;
        super.onDetachedFromWindow();
    }

    @Override // yk1.r
    public final void setPinalytics(nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
    }
}
