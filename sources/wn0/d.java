package wn0;

import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements com.google.android.material.appbar.h {

    /* renamed from: a, reason: collision with root package name */
    public int f130466a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f130467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f130468c;

    public d(j jVar) {
        this.f130468c = jVar;
    }

    @Override // com.google.android.material.appbar.f
    public final void a(AppBarLayout appBarLayout, int i13) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        boolean z13 = this.f130466a != i13;
        this.f130466a = i13;
        int abs = Math.abs(i13);
        if (z13) {
            j jVar = this.f130468c;
            GestaltText gestaltText = jVar.f130495r1;
            if (gestaltText == null) {
                Intrinsics.r("boardTitleView");
                throw null;
            }
            int height = gestaltText.getHeight();
            GestaltText gestaltText2 = jVar.f130496s1;
            if (gestaltText2 == null) {
                Intrinsics.r("sectionTitleView");
                throw null;
            }
            boolean z14 = abs > gestaltText2.getHeight() + height;
            if (this.f130467b != z14) {
                this.f130467b = z14;
                GestaltToolbarImpl gestaltToolbarImpl = jVar.f130491n1;
                if (gestaltToolbarImpl != null) {
                    gestaltToolbarImpl.z().animate().alpha(z14 ? 1.0f : 0.0f).setDuration(300L).start();
                } else {
                    Intrinsics.r("topAppBar");
                    throw null;
                }
            }
        }
    }
}
