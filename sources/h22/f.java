package h22;

import com.pinterest.api.model.cm0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.rp;
import com.pinterest.api.model.ul0;
import com.pinterest.repository.pin.PinService;
import java.util.List;
import kotlin.Metadata;
import nm.u;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import sq2.o;
import sq2.p;
import sq2.s;
import sq2.t;
import sq2.w;
import sq2.y;
import uj2.b0;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H'¢\u0006\u0004\b\u000b\u0010\fJ¯\u0001\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001a0\u00062\b\b\u0001\u0010\r\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00112\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00112\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001a0\u00062\b\b\u0001\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001a0\u00062\b\b\u0001\u0010 \u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\u001fJ5\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070#0\u001a0\u00062\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010%J/\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001a0\u00062\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020\u0002H'¢\u0006\u0004\b)\u0010%JO\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001a0\u00062\b\b\u0001\u0010*\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010+\u001a\u00020\u00022\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010-\u001a\u00020\u0002H'¢\u0006\u0004\b.\u0010/J%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001a0\u00062\b\b\u0001\u00100\u001a\u00020\u0011H'¢\u0006\u0004\b1\u00102J%\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u001a0\u00062\b\b\u0001\u00103\u001a\u00020\u0002H'¢\u0006\u0004\b5\u0010\u001fJ\u001f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010 \u001a\u00020\u0002H'¢\u0006\u0004\b6\u0010\u001fJ%\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u001a0\u00062\b\b\u0001\u00108\u001a\u000207H'¢\u0006\u0004\b:\u0010;J%\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u001a0\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b=\u0010\u001fJ\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010&\u001a\u00020\u0002H'¢\u0006\u0004\b?\u0010\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006@À\u0006\u0001"}, d2 = {"Lh22/f;", "", "", "id", "version", "fields", "Luj2/b0;", "Lcom/pinterest/api/model/f30;", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "Lcom/pinterest/api/model/cm0;", "b", "()Luj2/b0;", "storyPin", "altText", "boardId", "boardSectionId", "", "isCommentsAllowed", "allowShoppingRec", "sponsorId", "link", "description", "userMentionTags", "isUnifiedBuilder", "productPins", "Ltt1/a;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Luj2/b0;", "storyPinId", "a", "(Ljava/lang/String;)Luj2/b0;", "pinId", "f", "pinUid", "", "loadTaggedProducts", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "url", "source", "Lnm/u;", "k", "imageUrl", "sourceUrl", "affiliateUrl", "method", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "returnExisting", "d", "(Z)Luj2/b0;", "storyPinFeedback", "Lcom/pinterest/api/model/ul0;", "m", "i", "Lvd0/c;", "rawData", "Lnm/s;", "e", "(Lvd0/c;)Luj2/b0;", "Lcom/pinterest/api/model/rp;", "j", "Lokhttp3/ResponseBody;", "c", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface f {
    @sq2.b("storypins/{storyPinId}/mentions/")
    @NotNull
    b0<tt1.a<f30>> a(@s("storyPinId") @NotNull String storyPinId);

    @sq2.f("storypins/fonts/")
    @NotNull
    b0<cm0> b();

    @w
    @sq2.f
    @NotNull
    b0<ResponseBody> c(@NotNull @y String url);

    @p("visual_links/boards/tagged/")
    @NotNull
    @sq2.e
    b0<tt1.a<u>> d(@sq2.c("return_existing") boolean returnExisting);

    @o("callback/raw_idea_pin_data/")
    @NotNull
    @sq2.e
    b0<tt1.a<nm.s>> e(@sq2.c("raw_data") @NotNull vd0.c rawData);

    @sq2.b("storypins/{pinId}/products/")
    @NotNull
    b0<tt1.a<f30>> f(@s("pinId") @NotNull String pinId);

    @o("storypins/")
    @NotNull
    @sq2.e
    b0<tt1.a<f30>> g(@sq2.c("story_pin") @NotNull String storyPin, @sq2.c("alt_text") String altText, @sq2.c("board_id") String boardId, @sq2.c("board_section_id") String boardSectionId, @sq2.c("is_comments_allowed") boolean isCommentsAllowed, @sq2.c("allow_shopping_rec") boolean allowShoppingRec, @sq2.c("sponsor_id") String sponsorId, @sq2.c("fields") String fields, @sq2.c("link") String link, @sq2.c("description") String description, @sq2.c("user_mention_tags") String userMentionTags, @sq2.c("is_unified_builder") boolean isUnifiedBuilder, @sq2.c("product_pins") String productPins);

    @sq2.f("pins/{id}/")
    @NotNull
    b0<f30> h(@s("id") @NotNull String id3, @t("story_pin_version") @NotNull String version, @t("fields") String fields);

    @p("pins/{pinId}/sponsored/untag/")
    @NotNull
    b0<f30> i(@s("pinId") @NotNull String pinId);

    @sq2.f("storypins/checklink/")
    @NotNull
    b0<tt1.a<rp>> j(@t("link") @NotNull String link);

    @sq2.f("products/find/")
    @NotNull
    b0<tt1.a<u>> k(@t("url") @NotNull String url, @t("source") @NotNull String source);

    @p(PinService.PINS_URL)
    @NotNull
    @sq2.e
    b0<tt1.a<f30>> l(@sq2.c("image_url") @NotNull String imageUrl, @sq2.c("board_id") @NotNull String boardId, @sq2.c("source_url") @NotNull String sourceUrl, @sq2.c("affiliate_url") String affiliateUrl, @sq2.c("method") @NotNull String method);

    @sq2.f("storypins/{pinUid}/products/")
    @NotNull
    b0<tt1.a<List<f30>>> loadTaggedProducts(@s("pinUid") @NotNull String pinUid, @t("fields") @NotNull String fields);

    @o("storypins/feedback/")
    @NotNull
    @sq2.e
    b0<tt1.a<ul0>> m(@sq2.c("story_pin_feedback") @NotNull String storyPinFeedback);
}
