package l22;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.kr;
import java.util.List;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import sq2.e;
import sq2.f;
import sq2.l;
import sq2.o;
import sq2.p;
import sq2.q;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH'¢\u0006\u0004\b\r\u0010\u000eJ\u0087\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJW\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b$\u0010\bJ%\u0010&\u001a\u00020\f2\b\b\u0001\u0010%\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b&\u0010'J/\u0010*\u001a\u00020\f2\b\b\u0001\u0010(\u001a\u00020\u00102\b\b\u0001\u0010)\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b*\u0010+J%\u0010,\u001a\u00020\f2\b\b\u0001\u0010%\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b,\u0010'J/\u0010-\u001a\u00020\f2\b\b\u0001\u0010(\u001a\u00020\u00102\b\b\u0001\u0010)\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b-\u0010+J/\u0010/\u001a\u00020\f2\b\b\u0001\u0010%\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010.\u001a\u00020\u0019H'¢\u0006\u0004\b/\u00100J%\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u00052\b\b\u0001\u00102\u001a\u000201H'¢\u0006\u0004\b5\u00106ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0001"}, d2 = {"Ll22/a;", "", "", "didItUid", "paramFields", "Luj2/b0;", "Lcom/pinterest/api/model/az0;", "b", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "reason", "", "detailedReasonList", "Luj2/b;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Luj2/b;", "pinUid", "", "didItType", "imageSignature", "details", "textTags", "fields", "videoTrackingIds", "videoSignatures", "paragraphBlock", "", "force", "d", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Luj2/b0;", "userDidItData", "pinId", "", "recommendScore", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "Lcom/pinterest/api/model/f3;", "h", "userDidItUid", "f", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "modelType", "commentId", "c", "(ILjava/lang/String;Ljava/lang/String;)Luj2/b;", "k", "i", "highlight", "e", "(Ljava/lang/String;Ljava/lang/String;Z)Luj2/b;", "Lokhttp3/MultipartBody$Part;", "image", "Ltt1/a;", "Lcom/pinterest/api/model/kr;", "g", "(Lokhttp3/MultipartBody$Part;)Luj2/b0;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {
    @p("did_it/{user_did_it_data}/")
    @NotNull
    @e
    b0<az0> a(@s("user_did_it_data") @NotNull String userDidItData, @t("fields") @NotNull String fields, @sq2.c("pin") @NotNull String pinId, @sq2.c("recommend_score") Float recommendScore, @sq2.c("image_signatures") String imageSignature, @sq2.c("details") String details);

    @f("did_it/{didItUid}/")
    @NotNull
    b0<az0> b(@s("didItUid") @NotNull String didItUid, @t("fields") @NotNull String paramFields);

    @o("/v3/helpful/{modelType}/{commentId}/")
    @NotNull
    @e
    uj2.b c(@s("modelType") int modelType, @s("commentId") @NotNull String commentId, @sq2.c("pin") String pinId);

    @o("did_it/")
    @NotNull
    @e
    b0<az0> d(@sq2.c("pin") @NotNull String pinUid, @sq2.c("did_it_type") int didItType, @sq2.c("image_signatures") String imageSignature, @sq2.c("details") String details, @sq2.c("text_tags") String textTags, @t("fields") @NotNull String fields, @sq2.c("video_tracking_ids") String videoTrackingIds, @sq2.c("video_signatures") String videoSignatures, @sq2.c("paragraph_block") String paragraphBlock, @sq2.c("force") Boolean force);

    @p("/v3/did_it/pin/highlight/")
    @NotNull
    @e
    uj2.b e(@sq2.c("user_did_it_data") @NotNull String userDidItUid, @sq2.c("pin") String pinId, @sq2.c("highlight") boolean highlight);

    @o("did_it/{user_did_it_data}/like/")
    @NotNull
    @e
    uj2.b f(@s("user_did_it_data") @NotNull String userDidItUid, @sq2.c("pin") String pinId);

    @l
    @p("did_it/image/upload/")
    @NotNull
    b0<tt1.a<kr>> g(@NotNull @q MultipartBody.Part image);

    @sq2.b("did_it/{user_did_it_data}/")
    @NotNull
    b0<f3> h(@s("user_did_it_data") @NotNull String userDidItData, @t("pin") String pinId);

    @sq2.b("/v3/helpful/{modelType}/{commentId}/")
    @NotNull
    uj2.b i(@s("modelType") int modelType, @s("commentId") @NotNull String commentId, @t("pin") String pinId);

    @p("did_it/{didItUid}/flag/")
    @NotNull
    @e
    uj2.b j(@s("didItUid") @NotNull String didItUid, @sq2.c("reason") String reason, @sq2.c("detailed_reasons") List<String> detailedReasonList);

    @sq2.b("did_it/{user_did_it_data}/like/")
    @NotNull
    uj2.b k(@s("user_did_it_data") @NotNull String userDidItUid, @t("pin") String pinId);
}
