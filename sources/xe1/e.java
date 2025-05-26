package xe1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f134698a;

    /* renamed from: b, reason: collision with root package name */
    public final z32.o f134699b;

    /* renamed from: c, reason: collision with root package name */
    public final z32.l f134700c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f134701d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f134702e;

    public e(float f13, z32.o actionStyle, z32.l actionLocation, Function0 action, Function0 render) {
        Intrinsics.checkNotNullParameter(actionStyle, "actionStyle");
        Intrinsics.checkNotNullParameter(actionLocation, "actionLocation");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(render, "render");
        this.f134698a = f13;
        this.f134699b = actionStyle;
        this.f134700c = actionLocation;
        this.f134701d = action;
        this.f134702e = render;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f134698a, eVar.f134698a) == 0 && this.f134699b == eVar.f134699b && this.f134700c == eVar.f134700c && Intrinsics.d(this.f134701d, eVar.f134701d) && Intrinsics.d(this.f134702e, eVar.f134702e);
    }

    public final int hashCode() {
        return this.f134702e.hashCode() + d7.g.b(this.f134701d, (this.f134700c.hashCode() + ((this.f134699b.hashCode() + (Float.hashCode(this.f134698a) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionItemSpec(widthHeightRatio=");
        sb3.append(this.f134698a);
        sb3.append(", actionStyle=");
        sb3.append(this.f134699b);
        sb3.append(", actionLocation=");
        sb3.append(this.f134700c);
        sb3.append(", action=");
        sb3.append(this.f134701d);
        sb3.append(", render=");
        return pk2.f.i(sb3, this.f134702e, ")");
    }
}
