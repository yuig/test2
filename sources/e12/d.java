package e12;

import com.google.android.gms.ads.RequestConfiguration;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.la;
import com.pinterest.api.model.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.o;
import sq2.p;
import sq2.s;
import sq2.t;
import sq2.y;
import uj2.b0;
import uj2.l;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\bJ3\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJT\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001d\u0010\u0017J*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\"\u001a\u00020\u0002H'¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00052\b\b\u0001\u0010\"\u001a\u00020\u0002H'¢\u0006\u0004\b&\u0010$J1\u0010*\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b,\u0010-J/\u00100\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u00022\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b0\u0010+J/\u00102\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00101\u001a\u00020\u00022\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b2\u0010+J-\u00105\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u00020\u0002H'¢\u0006\u0004\b5\u0010+J\u0019\u00106\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b6\u0010-J\u0019\u00107\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b7\u0010-J\u0019\u00108\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b8\u0010-J3\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060;2\b\b\u0001\u00109\u001a\u00020\u00022\b\b\u0001\u0010:\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b<\u0010=J{\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010>\u001a\u00020\u00022\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010@\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020\u00022\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010E\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010G\u001a\u0004\u0018\u00010FH'¢\u0006\u0004\bH\u0010IJy\u0010K\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010J\u001a\u0004\u0018\u00010FH'¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bM\u0010-J\u0019\u0010N\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bN\u0010-JE\u0010R\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010:\u001a\u00020\u00022\n\b\u0001\u0010P\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010Q\u001a\u00020\u0002H'¢\u0006\u0004\bR\u0010SJ;\u0010W\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010T\u001a\u00020\u00022\n\b\u0001\u0010U\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010V\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bW\u0010XJ%\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b[\u0010$J0\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y0\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\\\u001a\u00020FH§@¢\u0006\u0004\b]\u0010^Jb\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020e0\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010T\u001a\u00020\u00022\b\b\u0001\u0010`\u001a\u00020_2\b\b\u0001\u0010a\u001a\u00020_2\b\b\u0001\u0010b\u001a\u00020_2\b\b\u0001\u0010c\u001a\u00020_2\b\b\u0001\u0010d\u001a\u00020\u0002H§@¢\u0006\u0004\bf\u0010gJ\u0019\u0010h\u001a\u00020)2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bh\u0010-Jn\u0010m\u001a\b\u0012\u0004\u0012\u00020l0\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010i\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bm\u0010nJx\u0010r\u001a\b\u0012\u0004\u0012\u00020l0\u00122\b\b\u0001\u0010T\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010o\u001a\u00020\u000f2\b\b\u0001\u0010p\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010i\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\br\u0010sJX\u0010v\u001a\b\u0012\u0004\u0012\u00020l0\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bv\u0010wJ*\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\bx\u0010!Jd\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010i\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010y\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bz\u0010{JL\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b|\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006}À\u0006\u0001"}, d2 = {"Le12/d;", "", "", "boardId", "fields", "Luj2/b0;", "Lcom/pinterest/api/model/v7;", "h", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "J", "pageSize", "Lcom/pinterest/api/model/DynamicFeed;", "z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "bookmark", "", "filterSectionPins", "filterStories", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLbl2/c;)Ljava/lang/Object;", "Lo12/b;", "A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "filterType", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "H", "reasonKey", "", "E", "(Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "url", "b", "(Ljava/lang/String;)Luj2/b0;", "Lcom/pinterest/api/model/BoardFeed;", "a", "sectionId", "pinIdsToExcludeFromSelectAll", "Luj2/b;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "m", "(Ljava/lang/String;)Luj2/b;", "emails", "message", "x", "collaborator_ids", "r", "userIds", "banUser", "w", "v", "d", "s", "sourceBoardId", "destinationBoardId", "Luj2/l;", "t", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/l;", "boardName", "category", "description", "privacy", "allowHomeFeedRecommendations", "allowCollabInvite", "allowRequestToJoin", "boardLayout", "", "source", "B", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)Luj2/b0;", "collaboratorPermissionsSetting", "I", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Luj2/b;", "i", "D", "originBoardSectionId", "destinationBoardSectionId", "selectAllExcludePinIds", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "pinId", "pinBeforeMovedPinId", "pinAftereMovedPinId", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "", "Lcom/pinterest/api/model/la;", "c", "viewType", "l", "(Ljava/lang/String;ILbl2/c;)Ljava/lang/Object;", "", "cropX", "cropY", "width", "height", "imageUrl", "Ltt1/a;", "F", "(Ljava/lang/String;Ljava/lang/String;FFFFLjava/lang/String;Lbl2/c;)Ljava/lang/Object;", "o", "boardSessionId", "requestParams", "appliedFilters", "Lvd0/c;", "C", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "is_shopping", "cropSource", "entrypoint", "f", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "productCategoryId", "stlIds", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "j", "feedType", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "p", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface d {
    @f("boards/{boardId}/pins/")
    Object A(@s("boardId") @NotNull String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @p("boards/")
    @NotNull
    @sq2.e
    b0<v7> B(@sq2.c("name") @NotNull String boardName, @sq2.c("category") String category, @sq2.c("description") @NotNull String description, @sq2.c("privacy") @NotNull String privacy, @sq2.c("allow_homefeed_recommendations") Boolean allowHomeFeedRecommendations, @sq2.c("collaborator_invites_enabled") Boolean allowCollabInvite, @sq2.c("collaborator_requests_enabled") Boolean allowRequestToJoin, @sq2.c("layout") String boardLayout, @sq2.c("source") Integer source);

    @f("boards/{boardId}/shopping/feed/modularized/")
    Object C(@s("boardId") @NotNull String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @t("saved_products_only") boolean z13, @t("board_session_id") String str5, @t("request_params") String str6, @t("applied_unified_filters") String str7, @NotNull bl2.c<? super NetworkResponse<? extends vd0.c>> cVar);

    @sq2.b("boards/{boardId}/follow/")
    @NotNull
    uj2.b D(@s("boardId") @NotNull String boardId);

    @o("board/{boardId}/flag/")
    @sq2.e
    Object E(@s("boardId") @NotNull String str, @sq2.c("reason") @NotNull String str2, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @o("boards/{boardId}/header/")
    @sq2.e
    Object F(@s("boardId") @NotNull String str, @sq2.c("pin_id") @NotNull String str2, @sq2.c("crop_x") float f13, @sq2.c("crop_y") float f14, @sq2.c("width") float f15, @sq2.c("height") float f16, @sq2.c("pin_image_url") @NotNull String str3, @NotNull bl2.c<? super NetworkResponse<? extends tt1.a<String>>> cVar);

    @f("board/{boardId}/sections/")
    Object G(@s("boardId") @NotNull String str, @t("fields") @NotNull String str2, @t("bookmark") String str3, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @f("boards/{boardId}/ideas/feed/")
    Object H(@s("boardId") @NotNull String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @o("boards/{boardId}/")
    @NotNull
    @sq2.e
    uj2.b I(@s("boardId") @NotNull String boardId, @sq2.c("name") String boardName, @sq2.c("category") String category, @sq2.c("description") String description, @sq2.c("privacy") String privacy, @sq2.c("allow_homefeed_recommendations") Boolean allowHomeFeedRecommendations, @sq2.c("collaborator_invites_enabled") Boolean allowCollabInvite, @sq2.c("collaborator_requests_enabled") Boolean allowRequestToJoin, @sq2.c("collaborator_permissions_setting") Integer collaboratorPermissionsSetting);

    @f("boards/{boardId}/automagical/")
    @NotNull
    b0<v7> J(@s("boardId") @NotNull String boardId, @t("fields") @NotNull String fields);

    @f
    @NotNull
    b0<BoardFeed> a(@NotNull @y String url);

    @f
    @NotNull
    b0<DynamicFeed> b(@NotNull @y String url);

    @f("boards/{boardId}/tools/")
    @NotNull
    b0<List<la>> c(@s("boardId") @NotNull String boardId);

    @sq2.b("boards/{boardId}/archive/")
    @NotNull
    uj2.b d(@s("boardId") @NotNull String boardId);

    @sq2.b("boards/{boardUid}/bulk/")
    @NotNull
    uj2.b e(@s("boardUid") @NotNull String boardId, @t("section") String sectionId, @t("exclude_pin_ids") String pinIdsToExcludeFromSelectAll);

    @f("visual_search/flashlight/pin/{pinId}/unified/")
    Object f(@s("pinId") @NotNull String str, @t("fields") @NotNull String str2, @t("is_shopping") boolean z13, @t("crop_source") @NotNull String str3, @t("page_size") @NotNull String str4, @t("bookmark") String str5, @t("board_session_id") String str6, @t("entrypoint") String str7, @t("request_params") String str8, @NotNull bl2.c<? super NetworkResponse<? extends vd0.c>> cVar);

    @o("boards/{boardId}/reorder_pin/")
    @NotNull
    @sq2.e
    uj2.b g(@s("boardId") @NotNull String boardId, @sq2.c("pin") @NotNull String pinId, @sq2.c("before_pin") String pinBeforeMovedPinId, @sq2.c("after_pin") String pinAftereMovedPinId);

    @f("boards/{boardId}/")
    @NotNull
    b0<v7> h(@s("boardId") @NotNull String boardId, @t("fields") @NotNull String fields);

    @p("boards/{boardId}/follow/")
    @NotNull
    uj2.b i(@s("boardId") @NotNull String boardId);

    @f("board/{boardId}/sections/module/")
    Object j(@s("boardId") @NotNull String str, @t("fields") @NotNull String str2, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @f("boards/{boardId}/lookbook/feed/")
    Object k(@s("boardId") @NotNull String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @t("board_session_id") String str5, @t("request_params") String str6, @t("feed_type") String str7, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @f("boards/{boardId}/tools/")
    Object l(@s("boardId") @NotNull String str, @t("view_type") int i13, @NotNull bl2.c<? super NetworkResponse<? extends List<? extends la>>> cVar);

    @sq2.b("boards/{boardId}/")
    @NotNull
    uj2.b m(@s("boardId") @NotNull String boardId);

    @f("boards/{boardId}/pins/{filterType}/")
    Object n(@s("boardId") @NotNull String str, @s(encoded = true, value = "filterType") @NotNull String str2, @t("fields") @NotNull String str3, @t("page_size") @NotNull String str4, @t("bookmark") String str5, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @sq2.b("boards/{boardId}/header/")
    @NotNull
    uj2.b o(@s("boardId") @NotNull String boardId);

    @f("boards/{boardId}/automagical/pins/")
    Object p(@s("boardId") @NotNull String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @t("request_params") String str5, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @f("boards/{boardId}/pins/")
    Object q(@s("boardId") @NotNull String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @t("filter_section_pins") boolean z13, @t("filter_stories") boolean z14, @NotNull bl2.c<? super NetworkResponse<DynamicFeed>> cVar);

    @o("boards/{boardId}/collaborators/invite/")
    @NotNull
    uj2.b r(@s("boardId") @NotNull String boardId, @t("collaborator_ids") @NotNull String collaborator_ids, @t("message") String message);

    @p("boards/{boardId}/restore/")
    @NotNull
    uj2.b s(@s("boardId") @NotNull String boardId);

    @o("boards/{sourceBoardId}/merge/{destinationBoardId}/")
    @NotNull
    @sq2.e
    l<v7> t(@s("sourceBoardId") @NotNull String sourceBoardId, @s("destinationBoardId") @NotNull String destinationBoardId, @sq2.c("fields") @NotNull String fields);

    @f("boards/{boardId}/shopping/feed/product_category/")
    Object u(@s("boardId") @NotNull String str, @t("fields") @NotNull String str2, @t("product_category_id") String str3, @t("stl_product_pin_ids") String str4, @t("page_size") @NotNull String str5, @t("bookmark") String str6, @NotNull bl2.c<? super NetworkResponse<? extends vd0.c>> cVar);

    @o("boards/{boardId}/archive/")
    @NotNull
    uj2.b v(@s("boardId") @NotNull String boardId);

    @sq2.b("boards/{boardId}/collaborators/{userIds}/")
    @NotNull
    uj2.b w(@s("boardId") @NotNull String boardId, @s("userIds") @NotNull String userIds, @t("ban") @NotNull String banUser);

    @p("boards/{boardId}/collaborators/invite/email/")
    @NotNull
    uj2.b x(@s("boardId") @NotNull String boardId, @t("emails") @NotNull String emails, @t("message") String message);

    @o("boards/{boardId}/bulk/")
    @NotNull
    @sq2.e
    uj2.b y(@s("boardId") @NotNull String boardId, @sq2.c("old_section_id") String originBoardSectionId, @sq2.c("new_board_id") @NotNull String destinationBoardId, @sq2.c("new_section_id") String destinationBoardSectionId, @sq2.c("exclude_pin_ids") @NotNull String selectAllExcludePinIds);

    @f("boards/{boardId}/pins/")
    @NotNull
    b0<DynamicFeed> z(@s("boardId") @NotNull String boardId, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);
}
