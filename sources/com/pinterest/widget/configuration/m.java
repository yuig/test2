package com.pinterest.widget.configuration;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f52842a;

    /* renamed from: b, reason: collision with root package name */
    public final r f52843b;

    public m(int i13, r contentSource) {
        Intrinsics.checkNotNullParameter(contentSource, "contentSource");
        this.f52842a = i13;
        this.f52843b = contentSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f52842a == mVar.f52842a && this.f52843b == mVar.f52843b;
    }

    public final int hashCode() {
        return this.f52843b.hashCode() + (Integer.hashCode(this.f52842a) * 31);
    }

    public final String toString() {
        return "Save(widgetId=" + this.f52842a + ", contentSource=" + this.f52843b + ")";
    }
}
