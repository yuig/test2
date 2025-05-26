package oc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f94067a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94068b;

    public d(String header, String str) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.f94067a = header;
        this.f94068b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f94067a, dVar.f94067a) && Intrinsics.d(this.f94068b, dVar.f94068b);
    }

    public final int hashCode() {
        int hashCode = this.f94067a.hashCode() * 31;
        String str = this.f94068b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Info(header=");
        sb3.append(this.f94067a);
        sb3.append(", text=");
        return a.a.p(sb3, this.f94068b, ")");
    }
}
