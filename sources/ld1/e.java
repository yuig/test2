package ld1;

import android.content.Context;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ed1.m;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import nx.d0;

/* loaded from: classes5.dex */
public final class e extends oa2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f82978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f82979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wy0 f82980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uk1.d f82981h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HashMap f82982i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, wy0 wy0Var, uk1.d dVar, HashMap hashMap, f fVar, m mVar) {
        super(fVar, mVar, (oa2.m) null, 12);
        this.f82978e = gVar;
        this.f82979f = str;
        this.f82980g = wy0Var;
        this.f82981h = dVar;
        this.f82982i = hashMap;
    }

    @Override // oa2.c, oa2.l
    public final void k() {
        String navigationContext;
        g gVar = this.f82978e;
        if (gVar.isBound() && (navigationContext = this.f82979f) != null) {
            d0 d0Var = this.f82981h.f122379a;
            f1 f1Var = f1.TAP;
            wy0 wy0Var = this.f82980g;
            String uid = wy0Var.getUid();
            g0 g0Var = g0.PIN_CLOSEUP_BRAND_CATALOG;
            u0 u0Var = u0.SHOPPING_DOMAIN_MODULE_SHOP_BUTTON;
            Intrinsics.f(d0Var);
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : this.f82982i, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            c cVar = (c) gVar.getView();
            HashMap navigationParams = new HashMap();
            ze1.c cVar2 = gVar.f82985a;
            navigationParams.put("source", cVar2.f141808a);
            navigationParams.put("search_query", cVar2.f141809b);
            navigationParams.put("brand_image_url", dl2.b.s0(wy0Var));
            navigationParams.put("brand_name", dl2.b.i1(wy0Var));
            navigationParams.put("brand_verification", String.valueOf(dl2.b.W1(wy0Var)));
            navigationParams.put("merchant_verification", String.valueOf(wy0Var.O3().booleanValue()));
            navigationParams.put("brand_user_id", wy0Var.getUid());
            navigationParams.put("module_source", "module_source_closeup");
            navigationParams.put("shop_source", gVar.f82989e);
            b bVar = (b) cVar;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(navigationContext, "navigationContext");
            Intrinsics.checkNotNullParameter(navigationParams, "navigationParams");
            l lVar = bVar.f82969d;
            if (lVar == null) {
                Intrinsics.r("uriNavigator");
                throw null;
            }
            Context context = bVar.getContext();
            Intrinsics.f(context);
            l.b(lVar, context, navigationContext, true, false, null, navigationParams, 64);
        }
    }
}
