package pk;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import oi.u6;

/* loaded from: classes3.dex */
public abstract class q1 extends l1 {

    /* renamed from: f, reason: collision with root package name */
    public final transient o1 f100473f;

    public q1(a3 a3Var, int i13, Comparator comparator) {
        super(a3Var, i13);
        o1 v13;
        if (comparator == null) {
            int i14 = o1.f100461c;
            v13 = b3.f100362j;
        } else {
            v13 = t1.v(comparator);
        }
        this.f100473f = v13;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        Object v13;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a.a.d("Invalid key count ", readInt));
        }
        d7.b0 a13 = h1.a();
        int i13 = 0;
        for (int i14 = 0; i14 < readInt; i14++) {
            Object readObject = objectInputStream.readObject();
            Objects.requireNonNull(readObject);
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(a.a.d("Invalid value count ", readInt2));
            }
            m1 m1Var = comparator == null ? new m1(4) : new r1(comparator);
            for (int i15 = 0; i15 < readInt2; i15++) {
                Object readObject2 = objectInputStream.readObject();
                Objects.requireNonNull(readObject2);
                m1Var.a(readObject2);
            }
            o1 m13 = m1Var.m();
            if (m13.size() != readInt2) {
                throw new InvalidObjectException(a.a.i("Duplicate key-value pairs exist for key ", readObject));
            }
            a13.e(readObject, m13);
            i13 += readInt2;
        }
        try {
            k1.f100441a.n(this, a13.a());
            u6 u6Var = k1.f100442b;
            u6Var.getClass();
            try {
                ((Field) u6Var.f95225b).set(this, Integer.valueOf(i13));
                u6 u6Var2 = p1.f100465a;
                if (comparator == null) {
                    int i16 = o1.f100461c;
                    v13 = b3.f100362j;
                } else {
                    v13 = t1.v(comparator);
                }
                u6Var2.n(this, v13);
            } catch (IllegalAccessException e13) {
                throw new AssertionError(e13);
            }
        } catch (IllegalArgumentException e14) {
            throw ((InvalidObjectException) new InvalidObjectException(e14.getMessage()).initCause(e14));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        o1 o1Var = this.f100473f;
        objectOutputStream.writeObject(o1Var instanceof t1 ? ((t1) o1Var).f100485d : null);
        kh2.c3.w0(this, objectOutputStream);
    }

    @Override // pk.l2
    public final Collection get(Object obj) {
        return (o1) kh2.b0.h0((o1) this.f100447d.get(obj), this.f100473f);
    }
}
