package pp0;

import kotlin.jvm.internal.Intrinsics;
import v32.c;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f100907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100908b;

    /* renamed from: c, reason: collision with root package name */
    public final c f100909c;

    public a(int i13, int i14, c reactionType) {
        Intrinsics.checkNotNullParameter(reactionType, "reactionType");
        this.f100907a = i13;
        this.f100908b = i14;
        this.f100909c = reactionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f100907a == aVar.f100907a && this.f100908b == aVar.f100908b && this.f100909c == aVar.f100909c;
    }

    public final int hashCode() {
        return this.f100909c.hashCode() + ep.b.b(this.f100908b, Integer.hashCode(this.f100907a) * 31, 31);
    }

    public final String toString() {
        return "CommentReactionModel(iconDrawableRes=" + this.f100907a + ", labelRes=" + this.f100908b + ", reactionType=" + this.f100909c + ")";
    }
}
