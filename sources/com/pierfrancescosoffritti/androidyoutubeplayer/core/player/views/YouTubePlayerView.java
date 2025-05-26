package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.n0;
import androidx.lifecycle.q;
import androidx.lifecycle.y;
import java.util.LinkedHashSet;
import ko.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.b;
import org.jetbrains.annotations.NotNull;
import po.f;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u001d\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/SixteenByNineFrameLayout;", "Landroidx/lifecycle/y;", "", "onResume", "()V", "onStop", "release", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class YouTubePlayerView extends SixteenByNineFrameLayout implements y {

    /* renamed from: a, reason: collision with root package name */
    public final LegacyYouTubePlayerView f34788a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LegacyYouTubePlayerView legacyYouTubePlayerView = new LegacyYouTubePlayerView(context, null, 0);
        this.f34788a = legacyYouTubePlayerView;
        Intrinsics.checkNotNullParameter(this, "targetView");
        new LinkedHashSet();
        addView(legacyYouTubePlayerView, new FrameLayout.LayoutParams(-1, -1));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.YouTubePlayerView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl….YouTubePlayerView, 0, 0)");
        this.f34789b = obtainStyledAttributes.getBoolean(e.YouTubePlayerView_enableAutomaticInitialization, true);
        boolean z13 = obtainStyledAttributes.getBoolean(e.YouTubePlayerView_autoPlay, false);
        boolean z14 = obtainStyledAttributes.getBoolean(e.YouTubePlayerView_handleNetworkEvents, true);
        String string = obtainStyledAttributes.getString(e.YouTubePlayerView_videoId);
        obtainStyledAttributes.recycle();
        if (z13 && string == null) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
        }
        f fVar = new f(string, this, z13);
        if (this.f34789b) {
            legacyYouTubePlayerView.a(fVar, z14, b.f91652b);
        }
    }

    @n0(q.ON_RESUME)
    private final void onResume() {
        this.f34788a.onResume$core_release();
    }

    @n0(q.ON_STOP)
    private final void onStop() {
        this.f34788a.onStop$core_release();
    }

    @n0(q.ON_DESTROY)
    public final void release() {
        this.f34788a.release();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
