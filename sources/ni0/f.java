package ni0;

import a.o3;
import a.z0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.hi;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.li;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.pp;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.api.model.xt;
import com.pinterest.feature.board.organize.view.BoardAndSectionOrganizeCell;
import com.pinterest.feature.pin.edit.section.view.PinEditBoardSectionPickerCellView;
import com.pinterest.feature.search.results.view.g0;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.itemviews.SortFilter;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.components.sections.LegoSectionRep;
import dc0.q;
import de1.k;
import dl1.s;
import gb1.p;
import i1.j;
import j41.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.j1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.a4;
import lh0.g1;
import lh0.g3;
import lh0.j3;
import lh0.z3;
import m60.f0;
import m60.w0;
import m60.x0;
import mq.w;
import nv0.l;
import nx.d0;
import o71.a0;
import o71.r;
import o71.v;
import qa2.k1;
import qv0.o;
import qv0.y;
import rl1.b0;
import so.i6;
import so.oa;
import t3.s1;
import tv1.g;
import u81.u;
import vq0.h;
import w01.r0;
import we1.e0;
import we1.h0;
import we1.x;
import yk1.m;
import yk1.n;
import z32.l1;
import z32.n1;
import z32.q1;
import z32.t1;
import z32.v0;
import zd1.t;

/* loaded from: classes5.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90588a = 12;

    /* renamed from: b, reason: collision with root package name */
    public final Object f90589b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f90590c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f90591d;

    public /* synthetic */ f(q qVar, j jVar) {
        this(qVar, jVar, (Function1) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, rj0.a] */
    /* JADX WARN: Type inference failed for: r7v39, types: [qa2.k1] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        d dVar;
        vh model;
        wo0.h hVar;
        Unit unit;
        n1 n1Var;
        Integer i14;
        String n13;
        r0 r0Var;
        r rVar;
        a0 a0Var;
        n71.b bVar;
        s81.f fVar;
        e91.a aVar;
        SbaPinRep sbaPinRep;
        q1 avatarPlacement;
        v0 avatarSize;
        q1 overflowPlacement;
        GestaltIconButton gestaltIconButton;
        q1 q1Var;
        f30 f30Var;
        hi creatorDisplayOptions;
        String str;
        hi creatorDisplayOptions2;
        GestaltIconButton gestaltIconButton2;
        om1.f fVar2;
        hi creatorDisplayOptions3;
        hi creatorDisplayOptions4;
        d0 d0Var;
        tv1.c cVar;
        String str2;
        tv1.a aVar2;
        k00 q13;
        String z13;
        o00 v13;
        String p13;
        tv1.d dVar2;
        String str3;
        g gVar;
        String term;
        int i15 = this.f90588a;
        Object obj2 = this.f90589b;
        Object obj3 = this.f90590c;
        Object obj4 = this.f90591d;
        switch (i15) {
            case 0:
                pi0.f view = (pi0.f) nVar;
                vh model2 = (vh) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                pi0.f fVar3 = view instanceof View ? view : null;
                if (fVar3 != null) {
                    yk1.j.a().getClass();
                    Object b13 = yk1.j.b(fVar3);
                    dVar = (d) (!(b13 instanceof d) ? null : b13);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.I3(i13, model2, view);
                    return;
                }
                return;
            case 1:
                BoardAndSectionOrganizeCell view2 = (BoardAndSectionOrganizeCell) nVar;
                v7 model3 = (v7) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                yk1.j.a().getClass();
                m b14 = yk1.j.b(view2);
                Intrinsics.g(b14, "null cannot be cast to non-null type com.pinterest.feature.board.organize.presenter.BoardOrganizeCellPresenter");
                dm0.a aVar3 = (dm0.a) b14;
                Intrinsics.checkNotNullParameter(model3, "model");
                aVar3.r3(model3);
                com.pinterest.feature.board.organize.f fVar4 = (com.pinterest.feature.board.organize.f) obj4;
                Intrinsics.checkNotNullParameter(fVar4, "<set-?>");
                aVar3.f55334b = fVar4;
                return;
            case 2:
                Object view3 = (uo0.e) nVar;
                s model4 = (s) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                boolean z14 = model4 instanceof vh;
                f0 f0Var = vb0.j.f125466a;
                if (z14) {
                    model = (vh) model4;
                } else {
                    if (!(model4 instanceof br.d)) {
                        f0Var.G("Could not parse DynamicStory to be bound with BubblesListView", new Object[0]);
                        return;
                    }
                    model = ((br.d) model4).f23719q;
                }
                View view4 = view3 instanceof View ? (View) view3 : null;
                if (view4 != null) {
                    m j13 = s1.j(view4);
                    if (!(j13 instanceof wo0.h)) {
                        j13 = null;
                    }
                    hVar = (wo0.h) j13;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    Intrinsics.f(model);
                    Intrinsics.checkNotNullParameter(model, "model");
                    List list = model.f42865w;
                    Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list) {
                        s sVar = (s) obj5;
                        if ((sVar instanceof xk) && (n13 = ((xk) sVar).n()) != null && !z.j(n13)) {
                            arrayList.add(obj5);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        s sVar2 = (s) it.next();
                        xk xkVar = sVar2 instanceof xk ? (xk) sVar2 : null;
                        if (xkVar != null) {
                            arrayList2.add(xkVar);
                        }
                    }
                    hVar.f130659h = arrayList2;
                    String uid = model.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    hVar.f130657f = uid;
                    hVar.f130665n = model.f42859q;
                    String str4 = model.A;
                    String str5 = hVar.f130655d;
                    if (str4 == null) {
                        str4 = null;
                    } else if (str4.length() == 0) {
                        str4 = str5;
                    }
                    if (str4 != null) {
                        str5 = str4;
                    }
                    hVar.f130658g = str5;
                    hVar.f130661j = Integer.valueOf(i13);
                    kj kjVar = model.f42855m;
                    hVar.f130662k = kjVar != null ? kjVar.a() : null;
                    kh khVar = model.f42858p;
                    if (khVar == null || (i14 = khVar.i()) == null) {
                        n1Var = null;
                    } else {
                        l1 l1Var = n1.Companion;
                        int intValue = i14.intValue();
                        l1Var.getClass();
                        n1Var = l1.a(intValue);
                    }
                    hVar.f130663l = n1Var;
                    hVar.f130664m = model.u();
                    unit = Unit.f80348a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    f0Var.G("Presenter bound to BubblesListView must be of type BubblesListPresenter", new Object[0]);
                    return;
                }
                return;
            case 3:
                hr0.b view5 = (hr0.b) nVar;
                v7 model5 = (v7) obj;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(model5, "model");
                ((yk1.j) obj3).d(view5.f69980a, new tl0.b(new tl0.a(0), new ll0.g(new wh1.a()), (g70.h) obj4));
                ((yi0.a) obj2).h(view5.f69980a, model5);
                return;
            case 4:
                o view6 = (o) nVar;
                vh model6 = (vh) obj;
                Intrinsics.checkNotNullParameter(view6, "view");
                Intrinsics.checkNotNullParameter(model6, "model");
                List list2 = model6.f42865w;
                Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                ArrayList stickers = new ArrayList();
                for (Object obj6 : list2) {
                    if (obj6 instanceof pp) {
                        stickers.add(obj6);
                    }
                }
                nv0.b actionListener = (nv0.b) obj3;
                pv0.d boardStickerListener = (pv0.d) obj4;
                l imageStickerListener = (l) obj2;
                view6.getClass();
                Intrinsics.checkNotNullParameter(stickers, "stickers");
                Intrinsics.checkNotNullParameter(actionListener, "actionListener");
                Intrinsics.checkNotNullParameter(boardStickerListener, "boardStickerListener");
                Intrinsics.checkNotNullParameter(imageStickerListener, "imageStickerListener");
                ArrayList H0 = CollectionsKt.H0(stickers);
                GridView gridView = view6.f105197c;
                Context context = view6.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gridView.setAdapter((ListAdapter) new y(context, H0, actionListener, boardStickerListener, imageStickerListener));
                return;
            case 5:
                Object view7 = (i01.d0) nVar;
                af1.a model7 = (af1.a) obj;
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(model7, "model");
                View view8 = view7 instanceof View ? (View) view7 : null;
                if (view8 != null) {
                    Object j14 = s1.j(view8);
                    r0Var = (r0) (!(j14 instanceof r0) ? null : j14);
                } else {
                    r0Var = null;
                }
                if (r0Var != null) {
                    List pins = model7.f15079a;
                    Intrinsics.checkNotNullParameter(pins, "pins");
                    r0Var.f127105c = pins;
                    r0Var.q3(pins);
                    return;
                }
                return;
            case 6:
                v11.a view9 = (v11.a) nVar;
                ba model8 = (ba) obj;
                Intrinsics.checkNotNullParameter(view9, "view");
                Intrinsics.checkNotNullParameter(model8, "model");
                String boardSectionId = model8.getUid();
                Intrinsics.checkNotNullExpressionValue(boardSectionId, "getUid(...)");
                String boardSectionName = model8.A();
                Intrinsics.checkNotNullExpressionValue(boardSectionName, "getTitle(...)");
                PinEditBoardSectionPickerCellView pinEditBoardSectionPickerCellView = (PinEditBoardSectionPickerCellView) view9;
                pinEditBoardSectionPickerCellView.getClass();
                Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
                Intrinsics.checkNotNullParameter(boardSectionName, "boardSectionName");
                pinEditBoardSectionPickerCellView.f47160b = boardSectionId;
                GestaltText gestaltText = pinEditBoardSectionPickerCellView.f47159a;
                pk.a0.p(gestaltText, boardSectionName);
                w11.b listener = (w11.b) obj4;
                Intrinsics.checkNotNullParameter(listener, "listener");
                gestaltText.j(new lq0.o(18, listener, pinEditBoardSectionPickerCellView));
                return;
            case 7:
                g0 view10 = (g0) nVar;
                b71.c model9 = (b71.c) obj;
                Intrinsics.checkNotNullParameter(view10, "view");
                Intrinsics.checkNotNullParameter(model9, "model");
                yk1.j.a().getClass();
                m b15 = yk1.j.b(view10);
                Intrinsics.g(b15, "null cannot be cast to non-null type com.pinterest.feature.search.results.presenter.SearchLibraryBoardsPresenter");
                c71.a0 a0Var2 = (c71.a0) b15;
                Intrinsics.checkNotNullParameter(model9, "model");
                a0Var2.f26723e = model9.f22089a;
                a0Var2.f26724f = model9.f22091c;
                a0Var2.bind(view10);
                return;
            case 8:
                k71.a view11 = (k71.a) nVar;
                f30 model10 = (f30) obj;
                Intrinsics.checkNotNullParameter(view11, "view");
                Intrinsics.checkNotNullParameter(model10, "model");
                q71.m mVar = (q71.m) view11;
                mVar.M = i13;
                String pinImageUrl = String.valueOf(bs1.c.B0(model10));
                Intrinsics.checkNotNullParameter(pinImageUrl, "pinImageUrl");
                mVar.loadUrl(pinImageUrl);
                v pinClickListener = (v) obj3;
                Intrinsics.checkNotNullParameter(pinClickListener, "pinClickListener");
                mVar.K = pinClickListener;
                yk1.v vVar = (yk1.v) obj4;
                j3 j3Var = (j3) obj2;
                j3Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) j3Var.f83398a;
                mVar.L = com.bumptech.glide.c.Y(vVar, model10, true, false, g1Var.o("android_lift_content_desc", "enabled", z3Var) || g1Var.l("android_lift_content_desc"), new i(view11, 18), 8);
                return;
            case 9:
                Object view12 = (k71.g) nVar;
                br.d model11 = (br.d) obj;
                Intrinsics.checkNotNullParameter(view12, "view");
                Intrinsics.checkNotNullParameter(model11, "model");
                View view13 = view12 instanceof View ? (View) view12 : null;
                if (view13 != null) {
                    Object j15 = s1.j(view13);
                    rVar = (r) (!(j15 instanceof r) ? null : j15);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    rVar.f93366b = model11;
                    return;
                }
                return;
            case 10:
                Object view14 = (k71.l) nVar;
                n71.b model12 = (n71.b) obj;
                Intrinsics.checkNotNullParameter(view14, "view");
                Intrinsics.checkNotNullParameter(model12, "model");
                View view15 = view14 instanceof View ? (View) view14 : null;
                if (view15 != null) {
                    Object j16 = s1.j(view15);
                    a0Var = (a0) (!(j16 instanceof a0) ? null : j16);
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    a0Var.f93229c = model12;
                    if (a0Var.isBound() && (bVar = a0Var.f93229c) != null) {
                        a0Var.x3(bVar.f89704a);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                u view16 = (u) nVar;
                xt model13 = (xt) obj;
                Intrinsics.checkNotNullParameter(view16, "view");
                Intrinsics.checkNotNullParameter(model13, "model");
                u uVar = view16 instanceof View ? view16 : null;
                if (uVar != null) {
                    yk1.j.a().getClass();
                    Object b16 = yk1.j.b(uVar);
                    fVar = (s81.f) (!(b16 instanceof s81.f) ? null : b16);
                } else {
                    fVar = null;
                }
                if (fVar == null) {
                    return;
                }
                fVar.f111899b = model13;
                return;
            case 12:
                ?? view17 = (rj0.a) nVar;
                vh model14 = (vh) obj;
                Intrinsics.checkNotNullParameter(view17, "view");
                Intrinsics.checkNotNullParameter(model14, "model");
                List list3 = model14.f42865w;
                Intrinsics.checkNotNullExpressionValue(list3, "getObjects(...)");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : list3) {
                    if (obj7 instanceof f30) {
                        arrayList3.add(obj7);
                    }
                }
                f30 f30Var2 = (f30) CollectionsKt.firstOrNull(arrayList3);
                if (f30Var2 != null) {
                    as1.b a13 = as1.b.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                    sr b17 = bs1.b.b(f30Var2, a13);
                    view17.m0(b17 != null ? b17.j() : null);
                }
                ih ihVar = model14.f42857o;
                view17.h(ihVar != null ? ihVar.g() : null);
                kj kjVar2 = model14.f42855m;
                view17.p(kjVar2 != null ? kjVar2.a() : null);
                kj kjVar3 = model14.f42856n;
                view17.c(kjVar3 != null ? kjVar3.a() : null);
                View view18 = view17 instanceof View ? (View) view17 : null;
                if (view18 != null) {
                    m j17 = s1.j(view18);
                    if (!(j17 instanceof e91.a)) {
                        j17 = null;
                    }
                    aVar = (e91.a) j17;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    ih ihVar2 = model14.f42857o;
                    aVar.f57915d = ihVar2 != null ? ihVar2.e() : null;
                    return;
                }
                return;
            case 13:
                de1.l view19 = (de1.l) nVar;
                zd1.s filter = (zd1.s) obj;
                Intrinsics.checkNotNullParameter(view19, "view");
                Intrinsics.checkNotNullParameter(filter, "model");
                SortFilter sortFilter = (SortFilter) view19;
                sortFilter.getClass();
                Intrinsics.checkNotNullParameter(filter, "filter");
                k listener2 = (k) obj3;
                Intrinsics.checkNotNullParameter(listener2, "listener");
                sortFilter.f48495c = listener2;
                zd1.u sortType = filter.f141763d;
                Intrinsics.checkNotNullParameter(sortType, "sortType");
                sortFilter.f48493a = sortType;
                ArrayList sortFilterList = filter.f141762c;
                Intrinsics.checkNotNullParameter(sortFilterList, "sortFilterList");
                sortFilter.f48494b = sortFilterList;
                sortFilter.removeAllViews();
                ArrayList arrayList4 = sortFilter.f48494b;
                if (arrayList4 == null) {
                    Intrinsics.r("sortFilterList");
                    throw null;
                }
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    t filter2 = (t) it2.next();
                    Context context2 = sortFilter.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    k kVar = sortFilter.f48495c;
                    if (kVar == null) {
                        Intrinsics.r("sortFilterItemUpdateListener");
                        throw null;
                    }
                    fe1.k kVar2 = new fe1.k(context2, kVar, sortFilter.f48496d);
                    Intrinsics.f(filter2);
                    Intrinsics.checkNotNullParameter(filter2, "filter");
                    kVar2.f62075f = filter2;
                    String label = filter2.f141764a;
                    Intrinsics.checkNotNullParameter(label, "label");
                    pk.a0.p(kVar2.f62072c, label);
                    zd1.u sortType2 = filter2.f141765b;
                    Intrinsics.checkNotNullParameter(sortType2, "sortType");
                    kVar2.f62073d = sortType2;
                    kVar2.setSelected(sortType2 == sortFilter.f48493a);
                    t tVar = kVar2.f62075f;
                    if (tVar == null) {
                        Intrinsics.r("sortFilterItem");
                        throw null;
                    }
                    boolean a23 = c0.d.a2(kVar2.f62074e);
                    Resources resources = kVar2.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    kVar2.setContentDescription(zd1.f.P1(a23, resources, tVar.f141764a));
                    sortFilter.addView(kVar2);
                }
                List list4 = (List) ((Function0) obj2).invoke();
                boolean L = list4 != null ? CollectionsKt.L(list4, filter.f141760a) : true;
                bs1.c.R1(sortFilter, L);
                ViewGroup.LayoutParams layoutParams = sortFilter.getLayoutParams();
                if (layoutParams != null) {
                    if (L) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = 0;
                    }
                }
                ((Function1) obj4).invoke(Integer.valueOf(i13));
                return;
            case 14:
                h0 view20 = (h0) nVar;
                ue1.n model15 = (ue1.n) obj;
                Intrinsics.checkNotNullParameter(view20, "view");
                Intrinsics.checkNotNullParameter(model15, "model");
                view20.f129391r = model15.f122043e;
                Function2 function2 = model15.f122044f;
                Intrinsics.checkNotNullParameter(function2, "<set-?>");
                view20.f129393t = function2;
                qa2.d0 d0Var2 = model15.f122045g ? (nr0.b) obj4 : null;
                f30 pin = model15.f122039a;
                Intrinsics.checkNotNullParameter(pin, "pin");
                wa2.i pinFeatureConfig = model15.f122041c;
                Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
                boolean R0 = b40.R0(pin);
                SbaPinRep sbaPinRep2 = view20.f129394u;
                if (!R0 || (d0Var = view20.f129377d) == null) {
                    sbaPinRep = sbaPinRep2;
                } else {
                    int i16 = k1.f103281v;
                    Context context3 = view20.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    sbaPinRep = pe.i.s(context3, d0Var, view20.f129378e, pinFeatureConfig);
                }
                view20.f129383j = sbaPinRep;
                String str6 = view20.f129391r;
                if (str6 != null) {
                    d0Var2 = new o3(3, view20, str6);
                }
                view20.f129392s = d0Var2;
                pinFeatureConfig.f128803w = true;
                sbaPinRep2.setNavigation(view20.f129390q);
                if (sbaPinRep instanceof k1) {
                    sbaPinRep.setPin(pin, i13);
                } else {
                    ni1.d0 d0Var3 = view20.f129381h;
                    if (d0Var3 == null) {
                        Intrinsics.r("vmStateConverterFactory");
                        throw null;
                    }
                    sbaPinRep2.bindDisplayState(view20.f129395v.b(((so.ba) d0Var3).a(f0.i0(pinFeatureConfig), new w(view20, 14), new z0(view20, 19)).a(i13, pin), false));
                }
                FrameLayout frameLayout = view20.f129382i;
                frameLayout.addView(view20);
                qa2.h0 internalCell = sbaPinRep.getInternalCell();
                ua2.g1 g1Var2 = internalCell instanceof ua2.g1 ? (ua2.g1) internalCell : null;
                GestaltIconButton gestaltIconButton3 = view20.f129387n;
                if (g1Var2 != null) {
                    gestaltIconButton3.u(new la1.k(6, view20, g1Var2));
                }
                Navigation navigation = model15.f122040b;
                view20.f129390q = navigation;
                sbaPinRep2.setNavigation(navigation);
                li liVar = model15.f122042d;
                if (liVar == null || (creatorDisplayOptions4 = liVar.getCreatorDisplayOptions()) == null || (avatarPlacement = creatorDisplayOptions4.a()) == null) {
                    avatarPlacement = q1.BOTTOM_CENTER_BORDER;
                }
                if (liVar == null || (creatorDisplayOptions3 = liVar.getCreatorDisplayOptions()) == null || (avatarSize = creatorDisplayOptions3.b()) == null) {
                    avatarSize = v0.DEFAULT;
                }
                if (liVar == null || (overflowPlacement = liVar.b()) == null) {
                    overflowPlacement = q1.BOTTOM_RIGHT_OUTSIDE;
                }
                q1 q1Var2 = q1.HIDDEN;
                GestaltText gestaltText2 = view20.f129385l;
                GestaltAvatar gestaltAvatar = view20.f129384k;
                TextView textView = view20.f129386m;
                if (avatarPlacement == q1Var2) {
                    pe.i.K(gestaltAvatar);
                    pk.a0.k0(gestaltText2);
                    bs1.c.X0(textView);
                    f30Var = pin;
                    gestaltIconButton = gestaltIconButton3;
                    q1Var = q1Var2;
                } else {
                    boolean showDetails = (liVar == null || (creatorDisplayOptions2 = liVar.getCreatorDisplayOptions()) == null) ? true : creatorDisplayOptions2.getShowDetails();
                    wy0 n14 = b40.n(pin);
                    String t03 = n14 != null ? dl2.b.t0(n14) : null;
                    String Z2 = n14 != null ? n14.Z2() : null;
                    boolean d2 = n14 != null ? Intrinsics.d(n14.O3(), Boolean.TRUE) : false;
                    boolean z15 = n14 != null && dl2.b.W1(n14);
                    Intrinsics.checkNotNullParameter(avatarPlacement, "avatarPlacement");
                    Intrinsics.checkNotNullParameter(avatarSize, "avatarSize");
                    Intrinsics.checkNotNullParameter(overflowPlacement, "overflowPlacement");
                    q1 q1Var3 = q1.BOTTOM_LEFT_INSIDE;
                    gestaltIconButton = gestaltIconButton3;
                    q1 q1Var4 = q1.BOTTOM_RIGHT_INSIDE;
                    q1Var = q1Var2;
                    f30Var = pin;
                    if (c0.y(new q1[]{q1Var3, q1Var4}, overflowPlacement) || c0.y(new q1[]{q1Var3, q1Var4}, avatarPlacement)) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, bs1.c.W(view20, eo1.c.space_1600));
                        layoutParams2.gravity = 80;
                        frameLayout.addView(view20.f129388o, layoutParams2);
                    }
                    Intrinsics.checkNotNullParameter(gestaltAvatar, "<this>");
                    gestaltAvatar.H2(b0.f108526k);
                    int[] iArr = we1.v.f129646b;
                    int i17 = iArr[avatarPlacement.ordinal()];
                    if (i17 == 2) {
                        h0.L(gestaltAvatar, new x(view20));
                    } else if (i17 != 3) {
                        h0.L(gestaltAvatar, new we1.z(view20));
                    } else {
                        h0.L(gestaltAvatar, new we1.y(view20));
                    }
                    gestaltAvatar.H2(new kc1.w(avatarSize, 29));
                    int i18 = iArr[avatarPlacement.ordinal()];
                    if (i18 == 2 || i18 == 3) {
                        h0.L(gestaltText2, new we1.b0(view20, avatarPlacement, overflowPlacement));
                        h0.L(textView, new we1.c0(view20, avatarPlacement, overflowPlacement));
                    } else {
                        h0.L(gestaltText2, new we1.d0(view20));
                        h0.L(textView, new e0(view20));
                    }
                    if (iArr[avatarPlacement.ordinal()] == 2) {
                        gestaltText2.i(we1.o.f129511l);
                        j1.p1(textView, eo1.b.color_white_0);
                    } else {
                        gestaltText2.i(we1.o.f129512m);
                        j1.p1(textView, eo1.b.color_themed_text_default);
                    }
                    gestaltAvatar.H2(new d91.l(t03, 24));
                    if (!showDetails || (str = Z2) == null || str.length() == 0) {
                        pk.a0.k0(gestaltText2);
                    } else {
                        if (d2) {
                            bs1.c.f0(view20, sm1.b.ic_check_circle_gestalt, Integer.valueOf(eo1.b.color_blue_500), null, 4);
                        } else if (z15) {
                            bs1.c.f0(view20, sm1.b.ic_check_circle_gestalt, Integer.valueOf(eo1.b.color_themed_base_red_300), null, 4);
                        }
                        gestaltText2.i(new p(str, d2, 1));
                    }
                    int i19 = (n14 == null || !Intrinsics.d(n14.R2(), Boolean.TRUE)) ? x0.picked_for_you : x0.following;
                    t1 c13 = (liVar == null || (creatorDisplayOptions = liVar.getCreatorDisplayOptions()) == null) ? null : creatorDisplayOptions.c();
                    Integer C6 = f30Var.C6();
                    Intrinsics.checkNotNullExpressionValue(C6, "getTotalReactionCount(...)");
                    int intValue2 = C6.intValue();
                    if (!showDetails) {
                        bs1.c.X0(textView);
                    }
                    int i23 = c13 != null ? we1.v.f129645a[c13.ordinal()] : -1;
                    if (i23 != 1) {
                        if (i23 != 2) {
                            bs1.c.X0(textView);
                        } else if (!showDetails || intValue2 <= 0) {
                            bs1.c.X0(textView);
                        } else {
                            String b18 = qb0.j.b(intValue2);
                            String quantityString = view20.getResources().getQuantityString(w0.reactions_count, intValue2, Integer.valueOf(intValue2));
                            if (b18 == null || b18.length() == 0) {
                                textView.setVisibility(8);
                            } else {
                                textView.setVisibility(0);
                                textView.setText(b18);
                                textView.setContentDescription(quantityString);
                                Context context4 = textView.getContext();
                                int i24 = cz1.b.ic_reaction_love_nonpds;
                                Object obj8 = d5.a.f53679a;
                                Drawable drawable = context4.getDrawable(i24);
                                if (drawable != null) {
                                    int lineHeight = textView.getLineHeight();
                                    drawable.setBounds(0, 0, lineHeight, lineHeight);
                                } else {
                                    drawable = null;
                                }
                                textView.setCompoundDrawablesRelative(drawable, null, null, null);
                                textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(m60.r0.margin_quarter));
                            }
                        }
                    } else if (showDetails) {
                        String string = view20.getResources().getString(i19);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        textView.setVisibility(0);
                        textView.setText(string);
                        textView.setContentDescription(string);
                    }
                }
                Intrinsics.checkNotNullParameter(overflowPlacement, "placement");
                if (overflowPlacement == q1Var || !view20.f129389p) {
                    com.bumptech.glide.c.d0(gestaltIconButton);
                } else {
                    com.bumptech.glide.c.u1(gestaltIconButton);
                    if (we1.v.f129646b[overflowPlacement.ordinal()] == 1) {
                        gestaltIconButton2 = gestaltIconButton;
                        h0.L(gestaltIconButton2, new we1.f0(view20));
                        fVar2 = om1.f.TRANSPARENT_ALWAYS_LIGHT;
                    } else {
                        gestaltIconButton2 = gestaltIconButton;
                        h0.L(gestaltIconButton2, new we1.g0(view20));
                        fVar2 = om1.f.TRANSPARENT_DARK_GRAY;
                    }
                    gestaltIconButton2.t(new kl0.s(fVar2, 5));
                }
                view20.setOnClickListener(new oq.t(view20, this, f30Var, i13));
                return;
            case 15:
                Object view21 = (vv1.d) nVar;
                j61.a model16 = (j61.a) obj;
                Intrinsics.checkNotNullParameter(view21, "view");
                Intrinsics.checkNotNullParameter(model16, "model");
                View view22 = view21 instanceof View ? (View) view21 : null;
                if (view22 != null) {
                    m j18 = s1.j(view22);
                    cVar = (tv1.c) (!(j18 instanceof tv1.c) ? null : j18);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    cVar.f119554e = model16;
                    HashMap hashMap = cVar.f119553d;
                    hashMap.put("onebar_module_type", String.valueOf(q42.f.COLOR_PALETTE.getValue()));
                    if (model16 == null || (str2 = model16.f74826c) == null) {
                        hashMap.remove("label");
                    } else {
                        hashMap.put("label", str2);
                    }
                    hashMap.put("grid_index", String.valueOf(i13));
                    return;
                }
                return;
            case 16:
                Object view23 = (vv1.b) nVar;
                g00 model17 = (g00) obj;
                Intrinsics.checkNotNullParameter(view23, "view");
                Intrinsics.checkNotNullParameter(model17, "model");
                View view24 = view23 instanceof View ? (View) view23 : null;
                if (view24 != null) {
                    m j19 = s1.j(view24);
                    aVar2 = (tv1.a) (!(j19 instanceof tv1.a) ? null : j19);
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar2.f119542e = model17;
                    HashMap hashMap2 = aVar2.f119541d;
                    hashMap2.put("onebar_module_type", String.valueOf(q42.f.BODY_TYPE.getValue()));
                    g00 g00Var = aVar2.f119542e;
                    if (g00Var == null || (v13 = g00Var.v()) == null || (p13 = v13.p()) == null) {
                        hashMap2.remove("label");
                    } else {
                        hashMap2.put("label", p13);
                    }
                    g00 g00Var2 = aVar2.f119542e;
                    if (g00Var2 != null && (q13 = g00Var2.q()) != null && (z13 = q13.z()) != null) {
                        hashMap2.put("filter_value", z13);
                    }
                    hashMap2.put("grid_index", String.valueOf(i13));
                    return;
                }
                return;
            case 17:
                Object view25 = (vv1.f) nVar;
                v61.a model18 = (v61.a) obj;
                Intrinsics.checkNotNullParameter(view25, "view");
                Intrinsics.checkNotNullParameter(model18, "model");
                View view26 = view25 instanceof View ? (View) view25 : null;
                if (view26 != null) {
                    m j23 = s1.j(view26);
                    dVar2 = (tv1.d) (!(j23 instanceof tv1.d) ? null : j23);
                } else {
                    dVar2 = null;
                }
                if (dVar2 != null) {
                    dVar2.f119559e = model18;
                    HashMap hashMap3 = dVar2.f119558d;
                    hashMap3.put("onebar_module_type", String.valueOf(q42.f.HAIR_TYPE.getValue()));
                    v61.a aVar4 = dVar2.f119559e;
                    if (aVar4 == null || (str3 = aVar4.f124213f) == null) {
                        hashMap3.remove("label");
                    } else {
                        hashMap3.put("label", str3);
                    }
                    hashMap3.put("grid_index", String.valueOf(i13));
                    return;
                }
                return;
            case 18:
                Object view27 = (vv1.k) nVar;
                e71.a model19 = (e71.a) obj;
                Intrinsics.checkNotNullParameter(view27, "view");
                Intrinsics.checkNotNullParameter(model19, "model");
                View view28 = view27 instanceof View ? (View) view27 : null;
                if (view28 != null) {
                    m j24 = s1.j(view28);
                    gVar = (g) (!(j24 instanceof g) ? null : j24);
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    gVar.f119585e = model19;
                    HashMap hashMap4 = gVar.f119584d;
                    hashMap4.put("onebar_module_type", String.valueOf(q42.f.SKIN_TONE.getValue()));
                    e71.a aVar5 = gVar.f119585e;
                    if (aVar5 == null || (term = aVar5.getTerm()) == null) {
                        hashMap4.remove("label");
                    } else {
                        hashMap4.put("label", term);
                    }
                    hashMap4.put("grid_index", String.valueOf(i13));
                    return;
                }
                return;
            default:
                LegoSectionRep view29 = (LegoSectionRep) nVar;
                ba model20 = (ba) obj;
                Intrinsics.checkNotNullParameter(view29, "view");
                Intrinsics.checkNotNullParameter(model20, "model");
                view29.a(kg.a.h0(model20, (q) obj3));
                view29.setOnLongClickListener(new sp.d(7, this, model20));
                Function1 function1 = (Function1) obj2;
                if (function1 != null) {
                    view29.setOnClickListener(new fd1.e(26, function1, model20));
                    return;
                }
                return;
        }
    }

    @Override // vq0.h
    public final m f() {
        int i13 = this.f90588a;
        Object obj = this.f90591d;
        Object obj2 = this.f90589b;
        Object obj3 = this.f90590c;
        switch (i13) {
            case 0:
                return ((i6) ((e) obj)).a((uk1.d) obj2, (uj2.q) obj3);
            case 1:
                uk1.d presenterPinalytics = (uk1.d) obj2;
                uj2.q networkStateStream = (uj2.q) obj3;
                Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
                Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
                dm0.a aVar = new dm0.a(presenterPinalytics, networkStateStream);
                aVar.f55334b = com.pinterest.feature.board.organize.f.BOARD_ORGANIZE_MODE_REORDER;
                return aVar;
            case 2:
                m60.w wVar = m60.u.f85943a;
                Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
                Context context = kb0.a.f79058b;
                return new wo0.h((uk1.d) obj2, (uj2.q) obj3, wVar, ((oa) ((so1.b) ep.b.g(so1.b.class))).G2(), new ll.j(16, 0), (String) obj);
            case 3:
            case 4:
            case 6:
            case 8:
            case 13:
            case 14:
            default:
                return null;
            case 5:
                uj2.q qVar = (uj2.q) obj3;
                return new r0((uk1.d) ((Function0) obj2).invoke(), qVar, (String) obj);
            case 7:
                xk2.v vVar = j71.c.f74846a;
                return new c71.a0(((uk1.a) ((oa) ((j71.a) vVar.getValue())).x2()).g(), ((oa) ((j71.a) vVar.getValue())).u2(), (x02.y) ((oa) ((j71.a) vVar.getValue())).f113660e4.get(), ((oa) ((j71.a) vVar.getValue())).l2(), (pb0.d) obj3, (g3) obj, (g70.h) obj2);
            case 9:
                return new r((uk1.d) obj2, (uj2.q) obj3, (nu1.a) obj);
            case 10:
                uk1.d presenterPinalytics2 = (uk1.d) obj2;
                uj2.q networkStateStream2 = (uj2.q) obj3;
                r71.b searchTypeaheadTextCellViewBinder = (r71.b) obj;
                Intrinsics.checkNotNullParameter(presenterPinalytics2, "presenterPinalytics");
                Intrinsics.checkNotNullParameter(networkStateStream2, "networkStateStream");
                Intrinsics.checkNotNullParameter(searchTypeaheadTextCellViewBinder, "searchTypeaheadTextCellViewBinder");
                a0 a0Var = new a0(presenterPinalytics2, networkStateStream2);
                a0Var.o(14, searchTypeaheadTextCellViewBinder);
                return a0Var;
            case 11:
                return new s81.f((uk1.d) obj2, (uj2.q) obj3, (s81.e) obj);
            case 12:
                return new e91.a((c91.f) obj3, (uk1.d) obj2, (nu1.a) obj);
            case 15:
                return new tv1.c((rv1.a) obj3, (uk1.d) obj2, (c71.b0) obj);
            case 16:
                return new tv1.a((tv1.b) obj3, (uk1.d) obj2, (HashMap) obj);
            case 17:
                return new tv1.d((tv1.e) obj3, (uk1.d) obj2, (Function0) obj);
            case 18:
                return new g((tv1.h) obj3, (uk1.d) obj2, (Function0) obj);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f90588a;
        switch (i14) {
            case 0:
                h((vh) obj);
                break;
            case 1:
                v7 model = (v7) obj;
                switch (i14) {
                    case 1:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                }
            case 2:
                Intrinsics.checkNotNullParameter((s) obj, "model");
                break;
            case 3:
                v7 model2 = (v7) obj;
                switch (i14) {
                    case 1:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                }
            case 4:
                h((vh) obj);
                break;
            case 5:
                Intrinsics.checkNotNullParameter((af1.a) obj, "model");
                break;
            case 6:
                ba model3 = (ba) obj;
                switch (i14) {
                    case 6:
                        Intrinsics.checkNotNullParameter(model3, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model3, "model");
                        break;
                }
            case 7:
                Intrinsics.checkNotNullParameter((b71.c) obj, "model");
                break;
            case 8:
                Intrinsics.checkNotNullParameter((f30) obj, "model");
                break;
            case 9:
                br.d model4 = (br.d) obj;
                Intrinsics.checkNotNullParameter(model4, "model");
                break;
            case 10:
                Intrinsics.checkNotNullParameter((n71.b) obj, "model");
                break;
            case 11:
                Intrinsics.checkNotNullParameter((xt) obj, "model");
                break;
            case 12:
                h((vh) obj);
                break;
            case 13:
                Intrinsics.checkNotNullParameter((zd1.s) obj, "model");
                break;
            case 14:
                ue1.n model5 = (ue1.n) obj;
                Intrinsics.checkNotNullParameter(model5, "model");
                break;
            case 15:
                j61.a model6 = (j61.a) obj;
                Intrinsics.checkNotNullParameter(model6, "model");
                break;
            case 16:
                Intrinsics.checkNotNullParameter((g00) obj, "model");
                break;
            case 17:
                Intrinsics.checkNotNullParameter((v61.a) obj, "model");
                break;
            case 18:
                Intrinsics.checkNotNullParameter((e71.a) obj, "model");
                break;
            default:
                ba model7 = (ba) obj;
                switch (i14) {
                    case 6:
                        Intrinsics.checkNotNullParameter(model7, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model7, "model");
                        break;
                }
        }
        return null;
    }

    public final String h(vh model) {
        switch (this.f90588a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return null;
    }

    public /* synthetic */ f(m60.w wVar) {
        this(wVar, (nr0.b) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(uk1.d presenterPinalytics, uj2.q networkStateStream) {
        this(presenterPinalytics, networkStateStream, 0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
    }

    public f(c91.f onDemandModuleController, uk1.d presenterPinalytics, nu1.a inAppNavigator) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(onDemandModuleController, "onDemandModuleController");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        this.f90589b = presenterPinalytics;
        this.f90590c = onDemandModuleController;
        this.f90591d = inAppNavigator;
    }

    public f(q repSize, Function2 longClickHandler, Function1 function1) {
        Intrinsics.checkNotNullParameter(repSize, "repSize");
        Intrinsics.checkNotNullParameter(longClickHandler, "longClickHandler");
        this.f90590c = repSize;
        this.f90591d = longClickHandler;
        this.f90589b = function1;
    }

    public f(k sortFilterItemUpdateListener, de1.v maybeLogSectionRender, de1.u getRules) {
        Intrinsics.checkNotNullParameter(sortFilterItemUpdateListener, "sortFilterItemUpdateListener");
        Intrinsics.checkNotNullParameter(maybeLogSectionRender, "maybeLogSectionRender");
        Intrinsics.checkNotNullParameter(getRules, "getRules");
        this.f90590c = sortFilterItemUpdateListener;
        this.f90591d = maybeLogSectionRender;
        this.f90589b = getRules;
    }

    public f(String pinId, uj2.q networkStateStream, au0.a presenterPinalyticsProvider) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalyticsProvider, "presenterPinalyticsProvider");
        this.f90591d = pinId;
        this.f90590c = networkStateStream;
        this.f90589b = presenterPinalyticsProvider;
    }

    public f(m60.w eventManager, nr0.b bVar) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f90590c = eventManager;
        this.f90591d = bVar;
        this.f90589b = sh.f.a();
    }

    public f(nv0.b actionListener, pv0.d boardStickerListener, l imageStickerListener) {
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        Intrinsics.checkNotNullParameter(boardStickerListener, "boardStickerListener");
        Intrinsics.checkNotNullParameter(imageStickerListener, "imageStickerListener");
        this.f90590c = actionListener;
        this.f90591d = boardStickerListener;
        this.f90589b = imageStickerListener;
    }

    public f(v pinClickedCellListener, yk1.v viewResources, j3 typeaheadExperiments) {
        Intrinsics.checkNotNullParameter(pinClickedCellListener, "pinClickedCellListener");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        this.f90590c = pinClickedCellListener;
        this.f90591d = viewResources;
        this.f90589b = typeaheadExperiments;
    }

    public f(pb0.d fuzzyDateFormatter, g3 experiments, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f90590c = fuzzyDateFormatter;
        this.f90591d = experiments;
        this.f90589b = boardNavigator;
    }

    public f(rv1.a listener, uk1.d presenterPinalytics, c71.b0 b0Var) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f90590c = listener;
        this.f90589b = presenterPinalytics;
        this.f90591d = b0Var;
    }

    public f(tv1.b listener, uk1.d presenterPinalytics, HashMap bodyTypeAuxData) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(bodyTypeAuxData, "bodyTypeAuxData");
        this.f90590c = listener;
        this.f90589b = presenterPinalytics;
        this.f90591d = bodyTypeAuxData;
    }

    public f(tv1.e listener, uk1.d presenterPinalytics, Function0 searchParametersProvider) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        this.f90590c = listener;
        this.f90589b = presenterPinalytics;
        this.f90591d = searchParametersProvider;
    }

    public f(tv1.h listener, uk1.d presenterPinalytics, Function0 searchParametersProvider) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        this.f90590c = listener;
        this.f90589b = presenterPinalytics;
        this.f90591d = searchParametersProvider;
    }

    public f(uj2.q networkStateStream, e adsCarouselPresenterFactory, uk1.d presenterPinalytics) {
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(adsCarouselPresenterFactory, "adsCarouselPresenterFactory");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f90590c = networkStateStream;
        this.f90591d = adsCarouselPresenterFactory;
        this.f90589b = presenterPinalytics;
    }

    public f(uk1.d presenterPinalytics, uj2.q networkStateStream, int i13) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter("homefeed_bubble", "defaultReferrerSource");
        this.f90589b = presenterPinalytics;
        this.f90590c = networkStateStream;
        this.f90591d = "homefeed_bubble";
    }

    public f(uk1.d pinalytics, uj2.q networkStateStream, com.pinterest.feature.board.organize.f organizeMode) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(organizeMode, "organizeMode");
        this.f90589b = pinalytics;
        this.f90590c = networkStateStream;
        this.f90591d = organizeMode;
    }

    public f(uk1.d presenterPinalytics, uj2.q networkStateStream, nu1.a inAppNavigator) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        this.f90589b = presenterPinalytics;
        this.f90590c = networkStateStream;
        this.f90591d = inAppNavigator;
    }

    public f(uk1.d presenterPinalytics, uj2.q networkStateStream, r71.b searchTypeaheadTextCellViewBinder) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(searchTypeaheadTextCellViewBinder, "searchTypeaheadTextCellViewBinder");
        this.f90589b = presenterPinalytics;
        this.f90590c = networkStateStream;
        this.f90591d = searchTypeaheadTextCellViewBinder;
    }

    public f(uk1.d presenterPinalytics, uj2.q networkStateStream, s81.e listener) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f90589b = presenterPinalytics;
        this.f90590c = networkStateStream;
        this.f90591d = listener;
    }

    public f(w11.b listener, uj2.q networkStateStream, uk1.d pinalytics) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f90591d = listener;
        this.f90590c = networkStateStream;
        this.f90589b = pinalytics;
    }

    public f(yk1.j mvpBinder, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f90590c = mvpBinder;
        this.f90591d = boardNavigator;
        this.f90589b = new yi0.a(mvpBinder, boardNavigator);
    }
}
