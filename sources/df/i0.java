package df;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final File f54761a;

    /* renamed from: b, reason: collision with root package name */
    public final long f54762b;

    public i0(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f54761a = file;
        this.f54762b = file.lastModified();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i0 another) {
        Intrinsics.checkNotNullParameter(another, "another");
        long j13 = another.f54762b;
        long j14 = this.f54762b;
        if (j14 < j13) {
            return -1;
        }
        if (j14 > j13) {
            return 1;
        }
        return this.f54761a.compareTo(another.f54761a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i0) && compareTo((i0) obj) == 0;
    }

    public final int hashCode() {
        return ((this.f54761a.hashCode() + 1073) * 37) + ((int) (this.f54762b % Integer.MAX_VALUE));
    }
}
