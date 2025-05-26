package v21;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f123873a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123874b;

    /* renamed from: c, reason: collision with root package name */
    public final String f123875c;

    /* renamed from: d, reason: collision with root package name */
    public final List f123876d;

    /* renamed from: e, reason: collision with root package name */
    public final List f123877e;

    public e(String experienceId, String title, String subtitle, List imageUrls, List pinIds) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        this.f123873a = experienceId;
        this.f123874b = title;
        this.f123875c = subtitle;
        this.f123876d = imageUrls;
        this.f123877e = pinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f123873a, eVar.f123873a) && Intrinsics.d(this.f123874b, eVar.f123874b) && Intrinsics.d(this.f123875c, eVar.f123875c) && Intrinsics.d(this.f123876d, eVar.f123876d) && Intrinsics.d(this.f123877e, eVar.f123877e);
    }

    public final int hashCode() {
        return this.f123877e.hashCode() + ep.b.c(this.f123876d, cb.d(this.f123875c, cb.d(this.f123874b, this.f123873a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadInitialState(experienceId=");
        sb3.append(this.f123873a);
        sb3.append(", title=");
        sb3.append(this.f123874b);
        sb3.append(", subtitle=");
        sb3.append(this.f123875c);
        sb3.append(", imageUrls=");
        sb3.append(this.f123876d);
        sb3.append(", pinIds=");
        return a.c.j(sb3, this.f123877e, ")");
    }
}
