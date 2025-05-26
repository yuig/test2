package e12;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.o;
import sq2.p;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Le12/c;", "", "", "boardId", "Luj2/b0;", "Lt60/a;", "d", "(Ljava/lang/String;)Luj2/b0;", "pinIds", "boardSectionId", "", "isOneTapSave", "Luj2/b;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Luj2/b;", "a", "(Ljava/lang/String;)Luj2/b;", "partialReorderedBoardIds", "sortOrder", "e", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "clusterId", "deselectedPinIds", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface c {
    @sq2.b("pins/bulk/")
    @NotNull
    uj2.b a(@t(encoded = true, value = "pin_ids") @NotNull String pinIds);

    @p("pins/cluster/{cluster_id}/bulk/move/")
    @NotNull
    uj2.b b(@s("cluster_id") @NotNull String clusterId, @t("board_id") @NotNull String boardId, @t(encoded = true, value = "deselected_pin_ids") @NotNull String deselectedPinIds);

    @o("pins/bulk/move/")
    @NotNull
    uj2.b c(@t(encoded = true, value = "pin_ids") @NotNull String pinIds, @t("board_id") String boardId, @t("section_id") String boardSectionId, @t("is_one_tap_save") Boolean isOneTapSave);

    @f("boards/{board_id}/?fields=board.blocking_actions")
    @NotNull
    b0<t60.a> d(@s("board_id") @NotNull String boardId);

    @o("users/boards/partial_reorder/")
    @NotNull
    uj2.b e(@t(encoded = true, value = "board_ids") @NotNull String partialReorderedBoardIds, @t("fallback_sort") @NotNull String sortOrder);
}
