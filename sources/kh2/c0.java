package kh2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79450a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f79451b;

    public c0(Function0 provider, tf2.c featureRegistry) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(featureRegistry, "featureRegistry");
        uf2.d state = (uf2.d) provider.invoke();
        this.f79451b = state;
        tf2.b bVar = (tf2.b) featureRegistry;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        bVar.f117568c.add(state);
        tf2.a aVar = new tf2.a(state, bVar, 0);
        if (!state.f122118c) {
            aVar.invoke();
        } else {
            bVar.f117566a.b(new p4.a(10, aVar));
        }
    }

    public final Object a(Object obj, rl2.u property) {
        switch (this.f79450a) {
            case 0:
                return b(property);
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                return ((xk2.k) this.f79451b).getValue();
        }
    }

    public final uf2.d b(rl2.u property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return (uf2.d) this.f79451b;
    }

    public c0(g1 loadType, Function0 provider) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(provider, "provider");
        xk2.k a13 = xk2.m.a(xk2.n.PUBLICATION, provider);
        this.f79451b = a13;
        if (loadType == g1.EAGER) {
            a13.getValue();
        }
    }
}
