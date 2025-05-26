package vn2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final m f126336a = new m();

    @Override // vn2.a
    public final int b() {
        return 0;
    }

    @Override // vn2.a
    public final void c(int i13, Object obj) {
        Void value = (Void) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    @Override // vn2.a
    public final /* bridge */ /* synthetic */ Object get(int i13) {
        return null;
    }

    @Override // vn2.a, java.lang.Iterable
    public final Iterator iterator() {
        return new l();
    }
}
