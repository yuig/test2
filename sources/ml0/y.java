package ml0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f87514a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f87515b;

    /* renamed from: c, reason: collision with root package name */
    public final float f87516c;

    /* renamed from: d, reason: collision with root package name */
    public final float f87517d;

    /* renamed from: e, reason: collision with root package name */
    public final float f87518e;

    /* renamed from: f, reason: collision with root package name */
    public final float f87519f;

    /* renamed from: g, reason: collision with root package name */
    public final u50.i0 f87520g;

    public y(String boardId, f30 pin, float f13, float f14, float f15, float f16, u50.k0 toastMessage) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(toastMessage, "toastMessage");
        this.f87514a = boardId;
        this.f87515b = pin;
        this.f87516c = f13;
        this.f87517d = f14;
        this.f87518e = f15;
        this.f87519f = f16;
        this.f87520g = toastMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f87514a, yVar.f87514a) && Intrinsics.d(this.f87515b, yVar.f87515b) && Float.compare(this.f87516c, yVar.f87516c) == 0 && Float.compare(this.f87517d, yVar.f87517d) == 0 && Float.compare(this.f87518e, yVar.f87518e) == 0 && Float.compare(this.f87519f, yVar.f87519f) == 0 && Intrinsics.d(this.f87520g, yVar.f87520g);
    }

    public final int hashCode() {
        return this.f87520g.hashCode() + a.a.a(this.f87519f, a.a.a(this.f87518e, a.a.a(this.f87517d, a.a.a(this.f87516c, (this.f87515b.hashCode() + (this.f87514a.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreateHeaderImage(boardId=");
        sb3.append(this.f87514a);
        sb3.append(", pin=");
        sb3.append(this.f87515b);
        sb3.append(", cropX=");
        sb3.append(this.f87516c);
        sb3.append(", cropY=");
        sb3.append(this.f87517d);
        sb3.append(", width=");
        sb3.append(this.f87518e);
        sb3.append(", height=");
        sb3.append(this.f87519f);
        sb3.append(", toastMessage=");
        return jq.b.k(sb3, this.f87520g, ")");
    }
}
