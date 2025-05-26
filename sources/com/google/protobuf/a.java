package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a implements n1 {
    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    public static UninitializedMessageException newUninitializedMessageException(o1 o1Var) {
        return new UninitializedMessageException();
    }

    public final String a() {
        return "Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).";
    }

    public abstract a internalMergeFrom(b bVar);

    public boolean mergeDelimitedFrom(InputStream inputStream, y yVar) {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        m98mergeFrom((InputStream) new mc.f(p.t(read, inputStream), inputStream), yVar);
        return true;
    }

    /* renamed from: mergeFrom */
    public abstract a m106mergeFrom(p pVar, y yVar);

    /* renamed from: mergeFrom */
    public abstract a m107mergeFrom(byte[] bArr, int i13, int i14);

    /* renamed from: mergeFrom */
    public abstract a m108mergeFrom(byte[] bArr, int i13, int i14, y yVar);

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = w0.f34008a;
        iterable.getClass();
        if (iterable instanceof z0) {
            List h10 = ((z0) iterable).h();
            z0 z0Var = (z0) list;
            int size = list.size();
            for (Object obj : h10) {
                if (obj == null) {
                    String str = "Element at index " + (z0Var.size() - size) + " is null.";
                    for (int size2 = z0Var.size() - 1; size2 >= size; size2--) {
                        z0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof l) {
                    z0Var.K((l) obj);
                } else {
                    z0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof x1) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t13 : iterable) {
            if (t13 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(t13);
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, y.a());
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public a m96mergeFrom(p pVar) {
        return m106mergeFrom(pVar, y.a());
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public a m93mergeFrom(l lVar) {
        try {
            p j13 = lVar.j();
            m96mergeFrom(j13);
            j13.a(0);
            return this;
        } catch (InvalidProtocolBufferException e13) {
            throw e13;
        } catch (IOException e14) {
            throw new RuntimeException(a(), e14);
        }
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public a m94mergeFrom(l lVar, y yVar) {
        try {
            p j13 = lVar.j();
            m106mergeFrom(j13, yVar);
            j13.a(0);
            return this;
        } catch (InvalidProtocolBufferException e13) {
            throw e13;
        } catch (IOException e14) {
            throw new RuntimeException(a(), e14);
        }
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public a m99mergeFrom(byte[] bArr) {
        return m107mergeFrom(bArr, 0, bArr.length);
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public a m100mergeFrom(byte[] bArr, y yVar) {
        return m108mergeFrom(bArr, 0, bArr.length, yVar);
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public a m97mergeFrom(InputStream inputStream) {
        p g13 = p.g(inputStream);
        m96mergeFrom(g13);
        g13.a(0);
        return this;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public a m98mergeFrom(InputStream inputStream, y yVar) {
        p g13 = p.g(inputStream);
        m106mergeFrom(g13, yVar);
        g13.a(0);
        return this;
    }

    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public a m95mergeFrom(o1 o1Var) {
        if (getDefaultInstanceForType().getClass().isInstance(o1Var)) {
            return internalMergeFrom((b) o1Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
