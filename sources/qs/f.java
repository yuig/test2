package qs;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import h32.g0;
import h32.y1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nx.b0;
import nx.d0;
import pk.x0;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f105071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f105072b;

    /* renamed from: c, reason: collision with root package name */
    public final nq.b f105073c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f105074d;

    /* renamed from: e, reason: collision with root package name */
    public final List f105075e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f105076f;

    /* renamed from: g, reason: collision with root package name */
    public final ur.a f105077g;

    /* renamed from: h, reason: collision with root package name */
    public f30 f105078h;

    /* renamed from: i, reason: collision with root package name */
    public x0 f105079i;

    /* renamed from: j, reason: collision with root package name */
    public x0 f105080j;

    /* renamed from: k, reason: collision with root package name */
    public y1 f105081k;

    /* renamed from: l, reason: collision with root package name */
    public int f105082l;

    /* renamed from: m, reason: collision with root package name */
    public int f105083m;

    public f(d0 pinalytics, String str, nq.b closeupNavigationType, ArrayList eventTypeList, b0 pinAuxHelper, ur.a adsCoreDependencies) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(closeupNavigationType, "closeupNavigationType");
        Intrinsics.checkNotNullParameter(eventTypeList, "eventTypeList");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f105071a = pinalytics;
        this.f105072b = str;
        this.f105073c = closeupNavigationType;
        this.f105074d = null;
        this.f105075e = eventTypeList;
        this.f105076f = pinAuxHelper;
        this.f105077g = adsCoreDependencies;
        this.f105079i = new x0(4);
        this.f105080j = new x0(4);
    }

    public final HashMap a() {
        f30 f30Var = this.f105078h;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        HashMap hashMap = new HashMap();
        this.f105076f.c(f30Var, hashMap);
        v7 D3 = f30Var.D3();
        if (D3 != null && kh2.d.L0(D3)) {
            hashMap.put("is_screenshot_repin", "true");
        }
        hashMap.put("closeup_navigation_type", this.f105073c.getType());
        if (b40.X0(f30Var)) {
            bs1.c.G1(SbaPinRep.AUX_DATA_VIDEO_ID, b40.i0(f30Var), hashMap);
        }
        return hashMap;
    }
}
