package re1;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a */
    public final String f107573a;

    /* renamed from: b */
    public final z32.o f107574b;

    /* renamed from: c */
    public final z32.l f107575c;

    /* renamed from: d */
    public final Function0 f107576d;

    /* renamed from: e */
    public final Function0 f107577e;

    /* renamed from: f */
    public final String f107578f;

    /* renamed from: g */
    public final HashMap f107579g;

    public e(String str, z32.o actionButtonStyle, z32.l actionLocation, Function0 navigateToFeed, Function0 renderActionButton, String str2, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(actionButtonStyle, "actionButtonStyle");
        Intrinsics.checkNotNullParameter(actionLocation, "actionLocation");
        Intrinsics.checkNotNullParameter(navigateToFeed, "navigateToFeed");
        Intrinsics.checkNotNullParameter(renderActionButton, "renderActionButton");
        this.f107573a = str;
        this.f107574b = actionButtonStyle;
        this.f107575c = actionLocation;
        this.f107576d = navigateToFeed;
        this.f107577e = renderActionButton;
        this.f107578f = str2;
        this.f107579g = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f107573a, eVar.f107573a) && this.f107574b == eVar.f107574b && this.f107575c == eVar.f107575c && Intrinsics.d(this.f107576d, eVar.f107576d) && Intrinsics.d(this.f107577e, eVar.f107577e) && Intrinsics.d(this.f107578f, eVar.f107578f) && Intrinsics.d(this.f107579g, eVar.f107579g);
    }

    public final int hashCode() {
        String str = this.f107573a;
        int b13 = d7.g.b(this.f107577e, d7.g.b(this.f107576d, (this.f107575c.hashCode() + ((this.f107574b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31), 31);
        String str2 = this.f107578f;
        int hashCode = (b13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HashMap hashMap = this.f107579g;
        return hashCode + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        return "StructuredFeedActionModel(actionText=" + this.f107573a + ", actionButtonStyle=" + this.f107574b + ", actionLocation=" + this.f107575c + ", navigateToFeed=" + this.f107576d + ", renderActionButton=" + this.f107577e + ", endCardTitle=" + this.f107578f + ", endCardImages=" + this.f107579g + ")";
    }
}
