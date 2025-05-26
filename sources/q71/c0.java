package q71;

import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPeopleCell;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102702i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SearchTypeaheadPeopleCell f102703j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(SearchTypeaheadPeopleCell searchTypeaheadPeopleCell, int i13) {
        super(0);
        this.f102702i = i13;
        this.f102703j = searchTypeaheadPeopleCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f102702i;
        SearchTypeaheadPeopleCell searchTypeaheadPeopleCell = this.f102703j;
        switch (i13) {
            case 0:
                return (GestaltButton) searchTypeaheadPeopleCell.findViewById(k42.d.cell_add_cta);
            case 1:
                switch (i13) {
                    case 1:
                        return (GestaltText) searchTypeaheadPeopleCell.findViewById(k42.d.cell_desc);
                    default:
                        return (GestaltText) searchTypeaheadPeopleCell.findViewById(k42.d.cell_title);
                }
            case 2:
                return (GestaltAvatar) searchTypeaheadPeopleCell.findViewById(k42.d.cell_image);
            default:
                switch (i13) {
                    case 1:
                        return (GestaltText) searchTypeaheadPeopleCell.findViewById(k42.d.cell_desc);
                    default:
                        return (GestaltText) searchTypeaheadPeopleCell.findViewById(k42.d.cell_title);
                }
        }
    }
}
