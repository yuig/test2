package sq0;

import ac2.o1;
import ac2.p1;
import android.content.Context;
import android.util.Size;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.pq0;
import com.pinterest.api.model.vq0;
import df.j1;
import java.util.ArrayList;
import java.util.Map;
import kh2.n3;
import kotlin.jvm.internal.Intrinsics;
import lh0.w0;

/* loaded from: classes.dex */
public final class m extends o5.g {

    /* renamed from: c, reason: collision with root package name */
    public final Context f115008c;

    /* renamed from: d, reason: collision with root package name */
    public final w0 f115009d;

    /* renamed from: e, reason: collision with root package name */
    public final bc2.e f115010e;

    /* renamed from: f, reason: collision with root package name */
    public final ac2.m f115011f;

    /* renamed from: g, reason: collision with root package name */
    public final p1 f115012g;

    /* renamed from: h, reason: collision with root package name */
    public final lh0.j f115013h;

    /* renamed from: i, reason: collision with root package name */
    public final es.a f115014i;

    /* renamed from: j, reason: collision with root package name */
    public final kv.a f115015j;

    /* renamed from: k, reason: collision with root package name */
    public final kv.c f115016k;

    /* renamed from: l, reason: collision with root package name */
    public final es.h f115017l;

    /* renamed from: m, reason: collision with root package name */
    public final j f115018m;

    /* renamed from: n, reason: collision with root package name */
    public final int f115019n;

    /* renamed from: o, reason: collision with root package name */
    public int f115020o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f115021p;

    /* renamed from: q, reason: collision with root package name */
    public ek2.j f115022q;

    /* renamed from: r, reason: collision with root package name */
    public k f115023r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f115024s;

    /* renamed from: t, reason: collision with root package name */
    public final xk2.v f115025t;

