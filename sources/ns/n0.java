package ns;

import com.pinterest.api.model.fi0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import m90.k1;
import ml0.q0;
import ml0.t0;
import p90.b1;
import p90.c1;
import p90.d1;
import p90.z0;
import qm0.i2;
import qm0.j2;
import qm0.k2;
import qm0.m2;

/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements o82.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91943a;

    public /* synthetic */ n0(int i13) {
        this.f91943a = i13;
    }

    @Override // o82.p
    public final String a(int i13, l82.i0 i0Var) {
        switch (this.f91943a) {
            case 0:
                v item = (v) i0Var;
                Intrinsics.checkNotNullParameter(item, "item");
                return String.valueOf(item.hashCode());
            case 1:
                com.pinterest.boardAutoCollages.d item2 = (com.pinterest.boardAutoCollages.d) i0Var;
                Intrinsics.checkNotNullParameter(item2, "item");
                fi0 fi0Var = item2.f44549a;
                String uid = fi0Var != null ? fi0Var.getUid() : null;
                return uid == null ? String.valueOf(item2.hashCode()) : uid;
            case 2:
                h90.n0 item3 = (h90.n0) i0Var;
                Intrinsics.checkNotNullParameter(item3, "item");
                return item3.getId();
            case 3:
                h90.c item4 = (h90.c) i0Var;
                Intrinsics.checkNotNullParameter(item4, "item");
                return item4.getId();
            case 4:
                h90.h0 item5 = (h90.h0) i0Var;
                Intrinsics.checkNotNullParameter(item5, "item");
                return String.valueOf(item5.hashCode());
            case 5:
                k1 item6 = (k1) i0Var;
                Set set = m90.a0.f86617a;
                Intrinsics.checkNotNullParameter(item6, "item");
                return item6.getId();
            case 6:
                sa0.s item7 = (sa0.s) i0Var;
                Intrinsics.checkNotNullParameter(item7, "item");
                String simpleName = item7.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return simpleName;
            case 7:
                z0 item8 = (z0) i0Var;
                Intrinsics.checkNotNullParameter(item8, "item");
                return item8.getId();
            case 8:
                b1 item9 = (b1) i0Var;
                Intrinsics.checkNotNullParameter(item9, "item");
                item9.getClass();
                return b1.f99176b;
            case 9:
                d1 item10 = (d1) i0Var;
                Intrinsics.checkNotNullParameter(item10, "item");
                return ((c1) item10).f99180b;
            case 10:
                xa0.f item11 = (xa0.f) i0Var;
                Intrinsics.checkNotNullParameter(item11, "item");
                return String.valueOf(item11.hashCode());
            case 11:
                ea0.a0 item12 = (ea0.a0) i0Var;
                Set set2 = ea0.v.f58002a;
                Intrinsics.checkNotNullParameter(item12, "item");
                return item12.getId();
            case 12:
                fa0.z0 item13 = (fa0.z0) i0Var;
                Intrinsics.checkNotNullParameter(item13, "item");
                String simpleName2 = item13.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                return simpleName2;
            case 13:
                xa0.f item14 = (xa0.f) i0Var;
                Intrinsics.checkNotNullParameter(item14, "item");
                item14.getClass();
                if (item14 instanceof xa0.e) {
                    String uid2 = ((xa0.e) item14).f134399a.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    return uid2;
                }
                if (!(item14 instanceof xa0.c)) {
                    return item14 instanceof xa0.b ? "create_new" : String.valueOf(item14.hashCode());
                }
                String uid3 = ((xa0.c) item14).f134396a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                return uid3;
            case 14:
                cj0.i item15 = (cj0.i) i0Var;
                Intrinsics.checkNotNullParameter(item15, "item");
                String uid4 = item15.f27831a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                return uid4;
            case 15:
                ml0.n0 item16 = (ml0.n0) i0Var;
                Intrinsics.checkNotNullParameter(item16, "item");
                return String.valueOf(item16.hashCode());
            case 16:
                ml0.o0 item17 = (ml0.o0) i0Var;
                Intrinsics.checkNotNullParameter(item17, "item");
                return String.valueOf(item17.hashCode());
            case 17:
                ml0.p0 item18 = (ml0.p0) i0Var;
                Intrinsics.checkNotNullParameter(item18, "item");
                return String.valueOf(item18.hashCode());
            case 18:
                t0 item19 = (t0) i0Var;
                Intrinsics.checkNotNullParameter(item19, "item");
                String uid5 = item19.f87503a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid5, "getUid(...)");
                return uid5;
            case 19:
                q0 item20 = (q0) i0Var;
                Intrinsics.checkNotNullParameter(item20, "item");
                return String.valueOf(item20.hashCode());
            case 20:
                lm0.b0 item21 = (lm0.b0) i0Var;
                Intrinsics.checkNotNullParameter(item21, "item");
                item21.getClass();
                return String.valueOf(1214750139);
            case 21:
                lm0.f0 item22 = (lm0.f0) i0Var;
                Intrinsics.checkNotNullParameter(item22, "item");
                return item22.f83865d;
            case 22:
                lm0.c0 item23 = (lm0.c0) i0Var;
                Intrinsics.checkNotNullParameter(item23, "item");
                return item23.f83854f;
            case 23:
                lm0.c item24 = (lm0.c) i0Var;
                Intrinsics.checkNotNullParameter(item24, "item");
                item24.getClass();
                return String.valueOf(-1151032738);
            case 24:
                qm0.a item25 = (qm0.a) i0Var;
                Intrinsics.checkNotNullParameter(item25, "item");
                return item25.getId();
            case 25:
                k2 item26 = (k2) i0Var;
                Intrinsics.checkNotNullParameter(item26, "item");
                return item26.getId();
            case 26:
                m2 item27 = (m2) i0Var;
                Intrinsics.checkNotNullParameter(item27, "item");
                return item27.f104309b;
            case 27:
                i2 item28 = (i2) i0Var;
                Intrinsics.checkNotNullParameter(item28, "item");
                return ((j2) item28).f104291d;
            case 28:
                ys0.r item29 = (ys0.r) i0Var;
                Intrinsics.checkNotNullParameter(item29, "item");
                return String.valueOf(item29.hashCode());
            default:
                xs0.h item30 = (xs0.h) i0Var;
                Intrinsics.checkNotNullParameter(item30, "item");
                String uid6 = item30.f135814a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid6, "getUid(...)");
                return uid6;
        }
    }
}
