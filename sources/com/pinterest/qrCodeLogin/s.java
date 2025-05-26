package com.pinterest.qrCodeLogin;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f50334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50335b;

    /* renamed from: c, reason: collision with root package name */
    public final String f50336c;

    public s(String email, String device, String str) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(device, "device");
        this.f50334a = email;
        this.f50335b = device;
        this.f50336c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f50334a, sVar.f50334a) && Intrinsics.d(this.f50335b, sVar.f50335b) && Intrinsics.d(this.f50336c, sVar.f50336c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f50335b, this.f50334a.hashCode() * 31, 31);
        String str = this.f50336c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TokenVerified(email=");
        sb3.append(this.f50334a);
        sb3.append(", device=");
        sb3.append(this.f50335b);
        sb3.append(", location=");
        return a.a.p(sb3, this.f50336c, ")");
    }
}
