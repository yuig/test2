package com.pinterest.video.view;

import ac2.c1;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.DefaultTimeBar;
import kh2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/video/view/PinterestDefaultTimeBar;", "Landroidx/media3/ui/DefaultTimeBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "org/chromium/net/y", "video_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class PinterestDefaultTimeBar extends DefaultTimeBar {
    public long Q;
    public long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinterestDefaultTimeBar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.media3.ui.DefaultTimeBar, androidx.media3.ui.t0
    public final void a(long j13) {
        super.a(j13);
        this.R = j13;
        setContentDescription(p());
    }

    @Override // androidx.media3.ui.DefaultTimeBar, androidx.media3.ui.t0
    public final void b(long j13) {
        super.b(j13);
        this.Q = j13;
    }

    @Override // androidx.media3.ui.DefaultTimeBar, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(event);
        if (event.getEventType() == 4) {
            event.getText().add(p());
        }
        event.setClassName("android.widget.SeekBar");
    }

    @Override // androidx.media3.ui.DefaultTimeBar, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
        Intrinsics.checkNotNullParameter(info2, "info");
        super.onInitializeAccessibilityNodeInfo(info2);
        info2.setClassName("android.widget.SeekBar");
        info2.setContentDescription(p());
        if (this.Q <= 0) {
            return;
        }
        info2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        info2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    public final String p() {
        Resources resources = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String G = d.G(resources, this.R);
        Resources resources2 = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        String G2 = d.G(resources2, this.Q);
        if (G.length() == 0 || G2.length() == 0) {
            return "";
        }
        String string = getResources().getString(c1.video_playback_progress_content_description, G, G2);
        Intrinsics.f(string);
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinterestDefaultTimeBar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
