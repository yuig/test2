package ra0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.pinterest.api.model.a5;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.i5;
import com.pinterest.api.model.m5;
import com.pinterest.api.model.o4;
import com.pinterest.api.model.wy0;
import com.pinterest.collagesCoreLibrary.effects.EffectSliderView;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.creatorHub.feature.hub.data.CreatorHubRecentPinsRemoteRequest;
import com.pinterest.gestalt.callout.GestaltCallout;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.b1;
import com.pinterest.screens.c1;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.j1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import uc0.r2;
import uc0.s2;
import uc0.t2;
import uc0.w2;
import x02.x2;

/* loaded from: classes5.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106957i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f106958j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, int i13) {
        super(1);
        this.f106957i = i13;
        this.f106958j = obj;
    }

    public final void b(float f13) {
        int i13 = this.f106957i;
        Object obj = this.f106958j;
        switch (i13) {
            case 3:
                EffectSliderView effectSliderView = (EffectSliderView) obj;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = effectSliderView.f44675h;
                parcelableSnapshotMutableState.setValue(va0.j.a((va0.j) parcelableSnapshotMutableState.getValue(), f13, 0.0f, 0.0f, 6));
                effectSliderView.f44678k.invoke(Float.valueOf(f13));
                break;
            default:
                va0.o oVar = (va0.o) obj;
                oVar.f125142e.invoke(oVar.f125138a, Float.valueOf(f13), Boolean.TRUE);
                break;
        }
    }

    public final void e(q1.x LazyColumn) {
        int i13 = this.f106957i;
        Object obj = this.f106958j;
        switch (i13) {
            case 13:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                tc0.y yVar = (tc0.y) obj;
                i1.h hVar = new i1.h(yVar, 13);
                Object obj2 = q2.i.f102113a;
                q1.x.a(LazyColumn, null, new q2.h(hVar, true, -474029758), 3);
                List list = yVar.f117359b;
                q1.i iVar = (q1.i) LazyColumn;
                iVar.s(list.size(), null, new u80.s(2, list, tc0.d.f117225j), new q2.h(new tc0.e(list, 0), true, -632812321));
                break;
            default:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                j1.K1(LazyColumn, "search-", ((r2) ((s2) obj)).f121857a);
                break;
        }
    }

    public final void f(vd0.c cVar) {
        int i13 = this.f106957i;
        Object obj = this.f106958j;
        switch (i13) {
            case 17:
                dd0.b bVar = (dd0.b) obj;
                x2 x2Var = bVar.f54440b;
                String uid = com.bumptech.glide.d.Q(bVar.f54441c).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                x2Var.Y(uid, dd0.a.f54434j);
                ed0.c cVar2 = (ed0.c) ((com.pinterest.creatorHub.feature.brandedContent.a) bVar.getView());
                cVar2.getClass();
                NavigationImpl w13 = Navigation.w1(b1.a());
                Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                cVar2.M1(w13);
                break;
            default:
                dd0.c cVar3 = (dd0.c) obj;
                cVar3.f54447e.d(md0.a.BRANDED_CONTENT_UNENROLLMENT_TAPPED);
                String uid2 = com.bumptech.glide.d.Q(cVar3.f54446d).getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                cVar3.f54445c.Y(uid2, dd0.a.f54436l);
                ((ed0.g) ((com.pinterest.creatorHub.feature.brandedContent.c) cVar3.getView())).getClass();
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(bs1.c.b2(pd0.c.branded_content_unenroll_toast_text));
                jc0.s sVar = new jc0.s();
                m60.w wVar = cVar3.f54443a;
                wVar.d(sVar);
                wVar.d(new ed0.q());
                break;
        }
    }

    public final void h(wm1.k0 bind) {
        int i13 = this.f106957i;
        Object obj = this.f106958j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.g gVar = (wm1.g) obj;
                em1.b checkedState = c0.d.Z(gVar.f130294c);
                Intrinsics.checkNotNullParameter(checkedState, "checkedState");
                em1.e enabledState = gVar.f130295d;
                Intrinsics.checkNotNullParameter(enabledState, "enabledState");
                fm1.c visibility = gVar.f130296e;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                wm1.g endItem = new wm1.g(checkedState, enabledState, visibility);
                bind.getClass();
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.f fVar = (wm1.f) obj;
                bm1.n selectedState = kh2.j.S(fVar.f130287e);
                wm1.b buttonType = fVar.f130285c;
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                u50.i0 buttonText = fVar.f130286d;
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                Intrinsics.checkNotNullParameter(selectedState, "selectedState");
                wm1.f endItem2 = new wm1.f(buttonType, buttonText, selectedState, fVar.f130288f);
                bind.getClass();
                Intrinsics.checkNotNullParameter(endItem2, "endItem");
                bind.f130313d = endItem2;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l82.i0 cVar;
        dl1.s d2;
        Iterator it;
        vd0.c m13;
        i5 j13;
        i5 j14;
        i5 j15;
        yl1.g colorPalette;
        int i13 = this.f106957i;
        int i14 = 0;
        u50.f0 f0Var = null;
        Object obj2 = this.f106958j;
        switch (i13) {
            case 0:
                n0 view = (n0) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                view.a((j0) obj2);
                return Unit.f80348a;
            case 1:
                sa0.s it2 = (sa0.s) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return sa0.s.b(it2, ((sa0.c) obj2).f112161a, null, 29);
            case 2:
                sa0.a it3 = (sa0.a) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return sa0.a.e(it3, null, ((sa0.d) obj2).f112162a, 1);
            case 3:
                b(((Number) obj).floatValue());
                return Unit.f80348a;
            case 4:
                b(((Number) obj).floatValue());
                return Unit.f80348a;
            case 5:
                o12.b collageFeed = (o12.b) obj;
                Intrinsics.checkNotNullParameter(collageFeed, "collageFeed");
                List list = collageFeed.f92783a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                for (Object obj3 : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    dl1.s sVar = (dl1.s) obj3;
                    if (sVar instanceof f30) {
                        cVar = new xa0.e(i14, (f30) sVar);
                    } else {
                        if (!(sVar instanceof fi0)) {
                            throw new IllegalArgumentException("Unexpected model type: " + sVar);
                        }
                        cVar = new xa0.c((fi0) sVar, i14);
                    }
                    arrayList.add(cVar);
                    i14 = i15;
                }
                boolean z13 = ((xa0.k) obj2).f134411d;
                String str = collageFeed.f92784b;
                if (z13 && ((str == null || str.length() == 0) && (!arrayList.isEmpty()))) {
                    arrayList = CollectionsKt.m0(xa0.b.f134395a, arrayList);
                }
                return new o82.l0(arrayList, str);
            case 6:
                om1.c it4 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return om1.c.e(it4, null, null, null, ((xa0.a) obj2).f134392e ? fm1.c.VISIBLE : fm1.c.GONE, null, false, 0, 1015);
            case 7:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108897l = View.generateViewId();
                bind.c(rn1.b.END);
                Context context = ((LegoBoardRep) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                bind.h(pk.a0.t(context));
                bind.a(kotlin.collections.e0.b(vn1.b.START));
                bind.d(kotlin.collections.e0.b(vn1.e.BOLD));
                return Unit.f80348a;
            case 8:
                WebImageView view2 = (WebImageView) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                view2.w1();
                view2.setImageBitmap((Bitmap) obj2);
                return Unit.f80348a;
            case 9:
                z9.h0 navigate = (z9.h0) obj;
                Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                int i16 = z9.b0.f141159o;
                int i17 = g4.u.g0(((z9.e0) obj2).i()).f141329h;
                qc0.h popUpToBuilder = qc0.h.f103518i;
                navigate.getClass();
                Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
                navigate.f141203d = i17;
                z9.t0 t0Var = new z9.t0();
                popUpToBuilder.invoke(t0Var);
                navigate.f141204e = t0Var.f141290a;
                navigate.f141201b = true;
                navigate.f141202c = true;
                return Unit.f80348a;
            case 10:
                Context context2 = (Context) obj;
                Intrinsics.checkNotNullParameter(context2, "context");
                u50.k0 j23 = bs1.c.j2(new String[0], oc0.q.component_callout_state_title);
                CharSequence a03 = df.j1.a0(context2.getString(oc0.q.component_callout_state_message));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return new GestaltCallout(context2, c0.d.q(j23, bs1.c.h2(a03), bs1.c.j2(new String[0], oc0.q.component_callout_state_primary_action_button_text), bs1.c.j2(new String[0], oc0.q.component_callout_state_secondary_action_button_text), (dm1.d) obj2, false, null, false, true, 0, null, 1760));
            case 11:
                h((wm1.k0) obj);
                return Unit.f80348a;
            case 12:
                h((wm1.k0) obj);
                return Unit.f80348a;
            case 13:
                e((q1.x) obj);
                return Unit.f80348a;
            case 14:
                uc0.z0 event = (uc0.z0) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                ((uc0.b1) obj2).i(event);
                return Unit.f80348a;
            case 15:
                String typedText = (String) obj;
                Intrinsics.checkNotNullParameter(typedText, "typedText");
                ((w2) obj2).i(new t2(typedText));
                return Unit.f80348a;
            case 16:
                e((q1.x) obj);
                return Unit.f80348a;
            case 17:
                f((vd0.c) obj);
                return Unit.f80348a;
            case 18:
                f((vd0.c) obj);
                return Unit.f80348a;
            case 19:
                vd0.c it5 = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                CreatorHubRecentPinsRemoteRequest creatorHubRecentPinsRemoteRequest = (CreatorHubRecentPinsRemoteRequest) obj2;
                vd0.b deserializePinterestJsonArrayWithBookmark = creatorHubRecentPinsRemoteRequest.deserializePinterestJsonArrayWithBookmark(it5);
                vd0.a aVar = deserializePinterestJsonArrayWithBookmark.f125619a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = aVar.iterator();
                while (it6.hasNext()) {
                    vd0.c cVar2 = (vd0.c) it6.next();
                    String o13 = cVar2.o("type", "");
                    Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
                    ke0.a aVar2 = creatorHubRecentPinsRemoteRequest.getRegisteredDeserializers().get(o13);
                    if (aVar2 == null || (d2 = aVar2.d(cVar2)) == null) {
                        throw new IllegalArgumentException(a.a.j("Cannot deserialize type ", o13));
                    }
                    arrayList2.add(d2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    Object next = it7.next();
                    if (next instanceof f30) {
                        arrayList3.add(next);
                    }
                }
                return new com.pinterest.framework.multisection.datasource.pagedlist.i0(deserializePinterestJsonArrayWithBookmark.f125620b, deserializePinterestJsonArrayWithBookmark.f125621c, arrayList3);
            case 20:
                vd0.c json = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(json, "json");
                gd0.f fVar = (gd0.f) obj2;
                fVar.getClass();
                ArrayList arrayList4 = new ArrayList();
                vd0.c m14 = json.m("data");
                vd0.a k13 = m14 != null ? m14.k(fVar.f64815n) : null;
                if (k13 != null) {
                    Iterator it8 = k13.iterator();
                    int i18 = 0;
                    while (it8.hasNext()) {
                        Object next2 = it8.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        vd0.c cVar3 = (vd0.c) next2;
                        String o14 = cVar3.o("experience_id", "");
                        Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
                        if (Integer.parseInt(o14) == i32.l.NOOP.value() || (m13 = cVar3.m("display_data")) == null) {
                            it = it8;
                        } else {
                            String o15 = m13.o("title", "");
                            Intrinsics.checkNotNullExpressionValue(o15, "optString(...)");
                            String o16 = m13.o("body", "");
                            Intrinsics.checkNotNullExpressionValue(o16, "optString(...)");
                            vd0.c m15 = m13.m("complete_cta");
                            Intrinsics.f(m15);
                            vd0.c m16 = m13.m("dismiss_cta");
                            Intrinsics.f(m16);
                            String o17 = m15.o("label", "");
                            Intrinsics.checkNotNullExpressionValue(o17, "optString(...)");
                            String o18 = m16.o("label", "");
                            Intrinsics.checkNotNullExpressionValue(o18, "optString(...)");
                            String o19 = m15.o("url", "");
                            Intrinsics.checkNotNullExpressionValue(o19, "optString(...)");
                            it = it8;
                            arrayList4.add(new hd0.g(o15, o16, o14, fVar.f64815n, i18, o17, o19, o18, fVar.f64814m, fVar.f64813l));
                        }
                        it8 = it;
                        i18 = i19;
                    }
                }
                return CollectionsKt.F0(arrayList4);
            case 21:
                o4 metrics = (o4) obj;
                Intrinsics.checkNotNullParameter(metrics, "metrics");
                gd0.g gVar = (gd0.g) obj2;
                int i23 = rd0.d.stats_module_title;
                wy0 wy0Var = (wy0) gVar.f64823r;
                String s03 = dl2.b.s0(wy0Var);
                String M0 = dl2.b.M0(wy0Var);
                String uid = wy0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                Integer q23 = wy0Var.q2();
                Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
                oa2.a aVar3 = new oa2.a(q23.intValue(), s03, M0, uid, false);
                Function0 function0 = (Function0) gVar.f64819n;
                Function1 function1 = (Function1) gVar.f64820o;
                a5 q13 = metrics.q();
                m5 F = (q13 == null || (j15 = q13.j()) == null) ? null : j15.F();
                Intrinsics.f(F);
                a5 q14 = metrics.q();
                m5 E = (q14 == null || (j14 = q14.j()) == null) ? null : j14.E();
                Intrinsics.f(E);
                a5 q15 = metrics.q();
                m5 S = (q15 == null || (j13 = q15.j()) == null) ? null : j13.S();
                Intrinsics.f(S);
                int i24 = rd0.d.stats_followers;
                int i25 = rd0.d.stats_range_alltime;
                Integer V2 = wy0Var.V2();
                Intrinsics.checkNotNullExpressionValue(V2, "getFollowerCount(...)");
                fd0.h hVar = new fd0.h(i24, i25, null, qb0.j.b(V2.intValue()));
                int i26 = rd0.d.stats_impressions;
                int i27 = rd0.d.stats_range_month;
                String b13 = qb0.j.b((int) F.j().doubleValue());
                Double f13 = F.f();
                Intrinsics.checkNotNullExpressionValue(f13, "getDelta(...)");
                fd0.h hVar2 = new fd0.h(i26, i27, gd0.g.w(f13.doubleValue()), b13);
                int i28 = rd0.d.stats_total_audience;
                int i29 = rd0.d.stats_range_month;
                String b14 = qb0.j.b((int) S.j().doubleValue());
                Double f14 = S.f();
                Intrinsics.checkNotNullExpressionValue(f14, "getDelta(...)");
                fd0.h hVar3 = new fd0.h(i28, i29, gd0.g.w(f14.doubleValue()), b14);
                int i33 = rd0.d.stats_engaged_audience;
                int i34 = rd0.d.stats_range_month;
                String b15 = qb0.j.b((int) E.j().doubleValue());
                Double f15 = E.f();
                Intrinsics.checkNotNullExpressionValue(f15, "getDelta(...)");
                return kotlin.collections.e0.b(new fd0.c(i23, aVar3, kotlin.collections.f0.j(hVar, hVar2, hVar3, new fd0.h(i33, i34, gd0.g.w(f15.doubleValue()), b15)), function0, function1));
            case 22:
                id0.e eVar = (id0.e) obj2;
                eVar.t3(md0.a.CREATOR_BRANDED_CONTENT_TAPPED);
                fd0.b bVar = (fd0.b) eVar.getView();
                Boolean Z3 = ((wy0) obj).Z3();
                Intrinsics.checkNotNullExpressionValue(Z3, "getPartnershipOptIn(...)");
                boolean booleanValue = Z3.booleanValue();
                kd0.b bVar2 = (kd0.b) bVar;
                if (((Boolean) bVar2.D0.getValue()).booleanValue()) {
                    NavigationImpl w13 = Navigation.w1(booleanValue ? c1.b() : c1.a());
                    Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                    bVar2.M1(w13);
                }
                return Unit.f80348a;
            case 23:
                rn1.a it9 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                return rn1.a.y(it9, bs1.c.h2(((hd0.j) obj2).f68873g), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 24:
                List it10 = (List) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                List<zd0.e> list2 = it10;
                zd0.d dVar = (zd0.d) obj2;
                ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                for (zd0.e eVar2 : list2) {
                    dVar.getClass();
                    arrayList5.add(new cw0.a(eVar2.f141672a, eVar2.f141673b, eVar2.f141674c, eVar2.f141675d, eVar2.f141676e, eVar2.f141677f));
                }
                return arrayList5;
            case 25:
                Integer it11 = (Integer) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Integer.valueOf(((kotlin.jvm.internal.h0) obj2).f80426a - it11.intValue());
            case 26:
                ((kotlin.jvm.internal.i0) obj2).f80432a = System.currentTimeMillis();
                return Unit.f80348a;
            case 27:
                ((sg0.f) obj2).f112866c.set(false);
                return Unit.f80348a;
            case 28:
                yl1.b it12 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                switch (ah0.c.f15175a[((i32.d0) obj2).ordinal()]) {
                    case 1:
                        colorPalette = yl1.d.PRIMARY.getColorPalette();
                        break;
                    case 2:
                        colorPalette = yl1.d.SECONDARY.getColorPalette();
                        break;
                    case 3:
                        colorPalette = yl1.d.TERTIARY.getColorPalette();
                        break;
                    case 4:
                        colorPalette = yl1.d.SHOPPING.getColorPalette();
                        break;
                    case 5:
                        colorPalette = yl1.d.ALWAYS_LIGHT.getColorPalette();
                        break;
                    case 6:
                        colorPalette = yl1.d.ALWAYS_DARK.getColorPalette();
                        break;
                    default:
                        colorPalette = yl1.d.SECONDARY.getColorPalette();
                        break;
                }
                return yl1.b.f(it12, null, false, null, null, colorPalette, null, null, null, 0, null, 1007);
            default:
                Intrinsics.checkNotNullParameter((dm1.c) obj, "it");
                hh0.e eVar3 = (hh0.e) obj2;
                int i35 = m60.x0.dismiss;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                u50.k0 k0Var = new u50.k0(i35, new ArrayList(0));
                Intrinsics.checkNotNullParameter(eVar3, "<this>");
                String str2 = ((fh0.a) eVar3.f69143e).f62148a;
                u50.f0 x13 = str2 != null ? ep.b.x(str2, "string", str2) : null;
                fh0.a aVar4 = (fh0.a) eVar3.f69143e;
                CharSequence string = df.j1.a0(aVar4.f62149b);
                Intrinsics.checkNotNullExpressionValue(string, "fromHtml(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                u50.f0 f0Var2 = new u50.f0(string);
                String str3 = aVar4.f62150c.f64994a;
                u50.f0 x14 = ep.b.x(str3, "string", str3);
                gh0.a aVar5 = aVar4.f62151d;
                if (aVar5 != null) {
                    String str4 = aVar5.f64994a;
                    f0Var = ep.b.x(str4, "string", str4);
                }
                return c0.d.q(x13, f0Var2, x14, f0Var, dm1.d.NEUTRAL, true, k0Var, false, true, 0, null, 1536);
        }
    }
}
