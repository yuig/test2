package ls1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84685a;

    public b(String str) {
        this.f84685a = str;
    }

    @Override // ls1.c
    public final String a() {
        return this.f84685a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f84685a, ((b) obj).f84685a);
    }

    public final int hashCode() {
        String str = this.f84685a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Unpause(pinUId="), this.f84685a, ")");
    }
}
