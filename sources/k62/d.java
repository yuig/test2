package k62;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f78426a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78427b;

    /* renamed from: c, reason: collision with root package name */
    public final String f78428c;

    /* renamed from: d, reason: collision with root package name */
    public final h f78429d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f78430e;

    /* renamed from: f, reason: collision with root package name */
    public final List f78431f;

    public d(String displayName, int i13, String valueSuffix, h valueFormat, List options) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(valueSuffix, "valueSuffix");
        Intrinsics.checkNotNullParameter(valueFormat, "valueFormat");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f78426a = displayName;
        this.f78427b = i13;
        this.f78428c = valueSuffix;
        this.f78429d = valueFormat;
        this.f78430e = false;
        this.f78431f = options;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f78426a, dVar.f78426a) && this.f78427b == dVar.f78427b && Intrinsics.d(this.f78428c, dVar.f78428c) && this.f78429d == dVar.f78429d && this.f78430e == dVar.f78430e && Intrinsics.d(this.f78431f, dVar.f78431f);
    }

    public final int hashCode() {
        return this.f78431f.hashCode() + ep.b.e(this.f78430e, (this.f78429d.hashCode() + cb.d(this.f78428c, ep.b.b(this.f78427b, this.f78426a.hashCode() * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EffectSettingMetadata(displayName=");
        sb3.append(this.f78426a);
        sb3.append(", iconResId=");
        sb3.append(this.f78427b);
        sb3.append(", valueSuffix=");
        sb3.append(this.f78428c);
        sb3.append(", valueFormat=");
        sb3.append(this.f78429d);
        sb3.append(", useAsToggle=");
        sb3.append(this.f78430e);
        sb3.append(", options=");
        return a.c.j(sb3, this.f78431f, ")");
    }
}
