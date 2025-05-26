package pg0;

import com.pinterest.api.model.z2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final z2 f100066a;

    /* renamed from: b, reason: collision with root package name */
    public final rp0.d f100067b;

    public h(z2 reply, rp0.d parent) {
        Intrinsics.checkNotNullParameter(reply, "reply");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f100066a = reply;
        this.f100067b = parent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f100066a, hVar.f100066a) && Intrinsics.d(this.f100067b, hVar.f100067b);
    }

    public final int hashCode() {
        return this.f100067b.hashCode() + (this.f100066a.hashCode() * 31);
    }

    public final String toString() {
        return "CommentReplyEvent(reply=" + this.f100066a + ", parent=" + this.f100067b + ")";
    }
}
