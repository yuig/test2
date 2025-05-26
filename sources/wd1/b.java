package wd1;

import a.cb;
import android.content.Context;
import com.pinterest.api.model.PinFeed;
import com.pinterest.navigation.Navigation;
import df.j1;
import f62.e;
import h32.a4;
import h32.d4;
import h32.g0;
import id1.h;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import so.v3;
import xk2.d;
import yk1.m;

@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwd1/b;", "Ljd1/d;", "Lgd1/c;", "Lnr0/j;", "Ldl1/s;", "<init>", "()V", "shopping_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: h1, reason: collision with root package name */
    public v3 f129231h1;

    @Override // sq0.e, np0.f
    public final void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        String lowerCase = d4.FEED.toString().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String[] strArr = new String[1];
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("pinUid") : null;
        Intrinsics.f(v03);
        strArr[0] = v03;
        v4(pinUid, pinFeed, i13, i14, new i01.d(str, lowerCase, f0.d(strArr), "shop_the_look_module"));
    }

    @Override // jd1.d, sq0.e
    public final tq0.b[] S8() {
        return new tq0.b[0];
    }

    @Override // jd1.d, yk1.k
    public final m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        bVar.g(p9());
        bVar.f(m9());
        bVar.a();
        v3 v3Var = this.f129231h1;
        if (v3Var == null) {
            Intrinsics.r("shopTheLookFeedPresenterFactory");
            throw null;
        }
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        h o93 = o9(requireContext2);
        Navigation navigation = this.I;
        return v3Var.a(o93, navigation != null ? navigation.v0("pinUid") : null);
    }

    @Override // jd1.d
    public final String g9() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("pinUid") : null;
        if (v03 == null) {
            v03 = "";
        }
        return j1.V("visual_links/pins/%s/top_tagged_objects/", v03);
    }

    @Override // jd1.d
    public final g0 k9() {
        return g0.PIN_CLOSEUP_STL_MODULE;
    }

    @Override // jd1.d
    public final String u9() {
        String string = getResources().getString(e.stl_closeup_header);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // jd1.d
    public final String v9() {
        return "shop_feed";
    }

    @Override // jd1.d
    public final a4 x9() {
        return a4.FEED_STL_MODULE;
    }
}
