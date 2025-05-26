package i3;

import a.cb;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import ao2.m0;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f71445a;

    /* renamed from: b, reason: collision with root package name */
    public int f71446b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final h1.b f71447c = new h1.b(3);

    public a(XmlPullParser xmlPullParser) {
        this.f71445a = xmlPullParser;
    }

    public final ColorStateList a(TypedArray typedArray, Resources.Theme theme) {
        ColorStateList B = m0.B(typedArray, this.f71445a, theme);
        c(typedArray.getChangingConfigurations());
        return B;
    }

    public final float b(TypedArray typedArray, String str, int i13, float f13) {
        if (m0.N(this.f71445a, str)) {
            f13 = typedArray.getFloat(i13, f13);
        }
        c(typedArray.getChangingConfigurations());
        return f13;
    }

    public final void c(int i13) {
        this.f71446b = i13 | this.f71446b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f71445a, aVar.f71445a) && this.f71446b == aVar.f71446b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71446b) + (this.f71445a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb3.append(this.f71445a);
        sb3.append(", config=");
        return cb.l(sb3, this.f71446b, ')');
    }
}
