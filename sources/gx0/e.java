package gx0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.dh;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.rx;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import com.pinterest.feature.newshub.detail.remoterequest.FetchNewsHubDetailRetrofitRemoteRequest;
import dl1.s;
import g1.g;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kx0.t;
import kx0.u;
import lh0.a4;
import lh0.g1;
import lh0.h2;
import lh0.z3;
import m60.f0;
import nx.d0;
import nx.d1;
import wa2.i;
import wa2.m;

/* loaded from: classes5.dex */
public final class e extends com.pinterest.framework.multisection.datasource.pagedlist.c implements ix0.a {
    public final x12.a L;
    public final d1 M;
    public final Pattern N;
    public final g O;
    public final d0 P;
    public final String Q;
    public final h2 R;
    public final Function1 S;
    public final Function2 T;
    public final d0 U;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(java.lang.String r28, uk1.d r29, nr0.l r30, m60.w r31, x12.a r32, android.content.Context r33, lh0.h2 r34, hx0.d r35, gv0.b r36, pb0.d r37, nx.d1 r38, b60.b r39, ni1.t2 r40, ni1.d0 r41, mj0.g r42, g70.h r43) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.e.<init>(java.lang.String, uk1.d, nr0.l, m60.w, x12.a, android.content.Context, lh0.h2, hx0.d, gv0.b, pb0.d, nx.d1, b60.b, ni1.t2, ni1.d0, mj0.g, g70.h):void");
    }

    public static m f0() {
        return f0.i0(i.a(bs1.c.r(), false, false, false, false, true, false, true, null, null, null, null, -4194306, -262145, 1023));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, nr0.a
    /* renamed from: I */
    public final s getItem(int i13) {
        u g03 = g0(i13);
        int i14 = a.f66278a[g03.f81087a.ordinal()];
        return (i14 == 1 || i14 == 2) ? g03.f81089c : g03.f81090d;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final com.pinterest.hairball.network.e M(r requestState) {
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        return new FetchNewsHubDetailRetrofitRemoteRequest(this, this.f49132v, this.f49116f, this.L, this.P, this.M);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        List list = t.f81085a;
        return t.f81085a.contains(Integer.valueOf(i13));
    }

    public final u g0(int i13) {
        s item = super.getItem(i13);
        Intrinsics.g(item, "null cannot be cast to non-null type com.pinterest.feature.newshub.detail.view.NewsHubItemWrapper");
        return (u) item;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        u g03 = g0(i13);
        int i14 = d.f66283a[g03.f81087a.ordinal()];
        if (i14 == 1) {
            return 1502;
        }
        if (i14 == 2) {
            return 1509;
        }
        dh g13 = g03.f81089c.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getDisplayMode(...)");
        s sVar = g03.f81090d;
        if (sVar instanceof v7) {
            return d.f66284b[g13.ordinal()] == 1 ? 1512 : 1504;
        }
        if (!(sVar instanceof f30)) {
            if (sVar instanceof wy0) {
                return 1505;
            }
            if (sVar instanceof zs) {
                return 1508;
            }
            if (sVar instanceof rx) {
                return 1507;
            }
            if (sVar instanceof vh) {
                return 1511;
            }
            throw new IllegalStateException("Unknown view type");
        }
        h2 h2Var = this.R;
        h2Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) h2Var.f83382a;
        if (g1Var.o("android_news_hub_quick_save", "enabled", z3Var) || g1Var.l("android_news_hub_quick_save")) {
            f30 f30Var = (f30) sVar;
            if (!b40.J0(f30Var) && !f30Var.d5().booleanValue()) {
                return 1514;
            }
        }
        return 1513;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean q(int i13) {
        t.f81086b.contains(Integer.valueOf(i13));
        return false;
    }
}
