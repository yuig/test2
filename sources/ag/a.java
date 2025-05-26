package ag;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class a extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final f f15080d;

    /* renamed from: b, reason: collision with root package name */
    public float f15081b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f15082c = 0.0f;

    static {
        f a13 = f.a(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, new a());
        f15080d = a13;
        a13.f15096f = 0.5f;
    }

    @Override // ag.e
    public final e a() {
        return new a();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15081b == aVar.f15081b && this.f15082c == aVar.f15082c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15081b) ^ Float.floatToIntBits(this.f15082c);
    }

    public final String toString() {
        return this.f15081b + "x" + this.f15082c;
    }
}
