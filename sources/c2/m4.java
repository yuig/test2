package c2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.ea0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gs0;
import com.pinterest.api.model.s00;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.z90;
import com.pinterest.education.user.signals.UserSignalsActionPromptView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.engagementtab.FloatingCommentView;
import com.pinterest.feature.pin.creation.view.ThumbnailScrubberPreview;
import com.pinterest.feature.unifiedcomments.view.CommentCountHeaderView;
import com.pinterest.feature.unifiedcomments.view.PinCommentReactionHeaderView;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m4 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24969i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f24970j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f24971k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(int i13, Object obj, int i14) {
        super(1);
        this.f24969i = i14;
        this.f24970j = i13;
        this.f24971k = obj;
    }

    public final an1.l b(an1.l it) {
        int i13;
        u50.i0 j23;
        u50.i0 j24;
        u50.i0 i0Var = u50.h0.f120562a;
        int i14 = this.f24969i;
        int i15 = 0;
        Object obj = this.f24971k;
        switch (i14) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                m91.h hVar = (m91.h) obj;
                List list = hVar.f86734d;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new an1.e(bs1.c.j2(new String[0], ((m91.g) it2.next()).f86739b), null, null, false, 62));
                }
                return an1.l.e(it, null, null, null, arrayList, this.f24970j, d7.b.Z(hVar.f86740c), null, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                z91.w wVar = (z91.w) obj;
                List list2 = (List) wVar.f141407c;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new an1.e(bs1.c.j2(new String[0], ((u91.b) it3.next()).f121206a), null, null, false, 62));
                }
                Iterator it4 = ((List) wVar.f141407c).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i13 = -1;
                    } else if (((u91.b) it4.next()).f121207b == this.f24970j) {
                        i13 = i15;
                    } else {
                        i15++;
                    }
                }
                return an1.l.e(it, null, null, null, arrayList2, i13, null, null, RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER);
            case 14:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                wb1.m mVar = (wb1.m) obj;
                List list3 = mVar.f129037h;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    Integer num = ((wb1.l) it5.next()).f129040f;
                    if (num == null) {
                        j24 = i0Var;
                    } else {
                        j24 = bs1.c.j2(new String[0], num.intValue());
                    }
                    arrayList3.add(new an1.e(j24, null, null, false, 62));
                }
                return an1.l.e(it, null, null, null, arrayList3, this.f24970j, d7.b.Z(mVar.f129041g), null, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                wb1.h hVar2 = (wb1.h) obj;
                List list4 = hVar2.f129019h;
                ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(list4, 10));
                Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    Integer num2 = ((wb1.g) it6.next()).f129040f;
                    if (num2 == null) {
                        j23 = i0Var;
                    } else {
                        j23 = bs1.c.j2(new String[0], num2.intValue());
                    }
                    arrayList4.add(new an1.e(j23, null, null, false, 62));
                }
                return an1.l.e(it, null, null, null, arrayList4, this.f24970j, d7.b.Z(hVar2.f129041g), null, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO);
        }
    }

    public final rn1.a e(rn1.a it) {
        vn1.g gVar;
        u50.i0 j23;
        int i13 = this.f24969i;
        int i14 = this.f24970j;
        Object obj = this.f24971k;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar = i14 > 0 ? fm1.c.VISIBLE : fm1.c.GONE;
                yk1.v vVar = ((zp.w0) obj).U;
                if (vVar != null) {
                    return rn1.a.y(it, bs1.c.h2(((yk1.a) vVar).f139224a.getQuantityString(ry1.e.pin_edit_n_tags, i14, Integer.valueOf(i14))), null, null, null, null, 0, cVar, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
                }
                Intrinsics.r("viewResources");
                throw null;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = ((UserSignalsActionPromptView) obj).getResources().getString(i14);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), vn1.c.ERROR, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c Z = d7.b.Z(i14 > 0);
                u50.f0 h23 = bs1.c.h2(qb0.j.b(i14));
                String quantityString = ((FloatingCommentView) obj).getResources().getQuantityString(m60.w0.comment_like_count, i14, Integer.valueOf(i14));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                return rn1.a.y(it, h23, null, null, null, null, 0, Z, null, null, null, false, 0, bs1.c.h2(quantityString), null, null, null, null, false, null, null, 2092990);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = ((g41.g) obj).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return rn1.a.y(it, bs1.c.p2(kh2.g0.q(i14, resources)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                CommentCountHeaderView commentCountHeaderView = (CommentCountHeaderView) obj;
                int i15 = CommentCountHeaderView.f48920h;
                commentCountHeaderView.getClass();
                if (true ^ hf0.b.q()) {
                    Context context = commentCountHeaderView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    gVar = pk.a0.u(context);
                } else {
                    gVar = it.f108853k;
                }
                vn1.g gVar2 = gVar;
                String string2 = commentCountHeaderView.getResources().getQuantityString(fb0.e.unified_comments_feed_comment_count_header_title, i14, Integer.valueOf(i14));
                Intrinsics.checkNotNullExpressionValue(string2, "getQuantityString(...)");
                Intrinsics.checkNotNullParameter(string2, "string");
                return rn1.a.y(it, new u50.f0(string2), null, null, null, gVar2, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                if (i14 > 0) {
                    String quantityString2 = ((PinCommentReactionHeaderView) obj).getResources().getQuantityString(ob2.e.comment_count, i14, Integer.valueOf(i14));
                    Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                    j23 = bs1.c.h2(quantityString2);
                } else {
                    j23 = bs1.c.j2(new String[0], ob2.f.no_comments_yet_v2);
                }
                return rn1.a.y(it, j23, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 24:
                Intrinsics.checkNotNullParameter(it, "state");
                return rn1.a.y(it, (u50.i0) obj, vn1.c.INVERSE, null, null, vn1.g.BODY_300, this.f24970j, null, null, null, null, false, do1.z.gestalt_text, null, null, null, null, null, false, null, null, 2095052);
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], i14), null, null, null, null, 0, (fm1.c) obj, null, null, null, false, 0, bs1.c.j2(new String[0], i14), null, null, null, null, false, null, null, 2092990);
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence string3 = ((yq1.k) obj).getText(i14);
                Intrinsics.checkNotNullExpressionValue(string3, "getText(...)");
                Intrinsics.checkNotNullParameter(string3, "string");
                return rn1.a.y(it, new u50.f0(string3), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String string4 = ((yq1.c2) obj).getString(i14);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string4), null, kotlin.collections.e0.b(vn1.b.CENTER), null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097082);
        }
    }

    public final void f(wm1.k0 bind) {
        int i13 = this.f24969i;
        Object obj = this.f24971k;
        int i14 = this.f24970j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                ca1.o oVar = (ca1.o) obj;
                int i15 = ca1.o.f27214k0;
                oVar.getClass();
                ImageView imageView = new ImageView(oVar.getContext());
                int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(eo1.c.space_300);
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(dl2.b.G0(imageView, eo1.a.comp_listaction_startitem_image_size), dl2.b.G0(imageView, eo1.a.comp_listaction_startitem_image_size));
                imageView.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                imageView.setLayoutParams(layoutParams);
                Context context = imageView.getContext();
                Object obj2 = d5.a.f53679a;
                imageView.setImageDrawable(context.getDrawable(i14));
                imageView.setBackgroundResource(m60.s0.rounded_rect_small_gray);
                wm1.v startItem = new wm1.v(imageView);
                bind.getClass();
                Intrinsics.checkNotNullParameter(startItem, "startItem");
                bind.f130311b = startItem;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                if (i14 == y32.f.BOARD.value()) {
                    Set h10 = ((lb0.b) lb0.n.f82725d.a()).h("PREF_INVITES_SENT_USER_IDS", new LinkedHashSet());
                    if (h10 != null && h10.contains(String.valueOf(((TypeAheadItem) obj).A()))) {
                        int i16 = vc0.d.invited;
                        String[] formatArgs = new String[0];
                        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                        wm1.e endItem = new wm1.e(new u50.k0(i16, new ArrayList(0)), false, null, yl1.i.c(), 22);
                        bind.getClass();
                        Intrinsics.checkNotNullParameter(endItem, "endItem");
                        bind.f130313d = endItem;
                        break;
                    } else {
                        int i17 = m60.x0.invite;
                        String[] formatArgs2 = new String[0];
                        Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                        wm1.e endItem2 = new wm1.e(new u50.k0(i17, new ArrayList(0)), false, null, null, 30);
                        bind.getClass();
                        Intrinsics.checkNotNullParameter(endItem2, "endItem");
                        bind.f130313d = endItem2;
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z90 Z5;
        List f13;
        ea0 ea0Var;
        z90 Z52;
        List f14;
        ea0 ea0Var2;
        List d2;
        s00 s00Var;
        int i13 = this.f24969i;
        int i14 = this.f24970j;
        Object obj2 = this.f24971k;
        switch (i13) {
            case 0:
                q3.b1 b1Var = (q3.b1) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    q3.c1 c1Var = (q3.c1) arrayList.get(i15);
                    q3.b1.f(b1Var, c1Var, 0, (i14 - c1Var.f102179b) / 2);
                }
                return Unit.f80348a;
            case 1:
                Boolean F = androidx.compose.ui.focus.a.F((z2.z) obj, i14);
                ((kotlin.jvm.internal.j0) obj2).f80434a = F;
                return Boolean.valueOf(F != null ? F.booleanValue() : false);
            case 2:
                return e((rn1.a) obj);
            case 3:
                vt.e eVar = ((vt.h) obj2).f126599a;
                eVar.getClass();
                eVar.b(h32.g0.AD_QUIZ_PIN_QUESTIONNAIRE, h32.u0.QUIZ_PIN_QUESTION, h32.f1.QUIZ_PIN_RESPONSE);
                f30 f30Var = eVar.f126577d;
                kotlin.collections.v vVar = eVar.f126593t;
                Integer c13 = (f30Var == null || (Z52 = f30Var.Z5()) == null || (f14 = Z52.f()) == null || (ea0Var2 = (ea0) f14.get(vVar.f80402c)) == null || (d2 = ea0Var2.d()) == null || (s00Var = (s00) d2.get(i14)) == null) ? null : s00Var.c();
                Integer[] numArr = eVar.f126592s;
                if (numArr != null && c13 != null) {
                    int intValue = c13.intValue() - 1;
                    numArr[intValue] = Integer.valueOf(numArr[intValue].intValue() + 1);
                    vVar.addLast(Integer.valueOf(c13.intValue() - 1));
                }
                f30 f30Var2 = eVar.f126577d;
                if (f30Var2 != null && (Z5 = f30Var2.Z5()) != null && (f13 = Z5.f()) != null && (ea0Var = (ea0) f13.get(eVar.f126580g)) != null) {
                    r3 = ea0Var.e();
                }
                Integer[] numArr2 = eVar.f126594u;
                if (numArr2 != null && r3 != null) {
                    if (c13 != null) {
                        numArr2[r3.intValue() - 1] = c13;
                    }
                    eVar.f126595v.addLast(Integer.valueOf(r3.intValue() - 1));
                }
                eVar.f126580g++;
                eVar.k();
                return Unit.f80348a;
            case 4:
                em1.d it = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = ((gs0) obj2).f38132e;
                if (str == null) {
                    str = "";
                }
                return em1.d.e(it, null, null, null, bs1.c.h2(str), null, null, 0, null, false, this.f24970j, 503);
            case 5:
                return e((rn1.a) obj);
            case 6:
                um0.w0 it2 = (um0.w0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                v7 v7Var = (v7) obj2;
                int intValue2 = v7Var.s1().intValue() - i14;
                int i16 = intValue2 >= 0 ? intValue2 : 0;
                u7 G1 = v7Var.G1();
                G1.H(Integer.valueOf(i16));
                v7 a13 = G1.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return um0.w0.b(it2, false, false, tk0.i0.b(it2.f122773c, a13, null, null, null, 0, 1015), null, 27);
            case 7:
                hp0.b it3 = (hp0.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                int i17 = i14 >= 0 ? i14 : 0;
                List carouselItems = ((hp0.e) ((hp0.h) obj2)).f69828a;
                zy.a0 pinalyticsState = it3.f69823c;
                Intrinsics.checkNotNullParameter(carouselItems, "carouselItems");
                Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
                return new hp0.b(i17, carouselItems, pinalyticsState);
            case 8:
                return e((rn1.a) obj);
            case 9:
                Bitmap image = (Bitmap) obj;
                eu0.c cVar = (eu0.c) obj2;
                du0.a aVar = (du0.a) cVar.getView();
                Intrinsics.f(image);
                fu0.d dVar = (fu0.d) aVar;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(image, "image");
                ThumbnailScrubberPreview thumbnailScrubberPreview = dVar.f62972j0;
                if (thumbnailScrubberPreview != null) {
                    thumbnailScrubberPreview.g(i14, image);
                }
                cVar.v3(i14, image);
                return Unit.f80348a;
            case 10:
                ((zv0.j) ((vv0.c) ((yv0.c) obj2).getView())).Y8(i14, null);
                return Unit.f80348a;
            case 11:
                return e((rn1.a) obj);
            case 12:
                return b((an1.l) obj);
            case 13:
                return b((an1.l) obj);
            case 14:
                f((wm1.k0) obj);
                return Unit.f80348a;
            case 15:
                return b((an1.l) obj);
            case 16:
                return b((an1.l) obj);
            case 17:
                f((wm1.k0) obj);
                return Unit.f80348a;
            case 18:
                return e((rn1.a) obj);
            case 19:
                return e((rn1.a) obj);
            case 20:
                fk1.d it4 = (fk1.d) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                List list = it4.f62348a;
                int i18 = m60.w0.quiz_questions_plurals;
                ((qb0.a) ((fk1.v) obj2).f62376b).getClass();
                return fk1.d.e(CollectionsKt.m0(new ak1.b(new u50.b0(m60.r0.lego_grid_cell_chips_spacing), null), CollectionsKt.m0(new ej1.d(ni1.e0.f90644c, bs1.c.i2(i18, i14, qb0.j.b(i14)), vn1.c.SUBTLE, null, 0, null, null, null, null, null, 1016), list)));
            case 21:
                androidx.recyclerview.widget.w diffResult = (androidx.recyclerview.widget.w) obj;
                Intrinsics.checkNotNullParameter(diffResult, "diffResult");
                return new wt1.b0(diffResult, i14, obj2);
            case 22:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                return new GestaltSpinner(fc0.k.a(context, i14), (ln1.d) obj2);
            case 23:
                um1.b it5 = (um1.b) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                om1.e eVar2 = (om1.e) obj2;
                return um1.b.e(it5, (eVar2 == om1.e.XL || eVar2 == om1.e.LG) ? Integer.valueOf(i14) : null, fm1.c.VISIBLE, 0, 10);
            case 24:
                return e((rn1.a) obj);
            case 25:
                return e((rn1.a) obj);
            case 26:
                return e((rn1.a) obj);
            case 27:
                return e((rn1.a) obj);
            case 28:
                qr1.c cVar2 = (qr1.c) obj;
                zq1.y yVar = (zq1.y) obj2;
                Intrinsics.f(cVar2);
                yVar.getClass();
                Boolean G3 = cVar2.f104978a.G3();
                Intrinsics.checkNotNullExpressionValue(G3, "getIsPartner(...)");
                boolean booleanValue = G3.booleanValue();
                com.pinterest.identity.authentication.a aVar2 = yVar.f142741b;
                if (booleanValue) {
                    aVar2.getClass();
                    wq1.f fVar = new wq1.f();
                    Bundle bundle = new Bundle();
                    bundle.putString("com.pinterest.identity.EXTRA_BUSINESS_CREATE_ACCOUNT_TYPE", "CREATE");
                    fVar.setArguments(bundle);
                    androidx.fragment.app.w0 supportFragmentManager = aVar2.f49817b.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    mo1.c.c(supportFragmentManager, vq1.b.fragment_wrapper, fVar, true, null, 48);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("com.pinterest.EXTRA_SIGNUP_STEP_NUMBER", i14);
                    Unit unit = Unit.f80348a;
                    aVar2.b(cVar2, bundle2);
                }
                return Unit.f80348a;
            default:
                en1.d it6 = (en1.d) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                Context context2 = ((yv1.d) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return en1.d.e(it6, null, null, null, false, new en1.v(new u50.u(bs1.c.c0(context2, i14))), null, false, 0, 479);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(Object obj, int i13, int i14) {
        super(1);
        this.f24969i = i14;
        this.f24971k = obj;
        this.f24970j = i13;
    }
}
