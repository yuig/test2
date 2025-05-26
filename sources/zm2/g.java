package zm2;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes2.dex */
public abstract class g implements Iterable {

    /* renamed from: a */
    public static final z f142207a = new z(new byte[0]);

    public static g b(Iterator it, int i13) {
        if (i13 == 1) {
            return (g) it.next();
        }
        int i14 = i13 >>> 1;
        return b(it, i14).c(b(it, i13 - i14));
    }

    public static f l() {
        return new f();
    }

    public final g c(g gVar) {
        int size = size();
        int size2 = gVar.size();
        if (size + size2 >= 2147483647L) {
            StringBuilder sb3 = new StringBuilder(53);
            sb3.append("ByteString would be too long: ");
            sb3.append(size);
            sb3.append("+");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        int[] iArr = d0.f142184h;
        d0 d0Var = this instanceof d0 ? (d0) this : null;
        if (gVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return gVar;
        }
        int size3 = gVar.size() + size();
        if (size3 < 128) {
            return d0.w(this, gVar);
        }
        if (d0Var != null) {
            g gVar2 = d0Var.f142187d;
            if (gVar.size() + gVar2.size() < 128) {
                return new d0(d0Var.f142186c, d0.w(gVar2, gVar));
            }
        }
        if (d0Var != null) {
            g gVar3 = d0Var.f142186c;
            int f13 = gVar3.f();
            g gVar4 = d0Var.f142187d;
            if (f13 > gVar4.f() && d0Var.f() > gVar.f()) {
                return new d0(gVar3, new d0(gVar4, gVar));
            }
        }
        if (size3 >= d0.f142184h[Math.max(f(), gVar.f()) + 1]) {
            return new d0(this, gVar);
        }
        t72.j jVar = new t72.j();
        jVar.i(this);
        jVar.i(gVar);
        g gVar5 = (g) ((Stack) jVar.f116663b).pop();
        while (!((Stack) jVar.f116663b).isEmpty()) {
            gVar5 = new d0((g) ((Stack) jVar.f116663b).pop(), gVar5);
        }
        return gVar5;
    }

    public final void d(int i13, int i14, int i15, byte[] bArr) {
        if (i13 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Source offset < 0: ");
            sb3.append(i13);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i14 < 0) {
            StringBuilder sb4 = new StringBuilder(30);
            sb4.append("Target offset < 0: ");
            sb4.append(i14);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        if (i15 < 0) {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i15);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i16 = i13 + i15;
        if (i16 > size()) {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Source end offset < 0: ");
            sb6.append(i16);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
        int i17 = i14 + i15;
        if (i17 <= bArr.length) {
            if (i15 > 0) {
                e(i13, i14, i15, bArr);
            }
        } else {
            StringBuilder sb7 = new StringBuilder(34);
            sb7.append("Target end offset < 0: ");
            sb7.append(i17);
            throw new IndexOutOfBoundsException(sb7.toString());
        }
    }

    public abstract void e(int i13, int i14, int i15, byte[] bArr);

    public abstract int f();

    public abstract boolean i();

    public abstract boolean j();

    public abstract int n(int i13, int i14, int i15);

    public abstract int p(int i13, int i14, int i15);

    public abstract int r();

    public abstract String s();

    public abstract int size();

    public final String t() {
        try {
            return s();
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException("UTF-8 not supported?", e13);
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public final void u(OutputStream outputStream, int i13, int i14) {
        if (i13 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Source offset < 0: ");
            sb3.append(i13);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i14 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i14);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i15 = i13 + i14;
        if (i15 <= size()) {
            if (i14 > 0) {
                v(outputStream, i13, i14);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(39);
            sb5.append("Source end offset exceeded: ");
            sb5.append(i15);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void v(OutputStream outputStream, int i13, int i14);
}
