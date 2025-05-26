package r71;

import android.view.View;
import k71.i;
import kotlin.jvm.internal.Intrinsics;
import l71.p;
import lh0.j3;
import m60.w;
import t3.s1;
import uj2.q;
import uk1.d;
import vq0.h;
import x02.i2;
import yk1.m;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final w f106422a;

    /* renamed from: b, reason: collision with root package name */
    public final d f106423b;

    /* renamed from: c, reason: collision with root package name */
    public final q f106424c;

    /* renamed from: d, reason: collision with root package name */
    public final p f106425d;

    /* renamed from: e, reason: collision with root package name */
    public final o71.w f106426e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f106427f;

    /* renamed from: g, reason: collision with root package name */
    public final v f106428g;

    /* renamed from: h, reason: collision with root package name */
    public final j3 f106429h;

    /* renamed from: i, reason: collision with root package name */
    public String f106430i;

    public c(w eventManager, d presenterPinalytics, q networkStateStream, p searchTypeaheadListener, o71.w screenNavigatorManager, i2 pinRepository, v viewResources, j3 typeaheadExperiments) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(searchTypeaheadListener, "searchTypeaheadListener");
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        this.f106422a = eventManager;
        this.f106423b = presenterPinalytics;
        this.f106424c = networkStateStream;
        this.f106425d = searchTypeaheadListener;
        this.f106426e = screenNavigatorManager;
        this.f106427f = pinRepository;
        this.f106428g = viewResources;
        this.f106429h = typeaheadExperiments;
        this.f106430i = "";
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        o71.v vVar;
        Object view = (i) nVar;
        br.d model = (br.d) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        View view2 = view instanceof View ? (View) view : null;
        if (view2 != null) {
            m j13 = s1.j(view2);
            if (!(j13 instanceof o71.v)) {
                j13 = null;
            }
            vVar = (o71.v) j13;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            vVar.f93385h = model;
            vVar.D3();
            vVar.F3();
            String str = this.f106430i;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            vVar.f93387j = str;
            vVar.f93388k = null;
        }
    }

    @Override // vq0.h
    public final m f() {
        return new o71.v(this.f106422a, this.f106423b, this.f106424c, this.f106425d, this.f106426e, this.f106427f, this.f106428g, this.f106429h);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        br.d model = (br.d) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
