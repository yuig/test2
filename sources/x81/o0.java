package x81;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.VTOPinFeed;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.r70;
import com.pinterest.api.model.s01;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.view.ExpandableView;
import h32.f1;
import h32.u0;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kh2.s0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import net.quikkly.android.ui.CameraPreview;
import net.quikkly.android.utils.BitmapUtils;
import so.n6;
import x02.i2;

/* loaded from: classes5.dex */
public final class o0 extends wk1.n implements u, ca2.b, de1.c, d71.e, s81.c, pw0.k, e, xd1.g {

    /* renamed from: e0, reason: collision with root package name */
    public static final ha2.a0 f134258e0 = new ha2.a0(uc2.h.change_settings, 0, null, null, null, null, null, null, null, 1020);

    /* renamed from: f0, reason: collision with root package name */
    public static final ha2.a0 f134259f0 = new ha2.a0(uc2.h.pick_more_photos, 1, null, null, null, null, null, null, null, 1020);
    public final yk1.v A;
    public final Handler B;
    public final z81.a C;
    public boolean D;
    public final e61.a E;
    public final com.pinterest.framework.multisection.datasource.pagedlist.f F;
    public Bitmap G;
    public Uri H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public xj2.c f134260J;
    public Uri K;
    public ArrayList L;
    public boolean M;
    public f30 N;
    public int O;
    public final boolean P;
    public List Q;
    public List R;
    public List S;
    public List T;
    public boolean U;
    public final boolean V;
    public final EnumMap W;
    public final EnumMap X;
    public final EnumMap Y;
    public final Map Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f134261a;

    /* renamed from: a0, reason: collision with root package name */
    public f42.c f134262a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f134263b;

    /* renamed from: b0, reason: collision with root package name */
    public f42.c f134264b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f134265c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f134266c0;

    /* renamed from: d, reason: collision with root package name */
    public final js0.c f134267d;

    /* renamed from: d0, reason: collision with root package name */
    public final ir.b f134268d0;

    /* renamed from: e, reason: collision with root package name */
    public final b91.b f134269e;

    /* renamed from: f, reason: collision with root package name */
    public final String f134270f;

    /* renamed from: g, reason: collision with root package name */
    public int f134271g;

    /* renamed from: h, reason: collision with root package name */
    public String f134272h;

    /* renamed from: i, reason: collision with root package name */
    public String f134273i;

    /* renamed from: j, reason: collision with root package name */
    public final zd1.o f134274j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f134275k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f134276l;

    /* renamed from: m, reason: collision with root package name */
    public final i2 f134277m;

    /* renamed from: n, reason: collision with root package name */
    public final c91.f f134278n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f134279o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f134280p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f134281q;

    /* renamed from: r, reason: collision with root package name */
    public s0 f134282r;

    /* renamed from: s, reason: collision with root package name */
    public f30 f134283s;

    /* renamed from: t, reason: collision with root package name */
    public o f134284t;

    /* renamed from: u, reason: collision with root package name */
    public o f134285u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f134286v;

    /* renamed from: w, reason: collision with root package name */
    public i0 f134287w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f134288x;

    /* renamed from: y, reason: collision with root package name */
    public final r81.k f134289y;

    /* renamed from: z, reason: collision with root package name */
    public final r81.a f134290z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(wk1.c params, boolean z13, boolean z14, boolean z15, js0.c makeupProductsRemoteRequest, b91.b modelsRemoteRequest, sq0.f imagePreFetcher, String tryOnProductPinId, int i13, String str, String str2, zd1.o oVar, boolean z16, i2 pinRepository, c91.f onDemandModuleController, nr0.m dynamicGridViewBinderDelegateFactory, r81.p localPhotoService, b60.b activeUserManager) {
        super(params);
        o presetBottomSheetMode = o.TRY_ON;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(makeupProductsRemoteRequest, "makeupProductsRemoteRequest");
        Intrinsics.checkNotNullParameter(modelsRemoteRequest, "modelsRemoteRequest");
        Intrinsics.checkNotNullParameter(imagePreFetcher, "imagePreFetcher");
        Intrinsics.checkNotNullParameter(tryOnProductPinId, "tryOnProductPinId");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(onDemandModuleController, "onDemandModuleController");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(presetBottomSheetMode, "presetBottomSheetMode");
        Intrinsics.checkNotNullParameter(localPhotoService, "localPhotoService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f134261a = z13;
        this.f134263b = z14;
        this.f134265c = z15;
        this.f134267d = makeupProductsRemoteRequest;
        this.f134269e = modelsRemoteRequest;
        this.f134270f = tryOnProductPinId;
        this.f134271g = i13;
        this.f134272h = str;
        this.f134273i = str2;
        this.f134274j = oVar;
        this.f134275k = false;
        this.f134276l = z16;
        this.f134277m = pinRepository;
        this.f134278n = onDemandModuleController;
        this.f134282r = r.f134293b;
        this.f134285u = presetBottomSheetMode;
        this.f134287w = i0.NONE;
        this.f134288x = new ArrayList();
        this.f134289y = new r81.k(getPresenterPinalytics(), getNetworkStateStream(), localPhotoService, this);
        this.f134290z = new r81.a(localPhotoService, this);
        yk1.v vVar = params.f130137h;
        this.A = vVar;
        this.B = new Handler(Looper.getMainLooper());
        k81.k remoteRequestListener = new k81.k(this, 2);
        uk1.d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        nr0.l viewBinderDelegate = ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, vVar);
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(imagePreFetcher, "imagePreFetcher");
        Intrinsics.checkNotNullParameter(remoteRequestListener, "remoteRequestListener");
        z81.a aVar = new z81.a("visual_search/virtual_try_on/related_looks/", viewBinderDelegate, imagePreFetcher, null, null, null, null, null, remoteRequestListener, 0L, null, 7160);
        qz.f0 f0Var = new qz.f0();
        f0Var.e("fields", n00.b.a(n00.c.DEFAULT_PIN_FEED));
        aVar.f49121k = f0Var;
        this.C = aVar;
        this.E = new e61.a(new n0(this));
        com.pinterest.framework.multisection.datasource.pagedlist.f fVar = new com.pinterest.framework.multisection.datasource.pagedlist.f(aVar, 10);
        fVar.k(RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE);
        fVar.k(25);
        this.F = fVar;
        this.f134260J = null;
        this.L = new ArrayList();
        wy0 f13 = ((b60.d) activeUserManager).f();
        boolean d2 = f13 != null ? Intrinsics.d("US", f13.G2()) : false;
        this.P = d2;
        this.V = d2;
        this.W = new EnumMap(f42.c.class);
        this.X = new EnumMap(f42.c.class);
        this.Y = new EnumMap(f42.c.class);
        this.Z = z0.g(new Pair(f42.c.LIPCOLOR, "selectedLipstickPinIndex"), new Pair(f42.c.EYESHADOW, "selectedEyeshadowPinIndex"));
        this.f134268d0 = new ir.b(this, 5);
    }

