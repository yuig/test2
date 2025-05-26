package q71;

import com.pinterest.feature.search.typeahead.view.SearchTypeaheadFilterCell;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements d71.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchTypeaheadFilterCell f102759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lb0.q f102760b;

    public r(SearchTypeaheadFilterCell searchTypeaheadFilterCell, lb0.q qVar) {
        this.f102759a = searchTypeaheadFilterCell;
        this.f102760b = qVar;
    }

    @Override // d71.f
    public final void n() {
        lb0.q qVar = this.f102760b;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.remove("PREF_SKIN_TONE_SELECTION");
    }

    @Override // d71.f
    public final void o(e71.a skinTone, int i13) {
        o71.n nVar;
        Intrinsics.checkNotNullParameter(skinTone, "skinTone");
        String term = skinTone.getTerm();
        if (term == null || (nVar = this.f102759a.f47849d) == null) {
            return;
        }
        nVar.r3(term);
    }
}
