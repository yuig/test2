package m20;

import com.pinterest.api.model.q40;
import kotlin.Metadata;
import nm.s;
import org.jetbrains.annotations.NotNull;
import sq2.c;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JK\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\u000b\u0010\fJY\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\t2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lm20/b;", "", "", "query", "language", "corpus", "", "limit", "minLevel", "Luj2/b0;", "Lcom/pinterest/api/model/q40;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Luj2/b0;", "pinId", "interestIds", "freeformTags", "data_source", "zen_source", "Ltt1/a;", "Lnm/s;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Luj2/b0;", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface b {
    @f("manual_tags/search/")
    @NotNull
    b0<q40> a(@t("query") @NotNull String query, @t("language") @NotNull String language, @t("corpus") @NotNull String corpus, @t("limit") Integer limit, @t("min_level") Integer minLevel);

    @o("interest_tagger/pin/{pinId}/interests/")
    @NotNull
    @e
    b0<tt1.a<s>> b(@sq2.s("pinId") @NotNull String pinId, @c("interest_ids") @NotNull String interestIds, @c("freeform_tags") @NotNull String freeformTags, @c("data_source") @NotNull String data_source, @c("zen_source") Integer zen_source, @c("language") @NotNull String language);
}
