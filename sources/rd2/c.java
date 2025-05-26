package rd2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ud2.d f107517a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.widget.a f107518b;

    /* renamed from: c, reason: collision with root package name */
    public final String f107519c;

    public c(ud2.d effect, androidx.appcompat.widget.a uniformHandle, String settingName) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        Intrinsics.checkNotNullParameter(uniformHandle, "uniformHandle");
        Intrinsics.checkNotNullParameter(settingName, "settingName");
        this.f107517a = effect;
        this.f107518b = uniformHandle;
        this.f107519c = settingName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f107517a, cVar.f107517a) && Intrinsics.d(this.f107518b, cVar.f107518b) && Intrinsics.d(this.f107519c, cVar.f107519c);
    }

    public final int hashCode() {
        return this.f107519c.hashCode() + ((this.f107518b.hashCode() + (this.f107517a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ParamBinding(effect=");
        sb3.append(this.f107517a);
        sb3.append(", uniformHandle=");
        sb3.append(this.f107518b);
        sb3.append(", settingName=");
        return ep.b.k(sb3, this.f107519c, ')');
    }
}
