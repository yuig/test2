package x02;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.zy0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p1 extends dl1.l {
    public final hk2.u a0(az0 model, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(model, "model");
        String uid = model.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        j1 j1Var = new j1(uid, str, z13);
        zy0 V = model.V();
        V.f44517i = Boolean.TRUE;
        boolean[] zArr = V.f44532x;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
        Unit unit = Unit.f80348a;
        uj2.l G = G(j1Var, V.a());
        G.getClass();
        hk2.u uVar = new hk2.u(G);
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }

    public final uj2.l b0(az0 model, String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        az0 b13 = n10.c.b(n10.c.a(model, true), false);
        String uid = model.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return G(new k1(uid, str), b13);
    }

    public final hk2.u c0(az0 model, String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        az0 a13 = n10.c.a(n10.c.b(model, true), false);
        String uid = model.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        uj2.l G = G(new l1(uid, str), a13);
        G.getClass();
        hk2.u uVar = new hk2.u(G);
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }

    public final uj2.l d0(az0 model, String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        String uid = model.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return G(new m1(uid, str), n10.c.a(model, false));
    }

    public final hk2.u e0(az0 model, String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        String uid = model.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        uj2.l G = G(new n1(uid, str), n10.c.b(model, false));
        G.getClass();
        hk2.u uVar = new hk2.u(G);
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }
}
