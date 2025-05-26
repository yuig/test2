package ye1;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final List f138879a;

    /* renamed from: b, reason: collision with root package name */
    public final String f138880b;

    /* renamed from: c, reason: collision with root package name */
    public final String f138881c;

    /* renamed from: d, reason: collision with root package name */
    public final String f138882d;

    public o(String title, String pinIds, String actionUrl, ArrayList imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
        this.f138879a = imageUrls;
        this.f138880b = title;
        this.f138881c = pinIds;
        this.f138882d = actionUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f138879a, oVar.f138879a) && Intrinsics.d(this.f138880b, oVar.f138880b) && Intrinsics.d(this.f138881c, oVar.f138881c) && Intrinsics.d(this.f138882d, oVar.f138882d);
    }

    public final int hashCode() {
        return this.f138882d.hashCode() + cb.d(this.f138881c, cb.d(this.f138880b, this.f138879a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShoppingUnitModel(imageUrls=");
        sb3.append(this.f138879a);
        sb3.append(", title=");
        sb3.append(this.f138880b);
        sb3.append(", pinIds=");
        sb3.append(this.f138881c);
        sb3.append(", actionUrl=");
        return a.a.p(sb3, this.f138882d, ")");
    }
}
