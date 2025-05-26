package zp0;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.feature.contextualtypeahead.view.ContextualTypeaheadListView;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.a4;
import h32.g0;
import h32.i0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.u;
import rq.g3;
import so.jb;
import uj2.q;
import up0.l;
import up0.m;
import x02.l2;
import xk2.v;
import ye2.o;
import zp.s0;

/* loaded from: classes5.dex */
public final class f extends LinearLayout implements xp0.a, nx.a, af2.c {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f142606p = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f142607a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f142608b;

    /* renamed from: c, reason: collision with root package name */
    public final SpannableStringBuilder f142609c;

    /* renamed from: d, reason: collision with root package name */
    public final int f142610d;

    /* renamed from: e, reason: collision with root package name */
    public final l f142611e;

    /* renamed from: f, reason: collision with root package name */
    public final wp0.f f142612f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f142613g;

    /* renamed from: h, reason: collision with root package name */
    public final a4 f142614h;

    /* renamed from: i, reason: collision with root package name */
    public final g0 f142615i;

    /* renamed from: j, reason: collision with root package name */
    public final q f142616j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltTextField f142617k;

    /* renamed from: l, reason: collision with root package name */
    public final m f142618l;

    /* renamed from: m, reason: collision with root package name */
    public final xj2.b f142619m;

    /* renamed from: n, reason: collision with root package name */
    public final List f142620n;

    /* renamed from: o, reason: collision with root package name */
    public final v f142621o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, SpannableStringBuilder currentText, int i13, l typeaheadTextUtility, l2 typeaheadRepository, uk1.e presenterPinalyticsFactory, wp0.f mentionSurface, Boolean bool, a4 a4Var, g0 g0Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        Intrinsics.checkNotNullParameter(typeaheadTextUtility, "typeaheadTextUtility");
        Intrinsics.checkNotNullParameter(typeaheadRepository, "typeaheadRepository");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(mentionSurface, "mentionSurface");
        int i14 = 1;
        if (!this.f142608b) {
            this.f142608b = true;
            this.f142616j = (q) ((jb) ((g) generatedComponent())).f113483a.f113947u9.get();
        }
        this.f142609c = currentText;
        this.f142610d = i13;
        this.f142611e = typeaheadTextUtility;
        this.f142612f = mentionSurface;
        this.f142613g = bool;
        this.f142614h = a4Var;
        this.f142615i = g0Var;
        xj2.b bVar = new xj2.b();
        this.f142619m = bVar;
        int i15 = 0;
        this.f142620n = e0.b(new wp0.d(typeaheadRepository, false));
        this.f142621o = xk2.m.b(new k1.q(presenterPinalyticsFactory, this, context, 25));
        View.inflate(context, y50.b.view_at_mention_modal, this);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        View findViewById = findViewById(y50.a.mention_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        this.f142617k = gestaltTextField;
        if (gestaltTextField == null) {
            Intrinsics.r("mentionEditText");
            throw null;
        }
        ph.a.p(gestaltTextField, new c(this, i15));
        this.f142618l = new m(gestaltTextField, new d(0, this, f.class, "handleDelete", "handleDelete()V", 0));
        gestaltTextField.d0();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ContextualTypeaheadListView contextualTypeaheadListView = new ContextualTypeaheadListView(context2);
        addView(contextualTypeaheadListView, new ViewGroup.LayoutParams(-1, -1));
        yk1.j.a().d(contextualTypeaheadListView, a());
        yp0.b bVar2 = new yp0.b("@", "(^@\\w*)|(\\s@\\w*)");
        bVar.a(bVar2.a().F(new op0.a(7, new c(this, i14)), new op0.a(8, e.f142603j), ck2.i.f27923c, ck2.i.f27924d));
        bVar.a(bVar2.b().j(new op0.a(9, new c(this, 2)), new op0.a(10, e.f142604k)));
        GestaltTextField gestaltTextField2 = this.f142617k;
        if (gestaltTextField2 == null) {
            Intrinsics.r("mentionEditText");
            throw null;
        }
        gestaltTextField2.Z(new bp.j(29, this, bVar2));
        a().D3(wp0.e.UserSearchBegan);
    }

    public final xp0.d a() {
        return (xp0.d) this.f142621o.getValue();
    }

    @Override // xp0.a
    public final void b1(br.d typeAheadItem, String currentTypeaheadTerm) {
        SpannableStringBuilder spannableStringBuilder;
        Intrinsics.checkNotNullParameter(typeAheadItem, "typeAheadItem");
        Intrinsics.checkNotNullParameter(currentTypeaheadTerm, "currentTypeaheadTerm");
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f142613g;
        String newTerm = Intrinsics.d(bool2, bool) ? typeAheadItem.f23705c : typeAheadItem.f23706d;
        GestaltTextField inputField = this.f142617k;
        if (inputField == null) {
            Intrinsics.r("mentionEditText");
            throw null;
        }
        String toReplaceTerm = "@" + currentTypeaheadTerm;
        Intrinsics.f(newTerm);
        String objectId = typeAheadItem.f23703a;
        Intrinsics.checkNotNullExpressionValue(objectId, "getUid(...)");
        boolean z13 = !Intrinsics.d(bool2, bool);
        int i13 = l.f122972d;
        l lVar = this.f142611e;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(toReplaceTerm, "toReplaceTerm");
        Intrinsics.checkNotNullParameter(newTerm, "newTerm");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter("@", "prefixToken");
        Editable z03 = inputField.z0();
        if (z03 instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) z03;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(z03);
            inputField.X(new s0(spannableStringBuilder, 15));
        }
        boolean z14 = l.e(l.i(spannableStringBuilder)).size() == 5;
        i92.k kVar = lVar.f122974b;
        if (z14) {
            kVar.i(inputField.getContext().getResources().getQuantityString(v92.c.user_mention_tag_limit, 5, 5));
        } else {
            if (z13) {
                newTerm = "@".concat(newTerm);
            }
            if (z03 != null) {
                if (newTerm.length() + (z03.length() - toReplaceTerm.length()) > 500) {
                    kVar.i(inputField.getContext().getResources().getString(v92.d.user_mention_character_limit));
                }
            }
            int selectionStart = inputField.o0().getSelectionStart() - toReplaceTerm.length();
            if (selectionStart <= 0) {
                selectionStart = 0;
            }
            int L = StringsKt.L(String.valueOf(z03), toReplaceTerm, selectionStart, false, 4);
            if (L >= 0) {
                int i14 = -1;
                if (toReplaceTerm.length() + L <= (z03 != null ? z03.length() : -1)) {
                    spannableStringBuilder.replace(L, toReplaceTerm.length() + L, (CharSequence) newTerm);
                    spannableStringBuilder.setSpan(new g3(objectId, lVar, inputField, inputField.getContext()), L, newTerm.length() + L, 33);
                    if (newTerm.length() + L == spannableStringBuilder.length()) {
                        spannableStringBuilder.append((CharSequence) " ");
                    } else {
                        i14 = newTerm.length() + L + 1;
                    }
                    inputField.post(new v.k(i14, inputField, 9));
                }
            }
        }
        Unit unit = Unit.f80348a;
        a().D3(wp0.e.UserSelected);
        this.f142619m.dispose();
        a.c.y(u.f85943a);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f142607a == null) {
            this.f142607a = new o(this);
        }
        return this.f142607a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(this.f142612f.getViewType(), this.f142614h, null, this.f142615i, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f142607a == null) {
            this.f142607a = new o(this);
        }
        return this.f142607a.generatedComponent();
    }
}
