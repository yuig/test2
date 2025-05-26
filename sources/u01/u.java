package u01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f119941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119942b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f119943c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119944d;

    /* renamed from: e, reason: collision with root package name */
    public final String f119945e;

    /* renamed from: f, reason: collision with root package name */
    public final String f119946f;

    /* renamed from: g, reason: collision with root package name */
    public final String f119947g;

    public u(String str, String str2, String str3, String str4, String str5, boolean z13, boolean z14) {
        this.f119941a = str;
        this.f119942b = str2;
        this.f119943c = z13;
        this.f119944d = z14;
        this.f119945e = str3;
        this.f119946f = str4;
        this.f119947g = str5;
    }

    public final String a() {
        return this.f119941a;
    }

    public final boolean b() {
        return this.f119944d;
    }

    public final String c() {
        return this.f119947g;
    }

    public final String d() {
        return this.f119946f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f119941a, uVar.f119941a) && Intrinsics.d(this.f119942b, uVar.f119942b) && this.f119943c == uVar.f119943c && this.f119944d == uVar.f119944d && Intrinsics.d(this.f119945e, uVar.f119945e) && Intrinsics.d(this.f119946f, uVar.f119946f) && Intrinsics.d(this.f119947g, uVar.f119947g);
    }

    public final int hashCode() {
        String str = this.f119941a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f119942b;
        int e13 = ep.b.e(this.f119944d, ep.b.e(this.f119943c, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.f119945e;
        int hashCode2 = (e13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f119946f;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f119947g;
        return hashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FeaturedCommentMetadata(featuredCommentId=");
        sb3.append(this.f119941a);
        sb3.append(", featuredCommentType=");
        sb3.append(this.f119942b);
        sb3.append(", featuredCommentIsHidden=");
        sb3.append(this.f119943c);
        sb3.append(", featuredIsFromPinIt=");
        sb3.append(this.f119944d);
        sb3.append(", featuredReplyId=");
        sb3.append(this.f119945e);
        sb3.append(", featuredSenderId=");
        sb3.append(this.f119946f);
        sb3.append(", featuredReplyPinUID=");
        return a.a.p(sb3, this.f119947g, ")");
    }
}
