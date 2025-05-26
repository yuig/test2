package js0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f77566a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77567b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77568c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77569d;

    /* renamed from: e, reason: collision with root package name */
    public final String f77570e;

    public d(String pinUid, int i13, String str, int i14, String str2) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f77566a = pinUid;
        this.f77567b = i13;
        this.f77568c = str;
        this.f77569d = i14;
        this.f77570e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f77566a, dVar.f77566a) && this.f77567b == dVar.f77567b && Intrinsics.d(this.f77568c, dVar.f77568c) && this.f77569d == dVar.f77569d && Intrinsics.d(this.f77570e, dVar.f77570e);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f77567b, this.f77566a.hashCode() * 31, 31);
        String str = this.f77568c;
        int b14 = ep.b.b(this.f77569d, (b13 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f77570e;
        return b14 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UndoHidePfyPinParams(pinUid=");
        sb3.append(this.f77566a);
        sb3.append(", feedbackType=");
        sb3.append(this.f77567b);
        sb3.append(", sourceUid=");
        sb3.append(this.f77568c);
        sb3.append(", recommendationUid=");
        sb3.append(this.f77569d);
        sb3.append(", clientTrackingParam=");
        return a.a.p(sb3, this.f77570e, ")");
    }
}
