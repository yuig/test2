package pk;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class x extends d {

    /* renamed from: f, reason: collision with root package name */
    public transient int f100515f;

    public x() {
        super(f0.b(12));
        a0.C(3, "expectedValuesPerKey");
        this.f100515f = 3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f100515f = 3;
        int l03 = kh2.c3.l0(objectInputStream);
        l(f0.a());
        kh2.c3.k0(this, objectInputStream, l03);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        kh2.c3.w0(this, objectOutputStream);
    }

    @Override // pk.d
    public final Collection h() {
        return new ArrayList(this.f100515f);
    }
}
