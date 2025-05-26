package p41;

import android.os.Bundle;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.Intrinsics;
import u32.i;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f98844a;

    /* renamed from: b, reason: collision with root package name */
    public String f98845b;

    /* renamed from: c, reason: collision with root package name */
    public final ScreenLocation f98846c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f98847d;

    /* renamed from: e, reason: collision with root package name */
    public final i f98848e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f98849f;

    public b(int i13, String displayText, ScreenLocation location, Bundle bundle, i iVar) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f98844a = i13;
        this.f98845b = displayText;
        this.f98846c = location;
        this.f98847d = bundle;
        this.f98848e = iVar;
        this.f98849f = null;
    }

    public final String a() {
        return this.f98845b;
    }

    public final int b() {
        return this.f98844a;
    }

    public final i c() {
        return this.f98848e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.profile.lego.tabs.UserProfileTab");
        return this.f98844a == ((b) obj).f98844a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98844a);
    }

    public final String toString() {
        String str = this.f98845b;
        Boolean bool = this.f98849f;
        StringBuilder sb3 = new StringBuilder("UserProfileTab(id=");
        a.a.A(sb3, this.f98844a, ", displayText=", str, ", location=");
        sb3.append(this.f98846c);
        sb3.append(", customArguments=");
        sb3.append(this.f98847d);
        sb3.append(", type=");
        sb3.append(this.f98848e);
        sb3.append(", isDefault=");
        sb3.append(bool);
        sb3.append(")");
        return sb3.toString();
    }
}
