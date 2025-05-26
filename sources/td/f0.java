package td;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class f0 implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f117381a;

    /* renamed from: b, reason: collision with root package name */
    public final p5.d f117382b;

    /* renamed from: c, reason: collision with root package name */
    public int f117383c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.h f117384d;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f117385e;

    /* renamed from: f, reason: collision with root package name */
    public List f117386f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f117387g;

    public f0(ArrayList arrayList, p5.d dVar) {
        this.f117382b = dVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f117381a = arrayList;
        this.f117383c = 0;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.f117381a.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        List list = this.f117386f;
        if (list != null) {
            this.f117382b.a(list);
        }
        this.f117386f = null;
        Iterator it = this.f117381a.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final nd.a c() {
        return ((com.bumptech.glide.load.data.e) this.f117381a.get(0)).c();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f117387g = true;
        Iterator it = this.f117381a.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(Exception exc) {
        List list = this.f117386f;
        d7.b.p(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        this.f117384d = hVar;
        this.f117385e = dVar;
        this.f117386f = (List) this.f117382b.b();
        ((com.bumptech.glide.load.data.e) this.f117381a.get(this.f117383c)).e(hVar, this);
        if (this.f117387g) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        if (obj != null) {
            this.f117385e.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.f117387g) {
            return;
        }
        if (this.f117383c < this.f117381a.size() - 1) {
            this.f117383c++;
            e(this.f117384d, this.f117385e);
        } else {
            d7.b.o(this.f117386f);
            this.f117385e.d(new GlideException("Fetch failed", new ArrayList(this.f117386f)));
        }
    }
}
