package u52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f120743a;

    /* renamed from: b, reason: collision with root package name */
    public final w f120744b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f120745c;

    /* renamed from: d, reason: collision with root package name */
    public final s f120746d;

    public x(f1 templatesState, w pinsState, c1 templatesIndicatorState, s discardAlertState) {
        Intrinsics.checkNotNullParameter(templatesState, "templatesState");
        Intrinsics.checkNotNullParameter(pinsState, "pinsState");
        Intrinsics.checkNotNullParameter(templatesIndicatorState, "templatesIndicatorState");
        Intrinsics.checkNotNullParameter(discardAlertState, "discardAlertState");
        this.f120743a = templatesState;
        this.f120744b = pinsState;
        this.f120745c = templatesIndicatorState;
        this.f120746d = discardAlertState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [u52.f1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [u52.w] */
    public static x e(x xVar, e1 e1Var, v vVar, c1 templatesIndicatorState, s discardAlertState, int i13) {
        e1 templatesState = e1Var;
        if ((i13 & 1) != 0) {
            templatesState = xVar.f120743a;
        }
        v pinsState = vVar;
        if ((i13 & 2) != 0) {
            pinsState = xVar.f120744b;
        }
        if ((i13 & 4) != 0) {
            templatesIndicatorState = xVar.f120745c;
        }
        if ((i13 & 8) != 0) {
            discardAlertState = xVar.f120746d;
        }
        xVar.getClass();
        Intrinsics.checkNotNullParameter(templatesState, "templatesState");
        Intrinsics.checkNotNullParameter(pinsState, "pinsState");
        Intrinsics.checkNotNullParameter(templatesIndicatorState, "templatesIndicatorState");
        Intrinsics.checkNotNullParameter(discardAlertState, "discardAlertState");
        return new x(templatesState, pinsState, templatesIndicatorState, discardAlertState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f120743a, xVar.f120743a) && Intrinsics.d(this.f120744b, xVar.f120744b) && Intrinsics.d(this.f120745c, xVar.f120745c) && Intrinsics.d(this.f120746d, xVar.f120746d);
    }

    public final s f() {
        return this.f120746d;
    }

    public final c1 g() {
        return this.f120745c;
    }

    public final f1 h() {
        return this.f120743a;
    }

    public final int hashCode() {
        return this.f120746d.hashCode() + ((this.f120745c.hashCode() + ((this.f120744b.hashCode() + (this.f120743a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TemplateGalleryDisplayState(templatesState=" + this.f120743a + ", pinsState=" + this.f120744b + ", templatesIndicatorState=" + this.f120745c + ", discardAlertState=" + this.f120746d + ")";
    }
}
