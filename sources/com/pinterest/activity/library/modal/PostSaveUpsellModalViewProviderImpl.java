package com.pinterest.activity.library.modal;

import android.content.Context;
import androidx.annotation.Keep;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rg0.n;
import zp.d;
import zp.g1;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/activity/library/modal/PostSaveUpsellModalViewProviderImpl;", "Landroid/content/Context;", "context", "Lcom/pinterest/api/model/f30;", "pin", "Lcom/pinterest/api/model/v7;", "board", "Lrg0/n;", "experienceValue", "Lzp/d;", "create", "(Landroid/content/Context;Lcom/pinterest/api/model/f30;Lcom/pinterest/api/model/v7;Lrg0/n;)Lzp/d;", "<init>", "()V", "pin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PostSaveUpsellModalViewProviderImpl {
    @NotNull
    public d create(@NotNull Context context, @NotNull f30 pin, @NotNull v7 board, @NotNull n experienceValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        return new g1(context, pin, board, experienceValue);
    }
}
