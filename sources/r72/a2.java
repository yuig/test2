package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a2 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f106437b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f106438a;

    static {
        Intrinsics.checkNotNullParameter("none", "value");
    }

    public /* synthetic */ a2(String str) {
        this.f106438a = str;
    }

    public static String a(String str) {
        return a.a.k("ShuffleItemId(value=", str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a2) {
            return Intrinsics.d(this.f106438a, ((a2) obj).f106438a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f106438a.hashCode();
    }

    public final String toString() {
        return a(this.f106438a);
    }
}
