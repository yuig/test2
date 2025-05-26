package q71;

import com.pinterest.feature.search.typeahead.view.SearchTypeaheadHashtagCell;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102793i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SearchTypeaheadHashtagCell f102794j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(SearchTypeaheadHashtagCell searchTypeaheadHashtagCell, int i13) {
        super(0);
        this.f102793i = i13;
        this.f102794j = searchTypeaheadHashtagCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SearchTypeaheadHashtagCell searchTypeaheadHashtagCell = this.f102794j;
        int i13 = this.f102793i;
        switch (i13) {
            case 0:
                switch (i13) {
                }
            default:
                switch (i13) {
                }
        }
        return (GestaltText) searchTypeaheadHashtagCell.findViewById(k42.d.pin_count);
    }
}
