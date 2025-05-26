package com.pinterest.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import ar0.t;
import hb2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wk2.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0004\u0010\u0005R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/pinterest/ui/view/VideoViewabilityLinearLayout;", "Landroid/widget/LinearLayout;", "Lar0/t;", "", "observeVideoViewabilityEvents", "()V", "Lwk2/a;", "Lyh1/a;", "videoViewabilityRecyclerListenerProvider", "Lwk2/a;", "getVideoViewabilityRecyclerListenerProvider", "()Lwk2/a;", "setVideoViewabilityRecyclerListenerProvider", "(Lwk2/a;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "recyclerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class VideoViewabilityLinearLayout extends h implements t {
    public a videoViewabilityRecyclerListenerProvider;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoViewabilityLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final a getVideoViewabilityRecyclerListenerProvider() {
        a aVar = this.videoViewabilityRecyclerListenerProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("videoViewabilityRecyclerListenerProvider");
        throw null;
    }

    public final void observeVideoViewabilityEvents() {
        yh1.a aVar = (yh1.a) getVideoViewabilityRecyclerListenerProvider().get();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(aVar);
    }

    public final void setVideoViewabilityRecyclerListenerProvider(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.videoViewabilityRecyclerListenerProvider = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewabilityLinearLayout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
    }
}
