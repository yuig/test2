package yh2;

import kotlin.jvm.internal.Intrinsics;
import th2.h;
import th2.i;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f139054a;

    /* renamed from: b, reason: collision with root package name */
    public final long f139055b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139056c;

    /* renamed from: d, reason: collision with root package name */
    public final h f139057d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f139058e;

    /* renamed from: f, reason: collision with root package name */
    public final i f139059f;

    public c(String sessionId, long j13, int i13, h appState, boolean z13, i startType) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f139054a = sessionId;
        this.f139055b = j13;
        this.f139056c = i13;
        this.f139057d = appState;
        this.f139058e = z13;
        this.f139059f = startType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f139054a, cVar.f139054a) && this.f139055b == cVar.f139055b && this.f139056c == cVar.f139056c && this.f139057d == cVar.f139057d && this.f139058e == cVar.f139058e && this.f139059f == cVar.f139059f;
    }

    public final int hashCode() {
        return this.f139059f.hashCode() + ep.b.e(this.f139058e, (this.f139057d.hashCode() + ep.b.b(this.f139056c, a.a.c(this.f139055b, this.f139054a.hashCode() * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "SessionZygote(sessionId=" + this.f139054a + ", startTime=" + this.f139055b + ", number=" + this.f139056c + ", appState=" + this.f139057d + ", isColdStart=" + this.f139058e + ", startType=" + this.f139059f + ')';
    }
}
