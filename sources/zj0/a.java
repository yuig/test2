package zj0;

import b60.d;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.create.collaboratorview.view.BoardCreateAddCollaboratorsView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;

/* loaded from: classes5.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f142049a;

    public a(b bVar) {
        this.f142049a = bVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull g91.b e13) {
        String l33;
        Intrinsics.checkNotNullParameter(e13, "e");
        b bVar = this.f142049a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(e13, "e");
        if (bVar.isBound()) {
            ArrayList arrayList = new ArrayList(bVar.f142053d.f68312a.values());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String l13 = ((TypeAheadItem) ((er.a) it.next())).l();
                if (l13 != null) {
                    arrayList2.add(l13);
                }
            }
            wy0 f13 = ((d) bVar.f142051b).f();
            if (f13 != null && (l33 = f13.l3()) != null) {
                arrayList2.add(0, l33);
            }
            BoardCreateAddCollaboratorsView boardCreateAddCollaboratorsView = (BoardCreateAddCollaboratorsView) ((yj0.a) bVar.getView());
            vs.b bVar2 = boardCreateAddCollaboratorsView.f45150e;
            if (bVar2 == null) {
                Intrinsics.r("contactListAdapter");
                throw null;
            }
            ArrayList H0 = CollectionsKt.H0((List) bVar2.f126470e);
            Collection<TypeAheadItem> values = ((h91.a) bVar2.f126471f).f68312a.values();
            Intrinsics.checkNotNullExpressionValue(values, "getContacts(...)");
            for (TypeAheadItem typeAheadItem : values) {
                if (!H0.contains(typeAheadItem)) {
                    Intrinsics.f(typeAheadItem);
                    H0.add(typeAheadItem);
                }
            }
            bVar2.f126470e = CollectionsKt.F0(H0);
            bVar2.h();
            if (boardCreateAddCollaboratorsView.f45150e == null) {
                Intrinsics.r("contactListAdapter");
                throw null;
            }
            if (!((List) r0.f126470e).isEmpty()) {
                boardCreateAddCollaboratorsView.a();
            }
        }
    }
}
