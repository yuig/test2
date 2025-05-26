package s81;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.q11;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.lens.view.LensBottomControlsContainer;
import com.pinterest.feature.search.visual.lens.view.RoomRepaintInfoView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.view.TopBottomGradientView;
import h32.f1;
import h32.g0;
import h32.u0;
import ha2.a0;
import ha2.x;
import ha2.z;
import i32.y0;
import java.io.File;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.b4;
import lh0.f4;
import lh0.h3;
import lh0.o4;
import lh0.w3;
import m81.r;
import m81.s;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import nx.f0;
import ny1.t;
import ny1.w;
import so.n6;
import so.oa;
import sw0.y;
import t3.s1;
import uj2.q;
import yk1.v;

/* loaded from: classes5.dex */
public final class p extends wk1.n implements r, m81.h, ca2.b, e, c, pw0.k, ib2.d, da2.h {

    /* renamed from: b0, reason: collision with root package name */
    public static final a0 f111919b0 = new a0(uc2.h.change_settings, 0, null, null, null, null, null, null, null, 1020);

    /* renamed from: c0, reason: collision with root package name */
    public static final a0 f111920c0 = new a0(uc2.h.pick_more_photos, 1, null, null, null, null, null, null, null, 1020);
    public final r81.k A;
    public final r81.a B;
    public p81.c C;
    public p81.c D;
    public p81.a E;
    public p81.a F;
    public Bitmap G;
    public Uri H;
    public Float I;

    /* renamed from: J, reason: collision with root package name */
    public s f111921J;
    public String K;
    public a32.c L;
    public a32.i M;
    public ek2.j N;
    public boolean O;
    public m81.k P;
    public String Q;
    public String R;
    public String S;
    public rg0.n T;
    public boolean U;
    public Boolean V;
    public final ArrayList W;
    public boolean X;
    public boolean Y;
    public final Handler Z;

    /* renamed from: a, reason: collision with root package name */
    public final r81.p f111922a;

    /* renamed from: a0, reason: collision with root package name */
    public da2.i f111923a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f111924b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f111925c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f111926d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f111927e;

    /* renamed from: f, reason: collision with root package name */
    public final o81.a f111928f;

    /* renamed from: g, reason: collision with root package name */
    public final w81.b f111929g;

    /* renamed from: h, reason: collision with root package name */
    public final rg0.s f111930h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f111931i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f111932j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f111933k;

    /* renamed from: l, reason: collision with root package name */
    public final c91.f f111934l;

    /* renamed from: m, reason: collision with root package name */
    public final float f111935m;

    /* renamed from: n, reason: collision with root package name */
    public final float f111936n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f111937o;

    /* renamed from: p, reason: collision with root package name */
    public final Uri f111938p;

    /* renamed from: q, reason: collision with root package name */
    public final ll.j f111939q;

    /* renamed from: r, reason: collision with root package name */
    public final m81.p f111940r;

    /* renamed from: s, reason: collision with root package name */
    public h f111941s;

    /* renamed from: t, reason: collision with root package name */
    public m81.g f111942t;

    /* renamed from: u, reason: collision with root package name */
    public m81.g f111943u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f111944v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f111945w;

    /* renamed from: x, reason: collision with root package name */
    public final v f111946x;

    /* renamed from: y, reason: collision with root package name */
    public final r81.m f111947y;

