package rk0;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements com.google.android.material.appbar.h {

    /* renamed from: a, reason: collision with root package name */
    public int f108462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f108463b;

    public h(j jVar) {
        this.f108463b = jVar;
    }

    @Override // com.google.android.material.appbar.f
    public final void a(AppBarLayout appBarLayout, int i13) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        boolean z13 = this.f108462a != i13;
        this.f108462a = i13;
        if (z13) {
            j jVar = this.f108463b;
            if (jVar.f108451k) {
                jVar.f();
            }
        }
    }
}
