package k31;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f78242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78243b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f78244c;

    public e(String imageUrl, String label, b01.c cVar, int i13) {
        imageUrl = (i13 & 1) != 0 ? "" : imageUrl;
        label = (i13 & 2) != 0 ? "" : label;
        Function0 onTap = cVar;
        onTap = (i13 & 4) != 0 ? d.f78241i : onTap;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        this.f78242a = imageUrl;
        this.f78243b = label;
        this.f78244c = onTap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f78242a, eVar.f78242a) && Intrinsics.d(this.f78243b, eVar.f78243b) && Intrinsics.d(this.f78244c, eVar.f78244c);
    }

    public final int hashCode() {
        return this.f78244c.hashCode() + cb.d(this.f78243b, this.f78242a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IdeaPreviewDisplayState(imageUrl=");
        sb3.append(this.f78242a);
        sb3.append(", label=");
        sb3.append(this.f78243b);
        sb3.append(", onTap=");
        return pk2.f.i(sb3, this.f78244c, ")");
    }
}
