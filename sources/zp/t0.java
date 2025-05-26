package zp;

import android.content.Context;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t0 implements uj2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f142490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v7 f142491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f142492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f142493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HashMap f142494e;

    public t0(w0 w0Var, v7 v7Var, String str, String str2, HashMap hashMap) {
        this.f142490a = w0Var;
        this.f142491b = v7Var;
        this.f142492c = str;
        this.f142493d = str2;
        this.f142494e = hashMap;
    }

    @Override // uj2.m
    public final void a() {
    }

    @Override // uj2.m
    public final void b(xj2.c d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        m60.w eventManager = this.f142490a.getEventManager();
        mf0.l lVar = new mf0.l();
        int i13 = ry1.f.loading;
        Context context = lVar.getContext();
        lVar.q7(context != null ? context.getString(i13) : null);
        eventManager.d(new of0.a(lVar));
    }

    @Override // uj2.m
    public final void onError(Throwable e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f142490a.getEventManager().d(new of0.b());
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        f30 pin = (f30) obj;
        Intrinsics.checkNotNullParameter(pin, "pin");
        w0 w0Var = this.f142490a;
        w0Var.f142542i0 = pin;
        w0Var.getEventManager().d(new of0.b());
        i92.k kVar = w0Var.R;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        kVar.m(w0Var.getResources().getString(ry1.f.edit_pin_success));
        v7 D3 = pin.D3();
        HashMap hashMap = this.f142494e;
        v7 localBoard = this.f142491b;
        if (localBoard != null && D3 != null && !Intrinsics.d(localBoard.getUid(), D3.getUid())) {
            hashMap.put("board_was_modified", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
            x02.x0 t03 = w0Var.t0();
            Intrinsics.checkNotNullParameter(localBoard, "localBoard");
            t03.c0(1, localBoard);
        }
        String str = this.f142492c;
        if (str != null) {
            String str2 = this.f142493d;
            if (!Intrinsics.d(str, str2)) {
                hashMap.put("original_pin_description", str);
                hashMap.put("edited_pin_description", str2);
            }
        }
        w0Var.z0().g(h32.f1.PIN_EDIT, w0Var.f142542i0.getUid(), hashMap, false);
    }
}
