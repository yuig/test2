package com.pinterest.repository.pin;

import androidx.annotation.Keep;
import b22.d;
import b22.j;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.t50;
import com.pinterest.api.model.x50;
import com.pinterest.api.model.xs0;
import com.pinterest.api.model.y8;
import com.pinterest.api.model.yc0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import sq2.b;
import sq2.c;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.p;
import sq2.s;
import sq2.t;
import sq2.u;
import sq2.y;
import tt1.a;
import uj2.b0;
import uj2.l;

@Keep
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 u2\u00020\u0001:\u0001vJ7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u000b0\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014Jã\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070(2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u00192\b\b\u0001\u0010\u001d\u001a\u00020\u00192\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\"\u001a\u00020!2\b\b\u0001\u0010#\u001a\u00020!2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010'\u001a\u00020!H'¢\u0006\u0004\b)\u0010*JA\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00062\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b/\u00100JA\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00062\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b2\u00100JW\u00108\u001a\b\u0012\u0004\u0012\u0002010\u00062\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u00020!2\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00106\u001a\u0004\u0018\u00010!2\n\b\u0001\u00107\u001a\u0004\u0018\u00010!H'¢\u0006\u0004\b8\u00109JN\u0010=\u001a\b\u0012\u0004\u0012\u0002010\u00112\b\b\u0001\u0010+\u001a\u00020\u00022\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u00022\u0016\b\u0001\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020;2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b=\u0010>J)\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b?\u0010\u000eJ)\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00062\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\bA\u0010\u000eJ%\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\f0\u00062\b\b\u0001\u0010+\u001a\u00020\u0002H'¢\u0006\u0004\bC\u0010DJ%\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\f0\u00062\b\b\u0001\u0010E\u001a\u00020\u0002H'¢\u0006\u0004\bF\u0010DJ3\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010G\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\bI\u0010\tJ?\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070(2\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010J\u001a\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bK\u0010LJ5\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070(2\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bM\u0010NJ)\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00070(2\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\bO\u0010PJ)\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00070(2\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\bQ\u0010PJ\u001f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00070(2\b\b\u0001\u0010+\u001a\u00020\u0002H'¢\u0006\u0004\bR\u0010SJÓ\u0001\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u00192\b\b\u0001\u0010\u001d\u001a\u00020\u00192\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010U\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010V\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010W\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010X\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010Z\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b[\u0010\\J%\u0010^\u001a\u00020]2\b\b\u0001\u0010+\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b^\u0010_J#\u0010a\u001a\u00020]2\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010`\u001a\u00020\u0002H'¢\u0006\u0004\ba\u0010_JG\u0010d\u001a\u00020]2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010c\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bd\u0010eJN\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010c\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bf\u0010gJN\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010c\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bh\u0010gJ\u0016\u0010j\u001a\b\u0012\u0004\u0012\u00020i0\u0011H§@¢\u0006\u0004\bj\u0010kJL\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010l\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bm\u0010gJ@\u0010q\u001a\b\u0012\u0004\u0012\u00020p0\u00112\b\b\u0001\u0010n\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010o\u001a\u00020\u00022\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bq\u0010rJ\u001f\u0010t\u001a\b\u0012\u0004\u0012\u00020s0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bt\u0010Dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006wÀ\u0006\u0001"}, d2 = {"Lcom/pinterest/repository/pin/PinService;", "", "", "pinId", "fields", "clientTrackingParams", "Luj2/b0;", "Lcom/pinterest/api/model/f30;", "getPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "ids", "Ltt1/a;", "", "getPins", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "messageId", "reason", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "", "reportLiveMessageSuspend", "(Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "userMentionTags", "title", "summary", "altText", "", "shareFacebook", "shareTwitter", "disableComments", "disableDidIt", "link", "boardId", "boardSectionId", "", "moveFromSectionToParentBoard", "shoppingRecDisabled", "ideaPinDetails", "ideaPinDetailsTemplateType", "productPins", "isShuffleRemixable", "Luj2/l;", "editPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)Luj2/l;", "pinUid", "navigationSource", "searchQueryTerm", "Lcom/pinterest/api/model/PinFeed;", "loadTopTaggedObjects", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "Lvd0/c;", "loadCloseupShoppingModule", "client", "cleanupMasks", "detectionModel", "useGSS", "writeToGalaxy", "getPinSegmentationSam", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Luj2/b0;", "bookmark", "", "options", "loadUnifiedFeedModule", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "getPinWithFields", "Lcom/pinterest/api/model/t50;", "loadTaggedProducts", "Lcom/pinterest/api/model/y8;", "loadSuggestedBoardNames", "(Ljava/lang/String;)Luj2/b0;", "url", "getSuggestedBoardNamesNextPage", "types", "Lcom/pinterest/api/model/yc0;", "getRepinnedBoardsForPin", "reactionType", "react", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Luj2/l;", "unreact", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/l;", "favorite", "(Ljava/lang/String;Ljava/lang/String;)Luj2/l;", "unfavorite", "deleteMention", "(Ljava/lang/String;)Luj2/l;", "carouselSlotIndex", "section", "imageSignature", "chipIds", "productTagParentPinId", "shuffleAssetId", "featuredFeedType", "repin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Luj2/b0;", "Luj2/b;", "deletePin", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "signalId", "requestSignalReview", "source", "query", "reportPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "reportPinSuspend", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "reportThirdPartyAdSuspend", "Lcom/pinterest/api/model/xs0;", "getThirdPartyAdConfigSuspend", "(Lbl2/c;)Ljava/lang/Object;", "pin", "reportLinkSuspend", "userId", "pageSize", "Lb22/d;", "getUserPins", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "Lcom/pinterest/api/model/x50;", "getPinTranslations", "Companion", "b22/j", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface PinService {

    @NotNull
    public static final j Companion = j.f21301a;

    @NotNull
    public static final String PINS_URL = "pins/";

    @b("pins/{pinUid}/mentions/")
    @NotNull
    l<f30> deleteMention(@s("pinUid") @NotNull String pinUid);

    @b("pins/{pinUid}/")
    @NotNull
    uj2.b deletePin(@s("pinUid") @NotNull String pinUid, @t("client_tracking_params") String clientTrackingParams);

    @o("pins/{pinId}/")
    @NotNull
    @e
    l<f30> editPin(@s("pinId") @NotNull String pinId, @t("fields") @NotNull String fields, @t("user_mention_tags") String userMentionTags, @c("title") String title, @c("description") String summary, @c("alt_text") @NotNull String altText, @c("share_facebook") int shareFacebook, @c("share_twitter") int shareTwitter, @c("disable_comments") int disableComments, @c("disable_did_it") int disableDidIt, @c("link") String link, @c("board_id") @NotNull String boardId, @c("board_section_id") String boardSectionId, @c("delete_section") boolean moveFromSectionToParentBoard, @c("shopping_rec_disabled") boolean shoppingRecDisabled, @c("idea_pin_details") String ideaPinDetails, @c("idea_pin_details_template_type") Integer ideaPinDetailsTemplateType, @c("product_pins") String productPins, @c("is_shuffle_remixable") boolean isShuffleRemixable);

    @o("pins/{pinUid}/favorite/")
    @NotNull
    l<f30> favorite(@s("pinUid") @NotNull String pinUid, @t("fields") @NotNull String fields);

    @f("pins/{pinId}/")
    @NotNull
    b0<f30> getPin(@s("pinId") @NotNull String pinId, @t("fields") String fields, @t("client_tracking_params") String clientTrackingParams);

    @f("/v3/pins/{pinUid}/segmentation/sam/")
    @NotNull
    b0<vd0.c> getPinSegmentationSam(@s("pinUid") @NotNull String pinUid, @t("client") @NotNull String client, @t("cleanup_masks") boolean cleanupMasks, @t("detection_model") String detectionModel, @t("use_gss") Boolean useGSS, @t("write_to_galaxy") Boolean writeToGalaxy);

    @f("pins/{pinId}/translations/")
    @NotNull
    b0<x50> getPinTranslations(@s("pinId") @NotNull String pinId);

    @f("pins/{pinId}/")
    @NotNull
    b0<f30> getPinWithFields(@s("pinId") @NotNull String pinId, @t("fields") @NotNull String fields);

    @f(PINS_URL)
    @NotNull
    b0<a<List<f30>>> getPins(@t("pin_ids") @NotNull String ids, @t("fields") String fields);

    @f("aggregated_pin_data/{pinId}/activities/")
    @NotNull
    b0<yc0> getRepinnedBoardsForPin(@s("pinId") @NotNull String pinId, @t("types") @NotNull String types, @t("fields") @NotNull String fields);

    @f
    @NotNull
    b0<List<y8>> getSuggestedBoardNamesNextPage(@NotNull @y String url);

    @f("thirdpartyad/config/")
    Object getThirdPartyAdConfigSuspend(@NotNull bl2.c<? super NetworkResponse<? extends xs0>> cVar);

    @f("users/{userId}/pins/")
    Object getUserPins(@s("userId") @NotNull String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @NotNull bl2.c<? super NetworkResponse<d>> cVar);

    @f("visual_search/stela/pins/{pinUid}/module/")
    @NotNull
    b0<vd0.c> loadCloseupShoppingModule(@s("pinUid") @NotNull String pinUid, @t("fields") @NotNull String fields, @t("source") String navigationSource, @t("search_query") String searchQueryTerm);

    @f("pins/{pinUid}/board_title_suggestions/")
    @NotNull
    b0<List<y8>> loadSuggestedBoardNames(@s("pinUid") @NotNull String pinUid);

    @f("visual_links/pins/{pinUid}/tagged_objects/")
    @NotNull
    b0<t50> loadTaggedProducts(@s("pinUid") @NotNull String pinUid, @t("fields") @NotNull String fields);

    @f("visual_links/pins/{pinUid}/top_tagged_objects/")
    @NotNull
    b0<PinFeed> loadTopTaggedObjects(@s("pinUid") @NotNull String pinUid, @t("fields") @NotNull String fields, @t("source") String navigationSource, @t("search_query") String searchQueryTerm);

    @f("visual_search/flashlight/pin/{pinUid}/unified/")
    Object loadUnifiedFeedModule(@s("pinUid") @NotNull String str, @t("bookmark") String str2, @NotNull @u Map<String, String> map, @t("fields") @NotNull String str3, @NotNull bl2.c<? super NetworkResponse<? extends vd0.c>> cVar);

    @o("pins/{pinUid}/react/")
    @NotNull
    @e
    l<f30> react(@s("pinUid") @NotNull String pinUid, @t("reaction_type") int reactionType, @t("fields") @NotNull String fields, @c("client_tracking_params") String clientTrackingParams);

    @o("pins/{pinUid}/repin/")
    @NotNull
    @e
    b0<f30> repin(@s("pinUid") @NotNull String pinUid, @c("fields") @NotNull String fields, @c("description") @NotNull String summary, @c("share_facebook") int shareFacebook, @c("share_twitter") int shareTwitter, @c("disable_comments") int disableComments, @c("disable_did_it") int disableDidIt, @c("carousel_slot_index") Integer carouselSlotIndex, @c("link") String link, @c("section") String section, @c("board_id") String boardId, @c("client_tracking_params") String clientTrackingParams, @c("image_signature") String imageSignature, @c("collection_drawer_pin_ids") String chipIds, @c("product_tag_parent_pin") String productTagParentPinId, @c("shuffle_asset") String shuffleAssetId, @c("featured_feed_type") Integer featuredFeedType);

    @p("pins/{pinId}/report_link/")
    @e
    Object reportLinkSuspend(@s("pinId") @NotNull String str, @c("pin") @NotNull String str2, @c("reason") @NotNull String str3, @c("source") String str4, @c("client_tracking_params") String str5, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @p("livestream/messages/{messageId}/report/")
    @e
    Object reportLiveMessageSuspend(@s("messageId") @NotNull String str, @c("reason") @NotNull String str2, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @p("pins/{pinId}/report/")
    @NotNull
    @e
    uj2.b reportPin(@s("pinId") @NotNull String pinId, @c("reason") @NotNull String reason, @c("source") String source, @c("client_tracking_params") String clientTrackingParams, @c("query") String query);

    @p("pins/{pinId}/report/")
    @e
    Object reportPinSuspend(@s("pinId") @NotNull String str, @c("reason") @NotNull String str2, @c("source") String str3, @c("client_tracking_params") String str4, @c("query") String str5, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @p("thirdpartyad/{pinId}/report/")
    @e
    Object reportThirdPartyAdSuspend(@s("pinId") @NotNull String str, @c("reason") @NotNull String str2, @c("source") String str3, @c("client_tracking_params") String str4, @c("query") String str5, @NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @o("pins/{pinUid}/signal_request_review/")
    @NotNull
    @e
    uj2.b requestSignalReview(@s("pinUid") @NotNull String pinUid, @c("signal_id") @NotNull String signalId);

    @b("pins/{pinUid}/favorite/")
    @NotNull
    l<f30> unfavorite(@s("pinUid") @NotNull String pinUid, @t("fields") @NotNull String fields);

    @b("pins/{pinUid}/react/")
    @NotNull
    l<f30> unreact(@s("pinUid") @NotNull String pinUid, @t("fields") @NotNull String fields, @t("client_tracking_params") String clientTrackingParams);
}
