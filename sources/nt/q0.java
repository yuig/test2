package nt;

import com.pinterest.api.model.ew;
import com.pinterest.api.model.n90;
import com.pinterest.api.model.v90;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f92139a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f92140b;

    /* renamed from: c, reason: collision with root package name */
    public final c20.a f92141c;

    /* renamed from: d, reason: collision with root package name */
    public final n f92142d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f92143e;

    /* renamed from: f, reason: collision with root package name */
    public final z0 f92144f;

    /* renamed from: g, reason: collision with root package name */
    public final lb0.r f92145g;

    public q0(oc.c apolloClient, b60.b activeUserManager, lh0.g experiments, c20.a adsService, n genderParser, zy.d0 pinalyticsSEM, z0 leadGenCache, lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adsService, "adsService");
        Intrinsics.checkNotNullParameter(genderParser, "genderParser");
        Intrinsics.checkNotNullParameter(pinalyticsSEM, "pinalyticsSEM");
        Intrinsics.checkNotNullParameter(leadGenCache, "leadGenCache");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f92139a = apolloClient;
        this.f92140b = activeUserManager;
        this.f92141c = adsService;
        this.f92142d = genderParser;
        this.f92143e = pinalyticsSEM;
        this.f92144f = leadGenCache;
        this.f92145g = prefsManagerUser;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04d3 A[Catch: Exception -> 0x04e1, TRY_LEAVE, TryCatch #1 {Exception -> 0x04e1, blocks: (B:207:0x04c8, B:209:0x04d3), top: B:206:0x04c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r0v150, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.lang.Object, nt.q0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable j(nt.q0 r38, com.pinterest.api.model.n90 r39, java.util.Set r40, java.lang.String r41, bl2.c r42) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nt.q0.j(nt.q0, com.pinterest.api.model.n90, java.util.Set, java.lang.String, bl2.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(nt.q0 r18, com.pinterest.api.model.n90 r19, java.util.List r20, java.util.LinkedHashMap r21, java.lang.String r22, java.util.List r23, u50.r r24, bl2.c r25) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nt.q0.k(nt.q0, com.pinterest.api.model.n90, java.util.List, java.util.LinkedHashMap, java.lang.String, java.util.List, u50.r, bl2.c):java.lang.Object");
    }

    public static ArrayList l(vd0.c cVar, String str) {
        HashMap q13 = cVar.q();
        Intrinsics.checkNotNullExpressionValue(q13, "optStringMap(...)");
        v.j2 j2Var = new v.j2(25);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : q13.entrySet()) {
            String str2 = (String) entry.getKey();
            arrayList.add(new m91.b(str2, (String) entry.getValue(), Intrinsics.d(str2, str)));
        }
        kotlin.collections.j0.t(arrayList, j2Var);
        return arrayList;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        u0 request = (u0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof r0) {
            kotlin.jvm.internal.j.z(scope, null, null, new m0(this, (r0) request, eventIntake, scope, null), 3);
            return;
        }
        if (request instanceof s0) {
            s0 s0Var = (s0) request;
            kotlin.jvm.internal.j.z(scope, null, null, new p0(this, s0Var, s0Var.f92172e, eventIntake, null), 3);
        } else if (request instanceof t0) {
            this.f92143e.e(scope, ((t0) request).f92180a, eventIntake);
        }
    }

    public final String m() {
        try {
            String e13 = this.f92145g.e("PREF_LEAD_AD");
            return e13 == null ? "" : e13;
        } catch (Exception e14) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.q(e14, "Lead Ad: Error loading cached value", tb0.p.LEAD_AD);
            return "";
        }
    }

    public final void n(List list, LinkedHashMap questionAnswers, n90 n90Var, String uid, u50.r rVar) {
        List<v90> y13;
        ArrayList arrayList;
        Object obj;
        List countries = list == null ? kotlin.collections.q0.f80391a : list;
        String m13 = m();
        z0 z0Var = this.f92144f;
        z0Var.getClass();
        Intrinsics.checkNotNullParameter(questionAnswers, "questionAnswers");
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(uid, "uid");
        ew.o("LeadAd_" + uid, Boolean.TRUE);
        ju.a aVar = (ju.a) new nm.o().b(ju.a.class, m13);
        if (aVar == null) {
            aVar = new ju.a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        List list2 = countries;
        ju.a aVar2 = new ju.a(aVar.f77590a, aVar.f77591b, aVar.f77592c, aVar.f77593d, aVar.f77594e, aVar.f77595f, aVar.f77596g, aVar.f77597h, aVar.f77598i, aVar.f77599j, aVar.f77600k, aVar.f77601l, aVar.f77602m, aVar.f77603n, aVar.f77604o, aVar.f77605p, aVar.f77606q, aVar.f77607r);
        if (n90Var != null && (y13 = n90Var.y()) != null) {
            for (v90 v90Var : y13) {
                ju.d dVar = ju.e.Companion;
                Integer h10 = v90Var.h();
                Intrinsics.checkNotNullExpressionValue(h10, "getQuestionType(...)");
                int intValue = h10.intValue();
                dVar.getClass();
                ju.e a13 = ju.d.a(intValue);
                switch (a13 == null ? -1 : y0.f92239a[a13.ordinal()]) {
                    case 1:
                        arrayList = arrayList2;
                        i1 i1Var = i1.f92062h;
                        CharSequence charSequence = (CharSequence) questionAnswers.get(i1Var);
                        if (charSequence != null && !kotlin.text.z.j(charSequence)) {
                            aVar2.f77590a = (String) questionAnswers.get(i1Var);
                            aVar2.f77591b = Long.valueOf(currentTimeMillis);
                            arrayList.add(h32.u0.LEAD_FORM_NAME);
                        }
                        arrayList2 = arrayList;
                        break;
                    case 2:
                        arrayList = arrayList2;
                        i1 i1Var2 = i1.f92061g;
                        CharSequence charSequence2 = (CharSequence) questionAnswers.get(i1Var2);
                        if (charSequence2 != null && !kotlin.text.z.j(charSequence2)) {
                            aVar2.f77592c = (String) questionAnswers.get(i1Var2);
                            aVar2.f77593d = Long.valueOf(currentTimeMillis);
                            arrayList.add(h32.u0.LEAD_FORM_FIRST_NAME);
                        }
                        arrayList2 = arrayList;
                        break;
                    case 3:
                        arrayList = arrayList2;
                        i1 i1Var3 = i1.f92064j;
                        CharSequence charSequence3 = (CharSequence) questionAnswers.get(i1Var3);
                        if (charSequence3 != null && !kotlin.text.z.j(charSequence3)) {
                            aVar2.f77594e = (String) questionAnswers.get(i1Var3);
                            aVar2.f77595f = Long.valueOf(currentTimeMillis);
                            arrayList.add(h32.u0.LEAD_FORM_LAST_NAME);
                        }
                        arrayList2 = arrayList;
                        break;
                    case 4:
                        arrayList = arrayList2;
                        i1 i1Var4 = i1.f92060f;
                        CharSequence charSequence4 = (CharSequence) questionAnswers.get(i1Var4);
                        if (charSequence4 != null && !kotlin.text.z.j(charSequence4)) {
                            aVar2.f77596g = (String) questionAnswers.get(i1Var4);
                            aVar2.f77597h = Long.valueOf(currentTimeMillis);
                            arrayList.add(h32.u0.LEAD_FORM_EMAIL);
                        }
                        arrayList2 = arrayList;
                        break;
                    case 5:
                        arrayList = arrayList2;
                        i1 i1Var5 = i1.f92056b;
                        CharSequence charSequence5 = (CharSequence) questionAnswers.get(i1Var5);
                        if (charSequence5 != null && !kotlin.text.z.j(charSequence5)) {
                            aVar2.f77598i = (String) questionAnswers.get(i1Var5);
                            aVar2.f77599j = Long.valueOf(currentTimeMillis);
                            arrayList.add(h32.u0.LEAD_FORM_AGE);
                        }
                        arrayList2 = arrayList;
                        break;
                    case 6:
                        arrayList = arrayList2;
                        i1 i1Var6 = i1.f92063i;
                        CharSequence charSequence6 = (CharSequence) questionAnswers.get(i1Var6);
                        if (charSequence6 != null && !kotlin.text.z.j(charSequence6)) {
                            aVar2.f77606q = (String) questionAnswers.get(i1Var6);
                            aVar2.f77607r = Long.valueOf(currentTimeMillis);
                            arrayList.add(h32.u0.LEAD_FORM_GENDER);
                        }
                        arrayList2 = arrayList;
                        break;
                    case 7:
                        arrayList = arrayList2;
                        i1 i1Var7 = i1.f92057c;
                        CharSequence charSequence7 = (CharSequence) questionAnswers.get(i1Var7);
                        if (charSequence7 != null && !kotlin.text.z.j(charSequence7)) {
                            aVar2.f77600k = (String) questionAnswers.get(i1Var7);
                            aVar2.f77601l = Long.valueOf(currentTimeMillis);
                            arrayList.add(h32.u0.LEAD_FORM_CITY);
                        }
                        arrayList2 = arrayList;
                        break;
                    case 8:
                        arrayList = arrayList2;
                        i1 i1Var8 = i1.f92068n;
                        CharSequence charSequence8 = (CharSequence) questionAnswers.get(i1Var8);
                        if (charSequence8 != null && !kotlin.text.z.j(charSequence8)) {
                            aVar2.f77602m = (String) questionAnswers.get(i1Var8);
                            aVar2.f77603n = Long.valueOf(currentTimeMillis);
                            arrayList.add(h32.u0.LEAD_FORM_STATE_PROVINCE);
                        }
                        arrayList2 = arrayList;
                        break;
                    case 9:
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (Intrinsics.d(((m91.b) obj).f86723c, questionAnswers.get(j1.f92079a))) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        m91.b bVar = (m91.b) obj;
                        if (bVar != null) {
                            aVar2.f77604o = bVar;
                            aVar2.f77605p = Long.valueOf(currentTimeMillis);
                            arrayList2.add(h32.u0.LEAD_FORM_COUNTRY);
                            break;
                        } else {
                            arrayList = arrayList2;
                            arrayList2 = arrayList;
                            break;
                        }
                    default:
                        arrayList = arrayList2;
                        arrayList2 = arrayList;
                        break;
                }
            }
        }
        z0Var.f92246a.j("PREF_LEAD_AD", new nm.o().k(aVar2), lb0.t.a());
        rVar.a(new f0(arrayList2, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[Catch: Exception -> 0x0045, TryCatch #1 {Exception -> 0x0045, blocks: (B:29:0x0041, B:30:0x0068, B:32:0x007a, B:34:0x007e, B:36:0x0087, B:38:0x008d, B:40:0x0091, B:41:0x0097, B:43:0x009d, B:45:0x00a5, B:47:0x00ab, B:49:0x00af, B:55:0x00b3), top: B:28:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[Catch: Exception -> 0x0045, TryCatch #1 {Exception -> 0x0045, blocks: (B:29:0x0041, B:30:0x0068, B:32:0x007a, B:34:0x007e, B:36:0x0087, B:38:0x008d, B:40:0x0091, B:41:0x0097, B:43:0x009d, B:45:0x00a5, B:47:0x00ab, B:49:0x00af, B:55:0x00b3), top: B:28:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable o(java.lang.String r9, bl2.c r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nt.q0.o(java.lang.String, bl2.c):java.io.Serializable");
    }
}
