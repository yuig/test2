package i31;

import android.content.res.Resources;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.feature.profile.allpins.view.ProfileAllPinsRep;
import com.pinterest.gestalt.text.GestaltText;
import d51.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import qv0.d0;
import u50.f0;
import vq0.h;
import yk1.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f71472a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f71473b;

    public e(j clickHandler, boolean z13) {
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        this.f71472a = clickHandler;
        this.f71473b = z13;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        ProfileAllPinsRep view = (ProfileAllPinsRep) nVar;
        vh viewModel = (vh) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "model");
        view.getClass();
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        kj kjVar = viewModel.f42855m;
        String a13 = kjVar != null ? kjVar.a() : null;
        if (a13 == null) {
            a13 = "";
        }
        GestaltText gestaltText = view.f47477e;
        a0.p(gestaltText, a13);
        boolean z13 = this.f71473b;
        if (z13) {
            gestaltText.i(b.f71466i);
        }
        view.d0(viewModel);
        kj kjVar2 = viewModel.f42856n;
        String string = kjVar2 != null ? kjVar2.a() : null;
        if (string == null) {
            Resources resources = view.getResources();
            int i14 = oz1.d.your_collages_count;
            int size = viewModel.f42865w.size();
            if (view.f47491s == null) {
                Intrinsics.r("numberFormatter");
                throw null;
            }
            string = resources.getQuantityString(i14, size, qb0.j.b(viewModel.f42865w.size()));
            Intrinsics.checkNotNullExpressionValue(string, "getQuantityString(...)");
        }
        Intrinsics.checkNotNullParameter(string, "string");
        ProfileAllPinsRep.o0(view, new f0(string), z13);
        view.f47479g.t(new a(true, 0));
        view.setOnClickListener(new d0(15, this, viewModel));
    }

    @Override // vq0.h
    public final m f() {
        return null;
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
