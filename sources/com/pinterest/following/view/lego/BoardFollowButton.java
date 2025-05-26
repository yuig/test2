package com.pinterest.following.view.lego;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.api.model.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s60.a;
import s60.b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/following/view/lego/BoardFollowButton;", "Lcom/pinterest/following/view/lego/FollowButton;", "Lcom/pinterest/api/model/v7;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "followingLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardFollowButton extends FollowButton<v7> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFollowButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a idProvider = (127 & 32) != 0 ? new a(null, 1) : null;
        b auxDataProvider = (127 & 64) != 0 ? new b(1, null) : null;
        Intrinsics.checkNotNullParameter(idProvider, "idProvider");
        Intrinsics.checkNotNullParameter(auxDataProvider, "auxDataProvider");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFollowButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        a idProvider = (127 & 32) != 0 ? new a(null, 1) : null;
        b auxDataProvider = (127 & 64) != 0 ? new b(1, null) : null;
        Intrinsics.checkNotNullParameter(idProvider, "idProvider");
        Intrinsics.checkNotNullParameter(auxDataProvider, "auxDataProvider");
    }
}
