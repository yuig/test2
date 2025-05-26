package vs;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final List f126479a;

    public e(List adsData) {
        Intrinsics.checkNotNullParameter(adsData, "adsData");
        this.f126479a = adsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f126479a, ((e) obj).f126479a);
    }

    public final int hashCode() {
        return this.f126479a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Loaded(adsData="), this.f126479a, ")");
    }
}
