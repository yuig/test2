package hh1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends l {

    /* renamed from: f, reason: collision with root package name */
    public final vn1.c f69192f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69193g;

    /* renamed from: h, reason: collision with root package name */
    public final String f69194h;

    /* renamed from: i, reason: collision with root package name */
    public final String f69195i;

    /* renamed from: j, reason: collision with root package name */
    public final String f69196j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f69197k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f69198l;

    public n(String str, String str2, String userId, Integer num) {
        vn1.c textColor = vn1.c.DEFAULT;
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f69192f = textColor;
        this.f69193g = true;
        this.f69194h = str;
        this.f69195i = str2;
        this.f69196j = userId;
        this.f69197k = null;
        this.f69198l = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f69192f == nVar.f69192f && this.f69193g == nVar.f69193g && Intrinsics.d(this.f69194h, nVar.f69194h) && Intrinsics.d(this.f69195i, nVar.f69195i) && Intrinsics.d(this.f69196j, nVar.f69196j) && Intrinsics.d(this.f69197k, nVar.f69197k) && Intrinsics.d(this.f69198l, nVar.f69198l);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f69193g, this.f69192f.hashCode() * 31, 31);
        String str = this.f69194h;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69195i;
        int d2 = cb.d(this.f69196j, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f69197k;
        int hashCode2 = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f69198l;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AtMentionTagData(textColor=");
        sb3.append(this.f69192f);
        sb3.append(", showArrow=");
        sb3.append(this.f69193g);
        sb3.append(", username=");
        sb3.append(this.f69194h);
        sb3.append(", imageUrl=");
        sb3.append(this.f69195i);
        sb3.append(", userId=");
        sb3.append(this.f69196j);
        sb3.append(", foregroundDrawableId=");
        sb3.append(this.f69197k);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f69198l, ")");
    }
}
