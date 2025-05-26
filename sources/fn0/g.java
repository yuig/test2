package fn0;

import android.graphics.PointF;
import android.util.SizeF;
import java.io.File;
import kh2.p2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p2 f62624a;

    /* renamed from: b, reason: collision with root package name */
    public final SizeF f62625b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f62626c;

    /* renamed from: d, reason: collision with root package name */
    public final int f62627d;

    /* renamed from: e, reason: collision with root package name */
    public final File f62628e;

    public g(p2 startTime, SizeF size, PointF translation, int i13, File sourceFile) {
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(translation, "translation");
        Intrinsics.checkNotNullParameter(sourceFile, "sourceFile");
        this.f62624a = startTime;
        this.f62625b = size;
        this.f62626c = translation;
        this.f62627d = i13;
        this.f62628e = sourceFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f62624a, gVar.f62624a) && Intrinsics.d(this.f62625b, gVar.f62625b) && Intrinsics.d(this.f62626c, gVar.f62626c) && this.f62627d == gVar.f62627d && Intrinsics.d(this.f62628e, gVar.f62628e);
    }

    public final int hashCode() {
        return this.f62628e.hashCode() + ep.b.b(this.f62627d, (this.f62626c.hashCode() + ((this.f62625b.hashCode() + (this.f62624a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "WatermarkConfig(startTime=" + this.f62624a + ", size=" + this.f62625b + ", translation=" + this.f62626c + ", outputBitrate=" + this.f62627d + ", sourceFile=" + this.f62628e + ")";
    }
}
