package i6;

import e3.e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f71620a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f71621b;

    /* renamed from: c, reason: collision with root package name */
    public int f71622c;

    /* renamed from: d, reason: collision with root package name */
    public int f71623d;

    public c() {
        if (e.f57028b == null) {
            e.f57028b = new e();
        }
    }

    public final int a(int i13) {
        if (i13 < this.f71623d) {
            return this.f71621b.getShort(this.f71622c + i13);
        }
        return 0;
    }
}
