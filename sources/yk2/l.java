package yk2;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.e0;
import kotlin.collections.g1;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l implements Externalizable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final k f139264c = new k(null);

    /* renamed from: a, reason: collision with root package name */
    public Collection f139265a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139266b;

    public l(int i13, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f139265a = collection;
        this.f139266b = i13;
    }

    private final Object readResolve() {
        return this.f139265a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        Collection a13;
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        int i13 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i14 = 0;
        if (i13 == 0) {
            b bVar = new b(readInt);
            while (i14 < readInt) {
                bVar.add(input.readObject());
                i14++;
            }
            a13 = e0.a(bVar);
        } else {
            if (i13 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i13 + '.');
            }
            o oVar = new o(new g(readInt));
            while (i14 < readInt) {
                oVar.add(input.readObject());
                i14++;
            }
            a13 = g1.a(oVar);
        }
        this.f139265a = a13;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.f139266b);
        output.writeInt(this.f139265a.size());
        Iterator it = this.f139265a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public l() {
        this(0, q0.f80391a);
    }
}
