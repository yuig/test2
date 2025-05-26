package yk2;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class n implements Externalizable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final m f139267b = new m(null);

    /* renamed from: a, reason: collision with root package name */
    public Map f139268a;

    public n(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f139268a = map;
    }

    private final Object readResolve() {
        return this.f139268a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(a.a.d("Unsupported flags value: ", readByte));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        g builder = new g(readInt);
        for (int i13 = 0; i13 < readInt; i13++) {
            builder.put(input.readObject(), input.readObject());
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f139268a = builder.c();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(0);
        output.writeInt(this.f139268a.size());
        for (Map.Entry entry : this.f139268a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public n() {
        this(z0.d());
    }
}
