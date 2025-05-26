package pd;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 implements h, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final g f99662a;

    /* renamed from: b, reason: collision with root package name */
    public final i f99663b;

    /* renamed from: c, reason: collision with root package name */
    public int f99664c;

    /* renamed from: d, reason: collision with root package name */
    public int f99665d = -1;

    /* renamed from: e, reason: collision with root package name */
    public nd.h f99666e;

    /* renamed from: f, reason: collision with root package name */
    public List f99667f;

    /* renamed from: g, reason: collision with root package name */
    public int f99668g;

    /* renamed from: h, reason: collision with root package name */
    public volatile td.b0 f99669h;

    /* renamed from: i, reason: collision with root package name */
    public File f99670i;

    /* renamed from: j, reason: collision with root package name */
    public i0 f99671j;

    public h0(i iVar, g gVar) {
        this.f99663b = iVar;
        this.f99662a = gVar;
    }

    @Override // pd.h
    public final boolean b() {
        ArrayList a13 = this.f99663b.a();
        boolean z13 = false;
        if (a13.isEmpty()) {
            return false;
        }
        List e13 = this.f99663b.e();
        if (e13.isEmpty()) {
            if (File.class.equals(this.f99663b.g())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f99663b.d() + " to " + this.f99663b.g());
        }
        while (true) {
            List list = this.f99667f;
            if (list != null && this.f99668g < list.size()) {
                this.f99669h = null;
                while (!z13 && this.f99668g < this.f99667f.size()) {
                    List list2 = this.f99667f;
                    int i13 = this.f99668g;
                    this.f99668g = i13 + 1;
                    td.c0 c0Var = (td.c0) list2.get(i13);
                    File file = this.f99670i;
                    i iVar = this.f99663b;
                    this.f99669h = c0Var.b(file, iVar.f99676e, iVar.f99677f, iVar.f99680i);
                    if (this.f99669h != null && this.f99663b.c(this.f99669h.f117374c.a()) != null) {
                        this.f99669h.f117374c.e(this.f99663b.f99686o, this);
                        z13 = true;
                    }
                }
                return z13;
            }
            int i14 = this.f99665d + 1;
            this.f99665d = i14;
            if (i14 >= e13.size()) {
                int i15 = this.f99664c + 1;
                this.f99664c = i15;
                if (i15 >= a13.size()) {
                    return false;
                }
                this.f99665d = 0;
            }
            nd.h hVar = (nd.h) a13.get(this.f99664c);
            Class cls = (Class) e13.get(this.f99665d);
            nd.p h10 = this.f99663b.h(cls);
            i iVar2 = this.f99663b;
            this.f99671j = new i0(iVar2.f99674c.f29767a, hVar, iVar2.f99685n, iVar2.f99676e, iVar2.f99677f, h10, cls, iVar2.f99680i);
            File l13 = iVar2.f99679h.a().l(this.f99671j);
            this.f99670i = l13;
            if (l13 != null) {
                this.f99666e = hVar;
                this.f99667f = this.f99663b.f99674c.a().e(l13);
                this.f99668g = 0;
            }
        }
    }

    @Override // pd.h
    public final void cancel() {
        td.b0 b0Var = this.f99669h;
        if (b0Var != null) {
            b0Var.f117374c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(Exception exc) {
        this.f99662a.a(this.f99671j, exc, this.f99669h.f117374c, nd.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        this.f99662a.c(this.f99666e, obj, this.f99669h.f117374c, nd.a.RESOURCE_DISK_CACHE, this.f99671j);
    }
}
