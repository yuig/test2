package k62;

import kotlin.jvm.internal.Intrinsics;
import r72.w0;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f78424a;

    /* renamed from: b, reason: collision with root package name */
    public final d f78425b;

    public c(w0 setting, d metadata) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f78424a = setting;
        this.f78425b = metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f78424a, cVar.f78424a) && Intrinsics.d(this.f78425b, cVar.f78425b);
    }

    public final int hashCode() {
        return this.f78425b.hashCode() + (this.f78424a.hashCode() * 31);
    }

    public final String toString() {
        return "EffectSettingInfo(setting=" + this.f78424a + ", metadata=" + this.f78425b + ")";
    }
}
