package sf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w1 {
    public w1() {
        c componentTypeProvider = c.f112522o;
        Intrinsics.checkNotNullParameter(componentTypeProvider, "componentTypeProvider");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        ((w1) obj).getClass();
        c cVar = c.f112522o;
        if (!Intrinsics.d(cVar, cVar)) {
            return false;
        }
        w wVar = w.f112783j;
        if (!Intrinsics.d(wVar, wVar)) {
            return false;
        }
        x xVar = x.f112789i;
        return Intrinsics.d(xVar, xVar);
    }

    public final int hashCode() {
        return x.f112789i.hashCode() + ((w.f112783j.hashCode() + (c.f112522o.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VideoViewLogging(componentTypeProvider=" + c.f112522o + ", elementTypeProvider=" + w.f112783j + ", auxDataProvider=" + x.f112789i + ")";
    }
}
