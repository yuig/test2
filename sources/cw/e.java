package cw;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.c0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.widget.configuration.k;
import es.h;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pk.a0;
import so.jb;
import so.oa;
import u50.f0;
import wi.d0;
import yv.g;

/* loaded from: classes3.dex */
public final class e extends g {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f53321w = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f53322s;

    /* renamed from: t, reason: collision with root package name */
    public w f53323t;

    /* renamed from: u, reason: collision with root package name */
    public final c0 f53324u;

    /* renamed from: v, reason: collision with root package name */
    public final b f53325v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        b();
        this.f53324u = new c0(this, 6);
        this.f53325v = new b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    @Override // yv.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cw.e.X():void");
    }

    public final PinterestRecyclerView Z() {
        try {
            ViewParent parent = getParent();
            while (!(parent instanceof PinterestRecyclerView)) {
                parent = parent.getParent();
            }
            return (PinterestRecyclerView) parent;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // yv.h
    public final void a3(float f13) {
        this.f140194r = f13;
    }

    @Override // xv.j
    public final void b() {
        if (this.f53322s) {
            return;
        }
        this.f53322s = true;
        jb jbVar = (jb) ((f) generatedComponent());
        this.f140179c = jbVar.a();
        this.f140180d = (ni1.d) jbVar.f113485c.f114551x.get();
        oa oaVar = jbVar.f113483a;
        this.f140181e = (pb0.a) oaVar.f113834o1.get();
        this.f140182f = (h) oaVar.f113735i7.get();
        k.y2(oaVar.f113638d);
        this.f53323t = (w) oaVar.f113885r0.get();
    }

    @Override // yv.h
    public final void o2() {
        d0 videoController;
        bj.b bVar = t().f32095b;
        if (bVar == null || (videoController = bVar.getVideoController()) == null) {
            return;
        }
        videoController.play();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w wVar = this.f53323t;
        if (wVar != null) {
            wVar.h(this.f53325v);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        w wVar = this.f53323t;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.f53325v);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i13) {
        d0 videoController;
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i13);
        bj.b bVar = t().f32095b;
        if (bVar == null || !bVar.getHasVideoContent() || i13 == 0 || (videoController = bVar.getVideoController()) == null) {
            return;
        }
        videoController.pause();
    }

    @Override // yv.g, yv.h
    public final void q3() {
        PinterestRecyclerView Z = Z();
        if (Z != null) {
            Z.e(this.f53324u);
        }
    }

    @Override // y92.g
    public final boolean resizable() {
        return false;
    }

    @Override // yv.g
    public final int s() {
        return j().r3();
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        return j().s3();
    }

    @Override // yv.g
    public final int x() {
        return RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL;
    }

    @Override // yv.h
    public final void x0(bj.f nativeAd) {
        d0 videoController;
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        z().f32084a.a(q(), "3001");
        z().f32084a.a(D(), "3005");
        z().f32084a.a(n(), "3002");
        GestaltText q13 = q();
        String string = nativeAd.getHeadline();
        if (string == null) {
            string = "";
        }
        Intrinsics.checkNotNullParameter(string, "string");
        a0.q(q13, new f0(string));
        GestaltText D = D();
        String string2 = nativeAd.getAdvertiser();
        if (string2 == null) {
            string2 = "";
        }
        Intrinsics.checkNotNullParameter(string2, "string");
        a0.q(D, new f0(string2));
        GestaltText n13 = n();
        String callToAction = nativeAd.getCallToAction();
        String string3 = callToAction != null ? callToAction : "";
        Intrinsics.checkNotNullParameter(string3, "string");
        a0.q(n13, new f0(string3));
        GestaltText k13 = k();
        String string4 = l();
        Intrinsics.checkNotNullParameter(string4, "string");
        a0.q(k13, new f0(string4));
        final int i13 = 0;
        m().setOnClickListener(new View.OnClickListener(this) { // from class: cw.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f53313b;

            {
                this.f53313b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                e this$0 = this.f53313b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        View b13 = this$0.z().f32084a.b("3002");
                        if (b13 != null) {
                            b13.performClick();
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.Y();
                        break;
                }
            }
        });
        t().a(nativeAd.getMediaContent());
        String p33 = j().p3();
        final int i14 = 1;
        if (p33 == null || p33.length() == 0) {
            z().f32084a.a(g(), "3011");
        } else {
            g().setOnClickListener(new View.OnClickListener(this) { // from class: cw.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f53313b;

                {
                    this.f53313b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i14;
                    e this$0 = this.f53313b;
                    switch (i142) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            View b13 = this$0.z().f32084a.b("3002");
                            if (b13 != null) {
                                b13.performClick();
                                break;
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.Y();
                            break;
                    }
                }
            });
        }
        if (nativeAd.getMediaContent().getHasVideoContent()) {
            bj.b mediaContent = nativeAd.getMediaContent();
            if (mediaContent != null) {
                if (mediaContent.getHasVideoContent()) {
                    d0 videoController2 = mediaContent.getVideoController();
                    if ((videoController2 != null ? videoController2.getVideoLifecycleCallbacks() : null) == null && (videoController = mediaContent.getVideoController()) != null) {
                        videoController.setVideoLifecycleCallbacks(new aw.e(this, i14));
                    }
                }
                PinterestRecyclerView Z = Z();
                if (Z != null) {
                    Z.b(this.f53324u);
                }
            }
            t().a(nativeAd.getMediaContent());
        }
        z().a(nativeAd, t());
        yv.f j13 = j();
        o();
        j13.w3(System.currentTimeMillis() - this.f140183g);
    }
}
