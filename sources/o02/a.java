package o02;

import bl2.c;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.wy0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p02.b;
import p02.v;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.s;
import sq2.t;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JL\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014JT\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00170\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lo02/a;", "", "", "action", "", "pageSize", "actAsUser", "bookmark", "fields", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lp02/b;", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "", "Lcom/pinterest/api/model/wy0;", "c", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "actionId", "Lp02/v;", "b", "(Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "explanation", "attachmentBase64", "Ltt1/a;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface a {
    @f("/v3/reports_and_violations_center/{action}/")
    Object a(@s("action") @NotNull String str, @t("page_size") int i13, @t("act_as_user") String str2, @t("bookmark") String str3, @t("fields") @NotNull String str4, @NotNull c<? super NetworkResponse<b>> cVar);

    @f("/v3/reports_and_violations_center/statement_of_reasons/")
    Object b(@t("action_id") @NotNull String str, @t("act_as_user") String str2, @NotNull c<? super NetworkResponse<v>> cVar);

    @f("/v3/reports_and_violations_center/user_linked_business_accounts/")
    Object c(@t("fields") @NotNull String str, @NotNull c<? super NetworkResponse<? extends List<? extends wy0>>> cVar);

    @o("/v3/reports_and_violations_center/{action}/appeal/")
    @e
    Object d(@s("action") @NotNull String str, @sq2.c("action_id") @NotNull String str2, @sq2.c("explanation") String str3, @sq2.c("act_as_user") String str4, @sq2.c("attachment_base64") String str5, @NotNull c<? super NetworkResponse<? extends tt1.a<Object>>> cVar);
}
