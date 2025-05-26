package mw0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f88419a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88420b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88421c;

    /* renamed from: d, reason: collision with root package name */
    public final String f88422d;

    /* renamed from: e, reason: collision with root package name */
    public final String f88423e;

    /* renamed from: f, reason: collision with root package name */
    public final String f88424f;

    public a(String title, String subtitle, String acceptButton, String declineButton, String fullScreenTitle, String fullScreenSubtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(acceptButton, "acceptButton");
        Intrinsics.checkNotNullParameter(declineButton, "declineButton");
        Intrinsics.checkNotNullParameter(fullScreenTitle, "fullScreenTitle");
        Intrinsics.checkNotNullParameter(fullScreenSubtitle, "fullScreenSubtitle");
        this.f88419a = title;
        this.f88420b = subtitle;
        this.f88421c = acceptButton;
        this.f88422d = declineButton;
        this.f88423e = fullScreenTitle;
        this.f88424f = fullScreenSubtitle;
    }

    public final String a() {
        return this.f88424f;
    }

    public final String b() {
        return this.f88423e;
    }

    public final String c() {
        return this.f88420b;
    }

    public final String d() {
        return this.f88419a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f88419a, aVar.f88419a) && Intrinsics.d(this.f88420b, aVar.f88420b) && Intrinsics.d(this.f88421c, aVar.f88421c) && Intrinsics.d(this.f88422d, aVar.f88422d) && Intrinsics.d(this.f88423e, aVar.f88423e) && Intrinsics.d(this.f88424f, aVar.f88424f);
    }

    public final int hashCode() {
        return this.f88424f.hashCode() + cb.d(this.f88423e, cb.d(this.f88422d, cb.d(this.f88421c, cb.d(this.f88420b, this.f88419a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LocationRequestExperience(title=");
        sb3.append(this.f88419a);
        sb3.append(", subtitle=");
        sb3.append(this.f88420b);
        sb3.append(", acceptButton=");
        sb3.append(this.f88421c);
        sb3.append(", declineButton=");
        sb3.append(this.f88422d);
        sb3.append(", fullScreenTitle=");
        sb3.append(this.f88423e);
        sb3.append(", fullScreenSubtitle=");
        return a.a.p(sb3, this.f88424f, ")");
    }
}
