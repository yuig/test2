package dm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final rn1.a f55355a;

    /* renamed from: b, reason: collision with root package name */
    public final rn1.a f55356b;

    /* renamed from: c, reason: collision with root package name */
    public final cm1.d f55357c;

    /* renamed from: d, reason: collision with root package name */
    public final rm1.d f55358d;

    /* renamed from: e, reason: collision with root package name */
    public final om1.c f55359e;

    /* renamed from: f, reason: collision with root package name */
    public final d f55360f;

    /* renamed from: g, reason: collision with root package name */
    public final int f55361g;

    /* renamed from: h, reason: collision with root package name */
    public final fm1.c f55362h;

    public c(rn1.a titleText, rn1.a messageText, cm1.d buttonGroup, rm1.d workflowStatusIcon, om1.c dismissIconButton, d variant, int i13, fm1.c visibility) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
        Intrinsics.checkNotNullParameter(workflowStatusIcon, "workflowStatusIcon");
        Intrinsics.checkNotNullParameter(dismissIconButton, "dismissIconButton");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f55355a = titleText;
        this.f55356b = messageText;
        this.f55357c = buttonGroup;
        this.f55358d = workflowStatusIcon;
        this.f55359e = dismissIconButton;
        this.f55360f = variant;
        this.f55361g = i13;
        this.f55362h = visibility;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f55355a, cVar.f55355a) && Intrinsics.d(this.f55356b, cVar.f55356b) && Intrinsics.d(this.f55357c, cVar.f55357c) && Intrinsics.d(this.f55358d, cVar.f55358d) && Intrinsics.d(this.f55359e, cVar.f55359e) && this.f55360f == cVar.f55360f && this.f55361g == cVar.f55361g && this.f55362h == cVar.f55362h;
    }

    public final int hashCode() {
        return this.f55362h.hashCode() + ep.b.b(this.f55361g, (this.f55360f.hashCode() + ((this.f55359e.hashCode() + ((this.f55358d.hashCode() + ((this.f55357c.hashCode() + ((this.f55356b.hashCode() + (this.f55355a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DisplayState(titleText=" + this.f55355a + ", messageText=" + this.f55356b + ", buttonGroup=" + this.f55357c + ", workflowStatusIcon=" + this.f55358d + ", dismissIconButton=" + this.f55359e + ", variant=" + this.f55360f + ", id=" + this.f55361g + ", visibility=" + this.f55362h + ")";
    }
}
