package fd1;

import android.widget.LinearLayout;
import com.pinterest.feature.board.permissions.cell.view.BoardPermissionSettingCell;
import com.pinterest.feature.sharesheet.view.SharesheetBoardPreviewContainer;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppListView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61879i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f61880j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i13) {
        super(0);
        this.f61879i = i13;
        this.f61880j = d0Var;
    }

    public final GestaltText b() {
        int i13 = this.f61879i;
        d0 d0Var = this.f61880j;
        switch (i13) {
            case 0:
                return (GestaltText) d0Var.findViewById(b62.b.share_invite_link_title);
            case 1:
            default:
                return (GestaltText) d0Var.findViewById(j70.a.board_permission_setting_cell_header);
            case 2:
                return (GestaltText) d0Var.findViewById(b62.b.share_to_title);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f61879i;
        d0 d0Var = this.f61880j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return (SharesheetModalAppListView) d0Var.findViewById(b62.b.app_container_exp);
            case 2:
                return b();
            case 3:
                return (BoardPermissionSettingCell) d0Var.findViewById(j70.a.board_permission_setting_cell);
            case 4:
                return b();
            case 5:
                return (LinearLayout) d0Var.findViewById(j70.a.board_permission_setting_cell_container);
            default:
                return (SharesheetBoardPreviewContainer) d0Var.findViewById(b62.b.share_board_preview_container);
        }
    }
}
