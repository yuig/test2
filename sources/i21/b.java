package i21;

import a.o3;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.x2;
import g21.e;
import h32.d4;
import h32.u0;
import is1.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.f0;
import m60.s0;
import m60.w;
import np0.f;
import nx.b0;
import nx.d1;
import pk.a0;
import rq.m1;
import uj2.q;
import uk1.d;
import xi0.h;
import xv.g;
import z32.o;
import zp.y0;

/* loaded from: classes5.dex */
public final class b extends vq0.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public e f71430c;

    /* renamed from: d, reason: collision with root package name */
    public final h21.f f71431d;

    /* renamed from: e, reason: collision with root package name */
    public final np0.e f71432e;

    /* renamed from: f, reason: collision with root package name */
    public final String f71433f;

    /* renamed from: g, reason: collision with root package name */
    public final g21.b f71434g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f71435h;

    /* renamed from: i, reason: collision with root package name */
    public final h21.c f71436i;

    /* renamed from: j, reason: collision with root package name */
    public final w f71437j;

    /* renamed from: k, reason: collision with root package name */
    public final l f71438k;

    /* renamed from: l, reason: collision with root package name */
    public vh f71439l;

    /* renamed from: m, reason: collision with root package name */
    public int f71440m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e viewModel, h21.f pinModelCreator, np0.e closeupNavigator, String trafficSource, g21.b deepLinkExtras, d presenterPinalytics, u0 u0Var, HashMap hashMap, boolean z13, int i13, int i14, h21.c cVar, w eventManager, q networkStateStream, l uriNavigator, d1 trackingParamAttacher, f0 impressionDebugUtils, t pinSwipePreferences, b0 pinAuxHelper, ur.a adsCoreDependencies) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(pinModelCreator, "pinModelCreator");
        Intrinsics.checkNotNullParameter(closeupNavigator, "closeupNavigator");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        Intrinsics.checkNotNullParameter(deepLinkExtras, "deepLinkExtras");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(impressionDebugUtils, "impressionDebugUtils");
        Intrinsics.checkNotNullParameter(pinSwipePreferences, "pinSwipePreferences");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f71430c = viewModel;
        this.f71431d = pinModelCreator;
        this.f71432e = closeupNavigator;
        this.f71433f = trafficSource;
        this.f71434g = deepLinkExtras;
        this.f71435h = z13;
        this.f71436i = cVar;
        this.f71437j = eventManager;
        this.f71438k = uriNavigator;
        o3 o3Var = new o3(1, this, pinSwipePreferences);
        closeupNavigator.f91749b = this;
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, new yo0.a(o3Var, presenterPinalytics, networkStateStream, u0Var, hashMap, trackingParamAttacher, pinAuxHelper, adsCoreDependencies));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL, new sz0.a(11));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL, new g(this.f71439l, presenterPinalytics, trackingParamAttacher, impressionDebugUtils));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE, new k21.a(i13, i14));
    }

    @Override // vq0.g
    /* renamed from: D3, reason: merged with bridge method [inline-methods] */
    public final void r3(g21.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        j21.f fVar = (j21.f) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        fVar.f74507j = this;
        if (this.f71435h) {
            fVar.f74508k = (RelativeLayout) fVar.findViewById(ty1.c.pin_carousel_header_container);
            fVar.setVisibility(0);
            RelativeLayout relativeLayout = fVar.f74508k;
            fVar.f74509l = relativeLayout != null ? (GestaltText) relativeLayout.findViewById(ty1.c.pin_carousel_title) : null;
            RelativeLayout relativeLayout2 = fVar.f74508k;
            fVar.f74510m = relativeLayout2 != null ? (FrameLayout) relativeLayout2.findViewById(ty1.c.pin_carousel_title_background) : null;
            fVar.setVisibility(0);
            RelativeLayout relativeLayout3 = fVar.f74508k;
            GestaltText gestaltText = relativeLayout3 != null ? (GestaltText) relativeLayout3.findViewById(ty1.c.pin_carousel_subtitle) : null;
            fVar.f74511n = gestaltText;
            if (gestaltText != null) {
                gestaltText.i(j21.d.f74494k);
            }
            RelativeLayout relativeLayout4 = fVar.f74508k;
            fVar.f74512o = relativeLayout4 != null ? (GestaltButton) relativeLayout4.findViewById(ty1.c.pin_carousel_action_button) : null;
            RelativeLayout relativeLayout5 = fVar.f74508k;
            fVar.f74513p = relativeLayout5 != null ? (GestaltIconButton) relativeLayout5.findViewById(ty1.c.pin_carousel_forward_arrow) : null;
        }
        H3(this.f71430c);
        G3();
    }

    public final void F3(vh story, int i13) {
        ih ihVar;
        String e13;
        g21.a aVar;
        String e14;
        Intrinsics.checkNotNullParameter(story, "story");
        this.f71439l = story;
        if (story != null) {
            List list = story.f42865w;
            Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof f30) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f30 data = (f30) it.next();
                h21.f fVar = this.f71431d;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                arrayList2.add(new h21.b(data, fVar.f66568a, fVar.f66569b, fVar.f66570c, fVar.f66571d));
            }
            x3(arrayList2);
            ih ihVar2 = story.f42857o;
            z32.l a13 = ihVar2 != null ? ihVar2.a() : null;
            z32.l lVar = z32.l.END_OVERLAY;
            int i14 = 1;
            int i15 = 0;
            if (a13 == lVar && (!d().isEmpty()) && (d().get(0) instanceof h21.b)) {
                Object obj2 = d().get(0);
                Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.feature.pincarousel.model.PinCarouselBaseModel.FixedSizePinModel");
                h21.b bVar = (h21.b) obj2;
                ih ihVar3 = story.f42857o;
                if (ihVar3 != null && (e14 = ihVar3.e()) != null) {
                    h21.c cVar = this.f71436i;
                    if (cVar == null) {
                        o21.b bVar2 = bVar.f66547b;
                        cVar = new h21.c(bVar2.f92799h, bVar2.f92800i, "", new a(this, story, e14, i15), story.f42857o.g(), false, Integer.valueOf(ty1.a.pinterest_super_light_gray_translucent), Integer.valueOf(eo1.b.color_themed_text_default), null, null, Integer.valueOf(s0.chevron_black), Integer.valueOf(eo1.b.color_black_900), null, 4896, null);
                    }
                    x3(CollectionsKt.m0(cVar, d()));
                }
            } else if (!d().isEmpty()) {
                ih ihVar4 = story.f42857o;
                if ((ihVar4 != null ? ihVar4.a() : null) == z32.l.HEADER_AND_END_OVERFLOW && (CollectionsKt.d0(d()) instanceof h21.d) && (ihVar = story.f42857o) != null && (e13 = ihVar.e()) != null) {
                    Object d03 = CollectionsKt.d0(d());
                    Intrinsics.g(d03, "null cannot be cast to non-null type com.pinterest.feature.pincarousel.model.PinCarouselBaseModel.MiniPinCellModel");
                    String B0 = bs1.c.B0(((h21.d) d03).f66566a);
                    Intrinsics.f(B0);
                    x3(CollectionsKt.m0(new h21.c(0, 0, B0, new a(this, story, e13, i14), story.f42857o.g(), false, Integer.valueOf(eo1.b.color_themed_background_wash_dark), Integer.valueOf(eo1.b.color_themed_text_light), null, null, Integer.valueOf(s0.ic_arrow_circle_forward_nonpds), Integer.valueOf(eo1.b.color_white_0), re0.a.XXLARGE, 800, null), d().subList(0, this.f126435b.size() - 1)));
                }
            }
            ih ihVar5 = story.f42857o;
            if (ihVar5 == null || ihVar5.a() == lVar || ihVar5.g() == null || ihVar5.e() == null) {
                aVar = null;
            } else {
                String g13 = ihVar5.g();
                Intrinsics.checkNotNullExpressionValue(g13, "getActionText(...)");
                String e15 = ihVar5.e();
                Intrinsics.checkNotNullExpressionValue(e15, "getActionDeepLink(...)");
                o c13 = ihVar5.c();
                Intrinsics.checkNotNullExpressionValue(c13, "getActionButtonStyle(...)");
                aVar = new g21.a(g13, e15, c13);
            }
            kj kjVar = story.f42855m;
            String a14 = kjVar != null ? kjVar.a() : null;
            kj kjVar2 = story.f42856n;
            H3(new e(a14, kjVar2 != null ? kjVar2.a() : null, aVar));
            G3();
        }
        this.f71440m = i13;
    }

    public final void G3() {
        if (isBound()) {
            g21.d dVar = (g21.d) getView();
            vh vhVar = this.f71439l;
            String uid = vhVar != null ? vhVar.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            vh vhVar2 = this.f71439l;
            String u13 = vhVar2 != null ? vhVar2.u() : null;
            g21.f data = new g21.f(uid, u13 != null ? u13 : "", this.f71440m);
            ((j21.f) dVar).getClass();
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    public final void H3(e viewModel) {
        RelativeLayout relativeLayout;
        this.f71430c = viewModel;
        if (isBound()) {
            j21.f fVar = (j21.f) ((g21.d) getView());
            fVar.getClass();
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            String str = viewModel.f63395h;
            GestaltText gestaltText = fVar.f74509l;
            int i13 = 27;
            if (gestaltText != null) {
                gestaltText.i(new zu0.c(str, i13));
            }
            FrameLayout frameLayout = fVar.f74510m;
            if (frameLayout != null) {
                if (str == null || str.length() == 0) {
                    bs1.c.X0(frameLayout);
                } else {
                    bs1.c.U1(frameLayout);
                }
            }
            GestaltText gestaltText2 = fVar.f74511n;
            String str2 = viewModel.f63396i;
            if (gestaltText2 != null) {
                gestaltText2.i(new zu0.c(str2, i13));
            }
            g21.a aVar = viewModel.f63397j;
            String str3 = aVar != null ? aVar.f63387i : null;
            if (str3 != null && (relativeLayout = fVar.f74508k) != null) {
                relativeLayout.setOnClickListener(new y0(fVar, relativeLayout, str3, 21));
            }
            RelativeLayout relativeLayout2 = fVar.f74508k;
            if (relativeLayout2 != null) {
                String str4 = viewModel.f63395h;
                if ((str4 == null || str4.length() == 0) && ((str2 == null || str2.length() == 0) && (str3 == null || str3.length() == 0))) {
                    bs1.c.X0(relativeLayout2);
                } else {
                    bs1.c.U1(relativeLayout2);
                }
            }
            if (aVar == null) {
                GestaltButton gestaltButton = fVar.f74512o;
                if (gestaltButton != null) {
                    a0.l0(gestaltButton);
                }
                GestaltIconButton gestaltIconButton = fVar.f74513p;
                if (gestaltIconButton != null) {
                    com.bumptech.glide.c.d0(gestaltIconButton);
                    return;
                }
                return;
            }
            GestaltButton gestaltButton2 = fVar.f74512o;
            if (gestaltButton2 != null) {
                gestaltButton2.d(new h(aVar, 1));
                gestaltButton2.e(new m1(fVar, aVar, gestaltButton2, 8));
            }
            GestaltIconButton gestaltIconButton2 = fVar.f74513p;
            if (gestaltIconButton2 != null) {
                gestaltIconButton2.t(new h(aVar, 2));
                gestaltIconButton2.u(new m1(fVar, aVar, gestaltIconButton2, 9));
            }
        }
    }

    @Override // np0.f
    public final void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        String lowerCase = d4.FEED.toString().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        v4(pinUid, pinFeed, i13, i14, new i01.d(str, lowerCase, new ArrayList(e0.b(pinUid)), null));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        h21.e eVar = (h21.e) getItem(i13);
        if (eVar != null) {
            return eVar.getViewType();
        }
        return -2;
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }

    @Override // np0.f
    public final void v4(String pinUid, PinFeed pinFeed, int i13, int i14, i01.e metadataProvider) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        NavigationImpl z03 = Navigation.z0((ScreenLocation) x2.f51567a.getValue(), pinUid);
        bs1.c.j(z03, pinFeed, i13, metadataProvider.f(), metadataProvider.z(), metadataProvider.y(), metadataProvider.w(), this.f71433f, getPinalytics(), null);
        this.f71437j.d(z03);
    }
}
