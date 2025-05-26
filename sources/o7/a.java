package o7;

import d7.n0;
import java.util.Objects;
import java.util.Set;
import pk.m1;
import pk.n3;
import pk.o1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f93014d;

    /* renamed from: a, reason: collision with root package name */
    public final int f93015a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93016b;

    /* renamed from: c, reason: collision with root package name */
    public final o1 f93017c;

    static {
        a aVar;
        if (n0.f53866a >= 33) {
            m1 m1Var = new m1(4);
            for (int i13 = 1; i13 <= 10; i13++) {
                m1Var.a(Integer.valueOf(n0.t(i13)));
            }
            aVar = new a(2, m1Var.m());
        } else {
            aVar = new a(2, 10);
        }
        f93014d = aVar;
    }

    public a(int i13, Set set) {
        this.f93015a = i13;
        o1 r13 = o1.r(set);
        this.f93017c = r13;
        n3 it = r13.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            i14 = Math.max(i14, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f93016b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f93015a == aVar.f93015a && this.f93016b == aVar.f93016b && Objects.equals(this.f93017c, aVar.f93017c);
    }

    public final int hashCode() {
        int i13 = ((this.f93015a * 31) + this.f93016b) * 31;
        o1 o1Var = this.f93017c;
        return i13 + (o1Var == null ? 0 : o1Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f93015a + ", maxChannelCount=" + this.f93016b + ", channelMasks=" + this.f93017c + "]";
    }

    public a(int i13, int i14) {
        this.f93015a = i13;
        this.f93016b = i14;
        this.f93017c = null;
    }
}
