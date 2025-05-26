package kh2;

import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes4.dex */
public final class e2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79473i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j2 f79474j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(j2 j2Var, int i13) {
        super(0);
        this.f79473i = i13;
        this.f79474j = j2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79473i;
        j2 j2Var = this.f79474j;
        switch (i13) {
            case 0:
                kl2.r rVar = j2Var.f79559k;
                d0 d0Var = j2Var.I;
                if (d0Var == null) {
                    Intrinsics.r("dataSourceModule");
                    throw null;
                }
                f0 f0Var = (f0) d0Var;
                o d2 = j2Var.d();
                l3 m13 = j2Var.m();
                h3 h3Var = j2Var.f79573y;
                if (h3Var == null) {
                    Intrinsics.r("systemServiceModule");
                    throw null;
                }
                a a13 = j2Var.a();
                vf2.b b13 = ((r0) j2Var.g()).b();
                sg2.a b14 = ((m) j2Var.c()).b();
                return (t0) rVar.o(f0Var.f79483b, d2, j2Var.f79550b, j2Var.f79551c, m13, h3Var, a13, b13, b14);
            case 1:
                z0 z0Var = (z0) j2Var.h();
                return (kg2.b) z0Var.f79776l.b(z0.f79764n[13]).f122121f;
            case 2:
                m174invoke();
                return Unit.f80348a;
            case 3:
                a0 a0Var = (a0) j2Var.e();
                return (ng2.e) a0Var.f79419a.a(a0Var, a0.f79418i[0]);
            case 4:
                a0 a0Var2 = (a0) j2Var.e();
                return (dg2.a) a0Var2.f79420b.a(a0Var2, a0.f79418i[1]);
            case 5:
                a0 a0Var3 = (a0) j2Var.e();
                return (dg2.d) a0Var3.f79421c.a(a0Var3, a0.f79418i[2]);
            case 6:
                a0 a0Var4 = (a0) j2Var.e();
                return (zf2.e) a0Var4.f79425g.a(a0Var4, a0.f79418i[6]);
            case 7:
                kl2.c cVar = j2Var.f79562n;
                k c13 = j2Var.c();
                l3 m14 = j2Var.m();
                o d13 = j2Var.d();
                d3 d3Var = j2Var.A;
                if (d3Var == null) {
                    Intrinsics.r("storageModule");
                    throw null;
                }
                return (h0) cVar.m(c13, j2Var.f79550b, j2Var.f79551c, m14, d13, d3Var, j2Var.g(), j2Var.a(), null, null, null, null, null);
            case 8:
                l0 l0Var = (l0) j2Var.f();
                zg2.a aVar = (zg2.a) l0Var.f79592g.a(l0Var, l0.f79585m[5]);
                if (aVar == null) {
                    return null;
                }
                ei2.u d14 = ((s2) j2Var.f79551c).d();
                g2 notifier = new g2(aVar, 0);
                d14.getClass();
                Intrinsics.checkNotNullParameter(notifier, "notifier");
                d14.f59040d = notifier;
                return Unit.f80348a;
            case 9:
                switch (i13) {
                    case 9:
                        return ((i) j2Var.b()).a();
                    default:
                        return ((i) j2Var.b()).a();
                }
            case 10:
                qf2.e a14 = ((o2) j2Var.j()).a();
                if (a14 != null) {
                    return (Map) ((qf2.b) a14).f103785b.getValue();
                }
                return null;
            case 11:
                i iVar = (i) j2Var.b();
                of2.a aVar2 = (of2.a) iVar.f79519c.a(iVar, i.f79516i[1]);
                o2 o2Var = (o2) j2Var.j();
                return new eg2.a(aVar2, (qf2.c) o2Var.f79633b.a(o2Var, o2.f79631e[1]));
            case 12:
                kl2.b bVar = j2Var.f79569u;
                o d15 = j2Var.d();
                l3 m15 = j2Var.m();
                h3 h3Var2 = j2Var.f79573y;
                if (h3Var2 == null) {
                    Intrinsics.r("systemServiceModule");
                    throw null;
                }
                return (v2) bVar.a(j2Var.f79550b, d15, m15, h3Var2, j2Var.a(), j2Var.g(), j2Var.c(), new e2(j2Var, 10), j2Var.f79551c, new e2(j2Var, 11), j2Var.f());
            case 13:
                m174invoke();
                return Unit.f80348a;
            case 14:
                kl2.b bVar2 = j2Var.f79565q;
                o d16 = j2Var.d();
                v2 k13 = j2Var.k();
                l3 m16 = j2Var.m();
                k c14 = j2Var.c();
                d3 d3Var2 = j2Var.A;
                if (d3Var2 == null) {
                    Intrinsics.r("storageModule");
                    throw null;
                }
                return (k2) bVar2.a(j2Var.f79550b, d16, k13, m16, c14, d3Var2, j2Var.g(), j2Var.f79551c, g.f79503q, g.f79504r, g.f79505s);
            case 15:
                kl2.p pVar = j2Var.f79566r;
                o0 g13 = j2Var.g();
                k c15 = j2Var.c();
                v2 k14 = j2Var.k();
                a a15 = j2Var.a();
                l3 m17 = j2Var.m();
                k2 k2Var = j2Var.G;
                if (k2Var != null) {
                    return (n2) pVar.k(j2Var.f79550b, g13, c15, k14, a15, m17, k2Var);
                }
                Intrinsics.r("nativeCoreModule");
                throw null;
            case 16:
                return ((o2) j2Var.j()).a();
            case 17:
                return (h1) j2Var.f79564p.d(j2Var.f79550b, j2Var.f79551c, j2Var.a(), j2Var.g(), j2Var.c(), j2Var.f(), j2Var.m(), j2Var.k());
            case 18:
                i1 i1Var = (i1) j2Var.i();
                return (nh2.e) i1Var.f79538g.a(i1Var, i1.f79531h[6]);
            case 19:
                return ((i1) j2Var.i()).a();
            case 20:
                m174invoke();
                return Unit.f80348a;
            case 21:
                kl2.a aVar3 = j2Var.f79567s;
                a a16 = j2Var.a();
                o0 g14 = j2Var.g();
                k c16 = j2Var.c();
                h0 f13 = j2Var.f();
                d0 d0Var2 = j2Var.I;
                if (d0Var2 == null) {
                    Intrinsics.r("dataSourceModule");
                    throw null;
                }
                v2 k15 = j2Var.k();
                a0 a0Var5 = (a0) j2Var.e();
                return (z2) aVar3.q(j2Var.f79550b, j2Var.f79551c, a16, g14, c16, f13, d0Var2, k15, (jg2.d) a0Var5.f79422d.a(a0Var5, a0.f79418i[3]), j2Var.i());
            case 22:
                return (l3) j2Var.f79556h.invoke();
            case 23:
                m174invoke();
                return Unit.f80348a;
            case 24:
                kl2.n nVar = j2Var.f79568t;
                d3 d3Var3 = j2Var.A;
                if (d3Var3 == null) {
                    Intrinsics.r("storageModule");
                    throw null;
                }
                return (s) nVar.p(j2Var.f79550b, d3Var3, j2Var.g(), j2Var.c(), j2Var.a());
            case 25:
                s sVar = j2Var.L;
                if (sVar == null) {
                    Intrinsics.r("crashModule");
                    throw null;
                }
                v vVar = (v) sVar;
                return (cg2.a) vVar.f79721b.a(vVar, v.f79719d[1]);
            case 26:
                switch (i13) {
                    case 9:
                        return ((i) j2Var.b()).a();
                    default:
                        return ((i) j2Var.b()).a();
                }
            case 27:
                i1 i1Var2 = (i1) j2Var.i();
                return (mh2.j) i1Var2.f79537f.a(i1Var2, i1.f79531h[5]);
            case 28:
                return ((b3) j2Var.l()).a();
            default:
                return ((l0) j2Var.f()).b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.ArrayList] */
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m174invoke() {
        ?? r53;
        int i13 = 1;
        switch (this.f79473i) {
            case 2:
                j2 j2Var = this.f79474j;
                z0 z0Var = (z0) j2Var.h();
                uf2.d state = (uf2.d) z0Var.f79766b.a(z0Var, z0.f79764n[0]);
                tf2.b bVar = (tf2.b) z0Var.f79765a;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                bVar.f117568c.add(state);
                tf2.a aVar = new tf2.a(state, bVar, 0);
                if (state.f122118c) {
                    bVar.f117566a.b(new p4.a(10, aVar));
                } else {
                    aVar.invoke();
                }
                lh2.b bVar2 = ((d1) j2Var.f79550b).f79456b;
                e2 e2Var = new e2(j2Var, i13);
                lh2.e eVar = (lh2.e) bVar2;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(e2Var, "<set-?>");
                eVar.f83530b = e2Var;
                break;
            case 13:
                y2 y2Var = (y2) this.f79474j.k();
                gg2.d dVar = (gg2.d) ((gg2.e) y2Var.f79760j.a(y2Var, y2.f79750l[9]));
                dVar.getClass();
                dVar.f64980e.b(new s81.g(dVar, 26));
                break;
            case 20:
                i1 i1Var = (i1) this.f79474j.i();
                mh2.k kVar = (mh2.k) ((mh2.j) i1Var.f79537f.a(i1Var, i1.f79531h[5]));
                eh2.a aVar2 = kVar.f87187e;
                eh2.c cVar = (eh2.c) aVar2.f58951c;
                cVar.getClass();
                ArrayList arrayList = new ArrayList();
                mh2.n nVar = cVar.f58953a;
                mh2.l lVar = (mh2.l) nVar.f87194b.poll();
                while (lVar != null) {
                    arrayList.add(new mh2.l(new LogPayload(kotlin.collections.e0.b(lVar.f87191a)), lVar.f87192b));
                    lVar = arrayList.size() < 10 ? (mh2.l) nVar.f87194b.poll() : null;
                }
                if (!arrayList.isEmpty()) {
                    r53 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        mh2.l lVar2 = (mh2.l) it.next();
                        r53.add(new mh2.l(aVar2.a((LogPayload) lVar2.f87191a), lVar2.f87192b));
                    }
                } else {
                    r53 = kotlin.collections.q0.f80391a;
                }
                for (mh2.l lVar3 : (Iterable) r53) {
                    if (lVar3.f87192b) {
                        di2.b bVar3 = kVar.f87186d;
                        if (bVar3 != null) {
                            bVar3.f((Envelope) lVar3.f87191a, false);
                        }
                    } else {
                        di2.b bVar4 = kVar.f87186d;
                        if (bVar4 != null) {
                            bVar4.f((Envelope) lVar3.f87191a, true);
                        }
                    }
                }
                kVar.f87188f.set(kVar.f87184b.now());
                kVar.f87189g.compareAndSet(0L, kVar.f87188f.get());
                if (!kVar.b()) {
                    kVar.f87189g.compareAndSet(0L, kVar.f87188f.get());
                    long now = kVar.f87184b.now();
                    long j13 = 5000 - (now - kVar.f87189g.get());
                    long j14 = CameraPreview.AUTOFOCUS_INTERVAL_MILLIS - (now - kVar.f87188f.get());
                    ScheduledFuture scheduledFuture = kVar.f87190h;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    kVar.f87190h = kVar.f87183a.a(new e3(kVar, 1), Long.min(j13, j14), TimeUnit.MILLISECONDS);
                    break;
                }
                break;
            default:
                final j2 j2Var2 = this.f79474j;
                ((bg2.a) ((r0) j2Var2.g()).c()).a(new bg2.b() { // from class: kh2.h2
                    @Override // bg2.b
                    public final void d(qg2.k it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        z0 z0Var2 = (z0) j2.this.h();
                        bg2.e eVar2 = (bg2.e) z0Var2.f79777m.b(z0.f79764n[14]).f122121f;
                        if (eVar2 != null) {
                            eVar2.d(it2);
                        }
                    }
                });
                break;
        }
    }
}
