package eu;

import com.pinterest.ads.feature.owc.view.collection.AdsProductsModule;
import com.pinterest.api.model.f30;
import h32.b0;
import h32.f1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nx.d0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdsProductsModule f60150a;

    public q(AdsProductsModule adsProductsModule) {
        this.f60150a = adsProductsModule;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull u event) {
        Intrinsics.checkNotNullParameter(event, "event");
        st.d dVar = this.f60150a.f35363y;
        if (dVar != null) {
            HashMap o13 = ep.b.o("click_type", "clickthrough");
            dVar.f115161h = dVar.f115160g.a();
            boolean d2 = Intrinsics.d(dVar.f115157d, dVar.f115156c);
            if (d2) {
                d0 pinalytics = dVar.getPinalytics();
                f1 f1Var = f1.COLLECTION_PIN_CLICKTHROUGH;
                f30 f30Var = dVar.f115156c;
                pinalytics.u(f1Var, f30Var != null ? f30Var.getUid() : null, dVar.q3(false), o13, false);
                return;
            }
            if (d2) {
                return;
            }
            d0 pinalytics2 = dVar.getPinalytics();
            f1 f1Var2 = f1.COLLECTION_ITEM_CLICKTHROUGH;
            f30 f30Var2 = dVar.f115157d;
            pinalytics2.u(f1Var2, f30Var2 != null ? f30Var2.getUid() : null, dVar.q3(true), o13, false);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v event) {
        st.d dVar;
        b0 b0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        f30 product = event.f60156a;
        if (product == null || (dVar = this.f60150a.f35363y) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(product, "product");
        LinkedHashMap linkedHashMap = dVar.f115159f;
        b0 source = (b0) linkedHashMap.get(product.getUid());
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            b0Var = new b0(source.f66837a, source.f66838b, source.f66839c, source.f66840d, source.f66841e, Long.valueOf(dVar.f115160g.a()), source.f66843g, source.f66844h, source.f66845i, source.f66846j, source.f66847k, source.f66848l);
        } else {
            b0Var = null;
        }
        if (b0Var != null) {
            String uid = product.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            linkedHashMap.put(uid, b0Var);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull w event) {
        st.d dVar;
        Intrinsics.checkNotNullParameter(event, "event");
        f30 product = event.f60157a;
        if (product == null || (dVar = this.f60150a.f35363y) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(product, "product");
        f30 f30Var = dVar.f115156c;
        String uid = f30Var != null ? f30Var.getUid() : null;
        Short valueOf = Short.valueOf((short) event.f60158b);
        String uid2 = product.getUid();
        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
        Long valueOf2 = Long.valueOf(Long.parseLong(uid2));
        Long valueOf3 = Long.valueOf(dVar.f115160g.a());
        String z43 = product.z4();
        String r53 = product.r5();
        b0 b0Var = new b0(uid, null, null, null, valueOf3, null, null, null, valueOf2, z43, valueOf, r53 != null ? StringsKt.h0(r53) : null);
        LinkedHashMap linkedHashMap = dVar.f115159f;
        String uid3 = product.getUid();
        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
        linkedHashMap.put(uid3, b0Var);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x event) {
        Intrinsics.checkNotNullParameter(event, "event");
        st.d dVar = this.f60150a.f35363y;
        if (dVar != null) {
            dVar.s3();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull y event) {
        st.d dVar;
        Intrinsics.checkNotNullParameter(event, "event");
        f30 product = event.f60160a;
        if (product == null || (dVar = this.f60150a.f35363y) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(product, "product");
        dVar.f115157d = product;
        dVar.f115158e = Integer.valueOf(event.f60161b);
    }
}
