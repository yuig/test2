package com.pinterest.feature.unauth.sba;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f48849a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48850b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48851c;

    /* renamed from: d, reason: collision with root package name */
    public final String f48852d;

    /* renamed from: e, reason: collision with root package name */
    public final String f48853e;

    /* renamed from: f, reason: collision with root package name */
    public final String f48854f;

    /* renamed from: g, reason: collision with root package name */
    public final String f48855g;

    /* renamed from: h, reason: collision with root package name */
    public final String f48856h;

    /* renamed from: i, reason: collision with root package name */
    public final o82.j0 f48857i;

    public p0(String title, String description, String interestOne, String interestTwo, String todayImageUrl, String imageUrlOne, String imageUrlTwo, String url, o82.j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(interestOne, "interestOne");
        Intrinsics.checkNotNullParameter(interestTwo, "interestTwo");
        Intrinsics.checkNotNullParameter(todayImageUrl, "todayImageUrl");
        Intrinsics.checkNotNullParameter(imageUrlOne, "imageUrlOne");
        Intrinsics.checkNotNullParameter(imageUrlTwo, "imageUrlTwo");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f48849a = title;
        this.f48850b = description;
        this.f48851c = interestOne;
        this.f48852d = interestTwo;
        this.f48853e = todayImageUrl;
        this.f48854f = imageUrlOne;
        this.f48855g = imageUrlTwo;
        this.f48856h = url;
        this.f48857i = multiSectionVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f48849a, p0Var.f48849a) && Intrinsics.d(this.f48850b, p0Var.f48850b) && Intrinsics.d(this.f48851c, p0Var.f48851c) && Intrinsics.d(this.f48852d, p0Var.f48852d) && Intrinsics.d(this.f48853e, p0Var.f48853e) && Intrinsics.d(this.f48854f, p0Var.f48854f) && Intrinsics.d(this.f48855g, p0Var.f48855g) && Intrinsics.d(this.f48856h, p0Var.f48856h) && Intrinsics.d(this.f48857i, p0Var.f48857i);
    }

    public final int hashCode() {
        return this.f48857i.f93634a.hashCode() + cb.d(this.f48856h, cb.d(this.f48855g, cb.d(this.f48854f, cb.d(this.f48853e, cb.d(this.f48852d, cb.d(this.f48851c, cb.d(this.f48850b, this.f48849a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "UnauthPreloadExperienceVMState(title=" + this.f48849a + ", description=" + this.f48850b + ", interestOne=" + this.f48851c + ", interestTwo=" + this.f48852d + ", todayImageUrl=" + this.f48853e + ", imageUrlOne=" + this.f48854f + ", imageUrlTwo=" + this.f48855g + ", url=" + this.f48856h + ", multiSectionVMState=" + this.f48857i + ")";
    }
}
