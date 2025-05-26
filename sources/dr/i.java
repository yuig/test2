package dr;

import com.pinterest.activity.sendapin.model.TypeAheadItem;
import z40.t;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final TypeAheadItem f56179a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56180b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f56181c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f56182d;

    public i(k kVar, TypeAheadItem typeAheadItem, int i13) {
        this.f56182d = kVar;
        this.f56179a = typeAheadItem;
        this.f56180b = i13;
    }

    public void a() {
        this.f56182d.f56197l.put(this.f56179a.A(), "");
    }

    public void b(Throwable th3) {
        k kVar = this.f56182d;
        if (!kVar.f56200o.isEmpty()) {
            int size = kVar.f56200o.size();
            int i13 = this.f56180b;
            if (size > i13) {
                kVar.f56200o.remove(i13);
            }
        }
        kVar.notifyDataSetChanged();
    }

    public void c(t tVar) {
        this.f56182d.f56197l.put(this.f56179a.A(), tVar.a());
    }
}
