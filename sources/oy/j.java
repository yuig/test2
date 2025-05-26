package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends ey.w1 {

    /* renamed from: e, reason: collision with root package name */
    public final String f98088e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f98089f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98090g;

    /* renamed from: h, reason: collision with root package name */
    public final r32.c f98091h;

    /* renamed from: i, reason: collision with root package name */
    public final String f98092i;

    /* renamed from: j, reason: collision with root package name */
    public final String f98093j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f98094k;

    /* renamed from: l, reason: collision with root package name */
    public final s92.o f98095l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, Boolean bool, String str2, r32.c cVar, String str3, String str4, boolean z13, s92.o pwtResult) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98088e = str;
        this.f98089f = bool;
        this.f98090g = str2;
        this.f98091h = cVar;
        this.f98092i = str3;
        this.f98093j = str4;
        this.f98094k = z13;
        this.f98095l = pwtResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f98088e, jVar.f98088e) && Intrinsics.d(this.f98089f, jVar.f98089f) && Intrinsics.d(this.f98090g, jVar.f98090g) && this.f98091h == jVar.f98091h && Intrinsics.d(this.f98092i, jVar.f98092i) && Intrinsics.d(this.f98093j, jVar.f98093j) && this.f98094k == jVar.f98094k && this.f98095l == jVar.f98095l;
    }

    public final int hashCode() {
        String str = this.f98088e;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f98089f;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f98090g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        r32.c cVar = this.f98091h;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str3 = this.f98092i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f98093j;
        return this.f98095l.hashCode() + ep.b.e(this.f98094k, (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "StoryPinPublishCompleteEvent(pinUid=" + this.f98088e + ", isDraft=" + this.f98089f + ", failureMessage=" + this.f98090g + ", failureReason=" + this.f98091h + ", failureResponseCode=" + this.f98092i + ", entryType=" + this.f98093j + ", isUserCancelled=" + this.f98094k + ", pwtResult=" + this.f98095l + ")";
    }
}
