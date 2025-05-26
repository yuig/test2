package nx;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.CookieManager;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.feature.core.view.PinPromotedVideoViewCreator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.core.view.SingleColumnCarouselPinViewCreator;
import com.pinterest.feature.pincarouselads.view.SingleColumnCarouselPinView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.tabs.GestaltTab;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.UnauthActivity;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import ey.w4;
import ey.y4;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92453i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f92454j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, int i13) {
        super(0);
        this.f92453i = i13;
        this.f92454j = obj;
    }

    public final String b() {
        int i13 = this.f92453i;
        Object obj = this.f92454j;
        switch (i13) {
            case 4:
                return df.j1.U(hf0.b.q() ? "Pinterest for Android Tablet/%s (%s; %s)" : "Pinterest for Android/%s (%s; %s)", new Object[]{((m60.d) ((m60.e) obj)).d(), y10.c.f136621a, Build.VERSION.RELEASE});
            default:
                yq0.t tVar = (yq0.t) obj;
                return "(pinalytics) " + tVar.getF22560r0() + "-" + tVar.getF22561s0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (((lh0.g1) r0.f83439a).o("android_search_client_cache_delay", "enabled_no_cache", r1) == false) goto L20;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke() {
        /*
            r6 = this;
            java.lang.String r0 = "enabled"
            int r1 = r6.f92453i
            r2 = 1
            r3 = 0
            java.lang.Object r4 = r6.f92454j
            switch(r1) {
                case 1: goto L93;
                case 16: goto L71;
                case 17: goto L66;
                case 21: goto L30;
                case 25: goto L21;
                default: goto Lb;
            }
        Lb:
            boolean r0 = ff0.j.f62103a
            if (r0 != 0) goto L1c
            is1.l r4 = (is1.l) r4
            gz1.b r0 = r4.f73622c
            r1 = 0
            boolean r0 = r0.c(r1, r3, r3)
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r2 = r3
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L21:
            kotlin.jvm.internal.j0 r4 = (kotlin.jvm.internal.j0) r4
            java.lang.Object r0 = r4.f80434a
            j1.g1 r0 = (j1.g1) r0
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.f74073b
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
        L30:
            android.content.Context r0 = kb0.a.f79058b
            android.app.Application r0 = m60.f0.W()
            int r0 = bf.b.O(r0)
            r1 = 2012(0x7dc, float:2.82E-42)
            if (r0 <= r1) goto L60
            gp1.l r4 = (gp1.l) r4
            lh0.n1 r0 = r4.f65939a
            lh0.z3 r1 = lh0.z3.DO_NOT_ACTIVATE_EXPERIMENT
            r0.getClass()
            java.lang.String r4 = "group"
            java.lang.String r5 = "enabled_no_cache"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            java.lang.String r4 = "activate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            lh0.z0 r0 = r0.f83439a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r4 = "android_search_client_cache_delay"
            boolean r0 = r0.o(r4, r5, r1)
            if (r0 != 0) goto L60
            goto L61
        L60:
            r2 = r3
        L61:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L66:
            nl1.d r4 = (nl1.d) r4
            boolean r0 = r4.Z6()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L71:
            ek1.x1 r4 = (ek1.x1) r4
            lh0.r2 r1 = r4.f59393b
            r1.getClass()
            lh0.z3 r4 = lh0.a4.f83298b
            lh0.z0 r1 = r1.f83469a
            lh0.g1 r1 = (lh0.g1) r1
            java.lang.String r5 = "android_image_placeholder_adjust_sba_timestamps"
            boolean r0 = r1.o(r5, r0, r4)
            if (r0 != 0) goto L8e
            boolean r0 = r1.l(r5)
            if (r0 == 0) goto L8d
            goto L8e
        L8d:
            r2 = r3
        L8e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L93:
            dy.a r4 = (dy.a) r4
            lh0.f2 r1 = r4.f56511d
            r1.getClass()
            lh0.z3 r4 = lh0.a4.f83298b
            lh0.z0 r1 = r1.f83345a
            lh0.g1 r1 = (lh0.g1) r1
            java.lang.String r5 = "android_appsflyer_disabled"
            boolean r0 = r1.o(r5, r0, r4)
            if (r0 != 0) goto Lb0
            boolean r0 = r1.l(r5)
            if (r0 == 0) goto Laf
            goto Lb0
        Laf:
            r2 = r3
        Lb0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nx.r0.invoke():java.lang.Boolean");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z13;
        boolean z14;
        bk.m mVar;
        AttributeSet attributeSet = null;
        int i13 = 1;
        switch (this.f92453i) {
            case 0:
                s0 s0Var = (s0) this.f92454j;
                synchronized (s0Var.f92458c) {
                    s0Var.g();
                }
                return Unit.f80348a;
            case 1:
                return invoke();
            case 2:
                return new y4((w4) this.f92454j);
            case 3:
                HashMap hashMap = new HashMap();
                y10.a aVar = (y10.a) this.f92454j;
                hashMap.put("User-Agent", (String) aVar.f136616c.f136620a.getValue());
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                hashMap.put("X-Pinterest-Device", MODEL);
                String a13 = aVar.f136614a.a();
                Intrinsics.checkNotNullExpressionValue(a13, "getInstallId(...)");
                hashMap.put("X-Pinterest-InstallId", a13);
                String str = (String) aVar.f136618e.getValue();
                if (str == null) {
                    str = "";
                }
                hashMap.put("X-Pinterest-Device-HardwareId", str);
                String MANUFACTURER = Build.MANUFACTURER;
                Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                hashMap.put("X-Pinterest-Device-Manufacturer", MANUFACTURER);
                hashMap.put("X-Pinterest-App-Type-Detailed", String.valueOf(hf0.b.a().getValue()));
                if (ff0.j.b()) {
                    hashMap.put("X-Pinterest-Force-Experiments", "ads_others_board_feed=enabled&stela_monetization=enabled&android_flashlight_polka=enabled_onecol");
                    hashMap.put("X-Pinterest-Integration-Test-Mode", "true");
                }
                return hashMap;
            case 4:
                return b();
            case 5:
                ((m60.d) ((ug0.i) this.f92454j).f122137b).g();
                return new vd0.c();
            case 6:
                sq0.e eVar = (sq0.e) this.f92454j;
                return eVar.T8(eVar.B0);
            case 7:
                return (sq0.h0) this.f92454j;
            case 8:
                yq0.j jVar = (yq0.j) this.f92454j;
                qa2.j0 pinGridCellFactory = jVar.getPinGridCellFactory();
                Context context = jVar.f139711b ? kh2.s0.c1(jVar.getContext()) : jVar.getContext();
                d0 pinalytics = jVar.getPinalytics();
                qa2.d dVar = (qa2.d) pinGridCellFactory;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                qa2.h0 a14 = dVar.a(context, true);
                a14.setPinalytics(pinalytics);
                return a14;
            case 9:
                ab2.d dVar2 = PinVideoGridCell.Companion;
                PinPromotedVideoViewCreator pinPromotedVideoViewCreator = (PinPromotedVideoViewCreator) this.f92454j;
                z13 = pinPromotedVideoViewCreator.excludeVR;
                return ab2.d.b(dVar2, z13 ? kh2.s0.c1(pinPromotedVideoViewCreator.getContext()) : pinPromotedVideoViewCreator.getContext(), pinPromotedVideoViewCreator.getPinalytics(), pinPromotedVideoViewCreator.getScope(), true, false, null, pinPromotedVideoViewCreator.getGridFeatureConfig().f103320a, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN);
            case 10:
                return b();
            case 11:
                SingleColumnCarouselPinViewCreator singleColumnCarouselPinViewCreator = (SingleColumnCarouselPinViewCreator) this.f92454j;
                z14 = singleColumnCarouselPinViewCreator.excludeVR;
                return new SingleColumnCarouselPinView(z14 ? kh2.s0.c1(singleColumnCarouselPinViewCreator.getContext()) : singleColumnCarouselPinViewCreator.getContext(), singleColumnCarouselPinViewCreator.getScope(), singleColumnCarouselPinViewCreator.getPinalytics(), singleColumnCarouselPinViewCreator.getNetworkStateStream());
            case 12:
                Object obj = ((wk2.a) ((Map.Entry) this.f92454j).getValue()).get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (vq0.h) obj;
            case 13:
                return ((zy.q0) this.f92454j).a();
            case 14:
                ij1.j jVar2 = (ij1.j) this.f92454j;
                GestaltAvatar gestaltAvatar = new GestaltAvatar(6, jVar2.f72358n, attributeSet);
                gestaltAvatar.H2(new u00.e(jVar2, 16));
                return gestaltAvatar;
            case 15:
                Context context2 = ((View) this.f92454j).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new va2.h(context2);
            case 16:
                return invoke();
            case 17:
                return invoke();
            case 18:
                Context context3 = ((GestaltTab) this.f92454j).getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return gm1.b.R1(context3, eo1.a.comp_tabs_theme);
            case 19:
                return new xn1.h(((GestaltTextField) ((u5.x) this.f92454j).f120537c).getId());
            case 20:
                return (tu1.n) this.f92454j;
            case 21:
                return invoke();
            case 22:
                ((rp1.d) this.f92454j).getClass();
                CookieManager cookieManager = CookieManager.getInstance();
                Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
                return cookieManager;
            case 23:
                return new vq1.e((androidx.appcompat.widget.x) this.f92454j, i13);
            case 24:
                AlertContainer alertContainer = ((UnauthActivity) this.f92454j).f49763i;
                if (alertContainer != null) {
                    return alertContainer;
                }
                Intrinsics.r("alertContainer");
                throw null;
            case 25:
                return invoke();
            case 26:
                lr1.e eVar2 = (lr1.e) this.f92454j;
                return eVar2.f84593b.a(eVar2.f84594c, eVar2.f84595d);
            case 27:
                return invoke();
            case 28:
                Context context4 = (at1.d) this.f92454j;
                synchronized (jk.v.class) {
                    try {
                        if (jk.v.f76358a == null) {
                            jk.h hVar = new jk.h();
                            Context applicationContext = context4.getApplicationContext();
                            if (applicationContext != null) {
                                context4 = applicationContext;
                            }
                            hVar.f76337a = new h6.q(context4);
                            jk.v.f76358a = hVar.a();
                        }
                        mVar = jk.v.f76358a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                jk.b bVar = (jk.b) ((kk.o) mVar.f23089l).zza();
                Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
                return bVar;
            default:
                return Integer.valueOf(bs1.c.Z((ru1.i) this.f92454j, eo1.c.lego_border_width_large) * 2);
        }
    }
}
