package ql2;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class b implements Iterable, ll2.a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f104094d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final char f104095a;

    /* renamed from: b, reason: collision with root package name */
    public final char f104096b;

    /* renamed from: c, reason: collision with root package name */
    public final int f104097c = 1;

    public b(char c13, char c14) {
        this.f104095a = c13;
        this.f104096b = (char) ue.c.u(c13, c14, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f104095a, this.f104096b, this.f104097c);
    }
}
