package com.pinterest.feature.gridactions.modal.view;

import androidx.annotation.Keep;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uj2.q;
import uk1.d;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/pinterest/feature/gridactions/modal/view/OverflowMenuModalProviderImpl;", "", "", "sourceId", "Lcom/pinterest/api/model/v7;", "board", "Lcom/pinterest/api/model/wy0;", "user", "Luk1/d;", "pinalytics", "Luj2/q;", "", "networkStateStream", "Ljc0/b;", "create", "(Ljava/lang/String;Lcom/pinterest/api/model/v7;Lcom/pinterest/api/model/wy0;Luk1/d;Luj2/q;)Ljc0/b;", "<init>", "()V", "pinOverflowMenuModalLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class OverflowMenuModalProviderImpl {
    @NotNull
    public jc0.b create(@NotNull String sourceId, @NotNull v7 board, @NotNull wy0 user, @NotNull d pinalytics, @NotNull q<Boolean> networkStateStream) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        return new gs0.a(sourceId, board, user, pinalytics, networkStateStream);
    }
}
