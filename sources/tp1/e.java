package tp1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ck2.i;
import com.pinterest.feature.contextualtypeahead.view.ContextualTypeaheadListView;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.i0;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import nx.d0;
import uj2.q;
import x02.l2;
import xk2.m;
import xk2.v;
import xo.s;
import yk1.j;

/* loaded from: classes5.dex */
public final class e extends s implements xp0.a, nx.a {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f118785l = 0;

    /* renamed from: d, reason: collision with root package name */
    public final SpannableStringBuilder f118786d;

    /* renamed from: e, reason: collision with root package name */
    public final int f118787e;

    /* renamed from: f, reason: collision with root package name */
    public final uk1.e f118788f;

    /* renamed from: g, reason: collision with root package name */
    public q f118789g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltTextField f118790h;

    /* renamed from: i, reason: collision with root package name */
    public final xj2.b f118791i;

    /* renamed from: j, reason: collision with root package name */
    public final List f118792j;

    /* renamed from: k, reason: collision with root package name */
    public final v f118793k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, SpannableStringBuilder currentText, int i13, l2 typeaheadRepository, uk1.e presenterPinalyticsFactory) {
        super(context, 18);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        Intrinsics.checkNotNullParameter(typeaheadRepository, "typeaheadRepository");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        this.f118786d = currentText;
        this.f118787e = i13;
        this.f118788f = presenterPinalyticsFactory;
        xj2.b bVar = new xj2.b();
        this.f118791i = bVar;
        this.f118792j = e0.b(new wp0.c(typeaheadRepository));
        v b13 = m.b(new p91.v(28, this, context));
        this.f118793k = b13;
        View.inflate(context, up1.b.view_hashtag_modal, this);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        View findViewById = findViewById(up1.a.hashtag_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        this.f118790h = gestaltTextField;
        ph.a.p(gestaltTextField, new d(this, 0));
        gestaltTextField.d0();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ContextualTypeaheadListView contextualTypeaheadListView = new ContextualTypeaheadListView(context2, 0);
        addView(contextualTypeaheadListView, new ViewGroup.LayoutParams(-1, -1));
        j.a().d(contextualTypeaheadListView, (xp0.d) b13.getValue());
        yp0.b bVar2 = new yp0.b("", "(#[\\p{L}_\\p{N}]+)|(^#$)|(\\s#$)|(\\s#[\\p{L}_\\p{N}]+)");
        xp0.d dVar = (xp0.d) b13.getValue();
        String spannableStringBuilder = currentText.toString();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder, "toString(...)");
        String s13 = i(Integer.valueOf(i13), spannableStringBuilder, i13);
        s13 = s13 == null ? "#" : s13;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(s13, "s");
        dVar.f135651i = s13;
        bVar.a(bVar2.a().F(new dl1.c(29, new d(this, 1)), new c(0, a.f118771k), i.f27923c, i.f27924d));
        bVar.a(bVar2.b().j(new c(1, new d(this, 2)), new c(2, a.f118772l)));
        gestaltTextField.L(new an1.i(bVar2, 26));
    }

    public static String i(Integer num, String str, int i13) {
        Matcher matcher = Pattern.compile("(#[\\p{L}_\\p{N}]+)|(^#$)|(\\s#$)|(\\s#[\\p{L}_\\p{N}]+)").matcher(str);
        String str2 = null;
        while (matcher.find()) {
            int start = matcher.start();
            int i14 = start + 1;
            String substring = str.substring(start, i14);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (Intrinsics.d(substring, " ")) {
                start = i14;
            }
            if (start <= i13) {
                if (i13 <= (num != null ? num.intValue() : matcher.end())) {
                    str2 = str.substring(start, matcher.end());
                    Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
                }
            }
        }
        return str2;
    }

    @Override // xp0.a
    public final void b1(br.d typeAheadItem, String currentTypeaheadTerm) {
        int i13;
        Intrinsics.checkNotNullParameter(typeAheadItem, "typeAheadItem");
        Intrinsics.checkNotNullParameter(currentTypeaheadTerm, "currentTypeaheadTerm");
        String str = typeAheadItem.f23704b;
        if (str != null) {
            SpannableStringBuilder spannableStringBuilder = this.f118786d;
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
            int i14 = this.f118787e;
            String i15 = i(null, spannableStringBuilder2, i14);
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilder3, "toString(...)");
            Matcher matcher = Pattern.compile("(#[\\p{L}_\\p{N}]+)|(^#$)|(\\s#$)|(\\s#[\\p{L}_\\p{N}]+)").matcher(spannableStringBuilder3);
            while (true) {
                if (!matcher.find()) {
                    i13 = 0;
                    break;
                }
                i13 = matcher.start();
                int i16 = i13 + 1;
                String substring = spannableStringBuilder3.substring(i13, i16);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (Intrinsics.d(substring, " ")) {
                    i13 = i16;
                }
                if (i13 <= i14 && i14 <= matcher.end()) {
                    break;
                }
            }
            if (i15 != null) {
                spannableStringBuilder.replace(i13, i15.length() + i13, (CharSequence) str.concat(" "));
            } else {
                spannableStringBuilder.insert(i14, (CharSequence) str);
            }
            e3.a aVar = new e3.a(5);
            aVar.p(d4.STORY_PIN_DETAILS_HASHTAGS_TYPEAHEAD_SELECTED, null, null, null);
            Unit unit = Unit.f80348a;
            d0 d0Var = ((uk1.a) this.f118788f).e("", aVar).f122379a;
            Intrinsics.f(d0Var);
            d0.B(d0Var, f1.TAP, null, null, ep.b.o("hashtag", str), 22);
        }
        ph.a.p(this.f118790h, new d(this, 3));
        this.f118791i.dispose();
        a.c.y(u.f85943a);
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(null, a4.STORY_PIN_CREATE, null, null, null, null);
    }
}
