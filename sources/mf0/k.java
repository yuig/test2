package mf0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes.dex */
public final class k implements nf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final nf0.c f87118a;

    /* renamed from: b, reason: collision with root package name */
    public final w f87119b;

    /* renamed from: c, reason: collision with root package name */
    public final tb0.h f87120c;

    /* renamed from: d, reason: collision with root package name */
    public f f87121d;

    /* renamed from: e, reason: collision with root package name */
    public String f87122e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f87123f;

    /* renamed from: g, reason: collision with root package name */
    public final j f87124g;

    public k(nf0.c dialogHost, w eventManager, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(dialogHost, "dialogHost");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f87118a = dialogHost;
        this.f87119b = eventManager;
        this.f87120c = crashReporting;
        this.f87123f = new ArrayList();
        this.f87124g = new j(this);
    }

    public final void a(f fVar) {
        String str;
        f fVar2 = this.f87121d;
        if ((fVar2 instanceof l) && (fVar instanceof l)) {
            Intrinsics.g(fVar2, "null cannot be cast to non-null type com.pinterest.dialog.LoadingDialog");
            ((l) fVar2).q7(((l) fVar).getF87126d0());
            return;
        }
        nf0.c cVar = this.f87118a;
        if ((fVar2 != null && (fVar == null || fVar.getX())) || ((str = this.f87122e) != null && str.length() != 0)) {
            f fVar3 = this.f87121d;
            if (fVar3 != null) {
                fVar3.M6();
            }
            this.f87121d = null;
            String str2 = this.f87122e;
            if (str2 != null) {
                Fragment F = cVar.getHostActivity().getSupportFragmentManager().F(str2);
                i iVar = F instanceof i ? (i) F : null;
                if (iVar != null) {
                    iVar.M6();
                }
            }
            this.f87122e = null;
        }
        if (fVar == null || fVar.isAdded() || cVar.isFinishing()) {
            return;
        }
        try {
            String str3 = fVar.f87102u + cp2.a.a(5);
            this.f87122e = str3;
            w0 supportFragmentManager = cVar.getHostActivity().getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            fVar.f18418n = false;
            fVar.f18419o = true;
            aVar.g(0, fVar, str3, 1);
            fVar.f18417m = false;
            fVar.f18413i = aVar.e(false);
            this.f87123f.add(str3);
            if (this.f87121d == null && (fVar instanceof l)) {
                this.f87121d = fVar;
            }
        } catch (IllegalStateException e13) {
            this.f87120c.o("Dialog Failed: ".concat(fVar.getClass().getSimpleName()), e13);
        }
    }

    public final void b() {
        int i13 = p.loading;
        nf0.c cVar = this.f87118a;
        String string = cVar.getHostActivity().getResources().getString(i13);
        if ((this.f87121d instanceof l) || !cVar.isVisible()) {
            return;
        }
        l lVar = new l();
        lVar.q7(string);
        a(lVar);
    }
}
