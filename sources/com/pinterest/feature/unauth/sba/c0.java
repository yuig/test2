package com.pinterest.feature.unauth.sba;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements u50.o {

    /* renamed from: a */
    public final String f48779a;

    /* renamed from: b */
    public final String f48780b;

    /* renamed from: c */
    public final String f48781c;

    /* renamed from: d */
    public final String f48782d;

    /* renamed from: e */
    public final String f48783e;

    /* renamed from: f */
    public final String f48784f;

    /* renamed from: g */
    public final String f48785g;

    /* renamed from: h */
    public final String f48786h;

    public c0(String title, String description, String interestOne, String interestTwo, String todayImageUrl, String imageUrlOne, String imageUrlTwo, String url) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(interestOne, "interestOne");
        Intrinsics.checkNotNullParameter(interestTwo, "interestTwo");
        Intrinsics.checkNotNullParameter(todayImageUrl, "todayImageUrl");
        Intrinsics.checkNotNullParameter(imageUrlOne, "imageUrlOne");
        Intrinsics.checkNotNullParameter(imageUrlTwo, "imageUrlTwo");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f48779a = title;
        this.f48780b = description;
        this.f48781c = interestOne;
        this.f48782d = interestTwo;
        this.f48783e = todayImageUrl;
        this.f48784f = imageUrlOne;
        this.f48785g = imageUrlTwo;
        this.f48786h = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f48779a, c0Var.f48779a) && Intrinsics.d(this.f48780b, c0Var.f48780b) && Intrinsics.d(this.f48781c, c0Var.f48781c) && Intrinsics.d(this.f48782d, c0Var.f48782d) && Intrinsics.d(this.f48783e, c0Var.f48783e) && Intrinsics.d(this.f48784f, c0Var.f48784f) && Intrinsics.d(this.f48785g, c0Var.f48785g) && Intrinsics.d(this.f48786h, c0Var.f48786h);
    }

    public final int hashCode() {
        return this.f48786h.hashCode() + cb.d(this.f48785g, cb.d(this.f48784f, cb.d(this.f48783e, cb.d(this.f48782d, cb.d(this.f48781c, cb.d(this.f48780b, this.f48779a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UnauthPreloadExperienceItemDisplayState(title=");
        sb3.append(this.f48779a);
        sb3.append(", description=");
        sb3.append(this.f48780b);
        sb3.append(", interestOne=");
        sb3.append(this.f48781c);
        sb3.append(", interestTwo=");
        sb3.append(this.f48782d);
        sb3.append(", todayImageUrl=");
        sb3.append(this.f48783e);
        sb3.append(", imageUrlOne=");
        sb3.append(this.f48784f);
        sb3.append(", imageUrlTwo=");
        sb3.append(this.f48785g);
        sb3.append(", url=");
        return a.a.p(sb3, this.f48786h, ")");
    }
}
