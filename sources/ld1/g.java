package ld1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.components.users.LegoUserRep;
import d91.l;
import ed1.m;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kh2.u2;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import nx.f0;
import oa2.t;
import uj2.q;
import yk1.n;
import yk1.r;
import yl1.i;

/* loaded from: classes5.dex */
public final class g extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final ze1.c f82985a;

    /* renamed from: b, reason: collision with root package name */
    public vh f82986b;

    /* renamed from: c, reason: collision with root package name */
    public final j f82987c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f82988d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82989e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f82990f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f82991g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f82992h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uk1.d presenterPinalytics, q networkStateStream, ze1.c apiParams, boolean z13, String str, Function0 commerceAuxData, f0 f0Var) {
        super(presenterPinalytics, networkStateStream);
        j storyImpressionHelper = new j(16, 0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        this.f82985a = apiParams;
        this.f82986b = null;
        this.f82987c = storyImpressionHelper;
        this.f82988d = z13;
        this.f82989e = str;
        this.f82990f = commerceAuxData;
        this.f82991g = f0Var;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        c view = (c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        vh vhVar = this.f82986b;
        if (vhVar != null) {
            q3(vhVar, this.f82992h, this.f82988d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public final void q3(vh story, Integer num, boolean z13) {
        uk1.d presenterPinalytics;
        String str;
        uk1.d dVar;
        HashMap hashMap;
        String str2;
        ?? r112;
        wy0 user;
        GestaltText gestaltText;
        Intrinsics.checkNotNullParameter(story, "story");
        this.f82988d = z13;
        this.f82986b = story;
        this.f82992h = num;
        if (isBound()) {
            HashMap a13 = oe1.c.a(story, this.f82990f);
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(a13);
            hashMap2.remove("image_signature");
            f0 f0Var = this.f82991g;
            if (f0Var != null) {
                uk1.d presenterPinalytics2 = getPresenterPinalytics();
                g0 g0Var = g0.PIN_CLOSEUP_BRAND_CATALOG;
                String uid = story.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                presenterPinalytics = oe1.c.c(presenterPinalytics2, g0Var, hashMap2, uid, f0Var);
            } else {
                presenterPinalytics = getPresenterPinalytics();
            }
            uk1.d dVar2 = presenterPinalytics;
            story.f42859q = a13;
            ih ihVar = story.f42857o;
            String e13 = ihVar != null ? ihVar.e() : null;
            ih ihVar2 = story.f42857o;
            int i13 = 0;
            if (ihVar2 == null || (user = ihVar2.h()) == null) {
                str = "story";
                dVar = dVar2;
                hashMap = hashMap2;
                str2 = "getContext(...)";
                r112 = 0;
            } else {
                c cVar = (c) getView();
                kj kjVar = story.f42856n;
                String a14 = kjVar != null ? kjVar.a() : null;
                f fVar = new f(i13, user);
                m mVar = new m(this, dVar2, hashMap2, 2);
                String str3 = a14;
                dVar = dVar2;
                str2 = "getContext(...)";
                hashMap = hashMap2;
                str = "story";
                boolean z14 = false;
                e userRepActionListener = new e(this, e13, user, dVar2, hashMap2, fVar, mVar);
                String g13 = story.f42857o.g();
                Intrinsics.checkNotNullExpressionValue(g13, "getActionText(...)");
                yl1.b actionButtonState = new yl1.b(bs1.c.h2(g13), false, null, null, i.b(), null, null, null, 0, null, 1006);
                b bVar = (b) cVar;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(userRepActionListener, "userRepActionListener");
                Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
                r112 = z14;
                if (bVar.f82972g == null) {
                    bVar.setVisibility(0);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    Context context = bVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, str2);
                    LegoUserRep legoUserRep = new LegoUserRep(context);
                    Context context2 = legoUserRep.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, str2);
                    rl1.g c13 = rl1.n.c(rl1.n.f(context2), dl2.b.s0(user), dl2.b.M0(user), dl2.b.W1(user) && !z13);
                    int i14 = z13 ? sm1.b.ic_check_circle_gestalt : 0;
                    u2.T0(legoUserRep, userRepActionListener);
                    legoUserRep.y1(ze0.a.List);
                    legoUserRep.H0(c13);
                    t.i4(legoUserRep, dl2.b.i1(user), i14, Integer.valueOf(eo1.b.color_blue_500), 8);
                    legoUserRep.t0(false);
                    legoUserRep.G0(actionButtonState);
                    legoUserRep.M1(vn1.h.f126278d);
                    legoUserRep.setLayoutParams(layoutParams);
                    bVar.f82973h = legoUserRep;
                    int i15 = bVar.f82974i;
                    if (str3 == null || str3.length() == 0) {
                        gestaltText = null;
                    } else {
                        Context context3 = bVar.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, str2);
                        GestaltText i16 = new GestaltText(6, context3, (AttributeSet) null).i(a.f82965i);
                        i16.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        i16.setPaddingRelative(0, i15, 0, 0);
                        gestaltText = i16.i(new l(str3, 13));
                    }
                    LinearLayout linearLayout = new LinearLayout(bVar.getContext());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setPaddingRelative(i15, i15, i15, i15);
                    linearLayout.setOrientation(1);
                    linearLayout.addView(bVar.f82973h);
                    if (gestaltText != null) {
                        linearLayout.addView(gestaltText);
                    }
                    bVar.f82972g = linearLayout;
                    bVar.addView(linearLayout, 0);
                    r112 = z14;
                }
            }
            List list = story.f42865w;
            Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof f30) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() > 6) {
                List list2 = story.f42865w;
                Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof f30) {
                        arrayList2.add(obj2);
                    }
                }
                story.f42865w = arrayList2.subList(r112, 6);
            }
            b bVar2 = (b) ((c) getView());
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(this, "storyImpressionListener");
            bVar2.f82976k = this;
            c cVar2 = (c) getView();
            q<Boolean> networkStateStream = getNetworkStateStream();
            b bVar3 = (b) cVar2;
            bVar3.getClass();
            Intrinsics.checkNotNullParameter(story, str);
            uk1.d presenterPinalytics3 = dVar;
            Intrinsics.checkNotNullParameter(presenterPinalytics3, "presenterPinalytics");
            Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
            ze1.c apiParams = this.f82985a;
            Intrinsics.checkNotNullParameter(apiParams, "apiParams");
            HashMap auxData = hashMap;
            Intrinsics.checkNotNullParameter(auxData, "auxData");
            if (bVar3.f82971f != null) {
                return;
            }
            u0 u0Var = u0.SHOPPING_DOMAIN_MODULE_CAROUSEL_PIN;
            i21.c cVar3 = bVar3.f82970e;
            if (cVar3 == null) {
                Intrinsics.r("pinCarouselPresenterFactory");
                throw null;
            }
            g21.e eVar = new g21.e(null, null, null);
            int j13 = hf0.b.j(bVar3.getContext());
            int i17 = bVar3.f82975j;
            h21.f fVar2 = new h21.f(ph.a.a0(j13, i17, i17), r112, new ze1.a(true, true, r112), RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
            np0.e eVar2 = new np0.e(bVar3.f82968c);
            String str4 = apiParams.f141808a;
            i21.b a15 = i21.c.a(cVar3, eVar, fVar2, eVar2, str4 == null ? "unknown" : str4, new g21.b(z0.f(new Pair("source", str4), new Pair("search_query", apiParams.f141809b)), 1), presenterPinalytics3, u0Var, auxData, 0, 0, 3584);
            Context context4 = bVar3.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, str2);
            j21.f fVar3 = new j21.f(context4, presenterPinalytics3.f122379a, networkStateStream, new j21.b(0, 0, 0, 0), "medium", null, eo1.c.space_200, false, 352);
            fVar3.setPaddingRelative(i17, 0, i17, 0);
            yk1.j.a().d(fVar3, a15);
            a15.F3(story, 0);
            bVar3.addView(fVar3);
            bVar3.f82971f = fVar3;
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        c view = (c) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        vh vhVar = this.f82986b;
        if (vhVar != null) {
            q3(vhVar, this.f82992h, this.f82988d);
        }
    }
}
