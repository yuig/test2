package w12;

import bl2.c;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.feature.newshub.model.NewsHubItemFeed;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.o;
import sq2.p;
import sq2.s;
import sq2.t;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JB\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u000fJ)\u0010\u0017\u001a\u00020\r2\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lw12/b;", "", "", "newsType", "paramFields", "paramPageSize", "bookmark", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lcom/pinterest/feature/newshub/model/NewsHubItemFeed;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "newsId", "link", "Luj2/b;", "c", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "interestId", "d", "a", "", "newsIds", "", "shouldHide", "b", "(Ljava/util/List;Z)Luj2/b;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface b {
    @sq2.b("news_hub/{news_id}/fatigue/{interest_id}/")
    @NotNull
    uj2.b a(@s("news_id") @NotNull String newsId, @s("interest_id") @NotNull String interestId);

    @p("news_hub/hide/batch/")
    @NotNull
    uj2.b b(@t("news_ids") @NotNull List<String> newsIds, @t("should_hide") boolean shouldHide);

    @o("/v3/news_hub/click/")
    @NotNull
    uj2.b c(@t("news_id_str") String newsId, @t("link") String link);

    @o("news_hub/{news_id}/fatigue/{interest_id}/")
    @NotNull
    uj2.b d(@s("news_id") @NotNull String newsId, @s("interest_id") @NotNull String interestId);

    @f("news_hub/feed/")
    Object e(@t("news_type") String str, @t("fields") @NotNull String str2, @t("page_size") @NotNull String str3, @t("bookmark") String str4, @NotNull c<? super NetworkResponse<? extends NewsHubItemFeed>> cVar);
}
