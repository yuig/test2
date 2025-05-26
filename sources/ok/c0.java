package ok;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class c0 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public String f95414b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f95415c;

    /* renamed from: d, reason: collision with root package name */
    public final p f95416d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f95417e;

    /* renamed from: g, reason: collision with root package name */
    public int f95419g;

    /* renamed from: a, reason: collision with root package name */
    public b f95413a = b.NOT_READY;

    /* renamed from: f, reason: collision with root package name */
    public int f95418f = 0;

    public c0(e0 e0Var, CharSequence charSequence) {
        this.f95416d = e0Var.f95420a;
        this.f95417e = e0Var.f95421b;
        this.f95419g = e0Var.f95423d;
        this.f95415c = charSequence;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        String str;
        int f13;
        CharSequence charSequence;
        p pVar;
        b bVar = this.f95413a;
        b bVar2 = b.FAILED;
        bf.b.v(bVar != bVar2);
        int ordinal = this.f95413a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        this.f95413a = bVar2;
        int i13 = this.f95418f;
        while (true) {
            int i14 = this.f95418f;
            if (i14 == -1) {
                this.f95413a = b.DONE;
                str = null;
                break;
            }
            f13 = f(i14);
            charSequence = this.f95415c;
            if (f13 == -1) {
                f13 = charSequence.length();
                this.f95418f = -1;
            } else {
                this.f95418f = e(f13);
            }
            int i15 = this.f95418f;
            if (i15 == i13) {
                int i16 = i15 + 1;
                this.f95418f = i16;
                if (i16 > charSequence.length()) {
                    this.f95418f = -1;
                }
            } else {
                while (true) {
                    pVar = this.f95416d;
                    if (i13 >= f13 || !pVar.c(charSequence.charAt(i13))) {
                        break;
                    }
                    i13++;
                }
                while (f13 > i13 && pVar.c(charSequence.charAt(f13 - 1))) {
                    f13--;
                }
                if (!this.f95417e || i13 != f13) {
                    break;
                }
                i13 = this.f95418f;
            }
        }
        int i17 = this.f95419g;
        if (i17 == 1) {
            f13 = charSequence.length();
            this.f95418f = -1;
            while (f13 > i13 && pVar.c(charSequence.charAt(f13 - 1))) {
                f13--;
            }
        } else {
            this.f95419g = i17 - 1;
        }
        str = charSequence.subSequence(i13, f13).toString();
        this.f95414b = str;
        if (this.f95413a == b.DONE) {
            return false;
        }
        this.f95413a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f95413a = b.NOT_READY;
        String str = this.f95414b;
        this.f95414b = null;
        return str;
    }

    public final void d() {
        throw new UnsupportedOperationException();
    }

    public abstract int e(int i13);

    public abstract int f(int i13);

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        d();
        throw null;
    }
}
