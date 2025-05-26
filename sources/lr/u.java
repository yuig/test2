package lr;

import android.content.Context;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes3.dex */
public final class u extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final z70.m f84549d;

    /* renamed from: e, reason: collision with root package name */
    public final lu1.b f84550e;

    /* renamed from: f, reason: collision with root package name */
    public final TypeAheadItem f84551f;

    /* renamed from: g, reason: collision with root package name */
    public final er.d f84552g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84553h;

    /* renamed from: i, reason: collision with root package name */
    public PinterestToastContainer f84554i;

    public u(TypeAheadItem contactDetails, String str, er.d sendStatus, z70.m chromeTabHelper, lu1.b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(sendStatus, "sendStatus");
        Intrinsics.checkNotNullParameter(chromeTabHelper, "chromeTabHelper");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f84549d = chromeTabHelper;
        this.f84550e = baseActivityHelper;
        this.f84551f = contactDetails;
        this.f84552g = sendStatus;
        if (str != null) {
            this.f84553h = str;
        }
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        String l13;
        k0 j23;
        i0 i0Var;
        do1.n nVar;
        do1.e eVar;
        Intrinsics.checkNotNullParameter(container, "container");
        this.f84554i = container;
        TypeAheadItem typeAheadItem = this.f84551f;
        if (Intrinsics.d(typeAheadItem.l(), "https://s.pinimg.com/images/user/default_444.png") || (l13 = typeAheadItem.l()) == null) {
            l13 = "";
        }
        i0 h23 = bs1.c.h2("");
        do1.n nVar2 = do1.n.DEFAULT;
        int i13 = t.f84548a[this.f84552g.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                nVar2 = do1.n.ERROR;
                h23 = bs1.c.j2(new String[0], w42.c.error_while_sending);
            } else if (i13 == 3) {
                h23 = bs1.c.j2(new String[0], w42.c.sending_cancelled);
            }
            i0Var = h23;
            nVar = nVar2;
            j23 = null;
            eVar = null;
        } else {
            int i14 = w42.c.message_with_contact;
            String n13 = typeAheadItem.n();
            Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
            i0 j24 = bs1.c.j2(new String[]{n13}, i14);
            String n14 = typeAheadItem.n();
            Intrinsics.checkNotNullExpressionValue(n14, "getTitle(...)");
            do1.e eVar2 = new do1.e(l13, n14);
            j23 = bs1.c.j2(new String[0], w42.c.view);
            i0Var = j24;
            nVar = nVar2;
            eVar = eVar2;
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new GestaltToast(context, new do1.d(i0Var, eVar, j23 != null ? new do1.b(j23, new db.m(this, 29)) : null, nVar, 0, 0, 0, null, false, 496));
    }
}
