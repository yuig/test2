package jj1;

import com.pinterest.api.model.sg;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final sg f76317a;

    public f(sg sgVar) {
        this.f76317a = sgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f76317a, ((f) obj).f76317a);
    }

    public final int hashCode() {
        sg sgVar = this.f76317a;
        if (sgVar == null) {
            return 0;
        }
        return sgVar.hashCode();
    }

    public final String toString() {
        return "SkinToneSignalDisplayState(debugSignal=" + this.f76317a + ")";
    }
}
