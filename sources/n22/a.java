package n22;

import com.pinterest.api.model.kg0;
import com.pinterest.api.model.kr;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import sq2.b;
import sq2.c;
import sq2.e;
import sq2.l;
import sq2.p;
import sq2.q;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0095\u0001\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0012\u0010\u0013J·\u0002\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u00142\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\"\u0010#J\u0099\u0002\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0001\u0010$\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b,\u0010-J'\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00100\u000f2\n\b\u0001\u0010/\u001a\u0004\u0018\u00010.H'¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0002032\b\b\u0001\u0010$\u001a\u00020\u0004H'¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u0002032\b\b\u0001\u0010$\u001a\u00020\u0004H'¢\u0006\u0004\b6\u00105ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0001"}, d2 = {"Ln22/a;", "", "", "scheduledTs", "", "boardId", "sectionId", "description", "userMentionTags", "altText", "sourceURL", "imageSignature", "title", "videoTrackingId", "fields", "Luj2/b0;", "Ltt1/a;", "Lcom/pinterest/api/model/kg0;", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Luj2/b0;", "", "isCommentsAllowed", "templateType", "sponsorId", "advertiserId", "allowShoppingRec", "interestIds", "interestLabels", "freeformTags", "freeFormTagsLanguage", "storyPin", "isUnifiedBuilder", "isSponsorable", "productPins", "b", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;)Luj2/b0;", "scheduledPinId", "isCommentingAllowed", "freeformTagLanguage", "details", "detailsTemplateType", "unassignSponsorId", "unassignSectionId", "taggedProducts", "d", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Luj2/b0;", "Lokhttp3/MultipartBody$Part;", "image", "Lcom/pinterest/api/model/kr;", "f", "(Lokhttp3/MultipartBody$Part;)Luj2/b0;", "Luj2/b;", "c", "(Ljava/lang/String;)Luj2/b;", "e", "scheduledPinLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {
    @p("scheduledpins/")
    @NotNull
    @e
    b0<tt1.a<kg0>> a(@c("scheduled_ts") int scheduledTs, @c("board_id") String boardId, @c("section_id") String sectionId, @c("description") @NotNull String description, @c("user_mention_tags") String userMentionTags, @c("alt_text") @NotNull String altText, @c("source_url") @NotNull String sourceURL, @c("image_signature") String imageSignature, @c("title") @NotNull String title, @c("video_tracking_id") Integer videoTrackingId, @c("fields") String fields);

    @p("scheduledpins/")
    @NotNull
    @e
    b0<tt1.a<kg0>> b(@c("scheduled_ts") int scheduledTs, @c("board_id") String boardId, @c("section_id") String sectionId, @c("description") String description, @c("user_mention_tags") String userMentionTags, @c("alt_text") String altText, @c("source_url") String sourceURL, @c("image_signature") String imageSignature, @c("title") String title, @c("video_tracking_id") Integer videoTrackingId, @c("is_comments_allowed") Boolean isCommentsAllowed, @c("template_type") Integer templateType, @c("sponsor_id") String sponsorId, @c("advertiser_id") Integer advertiserId, @c("allow_shopping_rec") Boolean allowShoppingRec, @c("interest_ids") String interestIds, @c("interest_labels") String interestLabels, @c("freeform_tags") String freeformTags, @c("freeform_tags_language") String freeFormTagsLanguage, @c("story_pin") String storyPin, @c("fields") String fields, @c("is_unified_builder") boolean isUnifiedBuilder, @c("is_sponsorable") Boolean isSponsorable, @c("product_pins") String productPins);

    @b("scheduledpins/{scheduledPinId}/")
    @NotNull
    uj2.b c(@s("scheduledPinId") @NotNull String scheduledPinId);

    @p("scheduledpins/{scheduledPinId}/")
    @NotNull
    @e
    b0<tt1.a<kg0>> d(@s("scheduledPinId") @NotNull String scheduledPinId, @c("scheduled_ts") Integer scheduledTs, @c("board") String boardId, @c("section") String sectionId, @c("description") @NotNull String description, @c("user_mention_tags") String userMentionTags, @c("alt_text") @NotNull String altText, @c("link") @NotNull String sourceURL, @c("title") @NotNull String title, @c("is_commenting_allowed") Boolean isCommentingAllowed, @c("sponsor_id") String sponsorId, @c("allow_shopping_rec") Boolean allowShoppingRec, @c("interest_ids") String interestIds, @c("interest_labels") String interestLabels, @c("freeform_tags") String freeformTags, @c("freeform_tag_language") String freeformTagLanguage, @c("idea_pin_details") String details, @c("idea_pin_details_template_type") Integer detailsTemplateType, @t("fields") String fields, @c("unassign_sponsor_id") Boolean unassignSponsorId, @c("unassign_section") Boolean unassignSectionId, @c("product_pins") String taggedProducts);

    @p("scheduledpins/{scheduledPinId}/publish/")
    @NotNull
    uj2.b e(@s("scheduledPinId") @NotNull String scheduledPinId);

    @l
    @p("scheduledpins/image/upload/")
    @NotNull
    b0<tt1.a<kr>> f(@q MultipartBody.Part image);
}
