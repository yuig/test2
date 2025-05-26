package g1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s0 implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63320a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f63321b;

    /* renamed from: c, reason: collision with root package name */
    public final Cloneable f63322c;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f63322c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f63320a;
        Object obj = this.f63322c;
        switch (i13) {
            case 0:
                if (this.f63321b < ((p0) obj).k()) {
                    break;
                }
                break;
            case 1:
                if (this.f63321b < ((byte[]) obj).length) {
                    break;
                }
                break;
            case 2:
                if (this.f63321b < ((int[]) obj).length) {
                    break;
                }
                break;
            case 3:
                if (this.f63321b < ((long[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.f63321b < ((short[]) obj).length) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f63320a;
        Object obj = this.f63322c;
        switch (i13) {
            case 0:
                int i14 = this.f63321b;
                this.f63321b = i14 + 1;
                return ((p0) obj).l(i14);
            case 1:
                int i15 = this.f63321b;
                byte[] bArr = (byte[]) obj;
                if (i15 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f63321b));
                }
                this.f63321b = i15 + 1;
                return new xk2.y(bArr[i15]);
            case 2:
                int i16 = this.f63321b;
                int[] iArr = (int[]) obj;
                if (i16 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f63321b));
                }
                this.f63321b = i16 + 1;
                return new xk2.b0(iArr[i16]);
            case 3:
                int i17 = this.f63321b;
                long[] jArr = (long[]) obj;
                if (i17 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f63321b));
                }
                this.f63321b = i17 + 1;
                return new xk2.e0(jArr[i17]);
            default:
                int i18 = this.f63321b;
                short[] sArr = (short[]) obj;
                if (i18 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f63321b));
                }
                this.f63321b = i18 + 1;
                return new xk2.i0(sArr[i18]);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f63320a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f63322c = array;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f63322c = array;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f63322c = array;
    }

    public s0(p0 p0Var) {
        this.f63322c = p0Var;
    }
}
