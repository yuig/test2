package rh1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f108128a;

    /* renamed from: b, reason: collision with root package name */
    public final String f108129b;

    public d0(String stickerId, String str) {
        Intrinsics.checkNotNullParameter(stickerId, "stickerId");
        this.f108128a = stickerId;
        this.f108129b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f108128a, d0Var.f108128a) && Intrinsics.d(this.f108129b, d0Var.f108129b);
    }

    public final int hashCode() {
        int hashCode = this.f108128a.hashCode() * 31;
        String str = this.f108129b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CommentStickerSelectEvent(stickerId=");
        sb3.append(this.f108128a);
        sb3.append(", imageUrl=");
        return a.a.p(sb3, this.f108129b, ")");
    }
}
