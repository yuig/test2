package h80;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f68086a;

    public d(HashMap auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f68086a = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f68086a, ((d) obj).f68086a);
    }

    public final int hashCode() {
        return this.f68086a.hashCode();
    }

    public final String toString() {
        return "OutpaintError(auxData=" + this.f68086a + ")";
    }
}
