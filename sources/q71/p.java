package q71;

import com.pinterest.feature.search.typeahead.view.SearchTypeaheadBoardCell;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102734i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SearchTypeaheadBoardCell f102735j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(SearchTypeaheadBoardCell searchTypeaheadBoardCell, int i13) {
        super(0);
        this.f102734i = i13;
        this.f102735j = searchTypeaheadBoardCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SearchTypeaheadBoardCell searchTypeaheadBoardCell = this.f102735j;
        int i13 = this.f102734i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return (GestaltText) searchTypeaheadBoardCell.findViewById(n42.c.cell_desc);
                    default:
                        return (GestaltText) searchTypeaheadBoardCell.findViewById(n42.c.cell_title);
                }
            case 1:
                return (ProportionalImageView) searchTypeaheadBoardCell.findViewById(n42.c.cell_image);
            default:
                switch (i13) {
                    case 0:
                        return (GestaltText) searchTypeaheadBoardCell.findViewById(n42.c.cell_desc);
                    default:
                        return (GestaltText) searchTypeaheadBoardCell.findViewById(n42.c.cell_title);
                }
        }
    }
}
