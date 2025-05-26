package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k5 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f7104a;

    public k5(Set requestTypes) {
        Intrinsics.checkNotNullParameter(requestTypes, "requestTypes");
        this.f7104a = requestTypes;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.AD_TYPE;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        Set set = this.f7104a;
        ArrayList arrayList = new ArrayList(g0.q(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((h92) it.next()).f5908a);
        }
        return new pk0(new j5(arrayList));
    }
}
