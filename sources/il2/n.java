package il2;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import q5.y0;

/* loaded from: classes4.dex */
public final class n implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public String f72580a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f72581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f72582c;

    public n(y0 y0Var) {
        this.f72582c = y0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f72580a == null && !this.f72581b) {
            String readLine = ((BufferedReader) this.f72582c.f102541b).readLine();
            this.f72580a = readLine;
            if (readLine == null) {
                this.f72581b = true;
            }
        }
        return this.f72580a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f72580a;
        this.f72580a = null;
        Intrinsics.f(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
