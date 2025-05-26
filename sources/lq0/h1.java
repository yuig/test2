package lq0;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import so.jb;

/* loaded from: classes5.dex */
public final class h1 extends LinearLayout implements nx.a, yk1.n, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f84318a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84319b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f84320c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f84321d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f84322e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f84323f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f84324g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f84325h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f84326i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f84327j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f84328k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltText f84329l;

    /* renamed from: m, reason: collision with root package name */
    public final oo1.j f84330m;

    /* renamed from: n, reason: collision with root package name */
    public final Regex f84331n;

    /* renamed from: o, reason: collision with root package name */
    public b60.b f84332o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f84319b) {
            this.f84319b = true;
            kh2.a1.F(this, (b60.b) ((jb) ((i1) generatedComponent())).f113483a.f113850p0.get());
        }
        this.f84331n = new Regex("default_\\d+.png");
        LayoutInflater.from(context).inflate(xc0.f.conversation_details_container_combined, (ViewGroup) this, true);
        View findViewById = findViewById(xc0.e.conversation_details_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f84320c = (ViewGroup) findViewById;
        View findViewById2 = findViewById(xc0.e.two_participant_avatar_group);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f84321d = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(xc0.e.group_chat_avatar_group);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f84322e = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(xc0.e.names_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f84323f = (GestaltText) findViewById4;
        View findViewById5 = findViewById(xc0.e.two_participant_details_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f84324g = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(xc0.e.username);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f84325h = (GestaltText) findViewById6;
        View findViewById7 = findViewById(xc0.e.followers);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f84326i = (GestaltText) findViewById7;
        View findViewById8 = findViewById(xc0.e.following);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f84327j = (GestaltText) findViewById8;
        View findViewById9 = findViewById(xc0.e.isfollowing);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f84328k = (GestaltText) findViewById9;
        View findViewById10 = findViewById(xc0.e.beginning_text);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f84329l = (GestaltText) findViewById10;
        this.f84330m = oo1.j.f96854a;
    }

    public final void a(List users) {
        z40.d0 d0Var;
        Object obj;
        String quantityString;
        Intrinsics.checkNotNullParameter(users, "users");
        boolean z13 = users.size() >= 3;
        GestaltText gestaltText = this.f84323f;
        oo1.j jVar = this.f84330m;
        if (z13) {
            List list = users;
            List x03 = CollectionsKt.x0(list, new s4.g(this, 5));
            z40.d0 d0Var2 = (z40.d0) CollectionsKt.U(0, x03);
            z40.d0 d0Var3 = (z40.d0) CollectionsKt.U(1, x03);
            z40.d0 d0Var4 = (z40.d0) CollectionsKt.U(2, x03);
            if (d0Var2 != null) {
                g(d0Var2, xc0.e.member1);
            }
            if (d0Var3 != null) {
                g(d0Var3, xc0.e.member2);
            }
            if (d0Var4 != null) {
                g(d0Var4, xc0.e.member3);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!Intrinsics.d(((z40.d0) obj2).a(), ((b60.d) b()).g())) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() == 2) {
                Resources resources = getResources();
                int i13 = xc0.i.new_conversation_member_names_two;
                z40.d0 d0Var5 = (z40.d0) arrayList.get(0);
                jVar.getClass();
                quantityString = resources.getString(i13, oo1.j.h(d0Var5), oo1.j.h((z40.d0) arrayList.get(1)));
            } else {
                Resources resources2 = getResources();
                int i14 = xc0.h.new_conversation_member_names_more;
                int size = arrayList.size() - 3;
                jVar.getClass();
                quantityString = resources2.getQuantityString(i14, size, oo1.j.h(d0Var2), oo1.j.h(d0Var3), oo1.j.h(d0Var4), Integer.valueOf(users.size() - 3));
            }
            Intrinsics.f(quantityString);
            pk.a0.p(gestaltText, quantityString);
        } else {
            List list2 = users;
            Iterator it = list2.iterator();
            while (true) {
                d0Var = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.d(((z40.d0) obj).a(), ((b60.d) b()).g())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            z40.d0 d0Var6 = (z40.d0) obj;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (!Intrinsics.d(((z40.d0) obj3).a(), ((b60.d) b()).g())) {
                    arrayList2.add(obj3);
                }
            }
            z40.d0 d0Var7 = (z40.d0) CollectionsKt.firstOrNull(arrayList2);
            if (d0Var7 != null) {
                jVar.getClass();
                pk.a0.p(gestaltText, String.valueOf(oo1.j.h(d0Var7)));
                pk.a0.p(this.f84325h, a.a.j("@", d0Var7.g()));
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                pk.a0.p(this.f84326i, oo1.j.g(context, d0Var7.c()));
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Integer j13 = d0Var7.j();
                Intrinsics.checkNotNullParameter(context2, "context");
                Resources resources3 = context2.getResources();
                int i15 = m60.x0.plural_following_only_lowercase;
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(j13 != null ? j13.intValue() : 0);
                String string = resources3.getString(i15, objArr);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                pk.a0.p(this.f84327j, string);
                pk.a0.q(this.f84328k, Intrinsics.d(d0Var7.d(), Boolean.TRUE) ? bs1.c.j2(new String[0], xc0.i.new_conversation_following) : bs1.c.j2(new String[0], xc0.i.new_conversation_not_following));
                d0Var = d0Var7;
            }
            if (d0Var6 != null) {
                g(d0Var6, xc0.e.sender_image);
            }
            if (d0Var != null) {
                g(d0Var, xc0.e.receiver_image);
            }
        }
        bs1.c.R1(this.f84321d, !z13);
        bs1.c.R1(this.f84322e, z13);
        bs1.c.R1(this.f84324g, false);
        this.f84329l.i(n0.f84372l);
        bs1.c.R1(this.f84320c, true);
    }

    public final b60.b b() {
        b60.b bVar = this.f84332o;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("activeUserManager");
        throw null;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f84318a == null) {
            this.f84318a = new ye2.o(this);
        }
        return this.f84318a;
    }

    public final void g(z40.d0 d0Var, int i13) {
        oo1.j jVar = oo1.j.f96854a;
        String b13 = d0Var.b();
        if (b13 == null && (b13 = d0Var.e()) == null && (b13 = d0Var.k()) == null) {
            b13 = "";
        }
        GestaltAvatar gestaltAvatar = (GestaltAvatar) findViewById(i13);
        int i14 = 0;
        if (this.f84331n.a(b13) && gestaltAvatar != null) {
            gestaltAvatar.H2(new f1(d0Var, i14));
        }
        if (gestaltAvatar != null) {
            gestaltAvatar.H2(new g1(0, b13, d0Var));
        }
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        return new h32.i0(d4.CONVERSATION, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f84318a == null) {
            this.f84318a = new ye2.o(this);
        }
        return this.f84318a.generatedComponent();
    }
}
