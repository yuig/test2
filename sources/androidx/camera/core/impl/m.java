package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Size f16907a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16908b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f16909c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f16910d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f16911e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f16912f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f16913g;

    public m(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f16907a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f16908b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f16909c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f16910d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f16911e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f16912f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f16913g = map4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f16907a.equals(mVar.f16907a) && this.f16908b.equals(mVar.f16908b) && this.f16909c.equals(mVar.f16909c) && this.f16910d.equals(mVar.f16910d) && this.f16911e.equals(mVar.f16911e) && this.f16912f.equals(mVar.f16912f) && this.f16913g.equals(mVar.f16913g);
    }

    public final int hashCode() {
        return ((((((((((((this.f16907a.hashCode() ^ 1000003) * 1000003) ^ this.f16908b.hashCode()) * 1000003) ^ this.f16909c.hashCode()) * 1000003) ^ this.f16910d.hashCode()) * 1000003) ^ this.f16911e.hashCode()) * 1000003) ^ this.f16912f.hashCode()) * 1000003) ^ this.f16913g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f16907a + ", s720pSizeMap=" + this.f16908b + ", previewSize=" + this.f16909c + ", s1440pSizeMap=" + this.f16910d + ", recordSize=" + this.f16911e + ", maximumSizeMap=" + this.f16912f + ", ultraMaximumSizeMap=" + this.f16913g + "}";
    }
}
