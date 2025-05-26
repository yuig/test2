package t10;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f115764a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115765b;

    /* renamed from: c, reason: collision with root package name */
    public final List f115766c;

    public a(String str, String str2, @NotNull List<d> ingredients) {
        Intrinsics.checkNotNullParameter(ingredients, "ingredients");
        this.f115764a = str;
        this.f115765b = str2;
        this.f115766c = ingredients;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f115764a, aVar.f115764a) && Intrinsics.d(this.f115765b, aVar.f115765b) && Intrinsics.d(this.f115766c, aVar.f115766c);
    }

    public final int hashCode() {
        String str = this.f115764a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f115765b;
        return this.f115766c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CategorizedIngredient(id=");
        sb3.append(this.f115764a);
        sb3.append(", category=");
        sb3.append(this.f115765b);
        sb3.append(", ingredients=");
        return a.c.j(sb3, this.f115766c, ")");
    }
}
