package q72;

import a.cb;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;
import r72.i1;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f102839a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f102840b;

    /* renamed from: c, reason: collision with root package name */
    public final b f102841c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f102842d;

    public g(String id3, Size imageSize, b bVar, i1 mask) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f102839a = id3;
        this.f102840b = imageSize;
        this.f102841c = bVar;
        this.f102842d = mask;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f102839a;
        int i13 = h.f102843a;
        return Intrinsics.d(this.f102839a, str) && Intrinsics.d(this.f102840b, gVar.f102840b) && Intrinsics.d(this.f102841c, gVar.f102841c) && Intrinsics.d(this.f102842d, gVar.f102842d);
    }

    public final int hashCode() {
        int i13 = h.f102843a;
        int hashCode = (this.f102840b.hashCode() + (this.f102839a.hashCode() * 31)) * 31;
        b bVar = this.f102841c;
        return this.f102842d.hashCode() + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        int i13 = h.f102843a;
        StringBuilder o13 = cb.o("ShufflesCutout(id=", a.a.p(new StringBuilder("ShufflesCutoutId(value="), this.f102839a, ")"), ", imageSize=");
        o13.append(this.f102840b);
        o13.append(", pin=");
        o13.append(this.f102841c);
        o13.append(", mask=");
        o13.append(this.f102842d);
        o13.append(")");
        return o13.toString();
    }
}
