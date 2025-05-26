package j7;

import g7.r;
import g7.s;
import java.util.Map;
import okhttp3.Call;

/* loaded from: classes3.dex */
public abstract class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final s f74830a = new s(0);

    /* renamed from: b, reason: collision with root package name */
    public final Call.Factory f74831b;

    /* renamed from: c, reason: collision with root package name */
    public String f74832c;

    public b(Call.Factory factory) {
        this.f74831b = factory;
    }

    @Override // g7.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a() {
        return new c(this.f74831b, this.f74832c, this.f74830a);
    }

    public final void c(Map map) {
        this.f74830a.a(map);
    }
}
