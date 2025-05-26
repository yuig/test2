package xt;

import h32.f1;
import h32.m2;
import h32.q2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.o0;

/* loaded from: classes3.dex */
public final class k extends tq0.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f135891c;

    /* renamed from: d, reason: collision with root package name */
    public Object f135892d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f135893e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(nx.d0 r5, int r6) {
        /*
            r4 = this;
            pb0.g r0 = pb0.g.f99432a
            r4.f135891c = r6
            r1 = 1
            java.lang.String r2 = "pinalytics"
            java.lang.String r3 = "clock"
            if (r6 == r1) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            r4.<init>(r0, r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4.f135893e = r5
            return
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            r4.<init>(r0, r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4.f135893e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xt.k.<init>(nx.d0, int):void");
    }

    @Override // tq0.b
    public final void i() {
        switch (this.f135891c) {
            case 0:
                ((HashMap) this.f135893e).clear();
                this.f135892d = null;
                break;
            case 1:
                ((HashMap) this.f135893e).clear();
                this.f135892d = null;
                break;
            default:
                ((List) this.f135893e).clear();
                break;
        }
    }

    @Override // tq0.b
    public final void l(Object impression) {
        switch (this.f135891c) {
            case 0:
                Intrinsics.checkNotNullParameter(impression, "impression");
                if (impression instanceof q2) {
                    q2 q2Var = (q2) impression;
                    this.f135892d = q2Var.f67189a;
                    Long l13 = q2Var.f67194f;
                    if (l13 != null) {
                        long longValue = l13.longValue();
                        if (!((HashMap) this.f135893e).containsKey(Long.valueOf(longValue))) {
                            ((HashMap) this.f135893e).put(Long.valueOf(longValue), impression);
                            break;
                        } else {
                            q2 source = (q2) ((HashMap) this.f135893e).get(Long.valueOf(longValue));
                            if (source != null) {
                                HashMap hashMap = (HashMap) this.f135893e;
                                Long valueOf = Long.valueOf(longValue);
                                Intrinsics.checkNotNullParameter(source, "source");
                                hashMap.put(valueOf, new q2(source.f67189a, source.f67190b, source.f67191c, source.f67192d, q2Var.f67193e, source.f67194f, source.f67195g, source.f67196h));
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(impression, "impression");
                if (impression instanceof q2) {
                    q2 q2Var2 = (q2) impression;
                    this.f135892d = q2Var2.f67189a;
                    Long l14 = q2Var2.f67195g;
                    if (l14 != null) {
                        long longValue2 = l14.longValue();
                        if (!((HashMap) this.f135893e).containsKey(Long.valueOf(longValue2))) {
                            ((HashMap) this.f135893e).put(Long.valueOf(longValue2), impression);
                            break;
                        } else {
                            q2 source2 = (q2) ((HashMap) this.f135893e).get(Long.valueOf(longValue2));
                            if (source2 != null) {
                                HashMap hashMap2 = (HashMap) this.f135893e;
                                Long valueOf2 = Long.valueOf(longValue2);
                                Intrinsics.checkNotNullParameter(source2, "source");
                                hashMap2.put(valueOf2, new q2(source2.f67189a, source2.f67190b, source2.f67191c, source2.f67192d, q2Var2.f67193e, source2.f67194f, source2.f67195g, source2.f67196h));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(impression, "impression");
                if (impression instanceof t01.a) {
                    ((List) this.f135893e).add(impression);
                }
                if (!((List) this.f135893e).isEmpty()) {
                    o0 o0Var = (o0) this.f135892d;
                    List list = (List) this.f135893e;
                    ArrayList relatedPinsFilterImpressions = new ArrayList(g0.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        relatedPinsFilterImpressions.add(((t01.a) it.next()).f115710a);
                    }
                    o0Var.getClass();
                    Intrinsics.checkNotNullParameter(relatedPinsFilterImpressions, "relatedPinsFilterImpressions");
                    Iterator it2 = relatedPinsFilterImpressions.iterator();
                    while (it2.hasNext()) {
                        String str = ((m2) it2.next()).f67143a;
                        if (str != null && str.length() != 0) {
                            o0Var.f92443f.remove(str);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // tq0.b
    public final void m(Object impression) {
        switch (this.f135891c) {
            case 2:
                Intrinsics.checkNotNullParameter(impression, "impression");
                if (impression instanceof t01.a) {
                    o0 o0Var = (o0) this.f135892d;
                    m2 relatedPinsFilterImpression = ((t01.a) impression).f115710a;
                    o0Var.getClass();
                    Intrinsics.checkNotNullParameter(relatedPinsFilterImpression, "relatedPinsFilterImpression");
                    String str = relatedPinsFilterImpression.f67143a;
                    if (str != null && str.length() != 0) {
                        ArrayList arrayList = o0Var.f92443f;
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                            break;
                        }
                    }
                }
                break;
            default:
                super.m(impression);
                break;
        }
    }

    @Override // tq0.b
    public final void o(ArrayList impressions) {
        switch (this.f135891c) {
            case 2:
                Intrinsics.checkNotNullParameter(impressions, "impressions");
                ArrayList relatedPinsFilterImpressions = new ArrayList();
                Iterator it = impressions.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof t01.a) {
                        relatedPinsFilterImpressions.add(((t01.a) next).f115710a);
                    }
                }
                if (!relatedPinsFilterImpressions.isEmpty()) {
                    o0 o0Var = (o0) this.f135892d;
                    o0Var.getClass();
                    Intrinsics.checkNotNullParameter(relatedPinsFilterImpressions, "relatedPinsFilterImpressions");
                    Iterator it2 = relatedPinsFilterImpressions.iterator();
                    while (it2.hasNext()) {
                        String str = ((m2) it2.next()).f67143a;
                        if (str != null && str.length() != 0) {
                            ArrayList arrayList = o0Var.f92443f;
                            if (!arrayList.contains(str)) {
                                arrayList.add(str);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                super.o(impressions);
                break;
        }
    }

    @Override // tq0.b
    public final void p() {
        String str;
        int i13 = this.f135891c;
        d0 d0Var = this.f118989b;
        switch (i13) {
            case 0:
                if (!((HashMap) this.f135893e).isEmpty()) {
                    d0Var.x((String) this.f135892d, new ArrayList(((HashMap) this.f135893e).values()));
                    break;
                }
                break;
            case 1:
                if (!((HashMap) this.f135893e).isEmpty()) {
                    d0Var.g0((String) this.f135892d, new ArrayList(((HashMap) this.f135893e).values()));
                    break;
                }
                break;
            default:
                if (!((List) this.f135893e).isEmpty()) {
                    HashMap hashMap = new HashMap();
                    t01.a aVar = (t01.a) CollectionsKt.firstOrNull((List) this.f135893e);
                    if (aVar != null && (str = aVar.f115711b) != null) {
                        hashMap.put("story_id", str);
                    }
                    f1 f1Var = f1.RELATED_PINS_FILTER_IMPRESSION_ONE_PIXEL;
                    h32.g0 g0Var = h32.g0.RELATED_PINS_FILTERS_CAROUSEL;
                    List list = (List) this.f135893e;
                    ArrayList arrayList = new ArrayList(g0.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((t01.a) it.next()).f115710a);
                    }
                    d0Var.e0(g0Var, f1Var, hashMap, CollectionsKt.H0(arrayList));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(nx.d0 r3, nx.o0 r4) {
        /*
            r2 = this;
            pb0.g r0 = pb0.g.f99432a
            r1 = 2
            r2.f135891c = r1
            java.lang.String r1 = "clock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "pinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "pinalyticsManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            r2.<init>(r0, r3)
            r2.f135892d = r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f135893e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xt.k.<init>(nx.d0, nx.o0):void");
    }
}
