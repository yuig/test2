package rq;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.lv;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z7;
import com.pinterest.component.avatarpairs.AvatarPair;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.text.GestaltText;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k0 extends j {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f109323r = 0;

    /* renamed from: c, reason: collision with root package name */
    public final String f109324c;

    /* renamed from: d, reason: collision with root package name */
    public x02.x2 f109325d;

    /* renamed from: e, reason: collision with root package name */
    public lh0.a0 f109326e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltDivider f109327f;

    /* renamed from: g, reason: collision with root package name */
    public ConstraintLayout f109328g;

    /* renamed from: h, reason: collision with root package name */
    public AvatarPair f109329h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f109330i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltText f109331j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltAvatar f109332k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltText f109333l;

    /* renamed from: m, reason: collision with root package name */
    public GestaltText f109334m;

    /* renamed from: n, reason: collision with root package name */
    public GestaltText f109335n;

    /* renamed from: o, reason: collision with root package name */
    public View f109336o;

    /* renamed from: p, reason: collision with root package name */
    public z7 f109337p;

    /* renamed from: q, reason: collision with root package name */
    public wy0 f109338q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, String str) {
        super(context, null, 0, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109324c = str;
    }

    public final void b() {
        bs1.c.X0(this);
        LinearLayout linearLayout = this.f109330i;
        if (linearLayout == null) {
            Intrinsics.r("boardConversationThreadLastMessageContainer");
            throw null;
        }
        bs1.c.R1(linearLayout, false);
        ConstraintLayout constraintLayout = this.f109328g;
        if (constraintLayout == null) {
            Intrinsics.r("emptyBoardConversationThreadContainer");
            throw null;
        }
        bs1.c.R1(constraintLayout, false);
        GestaltDivider gestaltDivider = this.f109327f;
        if (gestaltDivider != null) {
            gestaltDivider.a(o.f109414u);
        } else {
            Intrinsics.r("boardConversationThreadModuleDivider");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void bindData(boolean z13, f30 pin, b11.g config, nx.d0 pinalytics) {
        v7 D3;
        v7 D32;
        List I0;
        mv s13;
        boolean z14;
        mv s14;
        wy0 f13;
        mv s15;
        wy0 L;
        mv s16;
        wy0 L2;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        super.bindData(z13, pin, config, pinalytics);
        z7 E3 = pin.E3();
        this.f109337p = E3;
        final int i13 = 1;
        if (E3 != null && (s14 = E3.s()) != null && s14.L() != null && (f13 = ((b60.d) com.bumptech.glide.d.E()).f()) != null) {
            z7 z7Var = this.f109337p;
            if (z7Var == null || (s16 = z7Var.s()) == null || (L2 = s16.L()) == null || !dl2.b.S1(L2, f13.getUid())) {
                z7 z7Var2 = this.f109337p;
                if (z7Var2 == null || (s15 = z7Var2.s()) == null || (L = s15.L()) == null) {
                    f13 = null;
                } else {
                    x02.x2 x2Var = this.f109325d;
                    if (x2Var == null) {
                        Intrinsics.r("userRepository");
                        throw null;
                    }
                    String uid = L.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    f13 = (wy0) x2Var.P(uid).f();
                }
            }
            this.f109338q = f13;
        }
        lh0.a0 a0Var = this.f109326e;
        if (a0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (!g4.u.z0(pin, this.f109324c, a0Var)) {
            b();
            return;
        }
        z7 z7Var3 = this.f109337p;
        if (z7Var3 != null) {
            Integer u13 = z7Var3.u();
            Intrinsics.checkNotNullExpressionValue(u13, "getNumMessagesInThread(...)");
            final int i14 = 0;
            if (u13.intValue() > 0) {
                LinearLayout linearLayout = this.f109330i;
                if (linearLayout == null) {
                    Intrinsics.r("boardConversationThreadLastMessageContainer");
                    throw null;
                }
                linearLayout.setVisibility(0);
                z7 z7Var4 = this.f109337p;
                if (z7Var4 != null && (s13 = z7Var4.s()) != null) {
                    GestaltAvatar gestaltAvatar = this.f109332k;
                    if (gestaltAvatar == null) {
                        Intrinsics.r("boardConversationThreadLastMessageUserAvatar");
                        throw null;
                    }
                    wy0 wy0Var = this.f109338q;
                    if (wy0Var != null) {
                        gestaltAvatar.H2(o.f109415v);
                        gestaltAvatar.H2(new y(1, wy0Var));
                    }
                    View view = this.f109336o;
                    if (view == null) {
                        Intrinsics.r("boardConversationThreadLastMessageIsRead");
                        throw null;
                    }
                    wy0 L3 = s13.L();
                    wy0 f14 = ((b60.d) com.bumptech.glide.d.E()).f();
                    if (f14 != null) {
                        z14 = dl2.b.S1(f14, L3 != null ? L3.getUid() : null);
                    } else {
                        z14 = false;
                    }
                    bs1.c.R1(view, !z14);
                    GestaltText gestaltText = this.f109333l;
                    if (gestaltText == null) {
                        Intrinsics.r("boardConversationThreadLastMessageUserName");
                        throw null;
                    }
                    gestaltText.i(new j0(this, i14));
                    GestaltText gestaltText2 = this.f109334m;
                    if (gestaltText2 == null) {
                        Intrinsics.r("boardConversationThreadLastMessageText");
                        throw null;
                    }
                    gestaltText2.i(new ba.s(17, this, s13));
                    GestaltText gestaltText3 = this.f109335n;
                    if (gestaltText3 == null) {
                        Intrinsics.r("boardConversationThreadLastMessageTimestamp");
                        throw null;
                    }
                    gestaltText3.i(new j0(this, i13));
                    GestaltText gestaltText4 = this.f109331j;
                    if (gestaltText4 == null) {
                        Intrinsics.r("boardConversationThreadLastMessageHeader");
                        throw null;
                    }
                    gestaltText4.i(new ba.s(18, linearLayout, this));
                }
                linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: rq.i0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k0 f109270b;

                    {
                        this.f109270b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String n13;
                        int i15 = i14;
                        k0 this$0 = this.f109270b;
                        switch (i15) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                z7 z7Var5 = this$0.f109337p;
                                if (z7Var5 != null) {
                                    oo1.j jVar = oo1.j.f96854a;
                                    String n14 = z7Var5.n();
                                    Intrinsics.f(n14);
                                    mv l13 = z7Var5.l();
                                    Intrinsics.f(l13);
                                    oo1.j.n(n14, l13);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                z7 z7Var6 = this$0.f109337p;
                                if (z7Var6 != null && (n13 = z7Var6.n()) != null && n13.length() != 0) {
                                    oo1.j jVar2 = oo1.j.f96854a;
                                    String n15 = z7Var6.n();
                                    Intrinsics.f(n15);
                                    lv C = mv.C();
                                    C.i("");
                                    C.e(this$0.getPin());
                                    C.g(((b60.d) com.bumptech.glide.d.E()).f());
                                    mv a13 = C.a();
                                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                                    oo1.j.n(n15, a13);
                                    break;
                                }
                                break;
                        }
                    }
                });
                ConstraintLayout constraintLayout = this.f109328g;
                if (constraintLayout == null) {
                    Intrinsics.r("emptyBoardConversationThreadContainer");
                    throw null;
                }
                constraintLayout.setVisibility(8);
            } else {
                ConstraintLayout constraintLayout2 = this.f109328g;
                if (constraintLayout2 == null) {
                    Intrinsics.r("emptyBoardConversationThreadContainer");
                    throw null;
                }
                constraintLayout2.setVisibility(0);
                ConstraintLayout constraintLayout3 = this.f109328g;
                if (constraintLayout3 == null) {
                    Intrinsics.r("emptyBoardConversationThreadContainer");
                    throw null;
                }
                constraintLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: rq.i0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k0 f109270b;

                    {
                        this.f109270b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String n13;
                        int i15 = i13;
                        k0 this$0 = this.f109270b;
                        switch (i15) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                z7 z7Var5 = this$0.f109337p;
                                if (z7Var5 != null) {
                                    oo1.j jVar = oo1.j.f96854a;
                                    String n14 = z7Var5.n();
                                    Intrinsics.f(n14);
                                    mv l13 = z7Var5.l();
                                    Intrinsics.f(l13);
                                    oo1.j.n(n14, l13);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                z7 z7Var6 = this$0.f109337p;
                                if (z7Var6 != null && (n13 = z7Var6.n()) != null && n13.length() != 0) {
                                    oo1.j jVar2 = oo1.j.f96854a;
                                    String n15 = z7Var6.n();
                                    Intrinsics.f(n15);
                                    lv C = mv.C();
                                    C.i("");
                                    C.e(this$0.getPin());
                                    C.g(((b60.d) com.bumptech.glide.d.E()).f());
                                    mv a13 = C.a();
                                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                                    oo1.j.n(n15, a13);
                                    break;
                                }
                                break;
                        }
                    }
                });
                f30 pin2 = getPin();
                LinkedHashSet linkedHashSet = (pin2 == null || (D32 = pin2.D3()) == null || (I0 = D32.I0()) == null) ? new LinkedHashSet() : CollectionsKt.I0(I0);
                f30 pin3 = getPin();
                linkedHashSet.add((pin3 == null || (D3 = pin3.D3()) == null) ? null : D3.k1());
                AvatarPair avatarPair = this.f109329h;
                if (avatarPair == null) {
                    Intrinsics.r("emptyBoardConversationThreadAvatarPair");
                    throw null;
                }
                List users = CollectionsKt.F0(linkedHashSet);
                kotlin.collections.q0 emailList = kotlin.collections.q0.f80391a;
                Intrinsics.checkNotNullParameter(avatarPair, "<this>");
                Intrinsics.checkNotNullParameter(users, "users");
                Intrinsics.checkNotNullParameter(emailList, "emailList");
                pp2.a.S0(avatarPair, users, emailList);
                AvatarPair avatarPair2 = this.f109329h;
                if (avatarPair2 == null) {
                    Intrinsics.r("emptyBoardConversationThreadAvatarPair");
                    throw null;
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                rl1.g h10 = rl1.n.h(context);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                avatarPair2.Z(h10, rl1.n.d(context2));
                LinearLayout linearLayout2 = this.f109330i;
                if (linearLayout2 == null) {
                    Intrinsics.r("boardConversationThreadLastMessageContainer");
                    throw null;
                }
                linearLayout2.setVisibility(8);
            }
        }
        bs1.c.U1(this);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        View.inflate(getContext(), n80.d.pin_closeup_board_conversation_thread_module, this);
        View findViewById = findViewById(n80.c.pin_closeup_board_conversation_thread_module_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f109327f = (GestaltDivider) findViewById;
        View findViewById2 = findViewById(n80.c.pin_closeup_board_conversation_thread_module_empty_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f109328g = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(n80.c.pin_closeup_board_conversation_thread_module_empty_avatar_pair);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f109329h = (AvatarPair) findViewById3;
        View findViewById4 = findViewById(n80.c.pin_closeup_board_conversation_thread_module_empty_message);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        View findViewById5 = findViewById(n80.c.pin_closeup_board_conversation_thread_module_last_message_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f109330i = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(n80.c.pin_closeup_board_conversation_thread_module_last_message_header);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f109331j = (GestaltText) findViewById6;
        View findViewById7 = findViewById(n80.c.pin_closeup_board_conversation_thread_module_last_message_avatars);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f109332k = (GestaltAvatar) findViewById7;
        View findViewById8 = findViewById(n80.c.pin_closeup_board_conversation_thread_module_last_message_username);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f109333l = (GestaltText) findViewById8;
        View findViewById9 = findViewById(n80.c.pin_closeup_board_conversation_thread_module_last_message_text);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f109334m = (GestaltText) findViewById9;
        View findViewById10 = findViewById(n80.c.pin_closeup_board_conversation_thread_module_last_message_timestamp);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f109335n = (GestaltText) findViewById10;
        View findViewById11 = findViewById(n80.c.pin_closeup_board_conversation_thread_module_last_message_is_read);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f109336o = findViewById11;
        b();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.CONVERSATION_MESSAGES;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return bs1.c.o1(this);
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.updatePin(pin);
    }
}
