package ea0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kh2.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f58002a = h1.f(1, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE), 5, Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_VIDEO_AD_EXCLUDE));

    public static ia0.b a(f30 f30Var, rl1.r rVar, boolean z13, int i13) {
        u50.i0 i0Var;
        rl1.r avatarSize = (i13 & 1) != 0 ? rl1.r.SM : rVar;
        boolean z14 = (i13 & 2) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(avatarSize, "avatarSize");
        wy0 M1 = j1.M1(f30Var);
        rl1.q e13 = M1 != null ? rl1.q.e(ia0.a.f71940a, dl2.b.u0(M1), dl2.b.j1(M1), false, avatarSize, null, false, false, null, 0, new rl1.d(M1.q2().intValue()), null, 1524) : ia0.a.f71940a;
        wy0 M12 = j1.M1(f30Var);
        String j13 = M12 != null ? dl2.b.j1(M12) : null;
        if (j13 == null) {
            j13 = "";
        }
        u50.f0 x13 = ep.b.x(j13, "string", j13);
        fi0 r63 = f30Var.r6();
        Boolean K = r63 != null ? r63.K() : null;
        if ((K == null ? n60.o.B(f30Var, "getIsPromoted(...)") : K.booleanValue()) && z14) {
            i0Var = ia0.a.f71942c;
        } else {
            fi0 r64 = f30Var.r6();
            Boolean K2 = r64 != null ? r64.K() : null;
            i0Var = K2 == null ? n60.o.B(f30Var, "getIsPromoted(...)") : K2.booleanValue() ? ia0.a.f71941b : u50.h0.f120562a;
        }
        return new ia0.b(e13, x13, i0Var);
    }

    public static final Set b() {
        return f58002a;
    }

    public static final qa2.e c() {
        return new qa2.e(new wa2.m(1801354750, 2147481599, 1023, null, null, y32.f.UNKNOWN, null, null, null, null, null, null, null, true, false, false, false, false, false, false, true, true, false, false, false, false, true, false, true, true, false, true, false, false, false, false, false, false, false, false));
    }

    public static final ia0.m d(z zVar, boolean z13) {
        ra0.d dVar;
        ra0.d dVar2;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (zVar instanceof y) {
            return new ia0.m();
        }
        if (!(zVar instanceof x)) {
            throw new NoWhenBranchMatchedException();
        }
        x xVar = (x) zVar;
        List<f30> list = xVar.f58005a;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (f30 f30Var : list) {
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            fi0 r63 = f30Var.r6();
            if (r63 != null) {
                Intrinsics.checkNotNullParameter(r63, "<this>");
                String uid = r63.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                dVar = new ra0.d(new ra0.c(uid, 5), kh2.n.q0(r63));
            } else {
                dVar = null;
            }
            if (dVar != null) {
                ra0.l source = dVar.f106912b;
                if (!(source instanceof ra0.k)) {
                    String pinId = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(pinId, "getUid(...)");
                    Intrinsics.checkNotNullParameter(f30Var, "<this>");
                    wy0 M1 = j1.M1(f30Var);
                    String userId = M1 != null ? M1.getUid() : null;
                    if (userId == null) {
                        userId = "";
                    }
                    String shuffleId = dVar.f106911a.f106907b;
                    Intrinsics.checkNotNullParameter(pinId, "pinId");
                    Intrinsics.checkNotNullParameter(shuffleId, "shuffleId");
                    Intrinsics.checkNotNullParameter(userId, "userId");
                    ra0.c ids = new ra0.c(pinId, shuffleId, userId);
                    Intrinsics.checkNotNullParameter(ids, "ids");
                    Intrinsics.checkNotNullParameter(source, "source");
                    dVar2 = new ra0.d(ids, source);
                    arrayList.add(new ia0.q(dVar2, a(f30Var, null, z13, 1)));
                }
            }
            dVar2 = new ra0.d(kh2.n.p(f30Var), kh2.n.p0(f30Var, false));
            arrayList.add(new ia0.q(dVar2, a(f30Var, null, z13, 1)));
        }
        String str = xVar.f58006b;
        u50.f0 x13 = ep.b.x(str, "string", str);
        String str2 = xVar.f58007c;
        return new ia0.m(arrayList, x13, ep.b.x(str2, "string", str2));
    }
}
