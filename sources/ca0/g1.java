package ca0;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 implements j1 {

    /* renamed from: a, reason: collision with root package name */
    public final File f27117a;

    public g1(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f27117a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && Intrinsics.d(this.f27117a, ((g1) obj).f27117a);
    }

    public final int hashCode() {
        return this.f27117a.hashCode();
    }

    public final String toString() {
        return "LocalImage(file=" + this.f27117a + ")";
    }
}
