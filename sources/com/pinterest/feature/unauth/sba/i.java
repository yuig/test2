package com.pinterest.feature.unauth.sba;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f48823a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48824b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48825c;

    /* renamed from: d, reason: collision with root package name */
    public final String f48826d;

    /* renamed from: e, reason: collision with root package name */
    public final String f48827e;

    /* renamed from: f, reason: collision with root package name */
    public final String f48828f;

    /* renamed from: g, reason: collision with root package name */
    public final String f48829g;

    /* renamed from: h, reason: collision with root package name */
    public final String f48830h;

    /* renamed from: i, reason: collision with root package name */
    public final o82.a0 f48831i;

    public i(String title, String description, String interestOne, String interestTwo, String todayImageUrl, String imageUrlOne, String imageUrlTwo, String url, o82.a0 multiSectionDisplayState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(interestOne, "interestOne");
        Intrinsics.checkNotNullParameter(interestTwo, "interestTwo");
        Intrinsics.checkNotNullParameter(todayImageUrl, "todayImageUrl");
        Intrinsics.checkNotNullParameter(imageUrlOne, "imageUrlOne");
        Intrinsics.checkNotNullParameter(imageUrlTwo, "imageUrlTwo");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f48823a = title;
        this.f48824b = description;
        this.f48825c = interestOne;
        this.f48826d = interestTwo;
        this.f48827e = todayImageUrl;
        this.f48828f = imageUrlOne;
        this.f48829g = imageUrlTwo;
        this.f48830h = url;
        this.f48831i = multiSectionDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f48823a, iVar.f48823a) && Intrinsics.d(this.f48824b, iVar.f48824b) && Intrinsics.d(this.f48825c, iVar.f48825c) && Intrinsics.d(this.f48826d, iVar.f48826d) && Intrinsics.d(this.f48827e, iVar.f48827e) && Intrinsics.d(this.f48828f, iVar.f48828f) && Intrinsics.d(this.f48829g, iVar.f48829g) && Intrinsics.d(this.f48830h, iVar.f48830h) && Intrinsics.d(this.f48831i, iVar.f48831i);
    }

    public final int hashCode() {
        return this.f48831i.f93524a.hashCode() + cb.d(this.f48830h, cb.d(this.f48829g, cb.d(this.f48828f, cb.d(this.f48827e, cb.d(this.f48826d, cb.d(this.f48825c, cb.d(this.f48824b, this.f48823a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "UnauthPreloadExperienceDisplayState(title=" + this.f48823a + ", description=" + this.f48824b + ", interestOne=" + this.f48825c + ", interestTwo=" + this.f48826d + ", todayImageUrl=" + this.f48827e + ", imageUrlOne=" + this.f48828f + ", imageUrlTwo=" + this.f48829g + ", url=" + this.f48830h + ", multiSectionDisplayState=" + this.f48831i + ")";
    }
}