    public static /* synthetic */ void H3(o0 o0Var, String str, String str2, String str3, f42.o oVar, int i13) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        boolean z13 = (i13 & 8) != 0;
        if ((i13 & 16) != 0) {
            oVar = f42.o.FILTERS_UNSET;
        }
        o0Var.G3(str, str2, str3, z13, oVar);
    }

    public final f42.c B3() {
        f42.c cVar = this.f134262a0;
        return cVar == null ? f42.c.LIPCOLOR : cVar;
    }

    public final boolean D3() {
        return this.P && this.f134262a0 == f42.c.LIPCOLOR && !this.f134276l;
    }

    public final boolean F3() {
        return this.f134287w == i0.GALLERY;
    }

    public final void G3(String str, String str2, String str3, boolean z13, f42.o oVar) {
        String str4;
        if (isBound()) {
            int i13 = 0;
            if (z13) {
                this.X.put((EnumMap) B3(), (f42.c) 0);
            }
            y81.h hVar = ((f0) ((v) getView())).A1;
            if (hVar != null) {
                hVar.e();
            }
            String str5 = this.f134270f;
            int i14 = 1;
            boolean z14 = str5.length() > 0;
            String str6 = this.f134272h;
            if (oVar == f42.o.CUSTOM_PRODUCT_STATE_CLEARED) {
                z14 = false;
                str4 = null;
            } else {
                str4 = str6;
            }
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            String str7 = z14 ? str5 : null;
            f42.c cVar = this.f134262a0;
            xj2.c o13 = ((uj2.b0) this.f134267d.b(new b91.a(str7, cVar != null ? Integer.valueOf(cVar.getValue()) : null, this.f134271g, str4, Boolean.valueOf(this.P || B3() == f42.c.LIPCOLOR), oVar.getValue(), str, str2, str3)).buildRequest()).u().t(new t81.a(2, new androidx.compose.foundation.lazy.layout.z0(11, j0Var))).t(new t81.a(3, new l0(this, i13))).O().k(new t81.a(4, new androidx.compose.foundation.lazy.layout.z0(12, j0Var))).o(new a81.a(28, new l0(this, i14)), new a81.a(29, c0.f134176p));
            addDisposable(o13);
            this.f134260J = o13;
        }
    }

    public final void I3(f30 makeupProductPin, Integer num) {
        Intrinsics.checkNotNullParameter(makeupProductPin, "makeupProductPin");
        this.f134283s = makeupProductPin;
        s0 s0Var = this.f134282r;
        u0 u0Var = ((s0Var instanceof r) && this.f134261a) ? u0.VIRTUAL_TRY_ON_CAMERA : ((s0Var instanceof q) && (this.f134263b || this.f134265c)) ? u0.VIRTUAL_TRY_ON_IMAGE : s0Var instanceof p ? u0.VIRTUAL_TRY_ON_MODEL : null;
        if (u0Var != null) {
            com.bumptech.glide.d.h0(makeupProductPin, getPinalytics(), num, u0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: J3, reason: merged with bridge method [inline-methods] */
    public final void r3(v view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        f0 f0Var = (f0) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        f0Var.T1 = this;
        f0Var.l9().f27252k = this;
        int i13 = 0;
        if (this.f134287w == i0.NONE) {
            this.f134280p = true;
            addDisposable(this.f134269e.prepare(new Object[0]).execute((ak2.e) new xo.a(this, 14), (ak2.e) new xo.l(24)));
            M3(new m0(this, i13));
        }
        if (this.f134279o) {
            h4(this.f134287w);
            f0Var.j9(this.f134288x);
            this.f134279o = false;
        }
        d4(true);
        ((yq0.t) view).setLoadState(yk1.i.LOADING);
        Uri imageUri = this.H;
        if (imageUri != null) {
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            WebImageView webImageView = f0Var.f134213k1;
            if (webImageView != null) {
                webImageView.w2(imageUri);
            } else {
                Intrinsics.r("imagePreview");
                throw null;
            }
        }
    }

    @Override // s81.c
    public final void K0(Uri imageUri, String filename) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Intrinsics.checkNotNullParameter(filename, "filename");
        f0 f0Var = (f0) ((v) getView());
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Bitmap k13 = qb0.b.k(f0Var.requireContext(), imageUri, 1200, 1200);
        if (k13 != null) {
            getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : u0.VIRTUAL_TRY_ON_SELECT_FROM_GALLERY, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : UUID.nameUUIDFromBytes(qb0.b.a(90, k13)).toString(), (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            this.f134282r = new q(k13);
            ca2.e.i(((f0) ((v) getView())).l9(), "navigation", 0.0f, null, 6);
            f30 f30Var = this.f134283s;
            if (f30Var != null) {
                I3(f30Var, null);
            }
        }
        this.K = imageUri;
    }

    public final void K3() {
        i0 i0Var = this.f134287w;
        if (i0Var == i0.TRY_ON || i0Var == i0.FACE_NOT_DETECTED) {
            h4(i0Var);
        }
        Uri uri = this.K;
        if (uri != null) {
            K0(uri, "");
        }
    }

    public final void L3(f42.c updatedMakeupCategory) {
        Intrinsics.checkNotNullParameter(updatedMakeupCategory, "updatedMakeupCategory");
        if (this.f134262a0 != updatedMakeupCategory) {
            Z3(updatedMakeupCategory);
            f0 f0Var = (f0) ((v) getView());
            f0Var.w9(D3());
            f42.c makeupCategory = B3();
            Intrinsics.checkNotNullParameter(makeupCategory, "makeupCategory");
            y81.h hVar = f0Var.A1;
            if (hVar != null) {
                hVar.g(makeupCategory);
            }
            a91.d dVar = f0Var.U1;
            if (dVar != null) {
                dVar.r3(makeupCategory);
            }
            f0Var.f134199c2 = makeupCategory;
            f42.c cVar = this.f134262a0;
            int i13 = cVar == null ? -1 : j0.f134248b[cVar.ordinal()];
            Unit unit = null;
            if (i13 == 1) {
                ExpandableView expandableView = f0Var.f134216n1;
                if (expandableView == null) {
                    Intrinsics.r("expandableMenu");
                    throw null;
                }
                expandableView.a();
                d dVar2 = f0Var.f134195a2;
                if (dVar2 != null) {
                    dVar2.d();
                }
            } else if (i13 == 2) {
                ExpandableView expandableView2 = f0Var.f134216n1;
                if (expandableView2 == null) {
                    Intrinsics.r("expandableMenu");
                    throw null;
                }
                expandableView2.a();
                d dVar3 = f0Var.f134195a2;
                if (dVar3 != null) {
                    dVar3.c();
                }
            }
            u3(String.valueOf(this.f134262a0), this.f134268d0);
            List list = (List) this.W.get(B3());
            if (list != null) {
                e4(list, (List) this.Y.get(this.f134262a0));
                unit = Unit.f80348a;
            }
            if (unit == null) {
                xj2.c cVar2 = this.f134260J;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                H3(this, null, null, null, null, 31);
            }
            getPinalytics().X(u0.VIRTUAL_TRY_ON_MAKEUP_BUTTON);
        }
    }

    @Override // ca2.b
    public final void M0(String str) {
    }

    public final void M3(m0 m0Var) {
        this.f134278n.a(new uv0.f(25, m0Var), this.f134270f, c91.a.f26973a);
    }

    public final boolean N3() {
        if (this.I) {
            return true;
        }
        i0 i0Var = this.f134287w;
        if (i0Var == i0.TRY_ON_CAPTURED_PHOTO) {
            ca2.e.i(((f0) ((v) getView())).l9(), "navigation", 0.0f, null, 6);
            a4(i0.TRY_ON);
            return true;
        }
        if (i0Var == i0.GALLERY) {
            ca2.e.i(((f0) ((v) getView())).l9(), "navigation", 0.0f, null, 6);
            return true;
        }
        if (i0Var == i0.CAMERA_DENIED && !this.f134261a) {
            pp2.a.E0(getPinalytics(), u0.LENS_PERMISSION_RESULT_EXITED, h32.g0.CAMERA_PERMISSIONS);
            return false;
        }
        if (i0Var != i0.GALLERY_DENIED || this.f134263b) {
            return false;
        }
        pp2.a.E0(getPinalytics(), u0.LENS_PERMISSION_RESULT_EXITED, h32.g0.PHOTO_LIBRARY_PERMISSIONS);
        return false;
    }

    public final void Q3(boolean z13, boolean z14) {
        this.f134263b = z13;
        this.f134265c = z14;
        if (!z13 && !z14) {
            if (this.f134287w == i0.GALLERY && this.f134285u == o.GALLERY_PHOTOS) {
                v3();
                return;
            }
            return;
        }
        if (this.f134287w == i0.GALLERY && this.f134285u == o.GALLERY_PHOTOS) {
            ((f0) ((v) getView())).getClass();
            xk2.v vVar = sw0.y.f115589f;
            vt1.a.u().e();
            Y3(false);
            Y3(true);
            onRecyclerRefresh();
        }
    }

    public final void R3() {
        getPinalytics().X(u0.PIN_SAVE_BUTTON);
        f0 f0Var = (f0) ((v) getView());
        ny1.w m93 = f0Var.m9();
        FragmentActivity requireActivity = f0Var.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        m93.c(requireActivity, ny1.f.f92666f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : new z(f0Var, 8), (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : null, (r23 & 1024) != 0 ? ny1.t.f92703n : new z(f0Var, 9));
    }

    public final void S3(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        a4(i0.TRY_ON_CAPTURED_PHOTO);
        f0 f0Var = (f0) ((v) getView());
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        WebImageView webImageView = f0Var.f134213k1;
        if (webImageView == null) {
            Intrinsics.r("imagePreview");
            throw null;
        }
        webImageView.setImageBitmap(bitmap);
        this.G = bitmap;
    }

    public final void T3() {
        if (isBound()) {
            v vVar = (v) getView();
            List list = (List) this.W.get(B3());
            Integer num = (Integer) this.X.get(B3());
            f42.c makeupCategory = B3();
            f0 f0Var = (f0) vVar;
            f0Var.getClass();
            Intrinsics.checkNotNullParameter(makeupCategory, "makeupCategory");
            y81.h hVar = f0Var.A1;
            if (hVar != null) {
                FrameLayout frameLayout = f0Var.f134228z1;
                if (frameLayout == null) {
                    Intrinsics.r("makeupCarouselContainer");
                    throw null;
                }
                if (f0.t9(hVar, frameLayout)) {
                    f0Var.A1 = null;
                }
            }
            int dimensionPixelSize = f0Var.getResources().getDimensionPixelSize(uc2.b.makeup_swatch_center_size);
            int dimensionPixelSize2 = f0Var.getResources().getDimensionPixelSize(uc2.b.makeup_swatch_circle_size);
            y81.h hVar2 = f0Var.A1;
            if (hVar2 == null) {
                Context requireContext = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                y81.h hVar3 = new y81.h(requireContext, dimensionPixelSize, dimensionPixelSize2, f0Var.getResources().getDimensionPixelSize(uc2.b.makeup_swatch_margin));
                yk1.j a13 = yk1.j.a();
                u uVar = f0Var.T1;
                k kVar = f0Var.f134220r1;
                l tryOnListener = kVar != null ? kVar.getTryOnListener() : null;
                nx.f0 f0Var2 = f0Var.V0;
                if (f0Var2 == null) {
                    Intrinsics.r("pinalyticsFactory");
                    throw null;
                }
                a13.d(hVar3, new y81.i(list, dimensionPixelSize, num, uVar, tryOnListener, makeupCategory, new n(f0Var2), f0Var.p7()));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                FrameLayout frameLayout2 = f0Var.f134228z1;
                if (frameLayout2 == null) {
                    Intrinsics.r("makeupCarouselContainer");
                    throw null;
                }
                frameLayout2.addView(hVar3, layoutParams);
                f0Var.A1 = hVar3;
                hVar2 = hVar3;
            }
            hVar2.setVisibility(0);
        }
    }

    @Override // ca2.b
    public final void U2() {
        k kVar;
        if (this.f134287w != i0.TRY_ON || (kVar = ((f0) ((v) getView())).f134220r1) == null) {
            return;
        }
        kVar.pauseCamera();
    }

    public final void U3() {
        a4(i0.GALLERY);
    }

    public final void V3() {
        boolean z13 = false;
        this.f134275k = false;
        this.I = true;
        GestaltIconButton gestaltIconButton = ((f0) ((v) getView())).f134209i1;
        if (gestaltIconButton == null) {
            Intrinsics.r("navigationButton");
            throw null;
        }
        gestaltIconButton.t(new u81.h(z13, 2));
        v vVar = (v) getView();
        np.f animationListener = new np.f(this, 6);
        f0 f0Var = (f0) vVar;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(animationListener, "animationListener");
        n81.a aVar = f0Var.f134225w1;
        if (aVar == null || aVar.getParent() != null) {
            return;
        }
        aVar.f89926a = animationListener;
        CoordinatorLayout coordinatorLayout = f0Var.f134218p1;
        if (coordinatorLayout != null) {
            coordinatorLayout.addView(aVar, -1, -1);
        } else {
            Intrinsics.r("coordinatorLayout");
            throw null;
        }
    }

    public final void W3(o value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f134284t = this.f134285u;
        this.f134285u = value;
        d4(false);
    }

    public final void X3(String str) {
        f42.c cVar;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 1097325201) {
                cVar = hashCode != 1244868784 ? f42.c.LIPCOLOR : f42.c.LIPCOLOR;
            } else if (str.equals("eyeshadow")) {
                cVar = f42.c.EYESHADOW;
            }
            Z3(cVar);
        }
        cVar = null;
        Z3(cVar);
    }

    public final void Y3(boolean z13) {
        boolean z14 = true;
        f0 f0Var = (f0) ((v) getView());
        if (z13 && !this.f134263b) {
            LinearLayout linearLayout = f0Var.S1;
            if (linearLayout == null) {
                Intrinsics.r("partialGalleryPermissionInfo");
                throw null;
            }
            linearLayout.setVisibility(0);
        } else {
            LinearLayout linearLayout2 = f0Var.S1;
            if (linearLayout2 == null) {
                Intrinsics.r("partialGalleryPermissionInfo");
                throw null;
            }
            linearLayout2.setVisibility(8);
        }
        if (!z13 || (!this.f134263b && !this.f134265c)) {
            z14 = false;
        }
        r81.k kVar = this.f134289y;
        kVar.f106777b = z14;
        if (!z13) {
            kVar.f106785j = "";
            kVar.clear();
        }
        this.F.f49192c = false;
    }

    public final void Z3(f42.c cVar) {
        this.f134262a0 = cVar;
        uk1.d presenterPinalytics = getPresenterPinalytics();
        n nVar = presenterPinalytics instanceof n ? (n) presenterPinalytics : null;
        if (nVar == null) {
            return;
        }
        nVar.f134256g = cVar;
    }

    public final void a4(i0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i0 i0Var = this.f134287w;
        this.f134287w = value;
        h4(i0Var);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(this.E);
        iVar.b(this.F);
        iVar.b(this.f134289y);
        iVar.b(this.f134290z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f5, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d4(boolean r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x81.o0.d4(boolean):void");
    }

    public final void e4(List makeupProducts, List list) {
        v vVar = (v) getView();
        EnumMap enumMap = this.X;
        Integer num = (Integer) enumMap.get(B3());
        f0 f0Var = (f0) vVar;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(makeupProducts, "makeupProducts");
        y81.h hVar = f0Var.A1;
        if (hVar != null) {
            hVar.b(makeupProducts, num, list);
        }
        if (makeupProducts.isEmpty()) {
            f0 f0Var2 = (f0) ((v) getView());
            LinearLayout linearLayout = f0Var2.B1;
            if (linearLayout == null) {
                Intrinsics.r("emptySwatchContainer");
                throw null;
            }
            bs1.c.R1(linearLayout, true);
            String text = ((yk1.a) this.A).f139224a.getString(uc2.h.try_on_filters_no_results);
            Intrinsics.checkNotNullParameter(text, "text");
            GestaltText gestaltText = f0Var2.C1;
            if (gestaltText == null) {
                Intrinsics.r("emptySwatchText");
                throw null;
            }
            pk.a0.p(gestaltText, text);
            GestaltIcon gestaltIcon = f0Var2.D1;
            if (gestaltIcon == null) {
                Intrinsics.r("emptySwatchIconView");
                throw null;
            }
            kg.t.O(gestaltIcon);
        }
        if (this.f134287w == i0.TRY_ON_CAPTURED_PHOTO) {
            Integer num2 = (Integer) enumMap.get(B3());
            if (num2 == null) {
                num2 = 0;
            }
            int intValue = num2.intValue();
            g4((f30) makeupProducts.get(intValue < makeupProducts.size() ? intValue : 0), this.f134273i);
        }
    }

    public final void f4(s0 mode) {
        f30 f30Var;
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.K = null;
        this.f134282r = mode;
        a4(i0.TRY_ON);
        if (!(this.f134282r instanceof p) || (f30Var = this.f134283s) == null) {
            return;
        }
        I3(f30Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // de1.g
    public final void g2(Object obj, ArrayList selectedProductFilters, int i13, de1.a filterAction) {
        zd1.d dVar;
        ArrayList arrayList;
        HashMap filterApiSpec = (HashMap) obj;
        Intrinsics.checkNotNullParameter(filterApiSpec, "filterApiSpec");
        Intrinsics.checkNotNullParameter(selectedProductFilters, "selectedProductFilters");
        Intrinsics.checkNotNullParameter(filterAction, "filterAction");
        zd1.o oVar = this.f134274j;
        if (oVar != null) {
            oVar.f(selectedProductFilters);
        }
        int i14 = j0.f134247a[filterAction.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                return;
            }
            H3(this, null, null, null, f42.o.CUSTOM_PRODUCT_STATE_CLEARED, 15);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : selectedProductFilters) {
            if (obj2 instanceof zd1.v) {
                arrayList2.add(obj2);
            }
        }
        Intrinsics.checkNotNullParameter(selectedProductFilters, "selectedProductFilters");
        Iterator it = selectedProductFilters.iterator();
        while (true) {
            if (it.hasNext()) {
                dVar = it.next();
                if (((zd1.h) dVar) instanceof zd1.d) {
                    break;
                }
            } else {
                dVar = 0;
                break;
            }
        }
        zd1.d dVar2 = dVar instanceof zd1.d ? dVar : null;
        ArrayList arrayList3 = new ArrayList();
        if (dVar2 != null && (arrayList = dVar2.f141703c) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((zd1.b) obj3).f141686e) {
                    arrayList4.add(obj3);
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((zd1.b) it2.next()).f141687f));
            }
        }
        H3(this, CollectionsKt.Z(arrayList3, null, null, null, 0, null, null, 63), kg.p.z(arrayList2), kg.p.y(arrayList2), f42.o.FILTERS_SELECTED, 8);
    }

    public final void g4(f30 f30Var, String str) {
        if (this.f134285u == o.TRY_ON) {
            this.E.k(kotlin.collections.e0.b(f30Var));
            this.F.f49192c = true;
            z81.a aVar = this.C;
            aVar.Z();
            String uid = f30Var.getUid();
            if (uid == null) {
                qz.f0 f0Var = aVar.f49121k;
                if (f0Var != null) {
                    f0Var.h("query_pin");
                }
            } else {
                qz.f0 f0Var2 = aVar.f49121k;
                if (f0Var2 != null) {
                    f0Var2.e("query_pin", uid);
                }
            }
            int i13 = this.f134271g;
            qz.f0 f0Var3 = aVar.f49121k;
            if (f0Var3 != null) {
                f0Var3.c(i13, "feed_source");
            }
            String str2 = this.f134272h;
            if (str2 == null) {
                qz.f0 f0Var4 = aVar.f49121k;
                if (f0Var4 != null) {
                    f0Var4.h("source_query");
                }
            } else {
                qz.f0 f0Var5 = aVar.f49121k;
                if (f0Var5 != null) {
                    f0Var5.e("source_query", str2);
                }
            }
            if (str == null) {
                qz.f0 f0Var6 = aVar.f49121k;
                if (f0Var6 != null) {
                    f0Var6.h("skin_tone_filter");
                }
            } else {
                qz.f0 f0Var7 = aVar.f49121k;
                if (f0Var7 != null) {
                    f0Var7.e("skin_tone_filter", str);
                }
            }
            aVar.i2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h4(i0 i0Var) {
        boolean z13;
        f30 f30Var;
        if (isBound()) {
            v vVar = (v) getView();
            switch (j0.f134249c[this.f134287w.ordinal()]) {
                case 1:
                    f0 f0Var = (f0) vVar;
                    f0Var.x9(true);
                    f0Var.u9(t.CAMERA);
                    f0Var.n9();
                    f0Var.z9(false);
                    f0Var.y9(true);
                    return;
                case 2:
                    f0 f0Var2 = (f0) vVar;
                    f0Var2.x9(true);
                    f0Var2.u9(t.GALLERY);
                    f0Var2.n9();
                    f0Var2.z9(false);
                    f0Var2.y9(true);
                    return;
                case 3:
                    f0 f0Var3 = (f0) vVar;
                    f0Var3.x9(true);
                    k kVar = f0Var3.f134220r1;
                    if (kVar != null) {
                        kVar.resumeCamera();
                    }
                    f0Var3.u9(t.FACE_NOT_DETECTED);
                    f0Var3.n9();
                    f0Var3.z9(false);
                    f0Var3.y9(true);
                    return;
                case 4:
                    this.H = null;
                    f0 f0Var4 = (f0) vVar;
                    f0Var4.x9(true);
                    f0Var4.o9();
                    i0 i0Var2 = i0.GALLERY;
                    if (i0Var != i0Var2) {
                        Object obj = f0Var4.f134220r1;
                        View view = obj instanceof View ? (View) obj : null;
                        if (view != null) {
                            FrameLayout frameLayout = f0Var4.f134217o1;
                            if (frameLayout == null) {
                                Intrinsics.r("cameraRootContainer");
                                throw null;
                            }
                            if (f0.t9(view, frameLayout)) {
                                f0Var4.f134220r1 = null;
                            }
                        }
                        if (f0Var4.f134220r1 == null) {
                            Context context = f0Var4.requireContext();
                            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                            nx.d0 s73 = f0Var4.s7();
                            Intrinsics.checkNotNullParameter(context, "context");
                            Constructor<?> constructor = Class.forName("com.pinterest.modiface.MakeupPhotoView").getConstructor(Context.class, Context.class, nx.d0.class);
                            Intrinsics.checkNotNullExpressionValue(constructor, "getConstructor(...)");
                            Object newInstance = constructor.newInstance(context, context.createPackageContext(context.getPackageName(), 0), s73);
                            Intrinsics.g(newInstance, "null cannot be cast to non-null type com.pinterest.feature.search.visual.tryon.TryOnContract.TryOnView");
                            k kVar2 = (k) newInstance;
                            f0Var4.f134220r1 = kVar2;
                            View view2 = (View) kVar2;
                            FrameLayout frameLayout2 = f0Var4.f134217o1;
                            if (frameLayout2 == null) {
                                Intrinsics.r("cameraRootContainer");
                                throw null;
                            }
                            frameLayout2.addView(view2, -1, -1);
                            uk1.e eVar = f0Var4.W0;
                            if (eVar == null) {
                                Intrinsics.r("presenterPinalyticsFactory");
                                throw null;
                            }
                            a91.d dVar = new a91.d(((uk1.a) eVar).f(f0Var4.s7(), ""), f0Var4.p7(), f0Var4, f0Var4.f134196b1, f0Var4.f134199c2);
                            yk1.j.a().d(view2, dVar);
                            f0Var4.U1 = dVar;
                        }
                    } else {
                        T3();
                    }
                    k kVar3 = f0Var4.f134220r1;
                    if (kVar3 != null) {
                        kVar3.resumeCamera();
                    }
                    f0Var4.n9();
                    ImageView imageView = f0Var4.f134227y1;
                    if (imageView == null) {
                        Intrinsics.r("shutterOuter");
                        throw null;
                    }
                    bs1.c.R1(imageView, true);
                    f0Var4.w9(D3());
                    if (this.V) {
                        d dVar2 = f0Var4.f134195a2;
                        if (dVar2 != null) {
                            FrameLayout frameLayout3 = f0Var4.f134217o1;
                            if (frameLayout3 == null) {
                                Intrinsics.r("cameraRootContainer");
                                throw null;
                            }
                            if (f0.t9(dVar2, frameLayout3)) {
                                f0Var4.f134195a2 = null;
                            }
                        }
                        d dVar3 = f0Var4.f134195a2;
                        if (dVar3 == null) {
                            Context requireContext = f0Var4.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            d dVar4 = new d(requireContext, f0Var4.f134197b2);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(f0Var4.getResources().getDimensionPixelSize(uc2.b.try_on_makeup_switcher_container_width), f0Var4.getResources().getDimensionPixelSize(uc2.b.try_on_makeup_switcher_container_height));
                            layoutParams.gravity = 49;
                            layoutParams.topMargin = f0Var4.getResources().getDimensionPixelSize(uc2.b.try_on_makeup_switcher_top_margin);
                            f0Var4.f134195a2 = dVar4;
                            FrameLayout frameLayout4 = f0Var4.f134217o1;
                            if (frameLayout4 == null) {
                                Intrinsics.r("cameraRootContainer");
                                throw null;
                            }
                            frameLayout4.addView(dVar4, layoutParams);
                            dVar3 = dVar4;
                        }
                        z13 = false;
                        dVar3.setVisibility(0);
                        dVar3.bringToFront();
                    } else {
                        z13 = false;
                    }
                    f0Var4.z9(z13);
                    f0Var4.y9(true);
                    if (!this.f134281q) {
                        y81.h hVar = f0Var4.A1;
                        if (hVar != null) {
                            kg.a.H((hf0.b.f69002b / 2) + (f0Var4.getResources().getDimensionPixelSize(uc2.b.makeup_swatch_center_size) / 2), 0.0f, 300L, hVar).start();
                        }
                        f0Var4.v9(i0Var == i0.TRY_ON_CAPTURED_PHOTO);
                    }
                    if (i0Var == i0Var2 && this.E.d().isEmpty() && (f30Var = this.N) != null) {
                        g4(f30Var, this.f134273i);
                    }
                    if (!Intrinsics.d(this.f134282r, r.f134293b)) {
                        f0Var4.k9(this.f134282r);
                    } else if (this.f134261a) {
                        f0Var4.k9(this.f134282r);
                        if (this.f134275k) {
                            V3();
                        }
                    } else if (this.f134280p) {
                        this.f134280p = false;
                        U3();
                    } else {
                        a4(i0.CAMERA_DENIED);
                        ((f0) ((v) getView())).s9(false);
                    }
                    this.f134281q = true;
                    if (this.f134286v) {
                        this.f134286v = false;
                        a4(i0.FACE_NOT_DETECTED);
                        return;
                    }
                    return;
                case 5:
                    if (!this.f134263b && !this.f134265c) {
                        a4(i0.GALLERY_DENIED);
                        return;
                    }
                    getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.VIRTUAL_TRY_ON_OPEN_GALLERY, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    f0 f0Var5 = (f0) vVar;
                    k kVar4 = f0Var5.f134220r1;
                    if (kVar4 != null) {
                        kVar4.pauseCamera();
                    }
                    f0Var5.r9();
                    f0Var5.w9(false);
                    f0Var5.y9(false);
                    int dimensionPixelSize = (int) (f0Var5.K1 - (f0Var5.getResources().getDimensionPixelSize(r0.margin) + f0Var5.getResources().getDimensionPixelSize(uc2.b.flashlight_bottom_sheet_gap_size)));
                    ca2.e l93 = f0Var5.l9();
                    l93.s("initial_slide_up", true);
                    int i13 = f0Var5.L1;
                    l93.f27245d = i13;
                    l93.f27259r = i13;
                    f0Var5.l9().x(dimensionPixelSize);
                    W3(o.GALLERY_PHOTOS);
                    return;
                case 6:
                    f0 f0Var6 = (f0) vVar;
                    f0Var6.x9(false);
                    f0Var6.o9();
                    ImageView imageView2 = f0Var6.f134227y1;
                    if (imageView2 == null) {
                        Intrinsics.r("shutterOuter");
                        throw null;
                    }
                    bs1.c.R1(imageView2, false);
                    k kVar5 = f0Var6.f134220r1;
                    if (kVar5 != null) {
                        kVar5.pauseCamera();
                    }
                    k kVar6 = f0Var6.f134220r1;
                    ViewParent viewParent = kVar6 != null ? kVar6.getViewParent() : null;
                    FrameLayout frameLayout5 = f0Var6.f134217o1;
                    if (frameLayout5 == null) {
                        Intrinsics.r("cameraRootContainer");
                        throw null;
                    }
                    if (Intrinsics.d(viewParent, frameLayout5)) {
                        FrameLayout frameLayout6 = f0Var6.f134217o1;
                        if (frameLayout6 == null) {
                            Intrinsics.r("cameraRootContainer");
                            throw null;
                        }
                        Object obj2 = f0Var6.f134220r1;
                        Intrinsics.g(obj2, "null cannot be cast to non-null type android.view.View");
                        frameLayout6.removeView((View) obj2);
                    }
                    f0Var6.r9();
                    this.f134281q = false;
                    this.f134275k = true;
                    f0Var6.z9(true);
                    f0Var6.w9(false);
                    f0Var6.y9(false);
                    if (i0Var != i0.TRY_ON) {
                        f0Var6.v9(true);
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
        this.f134289y.f106785j = path;
        W3(o.GALLERY_PHOTOS);
    }

    @Override // d71.e
    public final void o1(int i13, Integer num, boolean z13) {
        List list;
        e71.a aVar;
        if (!z13 || (list = this.T) == null || (aVar = (e71.a) CollectionsKt.U(i13, list)) == null) {
            return;
        }
        v vVar = (v) getView();
        String display = aVar.getDisplay();
        if (display == null) {
            display = "";
        }
        f0 f0Var = (f0) vVar;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(display, "display");
        g71.f fVar = f0Var.f134204f2;
        if (fVar != null) {
            fVar.j();
            String string = fVar.getResources().getString(d82.c.content_description_search_skin_tone_unselected, display);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fVar.l(string);
        }
        String valueOf = String.valueOf(aVar.getId());
        this.f134273i = valueOf;
        f30 f30Var = this.N;
        if (f30Var != null) {
            g4(f30Var, valueOf);
        }
    }

    @Override // ca2.b
    public final void o2(int i13) {
        f0 f0Var;
        Integer num;
        Drawable drawable;
        i0 i0Var = this.f134287w;
        i0 i0Var2 = i0.GALLERY;
        if (i0Var != i0Var2) {
            v vVar = (v) getView();
            boolean z13 = i13 == 3;
            f0 f0Var2 = (f0) vVar;
            View view = f0Var2.l9().f27254m;
            if (view != null) {
                if (z13) {
                    LinearLayout linearLayout = f0Var2.R1;
                    if (linearLayout != null) {
                        Context context = view.getContext();
                        int i14 = eo1.b.color_themed_background_elevation_floating;
                        Object obj = d5.a.f53679a;
                        linearLayout.setBackgroundColor(context.getColor(i14));
                    }
                } else {
                    LinearLayout linearLayout2 = f0Var2.R1;
                    if (linearLayout2 != null) {
                        linearLayout2.setBackgroundResource(m60.s0.rounded_top_rect_radius_40);
                    }
                }
                d91.h hVar = f0Var2.E1;
                if (hVar != null) {
                    if (z13) {
                        Context context2 = hVar.getContext();
                        int i15 = eo1.d.lego_card_rounded_top_and_bottom;
                        Object obj2 = d5.a.f53679a;
                        drawable = context2.getDrawable(i15);
                    } else {
                        Context context3 = hVar.getContext();
                        int i16 = eo1.d.lego_card_rounded_top_transparent_and_bottom;
                        Object obj3 = d5.a.f53679a;
                        drawable = context3.getDrawable(i16);
                    }
                    hVar.setBackground(drawable);
                }
            }
        }
        i0 i0Var3 = this.f134287w;
        if (i0Var3 == i0.TRY_ON_CAPTURED_PHOTO || i13 != 4) {
            return;
        }
        if (i0Var3 == i0Var2 && !(this.f134282r instanceof q) && (num = (f0Var = (f0) ((v) getView())).f134222t1) != null) {
            int intValue = num.intValue();
            ExpandableView expandableView = f0Var.f134216n1;
            if (expandableView == null) {
                Intrinsics.r("expandableMenu");
                throw null;
            }
            expandableView.c(intValue);
            Integer num2 = f0Var.f134222t1;
            f0Var.f134222t1 = f0Var.f134223u1;
            f0Var.f134223u1 = num2;
        }
        W3(o.TRY_ON);
        a4(i0.TRY_ON);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        List list;
        List list2;
        p3();
        if (this.f134260J == null && this.W.get(B3()) == null) {
            List list3 = this.Q;
            if (((list3 == null || list3.isEmpty()) && (((list = this.R) == null || list.isEmpty()) && ((list2 = this.S) == null || list2.isEmpty()))) || B3() != f42.c.LIPCOLOR) {
                H3(this, null, null, null, null, 23);
                return;
            }
            List list4 = this.Q;
            String Z = list4 != null ? CollectionsKt.Z(list4, null, null, null, 0, null, null, 63) : null;
            List list5 = this.R;
            String Z2 = list5 != null ? CollectionsKt.Z(list5, null, null, null, 0, null, null, 63) : null;
            List list6 = this.S;
            G3(Z, Z2, list6 != null ? CollectionsKt.Z(list6, null, null, null, 0, null, null, 63) : null, false, f42.o.FILTERS_SELECTED);
        }
    }

    @Override // wk1.q, yk1.b
    public final void onRestoreInstanceState(Bundle bundle) {
        EnumMap enumMap;
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("tryOnPreviewImageUri");
            Uri uri = parcelable instanceof Uri ? (Uri) parcelable : null;
            if (uri != null) {
                this.H = uri;
            }
            String string = bundle.getString("modelMakeupMode");
            if (string != null && string.length() > 0) {
                byte[] decode = Base64.decode(string, 0);
                Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                if (decodeByteArray != null) {
                    this.f134282r = new p(decodeByteArray);
                }
            }
            String string2 = bundle.getString("photoMakeupMode");
            if (string2 != null && string2.length() > 0) {
                byte[] decode2 = Base64.decode(string2, 0);
                Intrinsics.checkNotNullExpressionValue(decode2, "decode(...)");
                Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(decode2, 0, decode2.length);
                if (decodeByteArray2 != null) {
                    this.f134282r = new q(decodeByteArray2);
                }
            }
            Serializable serializable = bundle.getSerializable("videoMakeupMode");
            if ((serializable instanceof Boolean ? (Boolean) serializable : null) != null) {
                this.f134282r = r.f134293b;
            }
            Serializable serializable2 = bundle.getSerializable("makeupCategory");
            f42.c cVar = serializable2 instanceof f42.c ? (f42.c) serializable2 : null;
            if (cVar != null) {
                Z3(cVar);
            }
            Iterator it = this.Z.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                enumMap = this.X;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                enumMap.put((EnumMap) entry.getKey(), (f42.c) Integer.valueOf(bundle.getInt((String) entry.getValue())));
            }
            enumMap.put((EnumMap) f42.c.LIPCOLOR, (f42.c) Integer.valueOf(bundle.getInt("selectedLipstickPinIndex")));
            enumMap.put((EnumMap) f42.c.EYESHADOW, (f42.c) Integer.valueOf(bundle.getInt("selectedEyeshadowPinIndex")));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("modelListUrls");
            if (stringArrayList != null) {
                this.f134288x = stringArrayList;
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("selectedTryOnIds");
            if (stringArrayList2 != null) {
                this.L = stringArrayList2;
            }
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("selectedColorFilters");
            if (integerArrayList != null) {
                this.Q = integerArrayList;
            }
            ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("selectedPriceFilters");
            if (integerArrayList2 != null) {
                this.R = integerArrayList2;
            }
            ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("selectedBrandFilters");
            if (integerArrayList3 != null) {
                this.S = integerArrayList3;
            }
            i0 i0Var = (i0) bundle.getSerializable("tryOnUIState");
            if (i0Var == i0.FACE_NOT_DETECTED && this.K == null) {
                this.f134286v = true;
            }
            i0 i0Var2 = i0.TRY_ON_CAPTURED_PHOTO;
            if (i0Var != i0Var2) {
                i0Var2 = i0.TRY_ON;
            }
            a4(i0Var2);
            this.f134271g = bundle.getInt("virtualTryOnFeedSource");
            this.f134272h = bundle.getString("sourceQuery");
            W3(o.TRY_ON);
            this.f134279o = true;
        }
    }

    @Override // wk1.q, yk1.b
    public final void onSaveInstance(Bundle bundle) {
        if (bundle != null) {
            if (this.K != null) {
                i0 i0Var = i0.TRY_ON;
                bundle.putSerializable("tryOnUIState", i0Var);
                bundle.putSerializable("currentBottomSheetMode", i0Var);
                a4(i0Var);
            } else {
                bundle.putSerializable("tryOnUIState", this.f134287w);
                bundle.putSerializable("currentBottomSheetMode", this.f134285u);
            }
            s0 s0Var = this.f134282r;
            if (s0Var instanceof q) {
                Intrinsics.g(s0Var, "null cannot be cast to non-null type com.pinterest.feature.search.visual.tryon.VirtualTryOnContract.MakeupMode.PHOTO");
                byte[] a13 = qb0.b.a(90, ((q) s0Var).f134292b);
                if (a13 != null) {
                    bundle.putString("photoMakeupMode", Base64.encodeToString(a13, 0));
                }
            } else if (s0Var instanceof r) {
                bundle.putSerializable("videoMakeupMode", Boolean.TRUE);
            } else if (s0Var instanceof p) {
                Intrinsics.g(s0Var, "null cannot be cast to non-null type com.pinterest.feature.search.visual.tryon.VirtualTryOnContract.MakeupMode.MODEL");
                byte[] a14 = qb0.b.a(90, ((p) s0Var).f134291b);
                if (a14 != null) {
                    bundle.putString("modelMakeupMode", Base64.encodeToString(a14, 0));
                }
            }
            if (this.f134287w == i0.TRY_ON_CAPTURED_PHOTO) {
                Uri uri = this.H;
                if (uri != null) {
                    bundle.putParcelable("tryOnPreviewImageUri", uri);
                } else {
                    Uri z33 = z3();
                    if (z33 != null) {
                        bundle.putParcelable("tryOnPreviewImageUri", z33);
                    }
                }
            }
            f42.c cVar = this.f134262a0;
            if (cVar != null) {
                bundle.putSerializable("makeupCategory", cVar);
            }
            if (!this.f134288x.isEmpty()) {
                bundle.putStringArrayList("modelListUrls", this.f134288x);
            }
            for (Map.Entry entry : this.W.entrySet()) {
                f42.c cVar2 = (f42.c) entry.getKey();
                List list = (List) entry.getValue();
                Integer num = (Integer) this.X.get(cVar2);
                Intrinsics.f(list);
                if ((!list.isEmpty()) && num != null) {
                    bundle.putInt((String) this.Z.get(cVar2), num.intValue());
                }
            }
            bundle.putInt("virtualTryOnFeedSource", this.f134271g);
            String str = this.f134272h;
            if (str != null) {
                bundle.putString("sourceQuery", str);
            }
            if (!this.L.isEmpty()) {
                bundle.putStringArrayList("selectedTryOnIds", this.L);
            }
            List list2 = this.Q;
            if (list2 != null) {
                List list3 = list2;
                if (!list3.isEmpty()) {
                    bundle.putIntegerArrayList("selectedColorFilters", new ArrayList<>(list3));
                }
            }
            List list4 = this.R;
            if (list4 != null) {
                List list5 = list4;
                if (!list5.isEmpty()) {
                    bundle.putIntegerArrayList("selectedPriceFilters", new ArrayList<>(list5));
                }
            }
            List list6 = this.S;
            if (list6 != null) {
                List list7 = list6;
                if (!list7.isEmpty()) {
                    bundle.putIntegerArrayList("selectedBrandFilters", new ArrayList<>(list7));
                }
            }
        }
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((f0) ((v) getView())).E1 = null;
        xj2.c cVar = this.f134260J;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f134260J = null;
        super.onUnbind();
    }

    @Override // ca2.b
    public final void s1(float f13, boolean z13) {
        ExpandableView expandableView = ((f0) ((v) getView())).f134216n1;
        if (expandableView == null) {
            Intrinsics.r("expandableMenu");
            throw null;
        }
        expandableView.a();
        v vVar = (v) getView();
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        View view = ((f0) vVar).f134215m1;
        if (view == null) {
            Intrinsics.r("blackOverlay");
            throw null;
        }
        view.setAlpha(f14);
        if (F3()) {
            return;
        }
        v vVar2 = (v) getView();
        float f15 = f13 >= 0.0f ? 1 - f13 : 1.0f;
        GestaltIconButton gestaltIconButton = ((f0) vVar2).f134209i1;
        if (gestaltIconButton != null) {
            gestaltIconButton.setAlpha(f15);
        } else {
            Intrinsics.r("navigationButton");
            throw null;
        }
    }

    public final void u3(String overlayText, Animator.AnimatorListener animatorListener) {
        f0 f0Var = (f0) ((v) getView());
        AnimatorSet animatorSet = f0Var.f134226x1;
        if (animatorSet != null) {
            animatorSet.end();
        }
        Intrinsics.checkNotNullParameter(overlayText, "overlayText");
        GestaltText gestaltText = f0Var.f134219q1;
        if (gestaltText == null) {
            Intrinsics.r("overlayTextView");
            throw null;
        }
        pk.a0.p(gestaltText, overlayText);
        GestaltText gestaltText2 = f0Var.f134219q1;
        if (gestaltText2 == null) {
            Intrinsics.r("overlayTextView");
            throw null;
        }
        AnimatorSet A = kg.a.A(1.0f, 0.0f, CameraPreview.AUTOFOCUS_INTERVAL_MILLIS, gestaltText2);
        if (animatorListener != null) {
            A.addListener(animatorListener);
        }
        A.start();
        f0Var.f134226x1 = A;
    }

    @Override // d71.e
    public final void v0() {
        this.f134273i = null;
        f30 f30Var = this.N;
        if (f30Var != null) {
            g4(f30Var, null);
        }
    }

    public final void v3() {
        if (F3()) {
            ca2.e.i(((f0) ((v) getView())).l9(), "navigation", 0.0f, null, 6);
        }
    }

    public final ha2.a w3() {
        return new ha2.a(kotlin.collections.e0.b(new ha2.z(new ha2.x(uc2.h.manage_access, null, null, null, null, 30), kotlin.collections.f0.l(f134258e0, f134259f0), new k0(1, this, o0.class, "optionSelectionHandler", "optionSelectionHandler(I)V", 0))), false, (Integer) null, 14);
    }

    public final List x3(VTOPinFeed vTOPinFeed) {
        r70 f13;
        String h10;
        r70 f14;
        String h13;
        if (!this.f134276l) {
            List q13 = vTOPinFeed.q();
            Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
            return q13;
        }
        s01 O6 = ((f30) vTOPinFeed.q().get(0)).O6();
        if (O6 == null || (f13 = O6.f()) == null || (h10 = f13.h()) == null) {
            List q14 = vTOPinFeed.q();
            Intrinsics.checkNotNullExpressionValue(q14, "getItems(...)");
            return q14;
        }
        List q15 = vTOPinFeed.q();
        Intrinsics.checkNotNullExpressionValue(q15, "getItems(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : q15) {
            s01 O62 = ((f30) obj).O6();
            if (O62 != null && (f14 = O62.f()) != null && (h13 = f14.h()) != null && kotlin.text.z.i(h13, h10, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Uri z3() {
        Uri h03;
        String i13;
        v vVar = (v) getView();
        Bitmap bitmap = this.G;
        FragmentActivity E4 = ((f0) vVar).E4();
        if (E4 == null || (h03 = c0.d.h0(E4, bitmap)) == null || (i13 = qb0.b.i(E4, h03)) == null || i13.length() == 0) {
            return null;
        }
        return Uri.fromFile(new File(Uri.parse(i13).getPath()));
    }
}
