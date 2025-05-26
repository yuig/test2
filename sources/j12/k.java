package j12;

import com.pinterest.api.model.BoardSectionFeed;
import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.ga;
import com.pinterest.api.model.la;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.o;
import sq2.p;
import sq2.s;
import sq2.t;
import sq2.y;
import uj2.b0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\bJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\rJ#\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010 J1\u0010$\u001a\u00020\u001e2\b\b\u0001\u0010!\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b&\u0010%J\u0019\u0010'\u001a\u00020\u001e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b+\u0010\u0017J%\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0)0\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b-\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, d2 = {"Lj12/k;", "", "", "boardSectionId", "fields", "Luj2/b0;", "Lcom/pinterest/api/model/ba;", "k", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "userSlug", "boardSlug", "sectionSlug", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "boardUid", "Lcom/pinterest/api/model/BoardSectionFeed;", "d", "pageSize", "Lcom/pinterest/api/model/DynamicFeed;", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "url", "b", "(Ljava/lang/String;)Luj2/b0;", "boardId", "boardSectionTitle", "initialPinIds", "j", "fromSectionId", "toSectionId", "Luj2/b;", "l", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "reorderedBoardSectionId", "sectionBeforeMovedSectionId", "sectionAfterMovedSectionId", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "f", "c", "(Ljava/lang/String;)Luj2/b;", "", "Lcom/pinterest/api/model/la;", "i", "Lcom/pinterest/api/model/ga;", "e", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface k {
    @sq2.f("board/sections/{userSlug}/{boardSlug}/{sectionSlug}/")
    @NotNull
    b0<ba> a(@s("userSlug") @NotNull String userSlug, @s("boardSlug") @NotNull String boardSlug, @s("sectionSlug") @NotNull String sectionSlug, @t("fields") @NotNull String fields);

    @sq2.f
    @NotNull
    b0<DynamicFeed> b(@NotNull @y String url);

    @sq2.b("board/sections/{boardSectionId}/")
    @NotNull
    uj2.b c(@s("boardSectionId") @NotNull String boardSectionId);

    @sq2.f("board/{boardUid}/sections/all/")
    @NotNull
    b0<BoardSectionFeed> d(@s("boardUid") @NotNull String boardUid, @t("fields") @NotNull String fields);

    @sq2.f("board/{boardId}/sections/title/recommendations/")
    @NotNull
    b0<List<ga>> e(@s("boardId") @NotNull String boardId);

    @p("board/sections/{boardSectionId}/")
    @NotNull
    @sq2.e
    uj2.b f(@s("boardSectionId") @NotNull String boardSectionId, @sq2.c("title") @NotNull String boardSectionTitle, @sq2.c("fields") @NotNull String fields);

    @o("board/sections/{reorderedBoardSectionId}/reorder/")
    @NotNull
    @sq2.e
    uj2.b g(@s("reorderedBoardSectionId") @NotNull String reorderedBoardSectionId, @sq2.c("section_before") String sectionBeforeMovedSectionId, @sq2.c("section_after") String sectionAfterMovedSectionId);

    @sq2.f("board/sections/{boardSectionId}/pins/")
    @NotNull
    b0<DynamicFeed> h(@s("boardSectionId") @NotNull String boardSectionId, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);

    @sq2.f("boards/sections/{boardSectionId}/tools/")
    @NotNull
    b0<List<la>> i(@s("boardSectionId") @NotNull String boardSectionId);

    @p("board/{boardId}/sections/")
    @NotNull
    @sq2.e
    b0<ba> j(@s("boardId") @NotNull String boardId, @sq2.c("title") @NotNull String boardSectionTitle, @sq2.c("initial_pins") @NotNull String initialPinIds, @sq2.c("fields") @NotNull String fields);

    @sq2.f("board/sections/{boardSectionId}/")
    @NotNull
    b0<ba> k(@s("boardSectionId") @NotNull String boardSectionId, @t("fields") @NotNull String fields);

    @o("board/sections/{fromSectionId}/merge/{toSectionId}/")
    @NotNull
    uj2.b l(@s("fromSectionId") @NotNull String fromSectionId, @s("toSectionId") @NotNull String toSectionId);
}
