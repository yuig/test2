package e5;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f57233a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f57234b;

    public j(Resources resources, Resources.Theme theme) {
        this.f57233a = resources;
        this.f57234b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f57233a.equals(jVar.f57233a) && Objects.equals(this.f57234b, jVar.f57234b);
    }

    public final int hashCode() {
        return Objects.hash(this.f57233a, this.f57234b);
    }
}
