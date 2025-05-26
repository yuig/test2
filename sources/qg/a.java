package qg;

import android.os.SystemClock;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final tg.a f103803a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f103804b;

    public a(tg.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f103803a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f103804b = map;
    }

    public final long a(ig.c cVar, long j13) {
        long elapsedRealtime;
        switch (((tg.c) this.f103803a).f117572a) {
            case 0:
                elapsedRealtime = SystemClock.elapsedRealtime();
                break;
            default:
                elapsedRealtime = System.currentTimeMillis();
                break;
        }
        long j14 = j13 - elapsedRealtime;
        b bVar = (b) this.f103804b.get(cVar);
        long j15 = bVar.f103805a;
        return Math.min(Math.max((long) (Math.pow(3.0d, 0) * j15 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j15 > 1 ? j15 : 2L) * 0))), j14), bVar.f103806b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f103803a.equals(aVar.f103803a) && this.f103804b.equals(aVar.f103804b);
    }

    public final int hashCode() {
        return ((this.f103803a.hashCode() ^ 1000003) * 1000003) ^ this.f103804b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f103803a + ", values=" + this.f103804b + "}";
    }
}
