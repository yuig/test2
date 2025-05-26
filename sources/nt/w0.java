package nt;

import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.o3;

/* loaded from: classes3.dex */
public final class w0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92217b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f92218c;

    public w0(dx.a adsStlEventGenerator) {
        Intrinsics.checkNotNullParameter(adsStlEventGenerator, "adsStlEventGenerator");
        this.f92218c = adsStlEventGenerator;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 vmState) {
        List list;
        Object obj;
        boolean z13 = true;
        int i13 = 0;
        int i14 = this.f92217b;
        Object obj2 = this.f92218c;
        switch (i14) {
            case 0:
                x0 vmState2 = (x0) vmState;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                return new l82.c0(new v(), x0.b(vmState2, 0L, a.SIGN_UP_INVISIBLE, 0L, false, null, false, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE), kotlin.collections.q0.f80391a);
            case 1:
                gx.k vmState3 = (gx.k) vmState;
                Intrinsics.checkNotNullParameter(vmState3, "vmState");
                kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
                j0Var.f80434a = "";
                vh vhVar = vmState3.f66257b;
                androidx.compose.foundation.lazy.layout.z0 errorMsg = new androidx.compose.foundation.lazy.layout.z0(6, j0Var);
                Intrinsics.checkNotNullParameter(vhVar, "<this>");
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                try {
                    Map c13 = vhVar.c();
                    if (c13 == null || (obj = c13.get("categories")) == null) {
                        list = kotlin.collections.q0.f80391a;
                    } else {
                        List list2 = (List) obj;
                        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            Map map = (Map) it.next();
                            com.pinterest.api.model.g2 g2Var = new com.pinterest.api.model.g2(i13);
                            boolean[] zArr = g2Var.f37916l;
                            Object obj3 = map.get("category_id");
                            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.String");
                            g2Var.f37908d = (String) obj3;
                            Iterator it2 = it;
                            if (zArr.length > 3) {
                                zArr[3] = z13;
                            }
                            Object obj4 = map.get("x");
                            Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.Double");
                            g2Var.f37914j = (Double) obj4;
                            if (zArr.length > 9) {
                                zArr[9] = z13;
                            }
                            Object obj5 = map.get("y");
                            Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.Double");
                            g2Var.f37915k = (Double) obj5;
                            if (zArr.length > 10) {
                                zArr[10] = z13;
                            }
                            Object obj6 = map.get("w");
                            Intrinsics.g(obj6, "null cannot be cast to non-null type kotlin.Double");
                            g2Var.f37913i = (Double) obj6;
                            if (zArr.length > 8) {
                                zArr[8] = z13;
                            }
                            Object obj7 = map.get("h");
                            Intrinsics.g(obj7, "null cannot be cast to non-null type kotlin.Double");
                            g2Var.f37909e = (Double) obj7;
                            if (zArr.length > 4) {
                                zArr[4] = z13;
                            }
                            Object obj8 = map.get("label");
                            Intrinsics.g(obj8, "null cannot be cast to non-null type kotlin.String");
                            g2Var.f37910f = (String) obj8;
                            if (zArr.length > 5) {
                                zArr[5] = z13;
                            }
                            Object obj9 = map.get("slot_id");
                            Intrinsics.g(obj9, "null cannot be cast to non-null type kotlin.Double");
                            g2Var.f37911g = Integer.valueOf((int) ((Double) obj9).doubleValue());
                            if (zArr.length > 6) {
                                zArr[6] = true;
                            }
                            Object obj10 = map.get("thumbnail_url");
                            Intrinsics.g(obj10, "null cannot be cast to non-null type kotlin.String");
                            g2Var.f37912h = (String) obj10;
                            if (zArr.length > 7) {
                                zArr[7] = true;
                            }
                            Object obj11 = map.get("background_color");
                            Intrinsics.g(obj11, "null cannot be cast to non-null type kotlin.String");
                            g2Var.f37907c = (String) obj11;
                            if (zArr.length > 2) {
                                z13 = true;
                                zArr[2] = true;
                            } else {
                                z13 = true;
                            }
                            arrayList.add(g2Var.a());
                            it = it2;
                            i13 = 0;
                        }
                        list = CollectionsKt.x0(arrayList, new b4.f(9));
                    }
                } catch (Exception e13) {
                    errorMsg.invoke(e13.toString());
                    list = kotlin.collections.q0.f80391a;
                }
                vh vhVar2 = vmState3.f66257b;
                gx.a aVar = new gx.a(vhVar2, list);
                ArrayList arrayList2 = new ArrayList();
                if (((CharSequence) j0Var.f80434a).length() > 0) {
                    dx.a aVar2 = (dx.a) obj2;
                    String errorMsg2 = kotlin.text.e0.C(4096, (String) j0Var.f80434a);
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(errorMsg2, "errorMsg");
                    h32.i0 a13 = aVar2.a(null, null);
                    h32.f1 f1Var = h32.f1.ADS_STL_ERROR;
                    HashMap hashMap = new HashMap();
                    nm.u uVar = new nm.u();
                    uVar.u("category_parse_error", errorMsg2);
                    String sVar = uVar.toString();
                    Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
                    bs1.c.G1("fail_reason", sVar, hashMap);
                    Unit unit = Unit.f80348a;
                    arrayList2.add(new gx.f(new zy.e0(new zy.a(a13, f1Var, null, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP))));
                } else if (list.isEmpty()) {
                    h32.i0 a14 = ((dx.a) obj2).a(null, null);
                    h32.f1 f1Var2 = h32.f1.ADS_STL_ERROR;
                    HashMap hashMap2 = new HashMap();
                    bs1.c.G1("fail_reason", "zero_categories", hashMap2);
                    Unit unit2 = Unit.f80348a;
                    arrayList2.add(new gx.f(new zy.e0(new zy.a(a14, f1Var2, null, hashMap2, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP))));
                } else {
                    kj kjVar = vhVar2.f42855m;
                    String a15 = kjVar != null ? kjVar.a() : null;
                    if (a15 == null) {
                        a15 = "";
                    }
                    kj kjVar2 = vhVar2.f42856n;
                    String a16 = kjVar2 != null ? kjVar2.a() : null;
                    arrayList2.add(new gx.h(vmState3.f66256a, a15, a16 != null ? a16 : "", list));
                }
                Unit unit3 = Unit.f80348a;
                return new l82.c0(aVar, vmState3, arrayList2);
            case 2:
                sb1.s vmState4 = (sb1.s) vmState;
                Intrinsics.checkNotNullParameter(vmState4, "vmState");
                l82.e d2 = l82.d.d(new sb1.b(false, "", false), vmState4);
                d2.d(new sb1.n(vmState4.f112267a));
                d2.f(sb1.k.f112252k);
                return d2.e();
            case 3:
                gu1.o vmState5 = (gu1.o) vmState;
                Intrinsics.checkNotNullParameter(vmState5, "vmState");
                hu1.l userLoaderVMState = vmState5.f66151a;
                ((lt.j) obj2).getClass();
                Intrinsics.checkNotNullParameter(userLoaderVMState, "vmState");
                hu1.c displayState = new hu1.c();
                List sideEffectRequests = kotlin.collections.e0.b(new hu1.k(userLoaderVMState.f70428a));
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(userLoaderVMState, "vmState");
                Intrinsics.checkNotNullParameter(sideEffectRequests, "sideEffectRequests");
                gu1.b bVar = new gu1.b(cu1.c.demo_three_title, cu1.c.demo_three_description, cu1.c.go_to_demo_four, displayState);
                Intrinsics.checkNotNullParameter(userLoaderVMState, "userLoaderVMState");
                gu1.o oVar = new gu1.o(userLoaderVMState);
                List list3 = sideEffectRequests;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new gu1.l((hu1.k) it3.next()));
                }
                return new l82.c0(bVar, oVar, arrayList3);
            case 4:
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return (l82.c0) ((Function1) obj2).invoke(vmState);
            default:
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return new l82.c0((u50.o) ((o82.p2) obj2).f93689b.invoke(vmState), vmState);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x064b, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x064d, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x065e, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x066e, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x067e, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x068e, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x069e, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x06ae, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x06be, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x06ce, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x06de, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x06ef, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0704  */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r58, u50.o r59, l82.i0 r60, l82.e r61) {
        /*
            Method dump skipped, instructions count: 3228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nt.w0.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }

    public w0(o3 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f92218c = experiments;
    }

    public w0(lt.j navUserModelLoaderStateTransformer) {
        Intrinsics.checkNotNullParameter(navUserModelLoaderStateTransformer, "navUserModelLoaderStateTransformer");
        this.f92218c = navUserModelLoaderStateTransformer;
    }

    public w0(o1 leadGenQuestionValidator) {
        Intrinsics.checkNotNullParameter(leadGenQuestionValidator, "leadGenQuestionValidator");
        this.f92218c = leadGenQuestionValidator;
    }

    public w0(o82.p2 p2Var) {
        this.f92218c = p2Var;
    }

    public w0(s02.m starter) {
        Intrinsics.checkNotNullParameter(starter, "starter");
        this.f92218c = starter;
    }
}
