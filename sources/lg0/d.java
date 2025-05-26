package lg0;

import a.cb;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends o {

    /* renamed from: b, reason: collision with root package name */
    public final g f83208b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83209c;

    /* renamed from: d, reason: collision with root package name */
    public final String f83210d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83211e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83212f;

    public d(g image, String title, String subtitle, String ctaText, String ctaUri) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(ctaUri, "ctaUri");
        this.f83208b = image;
        this.f83209c = title;
        this.f83210d = subtitle;
        this.f83211e = ctaText;
        this.f83212f = ctaUri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f83208b, dVar.f83208b) && Intrinsics.d(this.f83209c, dVar.f83209c) && Intrinsics.d(this.f83210d, dVar.f83210d) && Intrinsics.d(this.f83211e, dVar.f83211e) && Intrinsics.d(this.f83212f, dVar.f83212f);
    }

    public final int hashCode() {
        return this.f83212f.hashCode() + cb.d(this.f83211e, cb.d(this.f83210d, cb.d(this.f83209c, this.f83208b.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SignIn(image=");
        sb3.append(this.f83208b);
        sb3.append(", title=");
        sb3.append(this.f83209c);
        sb3.append(", subtitle=");
        sb3.append(this.f83210d);
        sb3.append(", ctaText=");
        sb3.append(this.f83211e);
        sb3.append(", ctaUri=");
        return a.a.p(sb3, this.f83212f, ")");
    }
}
