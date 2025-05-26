package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.n0;
import androidx.lifecycle.y;
import db.m;
import java.util.HashSet;
import k1.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import oo.b;
import oo.d;
import org.jetbrains.annotations.NotNull;
import po.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001d\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/SixteenByNineFrameLayout;", "Landroidx/lifecycle/y;", "", "release", "()V", "onResume$core_release", "onResume", "onStop$core_release", "onStop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class LegacyYouTubePlayerView extends SixteenByNineFrameLayout implements y {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewYouTubePlayer f34777a;

    /* renamed from: b, reason: collision with root package name */
    public final b f34778b;

    /* renamed from: c, reason: collision with root package name */
    public final d f34779c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34780d;

    /* renamed from: e, reason: collision with root package name */
    public s f34781e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f34782f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34783g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyYouTubePlayerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        WebViewYouTubePlayer webViewYouTubePlayer = new WebViewYouTubePlayer(context, null, 0);
        this.f34777a = webViewYouTubePlayer;
        b bVar = new b();
        this.f34778b = bVar;
        d dVar = new d();
        this.f34779c = dVar;
        this.f34781e = po.b.f100864i;
        this.f34782f = new HashSet();
        this.f34783g = true;
        addView(webViewYouTubePlayer, new FrameLayout.LayoutParams(-1, -1));
        webViewYouTubePlayer.a(dVar);
        webViewYouTubePlayer.a(new a(this, 0));
        webViewYouTubePlayer.a(new a(this, 1));
        m mVar = new m(this, 3);
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        bVar.f96794c = mVar;
    }

    public final void a(mo.a youTubePlayerListener, boolean z13, no.b playerOptions) {
        Intrinsics.checkNotNullParameter(youTubePlayerListener, "youTubePlayerListener");
        Intrinsics.checkNotNullParameter(playerOptions, "playerOptions");
        if (this.f34780d) {
            throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
        }
        if (z13) {
            getContext().registerReceiver(this.f34778b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        q qVar = new q(this, playerOptions, youTubePlayerListener, 7);
        this.f34781e = qVar;
        if (z13) {
            return;
        }
        qVar.invoke();
    }

    @n0(androidx.lifecycle.q.ON_RESUME)
    public final void onResume$core_release() {
        this.f34779c.f96796a = true;
        this.f34783g = true;
    }

    @n0(androidx.lifecycle.q.ON_STOP)
    public final void onStop$core_release() {
        WebViewYouTubePlayer webViewYouTubePlayer = this.f34777a;
        webViewYouTubePlayer.f34787c.post(new po.d(webViewYouTubePlayer, 0));
        this.f34779c.f96796a = false;
        this.f34783g = false;
    }

    @n0(androidx.lifecycle.q.ON_DESTROY)
    public final void release() {
        WebViewYouTubePlayer webViewYouTubePlayer = this.f34777a;
        removeView(webViewYouTubePlayer);
        webViewYouTubePlayer.removeAllViews();
        webViewYouTubePlayer.destroy();
        try {
            getContext().unregisterReceiver(this.f34778b);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyYouTubePlayerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
