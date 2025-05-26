package ee2;

import android.util.Size;
import d7.g;
import kotlin.jvm.internal.Intrinsics;
import v.z1;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Size f58804a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f58805b;

    /* renamed from: c, reason: collision with root package name */
    public final float f58806c;

    public a(Size sceneSize, z1 mvpTransform, float f13) {
        Intrinsics.checkNotNullParameter(sceneSize, "sceneSize");
        Intrinsics.checkNotNullParameter(mvpTransform, "mvpTransform");
        this.f58804a = sceneSize;
        this.f58805b = mvpTransform;
        this.f58806c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f58804a, aVar.f58804a) && Intrinsics.d(this.f58805b, aVar.f58805b) && Float.compare(this.f58806c, aVar.f58806c) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a.a.a(this.f58806c, (this.f58805b.hashCode() + (this.f58804a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DrawSettings(sceneSize=");
        sb3.append(this.f58804a);
        sb3.append(", mvpTransform=");
        sb3.append(this.f58805b);
        sb3.append(", animationStage=");
        return g.i(sb3, this.f58806c, ", hitTestingEnabled=true)");
    }
}
