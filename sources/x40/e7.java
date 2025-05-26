package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e7 implements z40.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132317a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f132318b;

    public e7(String __typename, Boolean bool) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132317a = __typename;
        this.f132318b = bool;
    }

    @Override // z40.c0
    public final Boolean a() {
        return this.f132318b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return Intrinsics.d(this.f132317a, e7Var.f132317a) && Intrinsics.d(this.f132318b, e7Var.f132318b);
    }

    public final int hashCode() {
        int hashCode = this.f132317a.hashCode() * 31;
        Boolean bool = this.f132318b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifiedIdentity(__typename=");
        sb3.append(this.f132317a);
        sb3.append(", verified=");
        return a.c.h(sb3, this.f132318b, ")");
    }
}
