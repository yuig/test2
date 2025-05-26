package rq;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.activity.pin.view.PinCloseupRatingView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.qk0;
import com.pinterest.api.model.rk0;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.wm0;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class g2 extends j {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f109203k = 0;

    /* renamed from: c, reason: collision with root package name */
    public is1.i0 f109204c;

    /* renamed from: d, reason: collision with root package name */
    public ek2.j f109205d;

    /* renamed from: e, reason: collision with root package name */
    public ConstraintLayout f109206e;

    /* renamed from: f, reason: collision with root package name */
    public Flow f109207f;

    /* renamed from: g, reason: collision with root package name */
    public PinCloseupRatingView f109208g;

    /* renamed from: h, reason: collision with root package name */
    public Pair f109209h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f109210i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f109211j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context) {
        super(context, 6);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109210i = new LinkedHashMap();
        this.f109211j = xk2.m.b(new db.m(this, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        LinkedHashMap linkedHashMap;
        pk.i2 i2Var;
        boolean z13;
        f30 pin;
        ConstraintLayout constraintLayout;
        f30 pin2;
        dl0 v63;
        jo0 q13;
        qk0 k13;
        List<wm0> c13;
        t10.f recipe;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        f30 pin3 = getPin();
        int i13 = 0;
        if (pin3 != null) {
            Set set = b40.f35967a;
            Intrinsics.checkNotNullParameter(pin3, "<this>");
            se0 g63 = pin3.g6();
            String valueOf = g63 != null ? String.valueOf(g63.u()) : null;
            if (valueOf != null) {
                rk0 rk0Var = rk0.COOK_TIME;
                int parseInt = Integer.parseInt(valueOf) / 60;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                linkedHashMap2.put(rk0Var, kotlin.collections.f0.d(qg1.d.b(parseInt, context, false)));
            }
        }
        f30 pin4 = getPin();
        if (pin4 != null && (recipe = b40.Y0(pin4)) != null) {
            f30 pin5 = getPin();
            String uid = pin5 != null ? pin5.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            f30 pin6 = getPin();
            if (pin6 != null && Intrinsics.d(pin6.j5(), Boolean.TRUE)) {
                is1.i0 i0Var = this.f109204c;
                if (i0Var == null) {
                    Intrinsics.r("translationsTracker");
                    throw null;
                }
                if (i0Var.e(uid)) {
                    is1.i0 i0Var2 = this.f109204c;
                    if (i0Var2 == null) {
                        Intrinsics.r("translationsTracker");
                        throw null;
                    }
                    is1.h0 b13 = i0Var2.b(uid);
                    t10.g gVar = b13 != null ? b13.f73601f : null;
                    recipe = gVar != null ? kh2.s0.H0(recipe, gVar) : null;
                }
            }
            if (recipe != null) {
                rk0 rk0Var2 = rk0.SERVING_SIZE;
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Intrinsics.checkNotNullParameter(recipe, "recipe");
                Intrinsics.checkNotNullParameter(resources, "resources");
                Intrinsics.checkNotNullParameter(recipe, "recipe");
                List diets = recipe.f115780l;
                Intrinsics.checkNotNullParameter(diets, "diets");
                Intrinsics.checkNotNullParameter(resources, "resources");
                ArrayList arrayList = new ArrayList();
                String a13 = is1.r.a(recipe, resources);
                Intrinsics.f(a13);
                if (!kotlin.text.z.j(a13)) {
                    arrayList.add(Html.fromHtml(a13).toString());
                }
                Iterator it = diets.iterator();
                while (it.hasNext()) {
                    arrayList.add(Html.fromHtml((String) it.next()).toString());
                }
                linkedHashMap2.put(rk0Var2, arrayList);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (((Boolean) this.f109211j.getValue()).booleanValue() && (pin2 = getPin()) != null && (v63 = pin2.v6()) != null && (q13 = v63.q()) != null && (k13 = q13.k()) != null && (c13 = k13.c()) != null) {
            for (wm0 wm0Var : c13) {
                Integer d2 = wm0Var.d();
                rk0 rk0Var3 = rk0.COOK_TIME;
                if (d2.intValue() == rk0Var3.getCategory()) {
                    String f13 = wm0Var.f();
                    Intrinsics.checkNotNullExpressionValue(f13, "getValue(...)");
                    int parseInt2 = Integer.parseInt(f13);
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    linkedHashMap3.put(rk0Var3, kotlin.collections.f0.d(StringsKt.i0(qg1.d.b(parseInt2, context2, false)).toString()));
                } else {
                    rk0 rk0Var4 = rk0.SERVING_SIZE;
                    if (d2.intValue() == rk0Var4.getCategory()) {
                        Resources resources2 = getContext().getResources();
                        int i14 = m60.w0.recipe_serving;
                        String f14 = wm0Var.f();
                        Intrinsics.checkNotNullExpressionValue(f14, "getValue(...)");
                        int parseInt3 = Integer.parseInt(f14);
                        String f15 = wm0Var.f();
                        Intrinsics.checkNotNullExpressionValue(f15, "getValue(...)");
                        String quantityString = resources2.getQuantityString(i14, parseInt3, Integer.valueOf(Integer.parseInt(f15)));
                        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                        linkedHashMap3.put(rk0Var4, kotlin.collections.f0.d(StringsKt.i0(quantityString).toString()));
                    } else {
                        String e13 = wm0Var.e();
                        Intrinsics.checkNotNullExpressionValue(e13, "getKey(...)");
                        String f16 = wm0Var.f();
                        Intrinsics.checkNotNullExpressionValue(f16, "getValue(...)");
                        Integer d13 = wm0Var.d();
                        Intrinsics.checkNotNullExpressionValue(d13, "getCategoryType(...)");
                        int intValue = d13.intValue();
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        String a14 = qg1.d.a(intValue, context3, f16);
                        if ((!kotlin.text.z.j(e13)) && (!kotlin.text.z.j(a14))) {
                            rk0 rk0Var5 = rk0.DIFFICULTY;
                            String string = getContext().getString(pq1.f.idea_pin_list_item_key_value, e13, a14);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            linkedHashMap3.put(rk0Var5, kotlin.collections.f0.d(StringsKt.i0(string).toString()));
                        }
                    }
                }
            }
        }
        linkedHashMap2.putAll(linkedHashMap3);
        LinkedHashMap linkedHashMap4 = this.f109210i;
        if (linkedHashMap2 instanceof SortedMap) {
            SortedMap sortedMap = (SortedMap) linkedHashMap2;
            linkedHashMap4.getClass();
            Comparator comparator = sortedMap.comparator();
            if (comparator == null) {
                comparator = pk.s2.f100480a;
            }
            TreeMap treeMap = new TreeMap(comparator);
            TreeMap treeMap2 = new TreeMap(comparator);
            treeMap2.putAll(linkedHashMap4);
            TreeMap treeMap3 = new TreeMap(comparator);
            TreeMap treeMap4 = new TreeMap(comparator);
            bf.b.K(sortedMap, linkedHashMap4, ok.r.f95443a, treeMap, treeMap2, treeMap3, treeMap4);
            i2Var = new pk.j2(treeMap, treeMap2, treeMap3, treeMap4);
            linkedHashMap = linkedHashMap4;
        } else {
            ok.r rVar = ok.r.f95443a;
            rVar.getClass();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(linkedHashMap4);
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
            linkedHashMap = linkedHashMap4;
            bf.b.K(linkedHashMap2, linkedHashMap4, rVar, linkedHashMap5, linkedHashMap6, linkedHashMap7, linkedHashMap8);
            i2Var = new pk.i2(linkedHashMap5, linkedHashMap6, linkedHashMap7, linkedHashMap8);
        }
        boolean z14 = !(i2Var.f100422a.isEmpty() && i2Var.f100423b.isEmpty() && i2Var.f100425d.isEmpty());
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        loop2: while (true) {
            if (!it2.hasNext()) {
                z13 = true;
                break;
            }
            Iterator it3 = ((Iterable) ((Map.Entry) it2.next()).getValue()).iterator();
            while (it3.hasNext()) {
                if (kotlin.text.z.j((String) it3.next())) {
                    z13 = false;
                    break loop2;
                }
            }
        }
        if (linkedHashMap.isEmpty() || (z14 && z13)) {
            ConstraintLayout constraintLayout2 = this.f109206e;
            for (int childCount = (constraintLayout2 != null ? constraintLayout2.getChildCount() : 0) - 1; -1 < childCount; childCount--) {
                ConstraintLayout constraintLayout3 = this.f109206e;
                View childAt = constraintLayout3 != null ? constraintLayout3.getChildAt(childCount) : null;
                if (!(childAt instanceof Flow) && !(childAt instanceof PinCloseupRatingView) && (constraintLayout = this.f109206e) != null) {
                    constraintLayout.removeView(childAt);
                }
            }
            linkedHashMap.clear();
            LinkedHashMap linkedHashMap9 = linkedHashMap;
            linkedHashMap9.putAll(linkedHashMap2);
            int i15 = 0;
            for (Object obj : linkedHashMap9.entrySet()) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                for (String str : (Iterable) ((Map.Entry) obj).getValue()) {
                    if (str.length() > 0) {
                        int generateViewId = View.generateViewId();
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        GestaltText gestaltText = new GestaltText(6, context4, (AttributeSet) null);
                        gestaltText.i(f2.f109182j);
                        if (i15 != 0 || (pin = getPin()) == null || b40.m0(pin)) {
                            str = bs1.c.l1(this) ? i15 == 0 ? str.concat(" ·") : str.concat(" · ") : i15 == 0 ? "· ".concat(str) : " · ".concat(str);
                        }
                        gestaltText.i(new e2(str, generateViewId, i13));
                        ConstraintLayout constraintLayout4 = this.f109206e;
                        if (constraintLayout4 != null) {
                            constraintLayout4.addView(gestaltText);
                        }
                        Flow flow = this.f109207f;
                        if (flow != null) {
                            int[] k14 = flow.k();
                            Intrinsics.checkNotNullExpressionValue(k14, "getReferencedIds(...)");
                            Intrinsics.checkNotNullParameter(k14, "<this>");
                            int length = k14.length;
                            int[] copyOf = Arrays.copyOf(k14, length + 1);
                            copyOf[length] = generateViewId;
                            flow.s(copyOf);
                        }
                    }
                }
                i15 = i16;
            }
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        this.f109206e = new ConstraintLayout(getContext());
        Flow flow = new Flow(getContext());
        flow.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        flow.setId(View.generateViewId());
        flow.C();
        flow.E(0);
        flow.A();
        flow.f17494k.W0 = 0;
        flow.requestLayout();
        flow.f17494k.O0 = 0.0f;
        flow.requestLayout();
        ConstraintLayout constraintLayout = this.f109206e;
        if (constraintLayout != null) {
            constraintLayout.addView(flow);
        }
        this.f109207f = flow;
        addView(this.f109206e);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_RECIPE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasContent() {
        /*
            r4 = this;
            com.pinterest.api.model.f30 r0 = r4.getPin()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = com.pinterest.api.model.b40.m0(r0)
            r3 = 1
            if (r2 != 0) goto L39
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            com.pinterest.api.model.se0 r2 = r0.g6()
            if (r2 == 0) goto L26
            java.lang.Integer r2 = r2.u()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L27
        L26:
            r2 = 0
        L27:
            if (r2 == 0) goto L30
            int r2 = java.lang.Integer.parseInt(r2)
            if (r2 <= 0) goto L30
            goto L39
        L30:
            t10.f r2 = com.pinterest.api.model.b40.Y0(r0)
            if (r2 == 0) goto L37
            goto L39
        L37:
            r2 = r1
            goto L3a
        L39:
            r2 = r3
        L3a:
            java.lang.Boolean r0 = r0.d5()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L55
            if (r2 != 0) goto L54
            xk2.v r0 = r4.f109211j
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L55
        L54:
            r1 = r3
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.g2.hasContent():boolean");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ek2.j jVar = this.f109205d;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.f109205d = null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        kh2.r.u(this.f109206e, "PinCloseupRecipeMetadataModule.recipeContainer");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.updatePin(pin);
        f30 pin2 = getPin();
        if (pin2 != null && Intrinsics.d(pin2.j5(), Boolean.TRUE) && this.f109205d == null) {
            is1.i0 i0Var = this.f109204c;
            if (i0Var == null) {
                Intrinsics.r("translationsTracker");
                throw null;
            }
            f30 pin3 = getPin();
            String uid = pin3 != null ? pin3.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            this.f109205d = (ek2.j) i0Var.c(uid).F(new d1(8, new z3.m(this, 25)), new d1(9, f2.f109183k), ck2.i.f27923c, ck2.i.f27924d);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        ConstraintLayout constraintLayout;
        super.updateView();
        f30 pin = getPin();
        if (pin != null) {
            Pair pair = new Pair(Float.valueOf(b40.W(pin)), b40.X(pin));
            boolean z13 = !Intrinsics.d(pair, this.f109209h);
            boolean m03 = b40.m0(pin);
            if (z13 && m03) {
                if (this.f109209h != null && (constraintLayout = this.f109206e) != null) {
                    constraintLayout.removeView(this.f109208g);
                }
                this.f109209h = pair;
                int generateViewId = View.generateViewId();
                Flow flow = this.f109207f;
                if (flow != null) {
                    int[] k13 = flow.k();
                    Intrinsics.checkNotNullExpressionValue(k13, "getReferencedIds(...)");
                    Intrinsics.checkNotNullParameter(k13, "<this>");
                    int length = k13.length;
                    int[] copyOf = Arrays.copyOf(k13, length + 1);
                    copyOf[length] = generateViewId;
                    flow.s(copyOf);
                }
                Context context = getContext();
                Boolean bool = Boolean.TRUE;
                PinCloseupRatingView pinCloseupRatingView = new PinCloseupRatingView(context);
                pinCloseupRatingView.setId(generateViewId);
                pinCloseupRatingView.a(pin, bool);
                ConstraintLayout constraintLayout2 = this.f109206e;
                if (constraintLayout2 != null) {
                    constraintLayout2.addView(pinCloseupRatingView, 1);
                }
                this.f109208g = pinCloseupRatingView;
            }
        }
        b();
        bs1.c.R1(this.f109206e, hasContent());
    }
}
