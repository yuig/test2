package c11;

import b11.g;
import com.pinterest.api.model.f30;
import h32.d4;
import i01.f1;
import i01.l0;
import jq.j;
import kotlin.jvm.internal.Intrinsics;
import lh0.a0;
import nx.d0;
import oq.x0;
import u01.k;
import vq0.h;
import x02.i2;
import yk1.n;

/* loaded from: classes5.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f24493a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f24494b;

    /* renamed from: c, reason: collision with root package name */
    public final jq.h f24495c;

    /* renamed from: d, reason: collision with root package name */
    public final f1 f24496d;

    /* renamed from: e, reason: collision with root package name */
    public final j f24497e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f24498f;

    public c(a0 closeupExperiments, uk1.d presenterPinalytics, jq.h pinchToZoomInteractor, f1 transitionElementProvider, j jVar, i2 pinRepository) {
        Intrinsics.checkNotNullParameter(closeupExperiments, "closeupExperiments");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinchToZoomInteractor, "pinchToZoomInteractor");
        Intrinsics.checkNotNullParameter(transitionElementProvider, "transitionElementProvider");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f24493a = closeupExperiments;
        this.f24494b = presenterPinalytics;
        this.f24495c = pinchToZoomInteractor;
        this.f24496d = transitionElementProvider;
        this.f24497e = jVar;
        this.f24498f = pinRepository;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        l0 view = (l0) nVar;
        k model = (k) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        uk1.d presenterPinalytics = this.f24494b;
        d0 pinalytics = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
        x0 x0Var = (x0) view;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        x0Var.f97174l0 = pinalytics;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        x0Var.f97176m0 = presenterPinalytics;
        g gVar = model.f119906c;
        d4 viewType = gVar.f20989b;
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        x0Var.f97196w0 = viewType;
        x0Var.f97198x0 = gVar.f20988a;
        x0Var.B0 = gVar.f20991d;
        boolean z13 = model.f119908e;
        f30 pin = model.f119905b;
        if (z13) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            x0Var.f97190t0 = true;
            x0Var.p1(pin);
        } else {
            x0Var.p1(pin);
        }
        if (!model.f119907d) {
            x0Var.s1(null);
            return;
        }
        j jVar = this.f24497e;
        if (jVar == null) {
            jVar = new j(this.f24496d.provideCloseupContainer(), this.f24495c, null, 4);
        }
        jVar.f77434l = view;
        x0Var.s1(jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f24493a, cVar.f24493a) && Intrinsics.d(this.f24494b, cVar.f24494b) && Intrinsics.d(this.f24495c, cVar.f24495c) && Intrinsics.d(this.f24496d, cVar.f24496d) && Intrinsics.d(this.f24497e, cVar.f24497e) && Intrinsics.d(this.f24498f, cVar.f24498f);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        k model = (k) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    public final int hashCode() {
        int hashCode = (this.f24496d.hashCode() + ((this.f24495c.hashCode() + ((this.f24494b.hashCode() + (this.f24493a.hashCode() * 31)) * 31)) * 31)) * 31;
        j jVar = this.f24497e;
        return this.f24498f.hashCode() + ((hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31);
    }

    public final String toString() {
        return "PinCloseupMonolithicHeaderViewBinder(closeupExperiments=" + this.f24493a + ", presenterPinalytics=" + this.f24494b + ", pinchToZoomInteractor=" + this.f24495c + ", transitionElementProvider=" + this.f24496d + ", pinchToZoomInteraction=" + this.f24497e + ", pinRepository=" + this.f24498f + ")";
    }
}
