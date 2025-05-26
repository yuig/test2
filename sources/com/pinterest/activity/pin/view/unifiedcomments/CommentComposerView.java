package com.pinterest.activity.pin.view.unifiedcomments;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import c30.a;
import com.airbnb.lottie.k;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.a5;
import df.j1;
import h32.f1;
import h32.g0;
import h32.u0;
import hf0.b;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh2.g3;
import kh2.m0;
import kl2.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import lb0.r;
import lh0.g1;
import lh0.j4;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import nx.f0;
import ob2.c;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import pw0.x;
import r1.j0;
import rp0.d;
import rq.a4;
import rq.f4;
import uj2.a0;
import uj2.b0;
import uk1.e;
import up0.l;
import uq.f;
import uq.g;
import uq.i;
import uq.w;
import wn1.n;
import wn1.p;
import wn1.t;
import wn1.y;
import x02.l2;
import xk2.m;
import xk2.v;
import zp.j;
import zp.s0;
import zp0.h;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/activity/pin/view/unifiedcomments/CommentComposerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzp0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rq/f4", "unifiedcommentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CommentComposerView extends w implements h {
    public static final /* synthetic */ int L = 0;
    public s A;
    public Function0 B;
    public boolean C;
    public final String D;
    public f30 E;
    public boolean F;
    public String G;
    public d H;
    public d I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f35070J;
    public final f K;

    /* renamed from: d, reason: collision with root package name */
    public f0 f35071d;

    /* renamed from: e, reason: collision with root package name */
    public e f35072e;

    /* renamed from: f, reason: collision with root package name */
    public a f35073f;

    /* renamed from: g, reason: collision with root package name */
    public qh1.e f35074g;

    /* renamed from: h, reason: collision with root package name */
    public j4 f35075h;

    /* renamed from: i, reason: collision with root package name */
    public j f35076i;

    /* renamed from: j, reason: collision with root package name */
    public m60.w f35077j;

    /* renamed from: k, reason: collision with root package name */
    public r f35078k;

    /* renamed from: l, reason: collision with root package name */
    public l2 f35079l;

    /* renamed from: m, reason: collision with root package name */
    public l f35080m;

    /* renamed from: n, reason: collision with root package name */
    public g0 f35081n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35082o;

    /* renamed from: p, reason: collision with root package name */
    public f4 f35083p;

    /* renamed from: q, reason: collision with root package name */
    public Function1 f35084q;

    /* renamed from: r, reason: collision with root package name */
    public final GestaltAvatar f35085r;

    /* renamed from: s, reason: collision with root package name */
    public final GestaltTextComposer f35086s;

    /* renamed from: t, reason: collision with root package name */
    public final View f35087t;

    /* renamed from: u, reason: collision with root package name */
    public final Group f35088u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f35089v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f35090w;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f35091x;

    /* renamed from: y, reason: collision with root package name */
    public final v f35092y;

    /* renamed from: z, reason: collision with root package name */
    public Function0 f35093z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentComposerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 0;
        this.f35090w = sh.f.a();
        this.f35091x = new HashMap();
        this.f35092y = m.b(new db.m(this, 24));
        this.f35093z = g.f123002j;
        this.A = uq.h.f123005i;
        this.B = g.f123003k;
        String string = getResources().getString(x0.pin_comment_hint);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.D = string;
        this.K = new f(this);
        int i14 = 1;
        LayoutInflater.from(getContext()).inflate(ob2.d.pin_closeup_unified_comments_composer, (ViewGroup) this, true);
        this.f35085r = ((GestaltAvatar) findViewById(c.composer_avatar)).H2(new uq.c(this, i13));
        View findViewById = findViewById(c.composer_banner);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35088u = (Group) findViewById;
        View findViewById2 = findViewById(c.text_composer);
        final GestaltTextComposer gestaltTextComposer = (GestaltTextComposer) findViewById2;
        gestaltTextComposer.X(uq.d.f122986j);
        gestaltTextComposer.Z(new gm1.a(this) { // from class: uq.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentComposerView f122980b;

            {
                this.f122980b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i15 = i13;
                CommentComposerView.L(this.f122980b, gestaltTextComposer, cVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f35086s = gestaltTextComposer;
        if (!a0()) {
            uq.e action = new uq.e(this);
            Intrinsics.checkNotNullParameter(action, "action");
            gestaltTextComposer.o0().setFocusableInTouchMode(false);
            this.f35093z = action;
        }
        View findViewById3 = findViewById(c.composer_focus_grabber);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f35087t = findViewById3;
        View findViewById4 = findViewById(c.composer_banner_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f35089v = (GestaltText) findViewById4;
        View findViewById5 = findViewById(c.composer_banner_cancel);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById5;
        gestaltIconButton.u(new gm1.a(this) { // from class: uq.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentComposerView f122983b;

            {
                this.f122983b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i15 = i13;
                CommentComposerView this$0 = this.f122983b;
                switch (i15) {
                    case 0:
                        int i16 = CommentComposerView.L;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof om1.l) {
                            this$0.B.invoke();
                            break;
                        }
                        break;
                    default:
                        int i17 = CommentComposerView.L;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof om1.l) {
                            this$0.B.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        if (a0()) {
            gestaltIconButton.t(uq.d.f122988l);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        View findViewById6 = findViewById(c.composer_top_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        if (X().f("PREF_COMMENT_CODE_MODAL_IS_ACCEPTED", false)) {
            return;
        }
        a aVar = this.f35073f;
        if (aVar == null) {
            Intrinsics.r("userStateService");
            throw null;
        }
        b0<ResponseBody> a13 = aVar.a("COMMENT_CODE_VIEW_COUNT");
        a0 a0Var = tk2.e.f118017c;
        a13.r(a0Var).l(wj2.c.a()).o(new a4(12, new uq.c(this, i14)), new a4(13, uq.d.f122989m));
        a aVar2 = this.f35073f;
        if (aVar2 == null) {
            Intrinsics.r("userStateService");
            throw null;
        }
        aVar2.a("COMMENT_CODE_IS_ACCEPTED").r(a0Var).l(wj2.c.a()).o(new a4(14, new uq.c(this, 2)), new a4(15, uq.d.f122990n));
    }

    public static void I0(CommentComposerView commentComposerView, String str, String str2, int i13) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        commentComposerView.getClass();
        uq.j jVar = new uq.j(str, str2, 0);
        GestaltTextComposer gestaltTextComposer = commentComposerView.f35086s;
        gestaltTextComposer.X(jVar);
        Function1 function1 = commentComposerView.f35084q;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        commentComposerView.n1();
        commentComposerView.o0(gestaltTextComposer.t0(), true);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kl2.n, kotlin.jvm.internal.s] */
    public static void L(CommentComposerView this$0, GestaltTextComposer gestaltTextComposer, gm1.c event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof p) {
            this$0.f35093z.invoke();
            return;
        }
        Throwable th3 = null;
        if (event instanceof t) {
            Function1 function1 = this$0.f35084q;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            this$0.n1();
            this$0.o0(gestaltTextComposer.t0(), false);
            this$0.G = null;
            return;
        }
        if (event instanceof wn1.r) {
            if (((wn1.r) event).f130580c) {
                j4 j4Var = this$0.f35075h;
                if (j4Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                ((g1) j4Var.f83399a).c("ce_android_comment_composer_redesign");
                if (this$0.a0()) {
                    this$0.d0(f1.COMMENTS_COMPOSER_OPENED);
                    this$0.C = true;
                }
                b.t(gestaltTextComposer.getContext());
                gestaltTextComposer.X(uq.d.f122987k);
                this$0.C = true;
                return;
            }
            if (this$0.C) {
                this$0.d0(f1.COMMENTS_COMPOSER_CLOSED_WITHOUT_POST);
                this$0.C = false;
            }
            d dVar = this$0.H;
            GestaltTextComposer gestaltTextComposer2 = this$0.f35086s;
            if (dVar != null || this$0.I != null) {
                gestaltTextComposer2.X(wn1.h.C);
                gestaltTextComposer2.X(wn1.h.D);
            }
            gestaltTextComposer2.X(new uq.c(this$0, 3));
            this$0.H = null;
            this$0.I = null;
            this$0.o0(gestaltTextComposer2.t0(), g3.q0(gestaltTextComposer2));
            this$0.n1();
            return;
        }
        if (!(event instanceof y)) {
            if (event instanceof n) {
                Editable editable = ((n) event).f130569c;
                Intrinsics.f(gestaltTextComposer);
                this$0.o0(editable, g3.q0(gestaltTextComposer));
                return;
            }
            if (event instanceof wn1.v) {
                ?? r33 = this$0.A;
                Editable t03 = gestaltTextComposer.t0();
                Intrinsics.checkNotNullParameter(gestaltTextComposer, "<this>");
                String str = gestaltTextComposer.k0().f130522i;
                r33.p(t03, str == null ? gestaltTextComposer.k0().f130523j : str, this$0.G, this$0.I, this$0.H);
                this$0.G = null;
                return;
            }
            if (event instanceof wn1.w) {
                j jVar = this$0.f35076i;
                if (jVar == null) {
                    Intrinsics.r("galleryRouter");
                    throw null;
                }
                Context context = gestaltTextComposer.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                j.b(jVar, context, x.CommentAddPhoto, 0, null, null, this$0.f35090w, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                this$0.f35090w.F(this$0.f35081n, u0.USER_DID_IT_BUTTON);
                return;
            }
            if (event instanceof wn1.x) {
                m60.w wVar = this$0.f35077j;
                if (wVar == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                ScreenLocation screenLocation = (ScreenLocation) a5.f50532a.getValue();
                f30 f30Var = this$0.E;
                String uid = f30Var != null ? f30Var.getUid() : null;
                if (uid == null) {
                    uid = "";
                }
                wVar.d(Navigation.z0(screenLocation, uid));
                b.k(gestaltTextComposer.o0());
                this$0.f35090w.F(this$0.f35081n, u0.STICKER_COMMENT_BUTTON);
                return;
            }
            return;
        }
        y yVar = (y) event;
        int i13 = yVar.f130591d;
        this$0.getClass();
        int i14 = yVar.f130593f;
        if (i14 > 0) {
            i13 += i14;
        }
        int i15 = i13;
        Matcher matcher = Pattern.compile("(^@\\w*)|(\\s@\\w*)").matcher(yVar.f130590c);
        if (this$0.f35082o) {
            return;
        }
        while (matcher.find()) {
            if (matcher.start() < i15 && i15 <= matcher.end()) {
                m60.w wVar2 = this$0.f35077j;
                if (wVar2 == null) {
                    Throwable th4 = th3;
                    Intrinsics.r("eventManager");
                    throw th4;
                }
                GestaltTextComposer gestaltTextComposer3 = this$0.f35086s;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gestaltTextComposer3.t0());
                int selectionStart = gestaltTextComposer3.o0().getSelectionStart();
                l lVar = this$0.f35080m;
                if (lVar == null) {
                    Throwable th5 = th3;
                    Intrinsics.r("typeaheadTextUtility");
                    throw th5;
                }
                l2 l2Var = this$0.f35079l;
                if (l2Var == null) {
                    Throwable th6 = th3;
                    Intrinsics.r("typeaheadRepository");
                    throw th6;
                }
                e eVar = this$0.f35072e;
                if (eVar == null) {
                    Throwable th7 = th3;
                    Intrinsics.r("presenterPinalyticsFactory");
                    throw th7;
                }
                f0 f0Var = this$0.f35071d;
                if (f0Var == null) {
                    Intrinsics.r("pinalyticsFactory");
                    throw null;
                }
                wVar2.d(new jc0.v(new zp0.b(spannableStringBuilder, selectionStart, lVar, l2Var, eVar, f0Var, wp0.f.PinComments, this$0, Boolean.TRUE, this$0.f35081n, BitmapUtils.BITMAP_TO_JPEG_SIZE), false, 0L, 30));
                this$0.f35082o = true;
                i15 = i15;
                th3 = null;
            }
        }
    }

    public static void T(CommentComposerView commentComposerView) {
        b.k(commentComposerView.f35086s);
        commentComposerView.f35087t.requestFocus();
    }

    public final void B0(d comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.H = comment;
        d();
        n1();
        ba.s sVar = new ba.s(24, comment, this);
        GestaltTextComposer gestaltTextComposer = this.f35086s;
        gestaltTextComposer.X(sVar);
        gestaltTextComposer.g0();
    }

    public final void F0(Editable content) {
        Intrinsics.checkNotNullParameter(content, "content");
        i iVar = new i(0, content);
        GestaltTextComposer gestaltTextComposer = this.f35086s;
        gestaltTextComposer.X(iVar);
        gestaltTextComposer.post(new k(gestaltTextComposer, 26));
    }

    public final void G0(int i13) {
        this.f35086s.X(new j0(i13, 7));
    }

    public final void H0() {
        GestaltTextComposer gestaltTextComposer = this.f35086s;
        gestaltTextComposer.o0().setFocusableInTouchMode(true);
        gestaltTextComposer.g0();
        if (this.C) {
            return;
        }
        d0(f1.COMMENTS_COMPOSER_OPENED);
        this.C = true;
    }

    public final void K0(rh1.h onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.B = onClick;
    }

    public final void L0(o onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.A = new uq.k(this, onClick);
    }

    public final void P0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Boolean j43 = pin.j4();
        Intrinsics.checkNotNullExpressionValue(j43, "getDoneByMe(...)");
        if (j43.booleanValue()) {
            Boolean j44 = pin.j4();
            Intrinsics.checkNotNullExpressionValue(j44, "getDoneByMe(...)");
            z0(j44.booleanValue());
        }
        this.E = pin;
    }

    public final void S0(d comment) {
        String str;
        wy0 w13;
        SpannableStringBuilder spannableStringBuilder;
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.I = comment;
        d();
        n1();
        wy0 w14 = comment.w();
        if (w14 != null) {
            qh1.e eVar = this.f35074g;
            if (eVar == null) {
                Intrinsics.r("commentUtils");
                throw null;
            }
            str = eVar.b(w14, false);
        } else {
            str = null;
        }
        rq.l2 l2Var = new rq.l2(str, 6);
        GestaltTextComposer inputField = this.f35086s;
        inputField.X(l2Var);
        if (j1.U0(comment.m()) && (w13 = comment.w()) != null) {
            l lVar = this.f35080m;
            if (lVar == null) {
                Intrinsics.r("typeaheadTextUtility");
                throw null;
            }
            String newTerm = w13.U2();
            if (newTerm == null) {
                newTerm = "";
            }
            String objectId = w13.getUid();
            Intrinsics.checkNotNullExpressionValue(objectId, "getUid(...)");
            int i13 = l.f122972d;
            Intrinsics.checkNotNullParameter(inputField, "inputField");
            Intrinsics.checkNotNullParameter("", "toReplaceTerm");
            Intrinsics.checkNotNullParameter(newTerm, "newTerm");
            Intrinsics.checkNotNullParameter(objectId, "objectId");
            Intrinsics.checkNotNullParameter("@", "prefixToken");
            Editable t03 = inputField.t0();
            if (t03 instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) t03;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(t03);
                inputField.X(new s0(spannableStringBuilder, 14));
            }
            boolean z13 = l.e(l.i(spannableStringBuilder)).size() == 5;
            i92.k kVar = lVar.f122974b;
            if (z13) {
                kVar.i(inputField.getContext().getResources().getQuantityString(v92.c.user_mention_tag_limit, 5, 5));
            } else {
                if (t03 != null) {
                    if (newTerm.length() + t03.length() > 500) {
                        kVar.i(inputField.getContext().getResources().getString(v92.d.user_mention_character_limit));
                    }
                }
                int selectionStart = inputField.o0().getSelectionStart();
                if (selectionStart <= 0) {
                    selectionStart = 0;
                }
                int L2 = StringsKt.L(String.valueOf(t03), "", selectionStart, false, 4);
                if (L2 >= 0) {
                    int i14 = -1;
                    if (L2 <= (t03 != null ? t03.length() : -1)) {
                        spannableStringBuilder.replace(L2, L2, (CharSequence) newTerm);
                        spannableStringBuilder.setSpan(new rq.g3(objectId, lVar, inputField, inputField.getContext()), L2, newTerm.length() + L2, 33);
                        if (newTerm.length() + L2 == spannableStringBuilder.length()) {
                            spannableStringBuilder.append((CharSequence) " ");
                        } else {
                            i14 = newTerm.length() + L2 + 1;
                        }
                        inputField.post(new v.k(i14, inputField, 10));
                    }
                }
            }
        }
        inputField.g0();
    }

    public final void T0(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        m0.V0(this.f35085r, user);
    }

    public final r X() {
        r rVar = this.f35078k;
        if (rVar != null) {
            return rVar;
        }
        Intrinsics.r("prefsManagerUser");
        throw null;
    }

    @Override // zp0.h
    public final void Y(SpannableStringBuilder updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        s0 s0Var = new s0(updated, 10);
        GestaltTextComposer gestaltTextComposer = this.f35086s;
        gestaltTextComposer.X(s0Var);
        gestaltTextComposer.g0();
    }

    public final void Y0() {
        this.f35086s.X(uq.d.f122993q);
    }

    public final void Z() {
        bs1.c.X0(this.f35088u);
    }

    public final boolean a0() {
        return ((Boolean) this.f35092y.getValue()).booleanValue();
    }

    public final void b1(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        pk.a0.p(this.f35089v, text);
        bs1.c.U1(this.f35088u);
    }

    public final void d() {
        wn1.h hVar = wn1.h.C;
        GestaltTextComposer gestaltTextComposer = this.f35086s;
        gestaltTextComposer.X(hVar);
        gestaltTextComposer.X(wn1.h.D);
    }

    public final void d0(f1 f1Var) {
        g0 g0Var = bs1.c.o1(this.f35088u) ? g0.AGGREGATED_COMMENT_REPLY : g0.AGGREGATED_COMMENT_NONREPLY;
        d0 pinalytics = this.f35090w;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "pinalytics");
        d0.B(pinalytics, f1Var, g0Var, null, this.f35091x, 20);
    }

    public final boolean g0(String str) {
        f30 f30Var;
        if (a0() || (f30Var = this.E) == null) {
            return false;
        }
        qh1.e eVar = this.f35074g;
        if (eVar == null) {
            Intrinsics.r("commentUtils");
            throw null;
        }
        String uid = f30Var.getUid();
        String g13 = b40.g(f30Var);
        g0 g0Var = this.f35081n;
        g0 g0Var2 = g0.PIN_CLOSEUP_COMMENTS;
        boolean z13 = g0Var == g0Var2;
        boolean z14 = g0Var == g0Var2;
        Intrinsics.f(uid);
        eVar.n(this.f35090w, uid, (r36 & 4) != 0 ? "" : g13, (r36 & 8) != 0 ? null : null, (r36 & 16) != 0 ? null : null, null, null, (r36 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, (r36 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : null, (r36 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str, (r36 & 1024) != 0 ? false : z14, (r36 & 2048) != 0 ? null : null, (r36 & 4096) != 0 ? null : null, (r36 & 8192) != 0 ? Boolean.FALSE : Boolean.valueOf(z13), (r36 & 16384) != 0 ? false : false, (r36 & 32768) != 0 ? false : false, false);
        f4 f4Var = this.f35083p;
        if (f4Var != null) {
            f4Var.f109200a.f109322v = true;
        }
        return true;
    }

    public final void n1() {
        GestaltTextComposer gestaltTextComposer = this.f35086s;
        gestaltTextComposer.X(new s1.w(g3.q0(gestaltTextComposer), this, (this.H == null && this.I == null) ? fm1.c.VISIBLE : fm1.c.GONE, 3));
    }

    @Override // zp0.h
    public final void n6() {
        this.f35082o = false;
    }

    public final void o0(Editable editable, boolean z13) {
        wy0 w13;
        if (editable == null) {
            return;
        }
        d dVar = this.I;
        this.f35086s.X(new u1.c(this, editable, z13, Intrinsics.d(StringsKt.i0(editable).toString(), (dVar == null || (w13 = dVar.w()) == null) ? null : w13.U2()), 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m60.w wVar = this.f35077j;
        if (wVar != null) {
            wVar.h(this.K);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        X().remove("PREF_COMMENT_COMPOSER_DRAFT");
        b.k(this.f35086s);
        m60.w wVar = this.f35077j;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.K);
        super.onDetachedFromWindow();
    }

    public final void r0(rh1.f fVar) {
        this.f35084q = fVar;
    }

    public final void t0(g0 component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f35081n = component;
    }

    public final void z0(boolean z13) {
        this.F = z13;
        this.f35086s.X(new cp.t(z13, 6));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentComposerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35090w = sh.f.a();
        this.f35091x = new HashMap();
        this.f35092y = m.b(new db.m(this, 24));
        this.f35093z = g.f123002j;
        this.A = uq.h.f123005i;
        this.B = g.f123003k;
        String string = getResources().getString(x0.pin_comment_hint);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.D = string;
        this.K = new f(this);
        final int i14 = 1;
        LayoutInflater.from(getContext()).inflate(ob2.d.pin_closeup_unified_comments_composer, (ViewGroup) this, true);
        this.f35085r = ((GestaltAvatar) findViewById(c.composer_avatar)).H2(new uq.c(this, 0));
        View findViewById = findViewById(c.composer_banner);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35088u = (Group) findViewById;
        View findViewById2 = findViewById(c.text_composer);
        final GestaltTextComposer gestaltTextComposer = (GestaltTextComposer) findViewById2;
        gestaltTextComposer.X(uq.d.f122986j);
        gestaltTextComposer.Z(new gm1.a(this) { // from class: uq.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentComposerView f122980b;

            {
                this.f122980b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i15 = i14;
                CommentComposerView.L(this.f122980b, gestaltTextComposer, cVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f35086s = gestaltTextComposer;
        if (!a0()) {
            uq.e action = new uq.e(this);
            Intrinsics.checkNotNullParameter(action, "action");
            gestaltTextComposer.o0().setFocusableInTouchMode(false);
            this.f35093z = action;
        }
        View findViewById3 = findViewById(c.composer_focus_grabber);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f35087t = findViewById3;
        View findViewById4 = findViewById(c.composer_banner_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f35089v = (GestaltText) findViewById4;
        View findViewById5 = findViewById(c.composer_banner_cancel);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById5;
        gestaltIconButton.u(new gm1.a(this) { // from class: uq.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentComposerView f122983b;

            {
                this.f122983b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i15 = i14;
                CommentComposerView this$0 = this.f122983b;
                switch (i15) {
                    case 0:
                        int i16 = CommentComposerView.L;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof om1.l) {
                            this$0.B.invoke();
                            break;
                        }
                        break;
                    default:
                        int i17 = CommentComposerView.L;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof om1.l) {
                            this$0.B.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        if (a0()) {
            gestaltIconButton.t(uq.d.f122988l);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        View findViewById6 = findViewById(c.composer_top_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        if (X().f("PREF_COMMENT_CODE_MODAL_IS_ACCEPTED", false)) {
            return;
        }
        a aVar = this.f35073f;
        if (aVar != null) {
            b0<ResponseBody> a13 = aVar.a("COMMENT_CODE_VIEW_COUNT");
            a0 a0Var = tk2.e.f118017c;
            a13.r(a0Var).l(wj2.c.a()).o(new a4(16, new uq.c(this, i14)), new a4(17, uq.d.f122989m));
            a aVar2 = this.f35073f;
            if (aVar2 != null) {
                aVar2.a("COMMENT_CODE_IS_ACCEPTED").r(a0Var).l(wj2.c.a()).o(new a4(18, new uq.c(this, 2)), new a4(19, uq.d.f122990n));
                return;
            }
            Intrinsics.r("userStateService");
            throw null;
        }
        Intrinsics.r("userStateService");
        throw null;
    }
}
