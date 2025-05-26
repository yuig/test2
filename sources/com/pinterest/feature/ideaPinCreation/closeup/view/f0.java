package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.aq0;
import com.pinterest.api.model.cp0;
import com.pinterest.api.model.er;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.kq;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.lq;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.pq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.so;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.tq;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.vq;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.ideaPinCreation.color.IdeaPinColorPalette;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.imageview.WebImageView;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;

/* loaded from: classes5.dex */
public final class f0 extends FrameLayout implements yk1.n, yt0.c, cu0.c, c2, d2, ou0.j, p1, j1, yt0.f, yt0.e, yt0.b, o1, w0, d1, yt0.a, af2.c {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f46147l0 = 0;
    public final xk2.k A;
    public final xk2.k B;
    public final xk2.k C;
    public final View D;
    public final View E;
    public final View F;
    public final View G;
    public final View H;
    public final View I;

    /* renamed from: J, reason: collision with root package name */
    public final View f46148J;
    public final View K;
    public final View L;
    public final View M;
    public final View N;
    public so O;
    public RectF P;
    public RectF Q;
    public Float R;
    public j0[] S;
    public j0[] T;
    public j0[] U;
    public j0[] V;
    public v1 W;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f46149a;

    /* renamed from: a0, reason: collision with root package name */
    public v1 f46150a0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46151b;

    /* renamed from: b0, reason: collision with root package name */
    public final xj2.b f46152b0;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f46153c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f46154c0;

    /* renamed from: d, reason: collision with root package name */
    public final x02.x2 f46155d;

    /* renamed from: d0, reason: collision with root package name */
    public final b0 f46156d0;

    /* renamed from: e, reason: collision with root package name */
    public final x02.i2 f46157e;

    /* renamed from: e0, reason: collision with root package name */
    public String f46158e0;

    /* renamed from: f, reason: collision with root package name */
    public final x02.x0 f46159f;

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashMap f46160f0;

    /* renamed from: g, reason: collision with root package name */
    public final ag1.b f46161g;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashMap f46162g0;

    /* renamed from: h, reason: collision with root package name */
    public final m60.w f46163h;

    /* renamed from: h0, reason: collision with root package name */
    public au0.d f46164h0;

    /* renamed from: i, reason: collision with root package name */
    public final zp.j f46165i;

    /* renamed from: i0, reason: collision with root package name */
    public au0.d f46166i0;

    /* renamed from: j, reason: collision with root package name */
    public final nt0.d f46167j;

    /* renamed from: j0, reason: collision with root package name */
    public au0.d f46168j0;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f46169k;

    /* renamed from: k0, reason: collision with root package name */
    public nx.d0 f46170k0;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.k f46171l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.k f46172m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.k f46173n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.k f46174o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.k f46175p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.k f46176q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.k f46177r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.k f46178s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f46179t;

    /* renamed from: u, reason: collision with root package name */
    public final xk2.k f46180u;

    /* renamed from: v, reason: collision with root package name */
    public cu0.f f46181v;

    /* renamed from: w, reason: collision with root package name */
    public final xk2.v f46182w;

    /* renamed from: x, reason: collision with root package name */
    public final xk2.k f46183x;

    /* renamed from: y, reason: collision with root package name */
    public final xk2.k f46184y;

