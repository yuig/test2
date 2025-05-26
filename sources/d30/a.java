package d30;

import bl2.c;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.vz0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.s;
import uj2.b0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Ld30/a;", "", "", "verifiedMerchantId", "Luj2/b0;", "Lcom/pinterest/api/model/vz0;", "a", "(Ljava/lang/String;)Luj2/b0;", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "b", "(Ljava/lang/String;Lbl2/c;)Ljava/lang/Object;", "verifiedMerchantLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @f("/v3/verified_merchants/{verifiedMerchantId}/")
    @NotNull
    b0<vz0> a(@s("verifiedMerchantId") @NotNull String verifiedMerchantId);

    @f("/v3/verified_merchants/{verifiedMerchantId}/")
    Object b(@s("verifiedMerchantId") @NotNull String str, @NotNull c<? super NetworkResponse<? extends vz0>> cVar);
}
