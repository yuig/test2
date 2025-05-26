package om0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.wy0;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.feature.board.detail.moreboardsview.BoardMoreBoardsView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.feature.ideaPinCreation.camera.view.CenterCropCameraTextureView;
import com.pinterest.feature.ideaPinCreation.duration.view.IdeaPinDurationDragger;
import com.pinterest.feature.ideaPinCreation.videotrimming.view.IdeaPinVideoTrimmingDragger;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import com.pinterest.screens.z1;
import h32.d4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.h2;
import lh0.z3;
import we1.f2;

/* loaded from: classes5.dex */
public final class m1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96544i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f96545j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f96546k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(int i13, Object obj, Object obj2) {
        super(0);
        this.f96544i = i13;
        this.f96545j = obj;
        this.f96546k = obj2;
    }

    public final View b() {
        int i13 = this.f96544i;
        Object obj = this.f96546k;
        Object obj2 = this.f96545j;
        switch (i13) {
            case 13:
                return LayoutInflater.from((Context) obj2).inflate(aq1.f.idea_pin_editable_full_bleed_page, (ViewGroup) obj, true);
            case 14:
                return View.inflate((Context) obj2, aq1.f.view_idea_pin_duration_dragger, (IdeaPinDurationDragger) obj);
            default:
                return View.inflate((Context) obj2, aq1.f.view_idea_pin_video_trimming_dragger, (IdeaPinVideoTrimmingDragger) obj);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AttributeSet attributeSet = null;
        int i13 = this.f96544i;
        Object obj = this.f96546k;
        Object obj2 = this.f96545j;
        switch (i13) {
            case 0:
                m227invoke();
                return Unit.f80348a;
            case 1:
                m227invoke();
                return Unit.f80348a;
            case 2:
                BoardMoreBoardsView boardMoreBoardsView = new BoardMoreBoardsView(6, (Context) obj2, attributeSet);
                boardMoreBoardsView.setPinalytics(((wn0.j) obj).s7());
                return boardMoreBoardsView;
            case 3:
                jp0.b bVar = (jp0.b) obj2;
                if (bVar.f77282e == null) {
                    Intrinsics.r("carouselItemViewFactory");
                    throw null;
                }
                Context context = bVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                nx.d0 pinalytics = (nx.d0) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                return new kp0.c(context, pinalytics, bVar.f77280c);
            case 4:
                m227invoke();
                return Unit.f80348a;
            case 5:
                y92.c cVar = new y92.c((Context) obj2, ((lq0.s0) obj).f84433n);
                cVar.f138290e = 200;
                return cVar;
            case 6:
            default:
                m227invoke();
                return Unit.f80348a;
            case 7:
                m227invoke();
                return Unit.f80348a;
            case 8:
                m227invoke();
                return Unit.f80348a;
            case 9:
                LegoBoardRep legoBoardRep = new LegoBoardRep((Context) obj2);
                legoBoardRep.a0(new qc2.d(), new yq0.k((ot0.i) obj, 26));
                return legoBoardRep;
            case 10:
                m227invoke();
                return Unit.f80348a;
            case 11:
                m227invoke();
                return Unit.f80348a;
            case 12:
                m227invoke();
                return Unit.f80348a;
            case 13:
                return b();
            case 14:
                return b();
            case 15:
                m227invoke();
                return Unit.f80348a;
            case 16:
                m227invoke();
                return Unit.f80348a;
            case 17:
                m227invoke();
                return Unit.f80348a;
            case 18:
                Context context2 = (Context) obj2;
                ev0.l lVar = (ev0.l) obj;
                uk2.f fVar = lVar.R0;
                h22.f fVar2 = lVar.B0;
                if (fVar2 != null) {
                    return new ev0.s(context2, fVar, fVar2, lVar.V8());
                }
                Intrinsics.r("storyPinService");
                throw null;
            case 19:
                m227invoke();
                return Unit.f80348a;
            case 20:
                m227invoke();
                return Unit.f80348a;
            case 21:
                m227invoke();
                return Unit.f80348a;
            case 22:
                m227invoke();
                return Unit.f80348a;
            case 23:
                return b();
            case 24:
                yw0.e eVar = (yw0.e) obj;
                return new ax0.h((Context) obj2, eVar.f140276d, eVar.f140275c);
            case 25:
                m227invoke();
                return Unit.f80348a;
            case 26:
                bx0.i iVar = (bx0.i) obj;
                return new cx0.i((Context) obj2, iVar.f24047d, iVar.f24046c);
            case 27:
                return new qb2.d((h12.a) obj2, (no1.d) obj);
            case 28:
                oc.c apolloClient = (oc.c) obj2;
                px0.i iVar2 = (px0.i) obj;
                qb2.a inviteFriends = iVar2.f101615j;
                h2 h2Var = iVar2.f101609d;
                h2Var.getClass();
                z3 z3Var = a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) h2Var.f83382a;
                boolean z13 = g1Var.o("android_real_time_messaging_killswitch", "enabled", z3Var) || g1Var.l("android_real_time_messaging_killswitch");
                au0.a isInboxMoreInviteCtasEnabled = new au0.a(iVar2, 16);
                Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
                Intrinsics.checkNotNullParameter(inviteFriends, "inviteFriends");
                Intrinsics.checkNotNullParameter(isInboxMoreInviteCtasEnabled, "isInboxMoreInviteCtasEnabled");
                com.pinterest.framework.multisection.datasource.pagedlist.s sVar = new com.pinterest.framework.multisection.datasource.pagedlist.s(apolloClient, qb2.b.f103420i, qb2.c.f103421i, new fx1.d(z13, 22), new ha2.i(15, isInboxMoreInviteCtasEnabled, inviteFriends), null, null, null, 8160);
                sVar.o(3, new f2(24));
                sVar.o(25, new f2(25));
                return new com.pinterest.framework.multisection.datasource.pagedlist.g(sVar, new c50.c1(1), "", null);
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m227invoke() {
        String partnerName;
        h32.i0 i0Var;
        int i13 = 3;
        int i14 = 2;
        ln1.i iVar = ln1.i.f84010k;
        int i15 = this.f96544i;
        int i16 = 1;
        Object obj = this.f96546k;
        Object obj2 = this.f96545j;
        switch (i15) {
            case 0:
                ((Function1) obj2).invoke(((t1) obj).f96601d);
                return;
            case 1:
                String str = ((lk0.a) obj).f83636a;
                int i17 = wn0.j.H1;
                ((wn0.j) obj2).getClass();
                r41.k.f106176a.d(str, r41.b.LegoBoardDetailHeader);
                return;
            case 2:
            case 3:
            case 5:
            case 6:
            case 9:
            case 13:
            case 14:
            case 18:
            case 23:
            case 24:
            default:
                int i18 = ny0.v.T0;
                kh2.j.x2(((ny0.v) obj2).l9(), new ny0.l((ny0.a1) obj));
                return;
            case 4:
                ((dq0.p) obj2).U3((String) obj, true, false);
                return;
            case 7:
                g70.h hVar = ((PinGridHideView) obj2).f45743v;
                if (hVar != null) {
                    g70.h.g(hVar, (String) obj, null, null, 6);
                    return;
                } else {
                    Intrinsics.r("boardNavigator");
                    throw null;
                }
            case 8:
                HomeFeedFragment homeFeedFragment = (HomeFeedFragment) obj2;
                m60.w f73 = homeFeedFragment.f7();
                NavigationImpl v13 = Navigation.v1((ScreenLocation) z1.f51669f.getValue(), (Bundle) obj);
                Intrinsics.checkNotNullExpressionValue(v13, "create(...)");
                homeFeedFragment.M1(v13);
                f73.d(Unit.f80348a);
                return;
            case 10:
                tt0.k kVar = (tt0.k) obj2;
                String str2 = (String) obj;
                tt0.f fVar = new tt0.f(kVar, str2, i16);
                yq0.k kVar2 = new yq0.k(kVar, 27);
                tt0.g gVar = new tt0.g(kVar, i16);
                Object obj3 = kVar.f119146i.getCameraCharacteristics(str2).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                Intrinsics.f(obj3);
                Size[] outputSizes = ((StreamConfigurationMap) obj3).getOutputSizes(SurfaceHolder.class);
                tt0.b1 b1Var = tt0.v0.f119224a;
                CenterCropCameraTextureView centerCropCameraTextureView = kVar.f119139b;
                Context context = centerCropCameraTextureView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int[] h10 = hf0.b.h(context);
                tt0.b1 b1Var2 = new tt0.b1(h10[0], h10[1]);
                if (b1Var2.f119087b < b1Var.f119087b && b1Var2.f119088c < b1Var.f119088c) {
                    b1Var = b1Var2;
                }
                Intrinsics.f(outputSizes);
                List<Size> T = kotlin.collections.c0.T(new b4.f(29), outputSizes);
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(T, 10));
                for (Size size : T) {
                    arrayList.add(new tt0.b1(size.getWidth(), size.getHeight()));
                }
                List q03 = CollectionsKt.q0(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : q03) {
                    tt0.b1 b1Var3 = (tt0.b1) obj4;
                    if (b1Var3.f119087b <= b1Var.f119087b && b1Var3.f119088c <= b1Var.f119088c) {
                        arrayList2.add(obj4);
                    }
                }
                Intrinsics.checkNotNullParameter(arrayList2, "<this>");
                Size size2 = ((tt0.b1) CollectionsKt.S(arrayList2)).f119086a;
                int width = size2.getWidth();
                int height = size2.getHeight();
                SurfaceTexture surfaceTexture = centerCropCameraTextureView.getSurfaceTexture();
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(width, height);
                }
                centerCropCameraTextureView.f45899a = height;
                centerCropCameraTextureView.f45900b = width;
                kVar.f119158u = new Surface(centerCropCameraTextureView.getSurfaceTexture());
                ImageReader newInstance = ImageReader.newInstance(size2.getWidth(), size2.getHeight(), RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 1);
                kVar.f119143f = newInstance;
                Surface[] elements = {kVar.f119158u, kVar.A, newInstance != null ? newInstance.getSurface() : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                ArrayList A = kotlin.collections.c0.A(elements);
                try {
                    CameraDevice cameraDevice = kVar.f119147j;
                    if (cameraDevice != null) {
                        cameraDevice.createCaptureSession(A, new tt0.e(kVar, str2, kVar2, fVar, gVar), kVar.f119150m);
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    kVar.f(str2);
                    kVar.f119138a.q(e13, "createCaptureSession failed", tb0.p.IDEA_PINS_CREATION);
                    gVar.invoke(e13);
                    return;
                }
            case 11:
                ((Function0) obj2).invoke();
                tt0.l0 l0Var = (tt0.l0) obj;
                int i19 = tt0.l0.Z0;
                l0Var.getClass();
                NavigationImpl a83 = l0Var.a8(d2.q(), ml1.b.UNSPECIFIED_TRANSITION.getValue());
                a83.Y1("com.pinterest.EXTRA_STORY_PIN_TRIM_REQUIRED", true);
                l0Var.M1(a83);
                return;
            case 12:
                ln0 ln0Var = (ln0) obj2;
                if (ln0Var != null) {
                    uv0.k.c(ln0Var);
                }
                ((au0.d) obj).w3();
                return;
            case 15:
                dv0.o oVar = ((bv0.d) obj2).f23916q;
                String Z2 = ((wy0) obj).Z2();
                partnerName = Z2 != null ? Z2 : "";
                oVar.getClass();
                Intrinsics.checkNotNullParameter(partnerName, "partnerName");
                ((fv0.b) ((av0.k) oVar.getView())).W8(partnerName, new dv0.m(oVar, i14), new dv0.m(oVar, i13));
                return;
            case 16:
                dv0.o oVar2 = ((bv0.g) obj2).f23925n;
                String Z22 = ((wy0) obj).Z2();
                partnerName = Z22 != null ? Z22 : "";
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(partnerName, "partnerName");
                ((fv0.b) ((av0.k) oVar2.getView())).W8(partnerName, new dv0.m(oVar2, i14), new dv0.m(oVar2, i13));
                return;
            case 17:
                ln0 ln0Var2 = (ln0) obj2;
                if (ln0Var2 != null) {
                    uv0.k.c(ln0Var2);
                }
                dv0.k kVar3 = (dv0.k) obj;
                ln0 ln0Var3 = kVar3.f56361t;
                String j13 = ln0Var3 != null ? ln0Var3.j() : null;
                if (j13 == null || j13.length() == 0) {
                    return;
                }
                nx.d0 d0Var = kVar3.getPresenterPinalytics().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                uv0.k.b(d0Var, kVar3.f56342a, kVar3.f56346e.d(), null, 24);
                return;
            case 19:
                kv0.u uVar = (kv0.u) obj;
                ((jv0.o) ((yi0.a) obj2).f139068b).a(new jv0.m(uVar.f81011a, uVar.f81018h));
                return;
            case 20:
                pv0.d dVar = (pv0.d) obj2;
                if (dVar.isBound()) {
                    GestaltSpinner gestaltSpinner = ((qv0.g) ((nv0.n) dVar.getView())).G0;
                    if (gestaltSpinner != null) {
                        Intrinsics.checkNotNullParameter(gestaltSpinner, "<this>");
                        kh2.s0.w(gestaltSpinner, iVar);
                        dVar.v3((nv0.g) ((ig1.b) obj));
                        return;
                    }
                    Intrinsics.r("overlayGestaltSpinner");
                    throw null;
                }
                return;
            case 21:
                pv0.f fVar2 = (pv0.f) obj2;
                if (fVar2.isBound()) {
                    GestaltSpinner gestaltSpinner2 = ((qv0.j) ((nv0.m) fVar2.getView())).D0;
                    if (gestaltSpinner2 != null) {
                        Intrinsics.checkNotNullParameter(gestaltSpinner2, "<this>");
                        kh2.s0.w(gestaltSpinner2, iVar);
                        fVar2.u3(((nv0.g) ((ig1.b) obj)).f92357b, new pv0.c(fVar2, 1));
                        return;
                    }
                    Intrinsics.r("overlayLoadingView");
                    throw null;
                }
                return;
            case 22:
                tv0.h hVar2 = (tv0.h) obj2;
                hVar2.s7().F(h32.g0.SPONSOR_TAG, h32.u0.STORY_PIN_PARTNER_TAG_SUBMIT_BUTTON);
                m60.w f74 = hVar2.f7();
                br.d dVar2 = (br.d) obj;
                String str3 = dVar2.f23703a;
                Intrinsics.checkNotNullExpressionValue(str3, "getUid(...)");
                f74.d(new tv0.l(str3));
                dl1.t tVar = hVar2.f119527k0;
                if (tVar != null) {
                    ag1.b bVar = hVar2.f119528l0;
                    if (bVar != null) {
                        jk2.e0 M = ((dl1.l) tVar).M(bVar.d());
                        hk2.b bVar2 = new hk2.b(new pv0.e(8, new com.pinterest.feature.ideaPinCreation.closeup.view.r0(21, hVar2, dVar2)), new pv0.e(9, tv0.g.f119523j), ck2.i.f27923c);
                        M.f(bVar2);
                        Intrinsics.checkNotNullExpressionValue(bVar2, "subscribe(...)");
                        hVar2.R6(bVar2);
                        hVar2.D5();
                        return;
                    }
                    Intrinsics.r("dataManager");
                    throw null;
                }
                Intrinsics.r("storyPinLocalDataRepository");
                throw null;
            case 25:
                u50.r rVar = (u50.r) obj2;
                bx0.i iVar2 = (bx0.i) obj;
                nx.d0 d0Var2 = iVar2.f24047d;
                Intrinsics.checkNotNullParameter(d0Var2, "<this>");
                h32.i0 source = d0Var2.p();
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    d4 d4Var = source.f67081a;
                    if (d4Var == null) {
                        d4Var = d4.PIN;
                    }
                    d4 d4Var2 = d4Var;
                    h32.a4 a4Var = source.f67082b;
                    if (a4Var == null) {
                        a4Var = h32.a4.PIN_PRODUCT;
                    }
                    i0Var = new h32.i0(d4Var2, a4Var, source.f67083c, h32.g0.SHOP_YOUR_SAVES_STL, source.f67085e, h32.u0.SEE_MORE_BUTTON);
                } else {
                    i0Var = new h32.i0(d4.PIN, h32.a4.PIN_PRODUCT, null, h32.g0.SHOP_YOUR_SAVES_STL, null, h32.u0.SEE_MORE_BUTTON);
                }
                Context context2 = iVar2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                rVar.a(new bx0.m(context2, i0Var));
                return;
        }
    }
}
