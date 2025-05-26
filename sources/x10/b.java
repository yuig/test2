package x10;

import com.pinterest.api.model.f30;
import java.util.Map;
import kotlin.Metadata;
import l32.f;
import org.jetbrains.annotations.NotNull;
import sq2.e;
import sq2.j;
import sq2.o;
import sq2.p;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0017\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J]\u0010\u001b\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cJE\u0010\u001f\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00042\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001f\u0010\u000bJO\u0010#\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00142\b\b\u0001\u0010 \u001a\u00020\u00152\b\b\u0001\u0010!\u001a\u00020\u00042\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b#\u0010$J?\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u00022\u0014\b\u0001\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&H'¢\u0006\u0004\b*\u0010+J=\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010(2\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u00022\b\b\u0001\u0010/\u001a\u00020\u0002H'¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b2\u0010\u000fJ/\u00103\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b3\u0010\u0011J#\u00104\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b4\u0010\u0013J-\u00105\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b5\u0010\u0018J\u0019\u00106\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b6\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0001"}, d2 = {"Lx10/b;", "", "", "pinUid", "", "feedbackType", "sourceUid", "recommendationUid", "clientTrackingParam", "Luj2/b;", "e", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Luj2/b;", "l", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "a", "(Ljava/lang/String;)Luj2/b;", "f", "(Ljava/lang/String;ILjava/lang/String;)Luj2/b;", "p", "(Ljava/lang/String;I)Luj2/b;", "Ll32/c;", "Ll32/f;", "reason", "g", "(Ljava/lang/String;Ll32/c;Ll32/f;)Luj2/b;", "pinCreatorId", "throughProperties", "k", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "sourceId", "recommendationId", "o", "complaintReason", "recommendationReasonId", "throughId", "i", "(Ljava/lang/String;Ll32/c;Ll32/f;ILjava/lang/String;Ljava/lang/String;)Luj2/b;", "fields", "", "headerMap", "Luj2/b0;", "Lcom/pinterest/api/model/f30;", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Luj2/b0;", "link", "title", "description", "statusCode", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "j", "b", "c", "d", "n", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface b {
    @p("p2p/{pinUid}/unhide/")
    @NotNull
    uj2.b a(@s("pinUid") @NotNull String pinUid);

    @p("thirdpartyad/{pinUid}/feedback/")
    @NotNull
    uj2.b b(@s("pinUid") @NotNull String pinUid, @t("feedback_type") int feedbackType, @t("client_tracking_params") String clientTrackingParam);

    @p("thirdpartyad/{pinUid}/feedback/undo/")
    @NotNull
    uj2.b c(@s("pinUid") @NotNull String pinUid, @t("feedback_type") int feedbackType);

    @p("thirdpartyad/{pinUid}/feedback/reason/")
    @NotNull
    uj2.b d(@s("pinUid") @NotNull String pinUid, @t("feedback_type") @NotNull l32.c feedbackType, @t("complaint_reason") @NotNull f reason);

    @p("pfy/{pinUid}/feedback/undo/")
    @NotNull
    uj2.b e(@s("pinUid") @NotNull String pinUid, @t("feedback_type") int feedbackType, @t("through_id") String sourceUid, @t("rec_reason_type") int recommendationUid, @t("client_tracking_params") String clientTrackingParam);

    @p("promoted/{pinUid}/feedback/")
    @NotNull
    uj2.b f(@s("pinUid") @NotNull String pinUid, @t("feedback_type") int feedbackType, @t("client_tracking_params") String clientTrackingParam);

    @p("promoted/{pinUid}/feedback/reason/")
    @NotNull
    uj2.b g(@s("pinUid") @NotNull String pinUid, @t("feedback_type") @NotNull l32.c feedbackType, @t("complaint_reason") @NotNull f reason);

    @o("rich_pins/browser_data/")
    @NotNull
    @e
    b0<Object> h(@sq2.c("link") @NotNull String link, @sq2.c("title") @NotNull String title, @sq2.c("description") @NotNull String description, @sq2.c("status_code") @NotNull String statusCode);

    @p("pfy/{pinUid}/feedback/reason/")
    @NotNull
    uj2.b i(@s("pinUid") @NotNull String pinUid, @t("feedback_type") @NotNull l32.c feedbackType, @t("complaint_reason") @NotNull f complaintReason, @t("rec_reason_id") int recommendationReasonId, @t("through_id") String throughId, @t("through_properties") String throughProperties);

    @p("pfy/{pinUid}/feedback/?feedback_type=1")
    @NotNull
    uj2.b j(@s("pinUid") @NotNull String pinUid);

    @p("pfy/{pinUid}/feedback/")
    @NotNull
    uj2.b k(@s("pinUid") @NotNull String pinUid, @t("feedback_type") int feedbackType, @t("through_id") String sourceUid, @t("rec_reason_type") int recommendationUid, @t("client_tracking_params") String clientTrackingParam, @t("pin_creator_id") String pinCreatorId, @t("through_properties") String throughProperties);

    @p("p2p/{pinUid}/hide/")
    @NotNull
    uj2.b l(@s("pinUid") @NotNull String pinUid, @t("client_tracking_params") String clientTrackingParam);

    @sq2.f("pins/{pinUid}/")
    @NotNull
    b0<f30> m(@s("pinUid") @NotNull String pinUid, @t("fields") @NotNull String fields, @j @NotNull Map<String, String> headerMap);

    @sq2.b("pins/{pinUid}/products/")
    @NotNull
    uj2.b n(@s("pinUid") @NotNull String pinUid);

    @p("pfy/{pinUid}/secondary_feedback/")
    @NotNull
    uj2.b o(@s("pinUid") @NotNull String pinUid, @t("feedback_type") int feedbackType, @t("through_id") String sourceId, @t("rec_reason_type") int recommendationId, @t("through_properties") String throughProperties);

    @p("promoted/{pinUid}/feedback/undo/")
    @NotNull
    uj2.b p(@s("pinUid") @NotNull String pinUid, @t("feedback_type") int feedbackType);
}
