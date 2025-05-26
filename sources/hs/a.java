package hs;

import an1.l;
import android.content.Context;
import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gs0;
import com.pinterest.api.model.md0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import cz.m;
import df.j1;
import iz.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kh2.m2;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l82.c0;
import l82.i0;
import lu.v;
import m60.u;
import mu.k;
import n70.g;
import n70.i;
import nt.g1;
import nt.p1;
import o82.a0;
import o82.u0;
import o82.y0;
import t3.s1;
import tb0.p;
import u50.f0;
import u50.h0;
import vt.r;
import xt.j;
import yn1.f;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70016i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f70017j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70018k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        super(1);
        this.f70016i = i13;
        this.f70017j = obj;
        this.f70018k = obj2;
    }

    public final l b(l it) {
        int i13 = this.f70016i;
        Object obj = this.f70018k;
        Object obj2 = this.f70017j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                g1 g1Var = (g1) obj2;
                String str = (String) obj;
                g1Var.getClass();
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                g1Var.f92046f = str;
                return l.e(it, null, null, null, null, g1Var.f92045e.indexOf(str), null, null, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                f0 h23 = bs1.c.h2((CharSequence) obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new an1.e(bs1.c.h2((String) it2.next()), null, null, false, 62));
                }
                return l.e(it, h23, null, null, arrayList, 0, null, null, RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP);
        }
    }

    public final ao1.b e(ao1.b it) {
        String string;
        gs0 gs0Var;
        int i13 = this.f70016i;
        Object obj = this.f70018k;
        Object obj2 = this.f70017j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, bs1.c.h2(bs1.c.f2((SbaAdsLeadGenExpandView) obj2, ((p1) obj).f92134b)), null, f.ERROR, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                List list = ((jz.d) obj2).f77742d;
                if (list == null || (gs0Var = (gs0) CollectionsKt.firstOrNull(list)) == null || (string = gs0Var.f38132e) == null) {
                    string = ((iz.s) obj).getResources().getString(m.anket_text_question_default_hint);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                return ao1.b.e(it, null, null, null, ep.b.x(string, "string", string), null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194287);
        }
    }

    public final n70.a f(n70.a it) {
        List list;
        int i13 = this.f70016i;
        int i14 = 0;
        Object obj = this.f70018k;
        Object obj2 = this.f70017j;
        switch (i13) {
            case 27:
                Intrinsics.checkNotNullParameter(it, "it");
                a0 a0Var = (a0) ((c0) obj2).f82212a;
                List list2 = a0Var.f93524a;
                ArrayList sectionStates = new ArrayList(g0.q(list2, 10));
                for (Object obj3 : list2) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    y0 y0Var = (y0) obj3;
                    List list3 = y0Var.f93756a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list3) {
                        i0 i0Var = ((u0) obj4).f93721a;
                        if ((i0Var instanceof o70.a) || (i0Var instanceof o70.c)) {
                            arrayList.add(obj4);
                        }
                    }
                    sectionStates.add(y0.f(y0Var, arrayList, null, 6));
                    i14 = i15;
                }
                a0Var.getClass();
                Intrinsics.checkNotNullParameter(sectionStates, "sectionStates");
                a0 a0Var2 = new a0(sectionStates);
                o70.b bVar = (o70.b) obj;
                if (bVar == null || (list = bVar.f93226a) == null) {
                    list = q0.f80391a;
                }
                return n70.a.e(it, null, a0Var2, null, list, null, 21);
            default:
                Intrinsics.checkNotNullParameter(it, "displayState");
                Map map = it.f89595a;
                List list4 = (List) obj2;
                n70.m mVar = (n70.m) obj;
                if (!list4.isEmpty()) {
                    String uid = ((o70.a) list4.get(0)).f93223a.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    map.put(uid, null);
                } else {
                    map.put(((g) mVar).f89611a, null);
                }
                return n70.a.e(it, map, null, null, null, null, 30);
        }
    }

    public final rn1.a h(rn1.a it) {
        u50.i0 i0Var = h0.f120562a;
        int i13 = this.f70016i;
        Object obj = this.f70018k;
        Object obj2 = this.f70017j;
        switch (i13) {
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                v vVar = (v) obj2;
                CharSequence a03 = j1.a0(vVar.getContext().getString(vVar.f84964m, ((vt.m) ((r) obj)).f126616b));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(a03), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 14:
            case 17:
            case 18:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                jz.d dVar = (jz.d) obj2;
                String str = dVar.f77741c;
                if (str != null) {
                    i0Var = new f0(str);
                }
                String str2 = dVar.f77741c;
                fm1.c Z = d7.b.Z(!(str2 == null || str2.length() == 0));
                int i14 = iz.m.F0;
                return rn1.a.y(it, i0Var, null, e0.b(((iz.m) obj).d8() ? vn1.b.CENTER : vn1.b.START), null, null, 0, Z, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097082);
            case 15:
                Intrinsics.checkNotNullParameter(it, "state");
                yu.f fVar = (yu.f) obj2;
                Context context = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return rn1.a.y(it, bs1.c.h2(m2.C0(context, fVar.f140154j, (String) obj)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                f30 f30Var = (f30) obj2;
                String z63 = f30Var.z6();
                if (z63 == null && (z63 = f30Var.r4()) == null) {
                    z63 = ((GestaltText) obj).getContext().getString(ps.s.ads_showcase_default_feature_title);
                }
                Intrinsics.f(z63);
                return rn1.a.y(it, bs1.c.h2(z63), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                jz.d dVar2 = (jz.d) obj2;
                String str3 = dVar2.f77741c;
                if (str3 != null) {
                    i0Var = new f0(str3);
                }
                String str4 = dVar2.f77741c;
                fm1.c Z2 = d7.b.Z(!(str4 == null || str4.length() == 0));
                int i15 = iz.c.B0;
                return rn1.a.y(it, i0Var, null, e0.b(((iz.c) obj).d8() ? vn1.b.CENTER : vn1.b.START), null, null, 0, Z2, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097082);
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                jz.d dVar3 = (jz.d) obj2;
                String str5 = dVar3.f77741c;
                if (str5 != null) {
                    i0Var = new f0(str5);
                }
                String str6 = dVar3.f77741c;
                fm1.c Z3 = d7.b.Z(!(str6 == null || str6.length() == 0));
                int i16 = h.C0;
                return rn1.a.y(it, i0Var, null, e0.b(((h) obj).d8() ? vn1.b.CENTER : vn1.b.START), null, null, 0, Z3, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097082);
        }
    }

    public final void i(f30 f30Var) {
        int i13 = this.f70016i;
        Object obj = this.f70018k;
        Object obj2 = this.f70017j;
        switch (i13) {
            case 14:
                j80.b bVar = (j80.b) ((nu.b) obj2).f92309d;
                Intrinsics.f(f30Var);
                ((u50.r) obj).a(new k(bVar.a(f30Var), f30Var));
                break;
            default:
                u50.r rVar = (u50.r) obj2;
                Intrinsics.f(f30Var);
                String uid = ((f30) obj).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                rVar.a(new i(f30Var, uid));
                rVar.a(n70.b.f89602a);
                u.f85943a.d(new md0());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0303  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hs.a.invoke(java.lang.Object):java.lang.Object");
    }

    public final void j(Throwable th3) {
        int i13 = this.f70016i;
        Object obj = this.f70018k;
        Object obj2 = this.f70017j;
        switch (i13) {
            case 0:
                ((c) obj2).f70026c.remove(obj);
                break;
            case 1:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(th3, s1.c("[Promoted Pin Preview] Ad Preview API fail. pinId: ", ((ls.d) obj2).f84614y, " adPreviewKey: ", (String) obj), p.AD_FORMATS);
                break;
            default:
                ((kk2.a) ((uj2.c0) obj2)).c(new IllegalStateException(a.a.k("User with ID: ", (String) obj, " NOT found in user repository")));
                break;
        }
    }

    public final void l(j state) {
        wy0 a63;
        String Z2;
        xt.k kVar;
        int i13 = this.f70016i;
        Object obj = this.f70018k;
        Object obj2 = this.f70017j;
        switch (i13) {
            case 11:
                yu.f fVar = (yu.f) obj2;
                if (fVar != null) {
                    Intrinsics.f(state);
                    Intrinsics.checkNotNullParameter(state, "state");
                    if (state instanceof xt.i) {
                        xt.i iVar = (xt.i) state;
                        f30 f30Var = iVar.f135879a;
                        if (b40.w0(f30Var)) {
                            lh0.g gVar = fVar.f140152h;
                            if (gVar == null) {
                                Intrinsics.r("experiments");
                                throw null;
                            }
                            if (gVar.c()) {
                                fVar.f140154j = ps.s.ads_sponsored_by;
                            }
                        }
                        if (f30Var != null && (a63 = f30Var.a6()) != null && (Z2 = a63.Z2()) != null) {
                            Object value = fVar.f140153i.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            ((GestaltText) value).i(new a(15, fVar, Z2));
                        }
                        fVar.getPinterestRecyclerView().h(iVar.f135881c, true);
                    }
                }
                if (state instanceof xt.i) {
                    ((zt.d) obj).x3(((xt.i) state).f135880b);
                    return;
                }
                return;
            default:
                if (state instanceof xt.i) {
                    zt.d dVar = (zt.d) obj2;
                    dVar.v3();
                    zu.c cVar = (zu.c) obj;
                    if (cVar != null) {
                        Intrinsics.f(state);
                        Intrinsics.checkNotNullParameter(state, "state");
                        if (state instanceof xt.i) {
                            cVar.getPinterestRecyclerView().h(0, true);
                        }
                    }
                    dVar.x3(((xt.i) state).f135883e);
                    if (cVar == null || (kVar = cVar.f142793g) == null) {
                        return;
                    }
                    kVar.d();
                    return;
                }
                return;
        }
    }
}
