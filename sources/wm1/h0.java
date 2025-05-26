package wm1;

import android.content.res.Resources;
import com.pinterest.gestalt.listAction.GestaltListAction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130301i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltListAction f130302j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(GestaltListAction gestaltListAction, int i13) {
        super(0);
        this.f130301i = i13;
        this.f130302j = gestaltListAction;
    }

    public final Integer b() {
        int i13 = this.f130301i;
        GestaltListAction gestaltListAction = this.f130302j;
        switch (i13) {
            case 0:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_custom_slot_height));
            case 1:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_custom_slot_width));
            case 2:
            case 20:
            default:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_header_subheader_gap));
            case 3:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_checkbox_vertical_padding));
            case 4:
                return Integer.valueOf(gestaltListAction.getResources().getDimensionPixelSize(eo1.c.space_300));
            case 5:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_end_icon_start_padding));
            case 6:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_end_icon_vertical_padding));
            case 7:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_end_item_max_width));
            case 8:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_selected_vertical_padding));
            case 9:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_switch_vertical_padding));
            case 10:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_end_text_icon_gap));
            case 11:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_title_start_padding));
            case 12:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_title_padding));
            case 13:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_indicator_end_padding));
            case 14:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_indicator_start_padding));
            case 15:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_indicator_top_padding));
            case 16:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_right_padding));
            case 17:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_min_height));
            case 18:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_startitem_icon_padding));
            case 19:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_icon_vertical_padding));
            case 21:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_startitem_image_size));
            case 22:
                return Integer.valueOf(dl2.b.G0(gestaltListAction, eo1.a.comp_listaction_subheader_bottom_margin));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f130301i;
        GestaltListAction gestaltListAction = this.f130302j;
        switch (i13) {
            case 2:
                Resources resources = gestaltListAction.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                break;
        }
        return b();
    }
}
