package gi;

/* loaded from: classes3.dex */
public final class x extends z {

    /* renamed from: c, reason: collision with root package name */
    public final transient z f65128c;

    public x(z zVar) {
        this.f65128c = zVar;
    }

    @Override // gi.z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f65128c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i13) {
        z zVar = this.f65128c;
        kh2.b0.e2(i13, zVar.size());
        return zVar.get((zVar.size() - 1) - i13);
    }

    @Override // gi.z
    public final z i() {
        return this.f65128c;
    }

    @Override // gi.z, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f65128c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // gi.z, java.util.List
    /* renamed from: j */
    public final z subList(int i13, int i14) {
        z zVar = this.f65128c;
        kh2.b0.g2(i13, i14, zVar.size());
        return zVar.subList(zVar.size() - i14, zVar.size() - i13).i();
    }

    @Override // gi.z, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f65128c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f65128c.size();
    }
}
