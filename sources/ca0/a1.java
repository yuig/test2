package ca0;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27064a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27065b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27066c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27067d;

    /* renamed from: e, reason: collision with root package name */
    public final j1 f27068e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27069f;

    /* renamed from: g, reason: collision with root package name */
    public final c f27070g;

    /* renamed from: h, reason: collision with root package name */
    public final zy.l0 f27071h;

    public a1(String id3, String title, String description, String altText, j1 image, boolean z13, c selectedBoard, zy.l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(altText, "altText");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(selectedBoard, "selectedBoard");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f27064a = id3;
        this.f27065b = title;
        this.f27066c = description;
        this.f27067d = altText;
        this.f27068e = image;
        this.f27069f = z13;
        this.f27070g = selectedBoard;
        this.f27071h = pinalyticsVMState;
    }

    public static a1 b(a1 a1Var, String str, String str2, String str3, String str4, j1 j1Var, boolean z13, c cVar, zy.l0 l0Var, int i13) {
        String id3 = (i13 & 1) != 0 ? a1Var.f27064a : str;
        String title = (i13 & 2) != 0 ? a1Var.f27065b : str2;
        String description = (i13 & 4) != 0 ? a1Var.f27066c : str3;
        String altText = (i13 & 8) != 0 ? a1Var.f27067d : str4;
        j1 image = (i13 & 16) != 0 ? a1Var.f27068e : j1Var;
        boolean z14 = (i13 & 32) != 0 ? a1Var.f27069f : z13;
        c selectedBoard = (i13 & 64) != 0 ? a1Var.f27070g : cVar;
        zy.l0 pinalyticsVMState = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? a1Var.f27071h : l0Var;
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(altText, "altText");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(selectedBoard, "selectedBoard");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new a1(id3, title, description, altText, image, z14, selectedBoard, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f27064a, a1Var.f27064a) && Intrinsics.d(this.f27065b, a1Var.f27065b) && Intrinsics.d(this.f27066c, a1Var.f27066c) && Intrinsics.d(this.f27067d, a1Var.f27067d) && Intrinsics.d(this.f27068e, a1Var.f27068e) && this.f27069f == a1Var.f27069f && Intrinsics.d(this.f27070g, a1Var.f27070g) && Intrinsics.d(this.f27071h, a1Var.f27071h);
    }

    public final int hashCode() {
        return this.f27071h.hashCode() + ((this.f27070g.hashCode() + ep.b.e(this.f27069f, (this.f27068e.hashCode() + cb.d(this.f27067d, cb.d(this.f27066c, cb.d(this.f27065b, this.f27064a.hashCode() * 31, 31), 31), 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "CollagePublishVMState(id=" + this.f27064a + ", title=" + this.f27065b + ", description=" + this.f27066c + ", altText=" + this.f27067d + ", image=" + this.f27068e + ", isRemixable=" + this.f27069f + ", selectedBoard=" + this.f27070g + ", pinalyticsVMState=" + this.f27071h + ")";
    }
}