    /* renamed from: z, reason: collision with root package name */
    public final xk2.k f46185z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = 1;
        if (!this.f46151b) {
            this.f46151b = true;
            jb jbVar = (jb) ((g0) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f46153c = oaVar.f113718h8;
            this.f46155d = (x02.x2) oaVar.f113800m3.get();
            this.f46157e = (x02.i2) oaVar.F3.get();
            this.f46159f = (x02.x0) oaVar.f113765k3.get();
            this.f46161g = (ag1.b) oaVar.Z7.get();
            this.f46163h = (m60.w) oaVar.f113885r0.get();
            this.f46165i = (zp.j) jbVar.f113485c.U2.get();
            this.f46167j = (nt0.d) oaVar.f113982w8.get();
        }
        this.f46169k = xk2.m.b(new z(this, 5));
        xk2.n nVar = xk2.n.NONE;
        int i14 = 13;
        this.f46171l = xk2.m.a(nVar, new om0.m1(i14, context, this));
        this.f46172m = xk2.m.a(nVar, new z(this, i13));
        this.f46173n = xk2.m.a(nVar, new z(this, 3));
        this.f46174o = xk2.m.a(nVar, new z(this, 9));
        this.f46175p = xk2.m.a(nVar, new z(this, 8));
        this.f46176q = xk2.m.a(nVar, new z(this, 15));
        this.f46177r = xk2.m.a(nVar, new z(this, i14));
        this.f46178s = xk2.m.a(nVar, new z(this, 14));
        this.f46179t = new e0(this);
        this.f46180u = xk2.m.a(nVar, new z(this, 12));
        this.f46181v = cu0.f.PAGE_BACKGROUND_COLOR;
        this.f46182w = xk2.m.b(new z(this, 2));
        this.f46183x = xk2.m.a(nVar, new z(this, 0));
        this.f46184y = xk2.m.a(nVar, new z(this, 11));
        this.f46185z = xk2.m.a(nVar, new z(this, 10));
        this.A = xk2.m.a(nVar, new z(this, 4));
        this.B = xk2.m.a(nVar, new z(this, 7));
        this.C = xk2.m.a(nVar, new z(this, 6));
        this.D = g0().findViewById(aq1.d.top_media_grid_line);
        this.E = g0().findViewById(aq1.d.top_text_grid_line);
        this.F = g0().findViewById(aq1.d.horizontal_center_grid_line);
        this.G = g0().findViewById(aq1.d.bottom_media_grid_line);
        this.H = g0().findViewById(aq1.d.bottom_text_grid_line);
        this.I = g0().findViewById(aq1.d.left_media_grid_line);
        this.f46148J = g0().findViewById(aq1.d.left_text_grid_line);
        this.K = g0().findViewById(aq1.d.vertical_center_grid_line);
        this.L = g0().findViewById(aq1.d.right_media_grid_line);
        this.M = g0().findViewById(aq1.d.right_text_grid_line);
        this.N = g0().findViewById(aq1.d.diagonal_grid_line);
        this.f46152b0 = new xj2.b();
        this.f46156d0 = new b0(this);
        cp0.FULL_BLEED.getType();
        this.f46160f0 = new LinkedHashMap();
        this.f46162g0 = new LinkedHashMap();
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int i15 = eo1.b.color_black_900;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i15));
        setFocusableInTouchMode(true);
    }

    public static Matrix C(float f13, float f14, vq vqVar) {
        RectF rectF = new RectF(0.0f, 0.0f, f13, f14);
        float f15 = rectF.left;
        float f16 = rectF.top;
        float f17 = rectF.right;
        float f18 = rectF.bottom;
        float[] fArr = {f15, f16, f17, f16, f15, f18, f17, f18};
        float[] f19 = vqVar.f();
        Matrix matrix = new Matrix();
        matrix.setPolyToPoly(fArr, 0, f19, 0, 4);
        return matrix;
    }

    public static final void g(f0 f0Var, v7 v7Var, jq jqVar, Function0 function0) {
        RectF rectF = f0Var.P;
        if (rectF == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float height = rectF.height();
        RectF rectF2 = f0Var.P;
        if (rectF2 == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float width = rectF2.width();
        Context context = f0Var.getContext();
        v1 v1Var = f0Var.f46150a0;
        if (v1Var == null) {
            Intrinsics.r("overlayViewStickyGuidelineBehavior");
            throw null;
        }
        RectF rectF3 = f0Var.Q;
        if (rectF3 == null) {
            Intrinsics.r("overlayElementMoveRect");
            throw null;
        }
        x xVar = new x(0, function0);
        Intrinsics.f(context);
        s0 s0Var = new s0(context, jqVar, v7Var, height, width, v1Var, f0Var, f0Var, rectF3, f0Var, xVar);
        String uid = v7Var.getUid();
        String v13 = kh2.d.v(v7Var);
        s0Var.f46317s = uid;
        s0Var.f46316r = v13;
        f0Var.s().addView(s0Var);
        f0Var.f46160f0.put(jqVar.getConfig().getId(), jqVar.getDurationConfig());
        f0Var.o0(s0Var, jqVar.getDurationConfig());
        f0Var.k(jqVar);
    }

    public static final void i(f0 f0Var, a2 a2Var, qq qqVar, String str, String str2, String str3, dl1.s sVar, Function0 function0) {
        qq K0 = f0Var.K0(qqVar, true);
        Context context = f0Var.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RectF rectF = f0Var.P;
        if (rectF == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float width = rectF.width();
        RectF rectF2 = f0Var.P;
        if (rectF2 == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float height = rectF2.height();
        RectF rectF3 = f0Var.Q;
        if (rectF3 == null) {
            Intrinsics.r("overlayElementMoveRect");
            throw null;
        }
        v1 v1Var = f0Var.f46150a0;
        if (v1Var == null) {
            Intrinsics.r("overlayViewStickyGuidelineBehavior");
            throw null;
        }
        z0 z0Var = new z0(context, a2Var, K0, str, width, height, rectF3, v1Var, f0Var, f0Var, f0Var);
        z0Var.H1(str2, str3, sVar);
        f0Var.s().addView(z0Var);
        f0Var.f46160f0.put(K0.getConfig().getId(), K0.getDurationConfig());
        f0Var.o0(z0Var, K0.getDurationConfig());
        f0Var.k(K0);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final FrameLayout j(f0 f0Var) {
        View g03 = f0Var.g0();
        Intrinsics.g(g03, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) g03;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0(cu0.f r10) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.closeup.view.f0.B0(cu0.f):void");
    }

    public final IdeaPinInteractiveImageView D() {
        Object value = this.f46175p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IdeaPinInteractiveImageView) value;
    }

    public final void F0() {
        if (l()) {
            bs1.c.X0(a0());
            d0().M(false);
        }
        au0.d dVar = this.f46164h0;
        if (dVar == null || !dVar.isBound()) {
            return;
        }
        ((yt0.d) dVar.getView()).getClass();
        q qVar = (q) ((yt0.d) dVar.getView());
        ConstraintLayout constraintLayout = qVar.J0;
        if (constraintLayout == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        bs1.c.R1(constraintLayout, false);
        LinearLayout linearLayout = qVar.K0;
        if (linearLayout != null) {
            bs1.c.R1(linearLayout, false);
        } else {
            Intrinsics.r("toolbarBackground");
            throw null;
        }
    }

    public final void G0() {
        if (l()) {
            bs1.c.U1(a0());
            IdeaPinInteractiveVideoView d03 = d0();
            if (!d03.N) {
                d03.play();
            }
        }
        au0.d dVar = this.f46164h0;
        if (dVar != null) {
            ((yt0.d) dVar.getView()).getClass();
            q qVar = (q) ((yt0.d) dVar.getView());
            ConstraintLayout constraintLayout = qVar.J0;
            if (constraintLayout == null) {
                Intrinsics.r("toolbar");
                throw null;
            }
            bs1.c.R1(constraintLayout, true);
            LinearLayout linearLayout = qVar.K0;
            if (linearLayout != null) {
                bs1.c.R1(linearLayout, true);
            } else {
                Intrinsics.r("toolbarBackground");
                throw null;
            }
        }
    }

    public final void H0(View view) {
        kg.a.u(view, 0, 0L, 6);
        bs1.c.X0(q());
        F0();
        IdeaPinOverlayViewColorPickerModal L = L();
        L.getClass();
        bs1.c.U1(L);
        L.f46010a.e();
        IdeaPinOverlayViewColorPickerModal L2 = L();
        ag1.b bVar = this.f46161g;
        if (bVar == null) {
            Intrinsics.r("dataManager");
            throw null;
        }
        com.bumptech.glide.l animatedGifLoader = (com.bumptech.glide.l) bVar.f15139l.getValue();
        L2.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(animatedGifLoader, "animatedGifLoader");
        L2.f46022m = view;
        if (L2.f46023n == null) {
            L2.f46023n = view;
        }
        ImageView imageView = L2.f46012c;
        bs1.c.X0(imageView);
        bs1.c.X0(L2.f46013d);
        WebImageView webImageView = L2.f46015f;
        bs1.c.X0(webImageView);
        GestaltAvatar gestaltAvatar = L2.f46016g;
        bs1.c.X0(gestaltAvatar);
        ImageView imageView2 = L2.f46014e;
        bs1.c.X0(imageView2);
        boolean z13 = view instanceof z0;
        int i13 = 1;
        IdeaPinColorPalette ideaPinColorPalette = L2.f46010a;
        if (z13) {
            ideaPinColorPalette.f46421f = false;
            z0 z0Var = (z0) view;
            ideaPinColorPalette.b(z0Var.f46388a.getConfig().getColorHex());
            imageView.setImageBitmap(z0Var.g2());
            bs1.c.U1(imageView);
            int i14 = k1.f46213a[z0Var.f46411x.ordinal()];
            if (i14 == 1 || i14 == 2) {
                L2.h(z0Var.f46404q);
            } else if (i14 == 4) {
                String str = z0Var.f46404q;
                if (str != null) {
                    gestaltAvatar.H2(new kl0.c(str, 28));
                }
                bs1.c.U1(gestaltAvatar);
                bs1.c.X0(webImageView);
            }
        } else if (view instanceof r1) {
            nq nqVar = ((r1) view).K;
            Boolean u13 = nqVar.getStickerDetails().u();
            Intrinsics.checkNotNullExpressionValue(u13, "getHasColor(...)");
            ideaPinColorPalette.f46421f = u13.booleanValue();
            String colorHex = nqVar.getConfig().getColorHex();
            if (Intrinsics.d(colorHex, "#00000000")) {
                ideaPinColorPalette.b(null);
            } else {
                ideaPinColorPalette.b(colorHex);
            }
            String q13 = nqVar.getStickerDetails().q();
            WebImageView webImageView2 = L2.f46013d;
            webImageView2.V1(q13, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
            webImageView2.setColorFilter(Color.parseColor(nqVar.getConfig().getColorHex()));
            bs1.c.U1(webImageView2);
        } else if (view instanceof f) {
            nq nqVar2 = ((f) view).f46133c;
            Boolean u14 = nqVar2.getStickerDetails().u();
            Intrinsics.checkNotNullExpressionValue(u14, "getHasColor(...)");
            ideaPinColorPalette.f46421f = u14.booleanValue();
            String colorHex2 = nqVar2.getConfig().getColorHex();
            if (Intrinsics.d(colorHex2, "#00000000")) {
                ideaPinColorPalette.b(null);
            } else {
                ideaPinColorPalette.b(colorHex2);
            }
            imageView2.setColorFilter(Color.parseColor(nqVar2.getConfig().getColorHex()));
            animatedGifLoader.K(nqVar2.getStickerDetails().q()).G(imageView2);
            bs1.c.U1(imageView2);
        } else if (view instanceof s0) {
            ideaPinColorPalette.f46421f = false;
            s0 s0Var = (s0) view;
            ideaPinColorPalette.b(s0Var.f46299a.getConfig().getColorHex());
            L2.h(s0Var.f46316r);
            i1 bitmapListener = new i1(L2, i13);
            Intrinsics.checkNotNullParameter(bitmapListener, "bitmapListener");
            KeyEvent.Callback callback = s0Var.f46318t;
            Intrinsics.g(callback, "null cannot be cast to non-null type com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinStickerRepView");
            ((u1) callback).b(new l0.d(s0Var, callback, bitmapListener, 16));
        }
        KeyEvent.Callback callback2 = L2.f46022m;
        g1 g1Var = callback2 instanceof g1 ? (g1) callback2 : null;
        if (g1Var != null) {
            int i15 = k1.f46213a[g1Var.a0().ordinal()];
            webImageView.setContentDescription(i15 != 1 ? i15 != 3 ? "" : bs1.c.f2(L2, aq1.h.accessibility_idea_pin_board_sticker_image_preview) : bs1.c.f2(L2, aq1.h.accessibility_idea_pin_product_image_preview));
        }
        L2.i();
        KeyEvent.Callback callback3 = L2.f46022m;
        g1 g1Var2 = callback3 instanceof g1 ? (g1) callback3 : null;
        L2.f46021l = g1Var2 != null ? IdeaPinOverlayViewColorPickerModal.f(g1Var2) : null;
    }

    public final boolean I0(String str) {
        View T = T(str);
        if (T == null) {
            return false;
        }
        H0(T);
        return true;
    }

    public final qq K0(qq qqVar, boolean z13) {
        if (this.R == null) {
            return qqVar;
        }
        return qqVar.a(rq.a(qqVar.getConfig(), null, t0(qqVar.getConfig().getMatrix(), z13), null, 23), qqVar.getDurationConfig());
    }

    public final IdeaPinOverlayViewColorPickerModal L() {
        Object value = this.f46185z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IdeaPinOverlayViewColorPickerModal) value;
    }

    public final void L0(String viewId, Matrix viewMatrix, vq vqVar) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        au0.d dVar = this.f46164h0;
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(viewId, "viewId");
            Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
            tp u33 = dVar.u3();
            if (u33 != null) {
                dVar.x3(tp.h0(u33, viewId, new wt0.a(viewMatrix, vqVar, 1), null, 4));
            }
        }
    }

    public final void P0(int i13, Matrix videoMatrix, Matrix exportMatrix) {
        Intrinsics.checkNotNullParameter(videoMatrix, "videoMatrix");
        Intrinsics.checkNotNullParameter(exportMatrix, "exportMatrix");
        au0.d dVar = this.f46164h0;
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(exportMatrix, "exportMatrix");
            tp u33 = dVar.u3();
            if (u33 != null) {
                dVar.x3(u33.b0(i13, new lq0.g1(27, videoMatrix, exportMatrix)));
            }
        }
    }

    public final void S0(jq boardStickerData, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(boardStickerData, "boardStickerData");
        jq jqVar = (jq) K0(boardStickerData, false);
        x02.x0 x0Var = this.f46159f;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        this.f46152b0.a(x0Var.P(jqVar.getBoardId()).E(new au0.h(4, new go0.r(jqVar, this, function0, 13)), new au0.h(5, new j1.p0(jqVar, function0, function02, this, 24))));
    }

    public final View T(String str) {
        Object obj;
        Iterator it = d7.b.O(s()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object tag = ((View) next).getTag(aq1.d.idea_pin_tag_id);
            if (Intrinsics.d(tag instanceof String ? (String) tag : null, str)) {
                obj = next;
                break;
            }
        }
        return (View) obj;
    }

    public final void T0(kq imageStickerBlock, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(imageStickerBlock, "imageStickerBlock");
        kq kqVar = (kq) K0(imageStickerBlock, false);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RectF rectF = this.P;
        if (rectF == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float width = rectF.width();
        RectF rectF2 = this.P;
        if (rectF2 == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float height = rectF2.height();
        v1 v1Var = this.f46150a0;
        if (v1Var == null) {
            Intrinsics.r("overlayViewStickyGuidelineBehavior");
            throw null;
        }
        View u0Var = new u0(context, kqVar, width, height, function0, function02, v1Var, this, this, this);
        s().addView(u0Var);
        this.f46160f0.put(kqVar.getConfig().getId(), kqVar.getDurationConfig());
        o0(u0Var, kqVar.getDurationConfig());
        k(kqVar);
    }

    public final IdeaPinPageColorPickerModal X() {
        Object value = this.f46184y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IdeaPinPageColorPickerModal) value;
    }

    public final IdeaPinTextEditor Y() {
        Object value = this.f46180u.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IdeaPinTextEditor) value;
    }

    public final void Y0(lq mentionTagData, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(mentionTagData, "mentionTagData");
        x02.x2 x2Var = this.f46155d;
        if (x2Var == null) {
            Intrinsics.r("userRepository");
            throw null;
        }
        this.f46152b0.a(x2Var.P(mentionTagData.getUserId()).E(new au0.h(8, new go0.r(this, mentionTagData, function0, 14)), new au0.h(9, new m1.e0(29, function02))));
    }

    public final long Z(tq tqVar) {
        if (tqVar == null) {
            return 0L;
        }
        vn0 vn0Var = d0().O;
        Long valueOf = vn0Var != null ? Long.valueOf(vn0Var.v()) : null;
        return tqVar.g(valueOf != null ? valueOf.longValue() : 0L);
    }

    public final IdeaPinVideoSeekBarView a0() {
        Object value = this.f46178s.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IdeaPinVideoSeekBarView) value;
    }

    @Override // ou0.j
    public final void b(boolean z13) {
        G0();
        bs1.c.U1(q());
    }

    public final void b1(String str) {
        au0.d dVar;
        String colorHex = str == null ? "#1A1A1A" : str;
        this.f46158e0 = colorHex;
        s().setBackgroundColor(Color.parseColor(colorHex));
        StoryPinBottomToolbar q13 = q();
        q13.getClass();
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        StoryPinActionButton storyPinActionButton = (StoryPinActionButton) q13.f46077g.getValue();
        Context context = q13.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        uf1.a icon = new uf1.a(context, colorHex, false, false, 12);
        icon.f122097k = 1;
        storyPinActionButton.getClass();
        Intrinsics.checkNotNullParameter(icon, "icon");
        ImageView imageView = storyPinActionButton.f46069a;
        imageView.setImageDrawable(icon);
        bs1.c.U1(imageView);
        if (str != null || (dVar = this.f46164h0) == null) {
            return;
        }
        dVar.F3("#1A1A1A");
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f46149a == null) {
            this.f46149a = new ye2.o(this);
        }
        return this.f46149a;
    }

    public final IdeaPinInteractiveVideoView d0() {
        Object value = this.f46176q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IdeaPinInteractiveVideoView) value;
    }

    public final View g0() {
        Object value = this.f46171l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f46149a == null) {
            this.f46149a = new ye2.o(this);
        }
        return this.f46149a.generatedComponent();
    }

    public final void k(qq qqVar) {
        if (uv0.p.c(qqVar) && ((lh0.s1) this.f46169k.getValue()).c()) {
            LinkedHashMap linkedHashMap = this.f46162g0;
            String id3 = qqVar.getConfig().getId();
            String id4 = qqVar.getConfig().getId();
            vq rotatedRect = qqVar.getConfig().getRotatedRect();
            linkedHashMap.put(id3, new pu0.k(id4, rotatedRect != null ? rotatedRect.a() : null, pu0.h.a(qqVar.getDurationConfig().getEnterTransitionType()), pu0.h.b(qqVar.getDurationConfig().getExitTransitionType())));
        }
    }

    public final void k0(h32.u0 elementType, d4 d4Var, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        nx.d0 d0Var = this.f46170k0;
        if (d0Var != null) {
            d0Var.U(new h32.i0(d4Var, a4.STORY_PIN_CREATE, null, null, null, elementType), h32.f1.TAP, null, null, hashMap, false);
        } else {
            Intrinsics.r("pinalytics");
            throw null;
        }
    }

    public final boolean l() {
        return d0().getVisibility() == 0 && !this.f46154c0;
    }

    public final void m(g1 g1Var, boolean z13) {
        String str;
        m60.w wVar = this.f46163h;
        qu0.a aVar = null;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        String L0 = g1Var.L0();
        int i13 = 0;
        if (z13) {
            tq tqVar = (tq) this.f46160f0.get(g1Var.X1());
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String z14 = f0.h.z(resources, tqVar != null ? tqVar.getStartTimeMs() : 0L, false, 12);
            long Z = Z(tqVar);
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            String z15 = f0.h.z(resources2, Z, false, 12);
            str = g1Var instanceof c1 ? bs1.c.g2(this, aq1.h.idea_pin_text_duration_text, z14, z15) : bs1.c.g2(this, aq1.h.idea_pin_sticker_duration_text, z14, z15);
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        qu0.a aVar2 = new qu0.a(aq1.h.idea_pin_edit_duration_title, new c0(this, g1Var, 5));
        if (g1Var instanceof c1) {
            aVar = new qu0.a(aq1.h.idea_pin_edit_text_title, new c0(this, g1Var, i13));
        } else if ((g1Var instanceof z0) || (g1Var instanceof s0)) {
            aVar = new qu0.a(aq1.h.idea_pin_edit_sticker_title, new c0(this, g1Var, 1));
        } else if (g1Var instanceof r1) {
            Boolean v13 = ((r1) g1Var).K.getStickerDetails().v();
            Intrinsics.checkNotNullExpressionValue(v13, "getIsColorEditable(...)");
            if (v13.booleanValue()) {
                aVar = new qu0.a(aq1.h.idea_pin_edit_sticker_title, new c0(this, g1Var, 2));
            }
        } else if (g1Var instanceof f) {
            Boolean v14 = ((f) g1Var).f46133c.getStickerDetails().v();
            Intrinsics.checkNotNullExpressionValue(v14, "getIsColorEditable(...)");
            if (v14.booleanValue()) {
                aVar = new qu0.a(aq1.h.idea_pin_edit_sticker_color_title, new c0(this, g1Var, 3));
            }
        } else if (g1Var instanceof u0) {
            aVar = new qu0.a(aq1.h.idea_pin_replace_image_sticker_photo_title, new c0(this, g1Var, 4));
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
        if (z13) {
            arrayList.add(aVar2);
        }
        wVar.d(new jc0.v(new zp.b0(L0, str, arrayList), false, 0L, 30));
        G0();
    }

    public final void n(c1 c1Var) {
        String str;
        er erVar;
        aq0 aq0Var;
        String str2;
        rq config;
        ln0 ln0Var;
        bs1.c.X0(q());
        F0();
        if (c1Var != null) {
            bs1.c.X0(c1Var);
            Y().l(c1Var.f46105i.getText().toString(), c1Var.f46107k, c1Var.f46108l, c1Var.f46109m, c1Var.f46110n, c1Var.f46111o, c1Var.f46115s);
            return;
        }
        au0.d dVar = this.f46168j0;
        oq w13 = (dVar == null || (ln0Var = dVar.f20486l) == null) ? null : ln0Var.w();
        float fontSize = w13 != null ? w13.getFontSize() : 36.0f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RectF rectF = this.P;
        if (rectF == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float s22 = c0.d.s2(fontSize, (int) rectF.width(), context);
        IdeaPinTextEditor Y = Y();
        if (w13 == null || (config = w13.getConfig()) == null || (str = config.getColorHex()) == null) {
            str = "#FFFFFF";
        }
        String str3 = str;
        if (w13 == null || (erVar = w13.getHighlightType()) == null) {
            erVar = er.NONE;
        }
        er erVar2 = erVar;
        if (w13 == null || (aq0Var = w13.getAlignment()) == null) {
            aq0Var = aq0.CENTER;
        }
        aq0 aq0Var2 = aq0Var;
        if (w13 == null || (str2 = w13.getFontId()) == null) {
            str2 = "6";
        }
        String str4 = str2;
        int i13 = IdeaPinTextEditor.E;
        Y.l("", str3, erVar2, aq0Var2, str4, s22, null);
    }

    public final void n1(mq productTagData, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(productTagData, "productTagData");
        x02.i2 i2Var = this.f46157e;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        this.f46152b0.a(i2Var.P(productTagData.getPinId()).F(new au0.h(2, new go0.r(productTagData, function0, this, 15)), new au0.h(3, new d0(0, function02)), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final void o(boolean z13) {
        bs1.c.U1(q());
        com.bumptech.glide.c.d0(t());
        v1 v1Var = this.W;
        if (v1Var == null) {
            Intrinsics.r("mediaStickyGuidelineBehavior");
            throw null;
        }
        v1Var.a();
        v1 v1Var2 = this.f46150a0;
        if (v1Var2 == null) {
            Intrinsics.r("overlayViewStickyGuidelineBehavior");
            throw null;
        }
        v1Var2.a();
        if (z13) {
            G0();
        }
    }

    public final void o0(View view, tq tqVar) {
        if (bs1.c.o1(d0())) {
            IdeaPinInteractiveVideoView d03 = d0();
            a7.v0 v0Var = d03.f18946k;
            int l13 = v0Var != null ? v0Var.l() : 0;
            a7.v0 v0Var2 = d03.f18946k;
            long j13 = 0;
            long X = v0Var2 != null ? v0Var2.X() : 0L;
            List subList = d03.P.subList(0, l13);
            Intrinsics.checkNotNullParameter(subList, "<this>");
            Iterator it = subList.iterator();
            while (it.hasNext()) {
                j13 += ((Number) it.next()).longValue();
            }
            if (tqVar.a(j13 + X)) {
                return;
            }
            bs1.c.X0(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m60.w wVar = this.f46163h;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.h(this.f46156d0);
        IdeaPinInteractiveVideoView d03 = d0();
        d03.getClass();
        d03.f45993z = new e1(d03, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        IdeaPinInteractiveImageView D = D();
        D.Q.reset();
        D.R = 0.0f;
        D.S = new PointF();
        D.T = 0.0f;
        d0().P();
        this.f46152b0.dispose();
        m60.w wVar = this.f46163h;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.f46156d0);
        super.onDetachedFromWindow();
    }

    public final void p1(nq stickerBlock, Function0 function0, Function0 function02, long j13) {
        View r1Var;
        Intrinsics.checkNotNullParameter(stickerBlock, "stickerBlock");
        nq nqVar = (nq) K0(stickerBlock, false);
        if (kh2.g0.e0(nqVar.getStickerDetails())) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            nt0.d dVar = this.f46167j;
            if (dVar == null) {
                Intrinsics.r("animatedStickerRepository");
                throw null;
            }
            RectF rectF = this.P;
            if (rectF == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float width = rectF.width();
            RectF rectF2 = this.P;
            if (rectF2 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float height = rectF2.height();
            v1 v1Var = this.f46150a0;
            if (v1Var == null) {
                Intrinsics.r("overlayViewStickyGuidelineBehavior");
                throw null;
            }
            r1Var = new f(context, dVar, nqVar, width, height, function0, v1Var, this, this, this, j13);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            RectF rectF3 = this.P;
            if (rectF3 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float width2 = rectF3.width();
            RectF rectF4 = this.P;
            if (rectF4 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float height2 = rectF4.height();
            v1 v1Var2 = this.f46150a0;
            if (v1Var2 == null) {
                Intrinsics.r("overlayViewStickyGuidelineBehavior");
                throw null;
            }
            r1Var = new r1(context2, nqVar, width2, height2, function0, function02, v1Var2, this, this, this);
        }
        s().addView(r1Var);
        this.f46160f0.put(nqVar.getConfig().getId(), nqVar.getDurationConfig());
        o0(r1Var, nqVar.getDurationConfig());
        k(nqVar);
    }

    public final StoryPinBottomToolbar q() {
        Object value = this.f46183x.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (StoryPinBottomToolbar) value;
    }

    public final void r0(so ratio, Integer num) {
        Unit unit;
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        so soVar = this.O;
        if (soVar == null || !Intrinsics.d(ratio, soVar)) {
            this.O = ratio;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            RectF i03 = ig1.b.i0((float) ratio.d(), context);
            if (num != null) {
                float intValue = num.intValue();
                RectF rectF = new RectF(0.0f, 0.0f, intValue, intValue / ((float) ratio.d()));
                this.P = rectF;
                this.R = Float.valueOf(rectF.width() / i03.width());
                unit = Unit.f80348a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.P = i03;
                i03.width();
                this.R = null;
            }
            RectF rectF2 = this.P;
            if (rectF2 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            this.Q = kh2.p2.l0(rectF2);
            j0[] j0VarArr = new j0[3];
            View vCenterGridLine = this.K;
            Intrinsics.checkNotNullExpressionValue(vCenterGridLine, "vCenterGridLine");
            if (this.P == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float f13 = 2;
            j0VarArr[0] = new j0(vCenterGridLine, (float) Math.rint(r9.width() / f13));
            View leftMediaGridLine = this.I;
            Intrinsics.checkNotNullExpressionValue(leftMediaGridLine, "leftMediaGridLine");
            j0VarArr[1] = new j0(leftMediaGridLine, 0.0f);
            View rightMediaGridLine = this.L;
            Intrinsics.checkNotNullExpressionValue(rightMediaGridLine, "rightMediaGridLine");
            if (this.P == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            j0VarArr[2] = new j0(rightMediaGridLine, (float) Math.rint(r14.width()));
            this.S = j0VarArr;
            j0[] j0VarArr2 = new j0[3];
            View hCenterGridLine = this.F;
            Intrinsics.checkNotNullExpressionValue(hCenterGridLine, "hCenterGridLine");
            if (this.P == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            j0VarArr2[0] = new j0(hCenterGridLine, (float) Math.rint(r15.height() / f13));
            View topMediaGridLine = this.D;
            Intrinsics.checkNotNullExpressionValue(topMediaGridLine, "topMediaGridLine");
            j0VarArr2[1] = new j0(topMediaGridLine, 0.0f);
            View bottomMediaGridLine = this.G;
            Intrinsics.checkNotNullExpressionValue(bottomMediaGridLine, "bottomMediaGridLine");
            if (this.P == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            j0VarArr2[2] = new j0(bottomMediaGridLine, (float) Math.rint(r4.height()));
            this.T = j0VarArr2;
            j0[] j0VarArr3 = new j0[3];
            Intrinsics.checkNotNullExpressionValue(vCenterGridLine, "vCenterGridLine");
            if (this.P == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            j0VarArr3[0] = new j0(vCenterGridLine, (float) Math.rint(r3.width() / f13));
            View leftTextGridLine = this.f46148J;
            Intrinsics.checkNotNullExpressionValue(leftTextGridLine, "leftTextGridLine");
            RectF rectF3 = this.Q;
            if (rectF3 == null) {
                Intrinsics.r("overlayElementMoveRect");
                throw null;
            }
            j0VarArr3[1] = new j0(leftTextGridLine, rectF3.left);
            View rightTextGridLine = this.M;
            Intrinsics.checkNotNullExpressionValue(rightTextGridLine, "rightTextGridLine");
            RectF rectF4 = this.Q;
            if (rectF4 == null) {
                Intrinsics.r("overlayElementMoveRect");
                throw null;
            }
            j0VarArr3[2] = new j0(rightTextGridLine, rectF4.right);
            this.U = j0VarArr3;
            j0[] j0VarArr4 = new j0[3];
            Intrinsics.checkNotNullExpressionValue(hCenterGridLine, "hCenterGridLine");
            if (this.P == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            j0VarArr4[0] = new j0(hCenterGridLine, (float) Math.rint(r14.height() / f13));
            View topTextGridLine = this.E;
            Intrinsics.checkNotNullExpressionValue(topTextGridLine, "topTextGridLine");
            RectF rectF5 = this.Q;
            if (rectF5 == null) {
                Intrinsics.r("overlayElementMoveRect");
                throw null;
            }
            j0VarArr4[1] = new j0(topTextGridLine, rectF5.top);
            View bottomTextGridLine = this.H;
            Intrinsics.checkNotNullExpressionValue(bottomTextGridLine, "bottomTextGridLine");
            RectF rectF6 = this.Q;
            if (rectF6 == null) {
                Intrinsics.r("overlayElementMoveRect");
                throw null;
            }
            j0VarArr4[2] = new j0(bottomTextGridLine, rectF6.bottom);
            this.V = j0VarArr4;
            j0[] j0VarArr5 = this.S;
            if (j0VarArr5 == null) {
                Intrinsics.r("xMediaGridLineConfigs");
                throw null;
            }
            j0[] j0VarArr6 = this.T;
            if (j0VarArr6 == null) {
                Intrinsics.r("yMediaGridLineConfigs");
                throw null;
            }
            View rotationGridLine = this.N;
            Intrinsics.checkNotNullExpressionValue(rotationGridLine, "rotationGridLine");
            this.W = new v1(j0VarArr5, j0VarArr6, rotationGridLine);
            j0[] j0VarArr7 = this.U;
            if (j0VarArr7 == null) {
                Intrinsics.r("xTextGridLineConfigs");
                throw null;
            }
            j0[] j0VarArr8 = this.V;
            if (j0VarArr8 == null) {
                Intrinsics.r("yTextGridLineConfigs");
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(rotationGridLine, "rotationGridLine");
            this.f46150a0 = new v1(j0VarArr7, j0VarArr8, rotationGridLine);
            IdeaPinInteractiveImageView D = D();
            RectF viewRect = this.P;
            if (viewRect == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            D.getClass();
            Intrinsics.checkNotNullParameter(viewRect, "viewRect");
            v1 v1Var = this.W;
            if (v1Var == null) {
                Intrinsics.r("mediaStickyGuidelineBehavior");
                throw null;
            }
            Intrinsics.checkNotNullParameter(this, "touchSurfaceListener");
            Intrinsics.checkNotNullParameter(this, "interactionListener");
            D.K = this;
            D.L = this;
            D.M = v1Var;
            IdeaPinInteractiveVideoView d03 = d0();
            RectF viewRect2 = this.P;
            if (viewRect2 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            d03.getClass();
            Intrinsics.checkNotNullParameter(viewRect2, "viewRect");
            d03.M = viewRect2;
            v1 stickyGuidelineBehavior = this.W;
            if (stickyGuidelineBehavior == null) {
                Intrinsics.r("mediaStickyGuidelineBehavior");
                throw null;
            }
            Intrinsics.checkNotNullParameter(this, "touchSurfaceListener");
            Intrinsics.checkNotNullParameter(this, "interactionListener");
            Intrinsics.checkNotNullParameter(stickyGuidelineBehavior, "stickyGuidelineBehavior");
            d03.f46008J = this;
            d03.K = this;
            d03.L = stickyGuidelineBehavior;
            IdeaPinVideoSeekBarView a03 = a0();
            ViewGroup.LayoutParams layoutParams = a03.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            RectF rectF7 = this.P;
            if (rectF7 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            marginLayoutParams.width = ml2.c.c(rectF7.width());
            a03.setLayoutParams(marginLayoutParams);
            e0 listener = this.f46179t;
            Intrinsics.checkNotNullParameter(listener, "listener");
            a03.f46068a.setOnSeekBarChangeListener(listener);
            Object value = this.f46182w.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            IdeaPinColorEyeDropperView ideaPinColorEyeDropperView = (IdeaPinColorEyeDropperView) value;
            RectF rectF8 = this.P;
            if (rectF8 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            ideaPinColorEyeDropperView.f45981a = rectF8;
            Intrinsics.checkNotNullParameter(this, "listener");
            ideaPinColorEyeDropperView.f45983c = this;
            Intrinsics.checkNotNullParameter(this, "loggingHandler");
            ideaPinColorEyeDropperView.f45984d = this;
            StoryPinBottomToolbar q13 = q();
            q13.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            q13.f46075e = this;
            IdeaPinPageColorPickerModal X = X();
            X.getClass();
            Intrinsics.checkNotNullParameter(this, "colorPickerListener");
            Intrinsics.checkNotNullParameter(this, "eyeDropperListener");
            Intrinsics.checkNotNullParameter(this, "modalListener");
            X.f46034d = this;
            X.f46032b = this;
            X.f46033c = this;
            X.f46031a.c(X, X, X);
            RectF rectF9 = this.P;
            if (rectF9 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            int c13 = ml2.c.c(rectF9.left);
            RectF rectF10 = this.P;
            if (rectF10 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            int c14 = ml2.c.c(rectF10.top);
            Object value2 = this.f46172m.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) value2;
            ViewGroup.LayoutParams layoutParams2 = roundedCornersLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            RectF rectF11 = this.P;
            if (rectF11 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            marginLayoutParams2.width = ml2.c.c(rectF11.width());
            RectF rectF12 = this.P;
            if (rectF12 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            marginLayoutParams2.height = ml2.c.c(rectF12.height());
            marginLayoutParams2.topMargin = c14;
            marginLayoutParams2.setMarginStart(c13);
            marginLayoutParams2.setMarginEnd(c13);
            roundedCornersLayout.setLayoutParams(marginLayoutParams2);
            IdeaPinHandDrawingEditor listener2 = z();
            Object value3 = this.B.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            IdeaPinHandDrawingView drawingCanvasView = (IdeaPinHandDrawingView) value3;
            listener2.getClass();
            Intrinsics.checkNotNullParameter(drawingCanvasView, "drawingCanvasView");
            drawingCanvasView.getClass();
            Intrinsics.checkNotNullParameter(listener2, "listener");
            drawingCanvasView.f46518j = listener2;
            listener2.f46483a = drawingCanvasView;
            IdeaPinHandDrawingEditor z13 = z();
            a0 loggingHandler = new a0(this);
            z13.getClass();
            Intrinsics.checkNotNullParameter(loggingHandler, "loggingHandler");
            z13.f46507y = loggingHandler;
            Intrinsics.checkNotNullExpressionValue(topTextGridLine, "topTextGridLine");
            ViewGroup.LayoutParams layoutParams3 = topTextGridLine.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            RectF rectF13 = this.Q;
            if (rectF13 == null) {
                Intrinsics.r("overlayElementMoveRect");
                throw null;
            }
            marginLayoutParams3.topMargin = ml2.c.c(rectF13.top);
            topTextGridLine.setLayoutParams(marginLayoutParams3);
            Intrinsics.checkNotNullExpressionValue(bottomTextGridLine, "bottomTextGridLine");
            ViewGroup.LayoutParams layoutParams4 = bottomTextGridLine.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            RectF rectF14 = this.P;
            if (rectF14 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float height = rectF14.height();
            RectF rectF15 = this.Q;
            if (rectF15 == null) {
                Intrinsics.r("overlayElementMoveRect");
                throw null;
            }
            marginLayoutParams4.bottomMargin = ml2.c.c(height - rectF15.bottom);
            bottomTextGridLine.setLayoutParams(marginLayoutParams4);
            Intrinsics.checkNotNullExpressionValue(leftTextGridLine, "leftTextGridLine");
            ViewGroup.LayoutParams layoutParams5 = leftTextGridLine.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
            RectF rectF16 = this.Q;
            if (rectF16 == null) {
                Intrinsics.r("overlayElementMoveRect");
                throw null;
            }
            marginLayoutParams5.leftMargin = ml2.c.c(rectF16.left);
            leftTextGridLine.setLayoutParams(marginLayoutParams5);
            Intrinsics.checkNotNullExpressionValue(rightTextGridLine, "rightTextGridLine");
            ViewGroup.LayoutParams layoutParams6 = rightTextGridLine.getLayoutParams();
            if (layoutParams6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
            RectF rectF17 = this.P;
            if (rectF17 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float width = rectF17.width();
            RectF rectF18 = this.Q;
            if (rectF18 == null) {
                Intrinsics.r("overlayElementMoveRect");
                throw null;
            }
            marginLayoutParams6.rightMargin = ml2.c.c(width - rectF18.right);
            rightTextGridLine.setLayoutParams(marginLayoutParams6);
            RectF rectF19 = this.P;
            if (rectF19 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float width2 = rectF19.width();
            RectF rectF20 = this.P;
            if (rectF20 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float height2 = rectF20.height();
            Intrinsics.f(rotationGridLine);
            ViewGroup.LayoutParams layoutParams7 = rotationGridLine.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams7.width = ml2.c.c((float) Math.sqrt((height2 * height2) + (width2 * width2)));
            rotationGridLine.setLayoutParams(layoutParams7);
        }
    }

    public final void r1(oq textBlock) {
        Intrinsics.checkNotNullParameter(textBlock, "textBlock");
        oq oqVar = (oq) K0(textBlock, false);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RectF rectF = this.P;
        if (rectF == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float width = rectF.width();
        Float f13 = this.R;
        float floatValue = width / (f13 != null ? f13.floatValue() : 1.0f);
        RectF rectF2 = this.P;
        if (rectF2 == null) {
            Intrinsics.r("canvasRect");
            throw null;
        }
        float height = rectF2.height();
        Float f14 = this.R;
        float floatValue2 = height / (f14 != null ? f14.floatValue() : 1.0f);
        v1 v1Var = this.f46150a0;
        if (v1Var == null) {
            Intrinsics.r("overlayViewStickyGuidelineBehavior");
            throw null;
        }
        View c1Var = new c1(context, oqVar, floatValue, floatValue2, v1Var, this, this, this);
        s().addView(c1Var);
        this.f46160f0.put(oqVar.getConfig().getId(), oqVar.getDurationConfig());
        o0(c1Var, oqVar.getDurationConfig());
        k(oqVar);
    }

    public final ViewGroup s() {
        Object value = this.f46173n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewGroup) value;
    }

    public final void s1(pq productTagData, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(productTagData, "productTagData");
        x02.i2 i2Var = this.f46157e;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        this.f46152b0.a(i2Var.P(productTagData.getPinId()).F(new au0.h(6, new go0.r(this, productTagData, function0, 16)), new au0.h(7, new d0(1, function02)), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final GestaltIconButton t() {
        Object value = this.A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltIconButton) value;
    }

    public final Matrix t0(Matrix matrix, boolean z13) {
        Float f13 = this.R;
        if (f13 == null) {
            return matrix;
        }
        float floatValue = f13.floatValue();
        if (!z13) {
            Matrix matrix2 = new Matrix(matrix);
            matrix2.postScale(floatValue, floatValue);
            return matrix2;
        }
        float[] fArr = new float[9];
        if (matrix != null) {
            matrix.getValues(fArr);
        }
        fArr[2] = fArr[2] * floatValue;
        fArr[5] = fArr[5] * floatValue;
        Matrix matrix3 = new Matrix();
        matrix3.setValues(fArr);
        return matrix3;
    }

    public final RectF x() {
        return new RectF(t().getLeft(), t().getTop(), t().getRight(), t().getBottom());
    }

    public final IdeaPinHandDrawingEditor z() {
        Object value = this.C.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IdeaPinHandDrawingEditor) value;
    }

    public final void z0(String colorHex) {
        h32.u0 u0Var = h32.u0.STORY_PIN_COLOR_SELECTION_BUTTON;
        d4 d4Var = d4.STORY_PIN_PAGE_TEXT_EDITOR_TOOL;
        HashMap hashMap = new HashMap();
        bs1.c.G1("story_pin_select_name", colorHex, hashMap);
        hashMap.put("selected_from_eyedropper", "true");
        Unit unit = Unit.f80348a;
        k0(u0Var, d4Var, hashMap);
        Object value = this.f46182w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        bs1.c.X0((IdeaPinColorEyeDropperView) value);
        if (l()) {
            bs1.c.U1(a0());
        }
        int i13 = y.f46376a[this.f46181v.ordinal()];
        if (i13 == 1) {
            if (colorHex == null) {
                colorHex = "#1A1A1A";
            }
            Intrinsics.checkNotNullParameter(colorHex, "colorHex");
            b1(colorHex);
            au0.d dVar = this.f46164h0;
            if (dVar != null) {
                dVar.F3(colorHex);
            }
            IdeaPinPageColorPickerModal X = X();
            X.getClass();
            Intrinsics.checkNotNullParameter(colorHex, "colorHex");
            X.f46031a.g(colorHex);
            bs1.c.U1(X());
            return;
        }
        if (i13 == 2) {
            if (colorHex == null) {
                colorHex = "#FFFFFF";
            }
            IdeaPinTextEditor Y = Y();
            Y.getClass();
            Intrinsics.checkNotNullParameter(colorHex, "colorHex");
            Y.f46048n.g(colorHex);
            IdeaPinTextEditor Y2 = Y();
            Y2.getClass();
            Intrinsics.checkNotNullParameter(colorHex, "colorHex");
            Y2.i(Y2.f46060z, colorHex);
            Y2.k();
            bs1.c.U1(Y());
            return;
        }
        if (i13 == 3) {
            if (colorHex == null) {
                colorHex = "#FFFFFF";
            }
            L().m(colorHex);
            bs1.c.X0(q());
            F0();
            IdeaPinOverlayViewColorPickerModal L = L();
            L.getClass();
            bs1.c.U1(L);
            L.f46010a.e();
            return;
        }
        if (i13 != 4) {
            return;
        }
        if (colorHex == null) {
            colorHex = "#FFFFFF";
        }
        IdeaPinHandDrawingEditor z13 = z();
        z13.getClass();
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        z13.f46496n.g(colorHex);
        z().m(colorHex);
        bs1.c.U1(z());
    }
}
