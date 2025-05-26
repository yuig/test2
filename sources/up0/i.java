package up0;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.ts0;
import h32.f1;
import java.util.HashMap;
import kg.n;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class i extends pe0.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f122959c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f122960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ts0 f122961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f122962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f122963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ HashMap f122964h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f122965i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, ts0 ts0Var, d0 d0Var, String str, HashMap hashMap, l lVar, String str2) {
        super(context, null, str2);
        this.f122960d = context;
        this.f122961e = ts0Var;
        this.f122962f = d0Var;
        this.f122963g = str;
        this.f122964h = hashMap;
        this.f122965i = lVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        d0 d0Var = this.f122962f;
        int i13 = this.f122959c;
        Context context = this.f122960d;
        l lVar = this.f122965i;
        HashMap hashMap = this.f122964h;
        String str2 = this.f122963g;
        ts0 ts0Var = this.f122961e;
        switch (i13) {
            case 0:
                n.a(view);
                Intrinsics.checkNotNullParameter(view, "view");
                String j13 = ts0Var.j();
                if (j13 != null) {
                    f1 f1Var = f1.AGGREGATED_PIN_COMMENT_LINK_TAP;
                    str = str2 != null ? str2 : "";
                    hashMap.put("url", j13);
                    Unit unit = Unit.f80348a;
                    d0Var.g(f1Var, str, hashMap, false);
                    ((lu1.c) lVar.f122973a).m(context, g3.C(j13));
                    break;
                }
                break;
            default:
                n.a(view);
                Intrinsics.checkNotNullParameter(view, "view");
                String j14 = ts0Var.j();
                if (j14 != null) {
                    f1 f1Var2 = f1.AGGREGATED_PIN_COMMENT_LINK_TAP;
                    str = str2 != null ? str2 : "";
                    hashMap.put("url", j14);
                    Unit unit2 = Unit.f80348a;
                    d0Var.g(f1Var2, str, hashMap, false);
                    ((lu1.c) lVar.f122973a).m(context, g3.C(j14));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, ts0 ts0Var, d0 d0Var, String str, HashMap hashMap, l lVar, String str2, int i13) {
        super(context, Integer.valueOf(i13), str2);
        this.f122960d = context;
        this.f122961e = ts0Var;
        this.f122962f = d0Var;
        this.f122963g = str;
        this.f122964h = hashMap;
        this.f122965i = lVar;
    }
}
