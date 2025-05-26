package ix1;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xr;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.partnerAnalytics.components.barchart.BasicBarChartList;
import com.pinterest.partnerAnalytics.components.donutchart.DonutChartView;
import com.pinterest.partnerAnalytics.feature.audience.metadata.AudienceMetadataCard;
import com.pinterest.partnerAnalytics.feature.audience.top.categories.AudienceTopCategoriesView;
import com.pinterest.partnerAnalytics.feature.audience.top.locations.TopLocationsView;
import dl2.j;
import java.util.ArrayList;
import java.util.List;
import jx1.t;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f73792r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f73793s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f73793s = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f73793s, cVar);
        bVar.f73792r = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((jx1.e) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        gx1.f fVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        jx1.e eVar = (jx1.e) this.f73792r;
        boolean d2 = Intrinsics.d(eVar, jx1.a.f77677a);
        gx1.f fVar2 = null;
        f fVar3 = this.f73793s;
        if (d2) {
            GestaltSpinner gestaltSpinner = fVar3.f73803d0;
            if (gestaltSpinner == null) {
                Intrinsics.r("loadingView");
                throw null;
            }
            dl2.b.X2(gestaltSpinner, ln1.e.NONE);
        } else if (Intrinsics.d(eVar, jx1.b.f77678a)) {
            GestaltSpinner gestaltSpinner2 = fVar3.f73803d0;
            if (gestaltSpinner2 == null) {
                Intrinsics.r("loadingView");
                throw null;
            }
            dl2.b.X2(gestaltSpinner2, ln1.e.LOADING);
        } else if (eVar instanceof jx1.d) {
            jx1.d dVar = (jx1.d) eVar;
            gx1.e eVar2 = dVar.f77681a;
            AudienceMetadataCard audienceMetadataCard = fVar3.f73804e0;
            if (audienceMetadataCard == null) {
                Intrinsics.r("audienceMetadata");
                throw null;
            }
            audienceMetadataCard.f(eVar2.f66287c.f66292a);
            AudienceMetadataCard audienceMetadataCard2 = fVar3.f73804e0;
            if (audienceMetadataCard2 == null) {
                Intrinsics.r("audienceMetadata");
                throw null;
            }
            gx1.f fVar4 = eVar2.f66287c;
            audienceMetadataCard2.e(fVar4.f66293b);
            AudienceMetadataCard audienceMetadataCard3 = fVar3.f73804e0;
            if (audienceMetadataCard3 == null) {
                Intrinsics.r("audienceMetadata");
                throw null;
            }
            audienceMetadataCard3.g(eVar2.f66285a, eVar2.f66288d);
            AudienceMetadataCard audienceMetadataCard4 = fVar3.f73804e0;
            if (audienceMetadataCard4 == null) {
                Intrinsics.r("audienceMetadata");
                throw null;
            }
            audienceMetadataCard4.b(eVar2.f66286b, eVar2.f66289e);
            AudienceMetadataCard audienceMetadataCard5 = fVar3.f73804e0;
            if (audienceMetadataCard5 == null) {
                Intrinsics.r("audienceMetadata");
                throw null;
            }
            audienceMetadataCard5.c(fVar4.f66298g);
            if (dVar.f77682b) {
                BasicBarChartList basicBarChartList = fVar3.f73805f0;
                if (basicBarChartList == null) {
                    Intrinsics.r("audienceAgeCard");
                    throw null;
                }
                bs1.c.U1(basicBarChartList);
                BasicBarChartList basicBarChartList2 = fVar3.f73805f0;
                if (basicBarChartList2 == null) {
                    Intrinsics.r("audienceAgeCard");
                    throw null;
                }
                basicBarChartList2.a(fVar4.f66295d);
                DonutChartView donutChartView = fVar3.f73806g0;
                if (donutChartView == null) {
                    Intrinsics.r("audienceGenderCard");
                    throw null;
                }
                bs1.c.U1(donutChartView);
                DonutChartView donutChartView2 = fVar3.f73806g0;
                if (donutChartView2 == null) {
                    Intrinsics.r("audienceGenderCard");
                    throw null;
                }
                String string = fVar3.getString(com.pinterest.partnerAnalytics.g.audience_insights_gender_label);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                List<mw1.e> list = fVar4.f66296e;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                for (mw1.e eVar3 : list) {
                    Context requireContext = fVar3.requireContext();
                    int i13 = eVar3.f88430c;
                    Object obj2 = d5.a.f53679a;
                    arrayList.add(mw1.e.a(eVar3, requireContext.getColor(i13)));
                }
                donutChartView2.a(string, fVar3.getString(com.pinterest.partnerAnalytics.g.audience_insights_gender_disclaimer), arrayList);
                BasicBarChartList basicBarChartList3 = fVar3.f73807h0;
                if (basicBarChartList3 == null) {
                    Intrinsics.r("audienceDeviceCard");
                    throw null;
                }
                bs1.c.U1(basicBarChartList3);
                BasicBarChartList basicBarChartList4 = fVar3.f73807h0;
                if (basicBarChartList4 == null) {
                    Intrinsics.r("audienceDeviceCard");
                    throw null;
                }
                basicBarChartList4.a(fVar4.f66299h);
                AudienceTopCategoriesView audienceTopCategoriesView = fVar3.f73808i0;
                if (audienceTopCategoriesView == null) {
                    Intrinsics.r("topCategoriesCard");
                    throw null;
                }
                int i14 = 0;
                audienceTopCategoriesView.setVisibility(eVar2.f66290f ? 0 : 8);
                AudienceTopCategoriesView audienceTopCategoriesView2 = fVar3.f73808i0;
                if (audienceTopCategoriesView2 == null) {
                    Intrinsics.r("topCategoriesCard");
                    throw null;
                }
                audienceTopCategoriesView2.a(fVar4.f66300i.f88472b);
                AudienceTopCategoriesView audienceTopCategoriesView3 = fVar3.f73808i0;
                if (audienceTopCategoriesView3 == null) {
                    Intrinsics.r("topCategoriesCard");
                    throw null;
                }
                audienceTopCategoriesView3.b(new e(fVar3, eVar2, i14));
                TopLocationsView topLocationsView = fVar3.f73809j0;
                if (topLocationsView == null) {
                    Intrinsics.r("topLocationsCard");
                    throw null;
                }
                bs1.c.U1(topLocationsView);
                TopLocationsView topLocationsView2 = fVar3.f73809j0;
                if (topLocationsView2 == null) {
                    Intrinsics.r("topLocationsCard");
                    throw null;
                }
                topLocationsView2.f50157b = Integer.valueOf(fVar3.f73810k0);
                TopLocationsView topLocationsView3 = fVar3.f73809j0;
                if (topLocationsView3 == null) {
                    Intrinsics.r("topLocationsCard");
                    throw null;
                }
                topLocationsView3.d(new e(fVar3, eVar2, 1));
                TopLocationsView topLocationsView4 = fVar3.f73809j0;
                if (topLocationsView4 == null) {
                    Intrinsics.r("topLocationsCard");
                    throw null;
                }
                topLocationsView4.a(fVar4.f66301j);
            } else {
                BasicBarChartList basicBarChartList5 = fVar3.f73805f0;
                if (basicBarChartList5 == null) {
                    Intrinsics.r("audienceAgeCard");
                    throw null;
                }
                bs1.c.X0(basicBarChartList5);
                DonutChartView donutChartView3 = fVar3.f73806g0;
                if (donutChartView3 == null) {
                    Intrinsics.r("audienceGenderCard");
                    throw null;
                }
                bs1.c.X0(donutChartView3);
                BasicBarChartList basicBarChartList6 = fVar3.f73807h0;
                if (basicBarChartList6 == null) {
                    Intrinsics.r("audienceDeviceCard");
                    throw null;
                }
                bs1.c.X0(basicBarChartList6);
                AudienceTopCategoriesView audienceTopCategoriesView4 = fVar3.f73808i0;
                if (audienceTopCategoriesView4 == null) {
                    Intrinsics.r("topCategoriesCard");
                    throw null;
                }
                bs1.c.X0(audienceTopCategoriesView4);
                TopLocationsView topLocationsView5 = fVar3.f73809j0;
                if (topLocationsView5 == null) {
                    Intrinsics.r("topLocationsCard");
                    throw null;
                }
                bs1.c.X0(topLocationsView5);
            }
            GestaltSpinner gestaltSpinner3 = fVar3.f73803d0;
            if (gestaltSpinner3 == null) {
                Intrinsics.r("loadingView");
                throw null;
            }
            dl2.b.X2(gestaltSpinner3, ln1.e.LOADED);
        } else if (eVar instanceof jx1.c) {
            jx1.c cVar = (jx1.c) eVar;
            xr xrVar = cVar.f77679a;
            int i15 = f.f73801m0;
            wy0 f13 = ((b60.d) fVar3.getActiveUserManager()).f();
            String G2 = f13 != null ? f13.G2() : null;
            if (xrVar != null) {
                Resources resources = fVar3.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                fVar = c0.d.l2(xrVar, resources, G2);
            } else {
                fVar = null;
            }
            xr xrVar2 = cVar.f77680b;
            if (xrVar2 != null) {
                Resources resources2 = fVar3.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                fVar2 = c0.d.l2(xrVar2, resources2, G2);
            }
            kh2.j.x2((t) fVar3.f73802c0.getValue(), new jx1.j(fVar, fVar2));
        }
        return Unit.f80348a;
    }
}
