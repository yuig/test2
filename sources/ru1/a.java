package ru1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.b0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f110006a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.n f110007b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f110008c;

    /* renamed from: d, reason: collision with root package name */
    public final b f110009d;

    /* renamed from: e, reason: collision with root package name */
    public final c f110010e;

    public a(ArrayList tabs, b0 elevation, boolean z13, b tabContainer, c tabDisplayState) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(elevation, "elevation");
        Intrinsics.checkNotNullParameter(tabContainer, "tabContainer");
        Intrinsics.checkNotNullParameter(tabDisplayState, "tabDisplayState");
        this.f110006a = tabs;
        this.f110007b = elevation;
        this.f110008c = z13;
        this.f110009d = tabContainer;
        this.f110010e = tabDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f110006a, aVar.f110006a) && Intrinsics.d(this.f110007b, aVar.f110007b) && this.f110008c == aVar.f110008c && Intrinsics.d(this.f110009d, aVar.f110009d) && Intrinsics.d(this.f110010e, aVar.f110010e);
    }

    public final int hashCode() {
        return this.f110010e.hashCode() + ((this.f110009d.hashCode() + ep.b.e(this.f110008c, d7.g.e(this.f110007b, this.f110006a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "BottomNavBarDisplayState(tabs=" + this.f110006a + ", elevation=" + this.f110007b + ", shouldShowNewUserNavLabels=" + this.f110008c + ", tabContainer=" + this.f110009d + ", tabDisplayState=" + this.f110010e + ")";
    }
}
