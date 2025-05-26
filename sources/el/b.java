package el;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f59457a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f59458b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f59459c;

    public b() {
        b bVar = a.f59443c;
        this.f59457a = Arrays.copyOf(bVar.f59457a, 10);
        this.f59458b = Arrays.copyOf(bVar.f59458b, 10);
        this.f59459c = Arrays.copyOf(bVar.f59459c, 10);
    }

    public final void a(b bVar, int i13) {
        a.v(i13, this.f59457a, bVar.f59457a);
        a.v(i13, this.f59458b, bVar.f59458b);
        a.v(i13, this.f59459c, bVar.f59459c);
    }

    public void b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public b(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f59457a = jArr;
        this.f59458b = jArr2;
        this.f59459c = jArr3;
    }
}
