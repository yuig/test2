package ab2;

import ac2.p1;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.uo0;
import com.pinterest.video.core.view.PinterestVideoView;
import et1.r0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.m4;
import ni1.e1;
import nx.d0;
import qf1.b0;
import u50.r;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f1767a;

    /* renamed from: b, reason: collision with root package name */
    public final PinterestVideoView f1768b;

    /* renamed from: c, reason: collision with root package name */
    public final r f1769c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.a f1770d;

    /* renamed from: e, reason: collision with root package name */
    public final lh0.j f1771e;

    /* renamed from: f, reason: collision with root package name */
    public final m4 f1772f;

    /* renamed from: g, reason: collision with root package name */
    public final p1 f1773g;

    /* renamed from: h, reason: collision with root package name */
    public final nc2.f f1774h;

    /* renamed from: i, reason: collision with root package name */
    public final es.a f1775i;

    /* renamed from: j, reason: collision with root package name */
    public final kv.a f1776j;

    /* renamed from: k, reason: collision with root package name */
    public final kv.c f1777k;

    /* renamed from: l, reason: collision with root package name */
    public final es.h f1778l;

    /* renamed from: m, reason: collision with root package name */
    public f30 f1779m;

    /* renamed from: n, reason: collision with root package name */
    public final m f1780n;

    /* renamed from: o, reason: collision with root package name */
    public String f1781o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1782p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1783q;

    /* renamed from: r, reason: collision with root package name */
    public final b0 f1784r;

    public n(d0 pinalytics, PinterestVideoView videoView, r eventIntake, lh0.j adsLibraryExperiments, m4 videoFeatureLibraryExperiments, p1 videoManagerUtil, nc2.f playabilityTracker, es.a adFormats, kv.a adsAudioOverlayPowerscoreExperimentManager, kv.c organicAudioOverlayPowerscoreExperimentManager, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(adsLibraryExperiments, "adsLibraryExperiments");
        Intrinsics.checkNotNullParameter(videoFeatureLibraryExperiments, "videoFeatureLibraryExperiments");
        Intrinsics.checkNotNullParameter(videoManagerUtil, "videoManagerUtil");
        Intrinsics.checkNotNullParameter(playabilityTracker, "playabilityTracker");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsAudioOverlayPowerscoreExperimentManager, "adsAudioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(organicAudioOverlayPowerscoreExperimentManager, "organicAudioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f1767a = pinalytics;
        this.f1768b = videoView;
        this.f1769c = eventIntake;
        this.f1770d = null;
        this.f1771e = adsLibraryExperiments;
        this.f1772f = videoFeatureLibraryExperiments;
        this.f1773g = videoManagerUtil;
        this.f1774h = playabilityTracker;
        this.f1775i = adFormats;
        this.f1776j = adsAudioOverlayPowerscoreExperimentManager;
        this.f1777k = organicAudioOverlayPowerscoreExperimentManager;
        this.f1778l = adsCommonDisplay;
        this.f1780n = new m(videoView);
        this.f1781o = "";
        this.f1784r = new b0(this, Unit.f80348a, 3);
    }

    public final void a() {
        if (this.f1782p) {
            m mVar = this.f1780n;
            PinterestVideoView pinterestVideoView = mVar.f1758a;
            pinterestVideoView.F0 = mVar.f1759b;
            pinterestVideoView.z(mVar.f1760c);
            PinterestVideoView pinterestVideoView2 = mVar.f1758a;
            pinterestVideoView2.g0(mVar.f1761d);
            pinterestVideoView2.O(mVar.f1762e);
            pinterestVideoView2.P(mVar.f1763f);
            pinterestVideoView2.M(mVar.f1764g);
            pinterestVideoView2.G0 = mVar.f1765h;
            pinterestVideoView2.u0(mVar.f1766i);
            this.f1782p = false;
        }
    }

    public final void b(f30 pin) {
        List t13;
        uo0 uo0Var;
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f1779m = pin;
        this.f1783q = n60.o.B(pin, "getIsPromoted(...)");
        dl0 v63 = pin.v6();
        if (v63 == null || (t13 = v63.t()) == null || (uo0Var = (uo0) t13.get(0)) == null) {
            return;
        }
        this.f1782p = true;
        this.f1781o = a.a.C(pin.getUid(), "-0");
        String uid = pin.getUid();
        PinterestVideoView pinterestVideoView = this.f1768b;
        pinterestVideoView.F0 = uid;
        pinterestVideoView.z(4);
        pinterestVideoView.g0(nc2.j.AUTOPLAY_MAYBE_WITH_NETWORK);
        pinterestVideoView.O(true);
        pinterestVideoView.P(true);
        pinterestVideoView.M(pinterestVideoView.getResources().getDimension(eo1.c.lego_corner_radius_medium));
        dl0 v64 = pin.v6();
        if (v64 != null && Intrinsics.d(v64.o(), Boolean.TRUE)) {
            this.f1769c.a(new e1(true, false));
        }
        List o13 = uo0Var.o();
        if (o13 != null) {
            Iterator it = o13.iterator();
            while (it.hasNext()) {
                ((ro0) it.next()).a(this.f1784r);
            }
        }
        if (!((es.c) this.f1775i).U(pin)) {
            pinterestVideoView.u0(new com.pinterest.feature.ideaPinCreation.closeup.view.e1(this, 7));
            return;
        }
        PinterestVideoView pinterestVideoView2 = this.f1768b;
        pinterestVideoView2.G0 = false;
        pinterestVideoView2.u0(new ps.b(pin, this.f1767a, pinterestVideoView2, new ha2.j(this, 9), new c72.o(this, 20)));
        pinterestVideoView.N0 = new r0(19, this, pin);
    }
}
