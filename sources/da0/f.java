package da0;

import android.content.Context;
import android.net.Uri;
import ao2.j0;
import ao2.v0;
import ca0.g1;
import ca0.i1;
import ca0.j1;
import ca0.o;
import ca0.o0;
import ca0.r0;
import ca0.s0;
import ca0.t0;
import com.pinterest.api.model.PinnableImage;
import g70.h;
import h62.k;
import h72.m;
import ho2.q;
import java.util.List;
import k90.i;
import kb.u0;
import kb.w0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import m60.f0;
import nx.a0;
import u50.r;
import x02.b1;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class f implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f54213a;

    /* renamed from: b, reason: collision with root package name */
    public final k f54214b;

    /* renamed from: c, reason: collision with root package name */
    public final j f54215c;

    /* renamed from: d, reason: collision with root package name */
    public final b1 f54216d;

    /* renamed from: e, reason: collision with root package name */
    public final i92.k f54217e;

    /* renamed from: f, reason: collision with root package name */
    public final o72.b f54218f;

    /* renamed from: g, reason: collision with root package name */
    public final i2 f54219g;

    /* renamed from: h, reason: collision with root package name */
    public final x0 f54220h;

    /* renamed from: i, reason: collision with root package name */
    public final b60.b f54221i;

    /* renamed from: j, reason: collision with root package name */
    public final h f54222j;

    public f(Context context, k project, j navigator, b1 collageRepository, i92.k toastUtils, m thumbnailInteractor, i2 pinRepository, x0 boardRepository, b60.b userManager, h boardNavigator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(collageRepository, "collageRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(thumbnailInteractor, "thumbnailInteractor");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f54213a = context;
        this.f54214b = project;
        this.f54215c = navigator;
        this.f54216d = collageRepository;
        this.f54217e = toastUtils;
        this.f54218f = thumbnailInteractor;
        this.f54219g = pinRepository;
        this.f54220h = boardRepository;
        this.f54221i = userManager;
        this.f54222j = boardNavigator;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        t0 request = (t0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof o0) {
            kotlin.jvm.internal.j.z(scope, null, null, new c(this, eventIntake, null), 3);
            return;
        }
        if (request instanceof r0) {
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ((bo2.e) q.f69782a).f23612f, null, new d(request, this, eventIntake, null), 2);
        } else if (request instanceof s0) {
            this.f54220h.L(((s0) request).f27162a).F(new i(4, new t80.r(14, eventIntake, this)), new i(5, e.f54212i), ck2.i.f27923c, ck2.i.f27924d);
        }
    }

    public final void j(r0 r0Var, r rVar, String str, String str2, String str3) {
        PinnableImage pinnableImage = new PinnableImage();
        j1 j1Var = r0Var.f27155b;
        if (j1Var instanceof g1) {
            pinnableImage.f35571h = Uri.fromFile(((g1) j1Var).f27117a);
        } else if (j1Var instanceof i1) {
            pinnableImage.f35569f = ((i1) j1Var).f27130a;
        }
        pinnableImage.f35567d = r0Var.f27156c;
        pinnableImage.f35568e = r0Var.f27157d;
        pinnableImage.f35576m = r0Var.f27158e;
        a aVar = new a(this, r0Var, rVar);
        u0 u0Var = w0.f79048a;
        Context context = kb0.a.f79058b;
        k11.d dVar = new k11.d(this.f54219g, aVar, u0Var.a(f0.j0()), new a0(), null);
        List b13 = e0.b(pinnableImage);
        Boolean valueOf = Boolean.valueOf(r0Var.f27159f);
        dVar.c(b13, str, str2, r0Var.f27157d, str3, null, r0Var.f27154a, valueOf);
        rVar.a(new o(pinnableImage, str));
    }
}
