package pd;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements h, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f99643a;

    /* renamed from: b, reason: collision with root package name */
    public final i f99644b;

    /* renamed from: c, reason: collision with root package name */
    public final g f99645c;

    /* renamed from: d, reason: collision with root package name */
    public int f99646d = -1;

    /* renamed from: e, reason: collision with root package name */
    public nd.h f99647e;

    /* renamed from: f, reason: collision with root package name */
    public List f99648f;

    /* renamed from: g, reason: collision with root package name */
    public int f99649g;

    /* renamed from: h, reason: collision with root package name */
    public volatile td.b0 f99650h;

    /* renamed from: i, reason: collision with root package name */
    public File f99651i;

    public e(List list, i iVar, g gVar) {
        this.f99643a = list;
        this.f99644b = iVar;
        this.f99645c = gVar;
    }

    @Override // pd.h
    public final boolean b() {
        while (true) {
            List list = this.f99648f;
            boolean z13 = false;
            if (list != null && this.f99649g < list.size()) {
                this.f99650h = null;
                while (!z13 && this.f99649g < this.f99648f.size()) {
                    List list2 = this.f99648f;
                    int i13 = this.f99649g;
                    this.f99649g = i13 + 1;
                    td.c0 c0Var = (td.c0) list2.get(i13);
                    File file = this.f99651i;
                    i iVar = this.f99644b;
                    this.f99650h = c0Var.b(file, iVar.f99676e, iVar.f99677f, iVar.f99680i);
                    if (this.f99650h != null && this.f99644b.c(this.f99650h.f117374c.a()) != null) {
                        this.f99650h.f117374c.e(this.f99644b.f99686o, this);
                        z13 = true;
                    }
                }
                return z13;
            }
            int i14 = this.f99646d + 1;
            this.f99646d = i14;
            if (i14 >= this.f99643a.size()) {
                return false;
            }
            nd.h hVar = (nd.h) this.f99643a.get(this.f99646d);
            i iVar2 = this.f99644b;
            File l13 = iVar2.f99679h.a().l(new f(hVar, iVar2.f99685n));
            this.f99651i = l13;
            if (l13 != null) {
                this.f99647e = hVar;
                this.f99648f = this.f99644b.f99674c.a().e(l13);
                this.f99649g = 0;
            }
        }
    }

    @Override // pd.h
    public final void cancel() {
        td.b0 b0Var = this.f99650h;
        if (b0Var != null) {
            b0Var.f117374c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(Exception exc) {
        this.f99645c.a(this.f99647e, exc, this.f99650h.f117374c, nd.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        this.f99645c.c(this.f99647e, obj, this.f99650h.f117374c, nd.a.DATA_DISK_CACHE, this.f99647e);
    }
}
