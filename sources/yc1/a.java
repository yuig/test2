package yc1;

import a.cb;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final View f138697a;

    /* renamed from: b, reason: collision with root package name */
    public final String f138698b;

    /* renamed from: c, reason: collision with root package name */
    public final String f138699c;

    public a(View anchorView, String descriptionText, String actionButtonText) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        this.f138697a = anchorView;
        this.f138698b = descriptionText;
        this.f138699c = actionButtonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f138697a, aVar.f138697a) && Intrinsics.d(this.f138698b, aVar.f138698b) && Intrinsics.d(this.f138699c, aVar.f138699c);
    }

    public final int hashCode() {
        return this.f138699c.hashCode() + cb.d(this.f138698b, this.f138697a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SettingsEducationStep(anchorView=");
        sb3.append(this.f138697a);
        sb3.append(", descriptionText=");
        sb3.append(this.f138698b);
        sb3.append(", actionButtonText=");
        return a.a.p(sb3, this.f138699c, ")");
    }
}
