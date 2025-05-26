package hh0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f69139a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69140b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69141c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69142d;

    /* renamed from: e, reason: collision with root package name */
    public final b f69143e;

    public e(String id3, String experienceId, String placementId, int i13, b displayData) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(displayData, "displayData");
        this.f69139a = id3;
        this.f69140b = experienceId;
        this.f69141c = placementId;
        this.f69142d = i13;
        this.f69143e = displayData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f69139a, eVar.f69139a) && Intrinsics.d(this.f69140b, eVar.f69140b) && Intrinsics.d(this.f69141c, eVar.f69141c) && this.f69142d == eVar.f69142d && Intrinsics.d(this.f69143e, eVar.f69143e);
    }

    public final int hashCode() {
        return this.f69143e.hashCode() + ep.b.b(this.f69142d, cb.d(this.f69141c, cb.d(this.f69140b, this.f69139a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ExperienceData(id=" + this.f69139a + ", experienceId=" + this.f69140b + ", placementId=" + this.f69141c + ", type=" + this.f69142d + ", displayData=" + this.f69143e + ")";
    }
}
