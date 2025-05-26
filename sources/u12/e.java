package u12;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.zs;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.p;
import sq2.s;
import sq2.t;
import sq2.u;
import uj2.b0;
import uj2.l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014JL\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lu12/e;", "", "", "interestId", "fields", "Luj2/b0;", "Lcom/pinterest/api/model/zs;", "f", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "", "params", "Luj2/l;", "c", "(Ljava/lang/String;Ljava/util/Map;)Luj2/l;", "Luj2/b;", "e", "(Ljava/lang/String;Ljava/util/Map;)Luj2/b;", "nameOrUid", "pageSize", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/l;", "limit", "blendType", "bookmark", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lo12/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface e {
    @sq2.f("users/me/interests/")
    Object a(@t("limit") @NotNull String str, @t("blend_type") @NotNull String str2, @t("fields") @NotNull String str3, @t("page_size") String str4, @t("bookmark") String str5, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @sq2.f("users/me/interests/favorited/")
    Object b(@t("fields") @NotNull String str, @t("page_size") String str2, @t("bookmark") String str3, @NotNull bl2.c<? super NetworkResponse<o12.b>> cVar);

    @p("users/me/interests/favorited/{interest_id}/")
    @NotNull
    l<zs> c(@s("interest_id") @NotNull String interestId, @NotNull @u Map<String, String> params);

    @sq2.f("klp/{nameOrUid}/")
    @NotNull
    l<zs> d(@s("nameOrUid") @NotNull String nameOrUid, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);

    @sq2.b("users/me/interests/favorited/{interest_id}/")
    @NotNull
    uj2.b e(@s("interest_id") @NotNull String interestId, @NotNull @u Map<String, String> params);

    @sq2.f("interests/{interestId}/")
    @NotNull
    b0<zs> f(@s("interestId") @NotNull String interestId, @t("fields") @NotNull String fields);
}
