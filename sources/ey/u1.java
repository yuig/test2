package ey;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: b, reason: collision with root package name */
    public static m60.w f60582b;

    /* renamed from: a, reason: collision with root package name */
    public long f60583a = SystemClock.elapsedRealtime();

    public String b() {
        return "";
    }

    public final long c() {
        return SystemClock.elapsedRealtime() - this.f60583a;
    }

    public final long d() {
        return this.f60583a;
    }

    public abstract String e();

    public String f() {
        return null;
    }

    public String g() {
        return null;
    }

    public String[] h() {
        return null;
    }

    public void i() {
        if (f60582b == null) {
            f60582b = m60.u.f85943a;
        }
        m60.w wVar = f60582b;
        if (wVar != null) {
            wVar.d(this);
        }
    }

    public final void j(long j13) {
        this.f60583a = j13;
    }

    public final void k(q8.c0 perfEventTime) {
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f60583a = perfEventTime.f102894a;
    }
}
