package com.pinterest.widget.configuration;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final int f52844a;

    /* renamed from: b, reason: collision with root package name */
    public final r f52845b;

    public o(int i13, r contentSource) {
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        this.f52844a = i13;
        this.f52845b = contentSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f52844a == oVar.f52844a && this.f52845b == oVar.f52845b;
    }

    public final int hashCode() {
        return this.f52845b.hashCode() + (Integer.hashCode(this.f52844a) * 31);
    }

    public final String toString() {
        return "SetContentSource(widgetId=" + this.f52844a + ", contentSource=" + this.f52845b + ")";
    }
}
