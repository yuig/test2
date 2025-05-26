package fn1;

import android.content.res.TypedArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.selectList.GestaltSelectList;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.g0;
import u50.i0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62674i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSelectList f62675j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltSelectList gestaltSelectList, int i13) {
        super(1);
        this.f62674i = i13;
        this.f62675j = gestaltSelectList;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f62674i;
        GestaltSelectList gestaltSelectList = this.f62675j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return new l(gestaltSelectList.getId());
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new m(gestaltSelectList.getId());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f62674i;
        GestaltSelectList gestaltSelectList = this.f62675j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                f fVar = GestaltSelectList.f49556m;
                gestaltSelectList.getClass();
                i0 c13 = g0.c($receiver, s.GestaltSelectList_gestalt_selectlist_labelText);
                i0 c14 = g0.c($receiver, s.GestaltSelectList_gestalt_selectlist_helperText);
                int i14 = $receiver.getInt(s.GestaltSelectList_gestalt_selectlist_helperTextLines, 2);
                i0 c15 = g0.c($receiver, s.GestaltSelectList_android_hint);
                int i15 = $receiver.getInt(s.GestaltSelectList_gestalt_selectlist_variant, -1);
                f fVar2 = i15 >= 0 ? f.values()[i15] : GestaltSelectList.f49556m;
                boolean z13 = $receiver.getBoolean(s.GestaltSelectList_android_enabled, true);
                fm1.c Y = d7.b.Y($receiver, s.GestaltSelectList_android_visibility, GestaltSelectList.f49557n);
                String string = $receiver.getString(s.GestaltSelectList_android_contentDescription);
                return new b(null, q0.f80391a, c13, c14, i14, c15, fVar2, z13, Y, string != null ? bs1.c.p2(string) : null, gestaltSelectList.getId());
            case 1:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                f fVar3 = GestaltSelectList.f49556m;
                AutoCompleteTextView selectList = gestaltSelectList.X();
                final a makeDismissEvent = new a(gestaltSelectList, 3);
                final im1.l doOnDismiss = im1.l.f72659l;
                final com.google.firebase.messaging.q qVar = gestaltSelectList.f49559a;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(selectList, "selectList");
                Intrinsics.checkNotNullParameter(doOnDismiss, "doOnDismiss");
                Intrinsics.checkNotNullParameter(makeDismissEvent, "makeDismissEvent");
                selectList.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: im1.i
                    @Override // android.widget.AutoCompleteTextView.OnDismissListener
                    public final void onDismiss() {
                        Function1 doOnDismiss2 = Function1.this;
                        Intrinsics.checkNotNullParameter(doOnDismiss2, "$doOnDismiss");
                        q this$0 = qVar;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Function1 makeDismissEvent2 = makeDismissEvent;
                        Intrinsics.checkNotNullParameter(makeDismissEvent2, "$makeDismissEvent");
                        Unit unit = Unit.f80348a;
                        doOnDismiss2.invoke(unit);
                        this$0.s((gm1.c) makeDismissEvent2.invoke(unit));
                    }
                });
                AutoCompleteTextView selectList2 = gestaltSelectList.X();
                final a makeItemClickEvent = new a(gestaltSelectList, 4);
                final im1.l doOnItemClick = im1.l.f72661n;
                Intrinsics.checkNotNullParameter(selectList2, "selectList");
                Intrinsics.checkNotNullParameter(doOnItemClick, "doOnItemClick");
                Intrinsics.checkNotNullParameter(makeItemClickEvent, "makeItemClickEvent");
                selectList2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: im1.j
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i16, long j13) {
                        Function1 doOnItemClick2 = Function1.this;
                        Intrinsics.checkNotNullParameter(doOnItemClick2, "$doOnItemClick");
                        q this$0 = qVar;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Function1 makeItemClickEvent2 = makeItemClickEvent;
                        Intrinsics.checkNotNullParameter(makeItemClickEvent2, "$makeItemClickEvent");
                        doOnItemClick2.invoke(Integer.valueOf(i16));
                        this$0.s((gm1.c) makeItemClickEvent2.invoke(Integer.valueOf(i16)));
                    }
                });
                AutoCompleteTextView selectList3 = gestaltSelectList.X();
                a makeDropdownClickEvent = new a(gestaltSelectList, 5);
                im1.l doOnDropdownClick = im1.l.f72660m;
                Intrinsics.checkNotNullParameter(selectList3, "selectList");
                Intrinsics.checkNotNullParameter(doOnDropdownClick, "doOnDropdownClick");
                Intrinsics.checkNotNullParameter(makeDropdownClickEvent, "makeDropdownClickEvent");
                selectList3.setOnClickListener(new im1.a(doOnDropdownClick, qVar, makeDropdownClickEvent, 1));
                return Unit.f80348a;
            case 2:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108897l = q.gestalt_select_list_label;
                f fVar4 = GestaltSelectList.f49556m;
                bind.f108902q = Integer.valueOf(gestaltSelectList.X().getId());
                return Unit.f80348a;
            case 3:
                return b((Unit) obj);
            case 4:
                return new n(gestaltSelectList.getId(), ((Number) obj).intValue());
            default:
                return b((Unit) obj);
        }
    }
}
