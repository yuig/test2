package oq;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import ek1.c2;
import h32.e4;
import h32.h2;
import h32.y1;
import h32.z1;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk.v2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f96955a;

    /* renamed from: b, reason: collision with root package name */
    public final xr.a f96956b;

    /* renamed from: c, reason: collision with root package name */
    public final ur.a f96957c;

    /* renamed from: d, reason: collision with root package name */
    public final es.a f96958d;

    /* renamed from: e, reason: collision with root package name */
    public final h32.g0 f96959e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f96960f;

    /* renamed from: g, reason: collision with root package name */
    public final nx.b0 f96961g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f96962h;

    /* renamed from: i, reason: collision with root package name */
    public nx.c0 f96963i;

    /* renamed from: j, reason: collision with root package name */
    public pk.x0 f96964j;

    public b(String str, xr.a attributionReporting, ur.a adsCoreDependencies, es.a adFormats, h32.g0 componentType, Function0 loggingAuxData, nx.b0 pinAuxHelper, boolean z13) {
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(loggingAuxData, "loggingAuxData");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f96955a = str;
        this.f96956b = attributionReporting;
        this.f96957c = adsCoreDependencies;
        this.f96958d = adFormats;
        this.f96959e = componentType;
        this.f96960f = loggingAuxData;
        this.f96961g = pinAuxHelper;
        this.f96962h = z13;
        this.f96964j = new pk.x0(4);
    }

    public final void a(e4 visibleEvent) {
        Intrinsics.checkNotNullParameter(visibleEvent, "visibleEvent");
        if (this.f96963i != null) {
            this.f96964j.e(visibleEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public final nx.c0 b(nq.b bVar, Integer num, Integer num2, boolean z13) {
        nx.c0 c0Var = this.f96963i;
        nx.q qVar = null;
        if (c0Var == null) {
            return null;
        }
        this.f96963i = null;
        v2 i13 = this.f96964j.i();
        this.f96964j = new pk.x0(4);
        z1 source = c0Var.f92383a;
        Intrinsics.checkNotNullParameter(source, "source");
        Long l13 = source.f67478a;
        Boolean valueOf = Boolean.valueOf(z13);
        Long c13 = jq.b.c(TimeUnit.MILLISECONDS);
        Double valueOf2 = num != null ? Double.valueOf(num.intValue()) : source.A;
        Double valueOf3 = num2 != null ? Double.valueOf(num2.intValue()) : source.f67515z;
        Intrinsics.f(i13);
        boolean z14 = !i13.isEmpty();
        v2 v2Var = i13;
        if (!z14) {
            v2Var = source.f67506q;
        }
        v2 v2Var2 = v2Var;
        nx.c cVar = c0Var.f92384b;
        if (bVar != null) {
            nx.q qVar2 = cVar.f92380b;
            if (qVar2 != null) {
                HashMap b13 = qVar2.b();
                b13.put("closeup_navigation_type", bVar.getType());
                qVar = bs1.c.o2(b13);
            }
            nx.c.a(cVar, qVar);
        }
        return new nx.c0(new z1(l13, source.f67480b, source.f67482c, source.f67484d, c13, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, v2Var2, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, valueOf3, valueOf2, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, valueOf, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0), cVar);
    }

    public final nx.c0 c(f30 pin, nq.b bVar, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        nx.c0 c0Var = this.f96963i;
        if (c0Var != null) {
            return c0Var;
        }
        es.c cVar = (es.c) this.f96958d;
        boolean l03 = cVar.l0(pin);
        xr.a aVar = this.f96956b;
        if (l03) {
            aVar.a(pin, false);
        }
        y1 y1Var = new y1();
        h2 h2Var = h2.CLOSEUP_IMPRESSION;
        y1Var.f67449j = h2Var;
        y1Var.f67433b = jq.b.c(TimeUnit.MILLISECONDS);
        String str = this.f96955a;
        ur.b bVar2 = (ur.b) this.f96957c;
        bs1.c.Q1(y1Var, pin, null, 0L, 0, 0, i13, str, null, false, false, false, null, es.h.c(bVar2.f123060c, pin), cVar.j0(pin) ? new h32.f() : null, null, ((vr.b) bVar2.f123059b).g(pin), ((es.v) bVar2.f123060c).o(pin), c2.f(pin, this.f96958d, bVar2.f123059b, false, false, this.f96962h), null, 561408);
        HashMap hashMap = (HashMap) this.f96960f.invoke();
        if (bVar != null) {
            hashMap.put("closeup_navigation_type", bVar.getType());
        }
        v7 D3 = pin.D3();
        if (D3 != null && kh2.d.L0(D3)) {
            hashMap.put("is_screenshot_repin", "true");
        }
        if (b40.X0(pin)) {
            bs1.c.G1(SbaPinRep.AUX_DATA_VIDEO_ID, b40.i0(pin), hashMap);
        }
        nx.b0 b0Var = this.f96961g;
        b0Var.c(pin, hashMap);
        b0Var.a(pin, aVar, hashMap);
        nx.c0 c0Var2 = new nx.c0(y1Var.a(), new nx.c(this.f96959e, bs1.c.o2(hashMap), null, h2Var, 4));
        this.f96963i = c0Var2;
        return c0Var2;
    }
}
