package t10;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f115786a;

    /* renamed from: b, reason: collision with root package name */
    public final List f115787b;

    /* renamed from: c, reason: collision with root package name */
    public final List f115788c;

    /* renamed from: d, reason: collision with root package name */
    public final String f115789d;

    public g(String str, List<a> list, List<String> list2, String str2) {
        this.f115786a = str;
        this.f115787b = list;
        this.f115788c = list2;
        this.f115789d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f115786a, gVar.f115786a) && Intrinsics.d(this.f115787b, gVar.f115787b) && Intrinsics.d(this.f115788c, gVar.f115788c) && Intrinsics.d(this.f115789d, gVar.f115789d);
    }

    public final int hashCode() {
        String str = this.f115786a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f115787b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f115788c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.f115789d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecipeTranslation(name=");
        sb3.append(this.f115786a);
        sb3.append(", categorizedIngredients=");
        sb3.append(this.f115787b);
        sb3.append(", diets=");
        sb3.append(this.f115788c);
        sb3.append(", servingSummary=");
        return a.a.p(sb3, this.f115789d, ")");
    }
}
