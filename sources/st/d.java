package st;

import ck2.i;
import com.pinterest.ads.feature.owc.view.collection.AdsProductsModule;
import com.pinterest.api.model.f30;
import es.h;
import es.v;
import h32.a0;
import h32.c1;
import h32.f;
import h32.f1;
import h32.k0;
import h32.v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nx.d0;
import nx.f0;
import pb0.g;
import rr.n0;
import uj2.q;
import x02.i2;
import yk1.r;

/* loaded from: classes3.dex */
public final class d extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f115154a;

    /* renamed from: b, reason: collision with root package name */
    public final ur.a f115155b;

    /* renamed from: c, reason: collision with root package name */
    public f30 f115156c;

    /* renamed from: d, reason: collision with root package name */
    public f30 f115157d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f115158e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f115159f;

    /* renamed from: g, reason: collision with root package name */
    public final g f115160g;

    /* renamed from: h, reason: collision with root package name */
    public long f115161h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i2 pinRepository, f0 pinalyticsFactory, q networkStateStream, ur.a adsCoreDependencies) {
        super(new uk1.d(pinalyticsFactory), networkStateStream);
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f115154a = pinRepository;
        this.f115155b = adsCoreDependencies;
        this.f115159f = new LinkedHashMap();
        this.f115160g = g.f99432a;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        super.onUnbind();
        ArrayList arrayList = new ArrayList(this.f115159f.values());
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.COLLECTION_ITEM_IMPRESSION_ONE_PIXEL;
        f30 f30Var = this.f115156c;
        pinalytics.d0(f1Var, f30Var != null ? f30Var.getUid() : null, arrayList);
    }

    public final c1 q3(boolean z13) {
        a0 a0Var;
        String r53;
        String uid;
        ur.b bVar = (ur.b) this.f115155b;
        k0 c13 = h.c(bVar.f123060c, this.f115156c);
        Long l13 = null;
        f fVar = ((es.c) bVar.f123058a).j0(this.f115156c) ? new f() : null;
        if (z13) {
            f30 f30Var = this.f115157d;
            String z43 = f30Var != null ? f30Var.z4() : null;
            f30 f30Var2 = this.f115157d;
            Long h03 = (f30Var2 == null || (uid = f30Var2.getUid()) == null) ? null : StringsKt.h0(uid);
            Integer num = this.f115158e;
            Short valueOf = num != null ? Short.valueOf((short) num.intValue()) : null;
            f30 f30Var3 = this.f115156c;
            String uid2 = f30Var3 != null ? f30Var3.getUid() : null;
            f30 f30Var4 = this.f115157d;
            if (f30Var4 != null && (r53 = f30Var4.r5()) != null) {
                l13 = StringsKt.h0(r53);
            }
            a0Var = new a0(h03, z43, null, valueOf, uid2, l13);
        } else {
            a0Var = null;
        }
        Short o13 = ((v) bVar.f123060c).o(this.f115156c);
        Boolean bool = Boolean.FALSE;
        return new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, a0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, c13, null, null, fVar, null, null, null, null, o13, null, null);
    }

    @Override // yk1.p
    public final void r3(ct.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        xj2.c F = this.f115154a.y().F(new n0(29, new tq.a0(this, 24)), new c(0, a.f115150l), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        AdsProductsModule adsProductsModule = (AdsProductsModule) view;
        Intrinsics.checkNotNullParameter(this, "presenter");
        adsProductsModule.f35363y = this;
        this.f115156c = (f30) adsProductsModule.f35364z.c(adsProductsModule, AdsProductsModule.C[0]);
    }

    public final void s3() {
        String uid;
        HashMap o13 = ep.b.o("click_type", "clickthrough");
        boolean d2 = Intrinsics.d(this.f115157d, this.f115156c);
        g gVar = this.f115160g;
        if (d2) {
            d0 pinalytics = getPinalytics();
            f1 f1Var = f1.COLLECTION_PIN_CLICKTHROUGH_END;
            f30 f30Var = this.f115156c;
            uid = f30Var != null ? f30Var.getUid() : null;
            c1 q33 = q3(false);
            v0 v0Var = new v0();
            v0Var.C = Long.valueOf(gVar.a() - this.f115161h);
            pinalytics.H(f1Var, uid, q33, o13, v0Var, false);
            return;
        }
        if (d2) {
            return;
        }
        d0 pinalytics2 = getPinalytics();
        f1 f1Var2 = f1.COLLECTION_ITEM_CLICKTHROUGH_END;
        f30 f30Var2 = this.f115156c;
        uid = f30Var2 != null ? f30Var2.getUid() : null;
        c1 q34 = q3(true);
        v0 v0Var2 = new v0();
        v0Var2.C = Long.valueOf(gVar.a() - this.f115161h);
        pinalytics2.H(f1Var2, uid, q34, o13, v0Var2, false);
    }
}
