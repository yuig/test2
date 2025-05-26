package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23368a;

    public w0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23368a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && Intrinsics.d(this.f23368a, ((w0) obj).f23368a);
    }

    public final int hashCode() {
        return this.f23368a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("LogConversationPinSeen(pin="), this.f23368a, ")");
    }
}
