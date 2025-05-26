package wr1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f130943a;

    /* renamed from: b, reason: collision with root package name */
    public final String f130944b;

    /* renamed from: c, reason: collision with root package name */
    public final String f130945c;

    public b0(String email, String password, String userId) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f130943a = email;
        this.f130944b = password;
        this.f130945c = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f130943a, b0Var.f130943a) && Intrinsics.d(this.f130944b, b0Var.f130944b) && Intrinsics.d(this.f130945c, b0Var.f130945c);
    }

    public final int hashCode() {
        return this.f130945c.hashCode() + cb.d(this.f130944b, this.f130943a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PasswordLoginButtonClick(email=");
        sb3.append(this.f130943a);
        sb3.append(", password=");
        sb3.append(this.f130944b);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f130945c, ")");
    }
}
