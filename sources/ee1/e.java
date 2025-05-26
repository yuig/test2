package ee1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.media3.ui.k;
import com.google.android.gms.internal.measurement.x;
import com.pinterest.gestalt.button.view.GestaltButton;
import d91.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import xk2.m;
import xk2.v;
import yk1.n;
import zd1.e0;

/* loaded from: classes5.dex */
public final class e extends yk1.c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f58791a;

    /* renamed from: b, reason: collision with root package name */
    public final f f58792b;

    /* renamed from: c, reason: collision with root package name */
    public final x f58793c;

    /* renamed from: d, reason: collision with root package name */
    public final List f58794d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58795e;

    /* renamed from: f, reason: collision with root package name */
    public final v f58796f;

    /* renamed from: g, reason: collision with root package name */
    public int f58797g;

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f58798h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uk1.d presenterPinalytics, q networkStateStream, e0 inlineFilterManager, f listener, x loggingHelper, List list, boolean z13) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(inlineFilterManager, "inlineFilterManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(loggingHelper, "loggingHelper");
        this.f58791a = inlineFilterManager;
        this.f58792b = listener;
        this.f58793c = loggingHelper;
        this.f58794d = list;
        this.f58795e = z13;
        v b13 = m.b(new d(this, 0));
        this.f58796f = b13;
        this.f58797g = ((List) b13.getValue()).size();
        this.f58798h = new HashSet();
    }

    @Override // yk1.b, yk1.m
    public final void bind(n nVar) {
        c view = (c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.bind(view);
        view.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        view.f58787b = this;
        view.removeAllViews();
        Iterator it = ((List) this.f58796f.getValue()).iterator();
        int i13 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList = view.f58788c;
            if (!hasNext) {
                int[] E0 = CollectionsKt.E0(arrayList);
                Flow flow = view.f58786a;
                flow.s(E0);
                view.addView(flow);
                return;
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            String label = ((h) next).f58800b;
            Intrinsics.checkNotNullParameter(label, "label");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltButton gestaltButton = new GestaltButton(0, 14, context, (AttributeSet) null);
            gestaltButton.d(new l(label, 15));
            gestaltButton.setOnClickListener(new k(view, i13, 6));
            g gVar = view.f58787b;
            if (gVar == null) {
                Intrinsics.r("listener");
                throw null;
            }
            e eVar = (e) gVar;
            h hVar = (h) CollectionsKt.U(i13, (List) eVar.f58796f.getValue());
            if (hVar != null) {
                HashSet hashSet = eVar.f58798h;
                h hVar2 = hashSet.contains(hVar.f58800b) ^ true ? hVar : null;
                if (hVar2 != null) {
                    eVar.f58793c.r(eVar.f58795e ? ge1.a.FILTER_ERROR_STATE_EOF_BUTTON_VIEWED : ge1.a.FILTER_ERROR_STATE_BUTTON_VIEWED, hVar);
                    hashSet.add(hVar2.f58800b);
                }
            }
            int generateViewId = View.generateViewId();
            gestaltButton.setId(generateViewId);
            arrayList.add(Integer.valueOf(generateViewId));
            view.addView(gestaltButton);
            i13 = i14;
        }
    }
}
