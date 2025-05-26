package me1;

import a.o3;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.p4;
import d91.l;
import h32.d4;
import h32.f1;
import h32.u0;
import is1.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import la1.k;
import ll.j;
import m60.r0;
import m60.s0;
import m60.w;
import ne1.b;
import np0.e;
import np0.f;
import nx.d0;
import uj2.q;
import uk1.d;
import x02.i2;
import yk1.c;
import yk1.r;

/* loaded from: classes5.dex */
public final class a extends c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f87039a;

    /* renamed from: b, reason: collision with root package name */
    public final w f87040b;

    /* renamed from: c, reason: collision with root package name */
    public final j f87041c;

    /* renamed from: d, reason: collision with root package name */
    public final s f87042d;

    /* renamed from: e, reason: collision with root package name */
    public vh f87043e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f87044f;

    /* renamed from: g, reason: collision with root package name */
    public final e f87045g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, w eventManager, j storyImpressionHelper, d presenterPinalytics, q networkStateStream, i2 pinRepository, s pinSwipePreferences) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinSwipePreferences, "pinSwipePreferences");
        this.f87039a = str;
        this.f87040b = eventManager;
        this.f87041c = storyImpressionHelper;
        this.f87042d = pinSwipePreferences;
        e eVar = new e(pinRepository);
        this.f87045g = eVar;
        eVar.f91749b = this;
    }

    @Override // np0.f
    public final void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        String lowerCase = d4.FEED.toString().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        v4(pinUid, pinFeed, i13, i14, new i01.d(this.f87039a, lowerCase, new ArrayList(e0.b(pinUid)), null));
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        GridLayout gridLayout = ((b) ((le1.a) getView())).f90465h;
        gridLayout.removeAllViews();
        gridLayout.setVisibility(8);
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(le1.a view) {
        q<Boolean> networkStateStream;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        vh vhVar = this.f87043e;
        if (vhVar != null && isBound()) {
            j0 j0Var = new j0();
            List list = vhVar.f42865w;
            Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof f30) {
                    arrayList.add(obj);
                }
            }
            j0Var.f80434a = arrayList;
            int size = arrayList.size();
            if (size > 0) {
                if (size >= 4) {
                    size = 4;
                }
                boolean z13 = false;
                j0Var.f80434a = ((List) j0Var.f80434a).subList(0, size);
                le1.a aVar = (le1.a) getView();
                kj kjVar = vhVar.f42855m;
                String title = kjVar != null ? kjVar.a() : null;
                if (title == null) {
                    title = "";
                }
                b bVar = (b) aVar;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                int length = title.length();
                GestaltText gestaltText = bVar.f90464g;
                if (length == 0) {
                    gestaltText.setVisibility(8);
                } else {
                    gestaltText.setText(title);
                    gestaltText.setVisibility(0);
                }
                o3 o3Var = new o3(2, this, j0Var);
                int i13 = (int) (hf0.b.f69002b / 2);
                le1.a aVar2 = (le1.a) getView();
                Iterable iterable = (Iterable) j0Var.f80434a;
                ArrayList arrayList2 = new ArrayList(g0.q(iterable, 10));
                int i14 = 0;
                for (Object obj2 : iterable) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    f30 f30Var = (f30) obj2;
                    d0 pinalytics = getPinalytics();
                    networkStateStream = getNetworkStateStream();
                    ze1.a aVar3 = new ze1.a(z13, true, true);
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new o21.c(f30Var, i13, i13, i14, 0, true, o3Var, pinalytics, networkStateStream, 0, null, null, null, aVar3, null, null, Intrinsics.d(vhVar.q(), "virtual_try_on_explore") ? Integer.valueOf(s0.ic_try_on_grid_nonpds) : null, false, null, null, false, false, 8240640));
                    arrayList2 = arrayList3;
                    i14 = i15;
                    z13 = false;
                }
                ArrayList viewModels = arrayList2;
                b bVar2 = (b) aVar2;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(viewModels, "viewModels");
                if (!viewModels.isEmpty()) {
                    bVar2.f90465h.setVisibility(0);
                }
                ih ihVar = vhVar.f42857o;
                if (ihVar != null) {
                    le1.a aVar4 = (le1.a) getView();
                    String action = ihVar.g();
                    Intrinsics.checkNotNullExpressionValue(action, "getActionText(...)");
                    String uri = ihVar.e();
                    Intrinsics.checkNotNullExpressionValue(uri, "getActionDeepLink(...)");
                    b bVar3 = (b) aVar4;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(action, "action");
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    if (bVar3.f90466i == null) {
                        Context context = bVar3.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context, (AttributeSet) null);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.topMargin = smallSecondaryButton.getResources().getDimensionPixelOffset(r0.margin_extra_small);
                        layoutParams.bottomMargin = smallSecondaryButton.getResources().getDimensionPixelOffset(r0.margin);
                        smallSecondaryButton.setLayoutParams(layoutParams);
                        smallSecondaryButton.d(new l(action, 17));
                        bVar3.addView(smallSecondaryButton);
                        bVar3.f90466i = smallSecondaryButton;
                    }
                    GestaltButton.SmallSecondaryButton smallSecondaryButton2 = bVar3.f90466i;
                    if (smallSecondaryButton2 != null) {
                        smallSecondaryButton2.e(new k(4, bVar3, uri));
                    }
                    bVar3.f90461d.h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.BOARD_SHOP_SHOW_MORE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                d0 d0Var = getPresenterPinalytics().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                d0.B(d0Var, f1.STORY_IMPRESSION_ONE_PIXEL, null, null, null, 30);
            }
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ((b) view).f90467j = this;
    }

    @Override // np0.f
    public final void v4(String pinUid, PinFeed pinFeed, int i13, int i14, i01.e metadataProvider) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        NavigationImpl z03 = Navigation.z0((ScreenLocation) p4.f51210c.getValue(), pinUid);
        String f13 = metadataProvider.f();
        String z13 = metadataProvider.z();
        int y13 = metadataProvider.y();
        ArrayList w13 = metadataProvider.w();
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        bs1.c.j(z03, pinFeed, i13, f13, z13, y13, w13, "shop_feed", d0Var, null);
        this.f87040b.d(z03);
    }
}
