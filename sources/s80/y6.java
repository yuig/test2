package s80;

import a.cb;
import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111861b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111862c;

    /* renamed from: d, reason: collision with root package name */
    public final String f111863d;

    /* renamed from: e, reason: collision with root package name */
    public final String f111864e;

    /* renamed from: f, reason: collision with root package name */
    public final f30 f111865f;

    /* renamed from: g, reason: collision with root package name */
    public final List f111866g;

    /* renamed from: h, reason: collision with root package name */
    public final List f111867h;

    /* renamed from: i, reason: collision with root package name */
    public final List f111868i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f111869j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f111870k;

    public /* synthetic */ y6(String str, String str2, String str3, String str4, String str5, int i13) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return Intrinsics.d(this.f111860a, y6Var.f111860a) && Intrinsics.d(this.f111861b, y6Var.f111861b) && Intrinsics.d(this.f111862c, y6Var.f111862c) && Intrinsics.d(this.f111863d, y6Var.f111863d) && Intrinsics.d(this.f111864e, y6Var.f111864e) && Intrinsics.d(this.f111865f, y6Var.f111865f) && Intrinsics.d(this.f111866g, y6Var.f111866g) && Intrinsics.d(this.f111867h, y6Var.f111867h) && Intrinsics.d(this.f111868i, y6Var.f111868i);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f111864e, cb.d(this.f111863d, cb.d(this.f111862c, cb.d(this.f111861b, this.f111860a.hashCode() * 31, 31), 31), 31), 31);
        f30 f30Var = this.f111865f;
        int hashCode = (d2 + (f30Var == null ? 0 : f30Var.hashCode())) * 31;
        List list = this.f111866g;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f111867h;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f111868i;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnboardingDisplayData(caption=");
        sb3.append(this.f111860a);
        sb3.append(", title=");
        sb3.append(this.f111861b);
        sb3.append(", subtitle=");
        sb3.append(this.f111862c);
        sb3.append(", primaryButtonText=");
        sb3.append(this.f111863d);
        sb3.append(", secondaryButtonText=");
        sb3.append(this.f111864e);
        sb3.append(", videoPin=");
        sb3.append(this.f111865f);
        sb3.append(", cutoutImageUrls=");
        sb3.append(this.f111866g);
        sb3.append(", cutoutsWithMask=");
        sb3.append(this.f111867h);
        sb3.append(", cutoutsWithoutMask=");
        return a.c.j(sb3, this.f111868i, ")");
    }

    public y6(String caption, String title, String subtitle, String primaryButtonText, String secondaryButtonText, f30 f30Var, List list, List list2, List list3) {
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f111860a = caption;
        this.f111861b = title;
        this.f111862c = subtitle;
        this.f111863d = primaryButtonText;
        this.f111864e = secondaryButtonText;
        this.f111865f = f30Var;
        this.f111866g = list;
        this.f111867h = list2;
        this.f111868i = list3;
        boolean z13 = true;
        this.f111869j = (kotlin.text.z.j(caption) ^ true) || (kotlin.text.z.j(title) ^ true) || (kotlin.text.z.j(subtitle) ^ true);
        if (!(!kotlin.text.z.j(primaryButtonText)) && !(!kotlin.text.z.j(secondaryButtonText))) {
            z13 = false;
        }
        this.f111870k = z13;
    }
}
