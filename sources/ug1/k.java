package ug1;

import com.pinterest.api.model.b01;
import com.pinterest.api.model.f30;
import h32.z1;
import i91.h0;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lh0.e4;
import m60.w;
import nx.b0;
import nx.d0;
import nx.d1;

/* loaded from: classes5.dex */
public final class k extends yk1.b {
    public final i A;

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f122197a;

    /* renamed from: b, reason: collision with root package name */
    public final w f122198b;

    /* renamed from: c, reason: collision with root package name */
    public final x10.b f122199c;

    /* renamed from: d, reason: collision with root package name */
    public final vg1.a f122200d;

    /* renamed from: e, reason: collision with root package name */
    public final e4 f122201e;

    /* renamed from: f, reason: collision with root package name */
    public final xr.a f122202f;

    /* renamed from: g, reason: collision with root package name */
    public final bc2.e f122203g;

    /* renamed from: h, reason: collision with root package name */
    public final ro1.c f122204h;

    /* renamed from: i, reason: collision with root package name */
    public final ni1.d f122205i;

    /* renamed from: j, reason: collision with root package name */
    public final d1 f122206j;

    /* renamed from: k, reason: collision with root package name */
    public final b0 f122207k;

    /* renamed from: l, reason: collision with root package name */
    public final ur.a f122208l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f122209m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f122210n;

    /* renamed from: o, reason: collision with root package name */
    public f30 f122211o;

    /* renamed from: p, reason: collision with root package name */
    public int f122212p;

    /* renamed from: q, reason: collision with root package name */
    public z1 f122213q;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f122214r;

    /* renamed from: s, reason: collision with root package name */
    public int f122215s;

    /* renamed from: t, reason: collision with root package name */
    public int f122216t;

    /* renamed from: u, reason: collision with root package name */
    public final a11.n f122217u;

    /* renamed from: v, reason: collision with root package name */
    public long f122218v;

    /* renamed from: w, reason: collision with root package name */
    public final pb0.g f122219w;

    /* renamed from: x, reason: collision with root package name */
    public final h0 f122220x;

    /* renamed from: y, reason: collision with root package name */
    public js0.a f122221y;

    /* renamed from: z, reason: collision with root package name */
    public final h f122222z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(uk1.d presenterPinalytics, a11.d dVar, w eventManager, x10.b bVar, vg1.a aVar, e4 experiments, xr.a attributionReporting, bc2.e mp4TrackSelector, ro1.c deepLinkAdUtil, ni1.d deepLinkHelper, d1 d1Var, b0 pinAuxHelper, ur.a adsCoreDependencies) {
        super(0);
        a11.n nVar;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(mp4TrackSelector, "mp4TrackSelector");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(deepLinkHelper, "deepLinkHelper");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f122197a = presenterPinalytics;
        this.f122198b = eventManager;
        this.f122199c = bVar;
        this.f122200d = aVar;
        this.f122201e = experiments;
        this.f122202f = attributionReporting;
        this.f122203g = mp4TrackSelector;
        this.f122204h = deepLinkAdUtil;
        this.f122205i = deepLinkHelper;
        this.f122206j = d1Var;
        this.f122207k = pinAuxHelper;
        this.f122208l = adsCoreDependencies;
        this.f122210n = true;
        this.f122212p = -1;
        if (dVar != null) {
            d0 d0Var = presenterPinalytics.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            nVar = dVar.a(d0Var);
        } else {
            nVar = null;
        }
        this.f122217u = nVar;
        this.f122219w = pb0.g.f99432a;
        this.f122220x = new h0(2);
        this.f122222z = new h(this);
        this.A = new i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0198  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.view.View, com.pinterest.ui.imageview.GenericWebImageView, com.pinterest.ui.imageview.WebImageView] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // yk1.b
    /* renamed from: onBind */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3(yk1.n r21) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.k.r3(yk1.n):void");
    }

    @Override // yk1.b
    public final void onUnbind() {
        h hVar = this.f122222z;
        w wVar = this.f122198b;
        wVar.j(hVar);
        wVar.j(this.A);
        super.onUnbind();
    }

    public final String p3(f30 f30Var) {
        vg1.a aVar = this.f122200d;
        if (aVar != null) {
            return vg1.a.a(aVar.f125786b, f30Var);
        }
        return null;
    }

    public final boolean q3() {
        b01 M6;
        f30 f30Var = this.f122211o;
        Map g13 = (f30Var == null || (M6 = f30Var.M6()) == null) ? null : M6.g();
        return !(g13 == null || g13.isEmpty());
    }
}
