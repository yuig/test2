package ek1;

import com.pinterest.api.model.f30;
import h32.a4;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final a4 f59275a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f59276b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.z1 f59277c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59278d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f59279e;

    public m0(a4 a4Var, f30 f30Var, h32.z1 z1Var, boolean z13, HashMap hashMap) {
        this.f59275a = a4Var;
        this.f59276b = f30Var;
        this.f59277c = z1Var;
        this.f59278d = z13;
        this.f59279e = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f59275a == m0Var.f59275a && Intrinsics.d(this.f59276b, m0Var.f59276b) && Intrinsics.d(this.f59277c, m0Var.f59277c) && this.f59278d == m0Var.f59278d && Intrinsics.d(this.f59279e, m0Var.f59279e);
    }

    public final int hashCode() {
        a4 a4Var = this.f59275a;
        int hashCode = (a4Var == null ? 0 : a4Var.hashCode()) * 31;
        f30 f30Var = this.f59276b;
        int hashCode2 = (hashCode + (f30Var == null ? 0 : f30Var.hashCode())) * 31;
        h32.z1 z1Var = this.f59277c;
        int e13 = ep.b.e(this.f59278d, (hashCode2 + (z1Var == null ? 0 : z1Var.hashCode())) * 31, 31);
        HashMap hashMap = this.f59279e;
        return e13 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final h32.z1 j() {
        return this.f59277c;
    }

    public final f30 k() {
        return this.f59276b;
    }

    public final a4 l() {
        return this.f59275a;
    }

    public final boolean m() {
        return this.f59278d;
    }

    public final String toString() {
        return "UpdatePinStaticPlaytimeTracker(viewParameterType=" + this.f59275a + ", pin=" + this.f59276b + ", impression=" + this.f59277c + ", isHalfVisible=" + this.f59278d + ", impressionLoggingAuxData=" + this.f59279e + ")";
    }
}
