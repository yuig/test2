package s;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class j extends b.a {

    /* renamed from: a */
    public final Handler f110275a;

    /* renamed from: b */
    public final /* synthetic */ b f110276b;

    public j(b bVar) {
        this.f110276b = bVar;
        attachInterface(this, b.b.f20704zn);
        this.f110275a = new Handler(Looper.getMainLooper());
    }

    public final void B(int i13, int i14, int i15, int i16, int i17, Bundle bundle) {
        if (this.f110276b == null) {
            return;
        }
        this.f110275a.post(new i(this, i13, i14, i15, i16, i17, bundle));
    }

    public final void C(int i13, int i14, Bundle bundle) {
        if (this.f110276b == null) {
            return;
        }
        this.f110275a.post(new h(this, i13, i14, bundle));
    }

    public final void D(Bundle bundle) {
        if (this.f110276b == null) {
            return;
        }
        this.f110275a.post(new d(this, bundle, 1));
    }

    public final void E(Bundle bundle) {
        if (this.f110276b == null) {
            return;
        }
        this.f110275a.post(new d(this, bundle, 3));
    }

    public final void F(int i13, Bundle bundle) {
        if (this.f110276b == null) {
            return;
        }
        this.f110275a.post(new d.d(this, i13, bundle, 3));
    }

    public final void G(String str, Bundle bundle) {
        if (this.f110276b == null) {
            return;
        }
        this.f110275a.post(new f(this, str, bundle, 0));
    }

    public final void H(int i13, Uri uri, boolean z13, Bundle bundle) {
        if (this.f110276b == null) {
            return;
        }
        this.f110275a.post(new g(this, i13, uri, z13, bundle));
    }

    public final void I(Bundle bundle) {
        if (this.f110276b == null) {
            return;
        }
        this.f110275a.post(new d(this, bundle, 0));
    }

    public final void J(Bundle bundle) {
        if (this.f110276b == null) {
            return;
        }
        this.f110275a.post(new d(this, bundle, 2));
    }

    public final Bundle j(String str, Bundle bundle) {
        b bVar = this.f110276b;
        if (bVar == null) {
            return null;
        }
        return bVar.extraCallbackWithResult(str, bundle);
    }
}
