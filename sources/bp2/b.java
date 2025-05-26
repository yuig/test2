package bp2;

import java.io.Serializable;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class b extends Writer implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f23674a;

    public b() {
        this.f23674a = new StringBuilder();
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c13) {
        this.f23674a.append(c13);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.f23674a.toString();
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f23674a.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c13) {
        this.f23674a.append(c13);
        return this;
    }

    public b(int i13) {
        this.f23674a = new StringBuilder(4);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f23674a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i13, int i14) {
        if (cArr != null) {
            this.f23674a.append(cArr, i13, i14);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f23674a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i13, int i14) {
        this.f23674a.append(charSequence, i13, i14);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i13, int i14) {
        this.f23674a.append(charSequence, i13, i14);
        return this;
    }
}
