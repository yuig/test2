package ql2;

import java.util.NoSuchElementException;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f104098a;

    /* renamed from: b, reason: collision with root package name */
    public final int f104099b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f104100c;

    /* renamed from: d, reason: collision with root package name */
    public int f104101d;

    public c(char c13, char c14, int i13) {
        this.f104098a = i13;
        this.f104099b = c14;
        boolean z13 = true;
        if (i13 <= 0 ? Intrinsics.i(c13, c14) < 0 : Intrinsics.i(c13, c14) > 0) {
            z13 = false;
        }
        this.f104100c = z13;
        this.f104101d = z13 ? c13 : c14;
    }

    @Override // kotlin.collections.d0
    public final char b() {
        int i13 = this.f104101d;
        if (i13 != this.f104099b) {
            this.f104101d = this.f104098a + i13;
        } else {
            if (!this.f104100c) {
                throw new NoSuchElementException();
            }
            this.f104100c = false;
        }
        return (char) i13;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f104100c;
    }
}
