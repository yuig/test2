package oy;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f98230a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98231b;

    /* renamed from: c, reason: collision with root package name */
    public final String f98232c;

    /* renamed from: d, reason: collision with root package name */
    public final int f98233d;

    /* renamed from: e, reason: collision with root package name */
    public final long f98234e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f98235f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f98236g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f98237h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f98238i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f98239j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f98240k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f98241l;

    public x0(String uniqueIdentifier, String pageId, String fileUri, int i13, long j13, Integer num, Integer num2, Boolean bool, Long l13, Integer num3, Integer num4, Boolean bool2) {
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        this.f98230a = uniqueIdentifier;
        this.f98231b = pageId;
        this.f98232c = fileUri;
        this.f98233d = i13;
        this.f98234e = j13;
        this.f98235f = num;
        this.f98236g = num2;
        this.f98237h = bool;
        this.f98238i = l13;
        this.f98239j = num3;
        this.f98240k = num4;
        this.f98241l = bool2;
    }

    public final Long a() {
        return this.f98238i;
    }

    public final Integer b() {
        return this.f98240k;
    }

    public final Integer c() {
        return this.f98239j;
    }

    public final long d() {
        return this.f98234e;
    }

    public final String e() {
        return this.f98232c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.f98230a, x0Var.f98230a) && Intrinsics.d(this.f98231b, x0Var.f98231b) && Intrinsics.d(this.f98232c, x0Var.f98232c) && this.f98233d == x0Var.f98233d && this.f98234e == x0Var.f98234e && Intrinsics.d(this.f98235f, x0Var.f98235f) && Intrinsics.d(this.f98236g, x0Var.f98236g) && Intrinsics.d(this.f98237h, x0Var.f98237h) && Intrinsics.d(this.f98238i, x0Var.f98238i) && Intrinsics.d(this.f98239j, x0Var.f98239j) && Intrinsics.d(this.f98240k, x0Var.f98240k) && Intrinsics.d(this.f98241l, x0Var.f98241l);
    }

    public final Boolean f() {
        return this.f98241l;
    }

    public final String g() {
        return this.f98231b;
    }

    public final Integer h() {
        return this.f98236g;
    }

    public final int hashCode() {
        int c13 = a.a.c(this.f98234e, ep.b.b(this.f98233d, cb.d(this.f98232c, cb.d(this.f98231b, this.f98230a.hashCode() * 31, 31), 31), 31), 31);
        Integer num = this.f98235f;
        int hashCode = (c13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f98236g;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f98237h;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l13 = this.f98238i;
        int hashCode4 = (hashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num3 = this.f98239j;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f98240k;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool2 = this.f98241l;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Integer i() {
        return this.f98235f;
    }

    public final int j() {
        return this.f98233d;
    }

    public final String k() {
        return this.f98230a;
    }

    public final Boolean l() {
        return this.f98237h;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StartEvent(uniqueIdentifier=");
        sb3.append(this.f98230a);
        sb3.append(", pageId=");
        sb3.append(this.f98231b);
        sb3.append(", fileUri=");
        sb3.append(this.f98232c);
        sb3.append(", retryCount=");
        sb3.append(this.f98233d);
        sb3.append(", fileSizeInBytes=");
        sb3.append(this.f98234e);
        sb3.append(", rawImageWidth=");
        sb3.append(this.f98235f);
        sb3.append(", rawImageHeight=");
        sb3.append(this.f98236g);
        sb3.append(", isCoverImage=");
        sb3.append(this.f98237h);
        sb3.append(", exportedFileSizeInBytes=");
        sb3.append(this.f98238i);
        sb3.append(", exportedImageWidth=");
        sb3.append(this.f98239j);
        sb3.append(", exportedImageHeight=");
        sb3.append(this.f98240k);
        sb3.append(", mediaExportSkipped=");
        return a.c.h(sb3, this.f98241l, ")");
    }
}
