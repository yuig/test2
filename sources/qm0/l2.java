package qm0;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l2 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f104300a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104301b;

    /* renamed from: c, reason: collision with root package name */
    public final int f104302c;

    public l2(int i13, String title, ArrayList images) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f104300a = images;
        this.f104301b = title;
        this.f104302c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return Intrinsics.d(this.f104300a, l2Var.f104300a) && Intrinsics.d(this.f104301b, l2Var.f104301b) && this.f104302c == l2Var.f104302c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104302c) + cb.d(this.f104301b, this.f104300a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SavesPreview(images=");
        sb3.append(this.f104300a);
        sb3.append(", title=");
        sb3.append(this.f104301b);
        sb3.append(", numPins=");
        return a.a.n(sb3, this.f104302c, ")");
    }
}
