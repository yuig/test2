package yj;

import android.graphics.Typeface;
import me.o;

/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: p, reason: collision with root package name */
    public final Typeface f139182p;

    /* renamed from: q, reason: collision with root package name */
    public final a f139183q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f139184r;

    public b(a aVar, Typeface typeface) {
        this.f139182p = typeface;
        this.f139183q = aVar;
    }

    @Override // me.o
    public final void d(int i13) {
        if (this.f139184r) {
            return;
        }
        this.f139183q.b(this.f139182p);
    }

    @Override // me.o
    public final void e(Typeface typeface, boolean z13) {
        if (this.f139184r) {
            return;
        }
        this.f139183q.b(typeface);
    }
}
