package bw0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final List f24017a;

    public r(ArrayList listOfRequests) {
        Intrinsics.checkNotNullParameter(listOfRequests, "listOfRequests");
        this.f24017a = listOfRequests;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f24017a, ((r) obj).f24017a);
    }

    public final int hashCode() {
        return this.f24017a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("VideoWorkRequestGroup(listOfRequests="), this.f24017a, ")");
    }
}
