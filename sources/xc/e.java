package xc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.g0;
import kotlin.collections.s0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import wc.k;
import wc.m;

/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f134548b = new LinkedHashMap();

    @Override // wc.l
    public final m a(String key, wc.a cacheHeaders) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
        try {
            k kVar = this.f129092a;
            return e(kVar != null ? kVar.a(key, cacheHeaders) : null, key);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // wc.l
    public final ArrayList b(ArrayList keys, wc.a cacheHeaders) {
        Map d2;
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
        k kVar = this.f129092a;
        if (kVar != null) {
            ArrayList b13 = kVar.b(keys, cacheHeaders);
            int a13 = y0.a(g0.q(b13, 10));
            if (a13 < 16) {
                a13 = 16;
            }
            d2 = new LinkedHashMap(a13);
            for (Object obj : b13) {
                d2.put(((m) obj).f129093a, obj);
            }
        } else {
            d2 = z0.d();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m e13 = e((m) d2.get(str), str);
            if (e13 != null) {
                arrayList.add(e13);
            }
        }
        return arrayList;
    }

    @Override // wc.k
    public final Set c(Collection records, wc.a cacheHeaders) {
        Set c13;
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
        k kVar = this.f129092a;
        return (kVar == null || (c13 = kVar.c(records, cacheHeaders)) == null) ? s0.f80394a : c13;
    }

    @Override // wc.k
    public final Set d(m record, wc.a cacheHeaders) {
        Set d2;
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
        k kVar = this.f129092a;
        return (kVar == null || (d2 = kVar.d(record, cacheHeaders)) == null) ? s0.f80394a : d2;
    }

    public final m e(m mVar, String str) {
        m mVar2;
        d dVar = (d) this.f134548b.get(str);
        return dVar != null ? (mVar == null || (mVar2 = (m) mVar.c(dVar.a()).f80346a) == null) ? dVar.a() : mVar2 : mVar;
    }
}
