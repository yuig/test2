package i11;

import com.pinterest.api.model.v7;
import h32.f1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import x02.i2;

/* loaded from: classes5.dex */
public final class j extends rk2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f70976b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f70977c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f70978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f70979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f70980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f70981g;

    public j(m mVar, String str, String str2, String str3, String str4, List list) {
        this.f70976b = mVar;
        this.f70977c = str;
        this.f70978d = str2;
        this.f70979e = str3;
        this.f70980f = str4;
        this.f70981g = list;
    }

    @Override // uj2.d
    public final void a() {
        m mVar = this.f70976b;
        w wVar = mVar.f71001g;
        String str = mVar.f71020u;
        if (str == null) {
            str = "";
        }
        wVar.f(new ls1.n(str, this.f70977c));
        if (mVar.isBound()) {
            ((l11.j) ((f11.d) mVar.getView())).dismiss();
        }
        String str2 = this.f70978d;
        v7 G3 = mVar.G3(str2);
        i2 i2Var = mVar.f70995d;
        if (G3 != null) {
            String str3 = mVar.f71021v;
            if (str3 == null) {
                str3 = mVar.f71013n;
                Intrinsics.f(str3);
            }
            pe.i.s1(i2Var, str3, G3);
        } else {
            String str4 = mVar.L;
            String g13 = ((b60.d) mVar.f70999f).g();
            if (str4 != null && g13 != null) {
                pe.i.t1(i2Var, str4, g13, ((yk1.a) mVar.f71003h).f139224a.getString(x0.profile));
            }
        }
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("board_id", str2);
        }
        hashMap.put("pin_id", this.f70981g.toString());
        String str5 = mVar.f71023x;
        hashMap.put("save_session_id", str5 != null ? str5 : "");
        mVar.getPinalytics().h0(f1.BULK_PIN_MOVE, null, null, null, hashMap, null, null, false);
        mVar.a4(str2, this.f70979e, this.f70980f);
    }

    @Override // uj2.d
    public final void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        m mVar = this.f70976b;
        if (mVar.isBound()) {
            ((l11.j) ((f11.d) mVar.getView())).setLoadState(yk1.i.LOADED);
        }
        error.getMessage();
    }
}
