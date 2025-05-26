package com.pinterest.handshake.model;

import android.net.Uri;
import androidx.annotation.Keep;
import bl2.c;
import com.pinterest.handshake.model.models.HandshakeDataConnect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\u0010\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/pinterest/handshake/model/IHandshakeRemoteDataSource;", "", "Lcom/pinterest/handshake/model/models/HandshakeDataConnect;", "getApiKey", "(Lbl2/c;)Ljava/lang/Object;", "", "deleteToken", "", "token", "", "authType", "linkAccount", "(Ljava/lang/String;ILbl2/c;)Ljava/lang/Object;", "Landroid/net/Uri;", "getLoginUrl", "(ILbl2/c;)Ljava/lang/Object;", "getToken", "handshakeLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface IHandshakeRemoteDataSource {
    Object deleteToken(@NotNull c<? super Boolean> cVar);

    Object getApiKey(@NotNull c<? super HandshakeDataConnect> cVar);

    Object getLoginUrl(int i13, @NotNull c<? super Uri> cVar);

    Object getToken(@NotNull c<? super String> cVar);

    Object linkAccount(@NotNull String str, int i13, @NotNull c<? super String> cVar);
}
