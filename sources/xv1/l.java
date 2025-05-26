package xv1;

import c71.b0;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.o00;
import df.j1;
import h32.u1;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes4.dex */
public abstract class l extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f136079a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f136080b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f136081c;

    /* renamed from: d, reason: collision with root package name */
    public g00 f136082d;

    /* renamed from: e, reason: collision with root package name */
    public int f136083e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f136084f;

    /* renamed from: g, reason: collision with root package name */
    public u1 f136085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(uk1.d presenterPinalytics, boolean z13) {
        super(0);
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f136079a = clock;
        this.f136080b = z13;
        this.f136081c = new HashMap();
        this.f136084f = d.f136032l;
    }

    @Override // yk1.b
    public final void onUnbind() {
        ((vv1.i) getView()).l4();
        super.onUnbind();
    }

    public void p3(g00 model) {
        Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // yk1.b
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public void r3(vv1.i view) {
        b0 b0Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        b0 b0Var2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        view.l5(this);
        b0 b0Var3 = (b0) this.f136084f.invoke();
        String str7 = "";
        if (!j1.U0(b0Var3 != null ? b0Var3.f26731c : null) ? !((b0Var = (b0) this.f136084f.invoke()) == null || (str = b0Var.f26730b) == null) : !((b0Var2 = (b0) this.f136084f.invoke()) == null || (str = b0Var2.f26731c) == null)) {
            str7 = str;
        }
        b0 b0Var4 = (b0) this.f136084f.invoke();
        HashMap hashMap = this.f136081c;
        if (b0Var4 != null && (str6 = b0Var4.f26730b) != null) {
            hashMap.put("query", str6);
        }
        b0 b0Var5 = (b0) this.f136084f.invoke();
        if (b0Var5 != null && (str5 = b0Var5.S) != null) {
            hashMap.put("pinner_displayed_query", str5);
        }
        b0 b0Var6 = (b0) this.f136084f.invoke();
        if (b0Var6 != null && (str4 = b0Var6.X) != null) {
            hashMap.put("image_signature", str4);
        }
        b0 b0Var7 = (b0) this.f136084f.invoke();
        if (b0Var7 != null && (str3 = b0Var7.W) != null) {
            hashMap.put("pin_id", str3);
        }
        b0 b0Var8 = (b0) this.f136084f.invoke();
        if (b0Var8 != null && (str2 = b0Var8.f26729a0) != null) {
            hashMap.put("descriptor", str2);
        }
        hashMap.put("entered_query", str7);
        g00 g00Var = this.f136082d;
        if (g00Var != null) {
            q42.d dVar = q42.f.Companion;
            Integer w13 = g00Var.w();
            Intrinsics.checkNotNullExpressionValue(w13, "getModuleType(...)");
            int intValue = w13.intValue();
            dVar.getClass();
            view.d1(q42.d.a(intValue));
            view.setEnabled(true);
            p3(g00Var);
        }
    }

    public abstract void r3(boolean z13);

    public final vv1.n s3() {
        u1 u1Var;
        g00 g00Var;
        u1 source = this.f136085g;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            u1Var = new u1(source.f67269a, source.f67270b, Long.valueOf(((pb0.g) this.f136079a).a()), source.f67272d, source.f67273e, source.f67274f, source.f67275g);
        } else {
            u1Var = null;
        }
        this.f136085g = null;
        if (u1Var == null) {
            return null;
        }
        HashMap n13 = bs1.c.n(this.f136081c);
        if (this.f136080b && (g00Var = this.f136082d) != null) {
            if (g00Var.w().intValue() == q42.f.GUIDE.getValue()) {
                n13.put("onebar_module_type", String.valueOf(q42.f.STRUCTURED_GUIDE.getValue()));
            }
        }
        return new vv1.n(u1Var, n13);
    }

    public final u1 t3() {
        o00 v13;
        if (this.f136085g == null) {
            Long valueOf = Long.valueOf(((pb0.g) this.f136079a).a());
            Short valueOf2 = Short.valueOf((short) this.f136083e);
            g00 g00Var = this.f136082d;
            Short valueOf3 = g00Var != null ? Short.valueOf((short) g00Var.w().intValue()) : null;
            g00 g00Var2 = this.f136082d;
            String p13 = (g00Var2 == null || (v13 = g00Var2.v()) == null) ? null : v13.p();
            g00 g00Var3 = this.f136082d;
            this.f136085g = new u1(null, valueOf, null, valueOf2, valueOf3, p13, g00Var3 != null ? g00Var3.x() : null);
        }
        return this.f136085g;
    }

    public final void u3(g00 g00Var) {
        String str;
        Map u13;
        Object obj;
        o00 v13;
        String t13;
        o00 v14;
        String p13;
        this.f136082d = g00Var;
        HashMap hashMap = this.f136081c;
        if (g00Var != null) {
            hashMap.put("onebar_module_type", String.valueOf(g00Var.w().intValue()));
        } else {
            hashMap.remove("onebar_module_type");
        }
        g00 g00Var2 = this.f136082d;
        if (g00Var2 == null || (v14 = g00Var2.v()) == null || (p13 = v14.p()) == null) {
            hashMap.remove("label");
        } else {
            hashMap.put("label", p13);
        }
        g00 g00Var3 = this.f136082d;
        if (g00Var3 == null || (v13 = g00Var3.v()) == null || (t13 = v13.t()) == null || (str = String.valueOf(!z.j(t13))) == null) {
            str = "false";
        }
        hashMap.put("has_variant_image_thumbnail", str);
        g00 g00Var4 = this.f136082d;
        if (g00Var4 == null || (u13 = g00Var4.u()) == null || (obj = u13.get("module_id")) == null) {
            return;
        }
        hashMap.put("module_id", obj.toString());
    }

    public final void v3(int i13) {
        this.f136083e = i13;
        this.f136081c.put("grid_index", String.valueOf(i13));
    }
}
