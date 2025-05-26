package zd1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements xt1.d {

    /* renamed from: j, reason: collision with root package name */
    public static final List f141736j = f0.j("price_min", "price_max", "categories", "domains", "sort_type");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f141737a = true;

    /* renamed from: b, reason: collision with root package name */
    public List f141738b = null;

    /* renamed from: c, reason: collision with root package name */
    public r f141739c;

    /* renamed from: d, reason: collision with root package name */
    public l f141740d;

    /* renamed from: e, reason: collision with root package name */
    public LinkedHashMap f141741e;

    /* renamed from: f, reason: collision with root package name */
    public n f141742f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f141743g;

    /* renamed from: h, reason: collision with root package name */
    public m f141744h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f141745i;

    public static r b(vd0.c cVar) {
        t32.d dVar = t32.f.Companion;
        int j13 = cVar.j(0, "product_filter_type");
        dVar.getClass();
        return new r(t32.d.a(j13), cVar.j(0, "min_value"), cVar.j(0, "max_value"), cVar.j(0, "suggested_max_value"), cVar.j(0, "min_value"), cVar.j(0, "max_value"), cVar.o("currency_type", "USD"), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16130);
    }

    public final LinkedHashMap a(vd0.a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVar.d());
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            vd0.c cVar = (vd0.c) it.next();
            String o13 = cVar.o("domain", "");
            Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
            String o14 = cVar.o("label", "");
            Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
            t32.d dVar = t32.f.Companion;
            int j13 = cVar.j(0, "product_filter_type");
            dVar.getClass();
            t32.f a13 = t32.d.a(j13);
            String o15 = cVar.o("label", "");
            Intrinsics.checkNotNullExpressionValue(o15, "optString(...)");
            String o16 = cVar.o("image_url", "");
            Intrinsics.checkNotNullExpressionValue(o16, "optString(...)");
            List list = this.f141738b;
            boolean contains = list != null ? list.contains(o13) : false;
            Boolean h10 = cVar.h("is_verified_merchant", Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
            linkedHashMap.put(o14, new g(a13, null, null, null, o15, o13, o16, null, contains, h10.booleanValue(), false, false, null, null, null, null, 260382));
        }
        this.f141738b = null;
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x003f, code lost:
    
        if (r23.f141745i != false) goto L24;
     */
    @Override // xt1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void afterParseResponse(bl1.a r24) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zd1.o.afterParseResponse(bl1.a):void");
    }

    @Override // xt1.d
    public final void beforeParseResponse(vd0.c cVar) {
    }

    public final void c(lv0.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f141740d = listener;
    }

    public final void d(m listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f141744h = listener;
    }

    public final void e(de1.t listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f141742f = listener;
    }

    public final void f(ArrayList productFilters) {
        Intrinsics.checkNotNullParameter(productFilters, "productFilters");
        this.f141743g = productFilters;
        if (!productFilters.isEmpty()) {
            m mVar = this.f141744h;
            if (mVar != null) {
                mVar.r1(true);
            }
            n nVar = this.f141742f;
            if (nVar != null) {
                ((de1.t) nVar).b(productFilters);
            }
        }
    }

    public final void g() {
        this.f141745i = true;
    }
}
