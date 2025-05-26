package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final AccessToken f30087a;

    /* renamed from: b, reason: collision with root package name */
    public final AuthenticationToken f30088b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f30089c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f30090d;

    public y(AccessToken accessToken, AuthenticationToken authenticationToken, LinkedHashSet recentlyGrantedPermissions, LinkedHashSet recentlyDeniedPermissions) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.f30087a = accessToken;
        this.f30088b = authenticationToken;
        this.f30089c = recentlyGrantedPermissions;
        this.f30090d = recentlyDeniedPermissions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f30087a, yVar.f30087a) && Intrinsics.d(this.f30088b, yVar.f30088b) && Intrinsics.d(this.f30089c, yVar.f30089c) && Intrinsics.d(this.f30090d, yVar.f30090d);
    }

    public final int hashCode() {
        int hashCode = this.f30087a.hashCode() * 31;
        AuthenticationToken authenticationToken = this.f30088b;
        return this.f30090d.hashCode() + ((this.f30089c.hashCode() + ((hashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.f30087a + ", authenticationToken=" + this.f30088b + ", recentlyGrantedPermissions=" + this.f30089c + ", recentlyDeniedPermissions=" + this.f30090d + ')';
    }
}
