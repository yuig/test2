package w20;

import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.zv0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lw20/a;", "", "", "articleId", "fields", "Luj2/b0;", "Lcom/pinterest/api/model/zv0;", "b", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "", "numArticles", "validArticleDisplayTypes", "Lcom/pinterest/api/model/DynamicFeed;", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Luj2/b0;", "todayTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @f("today_articles/{articleId}/related/")
    @NotNull
    b0<DynamicFeed> a(@s("articleId") @NotNull String articleId, @t("num_articles") int numArticles, @t("display_types") @NotNull String validArticleDisplayTypes, @t("fields") @NotNull String fields);

    @f("today_articles/{articleId}/")
    @NotNull
    b0<zv0> b(@s("articleId") @NotNull String articleId, @t("fields") @NotNull String fields);
}
