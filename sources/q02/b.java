package q02;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.mj;
import com.pinterest.api.model.ni0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {
    public static final boolean a(mj mjVar) {
        Intrinsics.checkNotNullParameter(mjVar, "<this>");
        return CollectionsKt.L(e0.b(mj.a.IN_PROGRESS), mjVar.C());
    }

    public static final String b(fi0 fi0Var) {
        sr srVar;
        Intrinsics.checkNotNullParameter(fi0Var, "<this>");
        Map H = fi0Var.H();
        String j13 = (H == null || (srVar = (sr) H.get("45x45")) == null) ? null : srVar.j();
        return j13 == null ? "" : j13;
    }

    public static final String c(mj mjVar) {
        f30 S;
        fi0 j13;
        f30 O;
        Intrinsics.checkNotNullParameter(mjVar, "<this>");
        if (!CollectionsKt.L(f0.j(mj.b.ACCESSIBLE, mj.b.GEOBLOCKED), mjVar.E()) && !CollectionsKt.L(f0.j(mj.c.AGGREGATED_COMMENT, mj.c.SHUFFLE_COMMENT), mjVar.M())) {
            return null;
        }
        mj.c M = mjVar.M();
        switch (M == null ? -1 : a.f101859a[M.ordinal()]) {
            case 1:
            case 2:
            case 3:
                wy0 V = mjVar.V();
                return a.a.j("https://www.pinterest.com/", V != null ? V.z4() : null);
            case 4:
            case 5:
                f30 N = mjVar.N();
                return a.a.j("https://www.pinterest.com/pin/", N != null ? N.getUid() : null);
            case 6:
                v7 D = mjVar.D();
                return a.a.j("https://www.pinterest.com/", D != null ? D.C1() : null);
            case 7:
                z2 A = mjVar.A();
                if (A != null && (S = A.S()) != null) {
                    r1 = S.getUid();
                }
                return a.a.j("https://www.pinterest.com/pin/", r1);
            case 8:
                ni0 T = mjVar.T();
                if (T == null || (j13 = T.j()) == null) {
                    return null;
                }
                return b(j13);
            case 9:
                az0 G = mjVar.G();
                if (G != null && (O = G.O()) != null) {
                    r1 = O.getUid();
                }
                return a.a.j("https://www.pinterest.com/pin/", r1);
            default:
                return null;
        }
    }

    public static final c d(mj mjVar) {
        Intrinsics.checkNotNullParameter(mjVar, "<this>");
        mj.c M = mjVar.M();
        switch (M == null ? -1 : a.f101859a[M.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return c.Circle;
            case 4:
            case 5:
            default:
                return c.Default;
            case 6:
            case 7:
            case 8:
            case 9:
                return c.Rectangle;
        }
    }
}
