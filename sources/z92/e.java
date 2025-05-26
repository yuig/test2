package z92;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rm1.q;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f141428a;

    /* renamed from: b, reason: collision with root package name */
    public final q f141429b;

    /* renamed from: c, reason: collision with root package name */
    public final int f141430c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f141431d;

    /* renamed from: e, reason: collision with root package name */
    public final int f141432e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f141433f;

    /* renamed from: g, reason: collision with root package name */
    public final om1.f f141434g;

    public e(String key, q icon, int i13, Function0 actionHandler, int i14, boolean z13, om1.f style) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f141428a = key;
        this.f141429b = icon;
        this.f141430c = i13;
        this.f141431d = actionHandler;
        this.f141432e = i14;
        this.f141433f = z13;
        this.f141434g = style;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f141428a, eVar.f141428a) && this.f141429b == eVar.f141429b && this.f141430c == eVar.f141430c && this.f141432e == eVar.f141432e && this.f141434g == eVar.f141434g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f141428a, this.f141429b, Integer.valueOf(this.f141430c), Integer.valueOf(this.f141432e), this.f141434g});
    }

    public final String toString() {
        return "ActionableIcon(key=" + this.f141428a + ", icon=" + this.f141429b + ", iconTintColorResId=" + this.f141430c + ", actionHandler=" + this.f141431d + ", contentDescriptionResId=" + this.f141432e + ", enabled=" + this.f141433f + ", style=" + this.f141434g + ")";
    }
}
