package hb2;

import android.graphics.Path;
import kotlin.jvm.internal.Intrinsics;
import r72.i1;
import r72.j1;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Path f68545a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f68546b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f68547c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68548d;

    public c0(Path path, j1 rBounds, i1 mask, boolean z13) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(rBounds, "rBounds");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f68545a = path;
        this.f68546b = rBounds;
        this.f68547c = mask;
        this.f68548d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f68545a, c0Var.f68545a) && Intrinsics.d(this.f68546b, c0Var.f68546b) && Intrinsics.d(this.f68547c, c0Var.f68547c) && this.f68548d == c0Var.f68548d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68548d) + ((this.f68547c.hashCode() + ((this.f68546b.hashCode() + (this.f68545a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Stroke(path=" + this.f68545a + ", rBounds=" + this.f68546b + ", mask=" + this.f68547c + ", isSelected=" + this.f68548d + ")";
    }
}
