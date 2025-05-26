package pn1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import rm1.q;
import u50.f0;
import u50.i0;
import u50.o;

/* loaded from: classes2.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f100735a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f100736b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f100737c;

    /* renamed from: d, reason: collision with root package name */
    public final int f100738d;

    /* renamed from: e, reason: collision with root package name */
    public final q f100739e;

    /* renamed from: f, reason: collision with root package name */
    public final int f100740f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f100741g;

    /* renamed from: h, reason: collision with root package name */
    public final c f100742h;

    public /* synthetic */ b(i0 i0Var, f0 f0Var, q qVar, int i13, c cVar, int i14) {
        this(i0Var, (i14 & 2) != 0 ? i0Var : f0Var, false, 0, (i14 & 16) != 0 ? null : qVar, (i14 & 32) != 0 ? Integer.MIN_VALUE : i13, false, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? c.SMALL : cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [u50.i0] */
    public static b e(b bVar, i0 i0Var, f0 f0Var, int i13, boolean z13, int i14) {
        if ((i14 & 1) != 0) {
            i0Var = bVar.f100735a;
        }
        i0 text = i0Var;
        f0 f0Var2 = f0Var;
        if ((i14 & 2) != 0) {
            f0Var2 = bVar.f100736b;
        }
        f0 contentDescription = f0Var2;
        boolean z14 = bVar.f100737c;
        if ((i14 & 8) != 0) {
            i13 = bVar.f100738d;
        }
        int i15 = i13;
        q qVar = bVar.f100739e;
        int i16 = bVar.f100740f;
        if ((i14 & 64) != 0) {
            z13 = bVar.f100741g;
        }
        c tabSize = bVar.f100742h;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(tabSize, "tabSize");
        return new b(text, contentDescription, z14, i15, qVar, i16, z13, tabSize);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f100735a, bVar.f100735a) && Intrinsics.d(this.f100736b, bVar.f100736b) && this.f100737c == bVar.f100737c && this.f100738d == bVar.f100738d && this.f100739e == bVar.f100739e && this.f100740f == bVar.f100740f && this.f100741g == bVar.f100741g && this.f100742h == bVar.f100742h;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f100738d, ep.b.e(this.f100737c, ep.b.d(this.f100736b, this.f100735a.hashCode() * 31, 31), 31), 31);
        q qVar = this.f100739e;
        return this.f100742h.hashCode() + ep.b.e(this.f100741g, ep.b.b(this.f100740f, (b13 + (qVar == null ? 0 : qVar.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "DisplayState(text=" + this.f100735a + ", contentDescription=" + this.f100736b + ", isSelected=" + this.f100737c + ", numberOnBadge=" + this.f100738d + ", icon=" + this.f100739e + ", id=" + this.f100740f + ", isOnDarkBackground=" + this.f100741g + ", tabSize=" + this.f100742h + ")";
    }

    public b(i0 text, i0 contentDescription, boolean z13, int i13, q qVar, int i14, boolean z14, c tabSize) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(tabSize, "tabSize");
        this.f100735a = text;
        this.f100736b = contentDescription;
        this.f100737c = z13;
        this.f100738d = i13;
        this.f100739e = qVar;
        this.f100740f = i14;
        this.f100741g = z14;
        this.f100742h = tabSize;
    }
}
