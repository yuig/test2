package ql2;

import java.util.NoSuchElementException;
import kotlin.collections.v0;

/* loaded from: classes4.dex */
public final class o extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f104115a;

    /* renamed from: b, reason: collision with root package name */
    public final long f104116b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f104117c;

    /* renamed from: d, reason: collision with root package name */
    public long f104118d;

    public o(long j13, long j14, long j15) {
        this.f104115a = j15;
        this.f104116b = j14;
        boolean z13 = true;
        if (j15 <= 0 ? j13 < j14 : j13 > j14) {
            z13 = false;
        }
        this.f104117c = z13;
        this.f104118d = z13 ? j13 : j14;
    }

    @Override // kotlin.collections.v0
    public final long b() {
        long j13 = this.f104118d;
        if (j13 != this.f104116b) {
            this.f104118d = this.f104115a + j13;
        } else {
            if (!this.f104117c) {
                throw new NoSuchElementException();
            }
            this.f104117c = false;
        }
        return j13;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f104117c;
    }
}
