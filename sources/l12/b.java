package l12;

import com.pinterest.api.model.xk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qr0.e;
import sq2.f;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JK\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\fJs\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Ll12/b;", "", "", "pinId", "fields", "addFields", "", "utcOffsetTime", "version", "Luj2/b0;", "Lcom/pinterest/api/model/xk;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Luj2/b0;", "articleId", "utcOffset", "pageSize", "dynamicGridStories", "requestParams", "shopSource", "Lqr0/e;", "b", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)Luj2/b0;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface b {
    @f("explore/article/{articleId}/")
    @NotNull
    b0<xk> a(@s("articleId") @NotNull String pinId, @t("fields") String fields, @t("add_fields") String addFields, @t("utc_offset") int utcOffsetTime, @t("version") int version);

    @f("explore/article/{articleId}/contents/")
    @NotNull
    b0<e> b(@s("articleId") @NotNull String articleId, @t("utc_offset") int utcOffset, @t("fields") @NotNull String fields, @t("add_fields") @NotNull String addFields, @t("version") int version, @t("page_size") int pageSize, @t("dynamic_grid_stories") int dynamicGridStories, @t("request_params") String requestParams, @t("shop_source") String shopSource);
}
