package s52;

import et1.r0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f111164a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f111165b;

    public b(r0 deleteAction, String str) {
        Intrinsics.checkNotNullParameter(deleteAction, "deleteAction");
        this.f111164a = str;
        this.f111165b = deleteAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f111164a, bVar.f111164a) && Intrinsics.d(this.f111165b, bVar.f111165b);
    }

    public final int hashCode() {
        String str = this.f111164a;
        return this.f111165b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ItemThumbnail(url=" + this.f111164a + ", deleteAction=" + this.f111165b + ")";
    }
}
