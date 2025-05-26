package ul1;

/* loaded from: classes5.dex */
public final class h extends l implements b {

    /* renamed from: e, reason: collision with root package name */
    public final rm1.q f122459e;

    public h(rm1.q qVar) {
        super(eo1.a.comp_badge_text_color_neutral, eo1.a.comp_badge_neutral_background_color, eo1.a.comp_badge_icon_unknown, eo1.a.comp_badge_icon_color_neutral);
        this.f122459e = qVar;
    }

    @Override // ul1.b
    public final rm1.q a() {
        return this.f122459e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f122459e == ((h) obj).f122459e;
    }

    public final int hashCode() {
        rm1.q qVar = this.f122459e;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public final String toString() {
        return "Neutral(customIcon=" + this.f122459e + ")";
    }
}
