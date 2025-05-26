package ul1;

/* loaded from: classes5.dex */
public final class g extends l implements b {

    /* renamed from: e, reason: collision with root package name */
    public final rm1.q f122458e;

    public g(rm1.q qVar) {
        super(eo1.a.comp_badge_text_color_light, eo1.a.comp_badge_light_wash_background_color, eo1.a.comp_badge_icon_unknown, eo1.a.comp_badge_icon_color_light);
        this.f122458e = qVar;
    }

    @Override // ul1.b
    public final rm1.q a() {
        return this.f122458e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f122458e == ((g) obj).f122458e;
    }

    public final int hashCode() {
        rm1.q qVar = this.f122458e;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public final String toString() {
        return "LightWash(customIcon=" + this.f122458e + ")";
    }
}
