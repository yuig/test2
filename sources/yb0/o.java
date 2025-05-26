package yb0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.modalAlert.GestaltModalAlert;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.i0;

/* loaded from: classes5.dex */
public final class o implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f138519a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f138520b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f138521c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f138522d;

    /* renamed from: e, reason: collision with root package name */
    public final xm1.d f138523e;

    /* renamed from: f, reason: collision with root package name */
    public final xm1.g f138524f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f138525g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f138526h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f138527i;

    /* renamed from: j, reason: collision with root package name */
    public final int f138528j;

    public o(i0 title, i0 text, i0 actionButtonText, boolean z13, boolean z14, i0 i0Var, int i13, int i14) {
        xm1.d buttonOrientation = GestaltModalAlert.f49441o;
        z14 = (i14 & 64) != 0 ? false : z14;
        i0Var = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : i0Var;
        i13 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? 1 : i13;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        Intrinsics.checkNotNullParameter(buttonOrientation, "buttonOrientation");
        this.f138519a = title;
        this.f138520b = text;
        this.f138521c = actionButtonText;
        this.f138522d = z13;
        this.f138523e = buttonOrientation;
        this.f138524f = null;
        this.f138525g = z14;
        this.f138526h = i0Var;
        this.f138527i = false;
        this.f138528j = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f138519a, oVar.f138519a) && Intrinsics.d(this.f138520b, oVar.f138520b) && Intrinsics.d(this.f138521c, oVar.f138521c) && this.f138522d == oVar.f138522d && this.f138523e == oVar.f138523e && this.f138524f == oVar.f138524f && this.f138525g == oVar.f138525g && Intrinsics.d(this.f138526h, oVar.f138526h) && this.f138527i == oVar.f138527i && this.f138528j == oVar.f138528j;
    }

    public final int hashCode() {
        int hashCode = (this.f138523e.hashCode() + ep.b.e(this.f138522d, ep.b.d(this.f138521c, ep.b.d(this.f138520b, this.f138519a.hashCode() * 31, 31), 31), 31)) * 31;
        xm1.g gVar = this.f138524f;
        int e13 = ep.b.e(this.f138525g, (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31, 31);
        i0 i0Var = this.f138526h;
        return Integer.hashCode(this.f138528j) + ep.b.e(this.f138527i, (e13 + (i0Var != null ? i0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(title=");
        sb3.append(this.f138519a);
        sb3.append(", text=");
        sb3.append(this.f138520b);
        sb3.append(", actionButtonText=");
        sb3.append(this.f138521c);
        sb3.append(", withCancelButton=");
        sb3.append(this.f138522d);
        sb3.append(", buttonOrientation=");
        sb3.append(this.f138523e);
        sb3.append(", titleIcon=");
        sb3.append(this.f138524f);
        sb3.append(", withDismissIcon=");
        sb3.append(this.f138525g);
        sb3.append(", checkBoxLabel=");
        sb3.append(this.f138526h);
        sb3.append(", textAllowsLinks=");
        sb3.append(this.f138527i);
        sb3.append(", maxCheckboxLines=");
        return a.a.n(sb3, this.f138528j, ")");
    }
}
