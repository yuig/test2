package to0;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f118702a;

    public y(HashMap hashMap) {
        this.f118702a = hashMap;
    }

    public final HashMap a() {
        return this.f118702a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f118702a, ((y) obj).f118702a);
    }

    public final int hashCode() {
        HashMap hashMap = this.f118702a;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.hashCode();
    }

    public final String toString() {
        return "PinLoggingAuxData(data=" + this.f118702a + ")";
    }
}
