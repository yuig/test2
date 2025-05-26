package ny;

import android.os.SystemClock;
import ey.e2;
import ey.f2;
import ey.g2;
import ey.i2;
import ey.j1;
import ey.j3;
import ey.k3;
import ey.m2;
import ey.o1;
import ey.q2;
import ey.s0;
import ey.u1;
import ey.v2;
import ey.w2;
import ey.x2;
import ey.y2;
import ey.z2;
import h32.a4;
import h32.d4;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.h1;
import kotlin.collections.i1;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends s0 {

    /* renamed from: m, reason: collision with root package name */
    public static final Set f92541m = h1.f(o.class, d.class, h.class, i.class, o0.class, p0.class, q.class, r.class, a0.class, b0.class, c0.class, d0.class, e0.class, f0.class, h0.class, i0.class, g0.class, j0.class, k0.class, y.class, z.class, e2.class, f2.class, m0.class, n0.class, n.class, m.class, c.class, e.class, t.class, u.class, y2.class, z2.class, v2.class, w2.class, x2.class, p.class, g.class);

    /* renamed from: i, reason: collision with root package name */
    public final s92.i f92542i;

    /* renamed from: j, reason: collision with root package name */
    public s92.l f92543j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f92544k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f92545l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f92542i = s92.i.HOME_FEED_LOAD_AND_RENDER;
        this.f92545l = new LinkedHashMap();
    }

    public static boolean C(s92.l lVar) {
        return lVar == s92.l.COLD_START;
    }

    public final void A(String str, String str2, Integer num, d4 d4Var, a4 a4Var, Boolean bool) {
        j("pin.id", str);
        if (str2 != null) {
            j("video.url", str2);
        }
        if (num != null) {
            h(num.intValue(), "video.slot_index");
        }
        if (d4Var != null) {
            h(d4Var.getValue(), "view.type");
        }
        if (a4Var != null) {
            h(a4Var.getValue(), "view.parameter");
        }
        if (bool != null) {
            l("video.player_is_cached", bool.booleanValue());
        }
    }

    public final void B() {
        d();
        C(this.f92543j);
        D();
        if (d() && C(this.f92543j) && !D()) {
            c();
            j1.f60506c = false;
            j3 j3Var = j3.f60510a;
            j3.j();
        }
    }

    public final boolean D() {
        Intrinsics.checkNotNullParameter("pinterest_activity_init", "value");
        o1 o1Var = this.f60594b;
        Object obj = null;
        List list = o1Var != null ? o1Var.b().f107713e : null;
        if (list == null) {
            list = q0.f80391a;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.d("pinterest_activity_init", ((re2.a) next).f107691b)) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    @Override // ey.s0, ey.v1
    public final Set b() {
        return i1.i(f92541m, super.b());
    }

    @Override // ey.s0, ey.v1
    public final void c() {
        this.f92545l.clear();
        Intrinsics.checkNotNullParameter("", "<set-?>");
        this.f60596d = "";
        super.c();
        new k().i();
        j3 j3Var = j3.f60510a;
        j3.j();
    }

    @Override // ey.s0, ey.k, ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof o) {
            o oVar = (o) e13;
            if (!d()) {
                s92.l lVar = oVar.f92535d;
                this.f92543j = lVar;
                this.f92544k = oVar.f92536e;
                j3 j3Var = j3.f60510a;
                j3.f60516g = lVar == s92.l.WARM_START;
                j3.f60517h = C(lVar);
                q(oVar.c());
                j1.f60506c = true;
                if (!this.f92544k) {
                    vb0.j.f125483r = false;
                }
                if (!C(lVar)) {
                    new l(lVar, oVar.c()).i();
                }
            }
        } else {
            boolean z13 = e13 instanceof d;
            long j13 = 0;
            k3 k3Var = this.f60593a;
            if (z13) {
                k3Var.f60524e.e();
                d dVar = (d) e13;
                if (d()) {
                    long c13 = dVar.c();
                    boolean z14 = this.f92544k;
                    s92.o oVar2 = dVar.f92513d;
                    if (z14) {
                        c();
                    } else {
                        vb0.j.f125483r = true;
                        if (oVar2 == s92.o.COMPLETE) {
                            h(dVar.f92516g, "pin.count");
                            if (C(this.f92543j)) {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                s(new l0());
                                q(elapsedRealtime - vb0.j.f125481p);
                                r(elapsedRealtime - vb0.j.f125482q);
                                s(dVar);
                                i(0L, "total_images_size");
                            }
                            f fVar = dVar.f92517h;
                            if (fVar != null) {
                                h(fVar.f92526h, "model_count");
                                h(fVar.f92519a, "video_pin_count");
                                h(fVar.f92520b, "video_story_pin_count");
                                h(fVar.f92521c, "other_story_pin_count");
                                h(fVar.f92522d, "carousel_pin_count");
                                h(fVar.f92523e, "other_pin_count");
                                h(fVar.f92524f, "ads_model_count");
                                h(fVar.f92525g, "organic_model_count");
                            }
                        }
                        a(dVar.f92513d, this.f92543j, dVar.f92514e, dVar.f92515f, c13, false);
                    }
                    m60.w wVar = m60.u.f85943a;
                    boolean z15 = dVar.f92518i;
                    wVar.f(new s(z15));
                    if (C(this.f92543j)) {
                        wVar.f(new ey.w(oVar2, z15));
                    }
                    this.f92545l.clear();
                    j1.f60506c = false;
                    if (!this.f92544k) {
                        new j(dVar.f92513d, dVar.f92514e, dVar.f92515f, c13).i();
                    }
                }
            } else if (e13 instanceof h) {
                k3Var.f60524e.e();
                c();
            } else if (e13 instanceof i) {
                B();
            } else if ((e13 instanceof e2) || (e13 instanceof t) || (e13 instanceof y) || (e13 instanceof a0) || (e13 instanceof h0) || (e13 instanceof j0) || (e13 instanceof m0) || (e13 instanceof o0) || (e13 instanceof q)) {
                q(e13.c());
            } else if ((e13 instanceof c0) || (e13 instanceof e0)) {
                q(e13.c());
                j("source", "api_home_feed_first_page");
            } else if ((e13 instanceof u) || (e13 instanceof p0) || (e13 instanceof r) || (e13 instanceof d0) || (e13 instanceof f0) || (e13 instanceof n0) || (e13 instanceof f2) || (e13 instanceof k0)) {
                r(e13.c());
                o1 o1Var = this.f60594b;
                if (o1Var != null) {
                    ly1.f a13 = o1Var.a();
                    j13 = a13.f85169h - a13.f85164c;
                }
                if (j13 > 1 && !(e13 instanceof d0)) {
                    boolean z16 = e13 instanceof f0;
                }
            } else if (e13 instanceof i0) {
                r(e13.c());
            } else if (e13 instanceof b0) {
                r(e13.c());
                b0 b0Var = (b0) e13;
                if (b0Var.l() > 0) {
                    h(b0Var.l(), "net.speed");
                }
            } else if (e13 instanceof z) {
                i(((z) e13).l(), "load_hf_from_new_download_body_size");
                r(e13.c());
            } else if (e13 instanceof n) {
                e(e13.c(), "pinterest_activity_init");
            } else if (e13 instanceof m) {
                e(e13.c(), "main_activity_init");
            } else if (e13 instanceof c) {
                e(e13.c(), "app_launch_delayed_reload_experiments");
            } else if (e13 instanceof e) {
                e(e13.c(), "dynamic_fragment_init");
            } else if (e13 instanceof g0) {
                e(e13.c(), "response_header_received");
            } else if (e13 instanceof y2) {
                if (!d()) {
                    q(e13.c());
                    y2 y2Var = (y2) e13;
                    A(y2Var.l(), y2Var.n(), y2Var.m(), y2Var.p(), y2Var.o(), Boolean.valueOf(y2Var.q()));
                }
            } else if (e13 instanceof z2) {
                if (d()) {
                    r(e13.c());
                }
            } else if (e13 instanceof w2) {
                if (!d()) {
                    q(e13.c());
                }
            } else if (e13 instanceof v2) {
                if (d()) {
                    v2 v2Var = (v2) e13;
                    A(v2Var.l(), v2Var.n(), v2Var.m(), v2Var.p(), v2Var.o(), null);
                }
            } else if (e13 instanceof x2) {
                if (d()) {
                    r(e13.c());
                }
                x(r92.c.VIDEO);
            } else if (e13 instanceof p) {
                if (d()) {
                    h(((p) e13).l(), "module.count");
                }
            } else if ((e13 instanceof g) && d()) {
                l("conn_reused", ((g) e13).l());
            }
        }
        return true;
    }

    @Override // ey.s0
    public final s92.i w() {
        return this.f92542i;
    }

    @Override // ey.s0
    public final void y(g2 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (e13 instanceof q2) {
            j("source", "prefetch_image");
            return;
        }
        if (e13 instanceof i2) {
            j("pwt_cause", String.valueOf(this.f92543j));
            h(((i2) e13).f60500h, "rendered_index");
        } else if (e13 instanceof m2) {
            j("pwt_cause", String.valueOf(this.f92543j));
            h(((m2) e13).f60535i, "rendered_index");
        }
    }
}
