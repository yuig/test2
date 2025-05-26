package gd0;

import ha2.n;
import ha2.u;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import wt1.e0;

/* loaded from: classes5.dex */
public final class h extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f64824h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final Object f64825i;

    public h() {
        this(u.f68475a);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f64824h) {
            case 0:
                return ((hd0.b) d7.b.F(d())).f68849c;
            default:
                return ((n) d().get(i13)).getViewType();
        }
    }

    public h(hd0.b creatorToolsModuleState) {
        Intrinsics.checkNotNullParameter(creatorToolsModuleState, "creatorToolsModuleState");
        o(creatorToolsModuleState.f68849c, new ep.c(25));
        k(kotlin.collections.e0.b(creatorToolsModuleState));
    }

    public h(Map typeToBinderMap) {
        Intrinsics.checkNotNullParameter(typeToBinderMap, "typeToBinderMap");
        this.f64825i = typeToBinderMap;
        for (Map.Entry entry : typeToBinderMap.entrySet()) {
            o(((Number) entry.getKey()).intValue(), (vq0.h) entry.getValue());
        }
    }
}
