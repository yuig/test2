package d11;

import b11.g;
import com.pinterest.api.model.f30;
import h32.d4;
import i01.f1;
import jq.j;
import kotlin.jvm.internal.Intrinsics;
import lh0.a0;
import nx.d0;
import tq.y;
import u01.b;
import uk1.d;
import vq0.h;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f53614a;

    /* renamed from: b, reason: collision with root package name */
    public final d f53615b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f53616c;

    /* renamed from: d, reason: collision with root package name */
    public final j f53617d;

    /* renamed from: e, reason: collision with root package name */
    public final jq.h f53618e;

    public a(a0 closeupExperiments, d presenterPinalytics, f1 transitionElementProvider, j jVar, jq.h pinchToZoomInteractor) {
        Intrinsics.checkNotNullParameter(closeupExperiments, "closeupExperiments");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(transitionElementProvider, "transitionElementProvider");
        Intrinsics.checkNotNullParameter(pinchToZoomInteractor, "pinchToZoomInteractor");
        this.f53614a = closeupExperiments;
        this.f53615b = presenterPinalytics;
        this.f53616c = transitionElementProvider;
        this.f53617d = jVar;
        this.f53618e = pinchToZoomInteractor;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        v01.a view = (v01.a) nVar;
        b model = (b) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        d presenterPinalytics = this.f53615b;
        d0 pinalytics = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
        y yVar = (y) view;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        yVar.f118982v = pinalytics;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        g gVar = model.f119875c;
        d4 viewType = gVar.f20989b;
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        yVar.f118983w = viewType;
        yVar.f118986z = gVar.f20988a;
        yVar.I = gVar.f20991d;
        boolean z13 = model.f119876d;
        f30 pin = model.f119874b;
        if (z13) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            yVar.A = true;
            yVar.x(pin);
        } else {
            yVar.x(pin);
        }
        j jVar = this.f53617d;
        if (jVar == null) {
            jVar = new j(this.f53616c.provideCloseupContainer(), this.f53618e, null, 4);
        }
        jVar.f77435m = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f53614a, aVar.f53614a) && Intrinsics.d(this.f53615b, aVar.f53615b) && Intrinsics.d(this.f53616c, aVar.f53616c) && Intrinsics.d(this.f53617d, aVar.f53617d) && Intrinsics.d(this.f53618e, aVar.f53618e);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        b model = (b) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    public final int hashCode() {
        int hashCode = (this.f53616c.hashCode() + ((this.f53615b.hashCode() + (this.f53614a.hashCode() * 31)) * 31)) * 31;
        j jVar = this.f53617d;
        return this.f53618e.hashCode() + ((hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31);
    }

    public final String toString() {
        return "PdpCloseupMonolithicHeaderViewBinder(closeupExperiments=" + this.f53614a + ", presenterPinalytics=" + this.f53615b + ", transitionElementProvider=" + this.f53616c + ", pinchToZoomInteraction=" + this.f53617d + ", pinchToZoomInteractor=" + this.f53618e + ")";
    }
}
