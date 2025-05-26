package yw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes5.dex */
public final class g implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f140291a;

    /* renamed from: b, reason: collision with root package name */
    public final String f140292b;

    /* renamed from: c, reason: collision with root package name */
    public final String f140293c;

    /* renamed from: d, reason: collision with root package name */
    public final List f140294d;

    /* renamed from: e, reason: collision with root package name */
    public final n f140295e;

    /* renamed from: f, reason: collision with root package name */
    public final String f140296f;

    /* renamed from: g, reason: collision with root package name */
    public final int f140297g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f140298h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f140299i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f140300j;

    public g(String str, String str2, String str3, List recyclerItems, String str4, int i13, boolean z13, boolean z14, int i14) {
        n moduleVariant = n.DROPDOWN;
        str4 = (i14 & 32) != 0 ? "see_it_styled" : str4;
        i13 = (i14 & 64) != 0 ? 0 : i13;
        Intrinsics.checkNotNullParameter(recyclerItems, "recyclerItems");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        this.f140291a = str;
        this.f140292b = str2;
        this.f140293c = str3;
        this.f140294d = recyclerItems;
        this.f140295e = moduleVariant;
        this.f140296f = str4;
        this.f140297g = i13;
        this.f140298h = z13;
        this.f140299i = false;
        this.f140300j = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f140291a, gVar.f140291a) && Intrinsics.d(this.f140292b, gVar.f140292b) && Intrinsics.d(this.f140293c, gVar.f140293c) && Intrinsics.d(this.f140294d, gVar.f140294d) && this.f140295e == gVar.f140295e && Intrinsics.d(this.f140296f, gVar.f140296f) && this.f140297g == gVar.f140297g && this.f140298h == gVar.f140298h && this.f140299i == gVar.f140299i && this.f140300j == gVar.f140300j;
    }

    public final int hashCode() {
        String str = this.f140291a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f140292b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f140293c;
        int hashCode3 = (this.f140295e.hashCode() + ep.b.c(this.f140294d, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31)) * 31;
        String str4 = this.f140296f;
        return Boolean.hashCode(this.f140300j) + ep.b.e(this.f140299i, ep.b.e(this.f140298h, ep.b.b(this.f140297g, (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SeeItStyledModuleDisplayState(title=");
        sb3.append(this.f140291a);
        sb3.append(", productTitle=");
        sb3.append(this.f140292b);
        sb3.append(", currentProductImageUrl=");
        sb3.append(this.f140293c);
        sb3.append(", recyclerItems=");
        sb3.append(this.f140294d);
        sb3.append(", moduleVariant=");
        sb3.append(this.f140295e);
        sb3.append(", storyTypeForLogging=");
        sb3.append(this.f140296f);
        sb3.append(", recyclerIndex=");
        sb3.append(this.f140297g);
        sb3.append(", shouldAddSwipeListener=");
        sb3.append(this.f140298h);
        sb3.append(", shouldUpdateCompleteTheLookStory=");
        sb3.append(this.f140299i);
        sb3.append(", shouldUseStaticSubtitle=");
        return a.a.r(sb3, this.f140300j, ")");
    }
}
