package yx1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends jk.r {

    /* renamed from: a, reason: collision with root package name */
    public final String f140418a;

    /* renamed from: b, reason: collision with root package name */
    public final List f140419b;

    public y(String pinId, List boards) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(boards, "boards");
        this.f140418a = pinId;
        this.f140419b = boards;
    }

    public final List D() {
        return this.f140419b;
    }

    public final String E() {
        return this.f140418a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f140418a, yVar.f140418a) && Intrinsics.d(this.f140419b, yVar.f140419b);
    }

    public final int hashCode() {
        return this.f140419b.hashCode() + (this.f140418a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Success(pinId=");
        sb3.append(this.f140418a);
        sb3.append(", boards=");
        return a.c.j(sb3, this.f140419b, ")");
    }
}
