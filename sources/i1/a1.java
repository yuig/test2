package i1;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.typeahead.ClientCacheWorker;
import com.pinterest.ui.imageview.WebImageView;
import i2.v3;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s3.a2;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70715i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f70716j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70717k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f70718l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f70715i = i13;
        this.f70716j = obj;
        this.f70717k = obj2;
        this.f70718l = obj3;
    }

    public final void b(q3.b1 b1Var) {
        int i13 = this.f70715i;
        Object obj = this.f70718l;
        Object obj2 = this.f70717k;
        Object obj3 = this.f70716j;
        switch (i13) {
            case 2:
                p1.s0 s0Var = (p1.s0) obj3;
                if (!s0Var.f98594p) {
                    q3.r0 r0Var = (q3.r0) obj;
                    q3.b1.d(b1Var, (q3.c1) obj2, r0Var.R(s0Var.f98592n), r0Var.R(s0Var.f98593o));
                    break;
                } else {
                    q3.r0 r0Var2 = (q3.r0) obj;
                    q3.b1.f(b1Var, (q3.c1) obj2, r0Var2.R(s0Var.f98592n), r0Var2.R(s0Var.f98593o));
                    break;
                }
            default:
                p1.w0 w0Var = (p1.w0) obj3;
                if (!w0Var.f98615r) {
                    q3.r0 r0Var3 = (q3.r0) obj;
                    q3.b1.d(b1Var, (q3.c1) obj2, r0Var3.R(w0Var.f98611n), r0Var3.R(w0Var.f98612o));
                    break;
                } else {
                    q3.r0 r0Var4 = (q3.r0) obj;
                    q3.b1.f(b1Var, (q3.c1) obj2, r0Var4.R(w0Var.f98611n), r0Var4.R(w0Var.f98612o));
                    break;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        List list;
        String str;
        String B0;
        int i13 = this.f70715i;
        int i14 = 8;
        int i15 = 25;
        b3.b1 b1Var = null;
        Unit unit2 = null;
        b1Var = null;
        int i16 = 0;
        Object obj2 = this.f70718l;
        Object obj3 = this.f70717k;
        Object obj4 = this.f70716j;
        switch (i13) {
            case 0:
                v3 v3Var = (v3) obj4;
                b3.u0 u0Var = (b3.u0) ((b3.d0) obj);
                u0Var.f(v3Var != null ? ((Number) v3Var.getValue()).floatValue() : 1.0f);
                v3 v3Var2 = (v3) obj3;
                u0Var.l(v3Var2 != null ? ((Number) v3Var2.getValue()).floatValue() : 1.0f);
                u0Var.n(v3Var2 != null ? ((Number) v3Var2.getValue()).floatValue() : 1.0f);
                v3 v3Var3 = (v3) obj2;
                u0Var.D(v3Var3 != null ? ((b3.b1) v3Var3.getValue()).f21306a : b3.b1.f21304b);
                return Unit.f80348a;
            case 1:
                int i17 = c1.f70733a[((w0) obj).ordinal()];
                if (i17 == 1) {
                    b1Var = (b3.b1) obj4;
                } else if (i17 == 2) {
                    t1 t1Var = ((n1) obj3).f70855a.f70949d;
                    if (t1Var != null) {
                        b1Var = new b3.b1(t1Var.f70902b);
                    } else {
                        t1 t1Var2 = ((o1) obj2).f70860a.f70949d;
                        if (t1Var2 != null) {
                            b1Var = new b3.b1(t1Var2.f70902b);
                        }
                    }
                } else {
                    if (i17 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t1 t1Var3 = ((o1) obj2).f70860a.f70949d;
                    if (t1Var3 != null) {
                        b1Var = new b3.b1(t1Var3.f70902b);
                    } else {
                        t1 t1Var4 = ((n1) obj3).f70855a.f70949d;
                        if (t1Var4 != null) {
                            b1Var = new b3.b1(t1Var4.f70902b);
                        }
                    }
                }
                return new b3.b1(b1Var != null ? b1Var.f21306a : b3.b1.f21304b);
            case 2:
                b((q3.b1) obj);
                return Unit.f80348a;
            case 3:
                b((q3.b1) obj);
                return Unit.f80348a;
            case 4:
                p4.j jVar = (p4.j) obj4;
                s3.k0 k0Var = (s3.k0) obj3;
                p4.j jVar2 = (p4.j) obj2;
                b3.u a13 = ((d3.h) obj).p0().a();
                if (jVar.f98795b.getVisibility() != 8) {
                    jVar.f98814u = true;
                    a2 a2Var = k0Var.f110821i;
                    t3.c0 c0Var = a2Var instanceof t3.c0 ? (t3.c0) a2Var : null;
                    if (c0Var != null) {
                        Canvas b13 = b3.e.b(a13);
                        c0Var.k();
                        jVar2.draw(b13);
                    }
                    jVar.f98814u = false;
                }
                return Unit.f80348a;
            case 5:
                Throwable th3 = (Throwable) obj;
                ((Function1) obj4).invoke(th3);
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) obj3;
                ((co2.q) qVar.f33805c).r(th3);
                do {
                    Object b14 = co2.t.b(((co2.q) qVar.f33805c).m());
                    if (b14 == null) {
                        unit = null;
                    } else {
                        ((Function2) obj2).invoke(b14, th3);
                        unit = Unit.f80348a;
                    }
                } while (unit != null);
                return Unit.f80348a;
            case 6:
                pc.h hVar = (pc.h) obj;
                try {
                    list = hVar.f99564d;
                } catch (Exception e13) {
                    ((dy.d) obj4).b("firebase_analytics_user_state_failure", "Exception: " + e13.getMessage(), null);
                }
                if (list != null && !list.isEmpty()) {
                    List list2 = hVar.f99564d;
                    Intrinsics.f(list2);
                    ((dy.d) obj4).b("firebase_analytics_user_state_failure", "Multiple Errors: " + CollectionsKt.Z(list2, "; ", null, null, 0, null, dy.c.f56526k, 30), null);
                    return Unit.f80348a;
                }
                y30.v vVar = (y30.v) hVar.f99563c;
                y30.u uVar = vVar != null ? vVar.f136769a : null;
                if (uVar instanceof y30.t) {
                    String str2 = ((y30.t) uVar).f136768e;
                    ((dy.d) obj4).getClass();
                    if (Intrinsics.d(str2, "5") && (str = (String) obj3) != null && str.length() != 0) {
                        Set set = dy.e.f56537b;
                        String lowerCase = ((String) obj3).toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (set.contains(lowerCase)) {
                            String value = ((m60.d) m60.d.a()).d();
                            Bundle bundle = new Bundle();
                            Intrinsics.checkNotNullParameter("event_type", "key");
                            Intrinsics.checkNotNullParameter("rez", "value");
                            bundle.putString("event_type", "rez");
                            Intrinsics.checkNotNullParameter("app_version", "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            bundle.putString("app_version", value);
                            com.google.android.gms.internal.measurement.d1 d1Var = ((FirebaseAnalytics) obj2).f33719a;
                            d1Var.getClass();
                            d1Var.b(new com.google.android.gms.internal.measurement.n1(d1Var, null, "neworrez", bundle, false));
                            ((dy.d) obj4).b("firebase_analytics_event_success", null, "neworrez - rez");
                        }
                    }
                } else {
                    ((dy.d) obj4).b("firebase_analytics_user_state_failure", "Unexpected response type", null);
                }
                return Unit.f80348a;
            case 7:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                WebImageView webImageView = new WebImageView(context);
                String str3 = (String) obj2;
                webImageView.setScaleType((ImageView.ScaleType) obj4);
                ((Function1) obj3).invoke(webImageView);
                if (str3 != null) {
                    webImageView.V1(str3, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
                }
                return webImageView;
            case 8:
                vd0.c response = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                i32.y0[] y0VarArr = (i32.y0[]) obj4;
                int length = y0VarArr.length;
                while (i16 < length) {
                    ((dh0.d) obj3).f54984c.remove(y0VarArr[i16]);
                    i16++;
                }
                return ((dh0.d) obj3).f54983b.b((nl.b) obj2, response);
            case 9:
                sq0.v vVar2 = (sq0.v) obj;
                yq0.z zVar = (yq0.z) obj4;
                yq0.a0 a0Var = (yq0.a0) obj3;
                sq0.f0 f0Var = zVar.f139759e;
                List s13 = f0Var.s();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : s13) {
                    yq0.a0 a0Var2 = (yq0.a0) obj5;
                    wk1.e eVar = a0Var2 instanceof wk1.e ? (wk1.e) a0Var2 : null;
                    if (((eVar != null && eVar.s()) ^ true) != false) {
                        arrayList.add(obj5);
                    }
                }
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                int indexOf = arrayList.indexOf(a0Var);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Data source was not found in the registry.");
                }
                List s14 = f0Var.s();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : s14) {
                    yq0.a0 a0Var3 = (yq0.a0) obj6;
                    wk1.e eVar2 = a0Var3 instanceof wk1.e ? (wk1.e) a0Var3 : null;
                    if (((eVar2 != null && eVar2.s()) ^ true) != false) {
                        arrayList2.add(obj6);
                    }
                }
                Iterator it = arrayList2.subList(0, indexOf).iterator();
                while (it.hasNext()) {
                    i16 += ((yq0.a0) it.next()).a();
                }
                if (vVar2 instanceof sq0.u) {
                    yq0.x xVar = (yq0.x) ((kotlin.jvm.internal.j0) obj2).f80434a;
                    if (xVar != null) {
                        xVar.c(a0Var);
                    }
                    zVar.h();
                } else if (vVar2 instanceof sq0.r) {
                    yq0.x xVar2 = (yq0.x) ((kotlin.jvm.internal.j0) obj2).f80434a;
                    if (xVar2 != null) {
                        xVar2.d(a0Var, ((sq0.r) vVar2).f115033b);
                    }
                    sq0.r rVar = (sq0.r) vVar2;
                    zVar.n(rVar.f115032a + i16, rVar.f115033b);
                } else if (vVar2 instanceof sq0.t) {
                    yq0.x xVar3 = (yq0.x) ((kotlin.jvm.internal.j0) obj2).f80434a;
                    if (xVar3 != null) {
                        xVar3.g(a0Var, ((sq0.t) vVar2).f115037b);
                    }
                    sq0.t tVar = (sq0.t) vVar2;
                    zVar.o(tVar.f115036a + i16, tVar.f115037b);
                } else if (vVar2 instanceof sq0.p) {
                    yq0.x xVar4 = (yq0.x) ((kotlin.jvm.internal.j0) obj2).f80434a;
                    if (xVar4 != null) {
                        xVar4.e(a0Var);
                    }
                    sq0.p pVar = (sq0.p) vVar2;
                    zVar.l(pVar.f115029a + i16, pVar.f115030b);
                } else if (vVar2 instanceof sq0.s) {
                    yq0.x xVar5 = (yq0.x) ((kotlin.jvm.internal.j0) obj2).f80434a;
                    if (xVar5 != null) {
                        xVar5.f(a0Var);
                    }
                    sq0.s sVar = (sq0.s) vVar2;
                    zVar.k(sVar.f115034a + i16, sVar.f115035b + i16);
                } else {
                    if (!(vVar2 instanceof sq0.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((sq0.q) vVar2).f115031a.a(new yq0.i(i16, zVar, a0Var, (yq0.x) ((kotlin.jvm.internal.j0) obj2).f80434a));
                }
                Unit unit3 = Unit.f80348a;
                el.a.B(unit3);
                return unit3;
            case 10:
                List a14 = ((DynamicFeed) obj4).a();
                Intrinsics.checkNotNullExpressionValue(a14, "getItems(...)");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : a14) {
                    if (obj7 instanceof f30) {
                        arrayList3.add(obj7);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Integer num = (Integer) obj3;
                    if (num == null) {
                        com.pinterest.feature.home.model.j jVar3 = (com.pinterest.feature.home.model.j) obj2;
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            String B02 = bs1.c.B0((f30) it2.next());
                            if (B02 != null) {
                                ((hs1.m) jVar3.f45808h).q(B02, null, null);
                            }
                        }
                    } else {
                        com.pinterest.feature.home.model.j jVar4 = (com.pinterest.feature.home.model.j) obj2;
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i18 = i16 + 1;
                            if (i16 < 0) {
                                kotlin.collections.f0.p();
                                throw null;
                            }
                            f30 f30Var = (f30) next;
                            if (i16 < num.intValue() && (B0 = bs1.c.B0(f30Var)) != null) {
                                ((hs1.m) jVar4.f45808h).q(B0, null, null);
                            }
                            i16 = i18;
                        }
                    }
                }
                return Unit.f80348a;
            case 11:
                rl1.q it4 = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                String str4 = (String) obj4;
                String str5 = ((ij1.a) obj3).f72342b;
                ij1.j jVar5 = (ij1.j) obj2;
                rl1.c cVar = jVar5.f72357m;
                return rl1.q.e(it4, str4, str5, false, null, null, false, false, null, 0, cVar == null ? new rl1.d(jVar5.f72359o.f72376b.f72341a) : cVar, null, 1532);
            case 12:
                u50.p0 styledString = (u50.p0) obj;
                Intrinsics.checkNotNullParameter(styledString, "$this$styledString");
                fk1.v vVar3 = (fk1.v) obj4;
                int i19 = ((wa2.m) obj3).Z ? eo1.b.color_themed_text_light : eo1.b.color_themed_text_default;
                ps0.m mVar = fk1.v.f62375f;
                vVar3.getClass();
                int i23 = wy1.c.ic_tag_outline;
                Integer valueOf = Integer.valueOf(i19);
                Integer valueOf2 = Integer.valueOf(eo1.c.space_300);
                u00.e init = new u00.e(styledString, i15);
                styledString.getClass();
                Intrinsics.checkNotNullParameter(init, "init");
                styledString.c(new u50.v(i23, 2, valueOf, valueOf2), 33, init);
                styledString.e(" ");
                styledString.e((String) obj2);
                return Unit.f80348a;
            case 13:
                dl1.s sVar2 = (dl1.s) obj;
                dl1.q0 q0Var = (dl1.q0) obj4;
                if (q0Var.f55270c.b((dl1.m) obj3, dl1.a.WRITE)) {
                    q0Var.f55274g.a((dl1.m) obj2, sVar2);
                }
                return Unit.f80348a;
            case 14:
                GestaltText component = (GestaltText) obj;
                Intrinsics.checkNotNullParameter(component, "component");
                GestaltText i24 = component.i(new hk1.t((rn1.a) obj4, i14));
                gm1.a aVar = (gm1.a) obj3;
                Function1 function1 = (Function1) obj2;
                if (aVar != null) {
                    i24.j(aVar);
                }
                if (function1 != null) {
                    i24.getViewTreeObserver().addOnGlobalLayoutListener(new hm1.g(i16, i24, function1));
                }
                return Unit.f80348a;
            case 15:
                Intrinsics.checkNotNullParameter((u50.i0) obj, "it");
                ao1.b bVar = (ao1.b) obj4;
                u50.i0 i0Var = bVar.f20032c;
                GestaltTextField gestaltTextField = (GestaltTextField) obj3;
                Context context2 = gestaltTextField.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                if (bs1.c.i1(i0Var, context2) && gestaltTextField.f49675f == null) {
                    Context context3 = gestaltTextField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
                    gestaltTextField.f49675f = gestaltText;
                    gestaltText.i(ao1.g.f20077k);
                    int G0 = dl2.b.G0(gestaltTextField, eo1.a.comp_textfield_vertical_gap);
                    gestaltText.setPaddingRelative(gestaltTextField.f49684o ? dl2.b.G0(gestaltTextField, eo1.a.comp_textfield_horizontal_padding) : 0, G0, 0, G0);
                    int id3 = gestaltText.getId();
                    androidx.constraintlayout.widget.p pVar2 = gestaltTextField.f49679j;
                    pVar2.l(id3, 6, 0, 6);
                    pVar2.l(gestaltText.getId(), 3, gestaltTextField.r0().getId(), 4);
                    GestaltText gestaltText2 = gestaltTextField.f49676g;
                    if (gestaltText2 != null) {
                        pVar2.l(gestaltText.getId(), 7, gestaltText2.getId(), 6);
                        unit2 = Unit.f80348a;
                    }
                    if (unit2 == null) {
                        pVar2.l(gestaltText.getId(), 7, 0, 7);
                    }
                    pVar2.n(gestaltText.getId(), -2);
                    pVar2.o(gestaltText.getId(), 0);
                    gestaltText.setImportantForAccessibility(1);
                    gestaltText.setFocusableInTouchMode(true);
                    gestaltTextField.addView(gestaltText);
                    pVar2.b(gestaltTextField);
                }
                ao1.b bVar2 = (ao1.b) obj2;
                int i25 = bVar2.f20033d;
                GestaltText gestaltText3 = gestaltTextField.f49675f;
                if (gestaltText3 != null) {
                    gestaltText3.i(new rq.a0(bVar.f20032c, i25, gestaltTextField, i15));
                }
                TextInputLayout r03 = gestaltTextField.r0();
                Context context4 = gestaltTextField.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                zn1.a aVar2 = new zn1.a(context4, gestaltTextField.r0(), bVar2);
                EditText editText = r03.f33167d;
                if (editText != null) {
                    q5.v0.o(editText, aVar2);
                }
                return Unit.f80348a;
            default:
                ClientCacheWorker clientCacheWorker = (ClientCacheWorker) obj4;
                clientCacheWorker.f52198g.h("Successfully downloaded cache file: " + ((String) obj3));
                gp1.l lVar = clientCacheWorker.f52197f;
                int g13 = lVar.f65940b.g("PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED", 0) + 1;
                lb0.q qVar2 = lVar.f65940b;
                qVar2.i("PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED", g13);
                if (clientCacheWorker.f52200i) {
                    tb0.k kVar = new tb0.k();
                    kVar.c("status", "success");
                    clientCacheWorker.f52198g.k("search_typeahead_db_installation", kVar.f117102a);
                }
                Iterator it5 = (Iterator) obj2;
                if (it5.hasNext()) {
                    clientCacheWorker.j(it5);
                } else {
                    qVar2.i("PREF_TYPEAHEAD_CACHE_LAST_PARTITION_FETCHED", 0);
                    qVar2.k("PREF_TYPEAHEAD_CACHE_READY", true);
                    qVar2.b("PREF_TYPEAHEAD_CACHE_TIME", Calendar.getInstance().getTime().toString());
                }
                return Unit.f80348a;
        }
    }
}
