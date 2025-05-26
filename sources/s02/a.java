package s02;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f110313a;

    public a(List list) {
        this.f110313a = list;
    }

    public final List e() {
        return this.f110313a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f110313a, ((a) obj).f110313a);
    }

    public final int hashCode() {
        List list = this.f110313a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RVCMainDisplayState(linkedAccounts="), this.f110313a, ")");
    }
}
