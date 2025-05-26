package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class b implements o1 {
    protected int memoizedHashCode;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        a.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(l lVar) {
        if (!lVar.i()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(d2 d2Var);

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = u.f34000q;
            s sVar = new s(bArr, serializedSize);
            writeTo(sVar);
            if (sVar.H() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e13) {
            throw new RuntimeException(a("byte array"), e13);
        }
    }

    public l toByteString() {
        try {
            int serializedSize = getSerializedSize();
            j jVar = l.f33922b;
            bh.b bVar = new bh.b(serializedSize, (a.c) null);
            writeTo(bVar.k());
            return bVar.a();
        } catch (IOException e13) {
            throw new RuntimeException(a("ByteString"), e13);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int D = u.D(serializedSize) + serializedSize;
        if (D > 4096) {
            D = 4096;
        }
        t tVar = new t(outputStream, D);
        tVar.Z(serializedSize);
        writeTo(tVar);
        tVar.i0();
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = u.f34000q;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        t tVar = new t(outputStream, serializedSize);
        writeTo(tVar);
        tVar.i0();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        a.addAll((Iterable) iterable, (List) list);
    }
}
