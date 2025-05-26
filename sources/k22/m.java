package k22;

import com.google.android.gms.ads.RequestConfiguration;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.model.b90;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kr;
import com.pinterest.api.model.oc;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import nm.u;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import sq2.o;
import sq2.p;
import sq2.q;
import sq2.s;
import sq2.t;
import sq2.y;
import uj2.b0;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\tH§@¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010 \u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b \u0010!J8\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b%\u0010\u001dJ \u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b&\u0010'J1\u0010)\u001a\u00020\u00132\b\b\u0001\u0010(\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b)\u0010!J.\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\t2\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b,\u0010\u000bJ7\u00101\u001a\u00020\u00132\b\b\u0001\u0010-\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u00022\b\b\u0001\u0010/\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020\u0002H'¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\u00132\b\b\u0001\u00103\u001a\u00020\u0002H'¢\u0006\u0004\b4\u0010\u001dJ;\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\u00052\b\b\u0001\u00105\u001a\u00020\u00022\u0014\b\u0001\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206H'¢\u0006\u0004\b:\u0010;J/\u0010<\u001a\u00020\u00132\b\b\u0001\u00105\u001a\u00020\u00022\u0014\b\u0001\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000206H'¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00132\u000e\b\u0001\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\fH'¢\u0006\u0004\bA\u0010BJ%\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E080\u00052\b\b\u0001\u0010D\u001a\u00020CH'¢\u0006\u0004\bF\u0010GJ=\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K080\u00052\b\b\u0001\u0010H\u001a\u00020\u00022\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bL\u0010MJ+\u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00052\b\b\u0001\u0010N\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bP\u0010\bJ+\u0010R\u001a\b\u0012\u0004\u0012\u00020O0\u00052\b\b\u0001\u0010Q\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bR\u0010\bJ+\u0010T\u001a\b\u0012\u0004\u0012\u00020O0\u00052\b\b\u0001\u0010S\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bT\u0010\bJ\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020O0\u00052\b\b\u0001\u0010U\u001a\u00020\u0002H'¢\u0006\u0004\bV\u0010?J7\u0010\\\u001a\u00020\u00132\b\b\u0001\u0010W\u001a\u00020\u00022\b\b\u0001\u0010Y\u001a\u00020X2\b\b\u0001\u0010Z\u001a\u00020X2\b\b\u0001\u0010[\u001a\u00020XH'¢\u0006\u0004\b\\\u0010]J\u0015\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u0005H'¢\u0006\u0004\b_\u0010`J/\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0\f0\u00052\b\b\u0001\u0010b\u001a\u00020a2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\bd\u0010eJ/\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g080\u00052\b\b\u0001\u0010f\u001a\u00020a2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\bh\u0010eJ)\u0010j\u001a\b\u0012\u0004\u0012\u00020i0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\bj\u0010\bJ7\u0010m\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020kj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`l080\u0005H'¢\u0006\u0004\bm\u0010`J*\u0010o\u001a\b\u0012\u0004\u0012\u00020\"0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010n\u001a\u00020\u0002H§@¢\u0006\u0004\bo\u0010\u000bJC\u0010q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0\f080\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bq\u0010MJZ\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\t2\n\b\u0001\u0010r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010s\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010f\u001a\u00020\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bv\u0010wJ+\u0010z\u001a\b\u0012\u0004\u0012\u00020c0\u00052\b\b\u0001\u0010x\u001a\u00020\u00162\n\b\u0001\u0010y\u001a\u0004\u0018\u00010aH'¢\u0006\u0004\bz\u0010{J%\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020}080\u00052\b\b\u0001\u0010|\u001a\u00020\u0002H'¢\u0006\u0004\b~\u0010?J-\u0010\u0080\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0\f080\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0005\b\u0080\u0001\u0010?J\u0086\u0001\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020i0\u00052\t\b\u0001\u0010\u0081\u0001\u001a\u00020\u00022\u000b\b\u0001\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010\u0083\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u0084\u0001\u001a\u00020\u00162\t\b\u0001\u0010\u0085\u0001\u001a\u00020\u00162\t\b\u0001\u0010\u0086\u0001\u001a\u00020\u00162\t\b\u0001\u0010\u0087\u0001\u001a\u00020\u00162\t\b\u0001\u0010\u0088\u0001\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010f\u001a\u00020\u0002H'¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J,\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020^0\u00052\t\b\u0001\u0010\u008b\u0001\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0005\b\u008c\u0001\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u008d\u0001À\u0006\u0001"}, d2 = {"Lk22/m;", "", "", "userId", "fields", "Luj2/b0;", "Lcom/pinterest/api/model/wy0;", "w", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "F", "(Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "", "o", "(Lbl2/c;)Ljava/lang/Object;", "consumerType", "inviteCode", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "Luj2/b;", "i", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "", "explicitFollowing", "bookmark", "Lo12/b;", "A", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lbl2/c;)Ljava/lang/Object;", "J", "(Ljava/lang/String;)Luj2/b;", "blockSource", "blockContext", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "x", "g", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "blocked_user_ids", "y", "query", "Lk22/i;", "d", "usernamePath", "username", "reason", "reportObject", "I", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "sortOrder", "l", "sourceSite", "", "settingsMap", "Ltt1/a;", "Lnm/u;", "c", "(Ljava/lang/String;Ljava/util/Map;)Luj2/b0;", "f", "(Ljava/lang/String;Ljava/util/Map;)Luj2/b;", "D", "(Ljava/lang/String;)Luj2/b0;", "genAiTopicsOptOut", "C", "(Ljava/util/List;)Luj2/b;", "Lokhttp3/MultipartBody$Part;", "image", "Lcom/pinterest/api/model/kr;", "E", "(Lokhttp3/MultipartBody$Part;)Luj2/b0;", "sourceType", "sourceId", "videoUploadId", "Lcom/pinterest/api/model/b90;", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "boardId", "Lcom/pinterest/api/model/UserFeed;", "s", "commentId", "r", "didItId", "b", "url", "a", "location", "", "horizontalAccuracy", "verticalAccuracy", "speed", "u", "(Ljava/lang/String;FFF)Luj2/b;", "Lvd0/c;", "h", "()Luj2/b0;", "", "pinPreviewCount", "Lcom/pinterest/api/model/vh;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(ILjava/lang/String;)Luj2/b0;", "pageSize", "Lnm/q;", "j", "Lcom/pinterest/api/model/BoardFeed;", "t", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "z", "reasonKey", "M", "Lcom/pinterest/api/model/f30;", "k", "requestParams", "filters", "interestFilterIds", "Lb22/d;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "excludeQuickSavePins", "maxClusterLimit", "m", "(ZLjava/lang/Integer;)Luj2/b0;", "pinId", "Lcom/pinterest/api/model/oc;", "B", "Lcom/pinterest/api/model/v7;", "L", "userUid", "sort", "filter", "filterStories", "includeEmpty", "filterAllPins", "filterShoppingList", "filterCollage", "H", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;Ljava/lang/String;)Luj2/b0;", "merchantId", "K", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface m {
    @sq2.f("users/{userId}/following/")
    Object A(@s("userId") @NotNull String str, @t("fields") @NotNull String str2, @t("explicit_following") boolean z13, @t("bookmark") String str3, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @sq2.f("users/profile/pins/{pinId}/cluster/match/")
    @NotNull
    b0<tt1.a<oc>> B(@s("pinId") @NotNull String pinId);

    @o("users/settings/")
    @NotNull
    @sq2.e
    uj2.b C(@sq2.c("gen_ai_topics_opt_out") @NotNull List<String> genAiTopicsOptOut);

    @sq2.f("users/settings/")
    @NotNull
    b0<wy0> D(@t("fields") @NotNull String fields);

    @sq2.l
    @p("users/me/profile/cover/image/upload/")
    @NotNull
    b0<tt1.a<kr>> E(@NotNull @q MultipartBody.Part image);

    @sq2.f("users/{userId}/")
    Object F(@s("userId") @NotNull String str, @t("fields") String str2, @NotNull bl2.c<? super NetworkResponse<? extends wy0>> cVar);

    @sq2.f("users/me/recent/engaged/pin/stories/")
    @NotNull
    b0<List<vh>> G(@t("pin_preview_count") int pinPreviewCount, @t("fields") @NotNull String fields);

    @sq2.f("users/{userUid}/boards/feed/")
    @NotNull
    b0<BoardFeed> H(@s("userUid") @NotNull String userUid, @t("sort") String sort, @t("privacy_filter") @NotNull String filter, @t("filter_stories") boolean filterStories, @t("include_empty") boolean includeEmpty, @t("filter_all_pins") boolean filterAllPins, @t("filter_shopping_list") boolean filterShoppingList, @t("filter_collage") boolean filterCollage, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);

    @o("users/{usernamePath}/profile/report/")
    @NotNull
    uj2.b I(@s("usernamePath") @NotNull String usernamePath, @t("username") @NotNull String username, @t("reason") @NotNull String reason, @t("report_object") @NotNull String reportObject);

    @sq2.b("users/{userId}/remove/")
    @NotNull
    uj2.b J(@s("userId") @NotNull String userId);

    @sq2.f("commerce/product_pin_merchants/{merchantId}/")
    @NotNull
    b0<vd0.c> K(@s("merchantId") @NotNull String merchantId, @t("fields") @NotNull String fields);

    @sq2.f("users/me/boards/soft_deleted/")
    @NotNull
    b0<tt1.a<List<v7>>> L(@t("fields") @NotNull String fields);

    @o("users/{userId}/flag/")
    @sq2.e
    Object M(@s("userId") @NotNull String str, @sq2.c("reason") @NotNull String str2, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @sq2.f
    @NotNull
    b0<UserFeed> a(@NotNull @y String url);

    @sq2.f("did_it/{didItId}/liked_by/")
    @NotNull
    b0<UserFeed> b(@s("didItId") @NotNull String didItId, @t("fields") String fields);

    @o("users/settings/")
    @NotNull
    @sq2.e
    b0<tt1.a<u>> c(@sq2.c("source_site") @NotNull String sourceSite, @sq2.d @NotNull Map<String, String> settingsMap);

    @sq2.f("users/blocked/")
    Object d(@t("q") String str, @t("bookmark") String str2, @NotNull bl2.c<? super NetworkResponse<i>> cVar);

    @p("users/{userId}/block/")
    @NotNull
    uj2.b e(@s("userId") @NotNull String userId, @t("block_source") String blockSource, @t("block_context") String blockContext);

    @o("users/settings/")
    @NotNull
    @sq2.e
    uj2.b f(@sq2.c("source_site") @NotNull String sourceSite, @sq2.d @NotNull Map<String, String> settingsMap);

    @sq2.b("users/{userId}/block/")
    Object g(@s("userId") @NotNull String str, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @sq2.f("users/gps_location/public_key/")
    @NotNull
    b0<vd0.c> h();

    @sq2.b("users/{userId}/follow/")
    @NotNull
    uj2.b i(@s("userId") @NotNull String userId, @t("consumer_type") String consumerType);

    @sq2.f("users/me/scheduledpins/")
    @NotNull
    b0<tt1.a<nm.q>> j(@t("page_size") int pageSize, @t("fields") @NotNull String fields);

    @sq2.f("users/{userId}/boardless/pins/")
    @NotNull
    b0<tt1.a<List<f30>>> k(@s("userId") @NotNull String userId, @t("page_size") String pageSize, @t("fields") String fields);

    @o("users/me/metadata/")
    @NotNull
    @sq2.e
    uj2.b l(@sq2.c("most_recent_board_sort_order") @NotNull String sortOrder);

    @sq2.f("users/profile/pins/clusters/")
    @NotNull
    b0<vh> m(@t("exclude_quick_save_pins") boolean excludeQuickSavePins, @t("max_cluster_limit") Integer maxClusterLimit);

    @p("users/me/profile/cover/")
    @NotNull
    b0<tt1.a<b90>> n(@t("source_type") @NotNull String sourceType, @t("source_id") String sourceId, @t("video_upload_id") String videoUploadId);

    @sq2.f("users/pronouns/")
    Object o(@NotNull bl2.c<? super NetworkResponse<? extends List<String>>> cVar);

    @sq2.f("users/me/filtered/pins/")
    Object p(@t("request_params") String str, @t("flag_filters") String str2, @t(encoded = true, value = "interest_ids") String str3, @t("fields") @NotNull String str4, @t("page_size") @NotNull String str5, @t("bookmark") String str6, @NotNull bl2.c<? super NetworkResponse<b22.d>> cVar);

    @p("users/{userId}/block/")
    Object q(@s("userId") @NotNull String str, @t("block_source") String str2, @t("block_context") String str3, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @sq2.f("aggregated_comments/{commentId}/liked_by/")
    @NotNull
    b0<UserFeed> r(@s("commentId") @NotNull String commentId, @t("fields") String fields);

    @sq2.f("boards/{boardId}/collaborators/")
    @NotNull
    b0<UserFeed> s(@s("boardId") @NotNull String boardId, @t("fields") String fields);

    @sq2.f("users/{userId}/wishlist/boards/")
    @NotNull
    b0<BoardFeed> t(@s("userId") @NotNull String userId, @t("fields") @NotNull String fields);

    @p("users/gps_location/")
    @NotNull
    uj2.b u(@t("encrypted_location") @NotNull String location, @t("horizontal_accuracy") float horizontalAccuracy, @t("vertical_accuracy") float verticalAccuracy, @t("speed") float speed);

    @p("users/{userId}/follow/")
    @NotNull
    @sq2.e
    b0<wy0> v(@s("userId") @NotNull String userId, @t("fields") @NotNull String fields, @sq2.c("consumer_type") String consumerType, @sq2.c("invite_code") String inviteCode);

    @sq2.f("users/{userId}/")
    @NotNull
    b0<wy0> w(@s("userId") @NotNull String userId, @t("fields") String fields);

    @sq2.b("users/{userId}/block/")
    @NotNull
    uj2.b x(@s("userId") @NotNull String userId);

    @p("users/batch/block/")
    @NotNull
    uj2.b y(@t("blocked_user_ids") @NotNull String blocked_user_ids, @t("block_source") String blockSource, @t("block_context") String blockContext);

    @sq2.f("locales/")
    @NotNull
    b0<tt1.a<HashMap<String, String>>> z();
}
