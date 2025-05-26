package kv1;

import com.appsflyer.AdRevenueScheme;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.qz;
import com.pinterest.api.model.uz;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.t;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JN\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\rJ^\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\tj\u0002`\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lkv1/a;", "", "", "age", "", "gender", AdRevenueScheme.COUNTRY, "locale", "fields", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "", "Lcom/pinterest/api/model/qz;", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "selectedUseCaseIds", "Lcom/pinterest/api/model/uz;", "c", "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "", "Lcom/pinterest/api/adapter/coroutine/CompletedResponse;", "b", "(Lbl2/c;)Ljava/lang/Object;", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {
    @f("nux/usecases/")
    Object a(@t("age") int i13, @t("gender") @NotNull String str, @t("country") @NotNull String str2, @t("locale") @NotNull String str3, @t("fields") @NotNull String str4, @NotNull bl2.c<? super NetworkResponse<? extends List<? extends qz>>> cVar);

    @f("orientation/feed/")
    Object b(@NotNull bl2.c<? super NetworkResponse<Unit>> cVar);

    @f("nux/usecases/pins/")
    Object c(@t("selected_use_cases") @NotNull List<String> list, @t("age") int i13, @t("gender") @NotNull String str, @t("country") @NotNull String str2, @t("locale") @NotNull String str3, @t("fields") @NotNull String str4, @NotNull bl2.c<? super NetworkResponse<? extends List<? extends uz>>> cVar);
}
