package wk1;

import com.pinterest.framework.multisection.datasource.pagedlist.w;
import dl1.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class m implements qr0.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f130166a;

    /* renamed from: b, reason: collision with root package name */
    public final String f130167b;

    /* renamed from: c, reason: collision with root package name */
    public final String f130168c;

    /* renamed from: d, reason: collision with root package name */
    public final String f130169d;

    public m(n nVar, w wVar) {
        List d2 = wVar.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d2) {
            if (obj instanceof s) {
                arrayList.add(obj);
            }
        }
        this.f130166a = nVar.convertToPlankModels(arrayList);
        this.f130167b = wVar.g();
        this.f130168c = wVar.k();
        this.f130169d = wVar.r();
    }

    @Override // qr0.d
    public final List d() {
        return this.f130166a;
    }

    @Override // qr0.d
    public final String g() {
        return this.f130167b;
    }

    @Override // qr0.d
    public final String k() {
        return this.f130168c;
    }

    @Override // qr0.d
    public final String r() {
        return this.f130169d;
    }
}
