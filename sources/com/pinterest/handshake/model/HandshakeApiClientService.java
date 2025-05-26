package com.pinterest.handshake.model;

import androidx.annotation.Keep;
import bl2.c;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.j1;
import com.pinterest.api.model.n1;
import com.pinterest.api.model.z;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.b;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.t;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/pinterest/handshake/model/HandshakeApiClientService;", "", "Lcom/pinterest/api/adapter/coroutine/NetworkResponse;", "Lcom/pinterest/api/model/j1;", "getApiKey", "(Lbl2/c;)Ljava/lang/Object;", "Lcom/pinterest/api/model/n1;", "getToken", "Lvd0/c;", "unlinkToken", "", "code", "", "authType", "linkToken", "(Ljava/lang/String;Ljava/lang/Integer;Lbl2/c;)Ljava/lang/Object;", "Lcom/pinterest/api/model/z;", "getLoginUrl", "(Ljava/lang/Integer;Lbl2/c;)Ljava/lang/Object;", "handshakeLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface HandshakeApiClientService {
    @f("/v3/amazon/api_key/")
    Object getApiKey(@NotNull c<? super NetworkResponse<? extends j1>> cVar);

    @f("/v3/amazon/login_url/")
    Object getLoginUrl(@t("auth_type") Integer num, @NotNull c<? super NetworkResponse<? extends z>> cVar);

    @f("/v3/amazon/token/")
    Object getToken(@NotNull c<? super NetworkResponse<? extends n1>> cVar);

    @o("/v3/connect/amazon/")
    @e
    Object linkToken(@sq2.c("code") @NotNull String str, @sq2.c("auth_type") Integer num, @NotNull c<? super NetworkResponse<? extends n1>> cVar);

    @b("/v3/connect/amazon/")
    Object unlinkToken(@NotNull c<? super NetworkResponse<? extends vd0.c>> cVar);
}
