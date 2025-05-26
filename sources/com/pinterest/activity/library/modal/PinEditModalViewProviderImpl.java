package com.pinterest.activity.library.modal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import aq.j;
import com.pinterest.api.model.f30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zp.c;
import zp.d1;
import zp.w0;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/pinterest/activity/library/modal/PinEditModalViewProviderImpl;", "Landroid/content/Context;", "context", "Lcom/pinterest/api/model/f30;", "pin", "Landroid/os/Bundle;", "savedInstanceState", "Lzp/c;", "create", "(Landroid/content/Context;Lcom/pinterest/api/model/f30;Landroid/os/Bundle;)Lzp/c;", "Laq/j;", "editablePinWrapper", "(Landroid/content/Context;Laq/j;Landroid/os/Bundle;)Lzp/c;", "<init>", "()V", "pin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PinEditModalViewProviderImpl {
    @NotNull
    public c create(@NotNull Context context, @NotNull j editablePinWrapper, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(editablePinWrapper, "editablePinWrapper");
        return new d1(context, editablePinWrapper, savedInstanceState);
    }

    @NotNull
    public c create(@NotNull Context context, @NotNull f30 pin, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pin, "pin");
        return new w0(context, pin, savedInstanceState);
    }
}
