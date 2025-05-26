package qm0;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n2 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104313a;

    /* renamed from: b, reason: collision with root package name */
    public final List f104314b;

    /* renamed from: c, reason: collision with root package name */
    public final String f104315c;

    /* renamed from: d, reason: collision with root package name */
    public final int f104316d;

    public n2(int i13, String id3, String title, List images) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f104313a = id3;
        this.f104314b = images;
        this.f104315c = title;
        this.f104316d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return Intrinsics.d(this.f104313a, n2Var.f104313a) && Intrinsics.d(this.f104314b, n2Var.f104314b) && Intrinsics.d(this.f104315c, n2Var.f104315c) && this.f104316d == n2Var.f104316d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104316d) + cb.d(this.f104315c, ep.b.c(this.f104314b, this.f104313a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SectionPreview(id=");
        sb3.append(this.f104313a);
        sb3.append(", images=");
        sb3.append(this.f104314b);
        sb3.append(", title=");
        sb3.append(this.f104315c);
        sb3.append(", numPins=");
        return a.a.n(sb3, this.f104316d, ")");
    }
}
