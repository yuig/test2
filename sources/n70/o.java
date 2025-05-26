package n70;

import com.pinterest.api.model.f30;
import com.pinterest.feature.search.results.view.GraphQLSearchGridFragment;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends uk1.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f89633g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f89634h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, nx.f0 f0Var, int i13) {
        super(f0Var);
        this.f89633g = i13;
        this.f89634h = obj;
    }

    @Override // uk1.d
    public final h32.g0 f() {
        switch (this.f89633g) {
            case 2:
                return h32.g0.BOARD_MORE_IDEAS_ENDLESS_SCROLL;
            case 3:
            default:
                return super.f();
            case 4:
                return h32.g0.TOAST;
            case 8:
                ((td1.b) this.f89634h).getClass();
            case 5:
            case 6:
            case 7:
                return null;
        }
    }

    @Override // uk1.d
    public final String g() {
        switch (this.f89633g) {
            case 8:
                return ((td1.b) this.f89634h).f117462j1;
            default:
                return this.f122380b;
        }
    }

    @Override // uk1.d
    public final a4 i() {
        int i13 = this.f89633g;
        Object obj = this.f89634h;
        switch (i13) {
            case 0:
                return ((w) obj).getP0();
            case 1:
            default:
                return super.i();
            case 2:
                return ((kl0.z) obj).getP0();
            case 3:
                return a4.STORY_PIN_PRODUCT_TAGS_LIST;
            case 4:
                int i14 = j11.b.f74384a[((j11.a) obj).ordinal()];
                if (i14 == 1) {
                    return a4.ONE_TAP_SAVE_TOAST;
                }
                if (i14 == 2) {
                    return a4.ONE_TAP_DELETE_TOAST;
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                return a4.ONEBAR_DRAWER;
            case 6:
                return a4.ONEBAR_DRAWER;
            case 7:
                return a4.SHOPPING_PRODUCT_FILTER;
            case 8:
                ((td1.b) obj).getClass();
                return a4.SHOPPING_DOT_FEED;
        }
    }

    @Override // uk1.d
    public final d4 j() {
        int i13 = this.f89633g;
        Object obj = this.f89634h;
        switch (i13) {
            case 0:
                return ((w) obj).f89700j1;
            case 1:
            case 4:
            default:
                return super.j();
            case 2:
                return ((kl0.z) obj).d2;
            case 3:
                return d4.STORY_PIN_METADATA;
            case 5:
                return ((GraphQLSearchGridFragment) obj).f47681z1;
            case 6:
                return ((SearchGridMultiSectionFragment) obj).f47728q2;
            case 7:
                return (d4) obj;
            case 8:
                return ((td1.b) obj).f117470r1;
        }
    }

    public final HashMap l() {
        HashMap hashMap = new HashMap();
        Object obj = this.f89634h;
        if (((String) obj).length() > 0) {
            hashMap.put("today_article_id", (String) obj);
        }
        return hashMap;
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        int i13 = this.f89633g;
        Object obj = this.f89634h;
        switch (i13) {
            case 1:
                HashMap f63135d0 = super.getF63135d0();
                if (f63135d0 == null) {
                    f63135d0 = new HashMap();
                }
                tj0.h hVar = (tj0.h) obj;
                int i14 = tj0.h.f117873a1;
                f63135d0.put("board_id", hVar.m9());
                f63135d0.put("referrer", String.valueOf(x22.c.POST_AUTO_ORGANIZE_BOTTOM_SHEET.getValue()));
                Navigation navigation = hVar.I;
                f63135d0.put("board_pin_count", String.valueOf(navigation != null ? navigation.J1("BOARD_PIN_COUNTS") : 0));
                return f63135d0;
            case 3:
                HashMap f63135d02 = super.getF63135d0();
                if (f63135d02 == null) {
                    f63135d02 = new HashMap();
                }
                f30 f30Var = (f30) obj;
                if (f30Var != null) {
                }
                return f63135d02;
            case 8:
                nm.u uVar = new nm.u();
                uVar.u("is_product_only_feed", "true");
                HashMap f63135d03 = super.getF63135d0();
                if (f63135d03 == null) {
                    f63135d03 = new HashMap();
                }
                f63135d03.put("commerce_data", uVar.toString());
                return f63135d03;
            case 9:
                HashMap f63135d04 = super.getF63135d0();
                if (f63135d04 == null) {
                    f63135d04 = new HashMap();
                }
                f63135d04.putAll(l());
                return f63135d04;
            default:
                return super.getF63135d0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nx.f0 pinalyticsFactory, f30 f30Var) {
        super(pinalyticsFactory);
        this.f89633g = 3;
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f89634h = f30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nx.f0 f0Var, d4 d4Var) {
        super(f0Var);
        this.f89633g = 7;
        this.f89634h = d4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nx.f0 pinalyticsFactory, String articleId) {
        super(articleId, new e3.a(5), pinalyticsFactory);
        this.f89633g = 9;
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f89634h = articleId;
    }
}
