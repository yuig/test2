package q71;

import android.widget.FrameLayout;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadTextCell;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102736i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SearchTypeaheadTextCell f102737j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(SearchTypeaheadTextCell searchTypeaheadTextCell, int i13) {
        super(0);
        this.f102736i = i13;
        this.f102737j = searchTypeaheadTextCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f102736i;
        SearchTypeaheadTextCell searchTypeaheadTextCell = this.f102737j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return (GestaltIconButton) searchTypeaheadTextCell.findViewById(n42.c.cell_autofill);
                    default:
                        return (GestaltIconButton) searchTypeaheadTextCell.findViewById(n42.c.cell_clear);
                }
            case 1:
                switch (i13) {
                    case 0:
                        return (GestaltIconButton) searchTypeaheadTextCell.findViewById(n42.c.cell_autofill);
                    default:
                        return (GestaltIconButton) searchTypeaheadTextCell.findViewById(n42.c.cell_clear);
                }
            case 2:
                switch (i13) {
                    case 2:
                        return (GestaltText) searchTypeaheadTextCell.findViewById(n42.c.cell_description);
                    default:
                        return (GestaltText) searchTypeaheadTextCell.findViewById(n42.c.cell_title);
                }
            case 3:
                return (FrameLayout) searchTypeaheadTextCell.findViewById(n42.c.image_container);
            case 4:
                return (WebImageView) searchTypeaheadTextCell.findViewById(n42.c.cell_image);
            case 5:
                return (GestaltIcon) searchTypeaheadTextCell.findViewById(n42.c.cell_icon);
            default:
                switch (i13) {
                    case 2:
                        return (GestaltText) searchTypeaheadTextCell.findViewById(n42.c.cell_description);
                    default:
                        return (GestaltText) searchTypeaheadTextCell.findViewById(n42.c.cell_title);
                }
        }
    }
}
