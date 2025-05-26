package xc2;

import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f134568a;

    /* renamed from: b, reason: collision with root package name */
    public final hs1.q f134569b;

    /* renamed from: c, reason: collision with root package name */
    public final lb0.q f134570c;

    /* renamed from: d, reason: collision with root package name */
    public final nm.o f134571d;

    public o(oc.c apolloClient, hs1.q imageCache, lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f134568a = apolloClient;
        this.f134569b = imageCache;
        this.f134570c = prefsManagerPersisted;
        this.f134571d = new nm.o();
    }

    public final ArrayList a(int i13) {
        Set h10 = this.f134570c.h(j1.U("PREF_WIDGET_PINS_%s", new Object[]{Integer.valueOf(i13)}), null);
        if (h10 == null) {
            h10 = s0.f80394a;
        }
        List F0 = CollectionsKt.F0(h10);
        ArrayList arrayList = new ArrayList(g0.q(F0, 10));
        Iterator it = F0.iterator();
        while (it.hasNext()) {
            arrayList.add((j) this.f134571d.b(j.class, (String) it.next()));
        }
        return arrayList;
    }
}
