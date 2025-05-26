package wa2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f128951a;

    /* renamed from: b, reason: collision with root package name */
    public final v f128952b;

    /* renamed from: c, reason: collision with root package name */
    public final vn1.c f128953c;

    public x(i0 textLoadAction, v pinReactionIconsDrawableDisplayState, vn1.c textColor) {
        Intrinsics.checkNotNullParameter(textLoadAction, "textLoadAction");
        Intrinsics.checkNotNullParameter(pinReactionIconsDrawableDisplayState, "pinReactionIconsDrawableDisplayState");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.f128951a = textLoadAction;
        this.f128952b = pinReactionIconsDrawableDisplayState;
        this.f128953c = textColor;
    }

    public static x e(x xVar, h0 textLoadAction, v pinReactionIconsDrawableDisplayState) {
        vn1.c textColor = xVar.f128953c;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(textLoadAction, "textLoadAction");
        Intrinsics.checkNotNullParameter(pinReactionIconsDrawableDisplayState, "pinReactionIconsDrawableDisplayState");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        return new x(textLoadAction, pinReactionIconsDrawableDisplayState, textColor);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f128951a, xVar.f128951a) && Intrinsics.d(this.f128952b, xVar.f128952b) && this.f128953c == xVar.f128953c;
    }

    public final int hashCode() {
        return this.f128953c.hashCode() + ((this.f128952b.hashCode() + (Integer.hashCode(((h0) this.f128951a).f128757a) * 31)) * 31);
    }

    public final String toString() {
        return "PinReactionsDisplayState(textLoadAction=" + this.f128951a + ", pinReactionIconsDrawableDisplayState=" + this.f128952b + ", textColor=" + this.f128953c + ")";
    }
}
