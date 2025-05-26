package com.pinterest.feature.unauth.sba;

import a.cb;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f48765a;

    /* renamed from: b, reason: collision with root package name */
    public final List f48766b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48767c;

    /* renamed from: d, reason: collision with root package name */
    public final String f48768d;

    /* renamed from: e, reason: collision with root package name */
    public final String f48769e;

    /* renamed from: f, reason: collision with root package name */
    public final String f48770f;

    /* renamed from: g, reason: collision with root package name */
    public final String f48771g;

    /* renamed from: h, reason: collision with root package name */
    public final String f48772h;

    /* renamed from: i, reason: collision with root package name */
    public final String f48773i;

    /* renamed from: j, reason: collision with root package name */
    public final String f48774j;

    /* renamed from: k, reason: collision with root package name */
    public final String f48775k;

    public b0(List interests, List imageUrls) {
        Intrinsics.checkNotNullParameter(interests, "interests");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        this.f48765a = interests;
        this.f48766b = imageUrls;
        this.f48767c = cb.g("toString(...)");
        this.f48768d = "";
        this.f48769e = "";
        this.f48770f = String.valueOf(CollectionsKt.firstOrNull(interests));
        this.f48771g = String.valueOf(CollectionsKt.d0(interests));
        this.f48772h = "";
        this.f48773i = String.valueOf(CollectionsKt.firstOrNull(imageUrls));
        this.f48774j = String.valueOf(CollectionsKt.d0(imageUrls));
        this.f48775k = "";
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String a() {
        return this.f48775k;
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String e() {
        return this.f48771g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f48765a, b0Var.f48765a) && Intrinsics.d(this.f48766b, b0Var.f48766b);
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String g() {
        return this.f48773i;
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String getDescription() {
        return this.f48769e;
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String getId() {
        return this.f48767c;
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String getTitle() {
        return this.f48768d;
    }

    public final int hashCode() {
        return this.f48766b.hashCode() + (this.f48765a.hashCode() * 31);
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String l() {
        return this.f48772h;
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String s() {
        return this.f48774j;
    }

    public final String toString() {
        return "UnauthPreloadExperienceInterestItemVMState(interests=" + this.f48765a + ", imageUrls=" + this.f48766b + ")";
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String u() {
        return this.f48770f;
    }
}
