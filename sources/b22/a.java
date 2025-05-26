package b22;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.t;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001JB\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\nJN\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lb22/a;", "", "", "fields", "pageSize", "bookmark", "filterType", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lo12/b;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "filter", "sort", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {
    @sq2.f("users/me/boards/feed/")
    Object a(@t("fields") @NotNull String str, @t("page_size") @NotNull String str2, @t("bookmark") String str3, @t("filter") String str4, @t("sort") String str5, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @sq2.f("users/me/pins/activity/")
    Object b(@t("fields") @NotNull String str, @t("page_size") @NotNull String str2, @t("bookmark") String str3, @t("filter_type") String str4, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);
}
