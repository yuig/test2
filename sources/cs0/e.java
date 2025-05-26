package cs0;

import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f53126a;

    /* renamed from: b, reason: collision with root package name */
    public final l32.f f53127b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f53128c;

    public e(int i13, l32.f reason, u0 elementType) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f53126a = i13;
        this.f53127b = reason;
        this.f53128c = elementType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f53126a == eVar.f53126a && this.f53127b == eVar.f53127b && this.f53128c == eVar.f53128c;
    }

    public final int hashCode() {
        return this.f53128c.hashCode() + ((this.f53127b.hashCode() + (Integer.hashCode(this.f53126a) * 31)) * 31);
    }

    public final String toString() {
        return "PinFeedbackOption(messageId=" + this.f53126a + ", reason=" + this.f53127b + ", elementType=" + this.f53128c + ")";
    }
}
