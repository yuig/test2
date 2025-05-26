package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fk;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.lq;
import com.pinterest.api.model.mp0;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.tq;
import com.pinterest.api.model.wk;
import com.pinterest.api.model.wn0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46289i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f46290j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f46291k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i13, Object obj, Object obj2) {
        super(1);
        this.f46289i = i13;
        this.f46290j = obj;
        this.f46291k = obj2;
    }

    public final tq b(tq config) {
        int i13 = this.f46289i;
        Object obj = this.f46291k;
        Object obj2 = this.f46290j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(config, "config");
                ru0.j jVar = (ru0.j) obj2;
                tq b13 = tq.b(config, 0L, 0L, (fk) obj, null, 11);
                tp tpVar = jVar.f110005j;
                if (tpVar != null) {
                    return ru0.j.p3(jVar, b13, tpVar);
                }
                Intrinsics.r("currentPage");
                throw null;
            default:
                Intrinsics.checkNotNullParameter(config, "config");
                ru0.j jVar2 = (ru0.j) obj2;
                tq b14 = tq.b(config, 0L, 0L, null, (wk) obj, 7);
                tp tpVar2 = jVar2.f110005j;
                if (tpVar2 != null) {
                    return ru0.j.p3(jVar2, b14, tpVar2);
                }
                Intrinsics.r("currentPage");
                throw null;
        }
    }

    public final ln0 e(ln0 it) {
        int i13 = this.f46289i;
        Object obj = this.f46291k;
        Object obj2 = this.f46290j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return ln0.a(it, null, tp.e((tp) obj2, null, null, null, null, null, null, null, (String) obj, null, null, null, null, 3967), null, null, null, null, false, null, null, null, null, 16379);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return ln0.a(it, wn0.a(it.getMetadata(), null, (String) obj2, (List) obj, null, false, null, RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM), null, null, null, null, null, false, null, null, null, null, 16381);
            case 10:
            default:
                Intrinsics.checkNotNullParameter(it, "data");
                ln0 a13 = ln0.a(it, null, (tp) obj2, null, null, null, null, false, null, null, null, null, 16379);
                kv0.f fVar = (kv0.f) obj;
                fVar.f80956h.W(a13);
                tp pageData = a13.getPageData();
                ag1.b bVar = fVar.f80955g;
                bVar.f15133f = pageData;
                bVar.f(a13.getMetadata());
                return a13;
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return it.J(tp.e((tp) obj2, null, null, null, null, null, (List) obj, null, null, null, null, null, null, 4063), true);
        }
    }

    public final kv0.u f(f30 it) {
        int i13 = this.f46289i;
        Object obj = this.f46291k;
        Object obj2 = this.f46290j;
        switch (i13) {
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                kv0.i iVar = (kv0.i) obj2;
                Context context = iVar.f80969b;
                lh0.s1 s1Var = iVar.f80972e;
                s1Var.getClass();
                z3 z3Var = a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) s1Var.f83476a;
                kv0.u R = kh2.b0.R(context, it, g1Var.o("android_auto_product_tagging", "enabled", z3Var) || g1Var.l("android_auto_product_tagging"));
                mp0 block = (mp0) obj;
                Intrinsics.checkNotNullExpressionValue(block, "$block");
                return kv0.u.a(R, k3.p1(block));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return kv0.u.a(kh2.b0.R(((kv0.c) obj2).f80941b, it, false), ((kv0.y) obj).f81026b);
        }
    }

    public final rn1.a h(rn1.a it) {
        int i13 = this.f46289i;
        Object obj = this.f46291k;
        Object obj2 = this.f46290j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2((String) obj2), null, null, null, null, 0, null, null, null, new rm1.d(new rm1.f((rm1.q) obj, rm1.i.XS), rm1.c.DARK, null, 0, null, 28), false, 0, null, null, null, null, null, false, null, null, 2096638);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, ((String) obj2).length() >= ((zu0.g) obj).getResources().getInteger(aq1.e.idea_pin_interest_tag_max_query_length) ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = ((zv0.j) obj2).getResources().getString(aq1.h.idea_pin_video_duration, (String) obj);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string), vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v12, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final void i(ln0 data) {
        ln0 ln0Var;
        boolean z13;
        Bundle bundle;
        int i13 = this.f46289i;
        r6 = null;
        String str = null;
        Object obj = this.f46291k;
        Object obj2 = this.f46290j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(data, "data");
                ln0 a13 = ln0.a(data, null, (tp) obj2, null, null, null, null, false, null, null, null, null, 16379);
                hu0.g gVar = (hu0.g) obj;
                ((dl1.l) gVar.f70410m).W(a13);
                tp pageData = a13.getPageData();
                ag1.b bVar = gVar.f70408k;
                bVar.f15133f = pageData;
                bVar.f(a13.getMetadata());
                return;
            case 10:
                if (data.G()) {
                    String boardId = data.getBoardId();
                    if (boardId == null || kotlin.text.z.j(boardId)) {
                        dv0.k.t3((dv0.k) obj2, data, "", "", (Integer) obj);
                        return;
                    }
                    String boardId2 = data.getBoardId();
                    if (boardId2 != null) {
                        dv0.k kVar = (dv0.k) obj2;
                        kVar.f56350i.P(boardId2).F(new mu0.a(23, new j1.p0(kVar, data, boardId2, (Integer) obj, 26)), new mu0.a(24, new dv0.i(kVar, 3)), ck2.i.f27923c, ck2.i.f27924d);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                Intrinsics.checkNotNullParameter(data, "storyPinLocalData");
                tp pageData2 = data.getPageData();
                if (pageData2 != null) {
                    String str2 = (String) obj;
                    List<qq> overlayBlocks = pageData2.getOverlayBlocks();
                    ArrayList H0 = CollectionsKt.H0(overlayBlocks);
                    z13 = false;
                    for (qq qqVar : overlayBlocks) {
                        mq mqVar = qqVar instanceof mq ? (mq) qqVar : null;
                        if (Intrinsics.d(mqVar != null ? mqVar.getPinId() : null, str2)) {
                            H0.remove(mqVar);
                            if (!mqVar.getIsInvisible()) {
                                z13 = true;
                            }
                        }
                    }
                    ln0Var = !Intrinsics.d(H0, overlayBlocks) ? uv0.n.a(data, z13, tp.e(pageData2, null, null, null, null, null, H0, null, null, null, null, null, null, 4063)) : data;
                } else {
                    ln0Var = data;
                    z13 = false;
                }
                kv0.f fVar = (kv0.f) obj2;
                fVar.f80954f.a((String) obj, z13);
                fVar.f80956h.W(ln0Var);
                if (z13) {
                    xk2.v vVar = uv0.n.f123180a;
                    Context context = fVar.f80949a;
                    Intrinsics.checkNotNullParameter(context, "context");
                    String draftId = fVar.f80950b;
                    Intrinsics.checkNotNullParameter(draftId, "draftId");
                    kk2.t r13 = new hk2.o(0, ((dl1.l) ((dl1.t) uv0.n.f123180a.getValue())).M(draftId), new bv0.k(29, new q0.d(context, 13))).r(tk2.e.f118017c);
                    Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
                    kk2.t l13 = r13.l(wj2.c.a());
                    Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
                    fVar.f80962n.a(nl.b.q(l13, new r0(14, ln0Var, fVar), kv0.a.f80926m));
                    return;
                }
                return;
            case 19:
                lv0.g gVar2 = (lv0.g) obj2;
                boolean z14 = gVar2.f85009k;
                dl1.t tVar = gVar2.f85015q;
                if (!z14) {
                    Intrinsics.f(data);
                    f30 f30Var = (f30) obj;
                    tp pageData3 = data.getPageData();
                    if (pageData3 != null) {
                        String uid = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        Pair l03 = tp.l0(pageData3, uid, null, false, 12);
                        tp tpVar = (tp) l03.f80346a;
                        mq mqVar2 = (mq) l03.f80347b;
                        ((dl1.l) tVar).W(data.J(tpVar, true));
                        gVar2.f85014p.f(new hv0.f(mqVar2.getConfig().getId()));
                        gVar2.f85012n.z(lv0.b.f84983m);
                        return;
                    }
                    return;
                }
                Intrinsics.f(data);
                f30 f30Var2 = (f30) obj;
                tp pageData4 = data.getPageData();
                if (pageData4 != null) {
                    String uid2 = f30Var2.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    tp tpVar2 = (tp) tp.l0(pageData4, uid2, null, true, 4).f80346a;
                    List D = data.D();
                    if (!(D instanceof Collection) || !D.isEmpty()) {
                        Iterator it = D.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.d(((mq) it.next()).getPinId(), f30Var2.getUid())) {
                            }
                        }
                    }
                    ((dl1.l) tVar).W(uv0.n.a(data, false, tpVar2));
                }
                yk1.n viewIfBound = gVar2.getViewIfBound();
                jv0.b bVar2 = viewIfBound instanceof jv0.b ? (jv0.b) viewIfBound : null;
                if (bVar2 != null) {
                    String productPinId = f30Var2.getUid();
                    Intrinsics.checkNotNullExpressionValue(productPinId, "getUid(...)");
                    mv0.r rVar = (mv0.r) bVar2;
                    Intrinsics.checkNotNullParameter(productPinId, "productPinId");
                    com.pinterest.framework.screens.s sVar = rVar.f91293r;
                    r6 = sVar != null ? sVar.i() : 0;
                    if (r6 == 0) {
                        r6 = kotlin.collections.q0.f80391a;
                    }
                    Iterable iterable = (Iterable) r6;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.d(((ScreenDescription) it2.next()).getScreenClass(), IdeaPinCreationLocation.IDEA_PIN_CREATION_PRODUCT_TAG_LIST.getF48906a())) {
                                rVar.y1(mv0.g.f88357t, "com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_ADDED_PRODUCTS", e0.t.j(new Pair("com.pinterest.EXTRA_STORY_PIN_PRODUCT_ID", productPinId)));
                                return;
                            }
                        }
                    }
                    NavigationImpl w13 = Navigation.w1(IdeaPinCreationLocation.IDEA_PIN_CREATION_PRODUCT_TAG_LIST);
                    w13.m0("com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_ADDED_PRODUCTS", productPinId);
                    Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                    rVar.M1(w13);
                    return;
                }
                return;
            case 21:
                dl1.t tVar2 = ((tv0.h) obj2).f119527k0;
                if (tVar2 == null) {
                    Intrinsics.r("storyPinLocalDataRepository");
                    throw null;
                }
                Intrinsics.f(data);
                ((dl1.l) tVar2).W(ln0.a(data, wn0.a(data.getMetadata(), null, null, null, ((br.d) obj).f23703a, false, null, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE), null, null, null, null, null, false, null, null, null, null, 16381));
                return;
            case 22:
                tp pageData5 = data.getPageData();
                if (pageData5 != null) {
                    String str3 = (String) obj2;
                    tv0.j jVar = (tv0.j) obj;
                    Intrinsics.f(str3);
                    Pair c03 = pageData5.c0(str3);
                    tp tpVar3 = (tp) c03.f80346a;
                    lq lqVar = (lq) c03.f80347b;
                    ln0 J2 = data.J(tpVar3, true);
                    dl1.t tVar3 = jVar.f119534k0;
                    if (tVar3 == null) {
                        Intrinsics.r("storyPinLocalDataRepository");
                        throw null;
                    }
                    ((dl1.l) tVar3).W(J2);
                    jVar.f7().d(new hv0.e(lqVar.getConfig().getId()));
                    return;
                }
                return;
            default:
                sw0.j0 j0Var = (sw0.j0) obj2;
                d30 item = (d30) ((pu) obj);
                int i14 = sw0.j0.H1;
                j0Var.getClass();
                try {
                    Context context2 = j0Var.getContext();
                    Context applicationContext = context2 != null ? context2.getApplicationContext() : null;
                    Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
                    String str4 = ((Application) applicationContext).getDir("idea_pin_overlay", 0).getPath() + File.separator + "image_sticker_" + cp2.a.a(16);
                    il2.m.e(new File(item.e()), new File(str4));
                    item = new d30(str4, r6, 2, r6);
                } catch (Exception unused) {
                }
                tp pageData6 = data.getPageData();
                if (pageData6 != null) {
                    Bundle arguments = j0Var.getArguments();
                    if (arguments != null && (bundle = arguments.getBundle("com.pinterest.EXTRA_MEDIA_GALLERY_EXTRA_BUNDLE")) != null) {
                        str = bundle.getString("com.pinterest.EXTRA_IDEA_PIN_OVERLAY_BLOCK_ID");
                    }
                    Intrinsics.checkNotNullParameter(item, "item");
                    int f13 = new k6.g(item.e()).f(1, "Orientation");
                    Pair pair = (f13 == 6 || f13 == 8) ? new Pair(item.h().f80347b, item.h().f80346a) : item.h();
                    sw0.g0 g0Var = sw0.g0.f115445a;
                    ((dl1.l) j0Var.h9()).W(ln0.a(data, null, (tp) pageData6.Z(str, item, pair).f80346a, null, null, null, null, false, null, null, null, null, 16379));
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(qx0.b.c(r0), (java.lang.String) r6) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.closeup.view.r0.invoke(java.lang.Object):java.lang.Object");
    }

    public final void j(String str) {
        int i13 = this.f46289i;
        Object obj = this.f46291k;
        Object obj2 = this.f46290j;
        switch (i13) {
            case 13:
                dv0.k kVar = ((ev0.l) obj2).M0;
                if (kVar == null) {
                    Intrinsics.r("actionListener");
                    throw null;
                }
                Intrinsics.f(str);
                kVar.w3(new av0.n((tp) obj, str));
                return;
            default:
                tp pageData = ((ln0) obj2).getPageData();
                if (pageData != null) {
                    kv0.f fVar = (kv0.f) obj;
                    Intrinsics.f(str);
                    if (str.length() > 0) {
                        kv0.f.e(fVar, tp.e(pageData, null, null, null, null, null, null, null, str, null, null, null, null, 3967), new kv0.d(fVar, 0));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
