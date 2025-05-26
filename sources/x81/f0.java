package x81;

import a.cb;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.lens.view.VirtualTryOnBottomSheetHeaderView;
import com.pinterest.feature.shopping.shoppingcomponents.ProductFilterPillLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.view.ExpandableView;
import h32.d4;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.s0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import net.quikkly.android.utils.BitmapUtils;
import rq.o2;
import so.oa;
import x02.i2;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u00052\u00020\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx81/f0;", "Lwk1/k;", "Ldl1/s;", "Lx81/v;", "Lnr0/j;", "Lx81/s;", "Lhb2/g;", "<init>", "()V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f0 extends a<dl1.s> implements v, s, hb2.g {

    /* renamed from: k2, reason: collision with root package name */
    public static final /* synthetic */ int f134193k2 = 0;
    public y81.h A1;
    public LinearLayout B1;
    public GestaltText C1;
    public GestaltIcon D1;
    public d91.h E1;
    public String F1;
    public String G1;
    public boolean J1;
    public int L1;
    public int M1;
    public FrameLayout O1;
    public VirtualTryOnBottomSheetHeaderView P1;
    public GestaltText Q1;
    public ContextWrapper R0;
    public LinearLayout R1;
    public x20.a S0;
    public LinearLayout S1;
    public a11.d T0;
    public u T1;
    public i2 U0;
    public a91.d U1;
    public nx.f0 V0;
    public boolean V1;
    public uk1.e W0;
    public ProductFilterPillLayout W1;
    public yk1.a X0;
    public o0 X1;
    public c91.e Y0;
    public nr0.m Z0;
    public de1.t Z1;

    /* renamed from: a1, reason: collision with root package name */
    public ny1.w f134194a1;

    /* renamed from: a2, reason: collision with root package name */
    public d f134195a2;

    /* renamed from: b1, reason: collision with root package name */
    public o0 f134196b1;

    /* renamed from: b2, reason: collision with root package name */
    public o0 f134197b2;

    /* renamed from: c1, reason: collision with root package name */
    public View f134198c1;

    /* renamed from: d1, reason: collision with root package name */
    public GestaltText f134200d1;
    public String d2;

    /* renamed from: e1, reason: collision with root package name */
    public View f134201e1;

    /* renamed from: e2, reason: collision with root package name */
    public o0 f134202e2;

    /* renamed from: f1, reason: collision with root package name */
    public GestaltText f134203f1;

    /* renamed from: f2, reason: collision with root package name */
    public g71.f f134204f2;

    /* renamed from: g1, reason: collision with root package name */
    public GestaltButton f134205g1;

    /* renamed from: i1, reason: collision with root package name */
    public GestaltIconButton f134209i1;

    /* renamed from: j1, reason: collision with root package name */
    public GestaltButton f134211j1;

    /* renamed from: k1, reason: collision with root package name */
    public WebImageView f134213k1;

    /* renamed from: l1, reason: collision with root package name */
    public FrameLayout f134214l1;

    /* renamed from: m1, reason: collision with root package name */
    public View f134215m1;

    /* renamed from: n1, reason: collision with root package name */
    public ExpandableView f134216n1;

    /* renamed from: o1, reason: collision with root package name */
    public FrameLayout f134217o1;

    /* renamed from: p1, reason: collision with root package name */
    public CoordinatorLayout f134218p1;

    /* renamed from: q1, reason: collision with root package name */
    public GestaltText f134219q1;

    /* renamed from: r1, reason: collision with root package name */
    public k f134220r1;

    /* renamed from: t1, reason: collision with root package name */
    public Integer f134222t1;

    /* renamed from: u1, reason: collision with root package name */
    public Integer f134223u1;

    /* renamed from: w1, reason: collision with root package name */
    public n81.a f134225w1;

    /* renamed from: x1, reason: collision with root package name */
    public AnimatorSet f134226x1;

    /* renamed from: y1, reason: collision with root package name */
    public ImageView f134227y1;

    /* renamed from: z1, reason: collision with root package name */
    public FrameLayout f134228z1;

    /* renamed from: h1, reason: collision with root package name */
    public kotlin.jvm.internal.s f134207h1 = y.f134298i;

    /* renamed from: s1, reason: collision with root package name */
    public ArrayList f134221s1 = new ArrayList();

    /* renamed from: v1, reason: collision with root package name */
    public final xk2.v f134224v1 = xk2.m.b(new z(this, 2));
    public int H1 = f42.i.LENS.getValue();
    public String I1 = "";
    public final float K1 = hf0.b.f69003c;
    public final xk2.v N1 = xk2.m.b(new z(this, 1));
    public final zd1.o Y1 = new zd1.o();

    /* renamed from: c2, reason: collision with root package name */
    public f42.c f134199c2 = f42.c.LIPCOLOR;

    /* renamed from: g2, reason: collision with root package name */
    public final b0 f134206g2 = new b0(this);

    /* renamed from: h2, reason: collision with root package name */
    public final d0 f134208h2 = new d0(this);

    /* renamed from: i2, reason: collision with root package name */
    public final d4 f134210i2 = d4.VIRTUAL_TRY_ON;

    /* renamed from: j2, reason: collision with root package name */
    public o f134212j2 = o.TRY_ON;

    public static boolean t9(View view, ViewGroup viewGroup) {
        return viewGroup != null && viewGroup.indexOfChild(view) == -1;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        f7().h(this.f134206g2);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        f7().j(this.f134206g2);
        super.L7();
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD, new z(this, 3));
        if (!this.J1) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE, new z(this, 4));
        }
        adapter.G(RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO, new com.pinterest.feature.search.results.view.b0(requireContext, 23));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY, new com.pinterest.feature.search.results.view.b0(requireContext, 24));
        o0 o0Var = this.f134202e2;
        if (o0Var != null) {
            adapter.G(25, new b01.c(27, this, o0Var));
        }
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        String g23 = navigation != null ? navigation.g2("com.pinterest.EXTRA_PIN_ID", "") : null;
        this.I1 = g23 != null ? g23 : "";
        this.J1 = navigation != null ? navigation.S("com.pinterest.EXTRA_IS_PROMOTED", false) : false;
        this.H1 = navigation != null ? navigation.q1(f42.i.LENS.getValue(), "com.pinterest.EXTRA_VIRTUAL_TRY_ON_SOURCE_TYPE") : f42.i.LENS.getValue();
        this.F1 = navigation != null ? navigation.v0("com.pinterest.EXTRA_SOURCE_QUERY") : null;
        this.G1 = navigation != null ? navigation.v0("com.pinterest.EXTRA_SKIN_TONE_FILTER") : null;
        this.d2 = navigation != null ? navigation.v0("com.pinterest.EXTRA_DEEPLINK_SELECTED_MAKEUP_CATEGORY") : null;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        de1.t w13;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        nx.f0 f0Var = this.V0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        bVar.g(new n(f0Var));
        i2 i2Var = this.U0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        ny1.d dVar = ny1.d.f92664f;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        boolean a14 = dVar.a(requireContext2);
        ny1.f fVar = ny1.f.f92666f;
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        boolean a15 = fVar.a(requireContext3);
        boolean p93 = p9();
        x20.a aVar = this.S0;
        if (aVar == null) {
            Intrinsics.r("tryOnService");
            throw null;
        }
        js0.c cVar = new js0.c(aVar);
        x20.a aVar2 = this.S0;
        if (aVar2 == null) {
            Intrinsics.r("tryOnService");
            throw null;
        }
        b91.b bVar2 = new b91.b(aVar2);
        sq0.f d2 = a13.d();
        String str = this.I1;
        int i13 = this.H1;
        String str2 = this.F1;
        String str3 = this.G1;
        boolean z13 = this.J1;
        i2 i2Var2 = this.U0;
        if (i2Var2 == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        c91.e eVar = this.Y0;
        if (eVar == null) {
            Intrinsics.r("onDemandModuleControllerFactory");
            throw null;
        }
        c91.f a16 = eVar.a(E4(), s7());
        nr0.m mVar = this.Z0;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        ContextWrapper contextWrapper = this.R0;
        if (contextWrapper == null) {
            Intrinsics.r("contextWrapper");
            throw null;
        }
        yk1.a aVar3 = this.X0;
        if (aVar3 == null) {
            Intrinsics.r("androidResources");
            throw null;
        }
        o0 o0Var = new o0(a13, a14, a15, p93, cVar, bVar2, d2, str, i13, str2, str3, this.Y1, z13, i2Var2, a16, mVar, new r81.p(contextWrapper, aVar3), getActiveUserManager());
        nx.f0 f0Var2 = this.V0;
        if (f0Var2 == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        uj2.q p73 = p7();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Resources.Theme theme = requireContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        w13 = kg.p.w(o0Var, this.Y1, f0Var2, this.f134210i2, p73, resources, theme, null);
        this.Z1 = w13;
        this.X1 = o0Var;
        this.f134202e2 = o0Var;
        this.f134197b2 = o0Var;
        o0Var.X3(this.d2);
        this.f134196b1 = o0Var;
        return o0Var;
    }

    @Override // sq0.e
    public final int X8() {
        return x.f134296a[this.f134212j2.ordinal()] == 1 ? getResources().getDimensionPixelSize(r0.margin_quarter) : super.X8();
    }

    @Override // sq0.e
    public final int Y8() {
        return 0;
    }

    @Override // sq0.e
    /* renamed from: a9 */
    public final String getE2() {
        return "lens";
    }

    @Override // yq0.t
    public final se0.c f8() {
        if (this.J1) {
            return null;
        }
        return this.f139735i0;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        u uVar = this.T1;
        if (com.bumptech.glide.d.o0(uVar != null ? Boolean.valueOf(((o0) uVar).N3()) : null)) {
            return true;
        }
        nl1.d.J7();
        return false;
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        int i13 = x.f134296a[this.f134212j2.ordinal()];
        if (i13 == 1) {
            return getResources().getInteger(uc2.e.lens_gallery_grid_cols);
        }
        if (i13 != 2) {
            return 1;
        }
        return getResources().getInteger(xb2.b.pin_grid_cols);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF52977d1() {
        return this.f134210i2;
    }

    public final void j9(ArrayList modelImageUrls) {
        Intrinsics.checkNotNullParameter(modelImageUrls, "modelImageUrls");
        int dimensionPixelSize = getResources().getDimensionPixelSize(uc2.b.tryon_image_menu_size);
        Iterator it = modelImageUrls.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            int i14 = i13 + 1;
            String str = (String) it.next();
            if (CollectionsKt.U(i13, this.f134221s1) == null) {
                this.f134221s1.add(i13, Integer.valueOf(View.generateViewId()));
            }
            ExpandableView expandableView = this.f134216n1;
            if (expandableView == null) {
                Intrinsics.r("expandableMenu");
                throw null;
            }
            WebImageView webImageView = new WebImageView(requireContext());
            Object obj = this.f134221s1.get(i13);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            webImageView.setId(((Number) obj).intValue());
            webImageView.setContentDescription(webImageView.getResources().getString(uc2.h.content_description_models, Integer.valueOf(i14)));
            float dimensionPixelSize2 = webImageView.getResources().getDimensionPixelSize(uc2.b.tryon_image_menu_radius);
            webImageView.g2(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 1;
            webImageView.setLayoutParams(layoutParams);
            webImageView.loadUrl(str);
            expandableView.addView(webImageView);
            i13 = i14;
        }
        Integer num = this.f134223u1;
        if (num != null) {
            int intValue = num.intValue();
            ExpandableView expandableView2 = this.f134216n1;
            if (expandableView2 != null) {
                expandableView2.c(intValue);
            } else {
                Intrinsics.r("expandableMenu");
                throw null;
            }
        }
    }

    public final void k9(s0 mode) {
        k kVar;
        k kVar2;
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (mode instanceof r) {
            ny1.d dVar = ny1.d.f92664f;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            if (!dVar.a(requireContext) || (kVar2 = this.f134220r1) == null) {
                return;
            }
            kVar2.loadMakeupEngineResourcesAndStartCamera();
            return;
        }
        if (mode instanceof q) {
            k kVar3 = this.f134220r1;
            if (kVar3 != null) {
                kVar3.loadMakeupEngineResourceWithPhoto(((q) mode).e1());
                return;
            }
            return;
        }
        if (!(mode instanceof p) || (kVar = this.f134220r1) == null) {
            return;
        }
        kVar.loadMakeupEngineResourceWithPhoto(((p) mode).e1());
    }

    public final ca2.e l9() {
        return (ca2.e) this.N1.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(uc2.f.fragment_virtual_try_on, uc2.d.bottom_sheet_recycler_view);
        eVar.b(uc2.d.bottom_sheet_loading_layout);
        return eVar;
    }

    public final ny1.w m9() {
        ny1.w wVar = this.f134194a1;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("permissionsManager");
        throw null;
    }

    public final void n9() {
        FrameLayout frameLayout = this.f134214l1;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        } else {
            Intrinsics.r("imagePreviewContainer");
            throw null;
        }
    }

    public final void o9() {
        View view = this.f134198c1;
        if (view == null) {
            Intrinsics.r("missingCameraPermissionContainer");
            throw null;
        }
        bs1.c.X0(view);
        View view2 = this.f134201e1;
        if (view2 == null) {
            Intrinsics.r("missingPermissionContainer");
            throw null;
        }
        bs1.c.X0(view2);
        GestaltText gestaltText = this.f134219q1;
        if (gestaltText != null) {
            pk.a0.w1(gestaltText);
        } else {
            Intrinsics.r("overlayTextView");
            throw null;
        }
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(uc2.d.fragment_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f134218p1 = (CoordinatorLayout) findViewById;
        View findViewById2 = onCreateView.findViewById(uc2.d.camera_root_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f134217o1 = (FrameLayout) findViewById2;
        View findViewById3 = onCreateView.findViewById(uc2.d.expandable_options_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f134216n1 = (ExpandableView) findViewById3;
        xk2.v vVar = this.f134224v1;
        Integer valueOf = Integer.valueOf(bundle != null ? bundle.getInt("currentMenuOptionView", ((Number) vVar.getValue()).intValue()) : ((Number) vVar.getValue()).intValue());
        this.f134222t1 = this.f134223u1;
        this.f134223u1 = valueOf;
        ArrayList<Integer> integerArrayList = bundle != null ? bundle.getIntegerArrayList("currentMenuOptionViewIds") : null;
        if (integerArrayList == null) {
            integerArrayList = new ArrayList<>();
        }
        this.f134221s1 = integerArrayList;
        ExpandableView expandableView = this.f134216n1;
        if (expandableView == null) {
            Intrinsics.r("expandableMenu");
            throw null;
        }
        expandableView.e();
        Integer num = this.f134223u1;
        if (num != null) {
            expandableView.c(num.intValue());
        }
        expandableView.d(this);
        bs1.c.U1(expandableView);
        View findViewById4 = onCreateView.findViewById(uc2.d.missing_permission_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f134201e1 = findViewById4;
        View findViewById5 = onCreateView.findViewById(uc2.d.missing_permission_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f134203f1 = (GestaltText) findViewById5;
        final int i13 = 0;
        this.f134205g1 = ((GestaltButton) onCreateView.findViewById(uc2.d.missing_permission_btn)).d(c0.f134170j).e(new gm1.a(this) { // from class: x81.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f134295b;

            {
                this.f134295b = this;
            }

            /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                f0 this$0 = this.f134295b;
                switch (i14) {
                    case 0:
                        int i15 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f134207h1.invoke();
                        break;
                    case 1:
                        int i16 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s9(true);
                        break;
                    case 2:
                        int i17 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar = this$0.T1;
                        if (uVar != null) {
                            ((o0) uVar).R3();
                            break;
                        }
                        break;
                    case 3:
                        int i18 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i19 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar2 = this$0.T1;
                        if (uVar2 != null) {
                            ha2.a configuration = ((o0) uVar2).w3();
                            Intrinsics.checkNotNullParameter(configuration, "configuration");
                            this$0.f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById6 = onCreateView.findViewById(uc2.d.makeup_shade_name_text);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f134219q1 = (GestaltText) findViewById6;
        View findViewById7 = onCreateView.findViewById(uc2.d.missing_camera_permission_container);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f134198c1 = findViewById7;
        View findViewById8 = onCreateView.findViewById(uc2.d.missing_camera_permission_title);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById8;
        if (gestaltText == null) {
            Intrinsics.r("missingCameraPermissionTitle");
            throw null;
        }
        String string = onCreateView.getResources().getString(uc2.h.try_on_permissions_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pk.a0.p(gestaltText, string);
        View findViewById9 = onCreateView.findViewById(uc2.d.missing_camera_permission_text);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f134200d1 = (GestaltText) findViewById9;
        final int i14 = 1;
        ((GestaltButton) onCreateView.findViewById(uc2.d.missing_camera_permission_btn)).d(c0.f134171k).e(new gm1.a(this) { // from class: x81.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f134295b;

            {
                this.f134295b = this;
            }

            /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                f0 this$0 = this.f134295b;
                switch (i142) {
                    case 0:
                        int i15 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f134207h1.invoke();
                        break;
                    case 1:
                        int i16 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s9(true);
                        break;
                    case 2:
                        int i17 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar = this$0.T1;
                        if (uVar != null) {
                            ((o0) uVar).R3();
                            break;
                        }
                        break;
                    case 3:
                        int i18 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i19 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar2 = this$0.T1;
                        if (uVar2 != null) {
                            ha2.a configuration = ((o0) uVar2).w3();
                            Intrinsics.checkNotNullParameter(configuration, "configuration");
                            this$0.f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 2;
        this.f134211j1 = ((GestaltButton) onCreateView.findViewById(uc2.d.save_pinit_bt)).d(c0.f134172l).e(new gm1.a(this) { // from class: x81.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f134295b;

            {
                this.f134295b = this;
            }

            /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                f0 this$0 = this.f134295b;
                switch (i142) {
                    case 0:
                        int i152 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f134207h1.invoke();
                        break;
                    case 1:
                        int i16 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s9(true);
                        break;
                    case 2:
                        int i17 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar = this$0.T1;
                        if (uVar != null) {
                            ((o0) uVar).R3();
                            break;
                        }
                        break;
                    case 3:
                        int i18 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i19 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar2 = this$0.T1;
                        if (uVar2 != null) {
                            ha2.a configuration = ((o0) uVar2).w3();
                            Intrinsics.checkNotNullParameter(configuration, "configuration");
                            this$0.f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById10 = onCreateView.findViewById(uc2.d.vto_photo_view);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f134213k1 = (WebImageView) findViewById10;
        View findViewById11 = onCreateView.findViewById(uc2.d.image_preview_container);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f134214l1 = (FrameLayout) findViewById11;
        WebImageView webImageView = this.f134213k1;
        if (webImageView == null) {
            Intrinsics.r("imagePreview");
            throw null;
        }
        webImageView.Y(new oq.i(this, 12));
        View findViewById12 = onCreateView.findViewById(uc2.d.lens_black_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f134215m1 = findViewById12;
        View findViewById13 = onCreateView.findViewById(uc2.d.navigation_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById13;
        this.f134209i1 = gestaltIconButton;
        if (gestaltIconButton == null) {
            Intrinsics.r("navigationButton");
            throw null;
        }
        final int i16 = 3;
        gestaltIconButton.u(new gm1.a(this) { // from class: x81.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f134295b;

            {
                this.f134295b = this;
            }

            /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i16;
                f0 this$0 = this.f134295b;
                switch (i142) {
                    case 0:
                        int i152 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f134207h1.invoke();
                        break;
                    case 1:
                        int i162 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s9(true);
                        break;
                    case 2:
                        int i17 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar = this$0.T1;
                        if (uVar != null) {
                            ((o0) uVar).R3();
                            break;
                        }
                        break;
                    case 3:
                        int i18 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i19 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar2 = this$0.T1;
                        if (uVar2 != null) {
                            ha2.a configuration = ((o0) uVar2).w3();
                            Intrinsics.checkNotNullParameter(configuration, "configuration");
                            this$0.f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById14 = onCreateView.findViewById(uc2.d.makeup_carousel_container);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.f134228z1 = (FrameLayout) findViewById14;
        View findViewById15 = onCreateView.findViewById(uc2.d.shutter_outer);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.f134227y1 = (ImageView) findViewById15;
        View findViewById16 = onCreateView.findViewById(uc2.d.empty_swatch_text_container);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.B1 = (LinearLayout) findViewById16;
        View findViewById17 = onCreateView.findViewById(uc2.d.empty_swatch_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.C1 = (GestaltText) findViewById17;
        View findViewById18 = onCreateView.findViewById(uc2.d.empty_swatch_icon_view);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        this.D1 = (GestaltIcon) findViewById18;
        View findViewById19 = onCreateView.findViewById(uc2.d.filter_button_container);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        ProductFilterPillLayout productFilterPillLayout = (ProductFilterPillLayout) findViewById19;
        this.W1 = productFilterPillLayout;
        if (productFilterPillLayout == null) {
            Intrinsics.r("filterButtonContainer");
            throw null;
        }
        productFilterPillLayout.d(this.X1);
        View findViewById20 = onCreateView.findViewById(uc2.d.bottom_sheet_loading_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        l9().m(onCreateView.findViewById(uc2.d.bottom_sheet_with_grid));
        View findViewById21 = onCreateView.findViewById(uc2.d.header_placeholder_view);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.O1 = (FrameLayout) findViewById21;
        l9().x((int) this.K1);
        this.Q1 = (GestaltText) onCreateView.findViewById(uc2.d.top_bottom_sheet_title);
        this.R1 = (LinearLayout) onCreateView.findViewById(uc2.d.bottom_sheet_container);
        View findViewById22 = onCreateView.findViewById(uc2.d.partial_photo_info);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.S1 = (LinearLayout) findViewById22;
        final int i17 = 4;
        ((GestaltButton) onCreateView.findViewById(uc2.d.partial_photo_info_btn)).e(new gm1.a(this) { // from class: x81.w

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f134295b;

            {
                this.f134295b = this;
            }

            /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.s] */
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i17;
                f0 this$0 = this.f134295b;
                switch (i142) {
                    case 0:
                        int i152 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f134207h1.invoke();
                        break;
                    case 1:
                        int i162 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.s9(true);
                        break;
                    case 2:
                        int i172 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar = this$0.T1;
                        if (uVar != null) {
                            ((o0) uVar).R3();
                            break;
                        }
                        break;
                    case 3:
                        int i18 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i19 = f0.f134193k2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        u uVar2 = this$0.T1;
                        if (uVar2 != null) {
                            ha2.a configuration = ((o0) uVar2).w3();
                            Intrinsics.checkNotNullParameter(configuration, "configuration");
                            this$0.f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
                            break;
                        }
                        break;
                }
            }
        });
        if (onCreateView.getContext() != null) {
            Context context = onCreateView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f134225w1 = new n81.a(context);
        }
        int dimensionPixelSize = (onCreateView.getResources().getDimensionPixelSize(eo1.c.margin) * 2) + onCreateView.getResources().getDimensionPixelSize(k42.b.product_card_pin_image_width_height);
        this.L1 = dimensionPixelSize;
        int dimensionPixelSize2 = onCreateView.getResources().getDimensionPixelSize(eo1.c.margin) + (dimensionPixelSize - onCreateView.getResources().getDimensionPixelSize(uc2.b.lens_15_camera_controls_margin));
        this.M1 = dimensionPixelSize2;
        ProductFilterPillLayout productFilterPillLayout2 = this.W1;
        if (productFilterPillLayout2 == null) {
            Intrinsics.r("filterButtonContainer");
            throw null;
        }
        productFilterPillLayout2.setTranslationY(-dimensionPixelSize2);
        GestaltText gestaltText2 = this.f134203f1;
        if (gestaltText2 == null) {
            Intrinsics.r("missingPermissionText");
            throw null;
        }
        gestaltText2.setTranslationY(-(this.M1 - onCreateView.getResources().getDimensionPixelSize(eo1.c.margin)));
        GestaltButton gestaltButton = this.f134205g1;
        if (gestaltButton != null) {
            gestaltButton.setTranslationY(-(this.M1 - onCreateView.getResources().getDimensionPixelSize(eo1.c.margin)));
            return onCreateView;
        }
        Intrinsics.r("missingPermissionButton");
        throw null;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.T1 = null;
        l9().l();
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        k kVar = this.f134220r1;
        if (kVar != null) {
            kVar.pauseCamera();
        }
        pe.i.p1(this, this.V1, 2);
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.V1 = false;
        pe.i.Y0(this);
        u uVar = this.T1;
        if (uVar != null) {
            ((o0) uVar).K3();
        }
        u uVar2 = this.T1;
        if (uVar2 != null) {
            ny1.f fVar = ny1.f.f92666f;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ((o0) uVar2).Q3(fVar.a(requireContext), p9());
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Integer num = this.f134223u1;
        if (num != null) {
            outState.putInt("currentMenuOptionView", num.intValue());
        }
        outState.putIntegerArrayList("currentMenuOptionViewIds", this.f134221s1);
    }

    public final boolean p9() {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        ny1.m mVar = ny1.m.f92673f;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return mVar.a(requireContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q9(View v13) {
        Intrinsics.checkNotNullParameter(v13, "v");
        ExpandableView expandableView = this.f134216n1;
        if (expandableView == null) {
            Intrinsics.r("expandableMenu");
            throw null;
        }
        if (!Intrinsics.d(expandableView.b(), v13) || v13.getId() == uc2.d.vto_photo_icon) {
            int id3 = v13.getId();
            if (id3 == uc2.d.vto_camera_icon) {
                s7().X(u0.VIRTUAL_TRY_ON_CAMERA_ICON);
                u uVar = this.T1;
                if (uVar != null) {
                    ((o0) uVar).f4(r.f134293b);
                }
            } else if (id3 == uc2.d.vto_photo_icon) {
                s7().X(u0.VIRTUAL_TRY_ON_GALLERY_ICON);
                u uVar2 = this.T1;
                if (uVar2 != null) {
                    ((o0) uVar2).U3();
                }
            } else {
                s7().X(u0.VIRTUAL_TRY_ON_MODEL_ICON);
                Drawable drawable = ((eo.d) v13).getDrawable();
                Intrinsics.g(drawable, "null cannot be cast to non-null type com.makeramen.RoundedDrawable");
                eo.c cVar = (eo.c) drawable;
                u uVar3 = this.T1;
                if (uVar3 != null) {
                    Bitmap bitmap = cVar.f59714g;
                    Intrinsics.f(bitmap);
                    ((o0) uVar3).f4(new p(bitmap));
                }
            }
            Integer valueOf = Integer.valueOf(v13.getId());
            this.f134222t1 = this.f134223u1;
            this.f134223u1 = valueOf;
        }
    }

    public final void r9() {
        y81.h hVar = this.A1;
        ViewParent parent = hVar != null ? hVar.getParent() : null;
        FrameLayout frameLayout = this.f134228z1;
        if (frameLayout == null) {
            Intrinsics.r("makeupCarouselContainer");
            throw null;
        }
        if (Intrinsics.d(parent, frameLayout)) {
            FrameLayout frameLayout2 = this.f134228z1;
            if (frameLayout2 != null) {
                frameLayout2.removeView(this.A1);
            } else {
                Intrinsics.r("makeupCarouselContainer");
                throw null;
            }
        }
    }

    public final void s9(boolean z13) {
        ny1.w m93 = m9();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        m93.c(requireActivity, ny1.d.f92664f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : new e0(z13, this, 0), (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : new z(this, 5), (r23 & 1024) != 0 ? ny1.t.f92703n : null);
    }

    public final void u9(t permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        GestaltText gestaltText = this.f134219q1;
        if (gestaltText == null) {
            Intrinsics.r("overlayTextView");
            throw null;
        }
        pk.a0.k0(gestaltText);
        int i13 = x.f134297b[permission.ordinal()];
        if (i13 == 1) {
            s7().h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.LENS_PERMISSION_OVERLAY, (r18 & 4) != 0 ? null : h32.g0.CAMERA_PERMISSIONS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            GestaltText gestaltText2 = this.f134203f1;
            if (gestaltText2 == null) {
                Intrinsics.r("missingPermissionText");
                throw null;
            }
            String string = getResources().getString(uc2.h.ar_try_on_camera_permission_text);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            pk.a0.p(gestaltText2, string);
            GestaltButton gestaltButton = this.f134205g1;
            if (gestaltButton == null) {
                Intrinsics.r("missingPermissionButton");
                throw null;
            }
            gestaltButton.d(c0.f134173m);
            this.f134207h1 = new z(this, 10);
            View view = this.f134201e1;
            if (view == null) {
                Intrinsics.r("missingPermissionContainer");
                throw null;
            }
            view.setBackgroundResource(eo1.d.drawable_black_900);
        } else if (i13 == 2) {
            s7().h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.LENS_PERMISSION_OVERLAY, (r18 & 4) != 0 ? null : h32.g0.PHOTO_LIBRARY_PERMISSIONS, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            GestaltText gestaltText3 = this.f134203f1;
            if (gestaltText3 == null) {
                Intrinsics.r("missingPermissionText");
                throw null;
            }
            String string2 = getResources().getString(uc2.h.ar_try_on_gallery_permission_text);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            pk.a0.p(gestaltText3, string2);
            GestaltButton gestaltButton2 = this.f134205g1;
            if (gestaltButton2 == null) {
                Intrinsics.r("missingPermissionButton");
                throw null;
            }
            gestaltButton2.d(c0.f134174n);
            this.f134207h1 = new z(this, 11);
            View view2 = this.f134201e1;
            if (view2 == null) {
                Intrinsics.r("missingPermissionContainer");
                throw null;
            }
            view2.setBackgroundResource(eo1.d.drawable_black_900);
        } else if (i13 == 3) {
            s7().h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.VIRTUAL_TRY_ON_NO_FACE_DETECTED_OVERLAY, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            GestaltText gestaltText4 = this.f134203f1;
            if (gestaltText4 == null) {
                Intrinsics.r("missingPermissionText");
                throw null;
            }
            String string3 = getResources().getString(uc2.h.ar_try_on_face_not_detected_text);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            pk.a0.p(gestaltText4, string3);
            GestaltButton gestaltButton3 = this.f134205g1;
            if (gestaltButton3 == null) {
                Intrinsics.r("missingPermissionButton");
                throw null;
            }
            gestaltButton3.d(c0.f134175o);
            this.f134207h1 = new z(this, 12);
            View view3 = this.f134201e1;
            if (view3 == null) {
                Intrinsics.r("missingPermissionContainer");
                throw null;
            }
            view3.setBackgroundResource(eo1.d.black900_40_background);
        }
        View view4 = this.f134201e1;
        if (view4 != null) {
            bs1.c.U1(view4);
        } else {
            Intrinsics.r("missingPermissionContainer");
            throw null;
        }
    }

    @Override // jl1.a, com.pinterest.framework.screens.m
    public final void unbind() {
        f7().j(this.f134208h2);
        super.unbind();
    }

    public final void v9(boolean z13) {
        GestaltText gestaltText = this.f134219q1;
        if (gestaltText == null) {
            Intrinsics.r("overlayTextView");
            throw null;
        }
        gestaltText.setY((this.K1 - this.L1) / 2);
        ca2.e l93 = l9();
        l93.n(this.L1);
        l93.o(this.L1);
        BottomSheetBehavior d2 = l93.d();
        int i13 = 1;
        if (d2 != null) {
            d2.R(!this.J1);
        }
        if (z13) {
            FrameLayout frameLayout = this.f134228z1;
            if (frameLayout != null) {
                frameLayout.postDelayed(new s81.g(this, i13), 300L);
                return;
            } else {
                Intrinsics.r("makeupCarouselContainer");
                throw null;
            }
        }
        ca2.e.w(l9(), this.L1, null, null, null, 14);
        FrameLayout frameLayout2 = this.f134228z1;
        if (frameLayout2 == null) {
            Intrinsics.r("makeupCarouselContainer");
            throw null;
        }
        frameLayout2.setY(-this.M1);
        ImageView imageView = this.f134227y1;
        if (imageView != null) {
            imageView.setY(-this.M1);
        } else {
            Intrinsics.r("shutterOuter");
            throw null;
        }
    }

    public final void w9(boolean z13) {
        ProductFilterPillLayout productFilterPillLayout = this.W1;
        if (productFilterPillLayout != null) {
            bs1.c.R1(productFilterPillLayout, z13);
        } else {
            Intrinsics.r("filterButtonContainer");
            throw null;
        }
    }

    public final void x9(boolean z13) {
        ExpandableView expandableView = this.f134216n1;
        if (expandableView != null) {
            bs1.c.R1(expandableView, z13);
        } else {
            Intrinsics.r("expandableMenu");
            throw null;
        }
    }

    public final void y9(boolean z13) {
        if (getContext() != null) {
            rm1.q qVar = z13 ? rm1.q.ARROW_BACK : rm1.q.CANCEL;
            GestaltIconButton gestaltIconButton = this.f134209i1;
            if (gestaltIconButton != null) {
                gestaltIconButton.t(new o2(qVar, 19));
            } else {
                Intrinsics.r("navigationButton");
                throw null;
            }
        }
    }

    public final void z9(boolean z13) {
        GestaltButton gestaltButton = this.f134211j1;
        if (gestaltButton != null) {
            gestaltButton.d(new u81.h(z13, 3));
        } else {
            Intrinsics.r("saveButton");
            throw null;
        }
    }
}
