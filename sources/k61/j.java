package k61;

import com.pinterest.api.model.lh0;
import dl1.s;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public final lh0 f78416a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f78417b;

    public j(@NotNull lh0 sensitivity, HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        this.f78416a = sensitivity;
        this.f78417b = hashMap;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getPath() {
        String simpleName = j.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f78416a, jVar.f78416a) && Intrinsics.d(this.f78417b, jVar.f78417b);
    }

    public final int hashCode() {
        int hashCode = this.f78416a.hashCode() * 31;
        HashMap hashMap = this.f78417b;
        return hashCode + (hashMap == null ? 0 : hashMap.hashCode());
    }

    public final String toString() {
        return "SensitivityViewModel(sensitivity=" + this.f78416a + ", auxData=" + this.f78417b + ")";
    }
}
