package lp;

import android.view.View;
import com.pinterest.activity.conversation.view.ContactListInboxContainer;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.collections.h1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import m60.w;
import m60.x0;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84207i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ContactListInboxContainer f84208j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ContactListInboxContainer contactListInboxContainer, int i13) {
        super(1);
        this.f84207i = i13;
        this.f84208j = contactListInboxContainer;
    }

    public final void b(Throwable th3) {
        int i13 = this.f84207i;
        ContactListInboxContainer contactListInboxContainer = this.f84208j;
        switch (i13) {
            case 1:
                tk2.e.f118017c.b(new dp.a(1, contactListInboxContainer, th3));
                break;
            default:
                String string = contactListInboxContainer.getResources().getString(x0.pinmarklet_generic_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                oo1.j.r(string, th3);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84207i;
        ContactListInboxContainer contactListInboxContainer = this.f84208j;
        switch (i13) {
            case 0:
                contactListInboxContainer.removeAllViews();
                vd0.a c13 = ((vd0.c) obj).c("data");
                Intrinsics.g(c13, "null cannot be cast to non-null type com.pinterest.customjson.PinterestJsonArray");
                contactListInboxContainer.setVisibility(0);
                List e03 = r.e0(c13);
                if (!e03.isEmpty()) {
                    ListIterator listIterator = e03.listIterator();
                    Intrinsics.checkNotNullParameter(listIterator, "<this>");
                    q5.x0 x0Var = new q5.x0(listIterator);
                    while (x0Var.hasNext()) {
                        IndexedValue indexedValue = (IndexedValue) x0Var.next();
                        int i14 = indexedValue.f80349a;
                        TypeAheadItem typeAheadItem = (TypeAheadItem) indexedValue.f80350b;
                        View inflate = View.inflate(contactListInboxContainer.getContext(), vc0.c.sharesheet_list_cell_person_lego_inline_send, null);
                        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.feature.sharesheet.view.ContactSearchListCell");
                        ContactSearchListCell contactSearchListCell = (ContactSearchListCell) inflate;
                        contactSearchListCell.f48393j = true;
                        contactSearchListCell.b(typeAheadItem);
                        String string = contactSearchListCell.getResources().getString(x0.send_message);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        contactSearchListCell.e(i14, string, "", new HashMap(), g91.c.RECIPIENT);
                        co.a listener = new co.a(6, contactListInboxContainer, h1.c(typeAheadItem));
                        Intrinsics.checkNotNullParameter(listener, "listener");
                        contactSearchListCell.f48391h = listener;
                        contactListInboxContainer.addView(contactSearchListCell);
                    }
                }
                return Unit.f80348a;
            case 1:
                b((Throwable) obj);
                return Unit.f80348a;
            case 2:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                List list = (List) pair.f80346a;
                List list2 = (List) pair.f80347b;
                List list3 = list;
                int value = y32.c.EMPTY_INBOX_SUGGESTION.getValue();
                no1.e eVar = contactListInboxContainer.f34869g;
                if (eVar != null) {
                    return oo1.j.a(list3, list2, null, null, value, eVar);
                }
                Intrinsics.r("conversationRemoteDatasource");
                throw null;
            case 3:
                z40.n nVar = (z40.n) obj;
                w wVar = contactListInboxContainer.f34867e;
                if (wVar != null) {
                    oo1.j.s(wVar, null, nVar);
                    return Unit.f80348a;
                }
                Intrinsics.r("eventManager");
                throw null;
            default:
                b((Throwable) obj);
                return Unit.f80348a;
        }
    }
}
