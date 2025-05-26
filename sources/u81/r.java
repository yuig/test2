package u81;

import a.cb;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.education.view.EducationPulsarView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.lens.view.LensBottomControlsContainer;
import com.pinterest.feature.search.visual.lens.view.RoomRepaintInfoView;
import com.pinterest.feature.search.visual.lens.view.RoomStylePickerView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.view.TopBottomGradientView;
import h32.a4;
import h32.d4;
import h32.u0;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lh0.f4;
import lh0.o4;
import m60.g0;
import m60.r0;
import m60.t0;
import net.quikkly.android.utils.BitmapUtils;
import rc0.x0;
import so.oa;
import x02.i2;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u0005:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lu81/r;", "Lwk1/k;", "Ldl1/s;", "Lm81/q;", "Lnr0/j;", "Lg81/a;", "<init>", "()V", "kg/p", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class r extends a<dl1.s> implements m81.q, g81.a {

    /* renamed from: l2, reason: collision with root package name */
    public static final /* synthetic */ int f121059l2 = 0;
    public FrameLayout A1;
    public da2.g B1;
    public xd1.e C1;
    public s81.p D1;
    public n81.a E1;
    public FrameLayout F1;
    public LensBottomControlsContainer G1;
    public CoordinatorLayout H1;
    public i I1;
    public q81.a J1;
    public int L1;
    public final float N1;
    public final int O1;
    public int P1;
    public final xk2.v Q1;
    public ContextWrapper R0;
    public LinearLayout R1;
    public o4 S0;
    public LinearLayout S1;
    public yk1.a T0;
    public GestaltText T1;
    public hf0.c U0;
    public GestaltText U1;
    public g0 V0;
    public GestaltButton V1;
    public o81.a W0;
    public eb2.c W1;
    public c91.e X0;
    public m81.r X1;
    public i2 Y0;
    public final xk2.v Y1;
    public nx.f0 Z0;
    public final xk2.k Z1;

    /* renamed from: a1, reason: collision with root package name */
    public uk1.e f121060a1;

    /* renamed from: a2, reason: collision with root package name */
    public mr.a f121061a2;

    /* renamed from: b1, reason: collision with root package name */
    public nr0.m f121062b1;

    /* renamed from: b2, reason: collision with root package name */
    public EducationPulsarView f121063b2;

    /* renamed from: c1, reason: collision with root package name */
    public ny1.w f121064c1;

    /* renamed from: c2, reason: collision with root package name */
    public final xk2.v f121065c2;

    /* renamed from: d1, reason: collision with root package name */
    public ll.j f121066d1;
    public final xk2.v d2;

    /* renamed from: e1, reason: collision with root package name */
    public b60.b f121067e1;

    /* renamed from: e2, reason: collision with root package name */
    public GestaltIconButton f121068e2;

    /* renamed from: f1, reason: collision with root package name */
    public b0 f121069f1;

    /* renamed from: f2, reason: collision with root package name */
    public float f121070f2;

    /* renamed from: g1, reason: collision with root package name */
    public f4 f121071g1;

    /* renamed from: g2, reason: collision with root package name */
    public s81.p f121072g2;

    /* renamed from: h1, reason: collision with root package name */
    public lb0.r f121073h1;

    /* renamed from: h2, reason: collision with root package name */
    public h81.c f121074h2;

    /* renamed from: i1, reason: collision with root package name */
    public es.h f121075i1;

    /* renamed from: i2, reason: collision with root package name */
    public s81.p f121076i2;

    /* renamed from: j1, reason: collision with root package name */
    public es.a f121077j1;

    /* renamed from: j2, reason: collision with root package name */
    public final d4 f121078j2;

    /* renamed from: k2, reason: collision with root package name */
    public m81.g f121080k2;

    /* renamed from: m1, reason: collision with root package name */
    public RoomStylePickerView f121082m1;

    /* renamed from: n1, reason: collision with root package name */
    public RoomRepaintInfoView f121083n1;

    /* renamed from: o1, reason: collision with root package name */
    public View f121084o1;

    /* renamed from: p1, reason: collision with root package name */
    public GestaltText f121085p1;

    /* renamed from: q1, reason: collision with root package name */
    public GestaltText f121086q1;

    /* renamed from: r1, reason: collision with root package name */
    public GestaltButton f121087r1;

    /* renamed from: s1, reason: collision with root package name */
    public boolean f121088s1;

    /* renamed from: u1, reason: collision with root package name */
    public GestaltIconButton f121090u1;

    /* renamed from: v1, reason: collision with root package name */
    public ViewGroup f121091v1;

    /* renamed from: w1, reason: collision with root package name */
    public WebImageView f121092w1;

    /* renamed from: x1, reason: collision with root package name */
    public com.pinterest.feature.search.visual.cropper.n f121093x1;

    /* renamed from: y1, reason: collision with root package name */
    public FrameLayout f121094y1;

    /* renamed from: z1, reason: collision with root package name */
    public TopBottomGradientView f121095z1;

    /* renamed from: k1, reason: collision with root package name */
    public final a61.b f121079k1 = new a61.b(this);

    /* renamed from: l1, reason: collision with root package name */
    public final xk2.v f121081l1 = xk2.m.b(new n(this, 3));

    /* renamed from: t1, reason: collision with root package name */
    public final xk2.v f121089t1 = xk2.m.b(new n(this, 15));
    public final xk2.v K1 = xk2.m.b(new n(this, 12));
    public final float M1 = hf0.b.f69002b;

    public r() {
        float f13 = hf0.b.f69003c;
        this.N1 = f13;
        this.O1 = (int) (f13 / 3);
        this.P1 = (int) f13;
        this.Q1 = xk2.m.b(new n(this, 1));
        this.Y1 = xk2.m.b(new n(this, 14));
        this.Z1 = xk2.m.a(xk2.n.NONE, new n(this, 2));
        this.f121065c2 = xk2.m.b(new n(this, 16));
        this.d2 = xk2.m.b(new n(this, 13));
        this.f121078j2 = d4.FLASHLIGHT_CAMERA;
        this.f121080k2 = m81.g.NONE;
    }

    public final void A9(rm1.q icon, om1.f style, om1.e size) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(size, "size");
        GestaltIconButton gestaltIconButton = this.f121068e2;
        if (gestaltIconButton != null) {
            gestaltIconButton.t(new x0(2, size, style, icon));
        }
    }

    public final void B9(float f13) {
        LensBottomControlsContainer lensBottomControlsContainer = this.G1;
        if (lensBottomControlsContainer != null) {
            lensBottomControlsContainer.getF48049d().setAlpha(f13);
        } else {
            Intrinsics.r("bottomContainer");
            throw null;
        }
    }

    public final void C9() {
        if (((Boolean) this.K1.getValue()).booleanValue()) {
            q81.a aVar = this.J1;
            if (aVar != null) {
                FrameLayout frameLayout = this.F1;
                if (frameLayout == null) {
                    Intrinsics.r("cameraRootContainer");
                    throw null;
                }
                if (frameLayout.indexOfChild(aVar) == -1) {
                    this.J1 = null;
                }
            }
            q81.a aVar2 = this.J1;
            if (aVar2 == null) {
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                aVar2 = new q81.a(requireContext, requireActivity, q9());
                this.J1 = aVar2;
                FrameLayout frameLayout2 = this.F1;
                if (frameLayout2 == null) {
                    Intrinsics.r("cameraRootContainer");
                    throw null;
                }
                frameLayout2.addView(aVar2);
                nx.f0 f0Var = this.Z0;
                if (f0Var == null) {
                    Intrinsics.r("pinalyticsFactory");
                    throw null;
                }
                uk1.d dVar = new uk1.d(f0Var);
                FragmentActivity requireActivity2 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                m81.d dVar2 = new m81.d(dVar, requireActivity2, this.f121076i2, p7());
                aVar2.a().o(dVar2);
                yk1.j.a().d(aVar2, dVar2);
            }
            if (bs1.c.o1(aVar2)) {
                return;
            }
            aVar2.e();
            aVar2.setVisibility(0);
            return;
        }
        i iVar = this.I1;
        if (iVar != null) {
            FrameLayout frameLayout3 = this.F1;
            if (frameLayout3 == null) {
                Intrinsics.r("cameraRootContainer");
                throw null;
            }
            if (frameLayout3.indexOfChild(iVar) == -1) {
                this.I1 = null;
            }
        }
        i iVar2 = this.I1;
        if (iVar2 == null) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            boolean q93 = q9();
            m81.r rVar = this.X1;
            ll.j jVar = this.f121066d1;
            if (jVar == null) {
                Intrinsics.r("pincodesUtil");
                throw null;
            }
            iVar2 = new i(requireContext2, q93, rVar, jVar);
            this.I1 = iVar2;
            FrameLayout frameLayout4 = this.F1;
            if (frameLayout4 == null) {
                Intrinsics.r("cameraRootContainer");
                throw null;
            }
            frameLayout4.addView(iVar2);
            hf0.c cVar = this.U0;
            if (cVar == null) {
                Intrinsics.r("deviceInfoProvider");
                throw null;
            }
            uk1.e eVar = this.f121060a1;
            if (eVar == null) {
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            }
            yk1.j.a().d(iVar2, new s81.b(cVar, ((uk1.a) eVar).f(s7(), ""), p7(), this.f121076i2));
        }
        if (bs1.c.o1(iVar2)) {
            return;
        }
        iVar2.i();
        iVar2.setVisibility(0);
    }

    public final void D9(Uri imageUri) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        WebImageView webImageView = this.f121092w1;
        if (webImageView != null) {
            webImageView.w2(imageUri);
        } else {
            Intrinsics.r("imagePreview");
            throw null;
        }
    }

    public final void E9(Float f13) {
        ca2.e l93 = l9();
        int i13 = this.O1;
        l93.n(i13);
        l93.o(this.L1);
        FrameLayout frameLayout = this.f121094y1;
        if (frameLayout == null) {
            Intrinsics.r("imagePreviewContainer");
            throw null;
        }
        if (bs1.c.o1(frameLayout) && f13 != null) {
            float floatValue = f13.floatValue();
            float f14 = this.N1;
            if (floatValue < f14 - i13) {
                l93.n((int) (f14 - floatValue));
            }
        }
        BottomSheetBehavior d2 = l93.d();
        if (d2 == null || d2.M() != 3) {
            ca2.e.w(l93, l93.f(), new np.f(this, 5), null, null, 12);
        } else {
            l93.v("initial_slide_up");
        }
    }

    public final void F9() {
        if (getContext() != null) {
            rm1.q qVar = rm1.q.ARROW_BACK;
            GestaltIconButton gestaltIconButton = this.f121090u1;
            if (gestaltIconButton != null) {
                gestaltIconButton.t(new g(qVar, 1));
            } else {
                Intrinsics.r("navigationButton");
                throw null;
            }
        }
    }

    public final void G9(boolean z13) {
        if (z13) {
            GestaltIconButton gestaltIconButton = this.f121090u1;
            if (gestaltIconButton != null) {
                com.bumptech.glide.c.u1(gestaltIconButton);
                return;
            } else {
                Intrinsics.r("navigationButton");
                throw null;
            }
        }
        GestaltIconButton gestaltIconButton2 = this.f121090u1;
        if (gestaltIconButton2 != null) {
            com.bumptech.glide.c.d0(gestaltIconButton2);
        } else {
            Intrinsics.r("navigationButton");
            throw null;
        }
    }

    public final void H9(boolean z13) {
        LensBottomControlsContainer lensBottomControlsContainer = this.G1;
        if (lensBottomControlsContainer != null) {
            bs1.c.R1(lensBottomControlsContainer.getF48047b(), z13);
        } else {
            Intrinsics.r("bottomContainer");
            throw null;
        }
    }

    public final void I9(boolean z13) {
        GestaltIconButton gestaltIconButton = this.f121068e2;
        if (gestaltIconButton == null) {
            return;
        }
        gestaltIconButton.setVisibility(z13 ? 0 : 8);
    }

    public final void J9(boolean z13) {
        LensBottomControlsContainer lensBottomControlsContainer = this.G1;
        if (lensBottomControlsContainer != null) {
            bs1.c.R1(lensBottomControlsContainer.getF48050e(), z13);
        } else {
            Intrinsics.r("bottomContainer");
            throw null;
        }
    }

    @Override // g81.a
    public final void K1(RectF dotBounds, double d2, double d13, double d14, double d15, boolean z13, boolean z14, String str) {
        Intrinsics.checkNotNullParameter(dotBounds, "dotBounds");
        com.pinterest.feature.search.visual.cropper.n nVar = this.f121093x1;
        if (nVar != null) {
            nVar.b();
            nVar.j(dotBounds);
        }
        m81.r rVar = this.X1;
        if (rVar != null) {
            ((s81.p) rVar).Q3(d2, d13, d14, d15, z14);
        }
    }

    public final void K9(boolean z13) {
        i iVar = this.I1;
        bs1.c.R1(iVar != null ? iVar.b() : null, z13 && m9() != m81.p.ROOM_REPAINT);
    }

    public final void L9(boolean z13) {
        ViewGroup viewGroup = this.f121091v1;
        if (viewGroup != null) {
            viewGroup.setVisibility(z13 ? 0 : 8);
        } else {
            Intrinsics.r("imageActionContainer");
            throw null;
        }
    }

    public final void M9(boolean z13) {
        EducationPulsarView educationPulsarView = this.f121063b2;
        if (educationPulsarView == null) {
            Intrinsics.r("pulsar");
            throw null;
        }
        bs1.c.R1(educationPulsarView, z13);
        if (z13) {
            EducationPulsarView educationPulsarView2 = this.f121063b2;
            if (educationPulsarView2 != null) {
                educationPulsarView2.a();
            } else {
                Intrinsics.r("pulsar");
                throw null;
            }
        }
    }

    public final void N9(boolean z13) {
        if (q9()) {
            LensBottomControlsContainer lensBottomControlsContainer = this.G1;
            if (lensBottomControlsContainer != null) {
                bs1.c.R1(lensBottomControlsContainer.getF48051f(), z13);
            } else {
                Intrinsics.r("bottomContainer");
                throw null;
            }
        }
    }

    public final void O9(boolean z13) {
        if (z13) {
            LinearLayout linearLayout = this.R1;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            } else {
                Intrinsics.r("partialGalleryPermissionInfo");
                throw null;
            }
        }
        LinearLayout linearLayout2 = this.R1;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        } else {
            Intrinsics.r("partialGalleryPermissionInfo");
            throw null;
        }
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO, new p(requireContext, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY, new p(requireContext, 1));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY, new p(requireContext, 2));
    }

    @Override // sq0.e
    public final qa2.n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        qa2.n T8 = super.T8(pinActionHandler);
        T8.f103320a.f128795s = ((Boolean) this.d2.getValue()).booleanValue();
        return T8;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        nx.f0 f0Var = this.Z0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        bVar.g(new s71.q(m9() == m81.p.ROOM_REPAINT ? com.bumptech.glide.d.Z(this, "extra_room_repaint_source", "") : "", f0Var, getR0()));
        i2 i2Var = this.Y0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        ContextWrapper contextWrapper = this.R0;
        if (contextWrapper == null) {
            Intrinsics.r("contextWrapper");
            throw null;
        }
        yk1.a aVar = this.T0;
        if (aVar == null) {
            Intrinsics.r("androidResources");
            throw null;
        }
        r81.p pVar = new r81.p(contextWrapper, aVar);
        ny1.d dVar = ny1.d.f92664f;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        boolean a14 = dVar.a(requireContext2);
        ny1.f fVar = ny1.f.f92666f;
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        boolean a15 = fVar.a(requireContext3);
        boolean v93 = v9();
        boolean s93 = s9();
        o81.a aVar2 = this.W0;
        if (aVar2 == null) {
            Intrinsics.r("lensService");
            throw null;
        }
        hs1.q a16 = hs1.t.a();
        hf0.b bVar2 = new hf0.b();
        es.a aVar3 = this.f121077j1;
        if (aVar3 == null) {
            Intrinsics.r("adFormats");
            throw null;
        }
        es.h hVar = this.f121075i1;
        if (hVar == null) {
            Intrinsics.r("adsCommonDisplay");
            throw null;
        }
        sq0.f fVar2 = new sq0.f(a16, bVar2, this.f121079k1, kotlin.collections.e0.b(new xq0.b(aVar3, hVar)), 8);
        rg0.s a17 = rg0.y.a();
        boolean q93 = q9();
        boolean booleanValue = ((Boolean) this.d2.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.f121065c2.getValue()).booleanValue();
        c91.e eVar = this.X0;
        if (eVar == null) {
            Intrinsics.r("onDemandModuleControllerFactory");
            throw null;
        }
        c91.f a18 = eVar.a(E4(), s7());
        boolean booleanValue3 = ((Boolean) this.K1.getValue()).booleanValue();
        nr0.m mVar = this.f121062b1;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        ll.j jVar = this.f121066d1;
        if (jVar == null) {
            Intrinsics.r("pincodesUtil");
            throw null;
        }
        m81.p m93 = m9();
        nx.f0 f0Var2 = this.Z0;
        if (f0Var2 == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        f4 f4Var = this.f121071g1;
        if (f4Var == null) {
            Intrinsics.r("structuredFeedExperiments");
            throw null;
        }
        lb0.r rVar = this.f121073h1;
        if (rVar == null) {
            Intrinsics.r("prefsManagerUser");
            throw null;
        }
        s81.p pVar2 = new s81.p(a13, this.f121079k1, pVar, a14, a15, s93, v93, aVar2, fVar2, a17, booleanValue, booleanValue2, q93, a18, this.M1, this.N1, booleanValue3, f0Var2, f4Var, rVar, mVar, jVar, m93);
        this.f121076i2 = pVar2;
        this.f121072g2 = pVar2;
        this.D1 = pVar2;
        return pVar2;
    }

    @Override // sq0.e
    public final int X8() {
        switch (l.f121048a[this.f121080k2.ordinal()]) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
                return super.X8();
            case 3:
            case 4:
                return getResources().getDimensionPixelSize(r0.margin_quarter);
            default:
                throw new NoWhenBranchMatchedException();
        }
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
        return this.f139735i0;
    }

    @Override // wk1.k, yq0.t
    /* renamed from: f9 */
    public final void y8(yq0.z adapter, sq0.f0 dataSourceProvider) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        super.y8(adapter, dataSourceProvider);
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin_quarter);
        this.W1 = new eb2.c(d9(dataSourceProvider, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize), new o(this, 0));
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        m81.r rVar = this.X1;
        if (com.bumptech.glide.d.o0(rVar != null ? Boolean.valueOf(((s81.p) rVar).U3()) : null)) {
            return true;
        }
        nl1.d.J7();
        return false;
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        switch (l.f121048a[this.f121080k2.ordinal()]) {
            case 1:
            case 2:
                return getResources().getInteger(xb2.b.pin_grid_cols);
            case 3:
                return getResources().getInteger(uc2.e.lens_history_grid_cols);
            case 4:
                return getResources().getInteger(uc2.e.lens_gallery_grid_cols);
            case 5:
            case 6:
            case 7:
                return 1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getR0() {
        return m9() == m81.p.ROOM_REPAINT ? a4.ROOM_REPAINT_VIEW : a4.FLASHLIGHT_CAMERA_RESULTS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getQ0() {
        return this.f121078j2;
    }

    public final void j9(Animation.AnimationListener animationListener) {
        Intrinsics.checkNotNullParameter(animationListener, "animationListener");
        n81.a aVar = this.E1;
        if (aVar == null || aVar.getParent() != null) {
            return;
        }
        aVar.a(animationListener);
        CoordinatorLayout coordinatorLayout = this.H1;
        if (coordinatorLayout != null) {
            coordinatorLayout.addView(aVar, -1, -1);
        } else {
            Intrinsics.r("coordinatorLayout");
            throw null;
        }
    }

    public final void k9() {
        ca2.e l93 = l9();
        l93.o(0);
        ca2.e.i(l93, "data_changed", 0.0f, null, 6);
    }

    public final ca2.e l9() {
        return (ca2.e) this.Q1.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(uc2.f.fragment_lens, uc2.d.bottom_sheet_recycler_view);
        eVar.b(uc2.d.bottom_sheet_loading_layout);
        return eVar;
    }

    public final m81.p m9() {
        return (m81.p) this.f121081l1.getValue();
    }

    public final g0 n9() {
        g0 g0Var = this.V0;
        if (g0Var != null) {
            return g0Var;
        }
        Intrinsics.r("pageSizeProvider");
        throw null;
    }

    public final ny1.w o9() {
        ny1.w wVar = this.f121064c1;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("permissionsManager");
        throw null;
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(uc2.d.fragment_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.H1 = (CoordinatorLayout) findViewById;
        View findViewById2 = onCreateView.findViewById(uc2.d.camera_root_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.F1 = (FrameLayout) findViewById2;
        final int i13 = 0;
        final int i14 = 1;
        if (s9()) {
            Context context = onCreateView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            v vVar = new v(context, getActiveUserManager());
            GestaltButton a13 = vVar.a();
            this.f121087r1 = a13;
            if (a13 != null) {
                a13.e(new j(this, i13));
            }
            this.f121084o1 = vVar;
            FrameLayout frameLayout = this.F1;
            if (frameLayout == null) {
                Intrinsics.r("cameraRootContainer");
                throw null;
            }
            frameLayout.addView(vVar);
        } else {
            View findViewById3 = onCreateView.findViewById(uc2.d.missing_camera_permission_container);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            this.f121084o1 = findViewById3;
            this.f121086q1 = (GestaltText) onCreateView.findViewById(uc2.d.missing_camera_permission_text);
            this.f121085p1 = (GestaltText) onCreateView.findViewById(uc2.d.missing_camera_permission_title);
            this.f121087r1 = ((GestaltButton) onCreateView.findViewById(uc2.d.missing_camera_permission_btn)).d(c.f121003l).e(new j(this, i14));
        }
        RoomStylePickerView roomStylePickerView = (RoomStylePickerView) onCreateView.findViewById(uc2.d.room_style_picker);
        roomStylePickerView.o(new m(this));
        this.f121082m1 = roomStylePickerView;
        this.f121083n1 = (RoomRepaintInfoView) onCreateView.findViewById(uc2.d.room_repaint_info);
        if (q9()) {
            GestaltText gestaltText = this.f121085p1;
            if (gestaltText != null) {
                String string = onCreateView.getResources().getString(uc2.h.lens_and_try_on_permissions_description);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                pk.a0.p(gestaltText, string);
            }
            GestaltText gestaltText2 = this.f121086q1;
            if (gestaltText2 != null) {
                pk.a0.k0(gestaltText2);
            }
        }
        View findViewById4 = onCreateView.findViewById(uc2.d.partial_photo_info);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.R1 = (LinearLayout) findViewById4;
        final int i15 = 2;
        ((GestaltButton) onCreateView.findViewById(uc2.d.partial_photo_info_btn)).e(new j(this, i15));
        ((GestaltButton) onCreateView.findViewById(uc2.d.save_pinit_bt)).e(new j(this, 3));
        ((GestaltIconButton) onCreateView.findViewById(uc2.d.action_menu_bt)).t(new c0(this, i14)).u(new j(this, 4));
        View findViewById5 = onCreateView.findViewById(uc2.d.error_message_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.S1 = (LinearLayout) findViewById5;
        View findViewById6 = onCreateView.findViewById(uc2.d.error_title);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.T1 = (GestaltText) findViewById6;
        View findViewById7 = onCreateView.findViewById(uc2.d.error_message);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.U1 = (GestaltText) findViewById7;
        this.V1 = ((GestaltButton) onCreateView.findViewById(uc2.d.error_try_again_button)).e(new j(this, 5));
        i iVar = this.I1;
        if (iVar != null) {
            iVar.setOnClickListener(new View.OnClickListener(this) { // from class: u81.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f121047b;

                {
                    this.f121047b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i13;
                    r this$0 = this.f121047b;
                    switch (i16) {
                        case 0:
                            int i17 = r.f121059l2;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            m81.r rVar = this$0.X1;
                            if (rVar != null) {
                                ((s81.p) rVar).J3();
                                break;
                            }
                            break;
                        case 1:
                            int i18 = r.f121059l2;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            m81.r rVar2 = this$0.X1;
                            if (rVar2 != null) {
                                ((s81.p) rVar2).J3();
                                break;
                            }
                            break;
                        default:
                            int i19 = r.f121059l2;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            m81.r rVar3 = this$0.X1;
                            if (rVar3 != null) {
                                ((s81.p) rVar3).J3();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        View view = this.f121084o1;
        if (view == null) {
            Intrinsics.r("missingCameraPermissionContainer");
            throw null;
        }
        view.setOnClickListener(new View.OnClickListener(this) { // from class: u81.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f121047b;

            {
                this.f121047b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i14;
                r this$0 = this.f121047b;
                switch (i16) {
                    case 0:
                        int i17 = r.f121059l2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        m81.r rVar = this$0.X1;
                        if (rVar != null) {
                            ((s81.p) rVar).J3();
                            break;
                        }
                        break;
                    case 1:
                        int i18 = r.f121059l2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        m81.r rVar2 = this$0.X1;
                        if (rVar2 != null) {
                            ((s81.p) rVar2).J3();
                            break;
                        }
                        break;
                    default:
                        int i19 = r.f121059l2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        m81.r rVar3 = this$0.X1;
                        if (rVar3 != null) {
                            ((s81.p) rVar3).J3();
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById8 = onCreateView.findViewById(uc2.d.image_action_container);
        ViewGroup viewGroup2 = (ViewGroup) findViewById8;
        Intrinsics.f(viewGroup2);
        viewGroup2.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "apply(...)");
        this.f121091v1 = viewGroup2;
        View findViewById9 = onCreateView.findViewById(uc2.d.image_preview_container);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f121094y1 = (FrameLayout) findViewById9;
        WebImageView webImageView = new WebImageView(onCreateView.getContext());
        webImageView.setScaleType(ImageView.ScaleType.FIT_START);
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        webImageView.f52564p = new oq.h(5, webImageView, this);
        webImageView.setOnClickListener(new View.OnClickListener(this) { // from class: u81.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f121047b;

            {
                this.f121047b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                r this$0 = this.f121047b;
                switch (i16) {
                    case 0:
                        int i17 = r.f121059l2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        m81.r rVar = this$0.X1;
                        if (rVar != null) {
                            ((s81.p) rVar).J3();
                            break;
                        }
                        break;
                    case 1:
                        int i18 = r.f121059l2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        m81.r rVar2 = this$0.X1;
                        if (rVar2 != null) {
                            ((s81.p) rVar2).J3();
                            break;
                        }
                        break;
                    default:
                        int i19 = r.f121059l2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        m81.r rVar3 = this$0.X1;
                        if (rVar3 != null) {
                            ((s81.p) rVar3).J3();
                            break;
                        }
                        break;
                }
            }
        });
        this.f121092w1 = webImageView;
        Context context2 = onCreateView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f121095z1 = new TopBottomGradientView(0, 0, 0, 30, context2, null);
        FrameLayout frameLayout2 = this.f121094y1;
        if (frameLayout2 == null) {
            Intrinsics.r("imagePreviewContainer");
            throw null;
        }
        boolean booleanValue = ((Boolean) this.d2.getValue()).booleanValue();
        float f13 = this.N1;
        if (booleanValue || ((Boolean) this.f121065c2.getValue()).booleanValue()) {
            Context context3 = frameLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            float f14 = f13 - this.O1;
            s81.p pVar = this.f121072g2;
            WebImageView webImageView2 = this.f121092w1;
            if (webImageView2 == null) {
                Intrinsics.r("imagePreview");
                throw null;
            }
            com.pinterest.feature.search.visual.cropper.n nVar = new com.pinterest.feature.search.visual.cropper.n(context3, f14, pVar, webImageView2);
            frameLayout2.addView(nVar, -1, -1);
            Context context4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
            Intrinsics.checkNotNullParameter(context4, "context");
            rm1.q qVar = rm1.q.FLASHLIGHT;
            om1.f fVar = om1.f.WASH_DARK_GRAY;
            GestaltIconButton gestaltIconButton = new GestaltIconButton(context4, new om1.c(qVar, null, fVar, null, null, false, t0.flashlight_search_button, 762));
            gestaltIconButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388693));
            FrameLayout frameLayout3 = this.f121094y1;
            if (frameLayout3 == null) {
                Intrinsics.r("imagePreviewContainer");
                throw null;
            }
            frameLayout3.addView(gestaltIconButton);
            gestaltIconButton.u(new j(this, 9));
            ViewGroup.LayoutParams layoutParams = gestaltIconButton.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd(gestaltIconButton.getResources().getDimensionPixelSize(r0.margin));
            }
            A9(qVar, fVar, om1.e.LG);
            this.f121068e2 = gestaltIconButton;
            this.f121093x1 = nVar;
        } else {
            WebImageView webImageView3 = this.f121092w1;
            if (webImageView3 == null) {
                Intrinsics.r("imagePreview");
                throw null;
            }
            frameLayout2.addView(webImageView3, -1, -1);
        }
        TopBottomGradientView topBottomGradientView = this.f121095z1;
        if (topBottomGradientView == null) {
            Intrinsics.r("blackOverlay");
            throw null;
        }
        frameLayout2.addView(topBottomGradientView, -1, -1);
        View findViewById10 = onCreateView.findViewById(uc2.d.navigation_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) findViewById10;
        this.f121090u1 = gestaltIconButton2;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("navigationButton");
            throw null;
        }
        gestaltIconButton2.u(new j(this, 6));
        this.L1 = onCreateView.getResources().getDimensionPixelSize(uc2.b.flashlight_bottom_sheet_dismissed_size);
        Context context5 = onCreateView.getContext();
        if (context5 != null) {
            this.E1 = new n81.a(context5);
        }
        View findViewById11 = onCreateView.findViewById(uc2.d.bottom_container);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        LensBottomControlsContainer lensBottomControlsContainer = (LensBottomControlsContainer) findViewById11;
        this.G1 = lensBottomControlsContainer;
        if (lensBottomControlsContainer == null) {
            Intrinsics.r("bottomContainer");
            throw null;
        }
        lensBottomControlsContainer.g(this.X1);
        lensBottomControlsContainer.h(q9());
        View findViewById12 = onCreateView.findViewById(uc2.d.shutter_pulsar);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        EducationPulsarView educationPulsarView = (EducationPulsarView) findViewById12;
        this.f121063b2 = educationPulsarView;
        if (educationPulsarView == null) {
            Intrinsics.r("pulsar");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = educationPulsarView.getLayoutParams();
        Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = onCreateView.getResources().getDimensionPixelSize(uc2.b.lens_15_camera_controls_margin) - ((onCreateView.getResources().getDimensionPixelSize(r0.pulsar_outer_size) - onCreateView.getResources().getDimensionPixelSize(uc2.b.lens_shutter_size)) / 2);
        View findViewById13 = onCreateView.findViewById(uc2.d.bottom_sheet_loading_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        pe.i.q1((PinterestLoadingLayout) findViewById13);
        l9().m(onCreateView.findViewById(uc2.d.bottom_sheet_with_grid));
        View findViewById14 = onCreateView.findViewById(uc2.d.header_placeholder_view);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.A1 = (FrameLayout) findViewById14;
        this.P1 = (int) (f13 - (onCreateView.getResources().getDimensionPixelSize(r0.margin) + onCreateView.getResources().getDimensionPixelSize(uc2.b.flashlight_bottom_sheet_gap_size)));
        l9().x(this.P1);
        b0 p93 = p9();
        FrameLayout frameLayout4 = this.f121094y1;
        if (frameLayout4 != null) {
            p93.b(frameLayout4, s7());
            return onCreateView;
        }
        Intrinsics.r("imagePreviewContainer");
        throw null;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.X1 = null;
        l9().l();
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        if (((Boolean) this.K1.getValue()).booleanValue()) {
            q81.a aVar = this.J1;
            if (aVar != null) {
                aVar.b();
            }
        } else {
            i iVar = this.I1;
            if (iVar != null) {
                iVar.e();
            }
        }
        pe.i.p1(this, false, 3);
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        pe.i.Y0(this);
        if (this.f121088s1) {
            w9();
            this.f121088s1 = false;
        }
        m81.r rVar = this.X1;
        if (rVar != null) {
            ((s81.p) rVar).R3();
        }
        m81.r rVar2 = this.X1;
        if (rVar2 != null) {
            ny1.f fVar = ny1.f.f92666f;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ((s81.p) rVar2).V3(fVar.a(requireContext), v9());
        }
        p9().d();
    }

    public final b0 p9() {
        b0 b0Var = this.f121069f1;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.r("roomRepaintFeedbackContainer");
        throw null;
    }

    public final boolean q9() {
        return ((Boolean) this.Y1.getValue()).booleanValue();
    }

    public final Uri r9(Bitmap bitmap) {
        Uri h03;
        String i13;
        FragmentActivity E4 = E4();
        if (E4 == null || (h03 = c0.d.h0(E4, bitmap)) == null || (i13 = qb0.b.i(E4, h03)) == null || i13.length() == 0) {
            return null;
        }
        String path = Uri.parse(i13).getPath();
        return Uri.fromFile(path != null ? new File(path) : null);
    }

    public final boolean s9() {
        return ((Boolean) this.f121089t1.getValue()).booleanValue();
    }

    public final void t9() {
        FrameLayout frameLayout = this.f121094y1;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        } else {
            Intrinsics.r("imagePreviewContainer");
            throw null;
        }
    }

    public final void u9() {
        LensBottomControlsContainer lensBottomControlsContainer = this.G1;
        if (lensBottomControlsContainer == null) {
            Intrinsics.r("bottomContainer");
            throw null;
        }
        lensBottomControlsContainer.getF48047b().setAlpha(1.0f);
        View view = this.f121084o1;
        if (view != null) {
            view.setVisibility(8);
        } else {
            Intrinsics.r("missingCameraPermissionContainer");
            throw null;
        }
    }

    @Override // nl1.d
    public final y32.f v7() {
        return y32.f.PINCH_TO_ZOOM;
    }

    public final boolean v9() {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        ny1.m mVar = ny1.m.f92673f;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return mVar.a(requireContext);
    }

    public final void w9() {
        m81.r rVar = this.X1;
        if (rVar != null) {
            ny1.d dVar = ny1.d.f92664f;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ((s81.p) rVar).M3(dVar.a(requireContext));
        }
    }

    public final boolean x9(boolean z13) {
        s7().X(u0.LENS_PERMISSION_SETTINGS_BUTTON);
        return !z13;
    }

    public final void y9() {
        n81.a aVar = this.E1;
        ViewParent parent = aVar != null ? aVar.getParent() : null;
        CoordinatorLayout coordinatorLayout = this.H1;
        if (coordinatorLayout == null) {
            Intrinsics.r("coordinatorLayout");
            throw null;
        }
        if (Intrinsics.d(parent, coordinatorLayout)) {
            CoordinatorLayout coordinatorLayout2 = this.H1;
            if (coordinatorLayout2 != null) {
                coordinatorLayout2.removeView(this.E1);
            } else {
                Intrinsics.r("coordinatorLayout");
                throw null;
            }
        }
    }

    public final void z9(boolean z13) {
        if (s9()) {
            ny1.w o93 = o9();
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            o93.c(requireActivity, ny1.h.f92668f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : new n(this, 4), (r23 & 1024) != 0 ? ny1.t.f92703n : null);
            return;
        }
        if (q9()) {
            ny1.w o94 = o9();
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            o94.c(requireActivity2, ny1.z.f92716f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : new q(this, z13, 0), (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : new n(this, 5), (r23 & 1024) != 0 ? ny1.t.f92703n : null);
            return;
        }
        ny1.w o95 = o9();
        FragmentActivity requireActivity3 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
        o95.c(requireActivity3, ny1.l.f92672f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : new q(this, z13, 1), (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : new n(this, 6), (r23 & 1024) != 0 ? ny1.t.f92703n : null);
    }
}
