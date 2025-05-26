package qa2;

import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f103324a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103325b;

    /* renamed from: c, reason: collision with root package name */
    public final int f103326c;

    /* renamed from: d, reason: collision with root package name */
    public final int f103327d;

    /* renamed from: e, reason: collision with root package name */
    public final int f103328e;

    public n1(Rect rect, int i13, int i14, int i15, int i16) {
        this.f103324a = rect;
        this.f103325b = i13;
        this.f103326c = i14;
        this.f103327d = i15;
        this.f103328e = i16;
    }

    public final /* synthetic */ Object[] a() {
        return new Object[]{this.f103324a, Integer.valueOf(this.f103325b), Integer.valueOf(this.f103326c), Integer.valueOf(this.f103327d), Integer.valueOf(this.f103328e)};
    }

    public final boolean equals(Object obj) {
        if (obj != null && n1.class == obj.getClass()) {
            return Arrays.equals(a(), ((n1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return n1.class.hashCode() + (Arrays.hashCode(a()) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Rect[");
        Rect rect = this.f103324a;
        sb3.append(rect.left);
        sb3.append(",");
        sb3.append(rect.top);
        sb3.append(",");
        sb3.append(rect.right);
        sb3.append(",");
        sb3.append(rect.bottom);
        sb3.append("] index[");
        sb3.append(this.f103325b);
        sb3.append("] col[");
        sb3.append(this.f103326c);
        sb3.append("] span[");
        sb3.append(this.f103327d);
        sb3.append("] padding[");
        return a.a.n(sb3, this.f103328e, "]");
    }
}
