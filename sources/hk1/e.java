package hk1;

import com.pinterest.api.model.f30;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f69344a;

    /* renamed from: b, reason: collision with root package name */
    public final n f69345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69346c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f69347d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f69348e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f69349f;

    public e(f30 pin, n viewBasedConstructorArgs, String str, boolean z13, Integer num, i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(viewBasedConstructorArgs, "viewBasedConstructorArgs");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f69344a = pin;
        this.f69345b = viewBasedConstructorArgs;
        this.f69346c = str;
        this.f69347d = z13;
        this.f69348e = num;
        this.f69349f = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f69344a, eVar.f69344a) && Intrinsics.d(this.f69345b, eVar.f69345b) && Intrinsics.d(this.f69346c, eVar.f69346c) && this.f69347d == eVar.f69347d && Intrinsics.d(this.f69348e, eVar.f69348e) && Intrinsics.d(this.f69349f, eVar.f69349f);
    }

    public final int hashCode() {
        int hashCode = (this.f69345b.hashCode() + (this.f69344a.hashCode() * 31)) * 31;
        String str = this.f69346c;
        int e13 = ep.b.e(this.f69347d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.f69348e;
        return this.f69349f.hashCode() + ((e13 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OpenOverflowMenuModal(pin=" + this.f69344a + ", viewBasedConstructorArgs=" + this.f69345b + ", uniqueScreenKey=" + this.f69346c + ", isHideSupported=" + this.f69347d + ", overflowMenuTitle=" + this.f69348e + ", pinalyticsContext=" + this.f69349f + ")";
    }
}
