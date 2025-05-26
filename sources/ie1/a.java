package ie1;

import android.graphics.drawable.ColorDrawable;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.ui.imageview.WebImageView;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc1.b;
import ll.j;
import rg0.n;
import uj2.q;
import uk1.d;
import xd1.e;
import yk1.c;
import yk1.r;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final v f72201a;

    /* renamed from: b, reason: collision with root package name */
    public vh f72202b;

    /* renamed from: c, reason: collision with root package name */
    public final j f72203c;

    /* renamed from: d, reason: collision with root package name */
    public int f72204d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f72205e;

    /* renamed from: f, reason: collision with root package name */
    public final String f72206f;

    /* renamed from: g, reason: collision with root package name */
    public final String f72207g;

    /* renamed from: h, reason: collision with root package name */
    public n f72208h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f72209i;

    /* renamed from: j, reason: collision with root package name */
    public yd1.a f72210j;

    /* renamed from: k, reason: collision with root package name */
    public String f72211k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d presenterPinalytics, q networkStateStream, v viewResources, boolean z13, String str, String str2) {
        super(presenterPinalytics, networkStateStream);
        j storyImpressionHelper = new j(16, 0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        this.f72201a = viewResources;
        this.f72202b = null;
        this.f72203c = storyImpressionHelper;
        this.f72204d = 0;
        this.f72205e = z13;
        this.f72206f = str;
        this.f72207g = str2;
        this.f72211k = "";
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        he1.a view = (he1.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        r3(this.f72202b);
    }

    public final void q3(vh story, Integer num) {
        Intrinsics.checkNotNullParameter(story, "story");
        this.f72202b = story;
        this.f72209i = num;
        r3(story);
    }

    public final void r3(vh vhVar) {
        vh vhVar2;
        String str;
        String title;
        String str2;
        e eVar;
        je1.a aVar;
        if (!isBound() || vhVar == null) {
            return;
        }
        List list = vhVar.f42865w;
        Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof f30) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() >= 3) {
            List subList = arrayList.subList(0, 3);
            ArrayList arrayList2 = new ArrayList(g0.q(subList, 10));
            int i13 = 0;
            for (Object obj2 : subList) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    f0.p();
                    throw null;
                }
                f30 f30Var = (f30) obj2;
                he1.a aVar2 = (he1.a) getView();
                String url = bs1.c.B0(f30Var);
                Intrinsics.f(url);
                String b13 = po1.c.b(f30Var);
                if (b13 == null || (str2 = StringsKt.d0(DecimalFormatSymbols.getInstance().getMonetaryDecimalSeparator(), b13, b13)) == null) {
                    str2 = "";
                }
                String price = str2;
                je1.a aVar3 = (je1.a) aVar2;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(url, "pinImageUrl");
                if (i13 == 0) {
                    eVar = aVar3.f75845c;
                } else if (i13 == 1) {
                    eVar = aVar3.f75847e;
                } else if (i13 != 2) {
                    aVar = aVar3;
                    aVar.setContentDescription(f30Var.c4());
                    arrayList2.add(aVar2);
                    i13 = i14;
                } else {
                    eVar = aVar3.f75846d;
                }
                ColorDrawable placeholder = aVar3.f75848f;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                aVar = aVar3;
                ((WebImageView) eVar.f134631a).V1(url, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : placeholder, (r18 & 64) != 0 ? null : null, null);
                Intrinsics.checkNotNullParameter(price, "price");
                sl1.j jVar = (sl1.j) eVar.f134633c;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(price, "price");
                jVar.setText(price);
                bs1.c.R1(jVar, price.length() > 0);
                jVar.setContentDescription(price);
                aVar.setContentDescription(f30Var.c4());
                arrayList2.add(aVar2);
                i13 = i14;
            }
            kj kjVar = vhVar.f42855m;
            if (kjVar != null && (title = kjVar.a()) != null) {
                je1.a aVar4 = (je1.a) ((he1.a) getView());
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                aVar4.f75849g.setText(title);
            }
            je1.a aVar5 = (je1.a) ((he1.a) getView());
            aVar5.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            aVar5.setOnClickListener(new b(this, 17));
            je1.a aVar6 = (je1.a) ((he1.a) getView());
            aVar6.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            aVar6.f75852j = this;
            if (this.f72205e) {
                he1.a aVar7 = (he1.a) getView();
                wy0 h10 = vhVar.f42857o.h();
                if (h10 != null) {
                    String avatarImageUrl = dl2.b.s0(h10);
                    String name = dl2.b.i1(h10);
                    Integer q23 = h10.q2();
                    Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
                    yd1.a brandAvatarViewModel = new yd1.a(avatarImageUrl, name, q23.intValue(), dl2.b.W1(h10), ((yk1.a) this.f72201a).f139224a.getDimensionPixelSize(mz1.c.shopping_avatar_verified_icon_size), false, 96);
                    je1.a aVar8 = (je1.a) aVar7;
                    aVar8.getClass();
                    Intrinsics.checkNotNullParameter(brandAvatarViewModel, "brandAvatarViewModel");
                    Intrinsics.checkNotNullParameter(avatarImageUrl, "avatarImageUrl");
                    Intrinsics.checkNotNullParameter(name, "name");
                    yd1.a brandAvatarViewModel2 = new yd1.a(brandAvatarViewModel.f138783d, brandAvatarViewModel.f138782c, brandAvatarViewModel.f138784e, false, avatarImageUrl, brandAvatarViewModel.f138786g, name);
                    e eVar2 = aVar8.f75845c;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(brandAvatarViewModel2, "brandAvatarViewModel");
                    ((GestaltAvatar) eVar2.f134634d).H2(new xd1.d(brandAvatarViewModel2, 0));
                    String uid = h10.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    this.f72211k = uid;
                    this.f72210j = brandAvatarViewModel;
                }
            }
            if (this.f72208h == null && (vhVar2 = this.f72202b) != null && (str = vhVar2.f42853k) != null) {
                this.f72208h = n.f(new vd0.c(str));
            }
            n nVar = this.f72208h;
            if (nVar != null) {
                nVar.g();
            }
            this.f72204d = 3;
            je1.a aVar9 = (je1.a) ((he1.a) getView());
            aVar9.f75853k = true;
            bs1.c.R1(aVar9, true);
            aVar9.requestLayout();
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        he1.a view = (he1.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        r3(this.f72202b);
    }
}
