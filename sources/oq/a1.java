package oq;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import kotlin.jvm.internal.Intrinsics;
import rq.v4;
import so.jb;

/* loaded from: classes3.dex */
public final class a1 extends FrameLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f96945a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96946b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96947c;

    /* renamed from: d, reason: collision with root package name */
    public final String f96948d;

    /* renamed from: e, reason: collision with root package name */
    public lo.e f96949e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96950f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f96951g;

    /* renamed from: h, reason: collision with root package name */
    public v4 f96952h;

    /* renamed from: i, reason: collision with root package name */
    public final YouTubePlayerView f96953i;

    /* renamed from: j, reason: collision with root package name */
    public final m60.w f96954j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context, String str, String pinUid) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        if (!this.f96946b) {
            this.f96946b = true;
            this.f96954j = (m60.w) ((jb) ((b1) generatedComponent())).f113483a.f113885r0.get();
        }
        this.f96947c = str;
        this.f96948d = pinUid;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.checkNotNullParameter(context2, "context");
        YouTubePlayerView youTubePlayerView = new YouTubePlayerView(context2, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, youTubePlayerView.getResources().getDimensionPixelSize(m60.r0.lego_floating_nav_bottom_bar_height), 0, 0);
        youTubePlayerView.setLayoutParams(layoutParams);
        youTubePlayerView.f34789b = false;
        addView(youTubePlayerView);
        this.f96953i = youTubePlayerView;
        po.a youTubePlayerListener = new po.a(this, 2);
        Intrinsics.checkNotNullParameter(youTubePlayerListener, "youTubePlayerListener");
        if (youTubePlayerView.f34789b) {
            throw new IllegalStateException("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false");
        }
        LegacyYouTubePlayerView legacyYouTubePlayerView = youTubePlayerView.f34788a;
        legacyYouTubePlayerView.getClass();
        Intrinsics.checkNotNullParameter(youTubePlayerListener, "youTubePlayerListener");
        legacyYouTubePlayerView.a(youTubePlayerListener, true, no.b.f91652b);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f96945a == null) {
            this.f96945a = new ye2.o(this);
        }
        return this.f96945a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            m60.w wVar = this.f96954j;
            if (wVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            wVar.d(new ls1.l(ls1.k.DISABLE));
        } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            m60.w wVar2 = this.f96954j;
            if (wVar2 == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            wVar2.d(new ls1.l(ls1.k.ENABLE));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f96945a == null) {
            this.f96945a = new ye2.o(this);
        }
        return this.f96945a.generatedComponent();
    }
}
