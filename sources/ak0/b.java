package ak0;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.feature.board.create.collaboratorview.view.BoardCreateAddCollaboratorsView;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15460i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BoardCreateAddCollaboratorsView f15461j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(BoardCreateAddCollaboratorsView boardCreateAddCollaboratorsView, int i13) {
        super(0);
        this.f15460i = i13;
        this.f15461j = boardCreateAddCollaboratorsView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f15460i;
        BoardCreateAddCollaboratorsView boardCreateAddCollaboratorsView = this.f15461j;
        switch (i13) {
            case 0:
                return (GestaltIconButton) boardCreateAddCollaboratorsView.findViewById(x60.c.add_collaborator_icon);
            case 1:
                switch (i13) {
                    case 1:
                        return (LinearLayout) boardCreateAddCollaboratorsView.findViewById(x60.c.invite_tap_container);
                    default:
                        return (LinearLayout) boardCreateAddCollaboratorsView.findViewById(x60.c.invite_upsell_container);
                }
            case 2:
                return (RelativeLayout) boardCreateAddCollaboratorsView.findViewById(x60.c.board_creation_contact_list_cell);
            case 3:
                switch (i13) {
                    case 1:
                        return (LinearLayout) boardCreateAddCollaboratorsView.findViewById(x60.c.invite_tap_container);
                    default:
                        return (LinearLayout) boardCreateAddCollaboratorsView.findViewById(x60.c.invite_upsell_container);
                }
            case 4:
                return (GestaltAvatarGroup) boardCreateAddCollaboratorsView.findViewById(x60.c.board_collaborators_avatar_group);
            default:
                return (PinterestRecyclerView) boardCreateAddCollaboratorsView.findViewById(x60.c.board_collaborator_contacts_list_p_recycler_view);
        }
    }
}
