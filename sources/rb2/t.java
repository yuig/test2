package rb2;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.component.avatarpairs.AvatarPair;
import com.pinterest.component.avatarpairs.AvatarPairUpdate;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kh2.b0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import so.jb;
import so.oa;
import x02.e1;
import z40.d0;

/* loaded from: classes4.dex */
public final class t extends LinearLayout implements yk1.n, af2.c {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f107203t = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f107204a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f107205b;

    /* renamed from: c, reason: collision with root package name */
    public final r f107206c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f107207d;

    /* renamed from: e, reason: collision with root package name */
    public final pb0.d f107208e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f107209f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f107210g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f107211h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f107212i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f107213j;

    /* renamed from: k, reason: collision with root package name */
    public final AvatarPair f107214k;

    /* renamed from: l, reason: collision with root package name */
    public final AvatarPairUpdate f107215l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltText f107216m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f107217n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f107218o;

    /* renamed from: p, reason: collision with root package name */
    public final m60.w f107219p;

    /* renamed from: q, reason: collision with root package name */
    public final b60.b f107220q;

    /* renamed from: r, reason: collision with root package name */
    public final tb0.h f107221r;

    /* renamed from: s, reason: collision with root package name */
    public final e1 f107222s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, r conversationInboxUpdater, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationInboxUpdater, "conversationInboxUpdater");
        if (!this.f107205b) {
            this.f107205b = true;
            jb jbVar = (jb) ((u) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f107208e = oaVar.j2();
            this.f107219p = (m60.w) oaVar.f113885r0.get();
            l10.b.a();
            this.f107220q = (b60.b) oaVar.f113850p0.get();
            this.f107221r = (tb0.h) oaVar.f113797m0.get();
            this.f107222s = (e1) oaVar.Ce.get();
        }
        this.f107206c = conversationInboxUpdater;
        this.f107207d = z13;
        LayoutInflater.from(context).inflate(nb2.c.list_cell_lego_conversation_inbox, (ViewGroup) this, true);
        if (z13) {
            setPadding(0, 0, context.getResources().getDimensionPixelSize(eo1.c.space_400), 0);
        }
        View findViewById = findViewById(nb2.b.conversation_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f107209f = (LinearLayout) findViewById;
        View findViewById2 = findViewById(nb2.b.badge_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f107210g = (ImageView) findViewById2;
        View findViewById3 = findViewById(nb2.b.unified_inbox_badge_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f107211h = (ImageView) findViewById3;
        View findViewById4 = findViewById(nb2.b.incoming_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f107212i = (ImageView) findViewById4;
        View findViewById5 = findViewById(nb2.b.outgoing_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f107213j = (ImageView) findViewById5;
        View findViewById6 = findViewById(nb2.b.lego_user_avatars);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f107214k = (AvatarPair) findViewById6;
        View findViewById7 = findViewById(nb2.b.lego_user_avatars_update);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f107215l = (AvatarPairUpdate) findViewById7;
        View findViewById8 = findViewById(nb2.b.conversation_title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f107216m = (GestaltText) findViewById8;
        View findViewById9 = findViewById(nb2.b.conversation_subtitle_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f107217n = (GestaltText) findViewById9;
        View findViewById10 = findViewById(nb2.b.timestamp_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f107218o = (GestaltText) findViewById10;
    }

    public final void a(z40.n nVar) {
        Object obj;
        Unit unit;
        String g13;
        String string;
        Boolean bool;
        String b13;
        String g14;
        String g15;
        String g16;
        if (nVar == null) {
            return;
        }
        z40.h d2 = nVar.d();
        if (d2 != null) {
            b60.b bVar = this.f107220q;
            if (bVar == null) {
                Intrinsics.r("activeUserManager");
                throw null;
            }
            wy0 f13 = ((b60.d) bVar).f();
            if (f13 != null) {
                String uid = f13.getUid();
                z40.g c13 = d2.c();
                bool = Boolean.valueOf(Intrinsics.d(uid, c13 != null ? c13.a() : null));
            } else {
                bool = null;
            }
            boolean o03 = com.bumptech.glide.d.o0(bool);
            z40.g c14 = !o03 ? d2.c() : null;
            if (d2.f() != null) {
                String string2 = getContext().getString(nb2.d.you);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                b13 = d2.f();
                if (b13 == null) {
                    b13 = "";
                }
                if (c14 != null) {
                    if (kh2.d.G0(nVar)) {
                        b13 = getContext().getString(nb2.d.conversation_user_and_message, c14.l(), b13);
                        Intrinsics.f(b13);
                    }
                } else if (o03) {
                    if (kh2.d.G0(nVar)) {
                        b13 = getContext().getString(nb2.d.conversation_user_and_message, string2, b13);
                    }
                    Intrinsics.f(b13);
                } else {
                    tb0.h hVar = this.f107221r;
                    if (hVar == null) {
                        Intrinsics.r("crashReporting");
                        throw null;
                    }
                    hVar.k("ConversationInboxAdapter: non-null message with null sender", e0.b(new Pair("Message", b13)));
                }
                obj = "Message";
            } else {
                ImageView imageView = this.f107213j;
                ImageView imageView2 = this.f107212i;
                if (o03) {
                    imageView2.setVisibility(8);
                    imageView.setVisibility(0);
                } else {
                    imageView2.setVisibility(0);
                    imageView.setVisibility(8);
                }
                z40.p pin = d2.getPin();
                if ((pin != null ? pin.a() : null) == null && d2.g() == null) {
                    z40.o e13 = d2.e();
                    if ((e13 != null ? e13.a() : null) != null) {
                        if (kh2.d.G0(nVar)) {
                            Context context = getContext();
                            int i13 = nb2.d.conversation_user_and_message_update;
                            Object[] objArr = new Object[2];
                            if (c14 == null || (g16 = c14.l()) == null) {
                                g16 = c14 != null ? c14.g() : null;
                            }
                            objArr[0] = g16;
                            objArr[1] = getResources().getString(nb2.d.sent_a_board);
                            b13 = context.getString(i13, objArr);
                            obj = "Message";
                        } else {
                            obj = "Message";
                            b13 = b(c14, o03, nb2.d.you_sent_board, nb2.d.sent_you_a_board_update, nb2.d.you_received_board_no_sender);
                        }
                        Intrinsics.f(b13);
                    } else {
                        obj = "Message";
                        z40.q b14 = d2.b();
                        if ((b14 != null ? b14.a() : null) != null) {
                            if (kh2.d.G0(nVar)) {
                                Context context2 = getContext();
                                int i14 = nb2.d.conversation_user_and_message_update;
                                Object[] objArr2 = new Object[2];
                                if (c14 == null || (g15 = c14.l()) == null) {
                                    g15 = c14 != null ? c14.g() : null;
                                }
                                objArr2[0] = g15;
                                objArr2[1] = getResources().getString(nb2.d.sent_a_profile);
                                b13 = context2.getString(i14, objArr2);
                            } else {
                                b13 = b(c14, o03, nb2.d.you_sent_user, nb2.d.sent_you_a_profile_update, nb2.d.you_received_user_no_sender);
                            }
                            Intrinsics.f(b13);
                        } else {
                            b13 = "...";
                        }
                    }
                } else {
                    obj = "Message";
                    if (kh2.d.G0(nVar)) {
                        Context context3 = getContext();
                        int i15 = nb2.d.conversation_user_and_message_update;
                        Object[] objArr3 = new Object[2];
                        if (c14 == null || (g14 = c14.l()) == null) {
                            g14 = c14 != null ? c14.g() : null;
                            if (g14 == null) {
                                g14 = getContext().getString(nb2.d.you);
                                Intrinsics.checkNotNullExpressionValue(g14, "getString(...)");
                            }
                        }
                        objArr3[0] = g14;
                        objArr3[1] = getResources().getString(nb2.d.sent_a_pin);
                        b13 = context3.getString(i15, objArr3);
                    } else {
                        b13 = b(c14, o03, nb2.d.you_sent_pin, nb2.d.sent_you_a_pin_update, nb2.d.you_received_pin_no_sender);
                    }
                    Intrinsics.f(b13);
                }
            }
            pk.a0.p(this.f107217n, b13);
            unit = Unit.f80348a;
        } else {
            obj = "Message";
            unit = null;
        }
        if (unit == null) {
            tb0.h hVar2 = this.f107221r;
            if (hVar2 == null) {
                Intrinsics.r("crashReporting");
                throw null;
            }
            hVar2.k("ConversationInboxListCell: null message with non-null conversation", e0.b(new Pair(obj, nVar.a())));
        }
        z40.h d13 = nVar.d();
        if (d13 != null) {
            this.f107218o.i(new fn1.k(this, d13, nVar, 21));
        }
        b60.b bVar2 = this.f107220q;
        if (bVar2 == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        wy0 f14 = ((b60.d) bVar2).f();
        String uid2 = f14 != null ? f14.getUid() : null;
        int size = kh2.d.J(nVar, uid2).size();
        AvatarPairUpdate avatarPairUpdate = this.f107215l;
        AvatarPair avatarPair = this.f107214k;
        if (size > 2) {
            avatarPair.setVisibility(8);
            avatarPairUpdate.setVisibility(0);
            b0.b2(avatarPairUpdate, kh2.d.J(nVar, uid2));
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            rl1.g h10 = rl1.n.h(context4);
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            avatarPairUpdate.X(h10, rl1.n.d(context5));
        } else {
            avatarPair.setVisibility(0);
            avatarPairUpdate.setVisibility(8);
            List J2 = kh2.d.J(nVar, uid2);
            List h13 = nVar.h();
            if (h13 == null) {
                h13 = q0.f80391a;
            }
            pp2.a.T0(avatarPair, J2, h13);
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            rl1.g h14 = rl1.n.h(context6);
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            avatarPair.Z(h14, rl1.n.h(context7));
            bc0.b position = bc0.b.Back;
            Intrinsics.checkNotNullParameter(position, "position");
            pe.i.K(avatarPair.L(position));
            avatarPair.a0();
        }
        b60.b bVar3 = this.f107220q;
        if (bVar3 == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        String uid3 = com.bumptech.glide.d.Q(bVar3).getUid();
        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
        List J3 = kh2.d.J(nVar, uid3);
        d0 d0Var = J3.isEmpty() ^ true ? (d0) J3.get(0) : null;
        if (d0Var == null) {
            List h15 = nVar.h();
            g13 = h15 != null ? CollectionsKt.Z(h15, ",", null, null, 0, null, null, 62) : null;
        } else {
            g13 = d0Var.f() == null ? d0Var.g() : d0Var.f();
        }
        if (J3.size() > 1) {
            int size2 = J3.size() - 1;
            string = getContext().getResources().getQuantityString(le0.g.content_description_user_avatar_multi, size2, g13, Integer.valueOf(size2));
        } else {
            string = getContext().getString(le0.h.content_description_user_avatar, g13);
        }
        this.f107209f.setContentDescription(string);
        String string3 = getContext().getString(x0.separator);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        b60.b bVar4 = this.f107220q;
        if (bVar4 == null) {
            Intrinsics.r("activeUserManager");
            throw null;
        }
        pk.a0.p(this.f107216m, oo1.j.d(nVar, string3, bVar4));
        setOnClickListener(new s(this, this.f107206c, nVar));
        e(kh2.d.K0(nVar));
    }

    public final String b(z40.g gVar, boolean z13, int i13, int i14, int i15) {
        if (z13) {
            String string = getContext().getString(i13);
            Intrinsics.f(string);
            return string;
        }
        String string2 = gVar != null ? getContext().getString(i14) : getContext().getString(i15);
        Intrinsics.f(string2);
        return string2;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f107204a == null) {
            this.f107204a = new ye2.o(this);
        }
        return this.f107204a;
    }

    public final void e(boolean z13) {
        GestaltText gestaltText = this.f107217n;
        GestaltText gestaltText2 = this.f107216m;
        if (z13) {
            gestaltText2.i(c.f107126z);
            gestaltText.i(c.A);
        } else {
            gestaltText2.i(c.f107124x);
            gestaltText.i(c.f107125y);
        }
        boolean z14 = this.f107207d;
        ImageView imageView = this.f107210g;
        ImageView imageView2 = this.f107211h;
        if (z14) {
            imageView2.setVisibility(z13 ? 4 : 0);
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(z13 ? 8 : 0);
            imageView2.setVisibility(8);
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f107204a == null) {
            this.f107204a = new ye2.o(this);
        }
        return this.f107204a.generatedComponent();
    }
}
