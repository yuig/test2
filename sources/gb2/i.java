package gb2;

import kotlin.jvm.internal.Intrinsics;
import wa2.o;
import wa2.p;

/* loaded from: classes2.dex */
public final class i extends l {

    /* renamed from: a, reason: collision with root package name */
    public final String f64753a;

    /* renamed from: b, reason: collision with root package name */
    public final p f64754b;

    /* renamed from: c, reason: collision with root package name */
    public final o f64755c;

    public i(String uid, p feedbackState, o broadcastType) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(feedbackState, "feedbackState");
        Intrinsics.checkNotNullParameter(broadcastType, "broadcastType");
        this.f64753a = uid;
        this.f64754b = feedbackState;
        this.f64755c = broadcastType;
    }

    @Override // gb2.l
    public final String a() {
        return this.f64753a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f64753a, iVar.f64753a) && this.f64754b == iVar.f64754b && this.f64755c == iVar.f64755c;
    }

    public final int hashCode() {
        return this.f64755c.hashCode() + ((this.f64754b.hashCode() + (this.f64753a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PinFeedbackStateUpdate(uid=" + this.f64753a + ", feedbackState=" + this.f64754b + ", broadcastType=" + this.f64755c + ")";
    }

    public /* synthetic */ i(String str, p pVar) {
        this(str, pVar, o.UI_ONLY);
    }
}
