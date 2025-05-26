package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebView;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lo.e;
import lo.h;
import mo.b;
import org.jetbrains.annotations.NotNull;
import po.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/WebViewYouTubePlayer;", "Landroid/webkit/WebView;", "Llo/e;", "Llo/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class WebViewYouTubePlayer extends WebView implements e, h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34784d = 0;

    /* renamed from: a, reason: collision with root package name */
    public Function1 f34785a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f34786b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f34787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewYouTubePlayer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34786b = new HashSet();
        this.f34787c = new Handler(Looper.getMainLooper());
    }

    public final boolean a(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.f34786b.add(listener);
    }

    public final void b(String videoId, float f13) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        this.f34787c.post(new c(this, videoId, f13, 1));
    }

    public final Collection c() {
        Collection unmodifiableCollection = Collections.unmodifiableCollection(new HashSet(this.f34786b));
        Intrinsics.checkNotNullExpressionValue(unmodifiableCollection, "unmodifiableCollection(H…(youTubePlayerListeners))");
        return unmodifiableCollection;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f34786b.clear();
        this.f34787c.removeCallbacksAndMessages(null);
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i13) {
        super.onWindowVisibilityChanged(i13);
    }
}
