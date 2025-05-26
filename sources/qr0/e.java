package qr0;

import dl1.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f104964a;

    /* renamed from: b, reason: collision with root package name */
    public String f104965b;

    /* renamed from: c, reason: collision with root package name */
    public final String f104966c;

    public e(List list, String str, String str2) {
        this.f104964a = list != null ? new ArrayList(list) : new ArrayList();
        this.f104965b = str;
        this.f104966c = str2;
    }

    public final void a(int i13, s sVar) {
        if (i13 >= 0) {
            ArrayList arrayList = this.f104964a;
            if (i13 < arrayList.size()) {
                arrayList.set(i13, sVar);
            }
        }
    }

    @Override // qr0.d
    public final List d() {
        return this.f104964a;
    }

    @Override // qr0.d
    public final String g() {
        return this.f104965b;
    }

    @Override // qr0.d
    public final String k() {
        return null;
    }

    @Override // qr0.d
    public final String r() {
        return this.f104966c;
    }

    public final String toString() {
        return e.class.getSimpleName() + " {_baseUrl:" + this.f104965b + ", _bookmark:" + this.f104966c + ", _items count:" + this.f104964a.size() + "}";
    }
}
