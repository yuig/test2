package lx1;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.q;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85069i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Resources f85070j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13, Resources resources) {
        super(1);
        this.f85069i = i13;
        this.f85070j = resources;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f85069i;
        Resources resources = this.f85070j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, new rm1.d(new rm1.f(q.SORT_DESCENDING, rm1.i.XS), null, null, 0, null, 30), null, false, 0, d7.g.q(resources, com.pinterest.partnerAnalytics.g.audience_insights_accessibility_sort_by_audience, "getString(...)"), null, null, null, null, false, null, null, 2092799);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, d7.g.q(resources, com.pinterest.partnerAnalytics.g.audience_insights_accessibility_affinity, "getString(...)"), null, null, null, null, false, null, null, 2092799);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, d7.g.q(resources, com.pinterest.partnerAnalytics.g.audience_insights_accessibility_audience, "getString(...)"), null, null, null, null, false, null, null, 2092799);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, new rm1.d(new rm1.f(q.SORT_DESCENDING, rm1.i.XS), null, null, 0, null, 30), null, false, 0, d7.g.q(resources, com.pinterest.partnerAnalytics.g.audience_insights_accessibility_sort_by_affinity, "getString(...)"), null, null, null, null, false, null, null, 2092799);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, d7.g.q(resources, com.pinterest.partnerAnalytics.g.audience_insights_accessibility_audience, "getString(...)"), null, null, null, null, false, null, null, 2092799);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, d7.g.q(resources, com.pinterest.partnerAnalytics.g.audience_insights_accessibility_affinity, "getString(...)"), null, null, null, null, false, null, null, 2092799);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f85069i) {
        }
        return b((rn1.a) obj);
    }
}
