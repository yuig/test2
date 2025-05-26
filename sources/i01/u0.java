package i01;

import com.pinterest.api.model.ow;
import com.pinterest.api.model.vh;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.feature.pin.closeup.datasource.k f70694a;

    /* renamed from: b, reason: collision with root package name */
    public final com.pinterest.feature.pin.closeup.datasource.l f70695b;

    /* renamed from: c, reason: collision with root package name */
    public final x f70696c;

    /* renamed from: d, reason: collision with root package name */
    public final ow f70697d;

    /* renamed from: e, reason: collision with root package name */
    public final d12.i f70698e;

    public u0(com.pinterest.feature.pin.closeup.datasource.k relatedModulesFetchedList, com.pinterest.feature.pin.closeup.datasource.l relatedPinsPagedList, PinCloseupPresenter relatedPinsFiltersStoryListener, ow modelStorage, d12.i repositoryBatcher) {
        Intrinsics.checkNotNullParameter(relatedModulesFetchedList, "relatedModulesFetchedList");
        Intrinsics.checkNotNullParameter(relatedPinsPagedList, "relatedPinsPagedList");
        Intrinsics.checkNotNullParameter(relatedPinsFiltersStoryListener, "relatedPinsFiltersStoryListener");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        this.f70694a = relatedModulesFetchedList;
        this.f70695b = relatedPinsPagedList;
        this.f70696c = relatedPinsFiltersStoryListener;
        this.f70697d = modelStorage;
        this.f70698e = repositoryBatcher;
    }

    public final ek2.f a(vd0.c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (!this.f70695b.d().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object a13 = vd0.c.a(json.f125623a.v("data"));
        vd0.a aVar = a13 instanceof vd0.a ? (vd0.a) a13 : null;
        if (aVar != null) {
            Iterator it = aVar.iterator();
            while (it.hasNext()) {
                vd0.c cVar = (vd0.c) it.next();
                String o13 = cVar.o("type", "");
                Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
                if (Intrinsics.d(o13, "pin")) {
                    break;
                }
                if (Intrinsics.d(o13, "story")) {
                    vh vhVar = (vh) gh0.b.N().d(cVar);
                    String q13 = vhVar.q();
                    Intrinsics.checkNotNullExpressionValue(q13, "getStoryType(...)");
                    arrayList2.add(new s0(q13, vhVar.f42865w.size()));
                    String q14 = vhVar.q();
                    if (q14 != null) {
                        int hashCode = q14.hashCode();
                        x xVar = this.f70696c;
                        if (hashCode != -1809295830) {
                            if (hashCode != -779586953) {
                                if (hashCode == 957308984 && q14.equals("related_pins_filter_tabs")) {
                                    xVar.onRelatedPinsFiltersStoryLoaded(vhVar);
                                    o10.d.f92771a.getClass();
                                    ow owVar = this.f70697d;
                                    o10.d.b(vhVar, owVar);
                                    d12.i.a(this.f70698e, owVar);
                                }
                            } else if (q14.equals("one_bar_related_pins")) {
                                xVar.onPinCloseupOneBarStoryLoaded(vhVar);
                                o10.d.f92771a.getClass();
                                ow owVar2 = this.f70697d;
                                o10.d.b(vhVar, owVar2);
                                d12.i.a(this.f70698e, owVar2);
                            }
                        } else if (q14.equals("SKIN_TONE_FILTER_QUERIES")) {
                            xVar.onSkinToneFiltersLoaded();
                            o10.d.f92771a.getClass();
                            ow owVar22 = this.f70697d;
                            o10.d.b(vhVar, owVar22);
                            d12.i.a(this.f70698e, owVar22);
                        }
                    }
                    arrayList.add(vhVar);
                    o10.d.f92771a.getClass();
                    ow owVar222 = this.f70697d;
                    o10.d.b(vhVar, owVar222);
                    d12.i.a(this.f70698e, owVar222);
                }
                aVar.f125618a.f91364a.remove(cVar.f125623a);
            }
        }
        if (aVar != null) {
            Iterator it2 = aVar.iterator();
            while (it2.hasNext()) {
                vd0.c cVar2 = (vd0.c) it2.next();
                String o14 = cVar2.o("type", "");
                Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
                if (Intrinsics.d(o14, "story")) {
                    String o15 = cVar2.o("story_type", "story_type_not_found");
                    Intrinsics.checkNotNullExpressionValue(o15, "optString(...)");
                    vd0.a c13 = cVar2.c("objects");
                    arrayList2.add(new s0(o15, c13 != null ? c13.d() : -1));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new fk2.g(new xo.c(this, arrayList2, arrayList, 13), 1).l(wj2.c.a()).i(new r0(0), new com.pinterest.feature.pin.i(3, t0.f70693i));
    }
}
