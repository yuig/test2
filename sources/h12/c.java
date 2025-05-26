package h12;

import com.pinterest.activity.board.model.CollaboratorInviteFeed;
import com.pinterest.api.model.BoardInviteFeed;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lh12/c;", "", "", "boardUid", "sort", "apiFields", "Luj2/b0;", "Lcom/pinterest/activity/board/model/CollaboratorInviteFeed;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "boardId", "Luj2/b;", "a", "(Ljava/lang/String;)Luj2/b;", "fields", "addFields", "pageSize", "Lcom/pinterest/api/model/BoardInviteFeed;", "b", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface c {
    @sq2.b("boards/{boardId}/collaborators/invite/me/")
    @NotNull
    uj2.b a(@s("boardId") @NotNull String boardId);

    @f("users/boards/collaborator_invites/")
    @NotNull
    b0<BoardInviteFeed> b(@t("fields") @NotNull String fields, @t("add_fields") @NotNull String addFields, @t("page_size") @NotNull String pageSize);

    @f("boards/{boardUid}/invites/")
    @NotNull
    b0<CollaboratorInviteFeed> c(@s("boardUid") @NotNull String boardUid, @t("sort") @NotNull String sort, @t("fields") @NotNull String apiFields);
}
