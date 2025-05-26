package ih1;

import com.pinterest.feature.unauth.sba.d0;
import java.util.ArrayList;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.h;
import xz.b;
import y30.d;
import y30.e;
import y30.g;
import y30.i;
import y30.j;
import y30.l;
import y30.m;
import y30.n;
import y30.o;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f72293i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterable<j> iterable;
        h response = (h) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            o oVar = (o) response.f99563c;
            d dVar = oVar != null ? oVar.f136760a : null;
            if (!(dVar instanceof n)) {
                return new xz.a(new Throwable("Invalid response data"));
            }
            e eVar = ((n) dVar).f136759e;
            Intrinsics.g(eVar, "null cannot be cast to non-null type com.pinterest.apollo.mobileMarketing.GetRecommendedTodayArticlesQuery.Data.V3RecommendedTodayArticlesV3RecommendedTodayArticlesQuery.V3RecommendedTodayArticlesDataConnectionContainerData");
            l lVar = ((m) eVar).f136757b;
            if (lVar == null || (iterable = lVar.f136754a) == null) {
                iterable = q0.f80391a;
            }
            ArrayList arrayList = new ArrayList();
            for (j jVar : iterable) {
                g gVar = jVar != null ? jVar.f136748a : null;
                i iVar = gVar instanceof i ? (i) gVar : null;
                d0 d0Var = (iVar == null || iVar.f136742c == null || iVar.f136743d == null || iVar.f136744e == null || iVar.f136745f.length() <= 0 || iVar.f136746g == null || iVar.f136747h == null) ? null : new d0(iVar);
                if (d0Var != null) {
                    arrayList.add(d0Var);
                }
            }
            return new b(arrayList);
        } catch (Exception e13) {
            return new xz.a(e13);
        }
    }
}
