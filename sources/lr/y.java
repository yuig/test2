package lr;

import android.content.Context;
import android.content.Intent;
import com.pinterest.api.model.v7;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.navigation.Navigation;
import df.j1;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import so.oa;

/* loaded from: classes3.dex */
public class y extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84567d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final String f84568e;

    /* renamed from: f, reason: collision with root package name */
    public Object f84569f;

    /* renamed from: g, reason: collision with root package name */
    public Object f84570g;

    public y(Navigation navigation, String _displayText, String str) {
        Intrinsics.checkNotNullParameter(_displayText, "_displayText");
        this.f84569f = navigation;
        this.f84568e = _displayText;
        this.f84570g = str;
    }

    public static Unit d(y yVar, PinterestToastContainer pinterestToastContainer, GestaltToast gestaltToast) {
        yVar.getClass();
        pinterestToastContainer.f(gestaltToast);
        Context context = pinterestToastContainer.getContext();
        switch (yVar.f84567d) {
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                m60.u.f85943a.d(new pg0.a(((v7) yVar.f84569f).getUid(), true));
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(String str) {
        Object f13 = lb0.g.f("SILENCED_URL");
        m60.a0 a0Var = f13 != null ? (m60.a0) f13 : new m60.a0();
        if (!a0Var.containsKey(str)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(a0Var.keySet());
        if (arrayList.get(arrayList.size() - 1).equals(str)) {
            return false;
        }
        return System.currentTimeMillis() - ((Long) a0Var.get(str)).longValue() >= 86400000;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        int i13 = 1;
        switch (this.f84567d) {
            case 0:
                this.f84569f = container.getContext();
                this.f84570g = new GestaltToast((Context) this.f84569f).v(new xo.j(22));
                sh.f.a().N(f1.VIEW, u0.CLIPBOARD_BUTTON, null, null, false);
                String str = this.f84568e;
                int i14 = 2;
                String[] split = str.split("://", 2);
                if (split.length > 1) {
                    str = split[1];
                }
                if (((GestaltToast) this.f84570g) != null) {
                    ((GestaltToast) this.f84570g).v(new lp.l(j1.X("%s\n%s", bs1.c.b2(x0.pin_from_clipboard), str), i14));
                }
                return (GestaltToast) this.f84570g;
            case 1:
                Intrinsics.checkNotNullParameter(container, "container");
                Context context = container.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                CharSequence a03 = j1.a0(this.f84568e);
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                u50.f0 h23 = bs1.c.h2(a03);
                String str2 = (String) this.f84570g;
                return new GestaltToast(context, new do1.d(h23, str2 != null ? new do1.j(str2) : null, null, null, 0, 0, 0, null, false, 508));
            default:
                GestaltToast gestaltToast = new GestaltToast(container.getContext());
                gestaltToast.v(new eq.a(this, container, gestaltToast, i13));
                return gestaltToast;
        }
    }

    @Override // we0.a
    public final void b(Context context) {
        switch (this.f84567d) {
            case 0:
                super.b(context);
                sh.f.a().F(g0.TOAST, u0.PIN_REPIN_BUTTON);
                Context context2 = kb0.a.f79058b;
                Intent intent = new Intent(context, (Class<?>) ((lu1.d) ((oa) ((x) pk.a0.M(m60.f0.X(), x.class))).f113782l2.get()).a(lu1.a.PIN_IT_ACTIVITY));
                intent.putExtra("android.intent.extra.TEXT", this.f84568e);
                intent.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", "clipboard");
                context.startActivity(intent);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                Navigation navigation = (Navigation) this.f84569f;
                if (navigation != null) {
                    m60.u.f85943a.d(navigation);
                }
                if (bs1.c.c1(context) && (bs1.c.k0(context) instanceof np.a)) {
                    bs1.c.k0(context).finish();
                    break;
                }
                break;
            default:
                super.b(context);
                break;
        }
    }

    @Override // we0.a
    public final void c(Context context) {
        switch (this.f84567d) {
            case 2:
                super.c(context);
                h12.a aVar = (h12.a) this.f84570g;
                String boardId = ((v7) this.f84569f).getUid();
                aVar.getClass();
                Intrinsics.checkNotNullParameter(boardId, "boardId");
                fk2.c l13 = aVar.f66466a.a(boardId).h(wj2.c.a()).l(tk2.e.f118017c);
                d onComplete = new d(this, 0);
                Intrinsics.checkNotNullParameter(l13, "<this>");
                Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                nl.b.r(l13, onComplete, null, 2);
                break;
            default:
                super.c(context);
                break;
        }
    }

    public y(String str) {
        this.f84568e = str;
        Object f13 = lb0.g.f("SILENCED_URL");
        m60.a0 a0Var = f13 != null ? (m60.a0) f13 : new m60.a0();
        a0Var.put(str, Long.valueOf(System.currentTimeMillis()));
        lb0.g.h("SILENCED_URL", a0Var);
    }

    public y(String str, v7 v7Var, h12.a aVar) {
        this.f84568e = str;
        this.f84569f = v7Var;
        this.f84570g = aVar;
    }
}
