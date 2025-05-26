package ul1;

/* loaded from: classes5.dex */
public final class d extends l implements b {

    /* renamed from: e, reason: collision with root package name */
    public final rm1.q f122455e;

    public d(rm1.q qVar) {
        super(eo1.a.comp_badge_text_color_dark, eo1.a.comp_badge_dark_wash_background_color, eo1.a.comp_badge_icon_unknown, eo1.a.comp_badge_icon_color_dark);
        this.f122455e = qVar;
    }

    @Override // ul1.b
    public final rm1.q a() {
        return this.f122455e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f122455e == ((d) obj).f122455e;
    }

    public final int hashCode() {
        rm1.q qVar = this.f122455e;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public final String toString() {
        return "DarkWash(customIcon=" + this.f122455e + ")";
    }
}
