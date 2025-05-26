package ls1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84684a;

    public a(String str) {
        this.f84684a = str;
    }

    @Override // ls1.c
    public final String a() {
        return this.f84684a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f84684a, ((a) obj).f84684a);
    }

    public final int hashCode() {
        String str = this.f84684a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PauseOnFirstFrame(pinUId="), this.f84684a, ")");
    }
}
