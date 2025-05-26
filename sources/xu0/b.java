package xu0;

import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.pinterest.api.model.j40;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.m40;
import com.pinterest.feature.ideaPinCreation.interesttagging.view.PinInterestTagView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import dl1.l;
import dl1.s;
import dl1.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kh2.k3;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import lh0.s1;
import m60.w;
import sq0.c0;
import uk2.d;
import wk1.i;
import wk1.q;
import xj2.c;
import zu0.f;
import zu0.g;

/* loaded from: classes5.dex */
public final class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public final ag1.b f135928a;

    /* renamed from: b, reason: collision with root package name */
    public final String f135929b;

    /* renamed from: c, reason: collision with root package name */
    public final String f135930c;

    /* renamed from: d, reason: collision with root package name */
    public final String f135931d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f135932e;

    /* renamed from: f, reason: collision with root package name */
    public final t f135933f;

    /* renamed from: g, reason: collision with root package name */
    public final w f135934g;

    /* renamed from: h, reason: collision with root package name */
    public ln0 f135935h;

    /* renamed from: i, reason: collision with root package name */
    public List f135936i;

    /* renamed from: j, reason: collision with root package name */
    public List f135937j;

    /* renamed from: k, reason: collision with root package name */
    public final wu0.a f135938k;

    /* renamed from: l, reason: collision with root package name */
    public String f135939l;

    /* renamed from: m, reason: collision with root package name */
    public d f135940m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(du0.b presenterPinalytics, m20.b interestTaggingService, uj2.q networkStateStream, ag1.b dataManager, String language, String scheduledPinInterestIds, String scheduledPinInterestLabels, String scheduledPinFreeformTags, boolean z13, t storyPinLocalDataRepository, s1 experiments, w eventManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(interestTaggingService, "interestTaggingService");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(scheduledPinInterestIds, "scheduledPinInterestIds");
        Intrinsics.checkNotNullParameter(scheduledPinInterestLabels, "scheduledPinInterestLabels");
        Intrinsics.checkNotNullParameter(scheduledPinFreeformTags, "scheduledPinFreeformTags");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f135928a = dataManager;
        this.f135929b = scheduledPinInterestIds;
        this.f135930c = scheduledPinInterestLabels;
        this.f135931d = scheduledPinFreeformTags;
        this.f135932e = z13;
        this.f135933f = storyPinLocalDataRepository;
        this.f135934g = eventManager;
        this.f135936i = new ArrayList();
        this.f135938k = new wu0.a(interestTaggingService, this, this, this, this, presenterPinalytics, language, experiments);
        this.f135939l = "";
    }

    public final void B3() {
        if (!isBound()) {
            return;
        }
        LinearLayout linearLayout = ((g) ((vu0.a) getView())).I0;
        if (linearLayout == null) {
            Intrinsics.r("selectedTagsView");
            throw null;
        }
        linearLayout.removeAllViews();
        Iterator it = this.f135936i.iterator();
        while (true) {
            if (!it.hasNext()) {
                vu0.a aVar = (vu0.a) getView();
                boolean z13 = this.f135936i.size() > 0;
                g gVar = (g) aVar;
                GestaltText gestaltText = gVar.J0;
                if (gestaltText == null) {
                    Intrinsics.r("selectedHeader");
                    throw null;
                }
                gestaltText.i(new rn0.d(z13, 28));
                HorizontalScrollView horizontalScrollView = gVar.H0;
                if (horizontalScrollView == null) {
                    Intrinsics.r("selectedTagsScrollView");
                    throw null;
                }
                k3.R1(horizontalScrollView, z13);
                ((g) ((vu0.a) getView())).V8(this.f135936i.size() == 0 && z.j(this.f135939l));
                vu0.a aVar2 = (vu0.a) getView();
                boolean z33 = z3();
                GestaltButton gestaltButton = ((g) aVar2).E0;
                if (gestaltButton != null) {
                    gestaltButton.d(new rn0.d(z33, 26));
                    return;
                } else {
                    Intrinsics.r("nextButton");
                    throw null;
                }
            }
            m40 tag = (m40) it.next();
            g gVar2 = (g) ((vu0.a) getView());
            gVar2.getClass();
            Intrinsics.checkNotNullParameter(tag, "tag");
            PinInterestTagView pinInterestTagView = new PinInterestTagView(gVar2.getContext());
            String uid = tag.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            String n13 = tag.n();
            if (n13 == null) {
                n13 = "";
            }
            String str = n13;
            pinInterestTagView.e(str);
            pinInterestTagView.b(true);
            pinInterestTagView.a(new f(gVar2, pinInterestTagView, uid, str, tag, 0));
            LinearLayout linearLayout2 = gVar2.I0;
            if (linearLayout2 == null) {
                Intrinsics.r("selectedTagsView");
                throw null;
            }
            linearLayout2.addView(pinInterestTagView);
            HorizontalScrollView horizontalScrollView2 = gVar2.H0;
            if (horizontalScrollView2 == null) {
                Intrinsics.r("selectedTagsScrollView");
                throw null;
            }
            horizontalScrollView2.post(new vs0.b(gVar2, 5));
            String uid2 = tag.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            wu0.a aVar3 = this.f135938k;
            Iterator it2 = CollectionsKt.F0(aVar3.f135191h).iterator();
            int i13 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i13 = -1;
                    break;
                } else if (Intrinsics.d(((s) it2.next()).getUid(), uid2)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 != -1) {
                aVar3.removeItem(i13);
            }
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f135938k);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(vu0.a view) {
        List split$default;
        List split$default2;
        List split$default3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        g gVar = (g) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        gVar.L0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        gVar.M0 = this;
        Intrinsics.checkNotNullParameter(this, "provider");
        gVar.P0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        gVar.O0 = this;
        if (this.f135932e) {
            split$default = StringsKt__StringsKt.split$default(this.f135931d, new String[]{","}, false, 0, 6, null);
            String[] strArr = (String[]) split$default.toArray(new String[0]);
            ArrayList<String> l13 = f0.l(Arrays.copyOf(strArr, strArr.length));
            l13.remove("");
            split$default2 = StringsKt__StringsKt.split$default(this.f135930c, new String[]{","}, false, 0, 6, null);
            String[] strArr2 = (String[]) split$default2.toArray(new String[0]);
            ArrayList l14 = f0.l(Arrays.copyOf(strArr2, strArr2.length));
            l14.remove("");
            split$default3 = StringsKt__StringsKt.split$default(this.f135929b, new String[]{","}, false, 0, 6, null);
            String[] strArr3 = (String[]) split$default3.toArray(new String[0]);
            ArrayList l15 = f0.l(Arrays.copyOf(strArr3, strArr3.length));
            l15.remove("");
            for (String str : l13) {
                List list = this.f135936i;
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
                list.add(a13);
            }
            if ((!l15.isEmpty()) && (!l14.isEmpty())) {
                Iterator it = CollectionsKt.N0(l15, l14).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    List list2 = this.f135936i;
                    j40 j40Var2 = new j40(0);
                    j40Var2.f38971b = (String) pair.f80346a;
                    boolean[] zArr2 = j40Var2.f38977h;
                    if (zArr2.length > 1) {
                        zArr2[1] = true;
                    }
                    j40Var2.c((String) pair.f80347b);
                    j40Var2.b(Boolean.FALSE);
                    m40 a14 = j40Var2.a();
                    Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                    list2.add(a14);
                }
            }
            if (this.f135937j == null) {
                this.f135937j = CollectionsKt.H0(this.f135936i);
            }
            B3();
        } else {
            c F = ((l) this.f135933f).S(this.f135928a.d()).F(new mu0.a(9, new au0.f(this, 10)), new mu0.a(10, a.f135923j), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            addDisposable(F);
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        gVar.N0 = this;
        d dVar = new d();
        if (!z.j(this.f135939l)) {
            dVar.c(this.f135939l);
        }
        this.f135940m = dVar;
        this.f135938k.J(dVar);
    }

    public final void u3() {
        List list = this.f135937j;
        if (list == null) {
            list = q0.f80391a;
        }
        x3(list);
    }

    public final void v3() {
        if (this.f135932e && z3()) {
            List list = this.f135936i;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                Boolean l13 = ((m40) obj).l();
                Object obj2 = linkedHashMap.get(l13);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(l13, obj2);
                }
                ((List) obj2).add(obj);
            }
            List list2 = (List) linkedHashMap.get(Boolean.TRUE);
            String Z = list2 != null ? CollectionsKt.Z(list2, ",", null, null, 0, null, a.f135924k, 30) : null;
            Boolean bool = Boolean.FALSE;
            List list3 = (List) linkedHashMap.get(bool);
            String Z2 = list3 != null ? CollectionsKt.Z(list3, ",", null, null, 0, null, a.f135925l, 30) : null;
            List list4 = (List) linkedHashMap.get(bool);
            String Z3 = list4 != null ? CollectionsKt.Z(list4, ",", null, null, 0, null, a.f135926m, 30) : null;
            if (Z2 == null) {
                Z2 = "";
            }
            if (Z3 == null) {
                Z3 = "";
            }
            if (Z == null) {
                Z = "";
            }
            this.f135934g.d(new mt0.a(Z2, Z3, Z));
        }
    }

    public final void w3(String id3) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(id3, "id");
        Iterator it = this.f135936i.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (Intrinsics.d(((m40) obj2).getUid(), id3)) {
                    break;
                }
            }
        }
        m40 model = (m40) obj2;
        wu0.a aVar = this.f135938k;
        if (model != null) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            ArrayList arrayList = aVar.f131148z;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.d(((s) it2.next()).getUid(), model.getUid())) {
                        break;
                    }
                }
            }
            aVar.f131148z.add(model);
            aVar.f81939n.c(aVar.f131148z);
        }
        ArrayList H0 = CollectionsKt.H0(this.f135936i);
        k0.y(H0, new kl0.c(id3, 29));
        if (this.f135932e) {
            this.f135936i = H0;
            B3();
        } else {
            x3(H0);
        }
        if (!z.j(this.f135939l)) {
            Iterator it3 = H0.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it3.next();
                    if (Intrinsics.d(((m40) obj3).n(), this.f135939l)) {
                        break;
                    }
                }
            }
            if (obj3 == null) {
                String query = this.f135939l;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                ArrayList H02 = CollectionsKt.H0(aVar.f131148z);
                Iterator it4 = H02.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (Intrinsics.d(((m40) next).n(), query)) {
                        obj = next;
                        break;
                    }
                }
                if (obj == null) {
                    H02.add(wu0.a.L(query));
                    aVar.f81939n.c(H02);
                }
            }
        }
    }

    public final void x3(List list) {
        ln0 ln0Var = this.f135935h;
        if (ln0Var != null) {
            ((l) this.f135933f).W(ln0.a(ln0Var, null, null, list, null, null, null, false, null, null, null, null, 16375));
        }
    }

    public final boolean z3() {
        return !Intrinsics.d(this.f135936i, this.f135937j);
    }
}
