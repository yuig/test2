package t90;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import s90.d1;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class r implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f116823a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f116824b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f116825c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f116826d;

    public r() {
        int i13 = d1.collage_cutout_refine_tool_label;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        k0 title = new k0(i13, new ArrayList(0));
        Intrinsics.checkNotNullParameter(title, "title");
        this.f116823a = title;
        this.f116824b = true;
        this.f116825c = false;
        this.f116826d = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f116823a, rVar.f116823a) && this.f116824b == rVar.f116824b && this.f116825c == rVar.f116825c && this.f116826d == rVar.f116826d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116826d) + ep.b.e(this.f116825c, ep.b.e(this.f116824b, this.f116823a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CutoutRefineTopBarState(title=");
        sb3.append(this.f116823a);
        sb3.append(", closeEnabled=");
        sb3.append(this.f116824b);
        sb3.append(", undoEnabled=");
        sb3.append(this.f116825c);
        sb3.append(", saveEnabled=");
        return a.a.r(sb3, this.f116826d, ")");
    }
}
