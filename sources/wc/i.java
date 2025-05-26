package wc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i1;
import kotlin.collections.k0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: b, reason: collision with root package name */
    public final long f129088b;

    /* renamed from: c, reason: collision with root package name */
    public final j f129089c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public final xc.c f129090d;

    public i(int i13, long j13) {
        this.f129088b = j13;
        this.f129090d = new xc.c(i13);
    }

    @Override // wc.l
    public final m a(String key, a cacheHeaders) {
        Object invoke;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
        j jVar = this.f129089c;
        g block = new g(this, key, cacheHeaders);
        jVar.getClass();
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (jVar) {
            invoke = block.invoke();
        }
        return (m) invoke;
    }

    @Override // wc.l
    public final ArrayList b(ArrayList keys, a cacheHeaders) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
        ArrayList arrayList = new ArrayList();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            m a13 = a((String) it.next(), cacheHeaders);
            if (a13 != null) {
                arrayList.add(a13);
            }
        }
        return arrayList;
    }

    @Override // wc.k
    public final Set c(Collection records, a cacheHeaders) {
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
        cacheHeaders.getClass();
        Intrinsics.checkNotNullParameter("do-not-store", "headerName");
        if (cacheHeaders.f129076a.containsKey("do-not-store")) {
            return s0.f80394a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = records.iterator();
        while (it.hasNext()) {
            k0.u(d((m) it.next(), cacheHeaders), arrayList);
        }
        return CollectionsKt.J0(arrayList);
    }

    @Override // wc.k
    public final Set d(m record, a cacheHeaders) {
        Set set;
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
        cacheHeaders.getClass();
        Intrinsics.checkNotNullParameter("do-not-store", "headerName");
        if (cacheHeaders.f129076a.containsKey("do-not-store")) {
            return s0.f80394a;
        }
        m a13 = a(record.f129093a, cacheHeaders);
        long j13 = this.f129088b;
        xc.c cVar = this.f129090d;
        String str = record.f129093a;
        if (a13 == null) {
            cVar.c(str, new f(record, j13));
            set = record.b();
        } else {
            Pair c13 = a13.c(record);
            m mVar = (m) c13.f80346a;
            set = (Set) c13.f80347b;
            cVar.c(str, new f(mVar, j13));
        }
        k kVar = this.f129092a;
        Set d2 = kVar != null ? kVar.d(record, cacheHeaders) : null;
        if (d2 == null) {
            d2 = s0.f80394a;
        }
        return i1.i(set, d2);
    }
}
