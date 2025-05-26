package com.pinterest.boardAutoCollages;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f44599a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44600b;

    public w(String draftId, Set options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f44599a = options;
        this.f44600b = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f44599a, wVar.f44599a) && Intrinsics.d(this.f44600b, wVar.f44600b);
    }

    public final int hashCode() {
        return this.f44600b.hashCode() + (this.f44599a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAutoCollagesOptionsSheet(options=" + this.f44599a + ", draftId=" + this.f44600b + ")";
    }
}
