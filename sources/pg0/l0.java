package pg0;

import android.graphics.Rect;
import com.pinterest.api.model.az0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final az0 f100078a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100079b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f100080c;

    public l0(az0 comment, int i13, Rect buttonRect) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(buttonRect, "buttonRect");
        this.f100078a = comment;
        this.f100079b = i13;
        this.f100080c = buttonRect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f100078a, l0Var.f100078a) && this.f100079b == l0Var.f100079b && Intrinsics.d(this.f100080c, l0Var.f100080c);
    }

    public final int hashCode() {
        return this.f100080c.hashCode() + ep.b.b(this.f100079b, this.f100078a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ShowDidItCommentReactionsContextMenuEvent(comment=" + this.f100078a + ", iconsViewId=" + this.f100079b + ", buttonRect=" + this.f100080c + ")";
    }
}
