package fh2;

import kotlin.jvm.internal.Intrinsics;
import kp.n;
import th2.g;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final uh2.b f62171a;

    /* renamed from: b, reason: collision with root package name */
    public final n f62172b;

    /* renamed from: c, reason: collision with root package name */
    public String f62173c;

    /* renamed from: d, reason: collision with root package name */
    public String f62174d;

    /* renamed from: e, reason: collision with root package name */
    public String f62175e;

    /* renamed from: f, reason: collision with root package name */
    public String f62176f;

    public c(uh2.b preferencesService, g appFramework) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(appFramework, "appFramework");
        this.f62171a = preferencesService;
        int i13 = b.f62170a[appFramework.ordinal()];
        if (i13 == 1) {
            this.f62172b = new n(2);
            return;
        }
        if (i13 == 2) {
            this.f62172b = new n(3);
        } else if (i13 != 3) {
            this.f62172b = new n(1);
        } else {
            this.f62172b = new n(0);
        }
    }

    public final void a(String str) {
        n nVar = this.f62172b;
        uh2.b bVar = this.f62171a;
        String k03 = nVar.k0(bVar);
        if (k03 == null) {
            this.f62174d = str;
            nVar.u0(str, bVar);
        } else {
            if (Intrinsics.d(str, k03)) {
                return;
            }
            this.f62174d = str;
            nVar.u0(str, bVar);
        }
    }

    public final void b(String str) {
        n nVar = this.f62172b;
        uh2.b bVar = this.f62171a;
        String l03 = nVar.l0(bVar);
        if (l03 == null) {
            this.f62173c = str;
            nVar.v0(str, bVar);
        } else {
            if (Intrinsics.d(str, l03)) {
                return;
            }
            this.f62173c = str;
            nVar.v0(str, bVar);
        }
    }
}
