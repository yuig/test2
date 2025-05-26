package hx0;

import com.pinterest.activity.newshub.view.header.NewsHubSectionHeader;
import com.pinterest.api.model.v7;
import g70.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kx0.o;
import ye2.m;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70505i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f70506j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(1);
        this.f70505i = i13;
        this.f70506j = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70505i;
        e eVar = this.f70506j;
        switch (i13) {
            case 0:
                dv1.e detailItem = (dv1.e) obj;
                if (eVar.isBound()) {
                    fx0.b bVar = (fx0.b) eVar.getView();
                    Intrinsics.f(detailItem);
                    o oVar = (o) bVar;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(detailItem, "detailItem");
                    oVar.f81076a1 = detailItem;
                    NewsHubSectionHeader newsHubSectionHeader = oVar.Y0;
                    if (newsHubSectionHeader != null) {
                        newsHubSectionHeader.d(eq.b.b((m) oVar.getContext(), detailItem.f56395g, detailItem.f56392d).toString());
                    }
                    oVar.J8(oVar.n8().f19650a);
                    oVar.P8();
                }
                break;
            default:
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(board, "board");
                h.f(eVar.f70516j, board, null, 6);
                break;
        }
        return Unit.f80348a;
    }
}
