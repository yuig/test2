package e90;

import com.pinterest.api.model.f30;
import dl1.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f57909a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57910b;

    /* renamed from: c, reason: collision with root package name */
    public final f30 f57911c;

    public c(@NotNull String pinId, String str, f30 f30Var) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f57909a = pinId;
        this.f57910b = str;
        this.f57911c = f30Var;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f57909a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f57909a, cVar.f57909a) && Intrinsics.d(this.f57910b, cVar.f57910b) && Intrinsics.d(this.f57911c, cVar.f57911c);
    }

    public final int hashCode() {
        int hashCode = this.f57909a.hashCode() * 31;
        String str = this.f57910b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        f30 f30Var = this.f57911c;
        return hashCode2 + (f30Var != null ? f30Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShuffleCarouselItemDetailsModel(pinId=");
        sb3.append(this.f57909a);
        sb3.append(", imageUrl=");
        sb3.append(this.f57910b);
        sb3.append(", pin=");
        return jq.b.e(sb3, this.f57911c, ")");
    }

    public /* synthetic */ c(String str, String str2, f30 f30Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : f30Var);
    }
}
