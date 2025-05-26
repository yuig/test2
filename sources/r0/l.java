package r0;

import android.util.Range;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public sp2.i f105595a;

    /* renamed from: b, reason: collision with root package name */
    public Range f105596b;

    /* renamed from: c, reason: collision with root package name */
    public Range f105597c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f105598d;

    public final m a() {
        String str = this.f105595a == null ? " qualitySelector" : "";
        if (this.f105596b == null) {
            str = str.concat(" frameRate");
        }
        if (this.f105597c == null) {
            str = a.a.C(str, " bitrate");
        }
        if (this.f105598d == null) {
            str = a.a.C(str, " aspectRatio");
        }
        if (str.isEmpty()) {
            return new m(this.f105595a, this.f105596b, this.f105597c, this.f105598d.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
