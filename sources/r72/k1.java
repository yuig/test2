package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106527a;

    public /* synthetic */ k1(String str) {
        this.f106527a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k1) {
            return Intrinsics.d(this.f106527a, ((k1) obj).f106527a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f106527a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ObjectId(value="), this.f106527a, ")");
    }
}
