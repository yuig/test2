package uz1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f123298a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123299b;

    /* renamed from: c, reason: collision with root package name */
    public final c f123300c;

    /* renamed from: d, reason: collision with root package name */
    public final t f123301d;

    public j(String titleText, String bodyText, b intentData, t contentView) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.f123298a = titleText;
        this.f123299b = bodyText;
        this.f123300c = intentData;
        this.f123301d = contentView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f123298a, jVar.f123298a) && Intrinsics.d(this.f123299b, jVar.f123299b) && Intrinsics.d(this.f123300c, jVar.f123300c) && Intrinsics.d(this.f123301d, jVar.f123301d);
    }

    public final int hashCode() {
        return this.f123301d.hashCode() + ((this.f123300c.hashCode() + cb.d(this.f123299b, this.f123298a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "PushNotificationContent(titleText=" + this.f123298a + ", bodyText=" + this.f123299b + ", intentData=" + this.f123300c + ", contentView=" + this.f123301d + ")";
    }
}
