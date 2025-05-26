package f12;

import com.pinterest.api.model.UserFeed;
import com.pinterest.api.model.k8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lf12/a;", "", "", "boardId", "fields", "", "pageSize", "Luj2/b0;", "Lcom/pinterest/api/model/UserFeed;", "b", "(Ljava/lang/String;Ljava/lang/String;I)Luj2/b0;", "userId", "Lcom/pinterest/api/model/k8;", "a", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {
    @f("boards/{boardId}/collaborators/invites/{userId}/")
    @NotNull
    b0<k8> a(@s("boardId") @NotNull String boardId, @s("userId") @NotNull String userId);

    @f("boards/{boardId}/collaborators/")
    @NotNull
    b0<UserFeed> b(@s("boardId") @NotNull String boardId, @t("fields") @NotNull String fields, @t("page_size") int pageSize);
}
