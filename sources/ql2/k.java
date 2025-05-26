package ql2;

import java.util.NoSuchElementException;
import kotlin.collections.u0;

/* loaded from: classes2.dex */
public final class k extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f104107a;

    /* renamed from: b, reason: collision with root package name */
    public final int f104108b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f104109c;

    /* renamed from: d, reason: collision with root package name */
    public int f104110d;

    public k(int i13, int i14, int i15) {
        this.f104107a = i15;
        this.f104108b = i14;
        boolean z13 = true;
        if (i15 <= 0 ? i13 < i14 : i13 > i14) {
            z13 = false;
        }
        this.f104109c = z13;
        this.f104110d = z13 ? i13 : i14;
    }

    @Override // kotlin.collections.u0
    public final int b() {
        int i13 = this.f104110d;
        if (i13 != this.f104108b) {
            this.f104110d = this.f104107a + i13;
        } else {
            if (!this.f104109c) {
                throw new NoSuchElementException();
            }
            this.f104109c = false;
        }
        return i13;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f104109c;
    }
}
