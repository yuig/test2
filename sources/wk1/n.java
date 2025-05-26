package wk1;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.d40;
import com.pinterest.api.model.f30;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import com.pinterest.framework.multisection.datasource.pagedlist.v;
import com.pinterest.framework.multisection.datasource.pagedlist.w;
import dl1.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.d1;
import nx.o0;
import org.jetbrains.annotations.NotNull;
import sq0.b0;
import sq0.c0;
import yq0.t;

/* loaded from: classes5.dex */
public abstract class n extends q implements nr0.d {

    @NotNull
    private final vr.a adsCommonAnalytics;

    @NotNull
    private final Map<w, np0.e> dynamicGridActionHandlers;
    private String feedSourceObjectId;
    private Boolean firstPageLoadSpinnerVisibilityOverride;
    private String firstPageStoriesMetadataOverride;

    @NotNull
    private final ky.e loadMorePWTLogger;

    @NotNull
    private final c params;

    @NotNull
    private xj2.b stateDisposable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c params) {
        super(params.f130130a, params.f130136g);
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
        this.dynamicGridActionHandlers = new LinkedHashMap();
        this.stateDisposable = new xj2.b();
        this.loadMorePWTLogger = params.f130135f;
        this.adsCommonAnalytics = params.f130141l;
    }

    public static final qr0.d access$convertToPaginatedModelFeed(n nVar, w wVar) {
        nVar.getClass();
        return new m(nVar, wVar);
    }

    public static final void access$updateTrackingParams(n nVar, List list) {
        o0 o0Var = nVar.params.f130132c;
        d0 pinalytics = nVar.getPinalytics();
        d1 d1Var = nVar.params.f130133d;
        o0Var.getClass();
        o0.l(pinalytics, d1Var, list);
    }

    @NotNull
    public List<s> convertToPlankModels(@NotNull List<? extends Object> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List<e> dataSources = getDataSources();
        if (!(dataSources instanceof Collection) || !dataSources.isEmpty()) {
            for (e eVar : dataSources) {
                if ((eVar instanceof com.pinterest.framework.multisection.datasource.pagedlist.s) || (eVar instanceof com.pinterest.framework.multisection.datasource.pagedlist.g)) {
                    vb0.j.f125466a.G("You must override convertToPlankModels in your Presenter", new Object[0]);
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof s) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public f30 convertToPlankPinModel(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        List<e> dataSources = getDataSources();
        if (!(dataSources instanceof Collection) || !dataSources.isEmpty()) {
            for (e eVar : dataSources) {
                if ((eVar instanceof com.pinterest.framework.multisection.datasource.pagedlist.s) || (eVar instanceof com.pinterest.framework.multisection.datasource.pagedlist.g)) {
                    vb0.j.f125466a.G("You must override convertToPlankPinModel in your Presenter", new Object[0]);
                    break;
                }
            }
        }
        if (obj instanceof f30) {
            return (f30) obj;
        }
        return null;
    }

    public final String getFeedSourceObjectId() {
        return this.feedSourceObjectId;
    }

    public final Boolean getFirstPageLoadSpinnerVisibilityOverride() {
        return this.firstPageLoadSpinnerVisibilityOverride;
    }

    public final String getFirstPageStoriesMetadataOverride() {
        return this.firstPageStoriesMetadataOverride;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wk1.q, yk1.p
    /* renamed from: onBind */
    public void r3(nr0.e view) {
        int i13;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        view.H(this);
        Iterator it = t3().iterator();
        while (true) {
            i13 = 1;
            if (!it.hasNext()) {
                break;
            }
            w wVar = (w) it.next();
            np0.e eVar = new np0.e(this.params.f130140k);
            this.dynamicGridActionHandlers.put(wVar, eVar);
            eVar.f91749b = view;
            this.stateDisposable.a(wVar.m().F(new l(0, new aw0.j(view, this, eVar, wVar, 22)), new l(i13, f.f130148o), ck2.i.f27923c, ck2.i.f27924d));
        }
        ((t) view).addItemVisibilityChangeListener(new px0.h(2, view, this));
        if (isBound()) {
            yk1.n view2 = getView();
            b0 b0Var = view2 instanceof b0 ? (b0) view2 : null;
            if (b0Var == null) {
                return;
            }
            b0Var.addItemVisibilityChangeListener(new px0.h(i13, this, b0Var));
        }
    }

    @Override // yk1.b
    public void onDeactivate() {
        this.loadMorePWTLogger.e();
    }

    public void onPinClicked(@NotNull f30 pin) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Iterator it = t3().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Iterator it2 = ((w) obj).d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if ((obj2 instanceof f30) && Intrinsics.d(((f30) obj2).getId(), pin.getId())) {
                    break;
                }
            }
            if (obj2 != null) {
                break;
            }
        }
        w wVar = (w) obj;
        if (wVar != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it3 = CollectionsKt.Q(wVar.d()).iterator();
            while (it3.hasNext()) {
                f30 convertToPlankPinModel = convertToPlankPinModel(it3.next());
                if (convertToPlankPinModel != null && b40.x(convertToPlankPinModel) == d40.NOT_HIDDEN) {
                    arrayList.add(convertToPlankPinModel);
                }
            }
            np0.e eVar = this.dynamicGridActionHandlers.get(wVar);
            if (eVar != null) {
                eVar.a(pin, arrayList, wVar.w2(), ((is1.t) this.params.f130142m).a(pin));
                return;
            }
        }
        c cVar = this.params;
        new np0.e(cVar.f130140k).a(pin, q0.f80391a, null, ((is1.t) cVar.f130142m).a(pin));
    }

    @Override // wk1.q, yk1.p, yk1.b
    public void onUnbind() {
        this.stateDisposable.d();
        Iterator<T> it = this.dynamicGridActionHandlers.values().iterator();
        while (it.hasNext()) {
            ((np0.e) it.next()).f91749b = null;
        }
        super.onUnbind();
    }

    public final void setFeedSourceObjectId(String str) {
        this.feedSourceObjectId = str;
    }

    public final void setFirstPageLoadSpinnerVisibilityOverride(Boolean bool) {
        this.firstPageLoadSpinnerVisibilityOverride = bool;
    }

    public final void setFirstPageStoriesMetadataOverride(String str) {
        this.firstPageStoriesMetadataOverride = str;
    }

    public final ArrayList t3() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : getDataSources()) {
            if (eVar instanceof w) {
                arrayList.add(eVar);
            } else if (eVar instanceof v) {
                r0 r0Var = ((v) eVar).f49190a;
                w wVar = r0Var instanceof w ? (w) r0Var : null;
                if (wVar != null) {
                    arrayList.add(wVar);
                }
            }
        }
        return arrayList;
    }
}
