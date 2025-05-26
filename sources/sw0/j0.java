package sw0;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v0;
import androidx.recyclerview.widget.w2;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinDraftsButton;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinPermissionItemView;
import com.pinterest.feature.pin.creation.view.PinPreviewView;
import com.pinterest.feature.video.view.IdeaPinVideoExportLoadingView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.kit.view.ImageCropperLayout;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.p2;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.video.view.SimplePlayerView;
import h32.a4;
import h32.d4;
import h32.f1;
import i32.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.e2;
import m60.t0;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import so.oa;
import sw0.j0;
import sw0.r0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\t\nB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lsw0/j0;", "Lyq0/b0;", "Lyq0/a0;", "Lpw0/e0;", "Lpw0/v;", "Landroidx/lifecycle/z;", "Lgg1/b;", "<init>", "()V", "sw0/c0", "vt1/a", "mediaGallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j0 extends g<yq0.a0> implements pw0.e0, pw0.v, gg1.b {
    public static final /* synthetic */ int H1 = 0;
    public dc2.e A0;
    public AtomicReference A1;
    public wk2.a B0;
    public ur0.e B1;
    public dl1.t C0;
    public c0 C1;
    public k22.m D0;
    public r0 D1;
    public e2 E0;
    public final xk2.v E1;
    public de0.d F0;
    public final e0 F1;
    public nx.f0 G0;
    public final a0 G1;
    public rg0.s H0;
    public ny1.w I0;
    public zf0.f J0;
    public nu1.a K0;
    public vr0.a L0;
    public ag1.h M0;
    public lb0.r N0;
    public g70.h O0;
    public RelativeLayout P0;
    public GestaltIconButton Q0;
    public GestaltIconButton R0;
    public GestaltText S0;
    public GestaltIconButton T0;
    public FrameLayout U0;
    public GestaltText V0;
    public PinPreviewView W0;
    public ImageCropperLayout X0;
    public FrameLayout Y0;
    public AppBarLayout Z0;

    /* renamed from: a1, reason: collision with root package name */
    public FullBleedGestaltSpinner f115470a1;

    /* renamed from: b1, reason: collision with root package name */
    public IdeaPinVideoExportLoadingView f115471b1;

    /* renamed from: c1, reason: collision with root package name */
    public PinterestSwipeRefreshLayout f115472c1;

    /* renamed from: d1, reason: collision with root package name */
    public View f115473d1;

    /* renamed from: e1, reason: collision with root package name */
    public RecyclerView f115474e1;

    /* renamed from: f1, reason: collision with root package name */
    public GestaltText f115475f1;

    /* renamed from: g1, reason: collision with root package name */
    public GestaltTabLayout f115476g1;

    /* renamed from: h1, reason: collision with root package name */
    public SimplePlayerView f115477h1;

    /* renamed from: i1, reason: collision with root package name */
    public AlertContainer f115478i1;

    /* renamed from: j1, reason: collision with root package name */
    public IdeaPinDraftsButton f115479j1;

    /* renamed from: k1, reason: collision with root package name */
    public GestaltIconButton f115480k1;

    /* renamed from: l1, reason: collision with root package name */
    public GestaltIconButton f115481l1;

    /* renamed from: m1, reason: collision with root package name */
    public LinearLayout f115482m1;

    /* renamed from: n1, reason: collision with root package name */
    public GestaltButton f115483n1;

    /* renamed from: o1, reason: collision with root package name */
    public GestaltButton f115484o1;

    /* renamed from: p1, reason: collision with root package name */
    public GestaltButton f115485p1;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f115486q1;

    /* renamed from: r1, reason: collision with root package name */
    public LinearLayout f115487r1;

    /* renamed from: s1, reason: collision with root package name */
    public IdeaPinPermissionItemView f115488s1;

    /* renamed from: t1, reason: collision with root package name */
    public GestaltButton f115489t1;

    /* renamed from: u1, reason: collision with root package name */
    public final xk2.v f115490u1 = xk2.m.b(k.f115510w);

    /* renamed from: v1, reason: collision with root package name */
    public final i92.k f115491v1;

    /* renamed from: w1, reason: collision with root package name */
    public pw0.w f115492w1;

    /* renamed from: x1, reason: collision with root package name */
    public pw0.d0 f115493x1;

    /* renamed from: y1, reason: collision with root package name */
    public final ar0.c f115494y1;

    /* renamed from: z0, reason: collision with root package name */
    public wk2.a f115495z0;

    /* renamed from: z1, reason: collision with root package name */
    public final androidx.recyclerview.widget.q0 f115496z1;

    public j0() {
        Context context = kb0.a.f79058b;
        this.f115491v1 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
        ar0.c cVar = new ar0.c();
        this.f115494y1 = cVar;
        this.f115496z1 = new androidx.recyclerview.widget.q0(cVar);
        xj2.e eVar = new xj2.e(ck2.i.f27922b);
        Intrinsics.checkNotNullExpressionValue(eVar, "empty(...)");
        this.A1 = eVar;
        this.E1 = xk2.m.b(k.f115507t);
        int i13 = 0;
        this.F1 = new e0(this, i13);
        this.G1 = new a0(this, i13);
    }

    public static /* synthetic */ NavigationImpl V8(j0 j0Var, ScreenLocation screenLocation, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i13 = ml1.b.UNSPECIFIED_TRANSITION.getValue();
        }
        return j0Var.U8(screenLocation, i13, false);
    }

    public static NavigationImpl X8(String str) {
        NavigationImpl z03 = Navigation.z0((ScreenLocation) p2.f51197a.getValue(), str);
        z03.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", true);
        Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
        return z03;
    }

    public static int k9(View view) {
        view.measure(0, 0);
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = measuredWidth + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
    }

    @Override // gg1.b
    public final void E6(hg1.d optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        switch (d0.f115426b[optionType.ordinal()]) {
            case 1:
                u9(X8("https://help.pinterest.com/guide/guide-to-creating-pins"));
                return;
            case 2:
                u9(X8("https://business.pinterest.com/creative-best-practices/"));
                return;
            case 3:
                wy0 f13 = ((b60.d) getActiveUserManager()).f();
                String G2 = f13 != null ? f13.G2() : null;
                gg1.b.f64972so.getClass();
                String str = (String) gg1.a.a().get(G2);
                if (str == null) {
                    str = "768145348882884282";
                }
                g70.h hVar = this.O0;
                if (hVar != null) {
                    g70.h.b(hVar, str, new e0(this, 8));
                    return;
                } else {
                    Intrinsics.r("boardNavigator");
                    throw null;
                }
            case 4:
                u9(X8("https://business.pinterest.com/creators/"));
                return;
            case 5:
                u9(X8("https://business.pinterest.com/creator-code/"));
                return;
            case 6:
                M1(V8(this, p2.b(), 0, 6));
                return;
            case 7:
                u9(X8("https://help.pinterest.com/business/article/pinterest-analytics"));
                return;
            default:
                return;
        }
    }

    @Override // gg1.b
    public final void M2(hg1.b optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        int i13 = d0.f115427c[optionType.ordinal()];
        if (i13 == 1) {
            f7().d(new jc0.v(new yf1.b((xf1.a) null, 3), false, 0L, 30));
        } else {
            if (i13 != 2) {
                return;
            }
            u9(X8("https://help.pinterest.com"));
        }
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context context = getContext();
        if (context != null) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, new xo0.i(context, 26));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, new xo0.i(context, 27));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, new xo0.i(context, 28));
            ye2.m mVar = (ye2.m) context;
            adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID, new i0(mVar, this, 0));
            adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER, new i0(mVar, this, 1));
        }
    }

    public final NavigationImpl U8(ScreenLocation screenLocation, int i13, boolean z13) {
        boolean booleanValue;
        boolean booleanValue2;
        Integer valueOf;
        int intValue;
        NavigationImpl L = Navigation.L(screenLocation, "", i13);
        L.y0(j9(), "com.pinterest.EXTRA_MEDIA_GALLERY_TYPE");
        Navigation navigation = this.I;
        Integer num = null;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_MEDIA_GALLERY_ENTRY_TYPE") : null;
        if (v03 == null) {
            v03 = "IdeaPinPageAdd";
        }
        L.m0("com.pinterest.EXTRA_STORY_PIN_MEDIA_GALLERY_ENTRY_TYPE", v03);
        L.m0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", i9("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE"));
        Navigation navigation2 = this.I;
        if (navigation2 != null) {
            booleanValue = navigation2.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false);
        } else {
            Boolean c93 = c9("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT");
            booleanValue = c93 != null ? c93.booleanValue() : false;
        }
        L.Y1("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", booleanValue);
        Navigation navigation3 = this.I;
        if (navigation3 != null) {
            booleanValue2 = navigation3.S("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", false);
        } else {
            Boolean c94 = c9("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD");
            booleanValue2 = c94 != null ? c94.booleanValue() : false;
        }
        L.Y1("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", booleanValue2);
        Navigation navigation4 = this.I;
        if (navigation4 != null) {
            intValue = navigation4.J1("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS");
        } else {
            if (navigation4 != null) {
                valueOf = Integer.valueOf(navigation4.J1("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS"));
            } else {
                Bundle arguments = getArguments();
                valueOf = arguments != null ? Integer.valueOf(arguments.getInt("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS")) : null;
            }
            intValue = valueOf != null ? valueOf.intValue() : -1;
        }
        L.z(intValue, "com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS");
        L.m0("com.pinterest.EXTRA_BOARD_ID", i9("com.pinterest.EXTRA_BOARD_ID"));
        L.m0("com.pinterest.EXTRA_BOARD_SECTION_ID", i9("com.pinterest.EXTRA_BOARD_SECTION_ID"));
        L.m0("com.pinterest.EXTRA_COMMENT_ID", i9("com.pinterest.EXTRA_COMMENT_ID"));
        L.m0("com.pinterest.EXTRA_COMMENT_AUTHOR_NAME", i9("com.pinterest.EXTRA_COMMENT_AUTHOR_NAME"));
        L.m0("com.pinterest.EXTRA_COMMENT_TEXT", i9("com.pinterest.EXTRA_COMMENT_TEXT"));
        L.m0("com.pinterest.EXTRA_COMMENT_PIN_ID", i9("com.pinterest.EXTRA_COMMENT_PIN_ID"));
        L.m0("com.pinterest.EXTRA_COMMENT_PIN_THUMBNAIL_PATH", i9("com.pinterest.EXTRA_COMMENT_PIN_THUMBNAIL_PATH"));
        L.Y1("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", z13);
        Navigation navigation5 = this.I;
        L.z(navigation5 != null ? navigation5.J1("com.pinterest.EXTRA_LOCAL_STORY_PIN_CLIP_COUNT") : 0, "com.pinterest.EXTRA_LOCAL_STORY_PIN_CLIP_COUNT");
        L.Y1("com.pinterest.EXTRA_IDEA_PIN_EDIT_FLOW", m9());
        Navigation navigation6 = this.I;
        if (navigation6 != null) {
            num = Integer.valueOf(navigation6.J1("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS"));
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                num = Integer.valueOf(arguments2.getInt("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS"));
            }
        }
        L.z(num != null ? num.intValue() : 0, "com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS");
        Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
        return L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    @Override // yk1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yk1.m V7() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sw0.j0.V7():yk1.m");
    }

    public final void W8() {
        Context context;
        ny1.f fVar = ny1.f.f92666f;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (fVar.a(requireContext) || (Build.VERSION.SDK_INT >= 34 && (context = getContext()) != null && ny1.m.f92673f.a(context))) {
            l9();
            pw0.d0 d0Var = this.f115493x1;
            if (d0Var != null) {
                ((qw0.j) d0Var).J3();
            }
            Z8();
            return;
        }
        if (!this.f115486q1) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            if (!fVar.b(requireActivity, f9(), false)) {
                this.f115486q1 = true;
                q9();
                return;
            }
        }
        t9();
    }

    @Override // ha2.f
    public final void Y4(ha2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
    }

    public final void Y8(int i13) {
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().h(i13);
    }

    public final void Z8() {
        Context context;
        int dimension = (int) getResources().getDimension(dq1.a.pin_marklet_header_height);
        Context context2 = getContext();
        if (context2 != null) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 34 && i13 >= 34 && (context = getContext()) != null && ny1.m.f92673f.a(context)) {
                int length = ny1.g.f92667f.d(context2).length;
                for (int i14 = 0; i14 < length; i14++) {
                    if (!r1[i14]) {
                    }
                }
                dimension += (int) getResources().getDimension(dq1.a.pin_marklet_partial_photo_info_height);
                LinearLayout linearLayout = this.f115482m1;
                if (linearLayout == null) {
                    Intrinsics.r("partial_photo_permission_info");
                    throw null;
                }
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f115482m1;
            if (linearLayout2 == null) {
                Intrinsics.r("partial_photo_permission_info");
                throw null;
            }
            linearLayout2.setVisibility(8);
        }
        FrameLayout frameLayout = this.Y0;
        if (frameLayout == null) {
            Intrinsics.r("previewFrame");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = dimension;
        frameLayout.setLayoutParams(marginLayoutParams);
    }

    public final void a9(int i13) {
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().k(i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r22.size() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList b9(java.util.List r22, java.util.Map r23, boolean r24, float r25) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sw0.j0.b9(java.util.List, java.util.Map, boolean, float):java.util.ArrayList");
    }

    public final Boolean c9(String str) {
        Navigation navigation = this.I;
        if (navigation != null) {
            return Boolean.valueOf(navigation.S(str, false));
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean(str));
        }
        return null;
    }

    public final wk2.a d9() {
        wk2.a aVar = this.B0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("ideaPinComposeDataManagerProvider");
        throw null;
    }

    public final long e9() {
        Navigation navigation = this.I;
        return navigation != null ? navigation.U(pp2.a.u()) : pp2.a.u();
    }

    public final ny1.w f9() {
        ny1.w wVar = this.I0;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("permissionsManager");
        throw null;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        FragmentActivity requireActivity = requireActivity();
        if (m9()) {
            D5();
            return true;
        }
        requireActivity.finishAfterTransition();
        return true;
    }

    public final uk2.f g9() {
        return (uk2.f) this.E1.getValue();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getT0() {
        return pw0.j.b(j9()) ? a4.STORY_PIN_CREATE : a4.CAMERA_PHOTO_PICKER;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF68107l0() {
        return j9() == pw0.x.ProfileCover ? d4.BUSINESS_ACCOUNT_COVER_PHOTO_PICKER : j9() == pw0.x.IdeaPinImageSticker ? d4.IDEA_PIN_IMAGE_STICKER_PHOTO_PICKER : n9() ? d4.STORY_PIN_MULTI_PHOTO_PICKER : j9() == pw0.x.ProfilePhoto ? d4.PROFILE_PHOTO_PICKER : d4.CAMERA;
    }

    public final dl1.t h9() {
        dl1.t tVar = this.C0;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.r("storyPinLocalDataRepository");
        throw null;
    }

    public final String i9(String str) {
        String v03;
        Navigation navigation = this.I;
        if (navigation != null && (v03 = navigation.v0(str)) != null) {
            return v03;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(str);
        }
        return null;
    }

    public final pw0.x j9() {
        String i93 = i9("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE");
        if (i93 == null) {
            i93 = "";
        }
        return pw0.x.valueOf(i93);
    }

    public final void l9() {
        LinearLayout linearLayout = this.f115487r1;
        if (linearLayout == null) {
            Intrinsics.r("missingPermissionContainer");
            throw null;
        }
        bs1.c.X0(linearLayout);
        PinPreviewView pinPreviewView = this.W0;
        if (pinPreviewView == null) {
            Intrinsics.r("previewView");
            throw null;
        }
        bs1.c.U1(pinPreviewView);
        RelativeLayout relativeLayout = this.P0;
        if (relativeLayout == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        bs1.c.U1(relativeLayout);
        AppBarLayout appBarLayout = this.Z0;
        if (appBarLayout != null) {
            bs1.c.U1(appBarLayout);
        } else {
            Intrinsics.r("previewBarLayout");
            throw null;
        }
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(ct1.c.media_gallery_fragment, ct1.b.media_gallery_recycler);
        eVar.c(ct1.b.media_gallery_loader);
        return eVar;
    }

    public final boolean m9() {
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.S("com.pinterest.EXTRA_IDEA_PIN_EDIT_FLOW", false);
        }
        return false;
    }

    @Override // yq0.t
    public final v0 n8() {
        final b0 b0Var = new b0(this, 1);
        getContext();
        return new v0(new PinterestGridLayoutManager(b0Var) { // from class: com.pinterest.feature.mediagallery.view.MediaGalleryFragment$getLayoutManagerContract$gridLayoutManager$1
            @Override // androidx.recyclerview.widget.l2
            public final void B0(int i13) {
                r0 r0Var = j0.this.D1;
                if (r0Var != null) {
                    r0Var.b();
                }
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
            public final void y0(w2 w2Var) {
                super.y0(w2Var);
                r0 r0Var = j0.this.D1;
                if (r0Var != null) {
                    Intrinsics.checkNotNullParameter(this, "layoutManager");
                    if (r0Var.f115565d || r0Var.f115564c != -1) {
                        return;
                    }
                    View D = D(0);
                    int height = D != null ? D.getHeight() : 0;
                    View view = (View) r0Var.f115568g;
                    boolean z13 = view == null ? this.f19507o > 0 : !(this.f19507o <= 0 || view.getHeight() <= 0);
                    if (P() <= 0 || height <= 0 || !z13) {
                        return;
                    }
                    int height2 = ((((this.f19507o - (view != null ? view.getHeight() : 0)) + height) - 1) / height) * this.F;
                    r0Var.f115564c = height2;
                    int i13 = r0Var.f115563b;
                    if (i13 != -1) {
                        height2 = Math.min(i13, height2);
                    }
                    r0Var.f115563b = height2;
                    r0Var.a();
                }
            }
        });
    }

    public final boolean n9() {
        return o9() && j9() != pw0.x.IdeaPinImageSticker;
    }

    public final boolean o9() {
        pw0.x type = j9();
        Intrinsics.checkNotNullParameter(type, "type");
        return type == pw0.x.IdeaPinPageAdd || type == pw0.x.IdeaPinAddMediaClip || type == pw0.x.IdeaPinImageSticker;
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(ct1.b.gallery_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.P0 = (RelativeLayout) findViewById;
        View findViewById2 = onCreateView.findViewById(ct1.b.gallery_exit_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.Q0 = (GestaltIconButton) findViewById2;
        View findViewById3 = onCreateView.findViewById(ct1.b.gallery_back_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.R0 = (GestaltIconButton) findViewById3;
        View findViewById4 = onCreateView.findViewById(ct1.b.gallery_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.S0 = (GestaltText) findViewById4;
        View findViewById5 = onCreateView.findViewById(ct1.b.preview_frame);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.Y0 = (FrameLayout) findViewById5;
        View findViewById6 = onCreateView.findViewById(ct1.b.gallery_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.W0 = (PinPreviewView) findViewById6;
        View findViewById7 = onCreateView.findViewById(ct1.b.gallery_next_gestalt_button);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f115484o1 = (GestaltButton) findViewById7;
        View findViewById8 = onCreateView.findViewById(ct1.b.video_preview);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f115477h1 = (SimplePlayerView) findViewById8;
        View findViewById9 = onCreateView.findViewById(ct1.b.preview_bar_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.Z0 = (AppBarLayout) findViewById9;
        SimplePlayerView simplePlayerView = this.f115477h1;
        if (simplePlayerView == null) {
            Intrinsics.r("videoPreview");
            throw null;
        }
        c0 c0Var = new c0(simplePlayerView);
        this.C1 = c0Var;
        AppBarLayout appBarLayout = this.Z0;
        if (appBarLayout == null) {
            Intrinsics.r("previewBarLayout");
            throw null;
        }
        appBarLayout.b(c0Var);
        View findViewById10 = onCreateView.findViewById(ct1.b.gallery_preview_cropper);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.X0 = (ImageCropperLayout) findViewById10;
        View findViewById11 = onCreateView.findViewById(ct1.b.media_gallery_progress_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f115470a1 = (FullBleedGestaltSpinner) findViewById11;
        View findViewById12 = onCreateView.findViewById(ct1.b.video_export_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f115471b1 = (IdeaPinVideoExportLoadingView) findViewById12;
        View findViewById13 = onCreateView.findViewById(ct1.b.media_gallery_loader);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.f115472c1 = (PinterestSwipeRefreshLayout) findViewById13;
        View findViewById14 = onCreateView.findViewById(ct1.b.thumbnail_tray_container);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.f115473d1 = findViewById14;
        View findViewById15 = onCreateView.findViewById(ct1.b.thumbnail_tray_list);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.f115474e1 = (RecyclerView) findViewById15;
        View findViewById16 = onCreateView.findViewById(ct1.b.thumbnail_tray_message);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.f115475f1 = (GestaltText) findViewById16;
        View findViewById17 = onCreateView.findViewById(ct1.b.multi_assets_container);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.U0 = (FrameLayout) findViewById17;
        View findViewById18 = onCreateView.findViewById(ct1.b.multi_assets_text);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        this.V0 = (GestaltText) findViewById18;
        View findViewById19 = onCreateView.findViewById(ct1.b.media_gallery_tabs);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        this.f115476g1 = (GestaltTabLayout) findViewById19;
        View findViewById20 = requireActivity().findViewById(dq1.c.alert_container);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        this.f115478i1 = (AlertContainer) findViewById20;
        View findViewById21 = onCreateView.findViewById(ct1.b.remove_profile_cover_gestalt_button);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.f115485p1 = (GestaltButton) findViewById21;
        View findViewById22 = onCreateView.findViewById(ct1.b.media_gallery_drafts_button);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.f115479j1 = (IdeaPinDraftsButton) findViewById22;
        View findViewById23 = onCreateView.findViewById(ct1.b.media_gallery_camera_button);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        this.f115480k1 = (GestaltIconButton) findViewById23;
        View findViewById24 = onCreateView.findViewById(ct1.b.media_gallery_save_from_url_button);
        Intrinsics.checkNotNullExpressionValue(findViewById24, "findViewById(...)");
        this.f115481l1 = (GestaltIconButton) findViewById24;
        View findViewById25 = onCreateView.findViewById(ct1.b.gallery_permission_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById25, "findViewById(...)");
        this.f115487r1 = (LinearLayout) findViewById25;
        View findViewById26 = onCreateView.findViewById(ct1.b.missing_permission_text);
        Intrinsics.checkNotNullExpressionValue(findViewById26, "findViewById(...)");
        View findViewById27 = onCreateView.findViewById(ct1.b.gallery_permission_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById27, "findViewById(...)");
        this.f115488s1 = (IdeaPinPermissionItemView) findViewById27;
        View findViewById28 = onCreateView.findViewById(ct1.b.enable_permission_gestalt_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById28, "findViewById(...)");
        this.f115489t1 = (GestaltButton) findViewById28;
        View findViewById29 = onCreateView.findViewById(t0.idea_pin_help);
        Intrinsics.checkNotNullExpressionValue(findViewById29, "findViewById(...)");
        this.T0 = (GestaltIconButton) findViewById29;
        View findViewById30 = onCreateView.findViewById(ct1.b.partial_photo_info);
        Intrinsics.checkNotNullExpressionValue(findViewById30, "findViewById(...)");
        this.f115482m1 = (LinearLayout) findViewById30;
        View findViewById31 = onCreateView.findViewById(ct1.b.partial_photo_info_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById31, "findViewById(...)");
        this.f115483n1 = (GestaltButton) findViewById31;
        GestaltText gestaltText = this.S0;
        if (gestaltText == null) {
            Intrinsics.r("toolbarTitle");
            throw null;
        }
        int i13 = 4;
        q5.v0.o(gestaltText, new kj.d("android.widget.Spinner", i13));
        int i14 = d0.f115425a[j9().ordinal()];
        int i15 = 2;
        int i16 = 1;
        String string = getString((i14 == 1 || i14 == 2 || i14 == 3) ? x0.done : x0.next);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        fm1.c cVar = j9() == pw0.x.IdeaPinImageSticker ? fm1.c.INVISIBLE : fm1.c.VISIBLE;
        GestaltButton gestaltButton = this.f115484o1;
        if (gestaltButton == null) {
            Intrinsics.r("nextGestaltButton");
            throw null;
        }
        GestaltButton d2 = gestaltButton.d(new rq.p(string, cVar, i15));
        a0 a0Var = this.G1;
        d2.e(a0Var);
        GestaltButton gestaltButton2 = this.f115489t1;
        if (gestaltButton2 == null) {
            Intrinsics.r("permissionGestaltButton");
            throw null;
        }
        gestaltButton2.e(a0Var);
        GestaltButton gestaltButton3 = this.f115483n1;
        if (gestaltButton3 == null) {
            Intrinsics.r("partial_photo_permission_info_btn");
            throw null;
        }
        gestaltButton3.e(a0Var);
        Z8();
        int i17 = 0;
        if (o9()) {
            Context requireContext = requireContext();
            int i18 = eo1.b.color_themed_background_default;
            Object obj = d5.a.f53679a;
            int color = requireContext.getColor(i18);
            onCreateView.setBackgroundColor(color);
            RelativeLayout relativeLayout = this.P0;
            if (relativeLayout == null) {
                Intrinsics.r("toolbar");
                throw null;
            }
            relativeLayout.setBackgroundColor(color);
            PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f115472c1;
            if (pinterestSwipeRefreshLayout == null) {
                Intrinsics.r("refreshLayout");
                throw null;
            }
            pinterestSwipeRefreshLayout.setBackgroundColor(color);
            if (m9()) {
                GestaltIconButton gestaltIconButton = this.Q0;
                if (gestaltIconButton == null) {
                    Intrinsics.r("exitButtonIcon");
                    throw null;
                }
                com.bumptech.glide.c.d0(gestaltIconButton);
                GestaltIconButton gestaltIconButton2 = this.R0;
                if (gestaltIconButton2 == null) {
                    Intrinsics.r("backButtonIcon");
                    throw null;
                }
                com.bumptech.glide.c.u1(gestaltIconButton2);
                GestaltIconButton gestaltIconButton3 = this.R0;
                if (gestaltIconButton3 == null) {
                    Intrinsics.r("backButtonIcon");
                    throw null;
                }
                gestaltIconButton3.t(b.f115408n);
            } else {
                this.D1 = new r0(getF68107l0(), getT0());
                GestaltIconButton gestaltIconButton4 = this.Q0;
                if (gestaltIconButton4 == null) {
                    Intrinsics.r("exitButtonIcon");
                    throw null;
                }
                gestaltIconButton4.t(b.f115409o);
            }
            if (n9()) {
                View view = this.f115473d1;
                if (view == null) {
                    Intrinsics.r("thumbnailTrayContainer");
                    throw null;
                }
                view.setVisibility(0);
                RecyclerView recyclerView = this.f115474e1;
                if (recyclerView == null) {
                    Intrinsics.r("thumbnailTrayList");
                    throw null;
                }
                recyclerView.H2((pw0.c) this.f115490u1.getValue());
                b0 b0Var = new b0(this, i17);
                recyclerView.getContext();
                recyclerView.R2(new PinterestLinearLayoutManager(b0Var, 0, false));
                recyclerView.m(new pw0.d());
                this.f115496z1.i(recyclerView);
                GestaltTabLayout gestaltTabLayout = this.f115476g1;
                if (gestaltTabLayout == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                gestaltTabLayout.setVisibility(0);
                GestaltTabLayout gestaltTabLayout2 = this.f115476g1;
                if (gestaltTabLayout2 == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                gestaltTabLayout2.b(new iq0.c(this, i16));
            }
        }
        if (!m9()) {
            GestaltIconButton gestaltIconButton5 = this.Q0;
            if (gestaltIconButton5 == null) {
                Intrinsics.r("exitButtonIcon");
                throw null;
            }
            gestaltIconButton5.t(b.f115410p);
        }
        GestaltIconButton gestaltIconButton6 = this.T0;
        if (gestaltIconButton6 == null) {
            Intrinsics.r("helpButton");
            throw null;
        }
        gestaltIconButton6.t(b.f115411q);
        FrameLayout frameLayout = this.Y0;
        if (frameLayout == null) {
            Intrinsics.r("previewFrame");
            throw null;
        }
        Context requireContext2 = requireContext();
        int i19 = eo1.b.color_black_900;
        Object obj2 = d5.a.f53679a;
        frameLayout.setBackgroundColor(requireContext2.getColor(i19));
        FullBleedGestaltSpinner fullBleedGestaltSpinner = this.f115470a1;
        if (fullBleedGestaltSpinner == null) {
            Intrinsics.r("progressIndicator");
            throw null;
        }
        fullBleedGestaltSpinner.showLoadingSpinner(false);
        int dimensionPixelSize = (hf0.b.q() ? wa2.s.f128899l0 : hf0.b.f69002b) - (getResources().getDimensionPixelSize(dq1.a.pin_marklet_header_height) + hf0.b.f69007g);
        w9();
        PinPreviewView pinPreviewView = this.W0;
        if (pinPreviewView == null) {
            Intrinsics.r("previewView");
            throw null;
        }
        pinPreviewView.k();
        pinPreviewView.m(new n11.a(dimensionPixelSize));
        GestaltText gestaltText2 = this.S0;
        if (gestaltText2 == null) {
            Intrinsics.r("toolbarTitle");
            throw null;
        }
        int i23 = 5;
        gestaltText2.i(new ks0.f(new rm1.d(new rm1.f(rm1.q.ARROW_DOWN, rm1.i.XS), rm1.c.DEFAULT, null, 0, null, 28), i23));
        gestaltText2.j(new lq0.o(8, this, gestaltText2));
        GestaltIconButton gestaltIconButton7 = this.Q0;
        if (gestaltIconButton7 == null) {
            Intrinsics.r("exitButtonIcon");
            throw null;
        }
        gestaltIconButton7.u(new a0(this, i13));
        GestaltIconButton gestaltIconButton8 = this.R0;
        if (gestaltIconButton8 == null) {
            Intrinsics.r("backButtonIcon");
            throw null;
        }
        gestaltIconButton8.u(new a0(this, i23));
        Boolean c93 = c9("com.pinterest.REMOVE_PROFILE_COVER");
        if (c93 != null && c93.booleanValue()) {
            AlertContainer alertContainer = this.f115478i1;
            if (alertContainer == null) {
                Intrinsics.r("alertContainer");
                throw null;
            }
            int color2 = requireContext().getColor(eo1.b.color_black_900);
            View view2 = alertContainer.f44685a;
            if (view2 == null) {
                Intrinsics.r("overlay");
                throw null;
            }
            view2.setBackgroundColor(color2);
            GestaltButton gestaltButton4 = this.f115485p1;
            if (gestaltButton4 == null) {
                Intrinsics.r("removeProfileCoverGestaltButton");
                throw null;
            }
            gestaltButton4.d(b.f115407m).e(a0Var);
        }
        return onCreateView;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.atomic.AtomicReference, xj2.c] */
    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AppBarLayout appBarLayout = this.Z0;
        if (appBarLayout == null) {
            Intrinsics.r("previewBarLayout");
            throw null;
        }
        c0 c0Var = this.C1;
        if (c0Var == null) {
            Intrinsics.r("collapsingBarListener");
            throw null;
        }
        appBarLayout.l(c0Var);
        SimplePlayerView simplePlayerView = this.f115477h1;
        if (simplePlayerView == null) {
            Intrinsics.r("videoPreview");
            throw null;
        }
        a7.v0 v0Var = simplePlayerView.f18946k;
        if (v0Var != null) {
            v0Var.stop();
        }
        SimplePlayerView simplePlayerView2 = this.f115477h1;
        if (simplePlayerView2 == null) {
            Intrinsics.r("videoPreview");
            throw null;
        }
        a7.v0 v0Var2 = simplePlayerView2.f18946k;
        if (v0Var2 != null) {
            v0Var2.a();
        }
        RecyclerView recyclerView = this.f115474e1;
        if (recyclerView == null) {
            Intrinsics.r("thumbnailTrayList");
            throw null;
        }
        recyclerView.H2(null);
        if (!this.A1.isDisposed()) {
            this.A1.dispose();
        }
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        r0 r0Var = this.D1;
        if (r0Var != null) {
            r0Var.b();
        }
        ur0.e eVar = this.B1;
        if (eVar != null) {
            if (this.J0 == null) {
                Intrinsics.r("educationHelper");
                throw null;
            }
            zf0.f.a(eVar);
        }
        SimplePlayerView simplePlayerView = this.f115477h1;
        if (simplePlayerView == null) {
            Intrinsics.r("videoPreview");
            throw null;
        }
        a7.v0 v0Var = simplePlayerView.f18946k;
        if (v0Var != null) {
            v0Var.pause();
        }
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SimplePlayerView simplePlayerView = this.f115477h1;
        if (simplePlayerView == null) {
            Intrinsics.r("videoPreview");
            throw null;
        }
        p9(simplePlayerView);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.d1(requireActivity);
        xk2.v vVar = y.f115589f;
        vt1.a.u().e();
        W8();
        if (n9()) {
            vr0.a aVar = this.L0;
            if (aVar == null) {
                Intrinsics.r("experienceDataSource");
                throw null;
            }
            ((vr0.c) aVar).b(y0.ANDROID_IDEA_PIN_CREATION_ASSET_PICKER);
        }
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        SimplePlayerView simplePlayerView = this.f115477h1;
        if (simplePlayerView == null) {
            Intrinsics.r("videoPreview");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = simplePlayerView.getLayoutParams();
        PinPreviewView pinPreviewView = this.W0;
        if (pinPreviewView == null) {
            Intrinsics.r("previewView");
            throw null;
        }
        layoutParams.height = pinPreviewView.g().a();
        SimplePlayerView simplePlayerView2 = this.f115477h1;
        if (simplePlayerView2 == null) {
            Intrinsics.r("videoPreview");
            throw null;
        }
        dc2.e eVar = this.A0;
        if (eVar == null) {
            Intrinsics.r("pinterestPlayerFactory");
            throw null;
        }
        simplePlayerView2.y(eVar.f());
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.k(null);
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int i13 = 2;
        a8(new ko0.b(2, resources));
        IdeaPinPermissionItemView ideaPinPermissionItemView = this.f115488s1;
        if (ideaPinPermissionItemView == null) {
            Intrinsics.r("galleryPermissionView");
            throw null;
        }
        int i14 = 1;
        ideaPinPermissionItemView.b(1, dq1.f.idea_pin_gallery_access);
        if (n9()) {
            IdeaPinDraftsButton ideaPinDraftsButton = this.f115479j1;
            if (ideaPinDraftsButton == null) {
                Intrinsics.r("draftsButton");
                throw null;
            }
            ideaPinDraftsButton.setOnClickListener(new com.pinterest.feature.home.view.c(this, 12));
            GestaltIconButton gestaltIconButton = this.f115480k1;
            if (gestaltIconButton == null) {
                Intrinsics.r("cameraButton");
                throw null;
            }
            gestaltIconButton.u(new a0(this, i14));
            GestaltIconButton gestaltIconButton2 = this.T0;
            if (gestaltIconButton2 == null) {
                Intrinsics.r("helpButton");
                throw null;
            }
            gestaltIconButton2.u(new a0(this, i13));
            GestaltIconButton gestaltIconButton3 = this.T0;
            if (gestaltIconButton3 == null) {
                Intrinsics.r("helpButton");
                throw null;
            }
            com.bumptech.glide.c.u1(gestaltIconButton3);
            GestaltIconButton gestaltIconButton4 = this.f115481l1;
            if (gestaltIconButton4 == null) {
                Intrinsics.r("saveFromURLButton");
                throw null;
            }
            gestaltIconButton4.u(new a0(this, 3));
        }
        xj2.c F = g9().K(1000L, TimeUnit.MILLISECONDS).A(wj2.c.a()).F(new gw0.a(18, this.F1), new gw0.a(19, new e0(this, 9)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        R6(F);
    }

    public final void p9(SimplePlayerView simplePlayerView) {
        a7.v0 v0Var;
        if (bs1.c.o1(simplePlayerView)) {
            c0 c0Var = this.C1;
            if (c0Var == null) {
                Intrinsics.r("collapsingBarListener");
                throw null;
            }
            if (!c0Var.b() || (v0Var = simplePlayerView.f18946k) == null) {
                return;
            }
            v0Var.play();
        }
    }

    public final void q9() {
        ny1.w f93 = f9();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        f93.c(requireActivity, ny1.f.f92666f, (r23 & 4) != 0 ? "" : tb0.p.MEDIA_GALLERY.toString(), null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : new f0(this, 4), (r23 & 1024) != 0 ? ny1.t.f92703n : null);
    }

    public final void r9(boolean z13) {
        GestaltButton gestaltButton = this.f115484o1;
        if (gestaltButton != null) {
            gestaltButton.d(new dv0.n(z13, 7));
        } else {
            Intrinsics.r("nextGestaltButton");
            throw null;
        }
    }

    public final void s9(String directoryName) {
        int k93;
        Intrinsics.checkNotNullParameter(directoryName, "directoryName");
        GestaltText gestaltText = this.S0;
        if (gestaltText == null) {
            Intrinsics.r("toolbarTitle");
            throw null;
        }
        pk.a0.p(gestaltText, directoryName);
        GestaltText gestaltText2 = this.S0;
        if (gestaltText2 == null) {
            Intrinsics.r("toolbarTitle");
            throw null;
        }
        int k94 = k9(gestaltText2) / 2;
        float f13 = hf0.b.f69002b / 2;
        GestaltText gestaltText3 = this.S0;
        if (gestaltText3 == null) {
            Intrinsics.r("toolbarTitle");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = gestaltText3.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        GestaltIconButton gestaltIconButton = this.Q0;
        if (gestaltIconButton == null) {
            Intrinsics.r("exitButtonIcon");
            throw null;
        }
        int k95 = k9(gestaltIconButton) + k94;
        pw0.x j93 = j9();
        pw0.x xVar = pw0.x.IdeaPinImageSticker;
        int i13 = 0;
        if (j93 == xVar) {
            k93 = 0;
        } else {
            GestaltIconButton gestaltIconButton2 = this.T0;
            if (gestaltIconButton2 == null) {
                Intrinsics.r("helpButton");
                throw null;
            }
            k93 = k9(gestaltIconButton2);
        }
        int i14 = k95 + k93;
        if (j9() != xVar) {
            GestaltButton gestaltButton = this.f115484o1;
            if (gestaltButton == null) {
                Intrinsics.r("nextGestaltButton");
                throw null;
            }
            i13 = k9(gestaltButton);
        }
        int i15 = k94 + i13;
        if (i14 <= f13 && i15 <= f13) {
            layoutParams2.removeRule(17);
            layoutParams2.removeRule(16);
            layoutParams2.removeRule(21);
            return;
        }
        if (n9()) {
            layoutParams2.addRule(17, t0.idea_pin_help);
        } else {
            layoutParams2.addRule(17, ct1.b.gallery_exit_icon);
        }
        if (j9() == xVar) {
            layoutParams2.addRule(21);
        } else {
            layoutParams2.addRule(16, ct1.b.gallery_next_gestalt_button);
        }
    }

    public final void t9() {
        LinearLayout linearLayout = this.f115487r1;
        if (linearLayout == null) {
            Intrinsics.r("missingPermissionContainer");
            throw null;
        }
        bs1.c.U1(linearLayout);
        PinPreviewView pinPreviewView = this.W0;
        if (pinPreviewView == null) {
            Intrinsics.r("previewView");
            throw null;
        }
        bs1.c.X0(pinPreviewView);
        RelativeLayout relativeLayout = this.P0;
        if (relativeLayout == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        bs1.c.X0(relativeLayout);
        AppBarLayout appBarLayout = this.Z0;
        if (appBarLayout == null) {
            Intrinsics.r("previewBarLayout");
            throw null;
        }
        bs1.c.X0(appBarLayout);
        IdeaPinPermissionItemView ideaPinPermissionItemView = this.f115488s1;
        if (ideaPinPermissionItemView == null) {
            Intrinsics.r("galleryPermissionView");
            throw null;
        }
        ideaPinPermissionItemView.a(false);
        nx.d0 s73 = s7();
        f1 f1Var = f1.RENDER;
        h32.g0 g0Var = h32.g0.STORY_PIN_MISSING_PERMISSIONS_VIEW;
        HashMap o13 = ep.b.o("is_gallery_permission_granted", "false");
        Unit unit = Unit.f80348a;
        nx.d0.B(s73, f1Var, g0Var, null, o13, 20);
    }

    public final void u9(Navigation navigation) {
        lu1.d a73 = a7();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Intent b13 = a73.b(requireContext, lu1.a.MAIN_ACTIVITY);
        b13.putExtra("com.pinterest.EXTRA_PENDING_TASK", navigation);
        b13.putExtra("com.pinterest.EXTRA_SKIP_HOME_SCREEN", true);
        b13.putExtra("com.pinterest.EXTRA_NO_BOTTOM_NAV_INFLATION", true);
        requireContext().startActivity(b13);
    }

    public final void v9(boolean z13) {
        if (j9() == pw0.x.IdeaPinPageAdd) {
            FrameLayout frameLayout = this.U0;
            if (frameLayout == null) {
                Intrinsics.r("multiAssetsContainer");
                throw null;
            }
            bs1.c.R1(frameLayout, z13);
            GestaltText gestaltText = this.V0;
            if (gestaltText == null) {
                Intrinsics.r("multiAssetsText");
                throw null;
            }
            String string = getString(ct1.e.pin_multi_assets);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            pk.a0.p(gestaltText, string);
        }
    }

    public final void w9() {
        if (o9()) {
            FrameLayout frameLayout = this.Y0;
            if (frameLayout != null) {
                bs1.c.X0(frameLayout);
                return;
            } else {
                Intrinsics.r("previewFrame");
                throw null;
            }
        }
        FrameLayout frameLayout2 = this.Y0;
        if (frameLayout2 != null) {
            bs1.c.U1(frameLayout2);
        } else {
            Intrinsics.r("previewFrame");
            throw null;
        }
    }

    @Override // ha2.f
    public final void x2() {
        a.c.y(f7());
    }

    public final void x9(ArrayList thumbnails) {
        Intrinsics.checkNotNullParameter(thumbnails, "thumbnails");
        if (o9()) {
            IdeaPinDraftsButton ideaPinDraftsButton = this.f115479j1;
            if (ideaPinDraftsButton == null) {
                Intrinsics.r("draftsButton");
                throw null;
            }
            if (thumbnails.isEmpty()) {
                if (m9()) {
                    bs1.c.R1(ideaPinDraftsButton, false);
                    GestaltIconButton gestaltIconButton = this.f115481l1;
                    if (gestaltIconButton == null) {
                        Intrinsics.r("saveFromURLButton");
                        throw null;
                    }
                    com.bumptech.glide.c.d0(gestaltIconButton);
                } else {
                    GestaltIconButton gestaltIconButton2 = this.f115481l1;
                    if (gestaltIconButton2 == null) {
                        Intrinsics.r("saveFromURLButton");
                        throw null;
                    }
                    com.bumptech.glide.c.u1(gestaltIconButton2);
                    bs1.c.R1(ideaPinDraftsButton, true);
                }
                GestaltIconButton gestaltIconButton3 = this.f115480k1;
                if (gestaltIconButton3 == null) {
                    Intrinsics.r("cameraButton");
                    throw null;
                }
                com.bumptech.glide.c.u1(gestaltIconButton3);
            } else {
                bs1.c.R1(ideaPinDraftsButton, false);
                GestaltIconButton gestaltIconButton4 = this.f115480k1;
                if (gestaltIconButton4 == null) {
                    Intrinsics.r("cameraButton");
                    throw null;
                }
                com.bumptech.glide.c.d0(gestaltIconButton4);
                GestaltIconButton gestaltIconButton5 = this.f115481l1;
                if (gestaltIconButton5 == null) {
                    Intrinsics.r("saveFromURLButton");
                    throw null;
                }
                com.bumptech.glide.c.d0(gestaltIconButton5);
            }
            v9(thumbnails.size() > 1);
        } else {
            GestaltText gestaltText = this.f115475f1;
            if (gestaltText == null) {
                Intrinsics.r("thumbnailTrayMessage");
                throw null;
            }
            gestaltText.i(new w1.g(thumbnails, 14));
        }
        ((pw0.c) this.f115490u1.getValue()).C(thumbnails);
    }
}
