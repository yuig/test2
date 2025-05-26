package d0;

import android.util.Size;
import c0.k1;
import c0.q0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public k1 f53492b;

    /* renamed from: d, reason: collision with root package name */
    public final Size f53494d;

    /* renamed from: e, reason: collision with root package name */
    public final int f53495e;

    /* renamed from: f, reason: collision with root package name */
    public final int f53496f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f53497g;

    /* renamed from: h, reason: collision with root package name */
    public final Size f53498h;

    /* renamed from: i, reason: collision with root package name */
    public final int f53499i;

    /* renamed from: j, reason: collision with root package name */
    public final l0.j f53500j;

    /* renamed from: k, reason: collision with root package name */
    public final l0.j f53501k;

    /* renamed from: a, reason: collision with root package name */
    public androidx.camera.core.impl.n f53491a = new q0(this, 2);

    /* renamed from: c, reason: collision with root package name */
    public final k1 f53493c = null;

    public b(Size size, int i13, int i14, boolean z13, l0.j jVar, l0.j jVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f53494d = size;
        this.f53495e = i13;
        this.f53496f = i14;
        this.f53497g = z13;
        this.f53498h = null;
        this.f53499i = 35;
        this.f53500j = jVar;
        this.f53501k = jVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f53494d.equals(bVar.f53494d) && this.f53495e == bVar.f53495e && this.f53496f == bVar.f53496f && this.f53497g == bVar.f53497g) {
            Size size = bVar.f53498h;
            Size size2 = this.f53498h;
            if (size2 != null ? size2.equals(size) : size == null) {
                if (this.f53499i == bVar.f53499i && this.f53500j.equals(bVar.f53500j) && this.f53501k.equals(bVar.f53501k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f53494d.hashCode() ^ 1000003) * 1000003) ^ this.f53495e) * 1000003) ^ this.f53496f) * 1000003) ^ (this.f53497g ? 1231 : 1237)) * (-721379959);
        Size size = this.f53498h;
        return ((((((hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003) ^ this.f53499i) * 1000003) ^ this.f53500j.hashCode()) * 1000003) ^ this.f53501k.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f53494d + ", inputFormat=" + this.f53495e + ", outputFormat=" + this.f53496f + ", virtualCamera=" + this.f53497g + ", imageReaderProxyProvider=null, postviewSize=" + this.f53498h + ", postviewImageFormat=" + this.f53499i + ", requestEdge=" + this.f53500j + ", errorEdge=" + this.f53501k + "}";
    }
}
