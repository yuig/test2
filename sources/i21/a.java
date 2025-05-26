package i21;

import android.content.Context;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.g0;
import h32.u0;
import j21.f;
import kh2.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ku1.l;
import m60.f0;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71426i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f71427j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ vh f71428k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f71429l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, vh vhVar, String str, int i13) {
        super(0);
        this.f71426i = i13;
        this.f71427j = bVar;
        this.f71428k = vhVar;
        this.f71429l = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f71426i) {
            case 0:
                m154invoke();
                break;
            default:
                m154invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m154invoke() {
        int i13 = this.f71426i;
        vh vhVar = this.f71428k;
        b bVar = this.f71427j;
        switch (i13) {
            case 0:
                bVar.getPinalytics().h(g0.DYNAMIC_GRID_STORY, u0.STORY_END_CELL, d.E(vhVar));
                if (bVar.isBound()) {
                    g21.d dVar = (g21.d) bVar.getView();
                    String str = this.f71429l;
                    g21.b bVar2 = bVar.f71434g;
                    g21.c deepLinkModel = new g21.c(str, bVar2);
                    f fVar = (f) dVar;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(deepLinkModel, "deepLinkModel");
                    l lVar = fVar.f74505h;
                    if (lVar != null) {
                        Context context = fVar.getContext();
                        String str2 = bVar2.f63389a;
                        Intrinsics.f(context);
                        l.b(lVar, context, str, true, false, str2, bVar2.f63390b, 64);
                        return;
                    }
                    Intrinsics.r("uriNavigator");
                    throw null;
                }
                return;
            default:
                bVar.getPinalytics().h(g0.DYNAMIC_GRID_STORY, u0.STORY_END_CELL, d.E(vhVar));
                Context context2 = kb0.a.f79058b;
                l.b(bVar.f71438k, f0.W(), this.f71429l, false, false, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                return;
        }
    }
}
