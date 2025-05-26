package yo0;

import a.o3;
import android.content.res.Resources;
import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.ph0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadFilterCell;
import dc0.o;
import dl1.s;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kl2.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import l71.i;
import l71.p;
import l71.q;
import ld1.g;
import m60.f0;
import m60.w;
import nx.b0;
import nx.d1;
import p21.f;
import pb0.d;
import qa2.d0;
import t3.s1;
import vb0.j;
import vq0.h;
import wo0.c;
import x02.x2;
import yk1.m;
import yk1.n;
import yk1.v;
import z32.l1;
import z32.n1;

/* loaded from: classes5.dex */
public class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139594a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f139595b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f139596c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f139597d;

    /* renamed from: e, reason: collision with root package name */
    public Object f139598e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f139599f;

    /* renamed from: g, reason: collision with root package name */
    public Object f139600g;

    /* renamed from: h, reason: collision with root package name */
    public Object f139601h;

    /* renamed from: i, reason: collision with root package name */
    public Object f139602i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Function1 function1, Function2 function2, wy0 wy0Var, d dVar, ka2.b bVar, ka2.a aVar, int i13) {
        this(function1, function2, wy0Var, (wj0.a) null, dVar, bVar, (i13 & 64) != 0 ? new ka2.a(null, false, false, null, false, false, false, false, null, false, false, false, false, false, 65535) : aVar, (Integer) null);
        this.f139594a = 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, o21.d] */
    /* JADX WARN: Type inference failed for: r1v16, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r2v25, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, ld1.c] */
    /* JADX WARN: Type inference failed for: r2v36, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r2v39, types: [dc0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    @Override // vq0.h
    public final void c(n nVar, Object obj, final int i13) {
        vh model;
        c cVar;
        Integer i14;
        String n13;
        ?? r33 = 0;
        ?? r34 = 0;
        Unit unit = null;
        g gVar = null;
        o71.n nVar2 = null;
        f fVar = null;
        r4 = null;
        n1 n1Var = null;
        switch (this.f139594a) {
            case 0:
                xo0.g view = (xo0.g) nVar;
                s model2 = (s) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                boolean z13 = model2 instanceof vh;
                f0 f0Var = j.f125466a;
                if (z13) {
                    model = (vh) model2;
                } else if (!(model2 instanceof br.d)) {
                    f0Var.G("Could not parse DynamicStory to be bound with BubbleContainerViewBinder", new Object[0]);
                    break;
                } else {
                    model = ((br.d) model2).f23719q;
                }
                if (!(view instanceof View)) {
                    view = null;
                }
                if (view != null) {
                    yk1.j.a().getClass();
                    m b13 = yk1.j.b(view);
                    if (!(b13 instanceof c)) {
                        b13 = null;
                    }
                    cVar = (c) b13;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    Intrinsics.f(model);
                    Intrinsics.checkNotNullParameter(model, "model");
                    String id3 = model.getId();
                    if (id3 == null) {
                        id3 = "";
                    }
                    cVar.f130633j = id3;
                    kj kjVar = model.f42855m;
                    cVar.f130634k = kjVar != null ? kjVar.a() : null;
                    HashMap hashMap = model.f42859q;
                    cVar.f130636m = hashMap != null ? (String) hashMap.get("entered_query") : null;
                    List list = model.f42865w;
                    Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        s sVar = (s) obj2;
                        if ((sVar instanceof xk) && (n13 = ((xk) sVar).n()) != null && !z.j(n13)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        s sVar2 = (s) it.next();
                        xk xkVar = sVar2 instanceof xk ? (xk) sVar2 : null;
                        if (xkVar != null) {
                            arrayList2.add(xkVar);
                        }
                    }
                    cVar.f130632i = arrayList2;
                    cVar.q3();
                    cVar.f130640q = Integer.valueOf(i13);
                    cVar.f130637n = kh2.d.E(model);
                    kh khVar = model.f42858p;
                    if (khVar != null && (i14 = khVar.i()) != null) {
                        l1 l1Var = n1.Companion;
                        int intValue = i14.intValue();
                        l1Var.getClass();
                        n1Var = l1.a(intValue);
                    }
                    cVar.f130638o = n1Var;
                    cVar.f130639p = model.r0();
                    cVar.f130641r = model.u();
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    f0Var.G("Presenter bound to BubbleContainer must be of type BubbleContainerPresenter", new Object[0]);
                    break;
                }
                break;
            case 1:
                ?? view2 = (o21.d) nVar;
                h21.b model3 = (h21.b) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                View view3 = view2 instanceof View ? (View) view2 : null;
                if (view3 != null) {
                    ?? j13 = s1.j(view3);
                    fVar = j13 instanceof f ? j13 : null;
                }
                f fVar2 = fVar;
                if (fVar2 != null) {
                    f30 pin = model3.f66546a;
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    o21.b dimensions = model3.f66547b;
                    Intrinsics.checkNotNullParameter(dimensions, "dimensions");
                    fVar2.f98692a = pin;
                    fVar2.f98716y = dimensions;
                    boolean z14 = model3.f66548c;
                    fVar2.f98701j = z14;
                    ze1.a aVar = model3.f66549d;
                    fVar2.f98702k = aVar;
                    fVar2.t3(pin, dimensions, z14, aVar, fVar2.f98706o);
                    break;
                }
                break;
            case 2:
                SearchTypeaheadFilterCell view4 = (SearchTypeaheadFilterCell) nVar;
                br.d model4 = (br.d) obj;
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                if (!(view4 instanceof View)) {
                    view4 = null;
                }
                if (view4 != null) {
                    yk1.j.a().getClass();
                    ?? b14 = yk1.j.b(view4);
                    nVar2 = b14 instanceof o71.n ? b14 : null;
                }
                if (nVar2 != null) {
                    nVar2.f93352d = (String) this.f139600g;
                    nVar2.s3();
                    nVar2.f93355g = (Date) this.f139601h;
                    nVar2.f93351c = model4;
                    nVar2.s3();
                    q qVar = (q) this.f139602i;
                    nVar2.f93353e = qVar != null ? ((i) qVar).a(i13) : false;
                    nVar2.f93354f = i13;
                    break;
                }
                break;
            case 3:
                ?? view5 = (ld1.c) nVar;
                vh model5 = (vh) obj;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(model5, "model");
                View view6 = view5 instanceof View ? (View) view5 : null;
                if (view6 != null) {
                    ?? j14 = s1.j(view6);
                    gVar = j14 instanceof g ? j14 : null;
                }
                if (gVar != null) {
                    gVar.q3(model5, Integer.valueOf(i13), ((Boolean) ((Function0) this.f139600g).invoke()).booleanValue());
                    break;
                }
                break;
            default:
                ?? view7 = (dc0.i) nVar;
                final v7 model6 = (v7) obj;
                Intrinsics.checkNotNullParameter(view7, "view");
                Intrinsics.checkNotNullParameter(model6, "model");
                Resources resources = ((View) view7).getResources();
                wy0 wy0Var = (wy0) this.f139596c;
                Intrinsics.f(resources);
                o J0 = ph.a.J0(model6, wy0Var, resources, (wj0.a) this.f139597d, (d) this.f139598e, (ka2.a) this.f139600g, Integer.valueOf(i13), (Integer) this.f139601h, 64);
                LegoBoardRep legoBoardRep = (LegoBoardRep) view7;
                legoBoardRep.d0(J0);
                if (J0.f54348l) {
                    ka2.b bVar = (ka2.b) this.f139599f;
                    String id4 = model6.getId();
                    Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                    ph0 u13 = model6.u1();
                    bVar.B(id4, u13 != null ? u13.e() : null);
                }
                final ?? r35 = r34 == true ? 1 : 0;
                legoBoardRep.setOnClickListener(new View.OnClickListener(this) { // from class: ka2.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ yo0.a f78959b;

                    {
                        this.f78959b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view8) {
                        int i15 = r35;
                        int i16 = i13;
                        v7 model7 = model6;
                        yo0.a this$0 = this.f78959b;
                        switch (i15) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model7, "$model");
                                ((b) this$0.f139599f).K2(i16, model7);
                                ((Function1) this$0.f139602i).invoke(model7);
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model7, "$model");
                                ((b) this$0.f139599f).A2(i16, model7);
                                ((Function1) this$0.f139602i).invoke(model7);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model7, "$model");
                                ((b) this$0.f139599f).D2(i16, model7);
                                ((Function1) this$0.f139602i).invoke(model7);
                                break;
                        }
                    }
                });
                final int i15 = 1;
                legoBoardRep.f44728l.b(new ec0.b(new View.OnClickListener(this) { // from class: ka2.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ yo0.a f78959b;

                    {
                        this.f78959b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view8) {
                        int i152 = i15;
                        int i16 = i13;
                        v7 model7 = model6;
                        yo0.a this$0 = this.f78959b;
                        switch (i152) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model7, "$model");
                                ((b) this$0.f139599f).K2(i16, model7);
                                ((Function1) this$0.f139602i).invoke(model7);
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model7, "$model");
                                ((b) this$0.f139599f).A2(i16, model7);
                                ((Function1) this$0.f139602i).invoke(model7);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model7, "$model");
                                ((b) this$0.f139599f).D2(i16, model7);
                                ((Function1) this$0.f139602i).invoke(model7);
                                break;
                        }
                    }
                }, legoBoardRep, r33 == true ? 1 : 0));
                final int i16 = 2;
                legoBoardRep.f44730n.j(new ec0.b(new View.OnClickListener(this) { // from class: ka2.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ yo0.a f78959b;

                    {
                        this.f78959b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view8) {
                        int i152 = i16;
                        int i162 = i13;
                        v7 model7 = model6;
                        yo0.a this$0 = this.f78959b;
                        switch (i152) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model7, "$model");
                                ((b) this$0.f139599f).K2(i162, model7);
                                ((Function1) this$0.f139602i).invoke(model7);
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model7, "$model");
                                ((b) this$0.f139599f).A2(i162, model7);
                                ((Function1) this$0.f139602i).invoke(model7);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(model7, "$model");
                                ((b) this$0.f139599f).D2(i162, model7);
                                ((Function1) this$0.f139602i).invoke(model7);
                                break;
                        }
                    }
                }, legoBoardRep, i15));
                legoBoardRep.setOnLongClickListener(new we1.n(this, model6, i13));
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        int i13 = this.f139594a;
        Object obj = this.f139597d;
        Object obj2 = this.f139599f;
        Object obj3 = this.f139596c;
        Object obj4 = this.f139595b;
        switch (i13) {
            case 0:
                return new c((uk1.d) obj4, (uj2.q) obj3, (x2) obj, (String) this.f139598e, (l) obj2, (c91.f) this.f139600g, (g0) this.f139601h, (Function1) this.f139602i);
            case 1:
                uk1.d dVar = (uk1.d) obj4;
                HashMap hashMap = (HashMap) obj2;
                g0 f13 = dVar.f();
                return new f(null, 0, hashMap, (u0) this.f139598e, (d0) obj, (d1) this.f139600g, null, false, null, f13, null, null, null, dVar, (uj2.q) obj3, false, null, false, false, (b0) this.f139601h, (ur.a) this.f139602i, 8187747);
            case 2:
                return new o71.n((uk1.d) obj4, (uj2.q) obj3, (p) obj, (w) obj2);
            case 3:
                return new g((uk1.d) obj4, (uj2.q) obj3, (ze1.c) obj2, ((Boolean) ((Function0) this.f139600g).invoke()).booleanValue(), (String) this.f139598e, (Function0) this.f139601h, (nx.f0) this.f139602i);
            default:
                return null;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f139594a) {
            case 0:
                s model = (s) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                return null;
            case 1:
                h21.b model2 = (h21.b) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                return null;
            case 2:
                br.d model3 = (br.d) obj;
                Intrinsics.checkNotNullParameter(model3, "model");
                return null;
            case 3:
                vh model4 = (vh) obj;
                Intrinsics.checkNotNullParameter(model4, "model");
                v vVar = (v) this.f139597d;
                int i14 = e62.a.domain_carousel_module_description;
                Object[] objArr = new Object[1];
                kj kjVar = model4.f42855m;
                objArr[0] = kjVar != null ? kjVar.a() : null;
                return ((yk1.a) vVar).f139224a.getString(i14, objArr);
            default:
                v7 model5 = (v7) obj;
                Intrinsics.checkNotNullParameter(model5, "model");
                return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(uk1.d dVar, uj2.q qVar, x2 x2Var, String str, i1.h hVar, c91.f fVar, int i13) {
        this(dVar, qVar, x2Var, (i13 & 8) != 0 ? "homefeed_bubble" : str, (i13 & 16) != 0 ? null : hVar, (i13 & 32) != 0 ? null : fVar, (g0) null, (Function1) null);
        this.f139594a = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(uk1.d dVar, uj2.q qVar, v vVar, ze1.c cVar) {
        this(dVar, qVar, vVar, cVar, (String) null, ld1.d.f82977i, (nx.f0) null);
        this.f139594a = 3;
    }

    public a(uk1.d pinalytics, uj2.q networkStateStream, v viewResources, ze1.c apiParams, String str, Function0 commerceAuxData, nx.f0 f0Var) {
        j81.b verifiedMerchantStatusProvider = j81.b.f74932k;
        this.f139594a = 3;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(verifiedMerchantStatusProvider, "verifiedMerchantStatusProvider");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        this.f139595b = pinalytics;
        this.f139596c = networkStateStream;
        this.f139597d = viewResources;
        this.f139599f = apiParams;
        this.f139600g = verifiedMerchantStatusProvider;
        this.f139598e = str;
        this.f139601h = commerceAuxData;
        this.f139602i = f0Var;
    }

    public a(o3 pinActionHandler, uk1.d presenterPinalytics, uj2.q networkStateStream, u0 u0Var, HashMap hashMap, d1 trackingParamAttacher, b0 pinAuxHelper, ur.a adsCoreDependencies) {
        this.f139594a = 1;
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f139597d = pinActionHandler;
        this.f139595b = presenterPinalytics;
        this.f139596c = networkStateStream;
        this.f139598e = u0Var;
        this.f139599f = hashMap;
        this.f139600g = trackingParamAttacher;
        this.f139601h = pinAuxHelper;
        this.f139602i = adsCoreDependencies;
    }

    public a(Function1 clickHandler, Function2 longClickHandler, wy0 wy0Var, wj0.a aVar, d fuzzyDateFormatter, ka2.b boardActionsAnalytics, ka2.a boardPreviewConfig, Integer num) {
        this.f139594a = 4;
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        Intrinsics.checkNotNullParameter(longClickHandler, "longClickHandler");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(boardActionsAnalytics, "boardActionsAnalytics");
        Intrinsics.checkNotNullParameter(boardPreviewConfig, "boardPreviewConfig");
        this.f139602i = clickHandler;
        this.f139595b = longClickHandler;
        this.f139596c = wy0Var;
        this.f139597d = aVar;
        this.f139598e = fuzzyDateFormatter;
        this.f139599f = boardActionsAnalytics;
        this.f139600g = boardPreviewConfig;
        this.f139601h = num;
    }

    public a(uk1.d presenterPinalytics, uj2.q networkStateStream, p searchTypeaheadListener, w eventManager) {
        this.f139594a = 2;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(searchTypeaheadListener, "searchTypeaheadListener");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f139595b = presenterPinalytics;
        this.f139596c = networkStateStream;
        this.f139597d = searchTypeaheadListener;
        this.f139599f = eventManager;
        this.f139598e = "";
        this.f139600g = "";
    }

    public a(uk1.d presenterPinalytics, uj2.q networkStateStream, x2 userRepository, String defaultReferrerSource, l lVar, c91.f fVar, g0 g0Var, Function1 function1) {
        this.f139594a = 0;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(defaultReferrerSource, "defaultReferrerSource");
        this.f139595b = presenterPinalytics;
        this.f139596c = networkStateStream;
        this.f139597d = userRepository;
        this.f139598e = defaultReferrerSource;
        this.f139599f = lVar;
        this.f139600g = fVar;
        this.f139601h = g0Var;
        this.f139602i = function1;
    }
}
