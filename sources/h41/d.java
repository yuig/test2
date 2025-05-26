package h41;

import c92.n;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends n {

    /* renamed from: b, reason: collision with root package name */
    public final File f67631b;

    public d(File videoFile) {
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        this.f67631b = videoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f67631b, ((d) obj).f67631b);
    }

    public final int hashCode() {
        return this.f67631b.hashCode();
    }

    public final String toString() {
        return "Video(videoFile=" + this.f67631b + ")";
    }
}
