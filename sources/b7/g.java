package b7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class g implements f {

    /* renamed from: b, reason: collision with root package name */
    public e f22043b;

    /* renamed from: c, reason: collision with root package name */
    public e f22044c;

    /* renamed from: d, reason: collision with root package name */
    public e f22045d;

    /* renamed from: e, reason: collision with root package name */
    public e f22046e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f22047f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f22048g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22049h;

    public g() {
        ByteBuffer byteBuffer = f.f22042a;
        this.f22047f = byteBuffer;
        this.f22048g = byteBuffer;
        e eVar = e.f22037e;
        this.f22045d = eVar;
        this.f22046e = eVar;
        this.f22043b = eVar;
        this.f22044c = eVar;
    }

    public abstract e a(e eVar);

    public void b() {
    }

    public void c() {
    }

    @Override // b7.f
    public final void d() {
        flush();
        this.f22047f = f.f22042a;
        e eVar = e.f22037e;
        this.f22045d = eVar;
        this.f22046e = eVar;
        this.f22043b = eVar;
        this.f22044c = eVar;
        j();
    }

    @Override // b7.f
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.f22048g;
        this.f22048g = f.f22042a;
        return byteBuffer;
    }

    @Override // b7.f
    public final void flush() {
        this.f22048g = f.f22042a;
        this.f22049h = false;
        this.f22043b = this.f22045d;
        this.f22044c = this.f22046e;
        b();
    }

    @Override // b7.f
    public final e g(e eVar) {
        this.f22045d = eVar;
        this.f22046e = a(eVar);
        return isActive() ? this.f22046e : e.f22037e;
    }

    @Override // b7.f
    public final void h() {
        this.f22049h = true;
        c();
    }

    @Override // b7.f
    public boolean i() {
        return this.f22049h && this.f22048g == f.f22042a;
    }

    @Override // b7.f
    public boolean isActive() {
        return this.f22046e != e.f22037e;
    }

    public void j() {
    }

    public final ByteBuffer k(int i13) {
        if (this.f22047f.capacity() < i13) {
            this.f22047f = ByteBuffer.allocateDirect(i13).order(ByteOrder.nativeOrder());
        } else {
            this.f22047f.clear();
        }
        ByteBuffer byteBuffer = this.f22047f;
        this.f22048g = byteBuffer;
        return byteBuffer;
    }
}
