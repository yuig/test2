package wu0;

import bs1.c;
import com.pinterest.api.model.j40;
import com.pinterest.api.model.m40;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import l71.f;
import lh0.a4;
import lh0.g1;
import lh0.s1;
import lh0.z3;
import m20.b;
import nx.d0;
import uj2.b0;
import uk1.d;
import zu0.g;

/* loaded from: classes5.dex */
public final class a extends f {

    /* renamed from: s, reason: collision with root package name */
    public final b f131141s;

    /* renamed from: t, reason: collision with root package name */
    public final xu0.b f131142t;

    /* renamed from: u, reason: collision with root package name */
    public final xu0.b f131143u;

    /* renamed from: v, reason: collision with root package name */
    public final xu0.b f131144v;

    /* renamed from: w, reason: collision with root package name */
    public final d f131145w;

    /* renamed from: x, reason: collision with root package name */
    public final String f131146x;

    /* renamed from: y, reason: collision with root package name */
    public final s1 f131147y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f131148z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b interestTaggingService, xu0.b tagSelectListener, xu0.b tagLoadListener, xu0.b selectedInterestTagsProvider, xu0.b interestQueryProvider, du0.b presenterPinalytics, String language, s1 experiments) {
        super(null, null);
        Intrinsics.checkNotNullParameter(interestTaggingService, "interestTaggingService");
        Intrinsics.checkNotNullParameter(tagSelectListener, "tagSelectListener");
        Intrinsics.checkNotNullParameter(tagLoadListener, "tagLoadListener");
        Intrinsics.checkNotNullParameter(selectedInterestTagsProvider, "selectedInterestTagsProvider");
        Intrinsics.checkNotNullParameter(interestQueryProvider, "interestQueryProvider");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f131141s = interestTaggingService;
        this.f131142t = tagLoadListener;
        this.f131143u = selectedInterestTagsProvider;
        this.f131144v = interestQueryProvider;
        this.f131145w = presenterPinalytics;
        this.f131146x = language;
        this.f131147y = experiments;
        this.f131148z = new ArrayList();
        o(0, new yi0.a(tagSelectListener, presenterPinalytics));
    }

    public static m40 L(String str) {
        j40 j40Var = new j40(0);
        j40Var.f38971b = a.a.j("freeFormPinInterestTag-", str);
        boolean[] zArr = j40Var.f38977h;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
        j40Var.c(str);
        j40Var.b(Boolean.TRUE);
        m40 a13 = j40Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    @Override // l71.f
    public final boolean B() {
        return false;
    }

    @Override // l71.f
    public final void G(ArrayList items) {
        Object obj;
        Object obj2;
        String str;
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList H0 = CollectionsKt.H0(items);
        String str2 = this.f131144v.f135939l;
        s1 s1Var = this.f131147y;
        s1Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) s1Var.f83476a;
        if (g1Var.o("android_idea_pins_freeform_tags", "enabled", z3Var) || g1Var.l("android_idea_pins_freeform_tags")) {
            Iterator it = items.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                String n13 = ((m40) obj2).n();
                if (n13 != null) {
                    str = n13.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                } else {
                    str = null;
                }
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.d(str, lowerCase)) {
                    break;
                }
            }
            boolean z13 = obj2 != null;
            Iterator it2 = this.f131143u.f135936i.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.d(((m40) next).n(), str2)) {
                    obj = next;
                    break;
                }
            }
            boolean z14 = obj != null;
            if (!z13 && !z14) {
                m40 L = L(str2);
                HashMap hashMap = new HashMap();
                c.G1("pin_interest_name", L.n(), hashMap);
                hashMap.put("is_freeform_tag", "true");
                d0 d0Var = this.f131145w.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.PIN_INTEREST_TAG, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                H0.add(0, L);
                this.f81939n.c(H0);
            }
        }
        this.f131148z = H0;
        int size = H0.size();
        xu0.b bVar = this.f131142t;
        ((g) ((vu0.a) bVar.getView())).V8(size == 0 && bVar.f135936i.isEmpty());
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 0;
    }

    @Override // xk1.c, vq0.e
    public final void removeItem(int i13) {
        Object item = getItem(i13);
        Intrinsics.g(item, "null cannot be cast to non-null type com.pinterest.api.model.PinInterestTag");
        m40 m40Var = (m40) item;
        ArrayList arrayList = this.f131148z;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.d(((s) it.next()).getUid(), m40Var.getUid())) {
                    this.f131148z.remove(m40Var);
                    this.f81939n.c(this.f131148z);
                    break;
                }
            }
        }
        super.removeItem(i13);
    }

    @Override // l71.f
    public final b0 w(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return (b0) new js0.c(this.f131141s).b(new yu0.b(query, this.f131146x)).buildRequest();
    }

    @Override // l71.f
    public final boolean x(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        List list = this.f131143u.f135936i;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((m40) it.next()).getUid());
        }
        return !arrayList.contains(model.getUid());
    }
}
