package wr1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f130987a;

    /* renamed from: b, reason: collision with root package name */
    public final String f130988b;

    /* renamed from: c, reason: collision with root package name */
    public final String f130989c;

    /* renamed from: d, reason: collision with root package name */
    public final mr1.c f130990d;

    /* renamed from: e, reason: collision with root package name */
    public final h32.i0 f130991e;

    public p0(String email, String password, String userId, mr1.c activityProvider, h32.i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f130987a = email;
        this.f130988b = password;
        this.f130989c = userId;
        this.f130990d = activityProvider;
        this.f130991e = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f130987a, p0Var.f130987a) && Intrinsics.d(this.f130988b, p0Var.f130988b) && Intrinsics.d(this.f130989c, p0Var.f130989c) && Intrinsics.d(this.f130990d, p0Var.f130990d) && Intrinsics.d(this.f130991e, p0Var.f130991e);
    }

    public final int hashCode() {
        return this.f130991e.hashCode() + ((this.f130990d.hashCode() + cb.d(this.f130989c, cb.d(this.f130988b, this.f130987a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "PasswordAuthSideEffectRequest(email=" + this.f130987a + ", password=" + this.f130988b + ", userId=" + this.f130989c + ", activityProvider=" + this.f130990d + ", pinalyticsContext=" + this.f130991e + ")";
    }
}
