package ads_mobile_sdk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vk {

    /* renamed from: h, reason: collision with root package name */
    public static final a.vd f12545h = new a.vd();

    /* renamed from: a, reason: collision with root package name */
    public final List f12546a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12547b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12548c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12549d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12550e;

    /* renamed from: f, reason: collision with root package name */
    public String f12551f;

    /* renamed from: g, reason: collision with root package name */
    public final List f12552g;

    public vk(List list, String str, String str2, boolean z13, String url, String str3, List list2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f12546a = list;
        this.f12547b = str;
        this.f12548c = str2;
        this.f12549d = z13;
        this.f12550e = url;
        this.f12551f = str3;
        this.f12552g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk)) {
            return false;
        }
        vk vkVar = (vk) obj;
        return Intrinsics.d(this.f12546a, vkVar.f12546a) && Intrinsics.d(this.f12547b, vkVar.f12547b) && Intrinsics.d(this.f12548c, vkVar.f12548c) && this.f12549d == vkVar.f12549d && Intrinsics.d(this.f12550e, vkVar.f12550e) && Intrinsics.d(this.f12551f, vkVar.f12551f) && Intrinsics.d(this.f12552g, vkVar.f12552g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List list = this.f12546a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f12547b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12548c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z13 = this.f12549d;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int t13 = kh2.j1.t((hashCode3 + i13) * 31, this.f12550e);
        String str3 = this.f12551f;
        int hashCode4 = (t13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.f12552g;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        List list = this.f12546a;
        String str = this.f12547b;
        String str2 = this.f12548c;
        boolean z13 = this.f12549d;
        String str3 = this.f12550e;
        String str4 = this.f12551f;
        List list2 = this.f12552g;
        StringBuilder sb3 = new StringBuilder("BuildAdUrlResult(errors=");
        sb3.append(list);
        sb3.append(", baseUri=");
        sb3.append(str);
        sb3.append(", postParameters=");
        sb3.append(str2);
        sb3.append(", includeCookies=");
        sb3.append(z13);
        sb3.append(", url=");
        a.a.B(sb3, str3, ", queryWithFlattenedBlobParams=", str4, ", csrbErrors=");
        return a.c.j(sb3, list2, ")");
    }
}
