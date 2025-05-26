package w21;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements v {

    /* renamed from: a, reason: collision with root package name */
    public final String f127795a;

    /* renamed from: b, reason: collision with root package name */
    public final String f127796b;

    /* renamed from: c, reason: collision with root package name */
    public final String f127797c;

    /* renamed from: d, reason: collision with root package name */
    public final List f127798d;

    public s(String title, String revealRewardTitle, String revealRewardSubtitle, ArrayList chosenAnswers) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(revealRewardTitle, "revealRewardTitle");
        Intrinsics.checkNotNullParameter(revealRewardSubtitle, "revealRewardSubtitle");
        Intrinsics.checkNotNullParameter(chosenAnswers, "chosenAnswers");
        this.f127795a = title;
        this.f127796b = revealRewardTitle;
        this.f127797c = revealRewardSubtitle;
        this.f127798d = chosenAnswers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f127795a, sVar.f127795a) && Intrinsics.d(this.f127796b, sVar.f127796b) && Intrinsics.d(this.f127797c, sVar.f127797c) && Intrinsics.d(this.f127798d, sVar.f127798d);
    }

    public final int hashCode() {
        return this.f127798d.hashCode() + cb.d(this.f127797c, cb.d(this.f127796b, this.f127795a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MoveToPreview(title=");
        sb3.append(this.f127795a);
        sb3.append(", revealRewardTitle=");
        sb3.append(this.f127796b);
        sb3.append(", revealRewardSubtitle=");
        sb3.append(this.f127797c);
        sb3.append(", chosenAnswers=");
        return a.c.j(sb3, this.f127798d, ")");
    }
}
