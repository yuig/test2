package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u1 {

    /* renamed from: h, reason: collision with root package name */
    public static final c50.c1 f67268h = new c50.c1(6);

    /* renamed from: a, reason: collision with root package name */
    public final Long f67269a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f67270b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f67271c;

    /* renamed from: d, reason: collision with root package name */
    public final Short f67272d;

    /* renamed from: e, reason: collision with root package name */
    public final Short f67273e;

    /* renamed from: f, reason: collision with root package name */
    public final String f67274f;

    /* renamed from: g, reason: collision with root package name */
    public final String f67275g;

    public u1(Long l13, Long l14, Long l15, Short sh3, Short sh4, String str, String str2) {
        this.f67269a = l13;
        this.f67270b = l14;
        this.f67271c = l15;
        this.f67272d = sh3;
        this.f67273e = sh4;
        this.f67274f = str;
        this.f67275g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return Intrinsics.d(this.f67269a, u1Var.f67269a) && Intrinsics.d(this.f67270b, u1Var.f67270b) && Intrinsics.d(this.f67271c, u1Var.f67271c) && Intrinsics.d(this.f67272d, u1Var.f67272d) && Intrinsics.d(this.f67273e, u1Var.f67273e) && Intrinsics.d(this.f67274f, u1Var.f67274f) && Intrinsics.d(this.f67275g, u1Var.f67275g);
    }

    public final int hashCode() {
        Long l13 = this.f67269a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Long l14 = this.f67270b;
        int hashCode2 = (hashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f67271c;
        int hashCode3 = (hashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Short sh3 = this.f67272d;
        int hashCode4 = (hashCode3 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Short sh4 = this.f67273e;
        int hashCode5 = (hashCode4 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        String str = this.f67274f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f67275g;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OneBarModuleImpression(moduleId=");
        sb3.append(this.f67269a);
        sb3.append(", time=");
        sb3.append(this.f67270b);
        sb3.append(", endTime=");
        sb3.append(this.f67271c);
        sb3.append(", slotIndex=");
        sb3.append(this.f67272d);
        sb3.append(", moduleType=");
        sb3.append(this.f67273e);
        sb3.append(", moduleName=");
        sb3.append(this.f67274f);
        sb3.append(", clientTrackingParams=");
        return a.a.p(sb3, this.f67275g, ")");
    }
}
