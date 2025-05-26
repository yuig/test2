package xc2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends u {

    /* renamed from: a, reason: collision with root package name */
    public final Map f134581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134582b;

    public t(String str, Map widgetPinModels) {
        Intrinsics.checkNotNullParameter(widgetPinModels, "widgetPinModels");
        this.f134581a = widgetPinModels;
        this.f134582b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f134581a, tVar.f134581a) && Intrinsics.d(this.f134582b, tVar.f134582b);
    }

    public final int hashCode() {
        int hashCode = this.f134581a.hashCode() * 31;
        String str = this.f134582b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Success(widgetPinModels=" + this.f134581a + ", source=" + this.f134582b + ")";
    }
}
