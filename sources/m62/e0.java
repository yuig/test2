package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final r72.w0 f85972a;

    public e0(r72.w0 setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.f85972a = setting;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f85972a, ((e0) obj).f85972a);
    }

    public final int hashCode() {
        return this.f85972a.hashCode();
    }

    public final String toString() {
        return "ShowSettingControls(setting=" + this.f85972a + ")";
    }
}
