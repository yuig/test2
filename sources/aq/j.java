package aq;

import androidx.appcompat.widget.q;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v.q1;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20348a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20349b = z0.f(new Pair(d.PIN_ID, new i(this, 10)), new Pair(d.TITLE, new i(this, 12)), new Pair(d.DESCRIPTION, new i(this, 13)), new Pair(d.USER_MENTION_TAGS, new i(this, 14)), new Pair(d.LINK, new i(this, 15)), new Pair(d.BOARD_ID, new i(this, 16)), new Pair(d.SECTION_ID, new i(this, 17)), new Pair(d.ALT_TEXT, new i(this, 18)), new Pair(d.PUBLISH_TIME, new i(this, 19)), new Pair(d.IS_SHOPPING_REC_ALLOWED, new i(this, 0)), new Pair(d.IS_COMMENTING_TOGGLE_ALLOWED, new i(this, 1)), new Pair(d.IS_COMMENTING_ALLOWED, new i(this, 2)), new Pair(d.INTEREST_TAGGING, new i(this, 3)), new Pair(d.FREEFORM_TAGGING, new i(this, 4)), new Pair(d.INTEREST_LABELS, new i(this, 5)), new Pair(d.DETAILS, new i(this, 6)), new Pair(d.TEMPLATE_TYPE, new i(this, 7)), new Pair(d.PAID_PARTNERSHIP, new i(this, 8)), new Pair(d.SPONSOR_ID, new i(this, 9)), new Pair(d.PRODUCT_TAGS, new i(this, 11)));

    public static String T(j jVar, d field) {
        jVar.getClass();
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter("", "default");
        Object orDefault = jVar.f20348a.getOrDefault(field, "");
        Intrinsics.checkNotNullExpressionValue(orDefault, "getOrDefault(...)");
        return (String) orDefault;
    }

    public abstract String A();

    public abstract String B();

    public abstract String C();

    public abstract String D();

    public abstract String E();

    public abstract String F();

    public abstract String G();

    public abstract List H();

    public abstract Boolean I();

    public abstract String J();

    public abstract List K();

    public final String L(d field) {
        Intrinsics.checkNotNullParameter(field, "field");
        Function0 function0 = (Function0) this.f20349b.get(field);
        String str = function0 != null ? (String) function0.invoke() : null;
        return str == null ? "" : str;
    }

    public abstract wy0 M();

    public abstract Long N();

    public abstract ba O();

    public abstract String P();

    public abstract String Q();

    public abstract rj0 R();

    public abstract String S();

    public abstract String U();

    public abstract List V();

    public abstract boolean W();

    public final boolean X(d field) {
        Intrinsics.checkNotNullParameter(field, "field");
        return this.f20348a.containsKey(field);
    }

    public abstract boolean Y();

    public abstract boolean Z();

    public abstract boolean a();

    public abstract void a0(h hVar);

    public abstract boolean b();

    public final void b0(d field, String value, boolean z13) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        Function0 function0 = (Function0) this.f20349b.get(field);
        boolean d2 = Intrinsics.d(function0 != null ? (String) function0.invoke() : null, value);
        HashMap hashMap = this.f20348a;
        if (!d2 || z13) {
            hashMap.put(field, value);
        } else {
            hashMap.remove(field);
        }
    }

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract void p(q1 q1Var);

    public abstract void q(q qVar);

    public abstract List r();

    public abstract List s();

    public abstract String t();

    public abstract v7 u();

    public abstract String v();

    public abstract wy0 w();

    public abstract String x();

    public abstract e y();

    public final String z(d field) {
        Intrinsics.checkNotNullParameter(field, "field");
        HashMap hashMap = this.f20348a;
        Function0 function0 = (Function0) this.f20349b.get(field);
        String str = function0 != null ? (String) function0.invoke() : null;
        if (str == null) {
            str = "";
        }
        Object orDefault = hashMap.getOrDefault(field, str);
        Intrinsics.checkNotNullExpressionValue(orDefault, "getOrDefault(...)");
        return (String) orDefault;
    }
}
