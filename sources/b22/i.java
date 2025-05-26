package b22;

import com.pinterest.repository.pin.PinService;
import dl1.a0;
import dl1.m;
import dl1.p;
import dl1.s;
import dl1.u;
import h32.k2;
import jk2.e0;
import jk2.j1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import uj2.b0;
import x02.b2;
import x02.c2;
import x02.e2;
import x02.f2;
import x02.g2;
import x02.h2;

/* loaded from: classes2.dex */
public final class i implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final PinService f21296a;

    /* renamed from: b, reason: collision with root package name */
    public final p f21297b;

    /* renamed from: c, reason: collision with root package name */
    public final gl1.d f21298c;

    /* renamed from: d, reason: collision with root package name */
    public n00.c f21299d;

    /* renamed from: e, reason: collision with root package name */
    public String f21300e;

    public i(PinService pinService, p localDataSource, gl1.d schedulerPolicy) {
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(schedulerPolicy, "schedulerPolicy");
        this.f21296a = pinService;
        this.f21297b = localDataSource;
        this.f21298c = schedulerPolicy;
        this.f21299d = n00.c.PIN_CLOSEUP;
    }

    @Override // dl1.a0
    public final uj2.b a(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z13 = params instanceof b2;
        PinService pinService = this.f21296a;
        return z13 ? pinService.deletePin(params.a(), ((b2) params).f131294e) : pinService.deletePin(params.a(), "");
    }

    @Override // dl1.a0
    public final b0 b(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        String a13 = params.a();
        String a14 = n00.b.a(this.f21299d);
        String str = this.f21300e;
        if (str != null && !z.j(str)) {
            return this.f21296a.getPin(a13, a14, this.f21300e);
        }
        return new kk2.m(new hk2.b0(new e0(new j1(this.f21297b.b(params).i(new f(20, new g(this.f21298c))), new f(0, h.f21295i), 0)), new kk2.k(new j12.i(15), 1), 0), new f(1, new fn1.k(this, a13, a14, 10)), 0);
    }

    @Override // dl1.a0
    public final uj2.l c(m mVar, s sVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(params instanceof f2)) {
            boolean z13 = params instanceof g2;
            PinService pinService = this.f21296a;
            if (z13) {
                g2 g2Var = (g2) params;
                return pinService.react(g2Var.f131396d, g2Var.f131397e, n00.b.a(n00.c.PIN_REACTION_FIELDS), g2Var.f131398f);
            }
            if (params instanceof h2) {
                h2 h2Var = (h2) params;
                return pinService.unreact(h2Var.f131406d, n00.b.a(n00.c.PIN_REACTION_FIELDS), h2Var.f131407e);
            }
            if (params instanceof e2) {
                return pinService.deleteMention(((e2) params).f131348d);
            }
            hk2.c cVar = new hk2.c(new j12.i(14), 1);
            Intrinsics.checkNotNullExpressionValue(cVar, "error(...)");
            return cVar;
        }
        f2 f2Var = (f2) params;
        String str = f2Var.f131361d;
        n00.c cVar2 = f2Var.f131374q;
        if (cVar2 == null) {
            cVar2 = n00.c.PIN_EDIT_ADD;
        }
        String a13 = n00.b.a(cVar2);
        PinService pinService2 = this.f21296a;
        String str2 = f2Var.f131372o;
        String str3 = f2Var.f131366i;
        String str4 = f2Var.f131367j;
        String str5 = f2Var.f131368k;
        boolean z14 = f2Var.f131369l;
        boolean z15 = f2Var.f131370m;
        return pinService2.editPin(str, a13, str2, str3, str4, str5, 0, 0, z14 ? 1 : 0, z15 ? 1 : 0, f2Var.f131365h, f2Var.f131362e, f2Var.f131363f, f2Var.f131364g, f2Var.f131373p, f2Var.f131375r, f2Var.f131376s, f2Var.f131377t, f2Var.f131371n);
    }

    @Override // dl1.a0
    public final b0 e(m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        if (!(params instanceof c2)) {
            kk2.k kVar = new kk2.k(new j12.i(13), 0);
            Intrinsics.checkNotNullExpressionValue(kVar, "error(...)");
            return kVar;
        }
        c2 c2Var = (c2) params;
        String str = c2Var.f131299d;
        String a13 = n00.b.a(n00.c.DEFAULT_PIN_FEED);
        String str2 = c2Var.f131302g;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        boolean z13 = c2Var.f131303h;
        boolean z14 = c2Var.f131304i;
        Integer valueOf = Integer.valueOf(c2Var.f131307l);
        String str4 = c2Var.f131301f;
        String str5 = c2Var.f131300e;
        String str6 = c2Var.f131306k;
        String str7 = c2Var.f131305j;
        String str8 = c2Var.f131308m;
        String str9 = c2Var.f131309n;
        String str10 = c2Var.f131310o;
        k2 k2Var = c2Var.f131311p;
        return this.f21296a.repin(str, a13, str3, z13 ? 1 : 0, z14 ? 1 : 0, 0, 0, valueOf, null, str4, str5, str6, str7, str8, str9, str10, k2Var != null ? Integer.valueOf(k2Var.getValue()) : null);
    }
}
