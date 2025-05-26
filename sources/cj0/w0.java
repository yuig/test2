package cj0;

import a.cb;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f27873a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27874b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27875c;

    public w0(String boardId, String boardSessionId, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        this.f27873a = pin;
        this.f27874b = boardId;
        this.f27875c = boardSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.d(this.f27873a, w0Var.f27873a) && Intrinsics.d(this.f27874b, w0Var.f27874b) && Intrinsics.d(this.f27875c, w0Var.f27875c);
    }

    public final int hashCode() {
        return this.f27875c.hashCode() + cb.d(this.f27874b, this.f27873a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SavePinWithBoardPickerRequest(pin=");
        sb3.append(this.f27873a);
        sb3.append(", boardId=");
        sb3.append(this.f27874b);
        sb3.append(", boardSessionId=");
        return a.a.p(sb3, this.f27875c, ")");
    }
}
