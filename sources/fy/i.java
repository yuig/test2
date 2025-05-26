package fy;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.appsflyer.internal.p;
import ey.j3;
import ey.k3;
import ey.o1;
import ey.u1;
import ey.v1;
import h32.d4;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ny.l;
import s92.o;

/* loaded from: classes.dex */
public final class i extends v1 {

    /* renamed from: f, reason: collision with root package name */
    public long f63100f;

    /* renamed from: g, reason: collision with root package name */
    public long f63101g;

    /* renamed from: h, reason: collision with root package name */
    public final f f63102h;

    /* renamed from: i, reason: collision with root package name */
    public long f63103i;

    /* renamed from: j, reason: collision with root package name */
    public long f63104j;

    /* renamed from: k, reason: collision with root package name */
    public long f63105k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f63102h = new f(2, 0);
    }

    @Override // ey.v1
    public final Set b() {
        return j.f63106a;
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof c) {
            u1 startEvent = (c) e13;
            Intrinsics.checkNotNullParameter(startEvent, "startEvent");
            j3 j3Var = j3.f60510a;
            long uptimeMillis = SystemClock.uptimeMillis() - j3.f60512c;
            this.f63100f = uptimeMillis;
            long j13 = j3.f60513d;
            this.f63101g = j13;
            l lVar = new l(s92.l.COLD_START, uptimeMillis + j13);
            if (d()) {
                return true;
            }
            Intrinsics.checkNotNullParameter(startEvent, "startEvent");
            long uptimeMillis2 = SystemClock.uptimeMillis() - j3.f60512c;
            this.f63100f = uptimeMillis2;
            long j14 = j3.f60513d;
            this.f63101g = j14;
            long j15 = (j3.f60512c - j3.f60511b) + uptimeMillis2;
            q(j14 + uptimeMillis2);
            s(this.f63102h);
            q(this.f63101g + this.f63100f);
            r(j15);
            q(j15);
            r(this.f63100f);
            s(startEvent);
            lVar.i();
            return true;
        }
        if (!(e13 instanceof d)) {
            if (e13 instanceof a) {
                this.f63103i = ((a) e13).f63094d;
                new Handler(Looper.getMainLooper()).postDelayed(new p(9), 10000L);
                return true;
            }
            if (e13 instanceof e) {
                e eVar = (e) e13;
                if (!d()) {
                    return true;
                }
                String str = eVar.f63098d;
                if (str != null) {
                    j("first_visual_activity", str);
                }
                if (this.f63103i != 0) {
                    this.f63105k = (eVar.d() + eVar.c()) - this.f63103i;
                }
                v(this.f63104j, this.f63105k);
                return true;
            }
            if (e13 instanceof b) {
                c();
                return true;
            }
            if (!(e13 instanceof g)) {
                return true;
            }
            f("ready_to_send_home_feed_api_request");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o1 o1Var = this.f60594b;
            i(elapsedRealtime - (o1Var != null ? o1Var.a().f85167f : 0L), "ready_to_send_home_feed_api_request");
            return true;
        }
        d completeEvent = (d) e13;
        if (!d()) {
            return true;
        }
        String str2 = completeEvent.f63097f;
        if (str2 == null) {
            c();
            return true;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        Intrinsics.checkNotNullParameter(completeEvent, "completeEvent");
        long c13 = completeEvent.c();
        String str3 = h.f63099a;
        u(new ny.b(str3, 0));
        q(elapsedRealtime2 - vb0.j.f125469d);
        if (vb0.j.f125471f != 0) {
            u(new ny.a(0));
            q(elapsedRealtime2 - vb0.j.f125471f);
            j("source", "api_conn_warmup");
            r(vb0.j.f125472g != 0 ? SystemClock.elapsedRealtime() - vb0.j.f125472g : c13);
            s(new ny.b(str3, 0));
        }
        if (vb0.j.f125473h != 0) {
            u(new ny.a(1));
            q(elapsedRealtime2 - vb0.j.f125473h);
            j("source", "api_conn_warmup");
            r(vb0.j.f125474i != 0 ? SystemClock.elapsedRealtime() - vb0.j.f125474i : c13);
            s(new ny.b(str3, 0));
        }
        r(vb0.j.f125470e != 0 ? SystemClock.elapsedRealtime() - vb0.j.f125470e : c13);
        u(new ny.b(str3, 1));
        q(elapsedRealtime2 - vb0.j.f125475j);
        if (vb0.j.f125477l != 0) {
            u(new ny.a(2));
            q(elapsedRealtime2 - vb0.j.f125477l);
            j("source", "image_conn_warmup");
            r(vb0.j.f125478m != 0 ? SystemClock.elapsedRealtime() - vb0.j.f125478m : c13);
            s(new ny.b(str3, 1));
        }
        if (vb0.j.f125479n != 0) {
            u(new ny.a(3));
            q(elapsedRealtime2 - vb0.j.f125479n);
            j("source", "image_conn_warmup");
            r(vb0.j.f125480o != 0 ? SystemClock.elapsedRealtime() - vb0.j.f125480o : c13);
            s(new ny.b(str3, 1));
        }
        if (vb0.j.f125476k != 0) {
            c13 = SystemClock.elapsedRealtime() - vb0.j.f125476k;
        }
        r(c13);
        vb0.j.f125471f = 0L;
        vb0.j.f125472g = 0L;
        vb0.j.f125473h = 0L;
        vb0.j.f125474i = 0L;
        vb0.j.f125469d = 0L;
        vb0.j.f125470e = 0L;
        vb0.j.f125477l = 0L;
        vb0.j.f125478m = 0L;
        vb0.j.f125479n = 0L;
        vb0.j.f125480o = 0L;
        vb0.j.f125475j = 0L;
        vb0.j.f125476k = 0L;
        s(completeEvent);
        l("api_warmup_complete", vb0.j.f125470e != 0);
        l("image_warmup_complete", vb0.j.f125476k != 0);
        int i13 = completeEvent.f63096e;
        if (i13 != -1) {
            h(i13, "profile_install_result_code");
        }
        j("base_activity", str2);
        long c14 = completeEvent.c() + completeEvent.f63095d;
        this.f63104j = c14;
        v(c14, this.f63105k);
        return true;
    }

    public final void v(long j13, long j14) {
        if (j13 <= 0 || j14 <= 0) {
            return;
        }
        a(o.COMPLETE, s92.l.COLD_START, d4.FEED, null, j13 > j14 ? j13 : j14, false);
    }
}
