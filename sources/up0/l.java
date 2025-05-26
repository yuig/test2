package up0;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import androidx.appcompat.widget.AppCompatEditText;
import com.pinterest.api.model.qs0;
import com.pinterest.api.model.ts0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.f1;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jk2.x;
import kh2.g3;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nx.d0;
import uj2.q;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f122972d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final lu1.b f122973a;

    /* renamed from: b, reason: collision with root package name */
    public final i92.k f122974b;

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f122975c;

    static {
        xk2.m.b(e.f122946j);
    }

    public l(lu1.b baseActivityHelper, i92.k toastUtils, yk1.j mvpBinder, bf2.d topLevelPinalyticsProvider, q networkStateStream) {
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(topLevelPinalyticsProvider, "topLevelPinalyticsProvider");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f122973a = baseActivityHelper;
        this.f122974b = toastUtils;
        this.f122975c = topLevelPinalyticsProvider;
    }

    public static final void a(boolean z13, d0 d0Var, ts0 ts0Var) {
        if (z13) {
            u0 u0Var = u0.MENTION;
            String k13 = ts0Var.k();
            HashMap hashMap = new HashMap();
            hashMap.put("tag_type", String.valueOf(ts0Var.m().intValue()));
            bs1.c.G1("user_id", ts0Var.k(), hashMap);
            Unit unit = Unit.f80348a;
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : k13, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            r41.k kVar = r41.k.f106176a;
            String k14 = ts0Var.k();
            if (k14 == null) {
                k14 = "";
            }
            kVar.d(k14, r41.b.TypeaheadTextUtility);
        }
    }

    public static SpannableStringBuilder b(l lVar, Context context, String str, List list, boolean z13, boolean z14, d dVar, vn1.c cVar, String str2, int i13) {
        int i14;
        int i15;
        SpannableStringBuilder spannableStringBuilder;
        Integer num;
        Object hVar;
        l lVar2 = lVar;
        Context context2 = context;
        boolean z15 = (i13 & 8) != 0 ? false : z13;
        int i16 = 1;
        boolean z16 = (i13 & 16) != 0 ? true : z14;
        Object obj = lVar2.f122975c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        d0 d0Var = (d0) obj;
        vn1.c cVar2 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? vn1.c.DEFAULT : cVar;
        Integer num2 = null;
        String str3 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str2;
        lVar.getClass();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ts0 ts0Var = (ts0) it.next();
                Integer l13 = ts0Var.l();
                Intrinsics.checkNotNullExpressionValue(l13, "getOffset(...)");
                int intValue = l13.intValue();
                if (intValue <= spannableStringBuilder2.length()) {
                    int intValue2 = ts0Var.l().intValue();
                    Integer i17 = ts0Var.i();
                    Intrinsics.checkNotNullExpressionValue(i17, "getLength(...)");
                    int intValue3 = i17.intValue() + intValue2;
                    int length = spannableStringBuilder2.length();
                    int i18 = intValue3 > length ? length : intValue3;
                    if (i18 > intValue) {
                        f32.a aVar = f32.c.Companion;
                        Integer m13 = ts0Var.m();
                        Intrinsics.checkNotNullExpressionValue(m13, "getTagType(...)");
                        int intValue4 = m13.intValue();
                        aVar.getClass();
                        f32.c a13 = f32.a.a(intValue4);
                        int i19 = a13 == null ? -1 : f.f122950b[a13.ordinal()];
                        if (i19 != i16) {
                            if (i19 != 2) {
                                hVar = new te0.a(context2, num2, 6);
                            } else {
                                HashMap hashMap = new HashMap();
                                int i23 = dVar != null ? f.f122949a[dVar.ordinal()] : -1;
                                if (i23 == i16) {
                                    i14 = i18;
                                    i15 = intValue;
                                    spannableStringBuilder = spannableStringBuilder2;
                                    String j13 = ts0Var.j();
                                    num = num2;
                                    hVar = new i(context, ts0Var, d0Var, str3, hashMap, lVar, g3.C(j13 != null ? j13 : ""), eo1.b.color_blue_500);
                                } else if (i23 != 2) {
                                    hVar = new j(context2, ts0Var, lVar2, dl2.b.a1(context2, cVar2.getColorRes()));
                                } else {
                                    String j14 = ts0Var.j();
                                    i14 = i18;
                                    i15 = intValue;
                                    spannableStringBuilder = spannableStringBuilder2;
                                    hVar = new i(context, ts0Var, d0Var, str3, hashMap, lVar, g3.C(j14 != null ? j14 : ""));
                                    num = num2;
                                }
                            }
                            i14 = i18;
                            i15 = intValue;
                            spannableStringBuilder = spannableStringBuilder2;
                            num = num2;
                        } else {
                            i14 = i18;
                            i15 = intValue;
                            spannableStringBuilder = spannableStringBuilder2;
                            num = num2;
                            if (z16) {
                                String k13 = ts0Var.k();
                                hVar = new g(context, z15, d0Var, ts0Var, k13 == null ? "" : k13, eo1.b.color_blue_500);
                            } else {
                                String k14 = ts0Var.k();
                                hVar = new h(context, z15, d0Var, ts0Var, k14 == null ? "" : k14, eo1.b.color_blue_500);
                            }
                        }
                        spannableStringBuilder.setSpan(hVar, i15, i14, 33);
                        lVar2 = lVar;
                        spannableStringBuilder2 = spannableStringBuilder;
                        num2 = num;
                        i16 = 1;
                        context2 = context;
                    }
                }
                spannableStringBuilder = spannableStringBuilder2;
                num = num2;
                lVar2 = lVar;
                spannableStringBuilder2 = spannableStringBuilder;
                num2 = num;
                i16 = 1;
                context2 = context;
            }
        }
        return spannableStringBuilder2;
    }

    public static SpannableStringBuilder c(l lVar, Context context, String text, List list) {
        d dVar = d.NONE;
        vn1.c spanColor = vn1.c.DEFAULT;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanColor, "spanColor");
        return b(lVar, context, text, list, false, false, dVar, spanColor, null, 312);
    }

    public static SpannableStringBuilder d(l lVar, Context context, String text, List list, String str, int i13) {
        boolean z13 = (i13 & 8) != 0;
        d dVar = d.NONE;
        String str2 = (i13 & 32) != 0 ? null : str;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        return b(lVar, context, text, list, true, z13, dVar, null, str2, 160);
    }

    public static ArrayList e(Editable editableText) {
        Intrinsics.checkNotNullParameter(editableText, "editableText");
        ArrayList arrayList = new ArrayList();
        me0.a[] aVarArr = (me0.a[]) editableText.getSpans(0, editableText.length(), me0.a.class);
        if (aVarArr != null) {
            if (!(aVarArr.length == 0)) {
                ql2.k it = c0.E(aVarArr).iterator();
                while (it.f104109c) {
                    int b13 = it.b();
                    qs0 h10 = ts0.h();
                    h10.d(aVarArr[b13].f87038d);
                    h10.b(Integer.valueOf(editableText.getSpanEnd(aVarArr[b13]) - editableText.getSpanStart(aVarArr[b13])));
                    h10.e(Integer.valueOf(editableText.getSpanStart(aVarArr[b13])));
                    h10.f(Integer.valueOf(f32.c.USER.getValue()));
                    arrayList.add(h10.a());
                }
            }
        }
        pe0.d[] dVarArr = (pe0.d[]) editableText.getSpans(0, editableText.length(), pe0.d.class);
        if (dVarArr != null) {
            if (!(dVarArr.length == 0)) {
                ql2.k it2 = c0.E(dVarArr).iterator();
                while (it2.f104109c) {
                    int b14 = it2.b();
                    qs0 h13 = ts0.h();
                    h13.c(g3.C(dVarArr[b14].f99930a));
                    h13.b(Integer.valueOf(editableText.getSpanEnd(dVarArr[b14]) - editableText.getSpanStart(dVarArr[b14])));
                    h13.e(Integer.valueOf(editableText.getSpanStart(dVarArr[b14])));
                    h13.f(Integer.valueOf(f32.c.LINK.getValue()));
                    arrayList.add(h13.a());
                }
            }
        }
        return arrayList;
    }

    public static yp0.b f(l lVar, GestaltTextField gestaltTextField) {
        Intrinsics.checkNotNullParameter(gestaltTextField, "gestaltTextField");
        return new yp0.b(null, null);
    }

    public static x g(AppCompatEditText editText, String str, String str2) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        yp0.c cVar = new yp0.c(str, str2);
        editText.addTextChangedListener(cVar);
        x H = cVar.f139616d.A(wj2.c.a()).H(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(H, "subscribeOn(...)");
        return H;
    }

    public static SpannableStringBuilder i(SpannableStringBuilder spannable) {
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        if (spannable.length() == 0) {
            return spannable;
        }
        String spannableStringBuilder = spannable.toString();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder, "toString(...)");
        String obj = StringsKt.i0(spannableStringBuilder).toString();
        String spannableStringBuilder2 = spannable.toString();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
        int L = StringsKt.L(spannableStringBuilder2, obj, 0, false, 6);
        SpannableStringBuilder delete = spannable.delete(obj.length() + L, spannable.length()).delete(0, L);
        Intrinsics.checkNotNullExpressionValue(delete, "delete(...)");
        return delete;
    }
}
