package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class j extends i {

    /* renamed from: d */
    public final byte[] f18079d;

    public j(byte[] bArr) {
        this.f18077a = 0;
        bArr.getClass();
        this.f18079d = bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public byte b(int i13) {
        return this.f18079d[i13];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || size() != ((i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof j)) {
            return obj.equals(this);
        }
        j jVar = (j) obj;
        int i13 = this.f18077a;
        int i14 = jVar.f18077a;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        int size = size();
        if (size > jVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > jVar.size()) {
            StringBuilder s13 = a.a.s("Ran off end of other: 0, ", size, ", ");
            s13.append(jVar.size());
            throw new IllegalArgumentException(s13.toString());
        }
        int j13 = j() + size;
        int j14 = j();
        int j15 = jVar.j();
        while (j14 < j13) {
            if (this.f18079d[j14] != jVar.f18079d[j15]) {
                return false;
            }
            j14++;
            j15++;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public byte f(int i13) {
        return this.f18079d[i13];
    }

    public int j() {
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public int size() {
        return this.f18079d.length;
    }
}
