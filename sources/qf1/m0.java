package qf1;

import a.cb;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final dl1.s f103744a;

    /* renamed from: b, reason: collision with root package name */
    public final float f103745b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f103746c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f103747d;

    /* renamed from: e, reason: collision with root package name */
    public final int f103748e;

    /* renamed from: f, reason: collision with root package name */
    public final String f103749f;

    /* renamed from: g, reason: collision with root package name */
    public final String f103750g;

    /* renamed from: h, reason: collision with root package name */
    public final w f103751h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f103752i;

    public m0(dl1.s page, float f13, HashMap hashMap, int i13, String str, String sessionId, w duration, boolean z13) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f103744a = page;
        this.f103745b = f13;
        this.f103746c = hashMap;
        this.f103747d = null;
        this.f103748e = i13;
        this.f103749f = str;
        this.f103750g = sessionId;
        this.f103751h = duration;
        this.f103752i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f103744a, m0Var.f103744a) && Float.compare(this.f103745b, m0Var.f103745b) == 0 && Intrinsics.d(this.f103746c, m0Var.f103746c) && Intrinsics.d(this.f103747d, m0Var.f103747d) && this.f103748e == m0Var.f103748e && Intrinsics.d(this.f103749f, m0Var.f103749f) && Intrinsics.d(this.f103750g, m0Var.f103750g) && Intrinsics.d(this.f103751h, m0Var.f103751h) && this.f103752i == m0Var.f103752i;
    }

    public final int hashCode() {
        int a13 = a.a.a(this.f103745b, this.f103744a.hashCode() * 31, 31);
        HashMap hashMap = this.f103746c;
        int hashCode = (a13 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        HashMap hashMap2 = this.f103747d;
        int b13 = ep.b.b(this.f103748e, (hashCode + (hashMap2 == null ? 0 : hashMap2.hashCode())) * 31, 31);
        String str = this.f103749f;
        return Boolean.hashCode(this.f103752i) + ((this.f103751h.hashCode() + cb.d(this.f103750g, (b13 + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinPageViewModel(page=");
        sb3.append(this.f103744a);
        sb3.append(", canvasAspectRatio=");
        sb3.append(this.f103745b);
        sb3.append(", mentionedUsers=");
        sb3.append(this.f103746c);
        sb3.append(", productPins=");
        sb3.append(this.f103747d);
        sb3.append(", pinPosition=");
        sb3.append(this.f103748e);
        sb3.append(", pinDominantColor=");
        sb3.append(this.f103749f);
        sb3.append(", sessionId=");
        sb3.append(this.f103750g);
        sb3.append(", duration=");
        sb3.append(this.f103751h);
        sb3.append(", isNativeVideo=");
        return a.a.r(sb3, this.f103752i, ")");
    }
}
