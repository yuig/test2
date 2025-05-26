package dx0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import c50.t4;
import com.pinterest.api.model.deserializer.DynamicStoryDeserializer;
import com.pinterest.api.model.dh;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gb0;
import com.pinterest.api.model.h20;
import com.pinterest.api.model.ox;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.tx;
import com.pinterest.api.model.zs;
import com.pinterest.feature.modules.shopTheLookFocus.shopTheLookCarousel.ShopTheLookCarouselContainer;
import com.pinterest.feature.newshub.detail.remoterequest.FetchNewsHubDetailRetrofitRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.i0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.w2;
import com.pinterest.ui.imageview.ProportionalImageView;
import df.j1;
import dy0.o0;
import i01.z0;
import iz0.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.n1;
import ny0.w0;
import so.ba;
import tx0.a0;
import u50.k0;
import wt1.c0;
import x02.w1;
import y01.l0;
import zy.d0;
import zy.q0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56425i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f56426j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i13) {
        super(1);
        this.f56425i = i13;
        this.f56426j = obj;
    }

    public final rn1.a b(rn1.a it) {
        int i13;
        int i14 = this.f56425i;
        Object obj = this.f56426j;
        switch (i14) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = ((f) obj).f56427a;
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                String F = ((h20) obj).F();
                if (F == null) {
                    F = "";
                }
                return rn1.a.y(it, bs1.c.h2(F), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                z0 z0Var = (z0) obj;
                return rn1.a.y(it, bs1.c.h2(z0Var.f70707b), vn1.c.DEFAULT, null, e0.b(z0Var.f70706a ? vn1.e.BOLD : vn1.e.REGULAR), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097140);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = q01.u.f101832a[((q01.w) obj).f101838d.ordinal()];
                if (i15 == 1) {
                    i13 = n80.f.related_pins_filtered_feed_error_message;
                } else if (i15 == 2) {
                    i13 = n80.f.related_pins_filtered_feed_empty_text;
                } else {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = n80.f.related_pins_filtered_feed_footer_text;
                }
                return rn1.a.y(it, new k0(i13), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final yl1.b e(yl1.b it) {
        int i13 = this.f56425i;
        Object obj = this.f56426j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return ((ny0.f) obj).f92584b;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String v13 = ((gb0) obj).v();
                if (v13 == null) {
                    v13 = "";
                }
                return yl1.b.f(it, ep.b.x(v13, "string", v13), false, null, null, null, null, null, rm1.q.SHARE, 0, null, 894);
        }
    }

    public final void f(l82.n buildAndStart) {
        int i13 = this.f56425i;
        Object obj = this.f56426j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                q0 q0Var = ((ShopTheLookCarouselContainer) obj).f46776d;
                if (q0Var == null) {
                    Intrinsics.r("unscopedPinalyticsSEPFactory");
                    throw null;
                }
                d0 a13 = q0Var.a();
                buildAndStart.a(a13, new t4(5), a13.a());
                return;
            case 6:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                a0 a0Var = (a0) obj;
                mb0.a aVar = (mb0.a) a0Var.f119641f.f63225b;
                buildAndStart.a(aVar, new t4(6), aVar.a());
                mb0.a aVar2 = a0Var.f119639d;
                buildAndStart.a(aVar2, new t4(7), aVar2.a());
                mb0.a aVar3 = a0Var.f119640e;
                buildAndStart.a(aVar3, new t4(8), aVar3.a());
                return;
            case 8:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                o0 o0Var = (o0) obj;
                ey0.g gVar = o0Var.f56608c;
                buildAndStart.a(gVar, new t4(9), gVar.a());
                d0 d0Var = o0Var.f56609d;
                buildAndStart.a(d0Var, new t4(10), d0Var.a());
                return;
            case 12:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                w0 w0Var = (w0) obj;
                oy0.d dVar = w0Var.f92642c;
                buildAndStart.a(dVar, new t4(12), dVar.a());
                mb0.a aVar4 = (mb0.a) w0Var.f92651l.f63225b;
                buildAndStart.a(aVar4, new t4(11), aVar4.a());
                d0 d0Var2 = w0Var.f92643d;
                buildAndStart.a(d0Var2, new t4(13), d0Var2.a());
                nu.b bVar = w0Var.f92644e;
                buildAndStart.a(bVar, new t4(14), bVar.a());
                o22.k kVar = w0Var.f92649j;
                buildAndStart.a(kVar, new t4(15), kVar.a());
                return;
            case 14:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                yy0.e0 e0Var = (yy0.e0) obj;
                zy0.d dVar2 = e0Var.f140445c;
                buildAndStart.a(dVar2, new t4(16), dVar2.a());
                d0 d0Var3 = e0Var.f140446d;
                buildAndStart.a(d0Var3, new t4(17), d0Var3.a());
                return;
            case 15:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                fz0.u uVar = (fz0.u) obj;
                l82.n.b(buildAndStart, uVar.f63155c);
                w60.d dVar3 = uVar.f63156d;
                buildAndStart.a(dVar3, new t4(18), dVar3.a());
                i60.a aVar5 = uVar.f63157e;
                buildAndStart.a(aVar5, new t4(19), aVar5.a());
                return;
            default:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                g0 g0Var = (g0) obj;
                mb0.a aVar6 = (mb0.a) g0Var.f73912e.f63225b;
                buildAndStart.a(aVar6, new t4(20), aVar6.a());
                w60.d dVar4 = g0Var.f73911d;
                buildAndStart.a(dVar4, new t4(21), dVar4.a());
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z13;
        boolean z14;
        dl1.s d2;
        String str;
        nx0.c cVar;
        sq0.f fVar;
        sr srVar;
        sr srVar2;
        yl1.b bVar;
        iy0.a aVar;
        int i13 = this.f56425i;
        int i14 = 17;
        boolean z15 = true;
        int i15 = 0;
        bb2.f fVar2 = null;
        Object obj2 = this.f56426j;
        switch (i13) {
            case 0:
                f((l82.n) obj);
                return Unit.f80348a;
            case 1:
                return b((rn1.a) obj);
            case 2:
                vd0.c it = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                FetchNewsHubDetailRetrofitRemoteRequest fetchNewsHubDetailRetrofitRemoteRequest = (FetchNewsHubDetailRetrofitRemoteRequest) obj2;
                vd0.b deserializePinterestJsonArrayWithBookmark = fetchNewsHubDetailRetrofitRemoteRequest.deserializePinterestJsonArrayWithBookmark(it);
                vd0.a aVar2 = deserializePinterestJsonArrayWithBookmark.f125619a;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = aVar2.iterator();
                while (it2.hasNext()) {
                    vd0.c cVar2 = (vd0.c) it2.next();
                    String o13 = cVar2.o("type", "");
                    Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
                    ke0.a aVar3 = fetchNewsHubDetailRetrofitRemoteRequest.getRegisteredDeserializers().get(o13);
                    if (aVar3 == null || (d2 = aVar3.d(cVar2)) == null) {
                        throw new IllegalArgumentException(a.a.j("Cannot deserialize type ", o13));
                    }
                    arrayList.add(d2);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    dl1.s sVar = (dl1.s) it3.next();
                    if (sVar instanceof qx) {
                        qx newsHubItem = (qx) sVar;
                        if (tx.LEGAL == newsHubItem.u()) {
                            arrayList2.add(new kx0.u(fx0.a.ITEM_TYPE_SECTION_CONTENT, -1, newsHubItem, false, null, null, 48, null));
                        } else {
                            dh g13 = newsHubItem.g();
                            if (g13 == dh.DISPLAY_MODE_GRID || g13 == dh.DISPLAY_MODE_MIXED_GRID || g13 == dh.DISPLAY_MODE_GRID_WITH_COMPACT_BOARDS) {
                                gx0.e eVar = (gx0.e) fetchNewsHubDetailRetrofitRemoteRequest.f46785a;
                                eVar.getClass();
                                Intrinsics.checkNotNullParameter(newsHubItem, "newsHubItem");
                                Matcher matcher = eVar.N.matcher(newsHubItem.getUid());
                                Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
                                int i16 = -1;
                                while (matcher.find()) {
                                    i16 = matcher.group().hashCode();
                                }
                                g1.g gVar = eVar.O;
                                if (!gVar.containsKey(Integer.valueOf(i16))) {
                                    gVar.put(Integer.valueOf(i16), newsHubItem);
                                }
                                String q13 = newsHubItem.q();
                                if (q13 == null || q13.length() == 0) {
                                    z13 = z15;
                                    z14 = false;
                                } else {
                                    arrayList2.add(new kx0.u(fx0.a.ITEM_TYPE_SECTION_HEADER, i16, newsHubItem, true, null, null, 48, null));
                                    z14 = z15;
                                    z13 = false;
                                }
                                int i17 = (arrayList2.size() != 0 || z14) ? i16 : -1;
                                List list = newsHubItem.f41414u;
                                if (!list.isEmpty()) {
                                    LinkedList<dl1.s> linkedList = new LinkedList();
                                    Iterator it4 = list.iterator();
                                    while (it4.hasNext()) {
                                        dl1.s contentObject = ((ox) it4.next()).f40827a;
                                        if (contentObject != null) {
                                            Intrinsics.checkNotNullExpressionValue(contentObject, "contentObject");
                                            linkedList.add(contentObject);
                                        }
                                    }
                                    Iterator it5 = linkedList.iterator();
                                    boolean z16 = z13;
                                    while (it5.hasNext()) {
                                        arrayList2.add(new kx0.u(fx0.a.ITEM_TYPE_SINGLE_ITEM, i17, newsHubItem, z16, (dl1.s) it5.next(), null, 32, null));
                                        z16 = false;
                                        linkedList = linkedList;
                                    }
                                    for (dl1.s sVar2 : linkedList) {
                                        if (sVar2 instanceof f30) {
                                            fetchNewsHubDetailRetrofitRemoteRequest.f46787c.h(fetchNewsHubDetailRetrofitRemoteRequest.f46786b, (f30) sVar2);
                                        }
                                    }
                                    z15 = true;
                                }
                            }
                        }
                    }
                }
                return new i0(deserializePinterestJsonArrayWithBookmark.f125620b, deserializePinterestJsonArrayWithBookmark.f125621c, arrayList2);
            case 3:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                dv1.e eVar2 = ((kx0.o) obj2).f81076a1;
                return (eVar2 == null || (str = eVar2.f56394f) == null) ? bs1.c.o(new Pair[0]) : bs1.c.o(new Pair("news_id", str));
            case 4:
                c0 c0Var = (c0) obj;
                if (c0Var instanceof wt1.m) {
                    nx0.c cVar3 = (nx0.c) obj2;
                    sq0.f fVar3 = cVar3.H;
                    if (fVar3 != null) {
                        tl1.i iVar = c0Var.f131096b;
                        Intrinsics.g(iVar, "null cannot be cast to non-null type com.pinterest.multisection.datasource.StatefulList.State.Insert.Payload<com.pinterest.framework.repository.Model>");
                        int size = cVar3.f49127q.size() - ((wt1.l) iVar).f131122b.size();
                        if (cVar3.d2(size)) {
                            sq0.f.l(fVar3, cVar3.d(), size, sq0.y.DOWN);
                        }
                    }
                } else if ((c0Var instanceof wt1.y) && (fVar = (cVar = (nx0.c) obj2).H) != null) {
                    tl1.i iVar2 = c0Var.f131096b;
                    Intrinsics.g(iVar2, "null cannot be cast to non-null type com.pinterest.multisection.datasource.StatefulList.State.SetAll.Payload<com.pinterest.framework.repository.Model>");
                    int size2 = cVar.f49127q.size() - ((wt1.x) iVar2).f131130b.size();
                    if (cVar.d2(size2)) {
                        sq0.f.l(fVar, cVar.d(), size2, sq0.y.DOWN);
                    }
                }
                return Unit.f80348a;
            case 5:
                Intrinsics.checkNotNullParameter((View) obj, "it");
                w1 w1Var = ((tx0.o) obj2).H0;
                if (w1Var == null) {
                    Intrinsics.r("newsHubRepository");
                    throw null;
                }
                w12.a newsType = w12.a.None;
                Intrinsics.checkNotNullParameter(newsType, "newsType");
                w1Var.f131517a = newsType;
                w1Var.f131518b.c(newsType);
                return Unit.f80348a;
            case 6:
                f((l82.n) obj);
                return Unit.f80348a;
            case 7:
                FrameLayout.LayoutParams lparamsFrame = (FrameLayout.LayoutParams) obj;
                Intrinsics.checkNotNullParameter(lparamsFrame, "$this$lparamsFrame");
                ProportionalImageView proportionalImageView = (ProportionalImageView) obj2;
                lparamsFrame.width = bs1.c.W(proportionalImageView, zu1.a.news_hub_small_overlay_icon_inner_size);
                lparamsFrame.height = bs1.c.W(proportionalImageView, zu1.a.news_hub_small_overlay_icon_inner_size);
                lparamsFrame.gravity = 17;
                return Unit.f80348a;
            case 8:
                f((l82.n) obj);
                return Unit.f80348a;
            case 9:
                zs zsVar = (zs) obj;
                Intrinsics.f(zsVar);
                Intrinsics.checkNotNullParameter(zsVar, "<this>");
                Intrinsics.checkNotNullParameter("236x", "size");
                Map B = zsVar.B();
                int doubleValue = (B == null || (srVar2 = (sr) B.get("236x")) == null) ? 0 : (int) srVar2.h().doubleValue();
                Intrinsics.checkNotNullParameter(zsVar, "<this>");
                Intrinsics.checkNotNullParameter("236x", "size");
                Map B2 = zsVar.B();
                if (B2 != null && (srVar = (sr) B2.get("236x")) != null) {
                    i15 = (int) srVar.k().doubleValue();
                }
                ((ly0.d) ((jy0.b) obj2)).b8(jk.v.o(zsVar), i15, doubleValue);
                return Unit.f80348a;
            case 10:
                return e((yl1.b) obj);
            case 11:
                ny0.f it6 = (ny0.f) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                switch (ny0.f.f92581g.f126366a) {
                    case 6:
                        bVar = ny0.f.f92582h;
                        break;
                    default:
                        bVar = yy0.d.f140430h;
                        break;
                }
                qy0.a aVar4 = (qy0.a) obj2;
                return ny0.f.e(it6, null, yl1.b.f(bVar, null, aVar4.f105347i, null, null, null, null, null, null, 0, null, 1021), aVar4.f105344f.size() == 1 ? null : new bb2.e(0.0f, fVar2, 7), null, null, 57);
            case 12:
                f((l82.n) obj);
                return Unit.f80348a;
            case 13:
                yy0.l it7 = (yy0.l) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                yy0.n nVar = (yy0.n) obj2;
                int i18 = yy0.n.f140464g0;
                kh2.j.x2(nVar.Y7(), it7);
                if ((it7 instanceof yy0.e) && (aVar = nVar.f140466d0) != null) {
                    iy0.a.c(aVar, null, null, Integer.valueOf(((yy0.e) it7).f140444a), 3);
                }
                return Unit.f80348a;
            case 14:
                f((l82.n) obj);
                return Unit.f80348a;
            case 15:
                f((l82.n) obj);
                return Unit.f80348a;
            case 16:
                iz0.r productVMState = (iz0.r) obj;
                Intrinsics.checkNotNullParameter(productVMState, "productVMState");
                iz0.n nVar2 = (iz0.n) obj2;
                ni1.d0 d0Var = nVar2.U0;
                if (d0Var != null) {
                    return ((ba) d0Var).a(productVMState.f73933c, new mq.w(nVar2, 9), new mj.m(i14)).a(productVMState.f73931a, productVMState.f73932b);
                }
                Intrinsics.r("pgcVMStateConverterFactory");
                throw null;
            case 17:
                f((l82.n) obj);
                return Unit.f80348a;
            case 18:
                return e((yl1.b) obj);
            case 19:
                Bitmap bitmap = (Bitmap) obj;
                nz0.d dVar = (nz0.d) obj2;
                e01.a aVar5 = dVar.V0;
                if (aVar5 == null) {
                    Intrinsics.r("shareUtil");
                    throw null;
                }
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                aVar5.b(requireContext, bitmap);
                ep.b.C(null, dVar.f7());
                return Unit.f80348a;
            case 20:
                return b((rn1.a) obj);
            case 21:
                tt1.a response = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                h20 h20Var = (h20) response.c();
                Function1 function1 = ((oz0.a) obj2).f98279m;
                Intrinsics.f(h20Var);
                function1.invoke(h20Var);
                Object c13 = response.c();
                Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                h20 h20Var2 = (h20) c13;
                String L = h20Var2.L();
                if (L == null) {
                    L = "";
                }
                String D = h20Var2.D();
                String str2 = D != null ? D : "";
                List J2 = h20Var2.J();
                if (J2 == null) {
                    J2 = kotlin.collections.q0.f80391a;
                }
                List K = h20Var2.K();
                if (K == null) {
                    K = kotlin.collections.q0.f80391a;
                }
                return e0.b(new pz0.a(L, str2, J2, K));
            case 22:
                String name = (String) obj;
                Intrinsics.checkNotNullParameter(name, "name");
                NavigationImpl z03 = Navigation.z0((ScreenLocation) w2.f51515a.getValue(), name);
                Intrinsics.checkNotNullExpressionValue(z03, "create(...)");
                ((rz0.c) obj2).M1(z03);
                return Unit.f80348a;
            case 23:
                List list2 = (List) obj;
                Intrinsics.f(list2);
                ((com.pinterest.feature.pin.closeup.datasource.e) obj2).k(list2);
                return Unit.f80348a;
            case 24:
                f30 it8 = (f30) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.pinterest.feature.pin.closeup.datasource.j jVar = (com.pinterest.feature.pin.closeup.datasource.j) obj2;
                jVar.f46946p.onPinUpdated(it8);
                jVar.f46948r = true;
                m60.u.f85943a.g(3000L, new com.pinterest.feature.pin.closeup.datasource.m(jVar.f46941k));
                n1 n1Var = a11.o.f334a;
                if (it8 != null && Intrinsics.d(it8.d5(), Boolean.FALSE)) {
                    ((g1) a11.o.f334a.f83439a).c("closeup_redesign_letterboxing_and_visit_cta_android");
                }
                return j1.F1(it8) ? jVar.f46944n.a(it8, true) : jVar.f46943m.a(it8, true);
            case 25:
                return b((rn1.a) obj);
            case 26:
                return b((rn1.a) obj);
            case 27:
                vd0.c it9 = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                DynamicStoryDeserializer dynamicStoryDeserializer = (DynamicStoryDeserializer) ((no0.a) obj2).f91656c;
                vd0.c json = it9.k("data").b(0);
                if (json == null) {
                    json = new vd0.c();
                }
                dynamicStoryDeserializer.getClass();
                Intrinsics.checkNotNullParameter(json, "json");
                return dynamicStoryDeserializer.e(json, false, false);
            case 28:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                w01.o0 o0Var = (w01.o0) obj2;
                o0Var.f127094e = pin;
                o0Var.p3();
                return Unit.f80348a;
            default:
                y01.n1 it10 = (y01.n1) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return y01.n1.b(it10, null, null, false, ((l0) obj2).f136431a, 0, 0, null, 32511);
        }
    }
}
