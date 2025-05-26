package com.bugsnag.android;

import a.cb;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: f, reason: collision with root package name */
    public static final eb.d f29694f = new eb.d(18, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f29695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29696b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29697c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29698d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f29699e;

    public y0(String str, String str2, long j13, String str3, Set set) {
        this.f29695a = str;
        this.f29696b = str2;
        this.f29697c = j13;
        this.f29698d = str3;
        this.f29699e = set;
    }

    public final String a() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f29697c);
        sb3.append('_');
        sb3.append(this.f29695a);
        sb3.append('_');
        sb3.append(kh2.j1.n1(this.f29699e));
        sb3.append('_');
        sb3.append(this.f29696b);
        sb3.append('_');
        return a.a.p(sb3, this.f29698d, ".json");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.f29695a, y0Var.f29695a) && Intrinsics.d(this.f29696b, y0Var.f29696b) && this.f29697c == y0Var.f29697c && Intrinsics.d(this.f29698d, y0Var.f29698d) && Intrinsics.d(this.f29699e, y0Var.f29699e);
    }

    public final int hashCode() {
        return this.f29699e.hashCode() + cb.d(this.f29698d, a.a.c(this.f29697c, cb.d(this.f29696b, this.f29695a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "EventFilenameInfo(apiKey=" + this.f29695a + ", uuid=" + this.f29696b + ", timestamp=" + this.f29697c + ", suffix=" + this.f29698d + ", errorTypes=" + this.f29699e + ')';
    }
}
