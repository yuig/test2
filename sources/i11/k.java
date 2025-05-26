package i11;

import com.pinterest.api.model.v7;
import h32.f1;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import x02.i2;

/* loaded from: classes5.dex */
public final class k extends rk2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f70982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f70983c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f70984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v7 f70985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f70986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f70987g;

    public k(m mVar, String str, String str2, v7 v7Var, String str3, List list) {
        this.f70982b = mVar;
        this.f70983c = str;
        this.f70984d = str2;
        this.f70985e = v7Var;
        this.f70986f = str3;
        this.f70987g = list;
    }

    @Override // uj2.d
    public final void a() {
        m mVar = this.f70982b;
        w wVar = mVar.f71001g;
        String str = mVar.f71020u;
        if (str == null) {
            str = "";
        }
        wVar.f(new ls1.n(str, this.f70983c));
        if (mVar.isBound()) {
            ((l11.j) ((f11.d) mVar.getView())).dismiss();
        }
        String str2 = mVar.f71021v;
        if (str2 == null) {
            str2 = this.f70984d;
        }
        i2 i2Var = mVar.f70995d;
        v7 v7Var = this.f70985e;
        pe.i.s1(i2Var, str2, v7Var);
        String uid = v7Var.getUid();
        String j13 = v7Var.j1();
        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
        String str3 = this.f70986f;
        if (str3 == null) {
            str3 = kh2.d.v(v7Var);
        }
        mVar.a4(uid, j13, str3);
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", v7Var.getUid());
        hashMap.put("pin_id", this.f70987g.toString());
        String str4 = mVar.f71023x;
        hashMap.put("save_session_id", str4 != null ? str4 : "");
        mVar.getPinalytics().h0(f1.BULK_PIN_MOVE, null, null, null, hashMap, null, null, false);
    }

    @Override // uj2.d
    public final void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        m mVar = this.f70982b;
        if (mVar.isBound()) {
            ((l11.j) ((f11.d) mVar.getView())).setLoadState(yk1.i.LOADED);
        }
        error.getMessage();
    }
}
