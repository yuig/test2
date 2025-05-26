package cp0;

import ap0.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f52988a;

    /* renamed from: b, reason: collision with root package name */
    public final String f52989b;

    /* renamed from: c, reason: collision with root package name */
    public final String f52990c;

    /* renamed from: d, reason: collision with root package name */
    public final f f52991d;

    public a(String str, String str2, String str3, f index) {
        Intrinsics.checkNotNullParameter(index, "index");
        this.f52988a = str;
        this.f52989b = str2;
        this.f52990c = str3;
        this.f52991d = index;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f52988a, aVar.f52988a) && Intrinsics.d(this.f52989b, aVar.f52989b) && Intrinsics.d(this.f52990c, aVar.f52990c) && this.f52991d == aVar.f52991d;
    }

    public final int hashCode() {
        String str = this.f52988a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f52989b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f52990c;
        return this.f52991d.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OnboardingItem(imagePath=" + this.f52988a + ", title=" + this.f52989b + ", description=" + this.f52990c + ", index=" + this.f52991d + ")";
    }
}
