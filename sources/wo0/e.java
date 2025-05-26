package wo0;

import androidx.appcompat.widget.c2;
import com.pinterest.api.model.gb;
import com.pinterest.api.model.hk0;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import h32.u0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.x;
import m60.w;
import oa2.p;
import so.w5;
import sq0.e0;
import uj2.q;
import we1.f2;
import x02.a1;
import x02.i2;
import x02.x2;
import xo0.k;
import yk1.v;

/* loaded from: classes5.dex */
public final class e extends rr0.g {
    public final a1 A;
    public final x2 B;
    public final x C;
    public final c2 D;
    public xk E;
    public vo0.d F;

    /* renamed from: x, reason: collision with root package name */
    public final String f130644x;

    /* renamed from: y, reason: collision with root package name */
    public final String f130645y;

    /* renamed from: z, reason: collision with root package name */
    public final String f130646z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String bubbleId, rr0.h parameters, String requestParams, String shopSource, a1 bubbleRepository, v viewResources, i2 pinRepository, x2 userRepository, x bubblesExperiments, w5 bubbleCuratorBinderFactory, p legoUserRepPresenterFactory, c2 sharesheetUtils) {
        super(parameters);
        Intrinsics.checkNotNullParameter(bubbleId, "bubbleId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        Intrinsics.checkNotNullParameter(shopSource, "shopSource");
        Intrinsics.checkNotNullParameter(bubbleRepository, "bubbleRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(bubblesExperiments, "bubblesExperiments");
        Intrinsics.checkNotNullParameter(bubbleCuratorBinderFactory, "bubbleCuratorBinderFactory");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f130644x = bubbleId;
        this.f130645y = requestParams;
        this.f130646z = shopSource;
        this.A = bubbleRepository;
        this.B = userRepository;
        this.C = bubblesExperiments;
        this.D = sharesheetUtils;
        this.f109902n = new np0.e(pinRepository);
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER, new f2(15));
        this.f126436a.j(62, new cg0.c(2, getPresenterPinalytics(), getNetworkStateStream()));
        this.f126436a.j(63, new pk0.a(1, new jh0.d(this, 27)));
        this.f126436a.j(82, new rk1.g(getPresenterPinalytics(), legoUserRepPresenterFactory));
        uk1.d presenterPinalytics = getPresenterPinalytics();
        q<Boolean> networkStateStream = getNetworkStateStream();
        w wVar = this.f109896h;
        Intrinsics.checkNotNullExpressionValue(wVar, "getEventManager(...)");
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE, new ke1.e(presenterPinalytics, networkStateStream, false, wVar, viewResources, null, null, null, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN, new yi0.a(getPresenterPinalytics(), userRepository));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_USER, new yi0.a(getPresenterPinalytics(), (p) bubbleCuratorBinderFactory.f114685a.f114091b.f114553x1.get()));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION, new f2(14));
    }

    public static final void V3(e eVar) {
        xk xkVar = eVar.E;
        String str = xkVar != null ? xkVar.f43721m : null;
        if (str == null) {
            return;
        }
        eVar.addDisposable(nl.b.m(eVar.B.P(str), "BubbleContentPresenter:loadCurator", new d(eVar, 1)));
    }

    @Override // rr0.g
    public final void R3(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        xk xkVar = this.E;
        if (xkVar != null) {
            items.add(0, xkVar);
            Integer j13 = xkVar.j();
            if (j13.intValue() == hk0.SHOPPING_SPOTLIGHT.getValue()) {
                gb gbVar = new gb();
                gbVar.f38016b = a.a.C(xkVar.getUid(), "_description");
                gbVar.f38017c = "description_separator";
                gbVar.f38015a = xkVar.l();
                items.add(1, gbVar);
            }
        }
        vo0.d dVar = this.F;
        if (dVar != null) {
            items.add(1, dVar);
        }
        S3(items);
    }

    @Override // rr0.g, vq0.g
    /* renamed from: W3, reason: merged with bridge method [inline-methods] */
    public final void r3(uo0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        k kVar = (k) view;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        kVar.f135600c1 = this;
    }

    public final void X3() {
        xk xkVar = this.E;
        if (xkVar != null) {
            getPinalytics().X(u0.SEND_BUTTON);
            this.D.q(y32.f.EXPLORE.getValue(), xkVar);
        }
    }

    @Override // rr0.g, nr0.g
    public final boolean f(int i13) {
        if (i13 == 5) {
            xk xkVar = this.E;
            return z.i(xkVar != null ? xkVar.a() : null, "video_feed_story", false);
        }
        if (i13 == 195 || i13 == 219 || i13 == 62 || i13 == 63) {
            return true;
        }
        return super.f(i13);
    }

    @Override // rr0.g, sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        boolean z13 = item instanceof vh;
        if (z13) {
            HashMap E = kh2.d.E((vh) item);
            xk xkVar = this.E;
            E.put("story_category", String.valueOf(xkVar != null ? xkVar.j() : null));
        }
        if ((item instanceof xk) && i13 == 0) {
            xk xkVar2 = (xk) item;
            if (xkVar2.j().intValue() != hk0.STYLE_PIVOT.getValue()) {
                if (xkVar2.j().intValue() != hk0.SHOPPING_SPOTLIGHT.getValue()) {
                    return 62;
                }
            }
            return RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER;
        }
        if (item instanceof vo0.d) {
            return RecyclerViewTypes.VIEW_TYPE_USER;
        }
        if (item instanceof gb) {
            if (Intrinsics.d(((gb) item).f38017c, "description_separator")) {
                return RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION;
            }
            return 63;
        }
        if (item instanceof wy0) {
            return 82;
        }
        return (z13 && Intrinsics.d(((vh) item).q(), "product_category")) ? RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE : (z13 && Intrinsics.d(((vh) item).q(), "style_pivot_articles")) ? RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN : D3().getItemViewType(i13);
    }

    @Override // rr0.g, nr0.g
    public final boolean h(int i13) {
        return false;
    }

    @Override // rr0.g, vq0.g
    public final void loadData() {
        super.loadData();
        addDisposable(nl.b.m(this.A.L(this.f130644x), "BubbleContentPresenter:loadBubbleMetadata", new d(this, 0)));
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }

    @Override // rr0.g, nr0.g
    public final boolean q(int i13) {
        return i13 == 62 || super.q(i13);
    }

    @Override // rr0.g
    public final Map z3() {
        HashMap hashMap = new HashMap();
        hashMap.put("KEY_BUBBLE_ID", this.f130644x);
        String str = this.f130645y;
        if (str != null) {
        }
        String str2 = this.f130646z;
        if (str2 != null) {
            hashMap.put("shop_source", str2);
        }
        return hashMap;
    }
}
