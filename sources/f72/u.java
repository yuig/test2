package f72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* renamed from: a, reason: collision with root package name */
    public final String f61364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f61365b;

    /* renamed from: c, reason: collision with root package name */
    public final String f61366c;

    /* renamed from: d, reason: collision with root package name */
    public final String f61367d;

    /* renamed from: e, reason: collision with root package name */
    public final String f61368e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f61369f;

    public u(int i13, String str, String str2, String str3, String str4, String str5, Long l13) {
        if (25 != (i13 & 25)) {
            kg.t.b1(i13, 25, s.f61362b);
            throw null;
        }
        this.f61364a = str;
        if ((i13 & 2) == 0) {
            this.f61365b = null;
        } else {
            this.f61365b = str2;
        }
        if ((i13 & 4) == 0) {
            this.f61366c = null;
        } else {
            this.f61366c = str3;
        }
        this.f61367d = str4;
        this.f61368e = str5;
        if ((i13 & 32) == 0) {
            this.f61369f = 0L;
        } else {
            this.f61369f = l13;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f61364a, uVar.f61364a) && Intrinsics.d(this.f61365b, uVar.f61365b) && Intrinsics.d(this.f61366c, uVar.f61366c) && Intrinsics.d(this.f61367d, uVar.f61367d) && Intrinsics.d(this.f61368e, uVar.f61368e) && Intrinsics.d(this.f61369f, uVar.f61369f);
    }

    public final int hashCode() {
        int hashCode = this.f61364a.hashCode() * 31;
        String str = this.f61365b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61366c;
        int d2 = cb.d(this.f61368e, cb.d(this.f61367d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Long l13 = this.f61369f;
        return d2 + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        return "ShuffleAssetUploadStatusEntity(status=" + this.f61364a + ", failure_code=" + this.f61365b + ", signature=" + this.f61366c + ", type=" + this.f61367d + ", upload_id=" + this.f61368e + ", uploaded_time=" + this.f61369f + ")";
    }
}
