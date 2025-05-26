package com.pinterest.feature.reporting.view;

import androidx.annotation.Keep;
import com.pinterest.api.model.az0;
import gs0.a;
import jc0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u51.q;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/pinterest/feature/reporting/view/ReportContentMainAdapterProviderImpl;", "", "Lcom/pinterest/api/model/az0;", "model", "Ljc0/b;", "create", "(Lcom/pinterest/api/model/az0;)Ljc0/b;", "<init>", "()V", "reportFlowLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ReportContentMainAdapterProviderImpl {
    @NotNull
    public b create(@NotNull az0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        a aVar = new a(model, new q());
        Intrinsics.checkNotNullExpressionValue(aVar, "newModal(...)");
        return aVar;
    }
}
