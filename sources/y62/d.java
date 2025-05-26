package y62;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f137915a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f137916b;

    /* renamed from: c, reason: collision with root package name */
    public final List f137917c;

    /* renamed from: d, reason: collision with root package name */
    public final PathMeasure f137918d;

    public d(Bitmap mask, Path stroke, ArrayList otherStrokes) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        Intrinsics.checkNotNullParameter(otherStrokes, "otherStrokes");
        this.f137915a = mask;
        this.f137916b = stroke;
        this.f137917c = otherStrokes;
        this.f137918d = new PathMeasure(stroke, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f137915a, dVar.f137915a) && Intrinsics.d(this.f137916b, dVar.f137916b) && Intrinsics.d(this.f137917c, dVar.f137917c);
    }

    public final int hashCode() {
        return this.f137917c.hashCode() + ((this.f137916b.hashCode() + (this.f137915a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("State(mask=");
        sb3.append(this.f137915a);
        sb3.append(", stroke=");
        sb3.append(this.f137916b);
        sb3.append(", otherStrokes=");
        return a.c.j(sb3, this.f137917c, ")");
    }
}
