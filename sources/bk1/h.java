package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f23229a;

    public h(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f23229a = pinUid;
    }

    public final String a() {
        return this.f23229a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f23229a, ((h) obj).f23229a);
    }

    public final int hashCode() {
        return this.f23229a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("MarkMdlFailed(pinUid="), this.f23229a, ")");
    }
}
