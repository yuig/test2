package a12;

import com.pinterest.api.model.AggregatedCommentFeed;
import com.pinterest.api.model.ae;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.gd0;
import com.pinterest.api.model.z2;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.p;
import sq2.s;
import sq2.t;
import sq2.y;
import uj2.b0;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ?\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\tJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012JU\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aJo\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00162\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001d\u0010\u001eJa\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b \u0010!J)\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b#\u0010$JO\u0010&\u001a\u00020%2\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020%2\b\b\u0001\u0010\"\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b(\u0010)J/\u0010,\u001a\u00020%2\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010+\u001a\u00020*2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b,\u0010-J%\u0010.\u001a\u00020%2\b\b\u0001\u0010\"\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b.\u0010)J/\u00100\u001a\u00020%2\b\b\u0001\u0010/\u001a\u00020*2\b\b\u0001\u0010\"\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b0\u00101J/\u00102\u001a\u00020%2\b\b\u0001\u0010/\u001a\u00020*2\b\b\u0001\u0010\"\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b2\u00101J/\u00104\u001a\u00020%2\b\b\u0001\u0010\"\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u00103\u001a\u00020\u0016H'¢\u0006\u0004\b4\u00105J5\u00109\u001a\u00020%2\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u00106\u001a\u00020\u00022\u0010\b\u0001\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000107H'¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020%2\b\b\u0001\u0010\"\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b;\u0010)J)\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00062\b\b\u0001\u0010/\u001a\u00020*2\b\b\u0001\u0010\"\u001a\u00020\u0002H'¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020<0\u00062\b\b\u0001\u0010?\u001a\u00020\u0002H'¢\u0006\u0004\b@\u0010\u0012J)\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00062\b\b\u0001\u0010A\u001a\u00020\u00022\b\b\u0001\u0010B\u001a\u00020\u0002H'¢\u0006\u0004\bD\u0010$J\u001f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00062\b\b\u0001\u0010\"\u001a\u00020\u0002H'¢\u0006\u0004\bF\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006GÀ\u0006\u0001"}, d2 = {"La12/d;", "", "", "didItId", "fields", "pageSize", "Luj2/b0;", "Lcom/pinterest/api/model/AggregatedCommentFeed;", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "aggregatedPinDataId", "featuredId", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "aggregatedCommentId", "j", "url", "a", "(Ljava/lang/String;)Luj2/b0;", "text", "tags", "pinId", "", "force", "Lcom/pinterest/api/model/z2;", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Luj2/b0;", "commentMedia", "clientTrackingParams", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Luj2/b0;", "replyToCommentId", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Luj2/b0;", "commentId", "h", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "Luj2/b;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Luj2/b;", "u", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "", "reactionType", "t", "(Ljava/lang/String;ILjava/lang/String;)Luj2/b;", "d", "modelType", "g", "(ILjava/lang/String;Ljava/lang/String;)Luj2/b;", "l", "highlight", "s", "(Ljava/lang/String;Ljava/lang/String;Z)Luj2/b;", "reason", "", "detailedReasons", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Luj2/b;", "r", "Lcom/pinterest/api/model/gd0;", "e", "(ILjava/lang/String;)Luj2/b0;", "userDidItDataId", "n", "didItUid", "paramFields", "Lcom/pinterest/api/model/az0;", "b", "Lcom/pinterest/api/model/ae;", "c", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface d {
    @f
    @NotNull
    b0<AggregatedCommentFeed> a(@NotNull @y String url);

    @f("did_it/{didItUid}/")
    @NotNull
    b0<az0> b(@s("didItUid") @NotNull String didItUid, @t("fields") @NotNull String paramFields);

    @f("aggregated_comments/{commentId}/translate/")
    @NotNull
    b0<ae> c(@s("commentId") @NotNull String commentId);

    @sq2.b("aggregated_comments/{commentId}/react/")
    @NotNull
    uj2.b d(@s("commentId") @NotNull String commentId, @t("pin") String pinId);

    @f("comments/{modelType}/{commentId}/report_reasons/")
    @NotNull
    b0<gd0> e(@s("modelType") int modelType, @s("commentId") @NotNull String commentId);

    @o("aggregated_comments/{aggregatedCommentId}/reply/")
    @NotNull
    @e
    b0<z2> f(@s("aggregatedCommentId") @NotNull String aggregatedCommentId, @t("fields") @NotNull String fields, @sq2.c("text") @NotNull String text, @sq2.c("tags") String tags, @sq2.c("pin") String pinId, @sq2.c("reply_to_comment") String replyToCommentId, @sq2.c("force") boolean force);

    @o("/v3/helpful/{modelType}/{commentId}/")
    @NotNull
    @e
    uj2.b g(@s("modelType") int modelType, @s("commentId") @NotNull String commentId, @sq2.c("pin") String pinId);

    @f("aggregated_comments/{commentId}/")
    @NotNull
    b0<z2> h(@s("commentId") @NotNull String commentId, @t("fields") @NotNull String fields);

    @f("aggregated_pin_data/{aggregatedPinDataId}/comments/")
    @NotNull
    b0<AggregatedCommentFeed> i(@s("aggregatedPinDataId") @NotNull String aggregatedPinDataId, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize, @t("featured_ids") String featuredId);

    @f("aggregated_comments/{aggregatedCommentId}/replies/")
    @NotNull
    b0<AggregatedCommentFeed> j(@s("aggregatedCommentId") @NotNull String aggregatedCommentId, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);

    @p("aggregated_comments/{commentId}/")
    @NotNull
    @e
    uj2.b k(@s("commentId") @NotNull String commentId, @t("fields") @NotNull String fields, @sq2.c("text") @NotNull String text, @sq2.c("tags") String tags, @sq2.c("pin") String pinId, @sq2.c("force") boolean force);

    @sq2.b("/v3/helpful/{modelType}/{commentId}/")
    @NotNull
    uj2.b l(@s("modelType") int modelType, @s("commentId") @NotNull String commentId, @t("pin") String pinId);

    @f("did_it/{didItId}/comments/")
    @NotNull
    b0<AggregatedCommentFeed> m(@s("didItId") @NotNull String didItId, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);

    @f("did_it/{userDidItDataId}/report_reasons/")
    @NotNull
    b0<gd0> n(@s("userDidItDataId") @NotNull String userDidItDataId);

    @p("aggregated_comments/{commentId}/flag/")
    @NotNull
    @e
    uj2.b o(@s("commentId") @NotNull String commentId, @sq2.c("reason") @NotNull String reason, @sq2.c("detailed_reasons") List<String> detailedReasons);

    @o("aggregated_pin_data/{aggregatedPinDataId}/comment/")
    @NotNull
    @e
    b0<z2> p(@s("aggregatedPinDataId") @NotNull String aggregatedPinDataId, @t("fields") @NotNull String fields, @sq2.c("pin") String pinId, @sq2.c("text") String text, @sq2.c("tags") String tags, @sq2.c("comment_media") String commentMedia, @sq2.c("force") boolean force, @sq2.c("client_tracking_params") String clientTrackingParams);

    @o("did_it/{didItId}/comments/")
    @NotNull
    @e
    b0<z2> q(@s("didItId") @NotNull String didItId, @t("fields") @NotNull String fields, @sq2.c("text") @NotNull String text, @sq2.c("tags") String tags, @sq2.c("pin") String pinId, @sq2.c("force") boolean force);

    @sq2.b("aggregated_comments/{commentId}/mentions/")
    @NotNull
    uj2.b r(@s("commentId") @NotNull String commentId, @t("pin") String pinId);

    @p("/v3/aggregated_comments/pin/highlight/")
    @NotNull
    @e
    uj2.b s(@sq2.c("aggregated_comment") @NotNull String commentId, @sq2.c("pin") String pinId, @sq2.c("highlight") boolean highlight);

    @o("aggregated_comments/{commentId}/react/")
    @NotNull
    @e
    uj2.b t(@s("commentId") @NotNull String commentId, @sq2.c("reaction_type") int reactionType, @sq2.c("pin") String pinId);

    @sq2.b("aggregated_comments/{commentId}/")
    @NotNull
    uj2.b u(@s("commentId") @NotNull String commentId, @t("pin") String pinId);
}
