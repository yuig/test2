package qm0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements z {

    /* renamed from: a, reason: collision with root package name */
    public final String f104359a;

    /* renamed from: b, reason: collision with root package name */
    public final List f104360b;

    public y(String str, ArrayList arrayList) {
        this.f104359a = str;
        this.f104360b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f104359a, yVar.f104359a) && Intrinsics.d(this.f104360b, yVar.f104360b);
    }

    public final int hashCode() {
        String str = this.f104359a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f104360b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PreviewTemplateUpdated(templateId=");
        sb3.append(this.f104359a);
        sb3.append(", selectedPins=");
        return a.c.j(sb3, this.f104360b, ")");
    }
}
