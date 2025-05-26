package r0;

import android.util.Range;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final Range f105604e = new Range(0, Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public static final Range f105605f = new Range(0, Integer.MAX_VALUE);

    /* renamed from: g, reason: collision with root package name */
    public static final sp2.i f105606g;

    /* renamed from: a, reason: collision with root package name */
    public final sp2.i f105607a;

    /* renamed from: b, reason: collision with root package name */
    public final Range f105608b;

    /* renamed from: c, reason: collision with root package name */
    public final Range f105609c;

    /* renamed from: d, reason: collision with root package name */
    public final int f105610d;

    static {
        h hVar = r.f105631c;
        f105606g = sp2.i.L(Arrays.asList(hVar, r.f105630b, r.f105629a), new c(hVar, 1));
    }

    public m(sp2.i iVar, Range range, Range range2, int i13) {
        this.f105607a = iVar;
        this.f105608b = range;
        this.f105609c = range2;
        this.f105610d = i13;
    }

    public static l a() {
        l lVar = new l();
        sp2.i iVar = f105606g;
        if (iVar == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        lVar.f105595a = iVar;
        Range range = f105604e;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        lVar.f105596b = range;
        Range range2 = f105605f;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        lVar.f105597c = range2;
        lVar.f105598d = -1;
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f105607a.equals(mVar.f105607a) && this.f105608b.equals(mVar.f105608b) && this.f105609c.equals(mVar.f105609c) && this.f105610d == mVar.f105610d;
    }

    public final int hashCode() {
        return ((((((this.f105607a.hashCode() ^ 1000003) * 1000003) ^ this.f105608b.hashCode()) * 1000003) ^ this.f105609c.hashCode()) * 1000003) ^ this.f105610d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoSpec{qualitySelector=");
        sb3.append(this.f105607a);
        sb3.append(", frameRate=");
        sb3.append(this.f105608b);
        sb3.append(", bitrate=");
        sb3.append(this.f105609c);
        sb3.append(", aspectRatio=");
        return a.a.n(sb3, this.f105610d, "}");
    }
}
