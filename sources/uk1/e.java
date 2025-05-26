package uk1;

import kotlin.jvm.internal.Intrinsics;
import nx.m;

/* loaded from: classes2.dex */
public interface e {
    static d c(e eVar, nx.a contextProvider) {
        e3.a pinalyticsViewType = new e3.a(5);
        a aVar = (a) eVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter("", "objectId");
        Intrinsics.checkNotNullParameter(pinalyticsViewType, "pinalyticsViewType");
        return new d(pinalyticsViewType, ((m) aVar.f122378a).a(contextProvider), "");
    }
}
