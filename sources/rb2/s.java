package rb2;

import android.view.View;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.y4;
import kotlin.jvm.internal.Intrinsics;
import x02.c1;
import x02.e1;

/* loaded from: classes4.dex */
public final class s implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final r f107200a;

    /* renamed from: b, reason: collision with root package name */
    public final z40.n f107201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f107202c;

    public s(t tVar, r conversationInboxAdapterUpdater, z40.n conversation) {
        Intrinsics.checkNotNullParameter(conversationInboxAdapterUpdater, "conversationInboxAdapterUpdater");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        this.f107202c = tVar;
        this.f107200a = conversationInboxAdapterUpdater;
        this.f107201b = conversation;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v13) {
        kg.n.a(v13);
        Intrinsics.checkNotNullParameter(v13, "v");
        t tVar = this.f107202c;
        e1 e1Var = tVar.f107222s;
        if (e1Var == null) {
            Intrinsics.r("conversationMessageRepository");
            throw null;
        }
        z40.n nVar = this.f107201b;
        String convoId = nVar.a();
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        e1Var.b(new c1(convoId)).F(new lb2.r(6, new ha2.j(tVar, 16)), new lb2.r(7, c.f107123w), ck2.i.f27923c, ck2.i.f27924d);
        Integer i13 = nVar.i();
        int intValue = i13 != null ? i13.intValue() : 0;
        if (intValue != 0) {
            Intrinsics.checkNotNullParameter(nVar, "<this>");
            this.f107200a.l(new oo1.a(nVar));
        }
        NavigationImpl z03 = Navigation.z0((ScreenLocation) y4.f51623b.getValue(), nVar.a());
        z03.y0(Boolean.FALSE, "com.pinterest.EXTRA_IS_CONTACT_REQUEST");
        z03.y0(Integer.valueOf(intValue), "unreadCount");
        z03.e(nVar);
        m60.w wVar = tVar.f107219p;
        if (wVar != null) {
            wVar.d(z03);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }
}
