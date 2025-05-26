package r81;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import t3.s1;
import uj2.q;

/* loaded from: classes5.dex */
public final class a extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final p f106751k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f106752l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p localPhotoService, pw0.k directoryInteractionListener) {
        super(null);
        Intrinsics.checkNotNullParameter(localPhotoService, "localPhotoService");
        Intrinsics.checkNotNullParameter(directoryInteractionListener, "directoryInteractionListener");
        this.f106751k = localPhotoService;
        o(RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY, new h90.m(directoryInteractionListener));
    }

    @Override // nr0.g
    public final boolean e(int i13) {
        return true;
    }

    @Override // nr0.g
    public final boolean f3(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY;
    }

    @Override // nr0.g
    public final boolean h(int i13) {
        return true;
    }

    @Override // wt1.b
    public final boolean i() {
        return this.f106752l;
    }

    @Override // xk1.c
    public final q k() {
        p pVar = this.f106751k;
        pVar.getClass();
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        ol1.d a14 = pVar.f106790c.a(a13, pVar.f106788a, false, pVar.f106789b);
        ArrayList arrayList = new ArrayList();
        return s1.f(new jk2.e(a14, new ck2.f(arrayList), new ep.g(19, o.f106787i)).k(new d51.a(28, g.f106766n)).u().H(tk2.e.f118017c), "observeOn(...)");
    }

    @Override // nr0.g
    public final boolean k2(int i13) {
        return true;
    }
}
