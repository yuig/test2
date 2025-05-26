package dq0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.wy0;
import com.pinterest.ui.grid.PinterestRecyclerView;
import dl1.s;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.a4;
import lh0.g1;
import lh0.p0;
import lh0.z3;
import lq0.b0;
import lq0.b1;
import lq0.e0;
import lq0.x;
import m60.u;
import m60.w;
import m60.x0;
import nx.d0;
import nx.j0;
import so.oa;
import x02.d1;
import x02.e1;
import x02.i2;
import x02.x2;
import xk2.v;

/* loaded from: classes5.dex */
public final class h extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final mv f56096a;

    /* renamed from: b, reason: collision with root package name */
    public final String f56097b;

    /* renamed from: c, reason: collision with root package name */
    public final wy0 f56098c;

    /* renamed from: d, reason: collision with root package name */
    public final e1 f56099d;

    /* renamed from: e, reason: collision with root package name */
    public final x2 f56100e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f56101f;

    /* renamed from: g, reason: collision with root package name */
    public final e02.a f56102g;

    /* renamed from: h, reason: collision with root package name */
    public final il1.a f56103h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f56104i;

    /* renamed from: j, reason: collision with root package name */
    public final c2 f56105j;

    /* renamed from: k, reason: collision with root package name */
    public final w f56106k;

    /* renamed from: l, reason: collision with root package name */
    public final b1 f56107l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f56108m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(mv message, String str, wy0 activeUser, e1 conversationMessageRepository, x2 userRepository, i2 pinRepository, e02.a boardRouter, il1.a fragmentFactory, j0 pinalytics, c2 sharesheetUtils, w eventManager, b1 b1Var) {
        super(0);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(activeUser, "activeUser");
        Intrinsics.checkNotNullParameter(conversationMessageRepository, "conversationMessageRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f56096a = message;
        this.f56097b = str;
        this.f56098c = activeUser;
        this.f56099d = conversationMessageRepository;
        this.f56100e = userRepository;
        this.f56101f = pinRepository;
        this.f56102g = boardRouter;
        this.f56103h = fragmentFactory;
        this.f56104i = pinalytics;
        this.f56105j = sharesheetUtils;
        this.f56106k = eventManager;
        this.f56107l = b1Var;
        this.f56108m = new ArrayList();
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        boolean z13;
        aq0.c view = (aq0.c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        b0 b0Var = (b0) view;
        Intrinsics.checkNotNullParameter(this, "presenter");
        b0Var.i().j(new lq0.d0(bs1.c.l1(b0Var) ? CollectionsKt.q0(oq0.b.f97215a) : oq0.b.f97215a, b0Var.f84250d, b0Var.f84251e, this));
        final int i13 = 1;
        bs1.c.R1(b0Var.i(), true);
        final int i14 = 0;
        b0Var.i().setVisibility(0);
        PinterestRecyclerView i15 = b0Var.i();
        b0Var.getContext();
        i15.l(new LinearLayoutManager(0, false));
        int i16 = e.f56083a[b0Var.f84252f.ordinal()];
        if (i16 == 1) {
            Map K = this.f56096a.K();
            if (K != null) {
                for (Map.Entry entry : K.entrySet()) {
                    Object key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                    Object value = entry.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                    xj2.c F = this.f56100e.P((String) key).F(new op0.a(12, new f((String) value, this)), new op0.a(13, g.f56087j), ck2.i.f27923c, ck2.i.f27924d);
                    Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                    addDisposable(F);
                }
            }
            ArrayList reactions = this.f56108m;
            Intrinsics.checkNotNullParameter(reactions, "reactions");
            Intrinsics.checkNotNullParameter(reactions, "reactions");
            x xVar = new x();
            xVar.f84452d = reactions;
            v vVar = b0Var.f84258l;
            Object value2 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((PinterestRecyclerView) value2).j(xVar);
            Object value3 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            bs1.c.R1((PinterestRecyclerView) value3, true);
            Object value4 = b0Var.f84259m.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            bs1.c.R1((LinearLayout) value4, false);
            b0Var.f84256j = xVar;
            return;
        }
        final int i17 = 2;
        if (i16 != 2) {
            return;
        }
        b0 b0Var2 = (b0) ((aq0.c) getView());
        Object value5 = b0Var2.f84259m.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        bs1.c.R1((LinearLayout) value5, true);
        Object value6 = b0Var2.f84261o.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        LinearLayout linearLayout = (LinearLayout) value6;
        mv mvVar = b0Var2.f84250d;
        bs1.c.R1(linearLayout, !((mvVar.M() == null || mvVar.H() == mv.c.EXTERNAL_SHARE_SYSTEM_MESSAGE) ? false : true));
        Object value7 = b0Var2.f84260n.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        bs1.c.R1((LinearLayout) value7, kh2.j.T(mvVar) != null);
        Object value8 = b0Var2.f84262p.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        bs1.c.R1((LinearLayout) value8, (mvVar.M() == null || mvVar.H() == mv.c.EXTERNAL_SHARE_SYSTEM_MESSAGE) ? false : true);
        Object value9 = b0Var2.f84263q.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        bs1.c.R1((LinearLayout) value9, b0Var2.f84253g);
        Object value10 = b0Var2.f84264r.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        LinearLayout linearLayout2 = (LinearLayout) value10;
        if (b0Var2.f84254h) {
            p0 p0Var = b0Var2.f84255i;
            if (p0Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) p0Var.f83455a;
            if (g1Var.o("sg_android_message_deletion", "enabled", z3Var) || g1Var.l("sg_android_message_deletion")) {
                z13 = true;
                bs1.c.R1(linearLayout2, z13);
                Object value11 = b0Var2.f84258l.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                bs1.c.R1((PinterestRecyclerView) value11, false);
                Object value12 = ((b0) ((aq0.c) getView())).f84260n.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                ((LinearLayout) value12).setOnClickListener(new View.OnClickListener(this) { // from class: dq0.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f56082b;

                    {
                        this.f56082b = presenter;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f30 I;
                        String M;
                        int i18 = 0;
                        int i19 = i14;
                        s sVar = null;
                        h this$0 = this.f56082b;
                        switch (i19) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                d0 d0Var = this$0.f56104i;
                                u0 u0Var = u0.PIN_REPIN_BUTTON;
                                g0 g0Var = g0.CONVERSATION_MESSAGES;
                                mv mvVar2 = this$0.f56096a;
                                d0Var.b0(u0Var, g0Var, kh2.j.T(mvVar2), false);
                                if (mvVar2.I() == null) {
                                    String T = kh2.j.T(mvVar2);
                                    if (T == null) {
                                        T = "";
                                    }
                                    I = (f30) this$0.f56101f.O(T);
                                } else {
                                    I = mvVar2.I();
                                }
                                e02.a.b(this$0.f56102g, I, false, this$0.f56103h, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                hf0.b.k(view2);
                                u.f85943a.d(new jc0.s());
                                if (!z.j(this$0.p3())) {
                                    String p33 = this$0.p3();
                                    mv mvVar3 = this$0.f56096a;
                                    String T2 = kh2.j.T(mvVar3);
                                    if (T2 == null || T2.length() == 0) {
                                        String H = kh2.j.H(mvVar3);
                                        if (H != null && H.length() != 0) {
                                            i18 = 1;
                                        } else if (mvVar3.O() != null) {
                                            i18 = 2;
                                        }
                                    }
                                    int value13 = y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue();
                                    String T3 = kh2.j.T(mvVar3);
                                    if (T3 == null || T3.length() == 0) {
                                        String H2 = kh2.j.H(mvVar3);
                                        if (H2 != null && H2.length() != 0) {
                                            sVar = mvVar3.D();
                                        } else if (mvVar3.O() != null) {
                                            sVar = mvVar3.O();
                                        }
                                    } else {
                                        sVar = mvVar3.I();
                                    }
                                    this$0.f56105j.s(p33, i18, value13, sVar);
                                    break;
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Object systemService = view2.getContext().getSystemService("clipboard");
                                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                                if (clipboardManager != null && (M = this$0.f56096a.M()) != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", M));
                                    Context context = kb0.a.f79058b;
                                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(view2.getResources().getString(x0.copied));
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                String str = this$0.f56097b;
                                if (str != null) {
                                    oo1.j jVar = oo1.j.f96854a;
                                    oo1.j.p(str, this$0.f56096a, "halfsheet_reply_button", true);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.f56106k.d(new jc0.s());
                                String uid = this$0.f56096a.getUid();
                                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                                this$0.f56106k.d(new jc0.v(new zp.l(uid, this$0.f56107l), false, 0L, 30));
                                break;
                        }
                    }
                });
                Object value13 = ((b0) ((aq0.c) getView())).f84261o.getValue();
                Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                ((LinearLayout) value13).setOnClickListener(new View.OnClickListener(this) { // from class: dq0.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f56082b;

                    {
                        this.f56082b = presenter;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f30 I;
                        String M;
                        int i18 = 0;
                        int i19 = i13;
                        s sVar = null;
                        h this$0 = this.f56082b;
                        switch (i19) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                d0 d0Var = this$0.f56104i;
                                u0 u0Var = u0.PIN_REPIN_BUTTON;
                                g0 g0Var = g0.CONVERSATION_MESSAGES;
                                mv mvVar2 = this$0.f56096a;
                                d0Var.b0(u0Var, g0Var, kh2.j.T(mvVar2), false);
                                if (mvVar2.I() == null) {
                                    String T = kh2.j.T(mvVar2);
                                    if (T == null) {
                                        T = "";
                                    }
                                    I = (f30) this$0.f56101f.O(T);
                                } else {
                                    I = mvVar2.I();
                                }
                                e02.a.b(this$0.f56102g, I, false, this$0.f56103h, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                hf0.b.k(view2);
                                u.f85943a.d(new jc0.s());
                                if (!z.j(this$0.p3())) {
                                    String p33 = this$0.p3();
                                    mv mvVar3 = this$0.f56096a;
                                    String T2 = kh2.j.T(mvVar3);
                                    if (T2 == null || T2.length() == 0) {
                                        String H = kh2.j.H(mvVar3);
                                        if (H != null && H.length() != 0) {
                                            i18 = 1;
                                        } else if (mvVar3.O() != null) {
                                            i18 = 2;
                                        }
                                    }
                                    int value132 = y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue();
                                    String T3 = kh2.j.T(mvVar3);
                                    if (T3 == null || T3.length() == 0) {
                                        String H2 = kh2.j.H(mvVar3);
                                        if (H2 != null && H2.length() != 0) {
                                            sVar = mvVar3.D();
                                        } else if (mvVar3.O() != null) {
                                            sVar = mvVar3.O();
                                        }
                                    } else {
                                        sVar = mvVar3.I();
                                    }
                                    this$0.f56105j.s(p33, i18, value132, sVar);
                                    break;
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Object systemService = view2.getContext().getSystemService("clipboard");
                                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                                if (clipboardManager != null && (M = this$0.f56096a.M()) != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", M));
                                    Context context = kb0.a.f79058b;
                                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(view2.getResources().getString(x0.copied));
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                String str = this$0.f56097b;
                                if (str != null) {
                                    oo1.j jVar = oo1.j.f96854a;
                                    oo1.j.p(str, this$0.f56096a, "halfsheet_reply_button", true);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.f56106k.d(new jc0.s());
                                String uid = this$0.f56096a.getUid();
                                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                                this$0.f56106k.d(new jc0.v(new zp.l(uid, this$0.f56107l), false, 0L, 30));
                                break;
                        }
                    }
                });
                Object value14 = ((b0) ((aq0.c) getView())).f84262p.getValue();
                Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                ((LinearLayout) value14).setOnClickListener(new View.OnClickListener(this) { // from class: dq0.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f56082b;

                    {
                        this.f56082b = presenter;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f30 I;
                        String M;
                        int i18 = 0;
                        int i19 = i17;
                        s sVar = null;
                        h this$0 = this.f56082b;
                        switch (i19) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                d0 d0Var = this$0.f56104i;
                                u0 u0Var = u0.PIN_REPIN_BUTTON;
                                g0 g0Var = g0.CONVERSATION_MESSAGES;
                                mv mvVar2 = this$0.f56096a;
                                d0Var.b0(u0Var, g0Var, kh2.j.T(mvVar2), false);
                                if (mvVar2.I() == null) {
                                    String T = kh2.j.T(mvVar2);
                                    if (T == null) {
                                        T = "";
                                    }
                                    I = (f30) this$0.f56101f.O(T);
                                } else {
                                    I = mvVar2.I();
                                }
                                e02.a.b(this$0.f56102g, I, false, this$0.f56103h, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                hf0.b.k(view2);
                                u.f85943a.d(new jc0.s());
                                if (!z.j(this$0.p3())) {
                                    String p33 = this$0.p3();
                                    mv mvVar3 = this$0.f56096a;
                                    String T2 = kh2.j.T(mvVar3);
                                    if (T2 == null || T2.length() == 0) {
                                        String H = kh2.j.H(mvVar3);
                                        if (H != null && H.length() != 0) {
                                            i18 = 1;
                                        } else if (mvVar3.O() != null) {
                                            i18 = 2;
                                        }
                                    }
                                    int value132 = y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue();
                                    String T3 = kh2.j.T(mvVar3);
                                    if (T3 == null || T3.length() == 0) {
                                        String H2 = kh2.j.H(mvVar3);
                                        if (H2 != null && H2.length() != 0) {
                                            sVar = mvVar3.D();
                                        } else if (mvVar3.O() != null) {
                                            sVar = mvVar3.O();
                                        }
                                    } else {
                                        sVar = mvVar3.I();
                                    }
                                    this$0.f56105j.s(p33, i18, value132, sVar);
                                    break;
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Object systemService = view2.getContext().getSystemService("clipboard");
                                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                                if (clipboardManager != null && (M = this$0.f56096a.M()) != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", M));
                                    Context context = kb0.a.f79058b;
                                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(view2.getResources().getString(x0.copied));
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                String str = this$0.f56097b;
                                if (str != null) {
                                    oo1.j jVar = oo1.j.f96854a;
                                    oo1.j.p(str, this$0.f56096a, "halfsheet_reply_button", true);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.f56106k.d(new jc0.s());
                                String uid = this$0.f56096a.getUid();
                                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                                this$0.f56106k.d(new jc0.v(new zp.l(uid, this$0.f56107l), false, 0L, 30));
                                break;
                        }
                    }
                });
                Object value15 = ((b0) ((aq0.c) getView())).f84263q.getValue();
                Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                final int i18 = 3;
                ((LinearLayout) value15).setOnClickListener(new View.OnClickListener(this) { // from class: dq0.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f56082b;

                    {
                        this.f56082b = presenter;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f30 I;
                        String M;
                        int i182 = 0;
                        int i19 = i18;
                        s sVar = null;
                        h this$0 = this.f56082b;
                        switch (i19) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                d0 d0Var = this$0.f56104i;
                                u0 u0Var = u0.PIN_REPIN_BUTTON;
                                g0 g0Var = g0.CONVERSATION_MESSAGES;
                                mv mvVar2 = this$0.f56096a;
                                d0Var.b0(u0Var, g0Var, kh2.j.T(mvVar2), false);
                                if (mvVar2.I() == null) {
                                    String T = kh2.j.T(mvVar2);
                                    if (T == null) {
                                        T = "";
                                    }
                                    I = (f30) this$0.f56101f.O(T);
                                } else {
                                    I = mvVar2.I();
                                }
                                e02.a.b(this$0.f56102g, I, false, this$0.f56103h, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                hf0.b.k(view2);
                                u.f85943a.d(new jc0.s());
                                if (!z.j(this$0.p3())) {
                                    String p33 = this$0.p3();
                                    mv mvVar3 = this$0.f56096a;
                                    String T2 = kh2.j.T(mvVar3);
                                    if (T2 == null || T2.length() == 0) {
                                        String H = kh2.j.H(mvVar3);
                                        if (H != null && H.length() != 0) {
                                            i182 = 1;
                                        } else if (mvVar3.O() != null) {
                                            i182 = 2;
                                        }
                                    }
                                    int value132 = y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue();
                                    String T3 = kh2.j.T(mvVar3);
                                    if (T3 == null || T3.length() == 0) {
                                        String H2 = kh2.j.H(mvVar3);
                                        if (H2 != null && H2.length() != 0) {
                                            sVar = mvVar3.D();
                                        } else if (mvVar3.O() != null) {
                                            sVar = mvVar3.O();
                                        }
                                    } else {
                                        sVar = mvVar3.I();
                                    }
                                    this$0.f56105j.s(p33, i182, value132, sVar);
                                    break;
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Object systemService = view2.getContext().getSystemService("clipboard");
                                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                                if (clipboardManager != null && (M = this$0.f56096a.M()) != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", M));
                                    Context context = kb0.a.f79058b;
                                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(view2.getResources().getString(x0.copied));
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                String str = this$0.f56097b;
                                if (str != null) {
                                    oo1.j jVar = oo1.j.f96854a;
                                    oo1.j.p(str, this$0.f56096a, "halfsheet_reply_button", true);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.f56106k.d(new jc0.s());
                                String uid = this$0.f56096a.getUid();
                                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                                this$0.f56106k.d(new jc0.v(new zp.l(uid, this$0.f56107l), false, 0L, 30));
                                break;
                        }
                    }
                });
                Object value16 = ((b0) ((aq0.c) getView())).f84264r.getValue();
                Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                final int i19 = 4;
                ((LinearLayout) value16).setOnClickListener(new View.OnClickListener(this) { // from class: dq0.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f56082b;

                    {
                        this.f56082b = presenter;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f30 I;
                        String M;
                        int i182 = 0;
                        int i192 = i19;
                        s sVar = null;
                        h this$0 = this.f56082b;
                        switch (i192) {
                            case 0:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                d0 d0Var = this$0.f56104i;
                                u0 u0Var = u0.PIN_REPIN_BUTTON;
                                g0 g0Var = g0.CONVERSATION_MESSAGES;
                                mv mvVar2 = this$0.f56096a;
                                d0Var.b0(u0Var, g0Var, kh2.j.T(mvVar2), false);
                                if (mvVar2.I() == null) {
                                    String T = kh2.j.T(mvVar2);
                                    if (T == null) {
                                        T = "";
                                    }
                                    I = (f30) this$0.f56101f.O(T);
                                } else {
                                    I = mvVar2.I();
                                }
                                e02.a.b(this$0.f56102g, I, false, this$0.f56103h, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                hf0.b.k(view2);
                                u.f85943a.d(new jc0.s());
                                if (!z.j(this$0.p3())) {
                                    String p33 = this$0.p3();
                                    mv mvVar3 = this$0.f56096a;
                                    String T2 = kh2.j.T(mvVar3);
                                    if (T2 == null || T2.length() == 0) {
                                        String H = kh2.j.H(mvVar3);
                                        if (H != null && H.length() != 0) {
                                            i182 = 1;
                                        } else if (mvVar3.O() != null) {
                                            i182 = 2;
                                        }
                                    }
                                    int value132 = y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue();
                                    String T3 = kh2.j.T(mvVar3);
                                    if (T3 == null || T3.length() == 0) {
                                        String H2 = kh2.j.H(mvVar3);
                                        if (H2 != null && H2.length() != 0) {
                                            sVar = mvVar3.D();
                                        } else if (mvVar3.O() != null) {
                                            sVar = mvVar3.O();
                                        }
                                    } else {
                                        sVar = mvVar3.I();
                                    }
                                    this$0.f56105j.s(p33, i182, value132, sVar);
                                    break;
                                }
                                break;
                            case 2:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Object systemService = view2.getContext().getSystemService("clipboard");
                                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                                if (clipboardManager != null && (M = this$0.f56096a.M()) != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", M));
                                    Context context = kb0.a.f79058b;
                                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(view2.getResources().getString(x0.copied));
                                    break;
                                }
                                break;
                            case 3:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                String str = this$0.f56097b;
                                if (str != null) {
                                    oo1.j jVar = oo1.j.f96854a;
                                    oo1.j.p(str, this$0.f56096a, "halfsheet_reply_button", true);
                                    break;
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.f56106k.d(new jc0.s());
                                String uid = this$0.f56096a.getUid();
                                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                                this$0.f56106k.d(new jc0.v(new zp.l(uid, this$0.f56107l), false, 0L, 30));
                                break;
                        }
                    }
                });
            }
        }
        z13 = false;
        bs1.c.R1(linearLayout2, z13);
        Object value112 = b0Var2.f84258l.getValue();
        Intrinsics.checkNotNullExpressionValue(value112, "getValue(...)");
        bs1.c.R1((PinterestRecyclerView) value112, false);
        Object value122 = ((b0) ((aq0.c) getView())).f84260n.getValue();
        Intrinsics.checkNotNullExpressionValue(value122, "getValue(...)");
        ((LinearLayout) value122).setOnClickListener(new View.OnClickListener(this) { // from class: dq0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f56082b;

            {
                this.f56082b = presenter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f30 I;
                String M;
                int i182 = 0;
                int i192 = i14;
                s sVar = null;
                h this$0 = this.f56082b;
                switch (i192) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        d0 d0Var = this$0.f56104i;
                        u0 u0Var = u0.PIN_REPIN_BUTTON;
                        g0 g0Var = g0.CONVERSATION_MESSAGES;
                        mv mvVar2 = this$0.f56096a;
                        d0Var.b0(u0Var, g0Var, kh2.j.T(mvVar2), false);
                        if (mvVar2.I() == null) {
                            String T = kh2.j.T(mvVar2);
                            if (T == null) {
                                T = "";
                            }
                            I = (f30) this$0.f56101f.O(T);
                        } else {
                            I = mvVar2.I();
                        }
                        e02.a.b(this$0.f56102g, I, false, this$0.f56103h, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        hf0.b.k(view2);
                        u.f85943a.d(new jc0.s());
                        if (!z.j(this$0.p3())) {
                            String p33 = this$0.p3();
                            mv mvVar3 = this$0.f56096a;
                            String T2 = kh2.j.T(mvVar3);
                            if (T2 == null || T2.length() == 0) {
                                String H = kh2.j.H(mvVar3);
                                if (H != null && H.length() != 0) {
                                    i182 = 1;
                                } else if (mvVar3.O() != null) {
                                    i182 = 2;
                                }
                            }
                            int value132 = y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue();
                            String T3 = kh2.j.T(mvVar3);
                            if (T3 == null || T3.length() == 0) {
                                String H2 = kh2.j.H(mvVar3);
                                if (H2 != null && H2.length() != 0) {
                                    sVar = mvVar3.D();
                                } else if (mvVar3.O() != null) {
                                    sVar = mvVar3.O();
                                }
                            } else {
                                sVar = mvVar3.I();
                            }
                            this$0.f56105j.s(p33, i182, value132, sVar);
                            break;
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Object systemService = view2.getContext().getSystemService("clipboard");
                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                        if (clipboardManager != null && (M = this$0.f56096a.M()) != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", M));
                            Context context = kb0.a.f79058b;
                            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(view2.getResources().getString(x0.copied));
                            break;
                        }
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str = this$0.f56097b;
                        if (str != null) {
                            oo1.j jVar = oo1.j.f96854a;
                            oo1.j.p(str, this$0.f56096a, "halfsheet_reply_button", true);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f56106k.d(new jc0.s());
                        String uid = this$0.f56096a.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        this$0.f56106k.d(new jc0.v(new zp.l(uid, this$0.f56107l), false, 0L, 30));
                        break;
                }
            }
        });
        Object value132 = ((b0) ((aq0.c) getView())).f84261o.getValue();
        Intrinsics.checkNotNullExpressionValue(value132, "getValue(...)");
        ((LinearLayout) value132).setOnClickListener(new View.OnClickListener(this) { // from class: dq0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f56082b;

            {
                this.f56082b = presenter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f30 I;
                String M;
                int i182 = 0;
                int i192 = i13;
                s sVar = null;
                h this$0 = this.f56082b;
                switch (i192) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        d0 d0Var = this$0.f56104i;
                        u0 u0Var = u0.PIN_REPIN_BUTTON;
                        g0 g0Var = g0.CONVERSATION_MESSAGES;
                        mv mvVar2 = this$0.f56096a;
                        d0Var.b0(u0Var, g0Var, kh2.j.T(mvVar2), false);
                        if (mvVar2.I() == null) {
                            String T = kh2.j.T(mvVar2);
                            if (T == null) {
                                T = "";
                            }
                            I = (f30) this$0.f56101f.O(T);
                        } else {
                            I = mvVar2.I();
                        }
                        e02.a.b(this$0.f56102g, I, false, this$0.f56103h, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        hf0.b.k(view2);
                        u.f85943a.d(new jc0.s());
                        if (!z.j(this$0.p3())) {
                            String p33 = this$0.p3();
                            mv mvVar3 = this$0.f56096a;
                            String T2 = kh2.j.T(mvVar3);
                            if (T2 == null || T2.length() == 0) {
                                String H = kh2.j.H(mvVar3);
                                if (H != null && H.length() != 0) {
                                    i182 = 1;
                                } else if (mvVar3.O() != null) {
                                    i182 = 2;
                                }
                            }
                            int value1322 = y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue();
                            String T3 = kh2.j.T(mvVar3);
                            if (T3 == null || T3.length() == 0) {
                                String H2 = kh2.j.H(mvVar3);
                                if (H2 != null && H2.length() != 0) {
                                    sVar = mvVar3.D();
                                } else if (mvVar3.O() != null) {
                                    sVar = mvVar3.O();
                                }
                            } else {
                                sVar = mvVar3.I();
                            }
                            this$0.f56105j.s(p33, i182, value1322, sVar);
                            break;
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Object systemService = view2.getContext().getSystemService("clipboard");
                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                        if (clipboardManager != null && (M = this$0.f56096a.M()) != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", M));
                            Context context = kb0.a.f79058b;
                            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(view2.getResources().getString(x0.copied));
                            break;
                        }
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str = this$0.f56097b;
                        if (str != null) {
                            oo1.j jVar = oo1.j.f96854a;
                            oo1.j.p(str, this$0.f56096a, "halfsheet_reply_button", true);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f56106k.d(new jc0.s());
                        String uid = this$0.f56096a.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        this$0.f56106k.d(new jc0.v(new zp.l(uid, this$0.f56107l), false, 0L, 30));
                        break;
                }
            }
        });
        Object value142 = ((b0) ((aq0.c) getView())).f84262p.getValue();
        Intrinsics.checkNotNullExpressionValue(value142, "getValue(...)");
        ((LinearLayout) value142).setOnClickListener(new View.OnClickListener(this) { // from class: dq0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f56082b;

            {
                this.f56082b = presenter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f30 I;
                String M;
                int i182 = 0;
                int i192 = i17;
                s sVar = null;
                h this$0 = this.f56082b;
                switch (i192) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        d0 d0Var = this$0.f56104i;
                        u0 u0Var = u0.PIN_REPIN_BUTTON;
                        g0 g0Var = g0.CONVERSATION_MESSAGES;
                        mv mvVar2 = this$0.f56096a;
                        d0Var.b0(u0Var, g0Var, kh2.j.T(mvVar2), false);
                        if (mvVar2.I() == null) {
                            String T = kh2.j.T(mvVar2);
                            if (T == null) {
                                T = "";
                            }
                            I = (f30) this$0.f56101f.O(T);
                        } else {
                            I = mvVar2.I();
                        }
                        e02.a.b(this$0.f56102g, I, false, this$0.f56103h, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        hf0.b.k(view2);
                        u.f85943a.d(new jc0.s());
                        if (!z.j(this$0.p3())) {
                            String p33 = this$0.p3();
                            mv mvVar3 = this$0.f56096a;
                            String T2 = kh2.j.T(mvVar3);
                            if (T2 == null || T2.length() == 0) {
                                String H = kh2.j.H(mvVar3);
                                if (H != null && H.length() != 0) {
                                    i182 = 1;
                                } else if (mvVar3.O() != null) {
                                    i182 = 2;
                                }
                            }
                            int value1322 = y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue();
                            String T3 = kh2.j.T(mvVar3);
                            if (T3 == null || T3.length() == 0) {
                                String H2 = kh2.j.H(mvVar3);
                                if (H2 != null && H2.length() != 0) {
                                    sVar = mvVar3.D();
                                } else if (mvVar3.O() != null) {
                                    sVar = mvVar3.O();
                                }
                            } else {
                                sVar = mvVar3.I();
                            }
                            this$0.f56105j.s(p33, i182, value1322, sVar);
                            break;
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Object systemService = view2.getContext().getSystemService("clipboard");
                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                        if (clipboardManager != null && (M = this$0.f56096a.M()) != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", M));
                            Context context = kb0.a.f79058b;
                            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(view2.getResources().getString(x0.copied));
                            break;
                        }
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str = this$0.f56097b;
                        if (str != null) {
                            oo1.j jVar = oo1.j.f96854a;
                            oo1.j.p(str, this$0.f56096a, "halfsheet_reply_button", true);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f56106k.d(new jc0.s());
                        String uid = this$0.f56096a.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        this$0.f56106k.d(new jc0.v(new zp.l(uid, this$0.f56107l), false, 0L, 30));
                        break;
                }
            }
        });
        Object value152 = ((b0) ((aq0.c) getView())).f84263q.getValue();
        Intrinsics.checkNotNullExpressionValue(value152, "getValue(...)");
        final int i182 = 3;
        ((LinearLayout) value152).setOnClickListener(new View.OnClickListener(this) { // from class: dq0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f56082b;

            {
                this.f56082b = presenter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f30 I;
                String M;
                int i1822 = 0;
                int i192 = i182;
                s sVar = null;
                h this$0 = this.f56082b;
                switch (i192) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        d0 d0Var = this$0.f56104i;
                        u0 u0Var = u0.PIN_REPIN_BUTTON;
                        g0 g0Var = g0.CONVERSATION_MESSAGES;
                        mv mvVar2 = this$0.f56096a;
                        d0Var.b0(u0Var, g0Var, kh2.j.T(mvVar2), false);
                        if (mvVar2.I() == null) {
                            String T = kh2.j.T(mvVar2);
                            if (T == null) {
                                T = "";
                            }
                            I = (f30) this$0.f56101f.O(T);
                        } else {
                            I = mvVar2.I();
                        }
                        e02.a.b(this$0.f56102g, I, false, this$0.f56103h, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        hf0.b.k(view2);
                        u.f85943a.d(new jc0.s());
                        if (!z.j(this$0.p3())) {
                            String p33 = this$0.p3();
                            mv mvVar3 = this$0.f56096a;
                            String T2 = kh2.j.T(mvVar3);
                            if (T2 == null || T2.length() == 0) {
                                String H = kh2.j.H(mvVar3);
                                if (H != null && H.length() != 0) {
                                    i1822 = 1;
                                } else if (mvVar3.O() != null) {
                                    i1822 = 2;
                                }
                            }
                            int value1322 = y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue();
                            String T3 = kh2.j.T(mvVar3);
                            if (T3 == null || T3.length() == 0) {
                                String H2 = kh2.j.H(mvVar3);
                                if (H2 != null && H2.length() != 0) {
                                    sVar = mvVar3.D();
                                } else if (mvVar3.O() != null) {
                                    sVar = mvVar3.O();
                                }
                            } else {
                                sVar = mvVar3.I();
                            }
                            this$0.f56105j.s(p33, i1822, value1322, sVar);
                            break;
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Object systemService = view2.getContext().getSystemService("clipboard");
                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                        if (clipboardManager != null && (M = this$0.f56096a.M()) != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", M));
                            Context context = kb0.a.f79058b;
                            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(view2.getResources().getString(x0.copied));
                            break;
                        }
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str = this$0.f56097b;
                        if (str != null) {
                            oo1.j jVar = oo1.j.f96854a;
                            oo1.j.p(str, this$0.f56096a, "halfsheet_reply_button", true);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f56106k.d(new jc0.s());
                        String uid = this$0.f56096a.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        this$0.f56106k.d(new jc0.v(new zp.l(uid, this$0.f56107l), false, 0L, 30));
                        break;
                }
            }
        });
        Object value162 = ((b0) ((aq0.c) getView())).f84264r.getValue();
        Intrinsics.checkNotNullExpressionValue(value162, "getValue(...)");
        final int i192 = 4;
        ((LinearLayout) value162).setOnClickListener(new View.OnClickListener(this) { // from class: dq0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f56082b;

            {
                this.f56082b = presenter;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                f30 I;
                String M;
                int i1822 = 0;
                int i1922 = i192;
                s sVar = null;
                h this$0 = this.f56082b;
                switch (i1922) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        d0 d0Var = this$0.f56104i;
                        u0 u0Var = u0.PIN_REPIN_BUTTON;
                        g0 g0Var = g0.CONVERSATION_MESSAGES;
                        mv mvVar2 = this$0.f56096a;
                        d0Var.b0(u0Var, g0Var, kh2.j.T(mvVar2), false);
                        if (mvVar2.I() == null) {
                            String T = kh2.j.T(mvVar2);
                            if (T == null) {
                                T = "";
                            }
                            I = (f30) this$0.f56101f.O(T);
                        } else {
                            I = mvVar2.I();
                        }
                        e02.a.b(this$0.f56102g, I, false, this$0.f56103h, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 4194296);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        hf0.b.k(view2);
                        u.f85943a.d(new jc0.s());
                        if (!z.j(this$0.p3())) {
                            String p33 = this$0.p3();
                            mv mvVar3 = this$0.f56096a;
                            String T2 = kh2.j.T(mvVar3);
                            if (T2 == null || T2.length() == 0) {
                                String H = kh2.j.H(mvVar3);
                                if (H != null && H.length() != 0) {
                                    i1822 = 1;
                                } else if (mvVar3.O() != null) {
                                    i1822 = 2;
                                }
                            }
                            int value1322 = y32.f.PIN_SHARE_ICON_IN_CONVERSATION.getValue();
                            String T3 = kh2.j.T(mvVar3);
                            if (T3 == null || T3.length() == 0) {
                                String H2 = kh2.j.H(mvVar3);
                                if (H2 != null && H2.length() != 0) {
                                    sVar = mvVar3.D();
                                } else if (mvVar3.O() != null) {
                                    sVar = mvVar3.O();
                                }
                            } else {
                                sVar = mvVar3.I();
                            }
                            this$0.f56105j.s(p33, i1822, value1322, sVar);
                            break;
                        }
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Object systemService = view2.getContext().getSystemService("clipboard");
                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                        if (clipboardManager != null && (M = this$0.f56096a.M()) != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", M));
                            Context context = kb0.a.f79058b;
                            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(view2.getResources().getString(x0.copied));
                            break;
                        }
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String str = this$0.f56097b;
                        if (str != null) {
                            oo1.j jVar = oo1.j.f96854a;
                            oo1.j.p(str, this$0.f56096a, "halfsheet_reply_button", true);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f56106k.d(new jc0.s());
                        String uid = this$0.f56096a.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        this$0.f56106k.d(new jc0.v(new zp.l(uid, this$0.f56107l), false, 0L, 30));
                        break;
                }
            }
        });
    }

    @Override // yk1.b
    public final void onUnbind() {
        super.onUnbind();
    }

    public final String p3() {
        mv mvVar = this.f56096a;
        String T = kh2.j.T(mvVar);
        if (T != null && T.length() != 0) {
            String T2 = kh2.j.T(mvVar);
            Intrinsics.f(T2);
            return T2;
        }
        String H = kh2.j.H(mvVar);
        if (H != null && H.length() != 0) {
            String H2 = kh2.j.H(mvVar);
            Intrinsics.f(H2);
            return H2;
        }
        if (mvVar.O() == null) {
            return "";
        }
        wy0 O = mvVar.O();
        Intrinsics.f(O);
        String uid = O.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }

    public final void q3(e0 reactionRowItemView) {
        Intrinsics.checkNotNullParameter(reactionRowItemView, "reactionRowItemView");
        oq0.a a13 = reactionRowItemView.a();
        HashMap hashMap = oq0.b.f97216b;
        mv mvVar = this.f56096a;
        Map K = mvVar.K();
        wy0 activeUser = this.f56098c;
        if (!Intrinsics.d(hashMap.get(K != null ? (String) K.get(activeUser.getUid()) : null), a13)) {
            Map K2 = mvVar.K();
            if (K2 != null) {
                K2.put(activeUser.getUid(), oq0.b.f97217c.get(reactionRowItemView.a()));
            }
            Object value = ((xk2.k) reactionRowItemView.f84306c).getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            d7.b.A0(((ImageView) value).getBackground(), bs1.c.B(reactionRowItemView, xc0.b.message_reaction_selected_bg));
            String reactionText = (String) oq0.b.f97217c.get(reactionRowItemView.a());
            if (reactionText != null) {
                String conversationMessageId = mvVar.getUid();
                Intrinsics.checkNotNullExpressionValue(conversationMessageId, "getUid(...)");
                e1 e1Var = this.f56099d;
                Intrinsics.checkNotNullParameter(e1Var, "<this>");
                Intrinsics.checkNotNullParameter(conversationMessageId, "conversationMessageId");
                Intrinsics.checkNotNullParameter(reactionText, "reactionText");
                xj2.c F = e1Var.I(new d1(conversationMessageId, reactionText), pq0.a.f100983j, pq0.a.f100984k).F(new op0.a(14, new f(this, reactionText)), new op0.a(15, g.f56088k), ck2.i.f27923c, ck2.i.f27924d);
                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                addDisposable(F);
            }
        }
        if (((b0) ((aq0.c) getView())).f84252f == aq0.d.REACTIONS_DISPLAY) {
            aq0.c cVar = (aq0.c) getView();
            oq0.a reactionItem = reactionRowItemView.a();
            b0 b0Var = (b0) cVar;
            b0Var.getClass();
            Intrinsics.checkNotNullParameter(reactionItem, "reactionItem");
            Intrinsics.checkNotNullParameter(activeUser, "activeUser");
            x xVar = b0Var.f84256j;
            if (xVar != null) {
                Intrinsics.checkNotNullParameter(reactionItem, "reactionItem");
                Intrinsics.checkNotNullParameter(activeUser, "activeUser");
                List<Pair> list = xVar.f84452d;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                boolean z13 = true;
                for (Pair pair : list) {
                    if (Intrinsics.d(((wy0) pair.f80346a).getUid(), activeUser.getUid())) {
                        pair = new Pair(pair.f80346a, reactionItem);
                        z13 = false;
                    }
                    arrayList.add(pair);
                }
                ArrayList H0 = CollectionsKt.H0(arrayList);
                xVar.f84452d = H0;
                if (z13) {
                    H0.add(new Pair(activeUser, reactionItem));
                }
                xVar.h();
            }
        }
    }
}