    /* renamed from: u, reason: collision with root package name */
    public final j6.b f115026u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, w0 dynamicFeedLibraryExperiments, bc2.e mp4TrackSelector, ac2.m videoManager, p1 videoManagerUtil, lh0.j adsExperiments, es.a adFormats, kv.a adsAudioOverlayPowerscoreExperimentManager, kv.c organicAudioOverlayPowerscoreExperimentManager, es.h adsCommonDisplay, b20.c prefetchConfig, uk2.f scrollState, j gridSurfaceType) {
        super(0);
        int i13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dynamicFeedLibraryExperiments, "dynamicFeedLibraryExperiments");
        Intrinsics.checkNotNullParameter(mp4TrackSelector, "mp4TrackSelector");
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(videoManagerUtil, "videoManagerUtil");
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsAudioOverlayPowerscoreExperimentManager, "adsAudioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(organicAudioOverlayPowerscoreExperimentManager, "organicAudioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(prefetchConfig, "prefetchConfig");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(gridSurfaceType, "gridSurfaceType");
        int i14 = 0;
        this.f115008c = context;
        this.f115009d = dynamicFeedLibraryExperiments;
        this.f115010e = mp4TrackSelector;
        this.f115011f = videoManager;
        this.f115012g = videoManagerUtil;
        this.f115013h = adsExperiments;
        this.f115014i = adFormats;
        this.f115015j = adsAudioOverlayPowerscoreExperimentManager;
        this.f115016k = organicAudioOverlayPowerscoreExperimentManager;
        this.f115017l = adsCommonDisplay;
        this.f115018m = gridSurfaceType;
        int i15 = hf0.b.f69004d;
        double d2 = vb0.j.f125485t;
        int i16 = 1;
        if (d2 <= 0.0d || d2 >= 4000000.0d) {
            Object obj = prefetchConfig.f21278a;
            i13 = ((Boolean) ((xk2.k) obj).getValue()).booleanValue() ? 1 : 4;
            ly1.d.a();
            ((Boolean) ((xk2.k) obj).getValue()).booleanValue();
        } else {
            i13 = 1;
        }
        this.f115019n = i15 * i13;
        this.f115024s = xk2.m.b(new l(this, i16));
        this.f115025t = xk2.m.b(new l(this, i14));
        this.f115026u = new j6.b(hf0.b.f69002b, hf0.b.f69003c, hf0.b.f69004d);
        this.f115022q = (ek2.j) scrollState.F(new ug0.d(14, new h(1, this, m.class, "onScrollStateChanged", "onScrollStateChanged(I)V", 0)), new ug0.d(15, i.f115001i), ck2.i.f27923c, ck2.i.f27924d);
    }

    public final void k(f30 pin, int i13, bc2.q qVar) {
        boolean z13;
        boolean z14;
        int i14 = 19;
        ac2.m mVar = this.f115011f;
        es.a aVar = this.f115014i;
        if (qVar != null) {
            tk2.e.f118017c.b(new dp.a(i14, this, qVar));
            String C = a.a.C(pin.getId(), b40.Q0(pin) ? "-0" : "");
            Size size = new Size(hf0.b.f69002b / hf0.b.f69004d, hf0.b.f69003c);
            if (!b40.B0(pin)) {
                if (!j1.D1(pin, this.f115013h, this.f115012g, this.f115017l, false, this.f115015j, this.f115016k, ((es.c) aVar).G(pin))) {
                    z14 = false;
                    ((o1) mVar).n(C, qVar, size, z14, i13, hc2.q.GRID_PREFETCH);
                    return;
                }
            }
            z14 = true;
            ((o1) mVar).n(C, qVar, size, z14, i13, hc2.q.GRID_PREFETCH);
            return;
        }
        es.c cVar = (es.c) aVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!cVar.Y(pin) && (!b40.H0(pin) || !this.f115026u.d(i13))) {
            return;
        }
        bc2.q S0 = dl2.b.S0(pin, Integer.valueOf(i13));
        if (S0 != null) {
            tk2.e.f118017c.b(new dp.a(i14, this, S0));
            String id3 = pin.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            cVar.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            cVar.Y(pin);
            Size size2 = new Size(hf0.b.f69002b / hf0.b.f69004d, hf0.b.f69003c);
            if (!b40.B0(pin)) {
                if (!j1.D1(pin, this.f115013h, this.f115012g, this.f115017l, false, this.f115015j, this.f115016k, cVar.G(pin))) {
                    z13 = false;
                    ((o1) mVar).n(id3, S0, size2, z13, i13, hc2.q.GRID_PREFETCH);
                }
            }
            z13 = true;
            ((o1) mVar).n(id3, S0, size2, z13, i13, hc2.q.GRID_PREFETCH);
        }
    }

    public final void l(nr0.j dataSource, int i13, y scrollDirection) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
        if (((Boolean) this.f115025t.getValue()).booleanValue() || (this.f115021p && this.f115020o == 0)) {
            m(dataSource, i13, this.f115019n, scrollDirection);
        } else {
            this.f115023r = new k(dataSource, i13, scrollDirection);
        }
    }

    public final void m(nr0.j jVar, int i13, int i14, y yVar) {
        bc2.q S0;
        vq0 g13;
        if (yVar == y.UNKNOWN) {
            return;
        }
        int min = yVar == y.DOWN ? Math.min(i13 + i14, jVar.a() - 1) : Math.max(i13 - i14, 0);
        int min2 = Math.min(i13, min);
        int max = Math.max(i13, min);
        int i15 = max + 1;
        for (int i16 = min2; i16 < i15; i16++) {
            int i17 = yVar == y.UP ? max - (i16 - min2) : i16;
            if (i17 >= 0 && i17 <= jVar.a() - 1) {
                Object item = jVar.getItem(i17);
                Map map = null;
                f30 pin = item instanceof f30 ? (f30) item : null;
                if (pin != null) {
                    j jVar2 = j.RELATED_PINS;
                    Object obj = this.f92902b;
                    j jVar3 = this.f115018m;
                    if ((jVar3 == jVar2 || jVar3 == j.SEARCH) && ((Boolean) this.f115024s.getValue()).booleanValue()) {
                        if (b40.Q0(pin)) {
                            String C = a.a.C(pin.getId(), "-0");
                            pq0 D = n3.D(pin);
                            if (D != null && (g13 = D.g()) != null) {
                                map = g13.c();
                            }
                            S0 = dl2.b.r0(C, map, true, kh2.j1.b1(), Integer.valueOf(i17), j1.z0(pin), this.f115010e, bc2.m.GRID);
                        } else {
                            S0 = dl2.b.S0(pin, Integer.valueOf(i17));
                        }
                        if (S0 != null) {
                            boolean B = n60.o.B(pin, "getIsPromoted(...)");
                            bc2.o oVar = S0.f22673b;
                            if (!B && !b40.B0(pin)) {
                                Boolean b53 = pin.b5();
                                Intrinsics.checkNotNullExpressionValue(b53, "getIsPremiere(...)");
                                if (!b53.booleanValue()) {
                                    es.c cVar = (es.c) this.f115014i;
                                    cVar.getClass();
                                    Intrinsics.checkNotNullParameter(pin, "pin");
                                    if (!cVar.Y(pin)) {
                                        g gVar = (g) obj;
                                        if (!gVar.a(oVar.f22665b) && !b40.F0(pin) && this.f115026u.d(i17)) {
                                            String str = oVar.f22665b;
                                            if (!gVar.a(str)) {
                                                k(pin, i17, S0);
                                                gVar.b(str);
                                            }
                                        }
                                    }
                                }
                            }
                            g gVar2 = (g) obj;
                            if (!gVar2.a(oVar.f22665b)) {
                                k(pin, i17, S0);
                                gVar2.b(oVar.f22665b);
                            }
                        }
                    } else {
                        String j03 = b40.j0(pin);
                        if (j03 != null) {
                            g gVar3 = (g) obj;
                            if (!gVar3.a(j03)) {
                                k(pin, i17, null);
                                gVar3.b(j03);
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList = ((o1) this.f115011f).f2007j.f68748h;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            int c13 = ((hc2.c) obj2).c();
            if (1 <= c13 && c13 < i13) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.size();
            arrayList.removeAll(arrayList2);
        }
    }
}
