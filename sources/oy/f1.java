package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f1 extends r {

    /* renamed from: f, reason: collision with root package name */
    public final String f98046f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98047g;

    /* renamed from: h, reason: collision with root package name */
    public final String f98048h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f98049i;

    /* renamed from: j, reason: collision with root package name */
    public final s92.o f98050j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(String str, String str2, String str3, Boolean bool, s92.o pwtResult) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98046f = str;
        this.f98047g = str2;
        this.f98048h = str3;
        this.f98049i = bool;
        this.f98050j = pwtResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Intrinsics.d(this.f98046f, f1Var.f98046f) && Intrinsics.d(this.f98047g, f1Var.f98047g) && Intrinsics.d(this.f98048h, f1Var.f98048h) && Intrinsics.d(this.f98049i, f1Var.f98049i) && this.f98050j == f1Var.f98050j;
    }

    public final int hashCode() {
        String str = this.f98046f;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f98047g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f98048h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f98049i;
        return this.f98050j.hashCode() + ((hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MediaUploadStatusEndEvent(uploadIdToStatus=" + this.f98046f + ", videoSignatures=" + this.f98047g + ", failureMessage=" + this.f98048h + ", isUserCancelled=" + this.f98049i + ", pwtResult=" + this.f98050j + ")";
    }
}
