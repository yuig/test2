package hd0;

import a.cb;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f68853a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68854b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68855c;

    /* renamed from: d, reason: collision with root package name */
    public final String f68856d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68857e;

    /* renamed from: f, reason: collision with root package name */
    public final String f68858f;

    /* renamed from: g, reason: collision with root package name */
    public final String f68859g;

    /* renamed from: h, reason: collision with root package name */
    public final String f68860h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f68861i;

    /* renamed from: j, reason: collision with root package name */
    public final Function1 f68862j;

    public g(String title, String message, String experienceId, String placementId, int i13, String primaryButtonText, String str, String secondaryButtonText, Function1 actions, Function1 logAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(logAction, "logAction");
        this.f68853a = title;
        this.f68854b = message;
        this.f68855c = experienceId;
        this.f68856d = placementId;
        this.f68857e = i13;
        this.f68858f = primaryButtonText;
        this.f68859g = str;
        this.f68860h = secondaryButtonText;
        this.f68861i = actions;
        this.f68862j = logAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f68853a, gVar.f68853a) && Intrinsics.d(this.f68854b, gVar.f68854b) && Intrinsics.d(this.f68855c, gVar.f68855c) && Intrinsics.d(this.f68856d, gVar.f68856d) && this.f68857e == gVar.f68857e && Intrinsics.d(this.f68858f, gVar.f68858f) && Intrinsics.d(this.f68859g, gVar.f68859g) && Intrinsics.d(this.f68860h, gVar.f68860h) && Intrinsics.d(this.f68861i, gVar.f68861i) && Intrinsics.d(this.f68862j, gVar.f68862j);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f68858f, ep.b.b(this.f68857e, cb.d(this.f68856d, cb.d(this.f68855c, cb.d(this.f68854b, this.f68853a.hashCode() * 31, 31), 31), 31), 31), 31);
        String str = this.f68859g;
        return this.f68862j.hashCode() + d7.g.c(this.f68861i, cb.d(this.f68860h, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "NewsCardState(title=" + this.f68853a + ", message=" + this.f68854b + ", experienceId=" + this.f68855c + ", placementId=" + this.f68856d + ", carouselPosition=" + this.f68857e + ", primaryButtonText=" + this.f68858f + ", primaryButtonUrl=" + this.f68859g + ", secondaryButtonText=" + this.f68860h + ", actions=" + this.f68861i + ", logAction=" + this.f68862j + ")";
    }
}
