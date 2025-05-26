package h41;

import c92.n;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends n {

    /* renamed from: b, reason: collision with root package name */
    public final String f67629b;

    /* renamed from: c, reason: collision with root package name */
    public final File f67630c;

    public c(File file, String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f67629b = imageUrl;
        this.f67630c = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f67629b, cVar.f67629b) && Intrinsics.d(this.f67630c, cVar.f67630c);
    }

    public final int hashCode() {
        int hashCode = this.f67629b.hashCode() * 31;
        File file = this.f67630c;
        return hashCode + (file == null ? 0 : file.hashCode());
    }

    public final String toString() {
        return "SingleImage(imageUrl=" + this.f67629b + ", imageFile=" + this.f67630c + ")";
    }
}
