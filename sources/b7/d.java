package b7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import pk.c1;
import pk.v2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f22033a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22034b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f22035c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f22036d;

    public d(v2 v2Var) {
        this.f22033a = v2Var;
        e eVar = e.f22037e;
        this.f22036d = false;
    }

    public final e a(e eVar) {
        if (eVar.equals(e.f22037e)) {
            throw new AudioProcessor$UnhandledAudioFormatException(eVar);
        }
        int i13 = 0;
        while (true) {
            c1 c1Var = this.f22033a;
            if (i13 >= c1Var.size()) {
                return eVar;
            }
            f fVar = (f) c1Var.get(i13);
            e g13 = fVar.g(eVar);
            if (fVar.isActive()) {
                bf.b.t(!g13.equals(e.f22037e));
                eVar = g13;
            }
            i13++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f22034b;
        arrayList.clear();
        this.f22036d = false;
        int i13 = 0;
        while (true) {
            c1 c1Var = this.f22033a;
            if (i13 >= c1Var.size()) {
                break;
            }
            f fVar = (f) c1Var.get(i13);
            fVar.flush();
            if (fVar.isActive()) {
                arrayList.add(fVar);
            }
            i13++;
        }
        this.f22035c = new ByteBuffer[arrayList.size()];
        for (int i14 = 0; i14 <= c(); i14++) {
            this.f22035c[i14] = ((f) arrayList.get(i14)).e();
        }
    }

    public final int c() {
        return this.f22035c.length - 1;
    }

    public final ByteBuffer d() {
        if (!f()) {
            return f.f22042a;
        }
        ByteBuffer byteBuffer = this.f22035c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(f.f22042a);
        return this.f22035c[c()];
    }

    public final boolean e() {
        return this.f22036d && ((f) this.f22034b.get(c())).i() && !this.f22035c[c()].hasRemaining();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        c1 c1Var = this.f22033a;
        if (c1Var.size() != dVar.f22033a.size()) {
            return false;
        }
        for (int i13 = 0; i13 < c1Var.size(); i13++) {
            if (c1Var.get(i13) != dVar.f22033a.get(i13)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return !this.f22034b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z13;
        do {
            int i13 = 0;
            z13 = false;
            while (i13 <= c()) {
                if (!this.f22035c[i13].hasRemaining()) {
                    ArrayList arrayList = this.f22034b;
                    f fVar = (f) arrayList.get(i13);
                    if (!fVar.i()) {
                        ByteBuffer byteBuffer2 = i13 > 0 ? this.f22035c[i13 - 1] : byteBuffer.hasRemaining() ? byteBuffer : f.f22042a;
                        long remaining = byteBuffer2.remaining();
                        fVar.f(byteBuffer2);
                        this.f22035c[i13] = fVar.e();
                        z13 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.f22035c[i13].hasRemaining();
                    } else if (!this.f22035c[i13].hasRemaining() && i13 < c()) {
                        ((f) arrayList.get(i13 + 1)).h();
                    }
                }
                i13++;
            }
        } while (z13);
    }

    public final void h() {
        if (!f() || this.f22036d) {
            return;
        }
        this.f22036d = true;
        ((f) this.f22034b.get(0)).h();
    }

    public final int hashCode() {
        return this.f22033a.hashCode();
    }

    public final void i(ByteBuffer byteBuffer) {
        if (!f() || this.f22036d) {
            return;
        }
        g(byteBuffer);
    }

    public final void j() {
        int i13 = 0;
        while (true) {
            c1 c1Var = this.f22033a;
            if (i13 >= c1Var.size()) {
                this.f22035c = new ByteBuffer[0];
                e eVar = e.f22037e;
                this.f22036d = false;
                return;
            } else {
                f fVar = (f) c1Var.get(i13);
                fVar.flush();
                fVar.d();
                i13++;
            }
        }
    }
}
