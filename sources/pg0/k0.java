package pg0;

import android.graphics.Rect;
import com.pinterest.api.model.z2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final z2 f100075a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100076b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f100077c;

    public k0(z2 comment, int i13, Rect buttonRect) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(buttonRect, "buttonRect");
        this.f100075a = comment;
        this.f100076b = i13;
        this.f100077c = buttonRect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.f100075a, k0Var.f100075a) && this.f100076b == k0Var.f100076b && Intrinsics.d(this.f100077c, k0Var.f100077c);
    }

    public final int hashCode() {
        return this.f100077c.hashCode() + ep.b.b(this.f100076b, this.f100075a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ShowCommentReactionsContextMenuEvent(comment=" + this.f100075a + ", iconsViewId=" + this.f100076b + ", buttonRect=" + this.f100077c + ")";
    }
}
