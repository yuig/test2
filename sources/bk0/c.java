package bk0;

import com.pinterest.api.model.c9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f23148a;

    /* renamed from: b, reason: collision with root package name */
    public final c9 f23149b;

    public c(String name, c9 c9Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f23148a = name;
        this.f23149b = c9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f23148a, cVar.f23148a) && Intrinsics.d(this.f23149b, cVar.f23149b);
    }

    public final int hashCode() {
        int hashCode = this.f23148a.hashCode() * 31;
        c9 c9Var = this.f23149b;
        return hashCode + (c9Var == null ? 0 : c9Var.hashCode());
    }

    public final String toString() {
        return "SuggestedBoardName(name=" + this.f23148a + ", metadata=" + this.f23149b + ")";
    }
}
