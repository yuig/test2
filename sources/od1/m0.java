package od1;

import android.net.Uri;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.sr;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import la0.l1;
import o82.b1;
import o82.i2;
import o82.y0;

/* loaded from: classes5.dex */
public final class m0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f94138b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.d f94139c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.h0 f94140d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.h0 f94141e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.h0 f94142f;

    public m0(lt.j impressionStateTransformer, o82.i0 multiSectionStateTransformer, lt.j pinalyticsTransformer) {
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        Intrinsics.checkNotNullParameter(impressionStateTransformer, "impressionStateTransformer");
        this.f94138b = multiSectionStateTransformer;
        this.f94139c = pinalyticsTransformer;
        this.f94140d = b(pinalyticsTransformer, new kotlin.jvm.internal.d0() { // from class: od1.k0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f94114g;
            }
        }, new kotlin.jvm.internal.d0() { // from class: od1.l0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((n0) obj).f94154i;
            }
        }, h0.f94129l);
        this.f94141e = b(impressionStateTransformer, new kotlin.jvm.internal.d0() { // from class: od1.f0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f94115h;
            }
        }, new kotlin.jvm.internal.d0() { // from class: od1.g0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((n0) obj).f94154i;
            }
        }, h0.f94127j);
        this.f94142f = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: od1.i0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((b) obj).f94113f;
            }
        }, new kotlin.jvm.internal.d0() { // from class: od1.j0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((n0) obj).f94153h;
            }
        }, h0.f94128k);
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        n0 vmState = (n0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.c0 c13 = this.f94139c.c(vmState.f94154i);
        l82.d dVar = this.f94138b;
        o82.j0 j0Var = vmState.f94153h;
        l82.c0 c14 = dVar.c(j0Var);
        ArrayList arrayList = new ArrayList();
        List list = c14.f82214c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new d0((o82.h0) it.next()));
        }
        arrayList.addAll(arrayList2);
        List list2 = c13.f82214c;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new v((zy.k0) it2.next()));
        }
        arrayList.addAll(arrayList3);
        i2 i2Var = (i2) CollectionsKt.U(0, j0Var.f93634a);
        Object obj = i2Var != null ? i2Var.f93619a : null;
        arrayList.add(new a0(obj instanceof pd1.f ? (pd1.f) obj : null));
        arrayList.add(new b0(vmState.f94147b));
        return new l82.c0(new b(vmState.f94146a, (o82.a0) c14.f82212a, (zy.a0) c13.f82212a, RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER), n0.b(vmState, null, (zy.l0) c13.f82213b, 255), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.ArrayList] */
    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        String str;
        Set keySet;
        pd1.f fVar;
        k00 q13;
        String q14;
        ?? r23;
        List list;
        l event = (l) sVar;
        b priorDisplayState = (b) oVar;
        n0 priorVMState = (n0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        if (Intrinsics.d(event, c.f94117a)) {
            h32.i0 context = priorVMState.f94154i.f143086a;
            Intrinsics.checkNotNullParameter(context, "context");
            u0 element = u0.BACK_BUTTON;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(element, "element");
            resultBuilder.d(new w(new zy.e0(new zy.a(com.bumptech.glide.d.z0(context, new l1(element, 6)), f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION))), x.f94180a);
            return resultBuilder.e();
        }
        if (event instanceof f) {
            List list2 = priorDisplayState.f94113f.f93524a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof y0) {
                    arrayList.add(obj);
                }
            }
            y0 y0Var = (y0) CollectionsKt.firstOrNull(arrayList);
            if (y0Var == null || (list = y0Var.f93756a) == null) {
                r23 = q0.f80391a;
            } else {
                List list3 = list;
                r23 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    r23.add(((pd1.b) ((o82.u0) it.next()).f93721a).f99803a);
                }
            }
            f30 f30Var = ((f) event).f94122a;
            zy.l0 l0Var = priorVMState.f94154i;
            return new l82.c0(priorDisplayState, priorVMState, kotlin.collections.e0.b(new y(f30Var, r23, l0Var.f143086a, l0Var.f143087b)));
        }
        if (event instanceof e) {
            return new l82.c0(b.e(priorDisplayState, null, ((e) event).f94121a, null, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL), priorVMState, q0.f80391a);
        }
        if (event instanceof d) {
            g00 g00Var = ((d) event).f94119a;
            if (g00Var == null || (q13 = g00Var.q()) == null || (q14 = q13.q()) == null) {
                fVar = new pd1.f(priorVMState.f94147b, priorVMState.f94148c, priorVMState.f94149d, priorVMState.f94150e, priorVMState.f94151f, priorVMState.f94152g, "0.0", "0.0", "0.0", "0.0");
            } else {
                try {
                    Uri parse = Uri.parse(q14);
                    Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                    fVar = new pd1.f(priorVMState.f94147b, Boolean.valueOf(parse.getBooleanQueryParameter("is_shopping", false)), parse.getQueryParameter("entry_source"), parse.getQueryParameter("entry_point"), parse.getQueryParameter("crop_source"), parse.getQueryParameter("request_params"), parse.getQueryParameter("x"), parse.getQueryParameter("y"), parse.getQueryParameter("w"), parse.getQueryParameter("h"));
                } catch (Exception unused) {
                    fVar = new pd1.f(priorVMState.f94147b, priorVMState.f94148c, priorVMState.f94149d, priorVMState.f94150e, priorVMState.f94151f, priorVMState.f94152g, "0.0", "0.0", "0.0", "0.0");
                }
            }
            l82.c0 e13 = this.f94138b.e(new o82.f0(0, new b1(fVar, true)), priorDisplayState.f94113f, priorVMState.f94153h);
            b e14 = b.e(priorDisplayState, null, null, (o82.a0) e13.f82212a, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE);
            n0 b13 = n0.b(priorVMState, (o82.j0) e13.f82213b, null, 383);
            List list4 = e13.f82214c;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new d0((o82.h0) it2.next()));
            }
            return new l82.c0(e14, b13, arrayList2);
        }
        if (event instanceof g) {
            g gVar = (g) event;
            Map A4 = gVar.f94124a.A4();
            String str2 = (A4 == null || (keySet = A4.keySet()) == null) ? null : (String) CollectionsKt.T(keySet);
            Map A42 = gVar.f94124a.A4();
            sr srVar = A42 != null ? (sr) A42.getOrDefault(str2, null) : null;
            if (srVar == null || (str = srVar.j()) == null) {
                str = "";
            }
            return new l82.c0(b.e(priorDisplayState, str, null, null, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE), priorVMState, q0.f80391a);
        }
        if (event instanceof j) {
            l82.f0 transformation = this.f94142f.c(((j) event).f94133a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation, "transformation");
            transformation.i(resultBuilder);
            return resultBuilder.e();
        }
        if (event instanceof h) {
            l82.f0 transformation2 = this.f94141e.c(((h) event).f94126a);
            Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
            Intrinsics.checkNotNullParameter(transformation2, "transformation");
            transformation2.i(resultBuilder);
            return resultBuilder.e();
        }
        if (!(event instanceof i)) {
            throw new NoWhenBranchMatchedException();
        }
        l82.d0 transformation3 = this.f94140d.d(((i) event).f94131a);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        Intrinsics.checkNotNullParameter(transformation3, "transformation");
        transformation3.i(resultBuilder);
        return resultBuilder.e();
    }
}
