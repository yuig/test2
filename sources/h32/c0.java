package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: k, reason: collision with root package name */
    public static final kp.n f66886k = new kp.n(8);

    /* renamed from: a, reason: collision with root package name */
    public final String f66887a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f66888b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f66889c;

    /* renamed from: d, reason: collision with root package name */
    public final Short f66890d;

    /* renamed from: e, reason: collision with root package name */
    public final String f66891e;

    /* renamed from: f, reason: collision with root package name */
    public final String f66892f;

    /* renamed from: g, reason: collision with root package name */
    public final String f66893g;

    /* renamed from: h, reason: collision with root package name */
    public final String f66894h;

    /* renamed from: i, reason: collision with root package name */
    public final String f66895i;

    /* renamed from: j, reason: collision with root package name */
    public final String f66896j;

    public c0(String str, Long l13, Long l14, Short sh3, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f66887a = str;
        this.f66888b = l13;
        this.f66889c = l14;
        this.f66890d = sh3;
        this.f66891e = str2;
        this.f66892f = str3;
        this.f66893g = str4;
        this.f66894h = str5;
        this.f66895i = str6;
        this.f66896j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f66887a, c0Var.f66887a) && Intrinsics.d(this.f66888b, c0Var.f66888b) && Intrinsics.d(this.f66889c, c0Var.f66889c) && Intrinsics.d(this.f66890d, c0Var.f66890d) && Intrinsics.d(this.f66891e, c0Var.f66891e) && Intrinsics.d(this.f66892f, c0Var.f66892f) && Intrinsics.d(this.f66893g, c0Var.f66893g) && Intrinsics.d(this.f66894h, c0Var.f66894h) && Intrinsics.d(this.f66895i, c0Var.f66895i) && Intrinsics.d(this.f66896j, c0Var.f66896j);
    }

    public final int hashCode() {
        String str = this.f66887a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l13 = this.f66888b;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f66889c;
        int hashCode3 = (hashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Short sh3 = this.f66890d;
        int hashCode4 = (hashCode3 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        String str2 = this.f66891e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66892f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f66893g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f66894h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f66895i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f66896j;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CommentImpression(commentId=");
        sb3.append(this.f66887a);
        sb3.append(", time=");
        sb3.append(this.f66888b);
        sb3.append(", endTime=");
        sb3.append(this.f66889c);
        sb3.append(", slotIndex=");
        sb3.append(this.f66890d);
        sb3.append(", pinId=");
        sb3.append(this.f66891e);
        sb3.append(", pinOwnerUserId=");
        sb3.append(this.f66892f);
        sb3.append(", pinType=");
        sb3.append(this.f66893g);
        sb3.append(", parentId=");
        sb3.append(this.f66894h);
        sb3.append(", parentType=");
        sb3.append(this.f66895i);
        sb3.append(", commentType=");
        return a.a.p(sb3, this.f66896j, ")");
    }
}
