package hh0;

import a.cb;
import i32.a0;
import i32.j;
import i32.l;
import i32.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f69144a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69146c;

    /* renamed from: d, reason: collision with root package name */
    public final vd0.c f69147d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f69148e;

    public f(String experienceId, String placementId, int i13, vd0.c displayDataJsonObject) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(displayDataJsonObject, "displayDataJsonObject");
        this.f69144a = experienceId;
        this.f69145b = placementId;
        this.f69146c = i13;
        this.f69147d = displayDataJsonObject;
        Integer intOrNull = StringsKt.toIntOrNull(experienceId);
        if (intOrNull != null) {
            j jVar = l.Companion;
            int intValue = intOrNull.intValue();
            jVar.getClass();
            j.a(intValue);
        }
        a0.Companion.getClass();
        this.f69148e = y.a(i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f69144a, fVar.f69144a) && Intrinsics.d(this.f69145b, fVar.f69145b) && this.f69146c == fVar.f69146c && Intrinsics.d(this.f69147d, fVar.f69147d);
    }

    public final int hashCode() {
        return this.f69147d.hashCode() + ep.b.b(this.f69146c, cb.d(this.f69145b, this.f69144a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ExperienceDataDeserializationContext(experienceId=" + this.f69144a + ", placementId=" + this.f69145b + ", experienceTypeValue=" + this.f69146c + ", displayDataJsonObject=" + this.f69147d + ")";
    }
}
