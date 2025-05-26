package qf1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f103719a;

    /* renamed from: b, reason: collision with root package name */
    public final wy0 f103720b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f103721c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f103722d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f103723e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f103724f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f103725g;

    /* renamed from: h, reason: collision with root package name */
    public final c82.a f103726h;

    /* renamed from: i, reason: collision with root package name */
    public final List f103727i;

    /* renamed from: j, reason: collision with root package name */
    public final String f103728j;

    /* renamed from: k, reason: collision with root package name */
    public final mf1.a f103729k;

    public j0(f30 pin, wy0 wy0Var, boolean z13, boolean z14, boolean z15, boolean z16, HashMap auxData, String str, mf1.a ideaPinHostView) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(ideaPinHostView, "ideaPinHostView");
        this.f103719a = pin;
        this.f103720b = wy0Var;
        this.f103721c = z13;
        this.f103722d = z14;
        this.f103723e = z15;
        this.f103724f = z16;
        this.f103725g = auxData;
        this.f103726h = null;
        this.f103727i = null;
        this.f103728j = str;
        this.f103729k = ideaPinHostView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.f103719a, j0Var.f103719a) && Intrinsics.d(this.f103720b, j0Var.f103720b) && this.f103721c == j0Var.f103721c && this.f103722d == j0Var.f103722d && this.f103723e == j0Var.f103723e && this.f103724f == j0Var.f103724f && Intrinsics.d(this.f103725g, j0Var.f103725g) && Intrinsics.d(this.f103726h, j0Var.f103726h) && Intrinsics.d(this.f103727i, j0Var.f103727i) && Intrinsics.d(this.f103728j, j0Var.f103728j) && this.f103729k == j0Var.f103729k;
    }

    public final int hashCode() {
        int hashCode = this.f103719a.hashCode() * 31;
        wy0 wy0Var = this.f103720b;
        int d2 = a.c.d(this.f103725g, ep.b.e(this.f103724f, ep.b.e(this.f103723e, ep.b.e(this.f103722d, ep.b.e(this.f103721c, (hashCode + (wy0Var == null ? 0 : wy0Var.hashCode())) * 31, 31), 31), 31), 31), 31);
        c82.a aVar = this.f103726h;
        int hashCode2 = (d2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list = this.f103727i;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f103728j;
        return this.f103729k.hashCode() + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StoryPinActionSheetModel(pin=" + this.f103719a + ", creator=" + this.f103720b + ", showSave=" + this.f103721c + ", allowHide=" + this.f103722d + ", showVisit=" + this.f103723e + ", allowSimilarIdeas=" + this.f103724f + ", auxData=" + this.f103725g + ", pinSpamParams=" + this.f103726h + ", taggedProductPins=" + this.f103727i + ", navigationSource=" + this.f103728j + ", ideaPinHostView=" + this.f103729k + ")";
    }
}