    /* renamed from: z, reason: collision with root package name */
    public final r81.l f111948z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wk1.c params, a61.b pageSizeProvider, r81.p localPhotoService, boolean z13, boolean z14, boolean z15, boolean z16, o81.a lensService, sq0.f imagePreFetcher, rg0.s experiences, boolean z17, boolean z18, boolean z19, c91.f onDemandModuleController, float f13, float f14, boolean z23, f0 pinalyticsFactory, f4 experiments, lb0.r prefsManagerUser, nr0.m dynamicGridViewBinderDelegateFactory, ll.j pincodesUtil, m81.p lensMode) {
        super(params);
        w81.c pwtLogger = w81.c.f128457a;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(localPhotoService, "localPhotoService");
        Intrinsics.checkNotNullParameter(lensService, "lensService");
        Intrinsics.checkNotNullParameter(pwtLogger, "pwtLogger");
        Intrinsics.checkNotNullParameter(imagePreFetcher, "imagePreFetcher");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(onDemandModuleController, "onDemandModuleController");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(experiments, "structuredFeedLibraryExperiments");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(pincodesUtil, "pincodesUtil");
        Intrinsics.checkNotNullParameter(lensMode, "lensMode");
        this.f111922a = localPhotoService;
        this.f111924b = z13;
        this.f111925c = z14;
        this.f111926d = z15;
        this.f111927e = z16;
        this.f111928f = lensService;
        this.f111929g = pwtLogger;
        this.f111930h = experiences;
        this.f111931i = z17;
        this.f111932j = z18;
        this.f111933k = z19;
        this.f111934l = onDemandModuleController;
        this.f111935m = f13;
        this.f111936n = f14;
        this.f111937o = z23;
        this.f111938p = null;
        this.f111939q = pincodesUtil;
        this.f111940r = lensMode;
        this.f111941s = h.NONE;
        m81.g gVar = m81.g.NONE;
        this.f111942t = gVar;
        this.f111943u = gVar;
        v vVar = params.f130137h;
        this.f111946x = vVar;
        k81.k remoteRequestListener = new k81.k(this, 1);
        uk1.d presenterPinalytics = getPresenterPinalytics();
        q<Boolean> networkStateStream = getNetworkStateStream();
        wa2.i pinFeatureConfig = params.f130131b.f103320a;
        uk1.d presenterPinalytics2 = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        nr0.l viewBinderDelegate = ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics2, nVar.f103320a, nVar, vVar);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        v viewResources = params.f130137h;
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(imagePreFetcher, "imagePreFetcher");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(remoteRequestListener, "remoteRequestListener");
        r81.m mVar = new r81.m("visual_search/lens/search/", viewBinderDelegate, imagePreFetcher, null, null, null, null, null, remoteRequestListener, 0L, null, 7160);
        mVar.c(r81.n.f106786a, new se1.c(presenterPinalytics, networkStateStream, new ze1.c("lens", ""), experiments, pinFeatureConfig, viewResources, pinalyticsFactory, null, false, false, null, prefsManagerUser, "feed", 8064));
        qz.f0 f0Var = new qz.f0();
        f0Var.e("fields", n00.b.a(n00.c.DEFAULT_PIN_FEED));
        f0Var.e("page_size", pageSizeProvider.d());
        mVar.f49121k = f0Var;
        this.f111947y = mVar;
        uk1.d presenterPinalytics3 = getPresenterPinalytics();
        q<Boolean> networkStateStream2 = getNetworkStateStream();
        Intrinsics.checkNotNullParameter(presenterPinalytics3, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream2, "networkStateStream");
        Intrinsics.checkNotNullParameter(this, "historyCellPresenterListener");
        Context context = kb0.a.f79058b;
        r81.l lVar = new r81.l("visual_search/lens/history/", new ke0.a[]{(ke0.a) ((oa) ((so1.b) ep.b.g(so1.b.class))).Gc.get()}, null, null, null, null, null, null, 0L, 2044);
        lVar.o(RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY, new ni0.f(presenterPinalytics3, networkStateStream2, this));
        this.f111948z = lVar;
        this.A = new r81.k(getPresenterPinalytics(), getNetworkStateStream(), localPhotoService, this);
        this.B = new r81.a(localPhotoService, this);
        this.M = a32.i.BACK;
        this.P = m81.k.UNSET;
        this.Q = "";
        this.R = "";
        this.S = "";
        this.W = new ArrayList();
        this.Z = new Handler(Looper.getMainLooper());
    }

    public static final void u3(p pVar) {
        pVar.getClass();
        pVar.g4(h.ROOM_REPAINT_FAILED);
        pVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.ROOM_REPAINT_GENERATION_FAILED, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // ib2.d
    public final void B0(RectF cropBounds) {
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
    }

    public final String B3() {
        String b13;
        int i13 = i.f111902a[this.f111942t.ordinal()];
        v vVar = this.f111946x;
        switch (i13) {
            case 1:
                if (this.f111932j) {
                    return "";
                }
                return ((yk1.a) vVar).f139224a.getString(uc2.h.lens_more_like_this);
            case 2:
                return ((yk1.a) vVar).f139224a.getString(uc2.h.lens_history);
            case 3:
                String str = this.A.f106785j;
                if (str != null) {
                    if (str.length() == 0) {
                        b13 = ((yk1.a) vVar).f139224a.getString(dt1.d.all_photos);
                    } else {
                        xk2.v vVar2 = y.f115589f;
                        b13 = vt1.a.u().b(vVar, str);
                    }
                    String str2 = b13;
                    if (str2 != null) {
                        return str2;
                    }
                }
                return ((yk1.a) vVar).f139224a.getString(uc2.h.lens_recent_photos);
            case 4:
                return ((yk1.a) vVar).f139224a.getString(dt1.d.gallery_directory_selection);
            case 5:
            case 6:
            case 7:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean D3() {
        return this.f111925c || this.f111927e;
    }

    @Override // ib2.d
    public final void F0() {
        d0.v(getPinalytics(), f1.FLASHLIGHT_CROPPER_MOVE, "", false, 12);
    }

    public final Uri F3() {
        if (this.f111940r == m81.p.ROOM_REPAINT) {
            u81.r rVar = (u81.r) ((m81.q) getView());
            WebImageView webImageView = rVar.f121092w1;
            if (webImageView != null) {
                return rVar.r9(webImageView.C);
            }
            Intrinsics.r("imagePreview");
            throw null;
        }
        Uri uri = this.f111938p;
        if (uri != null) {
            return uri;
        }
        a32.c cVar = this.L;
        int i13 = cVar == null ? -1 : i.f111903b[cVar.ordinal()];
        if (i13 == 1) {
            return ((u81.r) ((m81.q) getView())).r9(this.G);
        }
        if (i13 != 2) {
            return null;
        }
        return this.H;
    }

    @Override // ib2.d
    public final void G2(RectF cropBounds) {
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
        r2(cropBounds);
    }

    public final q11 G3() {
        ArrayList arrayList = this.W;
        if (arrayList.size() == 1) {
            return (q11) arrayList.get(0);
        }
        vb0.j.f125466a.G("LensPresenter: setting SINGLE_PROMINENT_STELA_DOT as the crop_source but the number of visual objects returned is not 1", new Object[0]);
        return null;
    }

    public final boolean H3() {
        h hVar = this.f111941s;
        return hVar == h.SEARCH_RESULTS || hVar == h.STELA_CROP || hVar == h.ROOM_REPAINT_RESULTS;
    }

    public final void I3() {
        g4(this.f111924b ? h.ACTIVE_CAMERA : h.CAMERA_DENIED);
        e4(m81.g.NONE);
    }

    public final void J3() {
        ca2.e.i(((u81.r) ((m81.q) getView())).l9(), "background_tapped", 0.0f, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0083  */
    @Override // s81.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0(android.net.Uri r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "imageUri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r1 = "filename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            uy.t r1 = new uy.t
            r1.<init>()
            r1.i()
            uy.r r1 = new uy.r
            r1.<init>()
            r1.i()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "screenshot"
            r3 = 1
            boolean r9 = kotlin.text.StringsKt.E(r9, r2, r3)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r2 = "is_screenshot"
            r1.put(r2, r9)
            nx.d0 r9 = r7.getPinalytics()
            h32.f1 r2 = h32.f1.FLASHLIGHT_LENS_GALLERY_SEARCH
            java.lang.String r4 = r8.getPath()
            if (r4 == 0) goto L5d
            k6.g r5 = new k6.g     // Catch: java.lang.Exception -> L53
            r5.<init>(r4)     // Catch: java.lang.Exception -> L53
            java.lang.String r4 = "DateTime"
            java.lang.String r4 = r5.e(r4)     // Catch: java.lang.Exception -> L53
            java.util.Date r4 = vb0.g.c(r4, r3)     // Catch: java.lang.Exception -> L53
            long r4 = r4.getTime()     // Catch: java.lang.Exception -> L53
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L53
            goto L5f
        L53:
            r4 = move-exception
            java.util.HashSet r5 = tb0.h.f117076w
            tb0.h r5 = tb0.g.f117075a
            java.lang.String r6 = "Error creating ExifInterface in LensPresenter"
            r5.o(r6, r4)
        L5d:
            java.lang.String r4 = ""
        L5f:
            r5 = 0
            r9.g(r2, r4, r1, r5)
            a32.c r9 = a32.c.CAMERA_GALLERY
            r7.L = r9
            r7.H = r8
            yk1.n r9 = r7.getView()
            m81.q r9 = (m81.q) r9
            u81.r r9 = (u81.r) r9
            r9.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1200(0x4b0, float:1.682E-42)
            android.content.Context r9 = r9.requireContext()
            android.graphics.Bitmap r9 = qb0.b.k(r9, r8, r0, r0)
            if (r9 == 0) goto Lad
            yk1.n r0 = r7.getView()
            m81.q r0 = (m81.q) r0
            u81.r r0 = (u81.r) r0
            r0.D9(r8)
            m81.p r8 = r7.f111940r
            m81.p r0 = m81.p.ROOM_REPAINT
            if (r8 != r0) goto L9a
            s81.h r8 = s81.h.ROOM_REPAINT_STYLE_PICKER
            r7.g4(r8)
            goto La6
        L9a:
            s81.h r8 = s81.h.SEARCH_RESULTS
            r7.g4(r8)
            m81.g r8 = r7.z3()
            r7.e4(r8)
        La6:
            r8 = 0
            r7.i4(r9, r5, r3, r8)
            r7.h4(r9, r5, r3, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s81.p.K0(android.net.Uri, java.lang.String):void");
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: K3, reason: merged with bridge method [inline-methods] */
    public final void r3(m81.q view) {
        h hVar;
        Function0 function0;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        u81.r rVar = (u81.r) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        rVar.X1 = this;
        LensBottomControlsContainer lensBottomControlsContainer = rVar.G1;
        if (lensBottomControlsContainer == null) {
            Intrinsics.r("bottomContainer");
            throw null;
        }
        lensBottomControlsContainer.f48046a = this;
        rVar.l9().f27252k = this;
        if (!this.f111924b) {
            h3 h3Var = o4.f83450b;
            if (o4.f83451c == null) {
                int i13 = h3Var.f83383a;
                switch (i13) {
                    case 13:
                        function0 = w3.f83500d;
                        break;
                    default:
                        function0 = o4.f83452d;
                        break;
                }
                function0.invoke();
                b4 b4Var = b4.f83303j;
                switch (i13) {
                    case 13:
                        Intrinsics.checkNotNullParameter(b4Var, "<set-?>");
                        w3.f83500d = b4Var;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(b4Var, "<set-?>");
                        o4.f83452d = b4Var;
                        break;
                }
            }
            o4 o4Var = o4.f83451c;
            if (o4Var == null) {
                Intrinsics.r("INSTANCE");
                throw null;
            }
            o4Var.a();
        }
        h hVar2 = this.f111941s;
        h hVar3 = h.NONE;
        if (hVar2 != hVar3 && hVar2 != (hVar = h.CAMERA_DENIED)) {
            if (this.f111924b) {
                n4(hVar3);
            } else {
                g4(hVar);
            }
            k4(true);
            if (H3()) {
                Uri uri = this.H;
                if (uri != null) {
                    rVar.D9(uri);
                }
                String imageUrl = this.K;
                if (imageUrl != null) {
                    Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                    WebImageView webImageView = rVar.f121092w1;
                    if (webImageView == null) {
                        Intrinsics.r("imagePreview");
                        throw null;
                    }
                    webImageView.loadUrl(imageUrl);
                }
            }
        } else if (this.f111924b) {
            M3(true);
        } else if (D3() && this.f111926d) {
            X3();
        } else {
            rVar.z9(false);
        }
        l4(this.f111925c, this.f111927e);
        String text = B3();
        Intrinsics.checkNotNullParameter(text, "text");
        da2.g gVar = rVar.B1;
        if (gVar != null) {
            gVar.f(text);
        }
        this.N = (ek2.j) this.f111947y.f49129s.F(new a81.a(21, new k(this, 2)), new a81.a(22, new k(this, 3)), ck2.i.f27923c, ck2.i.f27924d);
    }

    public final void L3(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f111921J = kh2.j.R(bitmap.getWidth(), bitmap.getHeight());
        m81.q qVar = (m81.q) getView();
        s sVar = this.f111921J;
        int i13 = sVar == null ? -1 : i.f111905d[sVar.ordinal()];
        ImageView.ScaleType scaleType = i13 != 1 ? i13 != 2 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_START;
        u81.r rVar = (u81.r) qVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        WebImageView webImageView = rVar.f121092w1;
        Float f13 = null;
        if (webImageView == null) {
            Intrinsics.r("imagePreview");
            throw null;
        }
        webImageView.setScaleType(scaleType);
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width != 0 && height != 0) {
            f13 = Float.valueOf(hf0.b.f69002b * (height / width));
        }
        this.I = f13;
        f4();
    }

    @Override // ca2.b
    public final void M0(String str) {
        this.f111944v = false;
        if (!H3()) {
            e4(m81.g.NONE);
            return;
        }
        m81.q qVar = (m81.q) getView();
        Float f13 = this.I;
        u81.r rVar = (u81.r) qVar;
        float f14 = rVar.N1 - rVar.l9().f27259r;
        float min = Math.min(f14, f13 != null ? f13.floatValue() : f14);
        com.pinterest.feature.search.visual.cropper.n nVar = rVar.f121093x1;
        if (nVar != null) {
            nVar.f47990a = min;
        }
        GestaltIconButton button = rVar.f121068e2;
        if (button != null) {
            Resources resources = rVar.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(resources, "resources");
            if (button.getVisibility() == 0) {
                button.post(new po.c(button, min, resources));
            }
        }
        rVar.p9().f(min);
    }

    public final void M3(boolean z13) {
        this.f111924b = z13;
        int i13 = 0;
        if (z13) {
            g4(h.ACTIVE_CAMERA);
            pp2.a.E0(getPinalytics(), u0.LENS_PERMISSION_RESULT_AUTHORIZED, g0.CAMERA_PERMISSIONS);
            getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.VIRTUAL_TRY_ON_ICON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            addDisposable(nl.b.s(s1.f(((dh0.d) this.f111930h).g(y0.ANDROID_CAMERA_DISCOVERY, null, new tg0.c(false, false)).H(tk2.e.f118017c), "observeOn(...)"), new k(this, i13), null, null, 6));
            return;
        }
        pp2.a.E0(getPinalytics(), u0.LENS_PERMISSION_RESULT_DENIED, g0.CAMERA_PERMISSIONS);
        boolean z14 = this.f111926d;
        v vVar = this.f111946x;
        if (!z14) {
            m81.q qVar = (m81.q) getView();
            String text = ((yk1.a) vVar).f139224a.getString(uc2.h.lens_enable_camera_access_text);
            u81.r rVar = (u81.r) qVar;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(text, "text");
            GestaltText gestaltText = rVar.f121086q1;
            if (gestaltText != null) {
                pk.a0.p(gestaltText, text);
            }
            g4(h.CAMERA_DENIED);
            return;
        }
        m81.q qVar2 = (m81.q) getView();
        String buttonText = ((yk1.a) vVar).f139224a.getString(uc2.h.lens_allow_in_settings);
        u81.r rVar2 = (u81.r) qVar2;
        rVar2.getClass();
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        ny1.h hVar = ny1.h.f92668f;
        FragmentActivity requireActivity = rVar2.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        if (hVar.b(requireActivity, rVar2.o9(), false)) {
            rVar2.x9(true);
            GestaltButton gestaltButton = rVar2.f121087r1;
            if (gestaltButton != null) {
                gestaltButton.d(u81.c.f121005n);
            }
            GestaltButton gestaltButton2 = rVar2.f121087r1;
            if (gestaltButton2 != null) {
                gestaltButton2.e(new u81.j(rVar2, 7));
            }
        } else {
            GestaltButton gestaltButton3 = rVar2.f121087r1;
            if (gestaltButton3 != null) {
                gestaltButton3.d(u81.c.f121006o);
            }
            GestaltButton gestaltButton4 = rVar2.f121087r1;
            if (gestaltButton4 != null) {
                gestaltButton4.e(new u81.j(rVar2, 8));
            }
        }
        if (D3()) {
            return;
        }
        g4(h.CAMERA_DENIED);
    }

    public final void N3() {
        h hVar;
        if (i.f111904c[this.f111941s.ordinal()] == 1) {
            getPinalytics().X(u0.FLASHLIGHT_CLOSE_ICON);
            if (this.f111940r == m81.p.ROOM_REPAINT) {
                h hVar2 = h.CAMERA_DENIED;
            }
            hVar = h.SEARCH_RESULTS;
        } else {
            getPinalytics().X(u0.FLASHLIGHT_SEARCH_ICON);
            com.pinterest.feature.search.visual.cropper.n nVar = ((u81.r) ((m81.q) getView())).f121093x1;
            if (nVar != null) {
                nVar.a();
            }
            hVar = h.STELA_CROP;
        }
        g4(hVar);
    }

    @Override // ib2.d
    public final void O2(RectF cropBounds) {
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
    }

    public final void Q3(double d2, double d13, double d14, double d15, boolean z13) {
        d4();
        if (z13) {
            x3((float) d2, (float) d13, (float) d14, (float) d15, g42.c.STELA_DOT);
        }
        g4(h.STELA_CROP);
    }

    public final void R3() {
        if (!this.f111924b || H3() || this.f111941s == h.NONE) {
            return;
        }
        if (this.f111937o) {
            q81.a aVar = ((u81.r) ((m81.q) getView())).J1;
            if (aVar != null) {
                aVar.e();
                return;
            }
            return;
        }
        u81.i iVar = ((u81.r) ((m81.q) getView())).I1;
        if (iVar != null) {
            iVar.g();
        }
    }

    public final void S3(boolean z13, boolean z14) {
        this.f111925c = z13;
        this.f111927e = z14;
        l4(z13, z14);
        if (!D3()) {
            pp2.a.E0(getPinalytics(), u0.LENS_PERMISSION_RESULT_DENIED, g0.PHOTO_LIBRARY_PERMISSIONS);
        } else {
            pp2.a.E0(getPinalytics(), u0.LENS_PERMISSION_RESULT_AUTHORIZED, g0.PHOTO_LIBRARY_PERMISSIONS);
            X3();
        }
    }

    public final void T3(int i13, Bitmap bitmap, String mediaFilePath) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(mediaFilePath, "mediaFilePath");
        this.L = a32.c.CAMERA_SNAP;
        if (this.f111940r == m81.p.ROOM_REPAINT) {
            g4(h.ROOM_REPAINT_STYLE_PICKER);
        } else {
            g4(h.SEARCH_RESULTS);
            e4(z3());
        }
        i4(bitmap, i13, false, mediaFilePath);
        h4(bitmap, i13, false, mediaFilePath);
        this.M = i13 == 0 ? a32.i.BACK : a32.i.FRONT;
    }

    @Override // ca2.b
    public final void U2() {
        float f13;
        this.f111944v = true;
        if (H3()) {
            m81.q qVar = (m81.q) getView();
            Float f14 = this.I;
            u81.r rVar = (u81.r) qVar;
            if (f14 != null) {
                rVar.getClass();
                f13 = f14.floatValue();
            } else {
                f13 = rVar.f121070f2;
            }
            com.pinterest.feature.search.visual.cropper.n nVar = rVar.f121093x1;
            if (nVar != null) {
                nVar.f47990a = f13;
            }
            GestaltIconButton button = rVar.f121068e2;
            if (button != null) {
                float f15 = rVar.f121070f2;
                Resources resources = rVar.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(resources, "resources");
                if (button.getVisibility() == 0) {
                    button.post(new po.c(button, f15, resources));
                }
            }
            rVar.p9().g(rVar.f121070f2);
        }
    }

    public final boolean U3() {
        h hVar;
        if (this.O) {
            return true;
        }
        h hVar2 = this.f111941s;
        h hVar3 = h.ROOM_REPAINT_LOADING;
        if (hVar2 == hVar3) {
            getPinalytics().X(u0.ROOM_REPAINT_GENERATION_CANCEL);
        }
        if (!H3() && (hVar = this.f111941s) != h.ROOM_REPAINT_FAILED && hVar != hVar3) {
            if (this.f111924b) {
                return false;
            }
            pp2.a.E0(getPinalytics(), u0.LENS_PERMISSION_RESULT_EXITED, g0.CAMERA_PERMISSIONS);
            return false;
        }
        g4(this.f111924b ? h.ACTIVE_CAMERA : h.CAMERA_DENIED);
        e4(m81.g.NONE);
        ((w81.c) this.f111929g).getClass();
        new uy.s(s92.o.ABORTED).i();
        return true;
    }

    public final void V3(boolean z13, boolean z14) {
        this.f111925c = z13;
        this.f111927e = z14;
        l4(z13, z14);
        if (!D3()) {
            if (this.f111941s == h.GALLERY_OR_HISTORY && this.f111942t == m81.g.GALLERY_PHOTOS) {
                I3();
                return;
            }
            return;
        }
        if (this.f111941s == h.GALLERY_OR_HISTORY && this.f111942t == m81.g.GALLERY_PHOTOS) {
            ((u81.r) ((m81.q) getView())).getClass();
            xk2.v vVar = y.f115589f;
            vt1.a.u().e();
            ((u81.r) ((m81.q) getView())).O9(!z13);
            r81.k kVar = this.A;
            kVar.f106777b = false;
            kVar.f106785j = "";
            kVar.clear();
            kVar.f106777b = true;
            onRecyclerRefresh();
        }
    }

    @Override // ib2.d
    public final void V5() {
        d0.v(getPinalytics(), f1.FLASHLIGHT_CROPPER_RESIZE, "", false, 12);
    }

    public final void W3() {
        String imageUrl;
        getPresenterPinalytics().f122379a.X(u0.PIN_SAVE_BUTTON);
        a32.c cVar = this.L;
        int i13 = cVar == null ? -1 : i.f111903b[cVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            u81.r rVar = (u81.r) ((m81.q) getView());
            w o93 = rVar.o9();
            FragmentActivity requireActivity = rVar.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            o93.c(requireActivity, ny1.f.f92666f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? t.f92701l : new u81.n(rVar, 10), (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? t.f92702m : null, (r23 & 1024) != 0 ? t.f92703n : new u81.n(rVar, 11));
            return;
        }
        if (i13 == 3 && (imageUrl = this.K) != null) {
            u81.r rVar2 = (u81.r) ((m81.q) getView());
            rVar2.getClass();
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Context context = rVar2.getContext();
            if (context != null) {
                Intent b13 = rVar2.a7().b(context, lu1.a.PIN_IT_ACTIVITY);
                b13.putExtra("com.pinterest.EXTRA_URL", " ");
                b13.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", "lens_camera");
                b13.putExtra("com.pinterest.EXTRA_IMAGE", imageUrl);
                FragmentActivity E4 = rVar2.E4();
                if (E4 != null) {
                    E4.startActivityForResult(b13, RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION);
                }
            }
        }
    }

    public final void X3() {
        g4(h.GALLERY_OR_HISTORY);
        e4(m81.g.GALLERY_PHOTOS);
        ((u81.r) ((m81.q) getView())).O9(!this.f111925c);
    }

    public final void Y3() {
        if (isBound() && this.X) {
            u81.r rVar = (u81.r) ((m81.q) getView());
            h81.c cVar = rVar.f121074h2;
            if (cVar != null && cVar.getParent() != null) {
                ViewParent parent = cVar.getParent();
                FrameLayout frameLayout = rVar.f121094y1;
                if (frameLayout == null) {
                    Intrinsics.r("imagePreviewContainer");
                    throw null;
                }
                if (Intrinsics.d(parent, frameLayout)) {
                    FrameLayout frameLayout2 = rVar.f121094y1;
                    if (frameLayout2 == null) {
                        Intrinsics.r("imagePreviewContainer");
                        throw null;
                    }
                    frameLayout2.removeView(cVar);
                }
            }
            this.X = false;
        }
    }

    public final void Z3() {
        u81.i iVar;
        if (this.U) {
            this.U = false;
            u81.r rVar = (u81.r) ((m81.q) getView());
            rVar.M9(false);
            mr.a aVar = rVar.f121061a2;
            if (aVar == null || aVar.getParent() == null || !Intrinsics.d(aVar.getParent(), rVar.I1) || (iVar = rVar.I1) == null) {
                return;
            }
            iVar.removeView(aVar);
        }
    }

    public final void a4() {
        if (isBound()) {
            LinearLayout linearLayout = ((u81.r) ((m81.q) getView())).S1;
            if (linearLayout == null) {
                Intrinsics.r("errorMessageContainer");
                throw null;
            }
            bs1.c.R1(linearLayout, false);
            this.P = m81.k.UNSET;
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(this.f111947y);
        iVar.b(this.A);
        iVar.b(this.B);
        iVar.b(this.f111948z);
    }

    public final void d4() {
        if (isBound()) {
            xd1.e eVar = ((u81.r) ((m81.q) getView())).C1;
            if (eVar != null) {
                eVar.b();
            }
            this.f111923a0 = da2.i.TAB_SHOP;
        }
    }

    public final void e4(m81.g value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f111943u = this.f111942t;
        this.f111942t = value;
        k4(false);
    }

    public final void f4() {
        Float f13;
        q11 G3;
        if (isBound()) {
            boolean z13 = this.O;
            if (!z13 && this.P == m81.k.ERROR_PROCESSED) {
                u81.r rVar = (u81.r) ((m81.q) getView());
                rVar.L9(false);
                rVar.I9(false);
                LinearLayout linearLayout = rVar.S1;
                if (linearLayout == null) {
                    Intrinsics.r("errorMessageContainer");
                    throw null;
                }
                bs1.c.R1(linearLayout, true);
                String errorTitle = this.Q;
                String errorMessage = this.R;
                String errorButtonText = this.S;
                Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                Intrinsics.checkNotNullParameter(errorButtonText, "errorButtonText");
                GestaltText gestaltText = rVar.T1;
                if (gestaltText == null) {
                    Intrinsics.r("errorTitle");
                    throw null;
                }
                gestaltText.setText(errorTitle);
                GestaltText gestaltText2 = rVar.U1;
                if (gestaltText2 == null) {
                    Intrinsics.r("errorMessage");
                    throw null;
                }
                gestaltText2.setText(errorMessage);
                GestaltButton gestaltButton = rVar.V1;
                if (gestaltButton == null) {
                    Intrinsics.r("errorTryAgainButton");
                    throw null;
                }
                gestaltButton.setText(errorButtonText);
                this.P = m81.k.ERROR_SHOWN;
                r81.m mVar = this.f111947y;
                mVar.i0(null);
                mVar.h0(null);
                return;
            }
            if (z13 || this.P != m81.k.NO_ERROR || this.f111921J == null || this.I == null) {
                return;
            }
            m81.q qVar = (m81.q) getView();
            h hVar = this.f111941s;
            u81.r rVar2 = (u81.r) qVar;
            rVar2.L9(hVar == h.SEARCH_RESULTS || hVar == h.ROOM_REPAINT_RESULTS);
            boolean z14 = this.f111931i;
            boolean z15 = this.f111932j;
            if (z14 || z15) {
                rVar2.f121070f2 = rVar2.N1 - rVar2.l9().f27245d;
                rVar2.I9(true);
                GestaltIconButton gestaltIconButton = rVar2.f121068e2;
                if (gestaltIconButton != null) {
                    gestaltIconButton.setClickable(true);
                }
                if (!isBound() || this.X) {
                    return;
                }
                ArrayList visualObjects = this.W;
                if (visualObjects.isEmpty() || (f13 = this.I) == null) {
                    return;
                }
                float floatValue = f13.floatValue();
                s sVar = this.f111921J;
                if (sVar == null) {
                    return;
                }
                if (sVar != s.SPAN_WIDTH) {
                    floatValue = this.f111936n;
                }
                float f14 = floatValue;
                m81.q qVar2 = (m81.q) getView();
                Boolean bool = this.V;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                u81.r rVar3 = (u81.r) qVar2;
                rVar3.getClass();
                Intrinsics.checkNotNullParameter(visualObjects, "visualObjects");
                h81.c cVar = rVar3.f121074h2;
                if (cVar == null || !cVar.isAttachedToWindow()) {
                    Context requireContext = rVar3.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    h81.c cVar2 = new h81.c(requireContext, rVar3.M1, f14, null, 0);
                    FrameLayout frameLayout = rVar3.f121094y1;
                    if (frameLayout == null) {
                        Intrinsics.r("imagePreviewContainer");
                        throw null;
                    }
                    frameLayout.addView(cVar2, -1, -1);
                    rVar3.f121074h2 = cVar2;
                    uk1.e eVar = rVar3.f121060a1;
                    if (eVar == null) {
                        Intrinsics.r("presenterPinalyticsFactory");
                        throw null;
                    }
                    g81.b bVar = new g81.b(visualObjects, rVar3, ((uk1.a) eVar).f(rVar3.s7(), ""), rVar3.p7(), rVar3.M1, f14, 0.0f, null, null, null, booleanValue, false, null, 15296);
                    h81.c cVar3 = rVar3.f121074h2;
                    if (cVar3 != null) {
                        yk1.j.a().d(cVar3, bVar);
                    }
                }
                if (Intrinsics.d(this.V, Boolean.TRUE) && this.f111940r != m81.p.ROOM_REPAINT && (G3 = G3()) != null) {
                    m81.q qVar3 = (m81.q) getView();
                    Double t13 = G3.t();
                    Intrinsics.checkNotNullExpressionValue(t13, "getX(...)");
                    double doubleValue = t13.doubleValue();
                    Double u13 = G3.u();
                    Intrinsics.checkNotNullExpressionValue(u13, "getY(...)");
                    double doubleValue2 = u13.doubleValue();
                    Double s13 = G3.s();
                    Intrinsics.checkNotNullExpressionValue(s13, "getW(...)");
                    double doubleValue3 = s13.doubleValue();
                    Double o13 = G3.o();
                    Intrinsics.checkNotNullExpressionValue(o13, "getH(...)");
                    double doubleValue4 = o13.doubleValue();
                    h81.c cVar4 = ((u81.r) qVar3).f121074h2;
                    if (cVar4 != null) {
                        cVar4.a(doubleValue, doubleValue2, doubleValue3, doubleValue4, 0, false);
                    }
                }
                this.X = true;
                if (z15 && (!visualObjects.isEmpty()) && !this.Y) {
                    m81.q qVar4 = (m81.q) getView();
                    Double t14 = ((q11) visualObjects.get(0)).t();
                    Intrinsics.checkNotNullExpressionValue(t14, "getX(...)");
                    double doubleValue5 = t14.doubleValue();
                    Double u14 = ((q11) visualObjects.get(0)).u();
                    Intrinsics.checkNotNullExpressionValue(u14, "getY(...)");
                    double doubleValue6 = u14.doubleValue();
                    Double s14 = ((q11) visualObjects.get(0)).s();
                    Intrinsics.checkNotNullExpressionValue(s14, "getW(...)");
                    double doubleValue7 = s14.doubleValue();
                    Double o14 = ((q11) visualObjects.get(0)).o();
                    Intrinsics.checkNotNullExpressionValue(o14, "getH(...)");
                    double doubleValue8 = o14.doubleValue();
                    h81.c cVar5 = ((u81.r) qVar4).f121074h2;
                    if (cVar5 != null) {
                        cVar5.a(doubleValue5, doubleValue6, doubleValue7, doubleValue8, 0, false);
                    }
                    this.Y = true;
                }
            }
        }
    }

    public final void g4(h hVar) {
        h hVar2 = this.f111941s;
        this.f111941s = hVar;
        n4(hVar2);
    }

    public final void h4(Bitmap bitmap, int i13, boolean z13, String str) {
        p81.c cVar = this.D;
        if (cVar == null) {
            cVar = new p81.c(new o(this, 0), 1200.0f, this.f111937o);
            this.D = cVar;
        }
        cVar.f99125g = bitmap;
        cVar.f99126h = i13;
        cVar.f99127i = z13;
        cVar.f99128j = str;
        cVar.b();
    }

    public final void i4(Bitmap bitmap, int i13, boolean z13, String str) {
        p81.c cVar = this.C;
        if (cVar == null) {
            cVar = new p81.c(new o(this, 1), 474.0f, this.f111937o);
            this.C = cVar;
        }
        cVar.f99125g = bitmap;
        cVar.f99126h = i13;
        cVar.f99127i = z13;
        cVar.f99128j = str;
        cVar.b();
    }

    public final void j4(boolean z13) {
        if (isBound()) {
            ((u81.r) ((m81.q) getView())).H9(z13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0199, code lost:
    
        if (r6 != 5) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k4(boolean r26) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s81.p.k4(boolean):void");
    }

    public final void l4(boolean z13, boolean z14) {
        if (!z13 && !z14) {
            ((u81.r) ((m81.q) getView())).B9(0.3f);
            return;
        }
        ((u81.r) ((m81.q) getView())).B9(1.0f);
        r81.p pVar = this.f111922a;
        pVar.getClass();
        Camera camera = fa2.c.f61593a;
        String path = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera").getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getCameraPhotosPath(...)");
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        xj2.c F = s1.f(pVar.f106790c.d(pVar.f106788a, path, true, false, false, a13, 1).s().k(new d51.a(29, r81.g.f106765m)).u().H(tk2.e.f118017c), "observeOn(...)").F(new a81.a(19, new k(this, 1)), new a81.a(20, l.f111908j), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void n4(h hVar) {
        if (isBound()) {
            m81.q qVar = (m81.q) getView();
            int i13 = i.f111904c[this.f111941s.ordinal()];
            int i14 = 1;
            boolean z13 = this.f111937o;
            switch (i13) {
                case 1:
                    u81.r rVar = (u81.r) qVar;
                    rVar.A9(rm1.q.CANCEL, om1.f.TRANSPARENT_ALWAYS_LIGHT, om1.e.LG);
                    rVar.L9(false);
                    rVar.G9(false);
                    rVar.p9().e(false);
                    return;
                case 2:
                    u81.r rVar2 = (u81.r) qVar;
                    pp2.a.D0(rVar2.s7());
                    View view = rVar2.f121084o1;
                    if (view == null) {
                        Intrinsics.r("missingCameraPermissionContainer");
                        throw null;
                    }
                    view.setVisibility(0);
                    rVar2.t9();
                    rVar2.k9();
                    rVar2.L9(false);
                    rVar2.K9(true);
                    rVar2.J9(true);
                    j4(true);
                    rVar2.N9(true);
                    rVar2.F9();
                    LensBottomControlsContainer lensBottomControlsContainer = rVar2.G1;
                    if (lensBottomControlsContainer == null) {
                        Intrinsics.r("bottomContainer");
                        throw null;
                    }
                    bs1.c.R1(lensBottomControlsContainer, true);
                    rVar2.G9(true);
                    rVar2.t9();
                    this.f111921J = null;
                    this.I = null;
                    a4();
                    com.pinterest.feature.search.visual.cropper.n nVar = rVar2.f121093x1;
                    if (nVar != null) {
                        nVar.h();
                    }
                    rVar2.I9(false);
                    if (!D3()) {
                        rVar2.B9(0.3f);
                    }
                    if (this.X) {
                        Y3();
                        return;
                    }
                    return;
                case 3:
                    u81.r rVar3 = (u81.r) qVar;
                    LensBottomControlsContainer lensBottomControlsContainer2 = rVar3.G1;
                    if (lensBottomControlsContainer2 == null) {
                        Intrinsics.r("bottomContainer");
                        throw null;
                    }
                    lensBottomControlsContainer2.e();
                    rVar3.u9();
                    Context context = rVar3.getContext();
                    if (context != null) {
                        LensBottomControlsContainer lensBottomControlsContainer3 = rVar3.G1;
                        if (lensBottomControlsContainer3 == null) {
                            Intrinsics.r("bottomContainer");
                            throw null;
                        }
                        lensBottomControlsContainer3.f48048c.setColorFilter(dl2.b.x0(context, eo1.a.base_color_grayscale_0), PorterDuff.Mode.SRC_IN);
                    }
                    rVar3.C9();
                    LensBottomControlsContainer lensBottomControlsContainer4 = rVar3.G1;
                    if (lensBottomControlsContainer4 == null) {
                        Intrinsics.r("bottomContainer");
                        throw null;
                    }
                    bs1.c.R1(lensBottomControlsContainer4, true);
                    rVar3.G9(true);
                    rVar3.F9();
                    rVar3.t9();
                    com.pinterest.feature.search.visual.cropper.n nVar2 = rVar3.f121093x1;
                    if (nVar2 != null) {
                        nVar2.h();
                    }
                    rVar3.k9();
                    rVar3.J9(true);
                    rVar3.K9(true);
                    rVar3.N9(true);
                    rVar3.L9(false);
                    this.f111921J = null;
                    this.I = null;
                    rVar3.I9(false);
                    GestaltIconButton gestaltIconButton = rVar3.f121068e2;
                    if (gestaltIconButton != null) {
                        gestaltIconButton.setClickable(false);
                    }
                    rVar3.p9().e(false);
                    bs1.c.X0(rVar3.f121082m1);
                    RoomRepaintInfoView roomRepaintInfoView = rVar3.f121083n1;
                    if (roomRepaintInfoView != null) {
                        roomRepaintInfoView.a();
                    }
                    if (this.f111940r == m81.p.ROOM_REPAINT) {
                        lb0.p pVar = lb0.n.f82725d;
                        if (!((lb0.b) pVar.a()).e("room_repaint_education", false)) {
                            rVar3.f7().e(1000L, new of0.a(new u81.y()));
                            lb0.m c13 = ((lb0.b) pVar.a()).c();
                            c13.putBoolean("room_repaint_education", true);
                            c13.apply();
                        }
                    }
                    if (this.X) {
                        Y3();
                    }
                    a4();
                    return;
                case 4:
                    if (this.f111924b) {
                        ((u81.r) qVar).C9();
                    }
                    u81.r rVar4 = (u81.r) qVar;
                    rVar4.J9(true);
                    rVar4.K9(true);
                    rVar4.N9(true);
                    rVar4.L9(false);
                    rVar4.F9();
                    rVar4.G9(true);
                    ca2.e l93 = rVar4.l9();
                    l93.f27245d = 0;
                    l93.f27259r = 0;
                    l93.s("initial_slide_up", true);
                    LensBottomControlsContainer lensBottomControlsContainer5 = rVar4.G1;
                    if (lensBottomControlsContainer5 == null) {
                        Intrinsics.r("bottomContainer");
                        throw null;
                    }
                    bs1.c.R1(lensBottomControlsContainer5, true);
                    a4();
                    rVar4.t9();
                    return;
                case 5:
                    u81.r rVar5 = (u81.r) qVar;
                    rVar5.u9();
                    rVar5.A9(rm1.q.FLASHLIGHT, om1.f.WASH_DARK_GRAY, om1.e.LG);
                    da2.i iVar = da2.i.TAB_EXPLORE;
                    this.f111923a0 = iVar;
                    if (isBound()) {
                        xd1.e eVar = ((u81.r) ((m81.q) getView())).C1;
                        if (eVar != null) {
                            eVar.a();
                        }
                        this.f111923a0 = iVar;
                    }
                    bs1.c.X0(rVar5.f121082m1);
                    RoomRepaintInfoView roomRepaintInfoView2 = rVar5.f121083n1;
                    if (roomRepaintInfoView2 != null) {
                        roomRepaintInfoView2.a();
                    }
                    if (hVar == h.STELA_CROP) {
                        com.pinterest.feature.search.visual.cropper.n nVar3 = rVar5.f121093x1;
                        if (nVar3 != null) {
                            nVar3.h();
                        }
                        h81.c cVar = rVar5.f121074h2;
                        if (cVar != null) {
                            cVar.b();
                        }
                        r81.m mVar = this.f111947y;
                        mVar.getClass();
                        int value = a32.f.ORGANIC.getValue();
                        qz.f0 f0Var = mVar.f49121k;
                        if (f0Var != null) {
                            f0Var.c(value, "search_type");
                        }
                        Float valueOf = Float.valueOf(0.0f);
                        mVar.k0(valueOf);
                        mVar.m0(valueOf);
                        Float valueOf2 = Float.valueOf(1.0f);
                        mVar.j0(valueOf2);
                        mVar.g0(valueOf2);
                        int value2 = g42.c.DEFAULT_CROP.getValue();
                        qz.f0 f0Var2 = mVar.f49121k;
                        if (f0Var2 != null) {
                            f0Var2.c(value2, "crop_source");
                        }
                        v3();
                        return;
                    }
                    Z3();
                    if (z13) {
                        q81.a aVar = rVar5.J1;
                        if (aVar != null) {
                            aVar.b();
                        }
                        q81.a aVar2 = rVar5.J1;
                        if (aVar2 != null) {
                            bs1.c.R1(aVar2, false);
                        }
                    } else {
                        u81.i iVar2 = rVar5.I1;
                        if (iVar2 != null) {
                            iVar2.e();
                        }
                        u81.i iVar3 = rVar5.I1;
                        if (iVar3 != null) {
                            bs1.c.R1(iVar3, false);
                        }
                    }
                    rVar5.H9(false);
                    rVar5.J9(false);
                    rVar5.K9(false);
                    rVar5.N9(false);
                    rVar5.G9(false);
                    this.O = true;
                    if (this.L != a32.c.CAMERA_SNAP) {
                        ((u81.r) ((m81.q) getView())).k9();
                    }
                    ((u81.r) ((m81.q) getView())).j9(new np.f(this, 4));
                    return;
                case 6:
                    u81.r rVar6 = (u81.r) qVar;
                    rVar6.u9();
                    RoomRepaintInfoView roomRepaintInfoView3 = rVar6.f121083n1;
                    if (roomRepaintInfoView3 != null) {
                        roomRepaintInfoView3.a();
                    }
                    bs1.c.U1(rVar6.f121082m1);
                    return;
                case 7:
                    u81.r rVar7 = (u81.r) qVar;
                    rVar7.u9();
                    bs1.c.X0(rVar7.f121082m1);
                    Z3();
                    rVar7.L9(false);
                    rVar7.I9(false);
                    if (z13) {
                        q81.a aVar3 = rVar7.J1;
                        if (aVar3 != null) {
                            aVar3.b();
                        }
                        q81.a aVar4 = rVar7.J1;
                        if (aVar4 != null) {
                            bs1.c.R1(aVar4, false);
                        }
                    } else {
                        u81.i iVar4 = rVar7.I1;
                        if (iVar4 != null) {
                            iVar4.e();
                        }
                        u81.i iVar5 = rVar7.I1;
                        if (iVar5 != null) {
                            bs1.c.R1(iVar5, false);
                        }
                    }
                    rVar7.H9(false);
                    rVar7.J9(false);
                    rVar7.K9(false);
                    rVar7.N9(false);
                    RoomRepaintInfoView roomRepaintInfoView4 = rVar7.f121083n1;
                    if (roomRepaintInfoView4 != null) {
                        roomRepaintInfoView4.c();
                    }
                    bs1.c.U1(rVar7.f121083n1);
                    rVar7.k9();
                    return;
                case 8:
                    n onRetry = new n(this, i14);
                    u81.r rVar8 = (u81.r) qVar;
                    rVar8.getClass();
                    Intrinsics.checkNotNullParameter(onRetry, "onRetry");
                    RoomRepaintInfoView roomRepaintInfoView5 = rVar8.f121083n1;
                    if (roomRepaintInfoView5 != null) {
                        roomRepaintInfoView5.b(onRetry);
                    }
                    bs1.c.U1(rVar8.f121083n1);
                    return;
                case 9:
                    u81.r rVar9 = (u81.r) qVar;
                    rVar9.u9();
                    rVar9.A9(rm1.q.FLASHLIGHT, om1.f.WASH_DARK_GRAY, om1.e.LG);
                    rVar9.p9().e(true);
                    rVar9.I9(true);
                    d4();
                    rVar9.L9(true);
                    rVar9.E9(this.I);
                    bs1.c.X0(rVar9.f121082m1);
                    RoomRepaintInfoView roomRepaintInfoView6 = rVar9.f121083n1;
                    if (roomRepaintInfoView6 != null) {
                        roomRepaintInfoView6.a();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // pw0.k
    public final void o0(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.A.f106785j = path;
        e4(m81.g.GALLERY_PHOTOS);
        ((u81.r) ((m81.q) getView())).O9(!this.f111925c);
    }

    @Override // ca2.b
    public final void o2(int i13) {
        if (i13 == 4 && this.f111941s == h.GALLERY_OR_HISTORY) {
            g4(this.f111924b ? h.ACTIVE_CAMERA : h.CAMERA_DENIED);
        }
    }

    @Override // wk1.n, yk1.b
    public final void onDeactivate() {
        ((w81.c) this.f111929g).getClass();
        new uy.s(s92.o.ABORTED).i();
        super.onDeactivate();
    }

    @Override // wk1.q, yk1.b
    public final void onRestoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            a32.a aVar = a32.c.Companion;
            int i13 = bundle.getInt("currentSourceType");
            aVar.getClass();
            this.L = i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? null : a32.c.GENERATED_CONTENT : a32.c.CAMERA_HISTORY : a32.c.CAMERA_GALLERY : a32.c.CAMERA_SNAP;
            Parcelable parcelable = bundle.getParcelable("lensPreviewImageUri");
            Uri uri = parcelable instanceof Uri ? (Uri) parcelable : null;
            if (uri != null) {
                this.L = a32.c.CAMERA_GALLERY;
                this.H = uri;
            }
            String string = bundle.getString("lensHistoryImageUrl");
            if (string != null) {
                this.K = string;
            }
            String string2 = bundle.getString("lensSearchPagedListImageUrl");
            if (string2 != null) {
                this.f111947y.i0(string2);
            }
            h hVar = (h) bundle.getSerializable("lensUIState");
            if (hVar == null) {
                hVar = h.NONE;
            }
            g4(hVar);
            m81.g gVar = (m81.g) bundle.getSerializable("lensBottomSheetMode");
            if (gVar == null) {
                gVar = m81.g.NONE;
            }
            e4(gVar);
            this.f111933k = bundle.getBoolean("showTryOnInLens");
        }
    }

    @Override // wk1.q, yk1.b
    public final void onSaveInstance(Bundle bundle) {
        if (bundle != null) {
            if (this.f111941s == h.STELA_CROP) {
                g4(h.SEARCH_RESULTS);
            }
            bundle.putSerializable("lensUIState", this.f111941s);
            bundle.putSerializable("lensBottomSheetMode", this.f111942t);
            bundle.putSerializable("showTryOnInLens", Boolean.valueOf(this.f111933k));
            m81.g gVar = this.f111942t;
            if (gVar == m81.g.RESULTS || gVar == m81.g.RESULTS_STELA) {
                String str = this.f111947y.M;
                if (str != null) {
                    bundle.putString("lensSearchPagedListImageUrl", str);
                }
                if (this.L != a32.c.CAMERA_HISTORY) {
                    Uri F3 = F3();
                    if (F3 != null) {
                        bundle.putParcelable("lensPreviewImageUri", F3);
                    }
                } else {
                    String str2 = this.K;
                    if (str2 != null) {
                        bundle.putString("lensHistoryImageUrl", str2);
                    }
                }
                a32.c cVar = this.L;
                if (cVar != null) {
                    bundle.putInt("currentSourceType", cVar.getValue());
                }
            }
        }
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ek2.j jVar = this.N;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.N = null;
        p81.c cVar = this.D;
        if (cVar != null) {
            cVar.f99122d = null;
        }
        p81.c cVar2 = this.C;
        if (cVar2 != null) {
            cVar2.f99122d = null;
        }
        p81.a aVar = this.E;
        if (aVar != null) {
            aVar.f99118e = null;
        }
        p81.a aVar2 = this.F;
        if (aVar2 != null) {
            aVar2.f99118e = null;
        }
        this.D = null;
        this.C = null;
        this.E = null;
        this.F = null;
        super.onUnbind();
    }

    @Override // ib2.d
    public final void r2(RectF cropBounds) {
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
        Float f13 = this.I;
        if (f13 != null) {
            float floatValue = f13.floatValue();
            if (this.f111921J != s.SPAN_WIDTH) {
                floatValue = this.f111936n;
            }
            float f14 = this.f111935m;
            if (f14 == 0.0f || floatValue == 0.0f) {
                return;
            }
            x3(cropBounds.left / f14, cropBounds.top / floatValue, cropBounds.width() / f14, cropBounds.height() / floatValue, g42.c.CUSTOM_CROP);
        }
    }

    @Override // ca2.b
    public final void s1(float f13, boolean z13) {
        float f14 = f13 - 0.4f;
        m81.q qVar = (m81.q) getView();
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        TopBottomGradientView topBottomGradientView = ((u81.r) qVar).f121095z1;
        if (topBottomGradientView != null) {
            topBottomGradientView.setAlpha(f14);
        } else {
            Intrinsics.r("blackOverlay");
            throw null;
        }
    }

    public final void v3() {
        if (isBound()) {
            if (!this.f111944v) {
                ((u81.r) ((m81.q) getView())).E9(this.I);
            }
            ((yq0.t) ((m81.q) getView())).resetRecyclerScrollListener();
            this.f111947y.Z();
            this.Z.post(new g(this, 0));
        }
    }

    public final ha2.a w3() {
        return new ha2.a(e0.b(new z(new x(uc2.h.manage_access, null, null, null, null, 30), kotlin.collections.f0.l(f111919b0, f111920c0), new j(1, this, p.class, "optionSelectionHandler", "optionSelectionHandler(I)V", 0))), false, (Integer) null, 14);
    }

    public final void x3(float f13, float f14, float f15, float f16, g42.c cVar) {
        r81.m mVar = this.f111947y;
        mVar.L = true;
        mVar.k0(Float.valueOf(Math.max(0.0f, f13)));
        mVar.m0(Float.valueOf(Math.max(0.0f, f14)));
        mVar.j0(Float.valueOf(Math.min(1.0f, f15)));
        mVar.g0(Float.valueOf(Math.min(1.0f, f16)));
        mVar.f0(Integer.valueOf(cVar.getValue()));
        v3();
    }

    public final m81.g z3() {
        return this.f111931i ? m81.g.RESULTS_STELA : m81.g.RESULTS;
    }
}
