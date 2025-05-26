package x01;

import ck2.i;
import com.pinterest.feature.pin.closeup.datasource.l;
import i01.t;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import ry.e;
import w01.h;
import w01.s;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final t f131280a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131281b;

    /* renamed from: c, reason: collision with root package name */
    public final j f131282c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f131283d;

    /* renamed from: e, reason: collision with root package name */
    public String f131284e;

    /* renamed from: f, reason: collision with root package name */
    public final xj2.b f131285f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(l relatedPinsPagedList, t closeupFragmentView, String closeupPinId) {
        Intrinsics.checkNotNullParameter(relatedPinsPagedList, "relatedPinsPagedList");
        Intrinsics.checkNotNullParameter(closeupFragmentView, "closeupFragmentView");
        Intrinsics.checkNotNullParameter(closeupPinId, "closeupPinId");
        this.f131280a = closeupFragmentView;
        this.f131281b = closeupPinId;
        this.f131282c = new j(17, 0);
        xj2.b bVar = new xj2.b();
        this.f131285f = bVar;
        int i13 = 1;
        bVar.a(relatedPinsPagedList.f49129s.F(new h(28, new b(this, 0)), new h(29, new b(this, i13)), i.f27923c, i.f27924d));
        ((yq0.t) closeupFragmentView).addItemVisibilityChangeListener(new s(this, i13));
    }

    public final void a() {
        this.f131282c.getClass();
        new e(19, 0).i();
    }

    public final void b() {
        this.f131285f.d();
    }

    public final void c(Boolean bool) {
        this.f131283d = bool;
    }

    public final void d(String str) {
        this.f131284e = str;
    }
}
