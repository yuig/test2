package wl1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final rn1.a f130179a;

    /* renamed from: b, reason: collision with root package name */
    public final rn1.a f130180b;

    /* renamed from: c, reason: collision with root package name */
    public final cm1.d f130181c;

    /* renamed from: d, reason: collision with root package name */
    public final h f130182d;

    /* renamed from: e, reason: collision with root package name */
    public final om1.c f130183e;

    /* renamed from: f, reason: collision with root package name */
    public final int f130184f;

    /* renamed from: g, reason: collision with root package name */
    public final fm1.c f130185g;

    public c(rn1.a titleText, rn1.a messageText, cm1.d buttonGroup, h graphic, om1.c dismissIconButton, int i13, fm1.c visibility) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
        Intrinsics.checkNotNullParameter(graphic, "graphic");
        Intrinsics.checkNotNullParameter(dismissIconButton, "dismissIconButton");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f130179a = titleText;
        this.f130180b = messageText;
        this.f130181c = buttonGroup;
        this.f130182d = graphic;
        this.f130183e = dismissIconButton;
        this.f130184f = i13;
        this.f130185g = visibility;
    }

    public static c e(c cVar, fm1.c visibility) {
        rn1.a titleText = cVar.f130179a;
        rn1.a messageText = cVar.f130180b;
        cm1.d buttonGroup = cVar.f130181c;
        h graphic = cVar.f130182d;
        om1.c dismissIconButton = cVar.f130183e;
        int i13 = cVar.f130184f;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
        Intrinsics.checkNotNullParameter(graphic, "graphic");
        Intrinsics.checkNotNullParameter(dismissIconButton, "dismissIconButton");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new c(titleText, messageText, buttonGroup, graphic, dismissIconButton, i13, visibility);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f130179a, cVar.f130179a) && Intrinsics.d(this.f130180b, cVar.f130180b) && Intrinsics.d(this.f130181c, cVar.f130181c) && Intrinsics.d(this.f130182d, cVar.f130182d) && Intrinsics.d(this.f130183e, cVar.f130183e) && this.f130184f == cVar.f130184f && this.f130185g == cVar.f130185g;
    }

    public final int hashCode() {
        return this.f130185g.hashCode() + ep.b.b(this.f130184f, (this.f130183e.hashCode() + ((this.f130182d.hashCode() + ((this.f130181c.hashCode() + ((this.f130180b.hashCode() + (this.f130179a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DisplayState(titleText=" + this.f130179a + ", messageText=" + this.f130180b + ", buttonGroup=" + this.f130181c + ", graphic=" + this.f130182d + ", dismissIconButton=" + this.f130183e + ", id=" + this.f130184f + ", visibility=" + this.f130185g + ")";
    }
}
