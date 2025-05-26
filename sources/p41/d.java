package p41;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u32.i;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f98851a;

    /* renamed from: b, reason: collision with root package name */
    public final List f98852b;

    /* renamed from: c, reason: collision with root package name */
    public final i f98853c;

    public d(List supportedTabConfigurations, ArrayList defaultTabConfigurations, i iVar) {
        Intrinsics.checkNotNullParameter(supportedTabConfigurations, "supportedTabConfigurations");
        Intrinsics.checkNotNullParameter(defaultTabConfigurations, "defaultTabConfigurations");
        this.f98851a = supportedTabConfigurations;
        this.f98852b = defaultTabConfigurations;
        this.f98853c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f98851a, dVar.f98851a) && Intrinsics.d(this.f98852b, dVar.f98852b) && this.f98853c == dVar.f98853c;
    }

    public final int hashCode() {
        int b13 = ep.b.b(0, ep.b.c(this.f98852b, this.f98851a.hashCode() * 31, 31), 31);
        i iVar = this.f98853c;
        return b13 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "UserProfileTabSetup(supportedTabConfigurations=" + this.f98851a + ", defaultTabConfigurations=" + this.f98852b + ", selectedTabPosition=0, initialTabFromNavigation=" + this.f98853c + ")";
    }
}
