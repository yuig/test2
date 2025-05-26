package o6;

import androidx.gridlayout.widget.GridLayout;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final k f92935e = GridLayout.q(Integer.MIN_VALUE, 1, GridLayout.f18523q, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92936a;

    /* renamed from: b, reason: collision with root package name */
    public final i f92937b;

    /* renamed from: c, reason: collision with root package name */
    public final d f92938c;

    /* renamed from: d, reason: collision with root package name */
    public final float f92939d;

    public k(boolean z13, i iVar, d dVar, float f13) {
        this.f92936a = z13;
        this.f92937b = iVar;
        this.f92938c = dVar;
        this.f92939d = f13;
    }

    public final d a(boolean z13) {
        a aVar = GridLayout.f18523q;
        d dVar = this.f92938c;
        return dVar != aVar ? dVar : this.f92939d == 0.0f ? z13 ? GridLayout.f18526t : GridLayout.f18531y : GridLayout.f18532z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f92938c.equals(kVar.f92938c) && this.f92937b.equals(kVar.f92937b);
    }

    public final int hashCode() {
        return this.f92938c.hashCode() + (this.f92937b.hashCode() * 31);
    }
}
