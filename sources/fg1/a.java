package fg1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f62126a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f62127b;

    public a(String originalPath, byte[] metadataBytes) {
        Intrinsics.checkNotNullParameter(originalPath, "originalPath");
        Intrinsics.checkNotNullParameter(metadataBytes, "metadataBytes");
        this.f62126a = originalPath;
        this.f62127b = metadataBytes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f62126a, aVar.f62126a) && Intrinsics.d(this.f62127b, aVar.f62127b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f62127b) + (this.f62126a.hashCode() * 31);
    }

    public final String toString() {
        return a.a.q(new StringBuilder("ExtractedImageMetadata(originalPath="), this.f62126a, ", metadataBytes=", Arrays.toString(this.f62127b), ")");
    }
}
