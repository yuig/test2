package j51;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.profile.allpins.view.ProfileAllPinsRep;
import com.pinterest.feature.profile.boardlesspins.components.IdeaPreviewCarouselView;
import com.pinterest.feature.profile.boardlesspins.components.UnorganizedIdeasModule;
import com.pinterest.feature.profile.boardsoftdeletion.SoftDeletionModule;
import com.pinterest.feature.profile.savedtab.view.GroupMyProfilePinsUpsellView;
import com.pinterest.feature.profile.savedtab.view.LegoBoardInviteProfileCell;
import com.pinterest.ui.components.banners.LegoBannerView;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.u2;
import m60.r0;
import p1.y0;
import so.j2;
import so.l2;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74769i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f74770j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(d0 d0Var, int i13) {
        super(0);
        this.f74769i = i13;
        this.f74770j = d0Var;
    }

    public final ProfileAllPinsRep b() {
        int i13 = this.f74769i;
        d0 d0Var = this.f74770j;
        switch (i13) {
            case 13:
                Context requireContext = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                ProfileAllPinsRep profileAllPinsRep = new ProfileAllPinsRep(requireContext);
                qc2.d visibilityCalculator = new qc2.d();
                s onImagesLoadedCallback = new s(d0Var, 12);
                Intrinsics.checkNotNullParameter(visibilityCalculator, "visibilityCalculator");
                Intrinsics.checkNotNullParameter(onImagesLoadedCallback, "onImagesLoadedCallback");
                profileAllPinsRep.f47492t = visibilityCalculator;
                profileAllPinsRep.f47493u = onImagesLoadedCallback;
                return profileAllPinsRep;
            default:
                Context requireContext2 = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                ProfileAllPinsRep profileAllPinsRep2 = new ProfileAllPinsRep(requireContext2);
                qc2.d visibilityCalculator2 = new qc2.d();
                s onImagesLoadedCallback2 = new s(d0Var, 14);
                Intrinsics.checkNotNullParameter(visibilityCalculator2, "visibilityCalculator");
                Intrinsics.checkNotNullParameter(onImagesLoadedCallback2, "onImagesLoadedCallback");
                profileAllPinsRep2.f47492t = visibilityCalculator2;
                profileAllPinsRep2.f47493u = onImagesLoadedCallback2;
                return profileAllPinsRep2;
        }
    }

    public final b e() {
        int i13 = this.f74769i;
        d0 d0Var = this.f74770j;
        switch (i13) {
            case 2:
                Context requireContext = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                b bVar = new b(requireContext);
                bVar.a(new a(bs1.c.f2(bVar, nz1.f.your_boards), null, Integer.valueOf(bs1.c.W(bVar, eo1.c.space_100)), 2));
                return bVar;
            case 3:
                Context requireContext2 = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                b bVar2 = new b(requireContext2);
                bVar2.a(new a(bs1.c.f2(bVar2, nz1.f.archived_boards), null, null, 6));
                c51.e eVar = d0Var.f74721a1;
                if (eVar != null) {
                    String headerName = bs1.c.f2(bVar2, nz1.f.archived_boards);
                    Intrinsics.checkNotNullParameter(headerName, "headerName");
                    nx.d0 pinalytics = ((g51.n) eVar).getPinalytics();
                    u0 u0Var = u0.BOARD_GROUPING_NAME;
                    HashMap o13 = ep.b.o("referrer", headerName);
                    Unit unit = Unit.f80348a;
                    pinalytics.Z(u0Var, o13);
                }
                return bVar2;
            default:
                Context requireContext3 = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                b bVar3 = new b(requireContext3);
                bVar3.a(new a(bs1.c.f2(bVar3, nz1.f.protected_boards), bs1.c.f2(bVar3, nz1.f.protected_boards_subtitle), null, 4));
                c51.e eVar2 = d0Var.f74721a1;
                if (eVar2 != null) {
                    String headerName2 = bs1.c.f2(bVar3, nz1.f.protected_boards);
                    Intrinsics.checkNotNullParameter(headerName2, "headerName");
                    nx.d0 pinalytics2 = ((g51.n) eVar2).getPinalytics();
                    u0 u0Var2 = u0.BOARD_GROUPING_NAME;
                    HashMap o14 = ep.b.o("referrer", headerName2);
                    Unit unit2 = Unit.f80348a;
                    pinalytics2.Z(u0Var2, o14);
                }
                return bVar3;
        }
    }

    public final View f() {
        int i13 = this.f74769i;
        d0 d0Var = this.f74770j;
        switch (i13) {
            case 16:
                Context requireContext = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                break;
            case 17:
                int i14 = d0.f74720s1;
                break;
            default:
                int i15 = d0.f74720s1;
                break;
        }
        return d0Var.j9(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AttributeSet attributeSet = null;
        int i13 = this.f74769i;
        d0 d0Var = this.f74770j;
        switch (i13) {
            case 0:
                m162invoke();
                return Unit.f80348a;
            case 1:
                m162invoke();
                return Unit.f80348a;
            case 2:
                return e();
            case 3:
                return e();
            case 4:
                return e();
            case 5:
                Context requireContext = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new GroupMyProfilePinsUpsellView(6, requireContext, attributeSet);
            case 6:
                Context requireContext2 = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SoftDeletionModule(requireContext2);
            case 7:
                Context requireContext3 = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                UnorganizedIdeasModule unorganizedIdeasModule = new UnorganizedIdeasModule(requireContext3);
                unorganizedIdeasModule.setPaddingRelative(unorganizedIdeasModule.getPaddingStart(), bs1.c.W(unorganizedIdeasModule, eo1.c.space_200), unorganizedIdeasModule.getPaddingEnd(), bs1.c.W(unorganizedIdeasModule, eo1.c.space_1600));
                int i14 = eo1.a.item_horizontal_spacing;
                Intrinsics.checkNotNullParameter(unorganizedIdeasModule, "<this>");
                float H1 = bs1.c.H1(unorganizedIdeasModule, i14) / unorganizedIdeasModule.getResources().getDisplayMetrics().density;
                k31.b bVar = k31.c.f78239a;
                y0 contentPadding = androidx.compose.foundation.layout.b.b(H1, 2);
                k31.f previewStyle = bVar.f78236a;
                Intrinsics.checkNotNullParameter(previewStyle, "previewStyle");
                Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                k31.b style = new k31.b(previewStyle, H1, contentPadding);
                Intrinsics.checkNotNullParameter(style, "style");
                IdeaPreviewCarouselView ideaPreviewCarouselView = unorganizedIdeasModule.f47500b;
                ideaPreviewCarouselView.getClass();
                Intrinsics.checkNotNullParameter(style, "style");
                ideaPreviewCarouselView.f47495i.setValue(style);
                return unorganizedIdeasModule;
            case 8:
                j2 j2Var = d0Var.f74722b1;
                if (j2Var == null) {
                    Intrinsics.r("pinClusterCarouselViewFactory");
                    throw null;
                }
                Context requireContext4 = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner = d0Var.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new h60.k(requireContext4, bf.b.S(viewLifecycleOwner), com.bumptech.glide.d.Z(d0Var, "EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", f60.b.PROFILE.getValue()), (l2) j2Var.f113474a.f114091b.R8.get());
            case 9:
                Context context = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                LegoBoardInviteProfileCell legoBoardInviteProfileCell = new LegoBoardInviteProfileCell(context, 7);
                legoBoardInviteProfileCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                legoBoardInviteProfileCell.setClipChildren(false);
                legoBoardInviteProfileCell.setClipToPadding(false);
                u2 u2Var = legoBoardInviteProfileCell.f47585d;
                if (u2Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                if (u2Var.d()) {
                    Context context2 = legoBoardInviteProfileCell.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    legoBoardInviteProfileCell.f47590i = legoBoardInviteProfileCell.i(context2, legoBoardInviteProfileCell.f47587f, legoBoardInviteProfileCell.f47588g);
                } else {
                    Context context3 = legoBoardInviteProfileCell.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    LegoBannerView g13 = legoBoardInviteProfileCell.g(context3, legoBoardInviteProfileCell.f47587f, legoBoardInviteProfileCell.f47588g);
                    g13.f52261p.i(ja2.b.f75312k);
                    legoBoardInviteProfileCell.f47589h = g13;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                int Z = bs1.c.Z(legoBoardInviteProfileCell, r0.margin_half);
                marginLayoutParams.setMargins(Z, Z, Z, Z);
                legoBoardInviteProfileCell.setLayoutParams(marginLayoutParams);
                return legoBoardInviteProfileCell;
            case 10:
                m162invoke();
                return Unit.f80348a;
            case 11:
                Context requireContext5 = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new p(requireContext5, d0Var.f74721a1 != null ? !((g51.n) r1).G3() : false, d0Var.f74721a1 != null ? !((g51.n) r1).G3() : false, d0Var.f74721a1, new s(d0Var, 10));
            case 12:
                m162invoke();
                return Unit.f80348a;
            case 13:
                return b();
            case 14:
                m162invoke();
                return Unit.f80348a;
            case 15:
                return b();
            case 16:
                return f();
            case 17:
                return f();
            case 18:
                return f();
            case 19:
                Context requireContext6 = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
                return new ho0.f(requireContext6, (Integer) null);
            case 20:
                Context context4 = d0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(context4, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context4, "context");
                ho0.f fVar = new ho0.f(context4);
                fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return fVar;
            case 21:
                m162invoke();
                return Unit.f80348a;
            default:
                m162invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m162invoke() {
        int i13 = this.f74769i;
        d0 d0Var = this.f74770j;
        switch (i13) {
            case 0:
                c51.e eVar = d0Var.f74721a1;
                if (eVar != null) {
                    ((g51.n) eVar).K3();
                    break;
                }
                break;
            case 1:
                c51.e eVar2 = d0Var.f74721a1;
                if (eVar2 != null) {
                    g51.n nVar = (g51.n) eVar2;
                    if (nVar.isBound()) {
                        nVar.getPinalytics().F(g0.WIDGET_ACTION_BAR, u0.NAVIGATION_HOME_BUTTON);
                        ((d0) ((c51.f) nVar.getView())).m();
                        break;
                    }
                }
                break;
            case 10:
                c51.e eVar3 = d0Var.f74721a1;
                if (eVar3 != null) {
                    g51.n nVar2 = (g51.n) eVar3;
                    nVar2.getPinalytics().X(u0.BOARD_ORGANIZE_BUTTON);
                    nVar2.N3();
                    break;
                }
                break;
            case 12:
                d0Var.f7().d(new dc0.h(false));
                break;
            case 14:
                d0Var.f7().d(new dc0.h(false));
                break;
            case 21:
                c51.e eVar4 = d0Var.f74721a1;
                if (eVar4 != null) {
                    ((g51.n) eVar4).M3();
                    break;
                }
                break;
            default:
                c51.e eVar5 = d0Var.f74721a1;
                if (eVar5 != null) {
                    ((g51.n) eVar5).K3();
                    break;
                }
                break;
        }
    }
}
