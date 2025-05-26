package cb2;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27287a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27288b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f27289c;

    /* renamed from: d, reason: collision with root package name */
    public final v32.c f27290d;

    /* renamed from: e, reason: collision with root package name */
    public final z f27291e;

    public a0(String pinUid, int i13, Rect anchorRect, v32.c cVar, z reactionForType) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(anchorRect, "anchorRect");
        Intrinsics.checkNotNullParameter(reactionForType, "reactionForType");
        this.f27287a = pinUid;
        this.f27288b = i13;
        this.f27289c = anchorRect;
        this.f27290d = cVar;
        this.f27291e = reactionForType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f27287a, a0Var.f27287a) && this.f27288b == a0Var.f27288b && Intrinsics.d(this.f27289c, a0Var.f27289c) && this.f27290d == a0Var.f27290d && this.f27291e == a0Var.f27291e;
    }

    public final int hashCode() {
        int hashCode = (this.f27289c.hashCode() + ep.b.b(this.f27288b, this.f27287a.hashCode() * 31, 31)) * 31;
        v32.c cVar = this.f27290d;
        return Boolean.hashCode(false) + ((this.f27291e.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "ShowPinReactionsContextMenuEvent(pinUid=" + this.f27287a + ", anchorId=" + this.f27288b + ", anchorRect=" + this.f27289c + ", selectedReaction=" + this.f27290d + ", reactionForType=" + this.f27291e + ", showAnimation=false)";
    }
}
