package pk;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Objects;
import oi.u6;

/* loaded from: classes3.dex */
public class e1 extends l1 {
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
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
            x0 n13 = c1.n();
            for (int i15 = 0; i15 < readInt2; i15++) {
                Object readObject2 = objectInputStream.readObject();
                Objects.requireNonNull(readObject2);
                n13.e(readObject2);
            }
            a13.e(readObject, n13.i());
            i13 += readInt2;
        }
        try {
            k1.f100441a.n(this, a13.a());
            u6 u6Var = k1.f100442b;
            u6Var.getClass();
            try {
                ((Field) u6Var.f95225b).set(this, Integer.valueOf(i13));
            } catch (IllegalAccessException e13) {
                throw new AssertionError(e13);
            }
        } catch (IllegalArgumentException e14) {
            throw ((InvalidObjectException) new InvalidObjectException(e14.getMessage()).initCause(e14));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        kh2.c3.w0(this, objectOutputStream);
    }

    @Override // pk.l2
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final c1 get(Object obj) {
        c1 c1Var = (c1) this.f100447d.get(obj);
        if (c1Var != null) {
            return c1Var;
        }
        y0 y0Var = c1.f100372b;
        return v2.f100502e;
    }
}
