package e72;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class d0 {

    @NotNull
    public static final z Companion = new z();

    /* renamed from: a, reason: collision with root package name */
    public final String f57631a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57632b;

    /* renamed from: c, reason: collision with root package name */
    public final f f57633c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f57634d;

    /* renamed from: e, reason: collision with root package name */
    public final y f57635e;

    /* renamed from: f, reason: collision with root package name */
    public final String f57636f;

    public d0(int i13, String str, String str2, f fVar, c0 c0Var, y yVar, String str3) {
        if (59 != (i13 & 59)) {
            kg.t.b1(i13, 59, v.f57691b);
            throw null;
        }
        this.f57631a = str;
        this.f57632b = str2;
        if ((i13 & 4) == 0) {
            this.f57633c = null;
        } else {
            this.f57633c = fVar;
        }
        this.f57634d = c0Var;
        this.f57635e = yVar;
        this.f57636f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f57631a, d0Var.f57631a) && Intrinsics.d(this.f57632b, d0Var.f57632b) && Intrinsics.d(this.f57633c, d0Var.f57633c) && Intrinsics.d(this.f57634d, d0Var.f57634d) && Intrinsics.d(this.f57635e, d0Var.f57635e) && Intrinsics.d(this.f57636f, d0Var.f57636f);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f57632b, this.f57631a.hashCode() * 31, 31);
        f fVar = this.f57633c;
        return this.f57636f.hashCode() + ((this.f57635e.hashCode() + ((this.f57634d.hashCode() + ((d2 + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShufflesCutoutEntity(id=");
        sb3.append(this.f57631a);
        sb3.append(", type=");
        sb3.append(this.f57632b);
        sb3.append(", pin=");
        sb3.append(this.f57633c);
        sb3.append(", image_size=");
        sb3.append(this.f57634d);
        sb3.append(", bbox=");
        sb3.append(this.f57635e);
        sb3.append(", image_base64=");
        return a.a.p(sb3, this.f57636f, ")");
    }

    public d0(String id3, String type, f fVar, c0 image_size, y bbox, String image_base64) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(image_size, "image_size");
        Intrinsics.checkNotNullParameter(bbox, "bbox");
        Intrinsics.checkNotNullParameter(image_base64, "image_base64");
        this.f57631a = id3;
        this.f57632b = type;
        this.f57633c = fVar;
        this.f57634d = image_size;
        this.f57635e = bbox;
        this.f57636f = image_base64;
    }
}
