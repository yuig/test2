package d61;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.oc0;
import com.pinterest.api.model.vh;
import com.pinterest.feature.home.view.l;
import h32.g0;
import h32.v2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import m60.u0;
import nx.d0;
import nx.v;
import nx.y0;

/* loaded from: classes5.dex */
public final class e extends l implements tf0.a, v {

    /* renamed from: j, reason: collision with root package name */
    public final j f53766j;

    /* renamed from: k, reason: collision with root package name */
    public sf0.b f53767k;

    /* renamed from: l, reason: collision with root package name */
    public String f53768l;

    /* renamed from: m, reason: collision with root package name */
    public String f53769m;

    /* renamed from: n, reason: collision with root package name */
    public g0 f53770n;

    /* renamed from: o, reason: collision with root package name */
    public final RecyclerView f53771o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, d0 pinalytics, u scope) {
        super(context, pinalytics, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f53766j = new j(16, 0);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.space_200);
        com.pinterest.feature.home.view.f decorator = new com.pinterest.feature.home.view.f(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, 0);
        Intrinsics.checkNotNullParameter(decorator, "decorator");
        com.pinterest.feature.home.view.f fVar = this.f45881h;
        RecyclerView recyclerView = this.f45879f;
        recyclerView.t2(fVar);
        recyclerView.m(decorator);
        this.f45881h = decorator;
        CardView cardView = this.f45875b;
        cardView.setElevation(cardView.getResources().getDimension(eo1.c.ignore));
        cardView.t(cardView.getResources().getDimension(eo1.c.ignore));
        Context context2 = cardView.getContext();
        int i13 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        cardView.setBackgroundColor(context2.getColor(i13));
        this.f45880g.f45854i = getResources().getInteger(u0.default_max_pins);
        double integer = getResources().getInteger(u0.default_num_pins_on_screen);
        com.pinterest.feature.home.view.e eVar = this.f45880g;
        eVar.f45859n = integer;
        eVar.f45855j = true;
        eVar.f45856k = true;
        this.f45878e.setPaddingRelative(0, 0, 0, getResources().getDimensionPixelOffset(eo1.c.space_300));
        View findViewById = findViewById(hz1.a.usecase_module_idea_stream_images_rv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f53771o = (RecyclerView) findViewById;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        String str = this.f53768l;
        y0 y0Var = null;
        if (str != null) {
            v2 x13 = j.x(this.f53766j, str, this.f53771o.getChildCount(), 0, this.f53769m, null, null, 52);
            if (x13 != null) {
                g0 g0Var = this.f53770n;
                if (g0Var == null) {
                    g0Var = g0.DYNAMIC_GRID_STORY;
                }
                y0Var = new y0(x13, null, null, g0Var, 6);
            }
        }
        return y0Var;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        v2 y13 = this.f53766j.y(null);
        g0 g0Var = this.f53770n;
        if (g0Var == null) {
            g0Var = g0.DYNAMIC_GRID_STORY;
        }
        return new y0(y13, null, null, g0Var, 6);
    }

    @Override // com.pinterest.feature.home.view.m
    public final void q2(f30 f30Var) {
        ih ihVar;
        String e13;
        String q13;
        List list;
        String obj;
        sf0.b bVar = this.f53767k;
        if (bVar != null) {
            HashMap hashMap = new HashMap();
            h32.u0 u0Var = f30Var == null ? h32.u0.VIEW_ALL_BUTTON : h32.u0.STORY_PIN_PREVIEW;
            vh vhVar = bVar.f112504c;
            if (vhVar == null || (ihVar = vhVar.f42857o) == null || (e13 = ihVar.e()) == null) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            vh vhVar2 = bVar.f112504c;
            if (vhVar2 != null && (list = vhVar2.f42865w) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof f30) {
                        arrayList.add(obj2);
                    }
                }
                hashMap2.put("pins_from_portal", CollectionsKt.Z(arrayList, ",", null, null, 0, null, sf0.a.f112501i, 30));
                if (f30Var != null) {
                    Iterator it = arrayList.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i13 = -1;
                            break;
                        } else if (Intrinsics.d(((f30) it.next()).getUid(), f30Var.getUid())) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    hashMap.put("pin_id", uid);
                    if (i13 > -1) {
                        hashMap2.put("selected_index", Integer.valueOf(i13));
                        hashMap.put("index", String.valueOf(i13));
                    }
                    oc0 d63 = f30Var.d6();
                    if (d63 != null) {
                        String j13 = d63.j();
                        String str = "";
                        if (j13 == null) {
                            j13 = "";
                        }
                        hashMap.put("pin_recommendation_reason", j13);
                        String k13 = d63.k();
                        if (k13 == null) {
                            k13 = "";
                        }
                        hashMap.put("pin_recommendation_reason_id_str", k13);
                        Map l13 = d63.l();
                        if (l13 != null && (obj = l13.toString()) != null) {
                            str = obj;
                        }
                        hashMap.put("through_properties", str);
                    }
                }
            }
            vh vhVar3 = bVar.f112504c;
            g0 g0Var = null;
            if (Intrinsics.d(vhVar3 != null ? vhVar3.q() : null, "story_pins_search_upsell")) {
                g0Var = g0.DYNAMIC_GRID_STORY;
                hashMap.put("story_type", "story_pins_search_upsell");
                Uri parse = Uri.parse(e13);
                if (Intrinsics.d(parse.getHost(), "today_article_feed") || parse.getPathSegments().contains("today-articles") || parse.getPathSegments().contains("today")) {
                    hashMap2.put("view_param_type", "SEARCH_TAB");
                    hashMap2.put("idea_stream_origin", sf0.c.SEARCH_LANDING_TODAY_PORTAL);
                } else {
                    hashMap2.put("view_param_type", "SEARCH_IDEA_PIN_STREAM");
                }
            } else {
                vh vhVar4 = bVar.f112504c;
                if (vhVar4 != null && (q13 = vhVar4.q()) != null) {
                    hashMap.put("story_type", q13);
                }
            }
            bVar.getPinalytics().h(g0Var, u0Var, hashMap);
            a11.e.e(bVar.f112502a, e13, hashMap2, 4);
        }
    }
}
