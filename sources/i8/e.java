package i8;

import android.net.Uri;
import androidx.appcompat.app.a1;
import g7.a0;
import g7.f;
import g7.i;
import java.util.Map;
import java.util.Objects;
import lb.l0;

/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f71708a;

    /* renamed from: b, reason: collision with root package name */
    public b f71709b = b.NOT_CREATED;

    /* renamed from: c, reason: collision with root package name */
    public a1 f71710c = null;

    /* renamed from: d, reason: collision with root package name */
    public d f71711d = null;

    public e(f fVar) {
        this.f71708a = fVar;
    }

    @Override // g7.f
    public final void close() {
        if (this.f71709b == b.FIRST_REQUEST) {
            a1 a1Var = this.f71710c;
            Objects.requireNonNull(a1Var);
            if (!a1Var.f15954b) {
                this.f71710c.f15954b = true;
                return;
            }
        }
        b bVar = this.f71709b;
        b bVar2 = b.SECOND_REQUEST;
        f fVar = this.f71708a;
        if (bVar == bVar2) {
            this.f71709b = b.CLOSED;
            fVar.close();
        } else {
            this.f71709b = b.CLOSED;
            fVar.close();
        }
    }

    @Override // g7.f
    public final long d(i iVar) {
        b bVar;
        b bVar2 = this.f71709b;
        b bVar3 = b.STARTING_INITIALIZATION;
        f fVar = this.f71708a;
        if (bVar2 == bVar3) {
            if (iVar.f63791f == 0 && iVar.f63792g > 10000) {
                long d2 = fVar.d(iVar);
                this.f71709b = b.FIRST_REQUEST;
                a1 a1Var = new a1();
                a1Var.f15953a = 0L;
                a1Var.f15954b = false;
                this.f71710c = a1Var;
                return d2;
            }
        } else if (bVar2 == b.FIRST_REQUEST) {
            a1 a1Var2 = this.f71710c;
            Objects.requireNonNull(a1Var2);
            if (a1Var2.f15954b && iVar.f63791f == this.f71710c.f15953a) {
                this.f71709b = b.SECOND_REQUEST;
                this.f71711d = new d(iVar);
                return iVar.f63792g;
            }
        }
        b bVar4 = this.f71709b;
        if (bVar4 != b.NOT_CREATED && bVar4 != (bVar = b.CLOSED)) {
            this.f71709b = bVar;
            l0.H(fVar);
        }
        return fVar.d(iVar);
    }

    @Override // g7.f
    public final Map e() {
        return this.f71708a.e();
    }

    @Override // g7.f
    public final void f(a0 a0Var) {
        this.f71708a.f(a0Var);
    }

    @Override // g7.f
    public final Uri r() {
        return this.f71708a.r();
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        int ordinal = this.f71709b.ordinal();
        f fVar = this.f71708a;
        if (ordinal == 2) {
            int read = fVar.read(bArr, i13, i14);
            if (read > 0) {
                a1 a1Var = this.f71710c;
                Objects.requireNonNull(a1Var);
                a1Var.f15953a += read;
            }
            return read;
        }
        if (ordinal == 3) {
            d dVar = this.f71711d;
            Objects.requireNonNull(dVar);
            int ordinal2 = dVar.f71707c.ordinal();
            if (ordinal2 == 0) {
                bf.b.w(this.f71710c);
                bf.b.w(this.f71711d);
                d dVar2 = this.f71711d;
                i iVar = dVar2.f71705a;
                long j13 = iVar.f63791f + iVar.f63792g;
                long j14 = this.f71710c.f15953a + dVar2.f71706b;
                if (j14 >= j13) {
                    return -1;
                }
                int read2 = fVar.read(bArr, i13, i14);
                if (read2 > 0) {
                    this.f71711d.f71706b += read2;
                } else if (read2 == -1) {
                    this.f71711d.f71707c = c.READING_SECOND_BUFFER;
                    fVar.close();
                    i iVar2 = this.f71711d.f71705a;
                    i d2 = iVar2.d(j14 - iVar2.f63791f);
                    d dVar3 = this.f71711d;
                    fVar.d(d2);
                    dVar3.getClass();
                    return fVar.read(bArr, i13, i14);
                }
                return read2;
            }
            if (ordinal2 == 1) {
                Objects.requireNonNull(this.f71710c);
                long j15 = this.f71711d.f71706b;
                int read3 = fVar.read(bArr, i13, i14);
                if (read3 > 0) {
                    this.f71711d.f71706b += read3;
                }
                return read3;
            }
        }
        return fVar.read(bArr, i13, i14);
    }

    public final void t() {
        if (this.f71709b == b.NOT_CREATED) {
            this.f71709b = b.STARTING_INITIALIZATION;
        }
    }
}
