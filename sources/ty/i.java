package ty;

import ey.j3;
import ey.k3;
import ey.o1;
import ey.u1;
import ey.v1;
import h32.a4;
import h32.d4;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import s92.l;
import s92.o;

/* loaded from: classes.dex */
public final class i extends v1 {

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f119703f;

    /* renamed from: g, reason: collision with root package name */
    public d4 f119704g;

    /* renamed from: h, reason: collision with root package name */
    public a4 f119705h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f119703f = new LinkedHashSet();
    }

    @Override // ey.v1
    public final Set b() {
        return j.f119706a;
    }

    @Override // ey.v1
    public final void c() {
        this.f119703f.clear();
        super.c();
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        String l13;
        Long l14;
        Long l15;
        Long l16;
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        long c13 = e13.c();
        if (e13 instanceof e) {
            e eVar = (e) e13;
            String l17 = eVar.l();
            if (l17 != null && l17.length() != 0 && !d()) {
                q(c13);
                o1 o1Var = this.f60594b;
                if (o1Var != null && (l16 = o1Var.b().f107709a) != null) {
                    long longValue = l16.longValue();
                    j3 j3Var = j3.f60510a;
                    String pinUid = eVar.l();
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    j3.f60514e.putIfAbsent(pinUid, Long.valueOf(longValue));
                }
                j("video.url", eVar.n());
                j("pin.id", l17);
                l("video.player_enable_audio", eVar.m());
                d4 p13 = eVar.p();
                if (p13 == null) {
                    p13 = d4.UNKNOWN_VIEW;
                }
                this.f119704g = p13;
                this.f119705h = eVar.o();
            }
        } else if (e13 instanceof f) {
            f fVar = (f) e13;
            l("video.player_is_cached", fVar.n());
            Integer m13 = fVar.m();
            if (m13 != null) {
                h(m13.intValue(), "video.slot_index");
            }
        } else {
            boolean z13 = e13 instanceof g;
            LinkedHashSet linkedHashSet = this.f119703f;
            if (z13) {
                String l18 = ((g) e13).l();
                if (l18 != null && l18.length() != 0 && d() && !linkedHashSet.contains(l18)) {
                    linkedHashSet.add(l18);
                    q(c13);
                }
            } else if (e13 instanceof c) {
                c cVar = (c) e13;
                String l19 = cVar.l();
                if (l19 != null && l19.length() != 0 && !d()) {
                    o1 o1Var2 = this.f60594b;
                    if (o1Var2 != null && (l15 = o1Var2.b().f107709a) != null) {
                        long longValue2 = l15.longValue();
                        j3 j3Var2 = j3.f60510a;
                        String pinUid2 = cVar.l();
                        Intrinsics.checkNotNullParameter(pinUid2, "pinUid");
                        j3.f60514e.putIfAbsent(pinUid2, Long.valueOf(longValue2));
                    }
                    q(c13);
                }
            } else if (e13 instanceof d) {
                String l23 = ((d) e13).l();
                if (l23 != null && l23.length() != 0 && d()) {
                    r(c13);
                    o1 o1Var3 = this.f60594b;
                    if (o1Var3 != null) {
                        ly1.f a13 = o1Var3.a();
                        l14 = Long.valueOf(a13.f85169h - a13.f85164c);
                    } else {
                        l14 = null;
                    }
                    s(new g(l23));
                    if (!d() || !linkedHashSet.contains(l23)) {
                        c();
                        return true;
                    }
                    linkedHashSet.remove(l23);
                    if (l14 != null) {
                        i(l14.longValue(), "video.preload_duration");
                    }
                    a(o.COMPLETE, l.USER_NAVIGATION, this.f119704g, this.f119705h, c13, false);
                }
            } else if (e13 instanceof b) {
                String l24 = ((b) e13).l();
                if (l24 == null || l24.length() == 0 || !d()) {
                    return true;
                }
                l("video.is_preload_failed", true);
                a(o.ERROR, l.USER_NAVIGATION, this.f119704g, this.f119705h, c13, false);
            } else if ((e13 instanceof a) && (l13 = ((a) e13).l()) != null && l13.length() != 0 && d()) {
                l("video.is_cancelled", true);
                a(o.ABORTED, l.USER_NAVIGATION, this.f119704g, this.f119705h, c13, false);
            }
        }
        return true;
    }
}
