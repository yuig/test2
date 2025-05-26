package ug1;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.zv0;
import ey.n4;
import h32.c3;
import h32.d4;
import h32.g0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.a4;
import lh0.e4;
import lh0.g1;
import lh0.z3;
import m60.w;
import oy.i0;
import x02.x2;

/* loaded from: classes5.dex */
public final class n extends wi0.b {

    /* renamed from: h, reason: collision with root package name */
    public final w f122232h;

    /* renamed from: i, reason: collision with root package name */
    public final nu1.a f122233i;

    /* renamed from: j, reason: collision with root package name */
    public final e4 f122234j;

    /* renamed from: k, reason: collision with root package name */
    public zv0 f122235k;

    /* renamed from: l, reason: collision with root package name */
    public c3 f122236l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(uk1.d presenterPinalytics, x2 userRepository, w eventManager, nu1.a aVar, e4 experiments) {
        super(presenterPinalytics, userRepository, null, 12);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f122232h = eventManager;
        this.f122233i = aVar;
        this.f122234j = experiments;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (r1 == null) goto L18;
     */
    @Override // wi0.b, yk1.b
    /* renamed from: p3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3(vi0.b r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.n.r3(vi0.b):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.pinterest.navigation.NavigationImpl] */
    @Override // wi0.b
    public final void q3() {
        List I;
        f30 f30Var;
        zv0 zv0Var;
        zv0 zv0Var2;
        String R;
        zv0 zv0Var3;
        HashMap hashMap = this.f130004g;
        boolean z13 = Intrinsics.d(hashMap != null ? (String) hashMap.get("story_type") : null, "shopping_spotlight") || ((zv0Var3 = this.f122235k) != null && Intrinsics.d(zv0Var3.P(), Boolean.TRUE));
        this.f129998a.f122379a.h(z13 ? g0.CURATED_ARTICLE : g0.TODAY_ARTICLE, null, this.f130004g);
        if (this.f122233i == null || (zv0Var = this.f122235k) == null || !zv0Var.S() || (zv0Var2 = this.f122235k) == null || (R = zv0Var2.R()) == null || !(!z.j(R))) {
            ?? X = c0.d.X(this.f122235k, null);
            if (X != 0) {
                if (z13) {
                    e4 e4Var = this.f122234j;
                    e4Var.getClass();
                    z3 z3Var = a4.f83298b;
                    g1 g1Var = (g1) e4Var.f83339a;
                    if (g1Var.o("android_shopping_spotlight_pin_rep_price_indicator_removal", "enabled", z3Var) || g1Var.l("android_shopping_spotlight_pin_rep_price_indicator_removal")) {
                        X.Y1("com.pinterest.EXTRA_TODAY_ARTICLE_IS_SHOPPING_FEED", true);
                    }
                }
                X.z(c42.f.SEARCH_LANDING_PAGE.getValue(), "com.pinterest.EXTRA_TODAY_ARTICLE_REFERRER");
                r1 = X;
            }
            this.f122232h.d(r1);
        } else {
            zv0 zv0Var4 = this.f122235k;
            nu1.a.c(this.f122233i, zv0Var4 != null ? zv0Var4.R() : null, null, null, false, 30);
        }
        zv0 zv0Var5 = this.f122235k;
        if (zv0Var5 != null) {
            if (zv0Var5.L().intValue() == c42.c.IDEA_STREAM.getValue()) {
                zv0 zv0Var6 = this.f122235k;
                if (zv0Var6 == null || (I = zv0Var6.I()) == null || (f30Var = (f30) CollectionsKt.firstOrNull(I)) == null) {
                    vb0.j.f125466a.G("Failed to get today article cover Pin ID for Idea Stream, needed for Static Grid to Story Pin PWT", new Object[0]);
                    return;
                }
                if (b40.P0(f30Var)) {
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    new n4(uid).i();
                    return;
                }
                String uid2 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                boolean R0 = b40.R0(f30Var);
                dl0 v63 = f30Var.v6();
                if (v63 != null) {
                    v63.r();
                }
                new i0(uid2, null, R0, d4.FEED, h32.a4.SEARCH_TAB, 22).i();
            }
        }
    }

    @Override // wi0.b
    public final Object r3() {
        c3 c3Var;
        c3 source = this.f122236l;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            c3Var = new c3(source.f66932a, source.f66933b, jq.b.c(TimeUnit.MILLISECONDS), source.f66935d, source.f66936e);
        } else {
            c3Var = null;
        }
        this.f122236l = null;
        return c3Var;
    }

    @Override // wi0.b
    public final Object s3() {
        if (this.f122236l == null) {
            zv0 zv0Var = this.f122235k;
            this.f122236l = new c3(null, jq.b.c(TimeUnit.MILLISECONDS), null, Short.valueOf((short) this.f130003f), zv0Var != null ? zv0Var.getUid() : null);
        }
        return this.f122236l;
    }
}
