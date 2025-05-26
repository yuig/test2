package gv1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f66161a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66162b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66163c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66164d;

    public a(String event, String source, String str, String str2) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f66161a = event;
        this.f66162b = source;
        this.f66163c = str;
        this.f66164d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f66161a, aVar.f66161a) && Intrinsics.d(this.f66162b, aVar.f66162b) && Intrinsics.d(this.f66163c, aVar.f66163c) && Intrinsics.d(this.f66164d, aVar.f66164d);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f66162b, this.f66161a.hashCode() * 31, 31);
        String str = this.f66163c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f66164d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NotifHoldoutData(event=");
        sb3.append(this.f66161a);
        sb3.append(", source=");
        sb3.append(this.f66162b);
        sb3.append(", expName=");
        sb3.append(this.f66163c);
        sb3.append(", expGroup=");
        return a.a.p(sb3, this.f66164d, ")");
    }

    public /* synthetic */ a(String str) {
        this("in_notifications_older_holdout_group", str, null, null);
    }
}
