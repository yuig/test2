package i91;

import a.cb;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f71797d = new b("", q0.f80391a, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f71798a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71799b;

    /* renamed from: c, reason: collision with root package name */
    public final List f71800c;

    public b(String templateId, List pins, boolean z13) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f71798a = z13;
        this.f71799b = templateId;
        this.f71800c = pins;
    }

    public static b a(b bVar, boolean z13, String templateId, List pins, int i13) {
        if ((i13 & 1) != 0) {
            z13 = bVar.f71798a;
        }
        if ((i13 & 2) != 0) {
            templateId = bVar.f71799b;
        }
        if ((i13 & 4) != 0) {
            pins = bVar.f71800c;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(pins, "pins");
        return new b(templateId, pins, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f71798a == bVar.f71798a && Intrinsics.d(this.f71799b, bVar.f71799b) && Intrinsics.d(this.f71800c, bVar.f71800c);
    }

    public final int hashCode() {
        return this.f71800c.hashCode() + cb.d(this.f71799b, Boolean.hashCode(this.f71798a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardPreviewState(isBoardPreviewEligible=");
        sb3.append(this.f71798a);
        sb3.append(", templateId=");
        sb3.append(this.f71799b);
        sb3.append(", pins=");
        return a.c.j(sb3, this.f71800c, ")");
    }
}
