package xo;

import android.content.Context;
import android.util.Log;
import com.pinterest.error.ServerError;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import org.json.JSONObject;
import so.oa;
import v.f1;
import x81.o0;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135526a;

    public /* synthetic */ l(int i13) {
        this.f135526a = i13;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        switch (this.f135526a) {
            case 0:
                int i13 = q.f135531w;
                break;
            case 1:
                m60.u.f85943a.d(new ap.k());
                break;
            case 2:
                int i14 = dp.b.f56028f;
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.o("SendShareService Fail: newMessageFlowGetContacts", (Throwable) obj);
                break;
            case 3:
                int i15 = tp.g.f118732l;
                f1 f1Var = ((ServerError) ((Throwable) obj)).f45043a;
                if (f1Var != null) {
                    String string = new JSONObject(new String((byte[]) f1Var.f123451d, StandardCharsets.UTF_8)).getString("message");
                    Context context = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(string);
                    break;
                }
                break;
            case 4:
                int i16 = tp.g.f118732l;
                Context context2 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(((Throwable) obj).getMessage());
                break;
            case 5:
                int i17 = tp.g.f118732l;
                f1 f1Var2 = ((ServerError) ((Throwable) obj)).f45043a;
                if (f1Var2 != null) {
                    String string2 = new JSONObject(new String((byte[]) f1Var2.f123451d, StandardCharsets.UTF_8)).getString("message");
                    Context context3 = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(string2);
                    break;
                }
                break;
            case 6:
                int i18 = tp.g.f118732l;
                Context context4 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(((Throwable) obj).getMessage());
                break;
            case 7:
                int i19 = tp.g.f118732l;
                Context context5 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(((Throwable) obj).getMessage());
                break;
            case 8:
                int i23 = tp.m.f118757k;
                Context context6 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(((Throwable) obj).getMessage());
                break;
            case 9:
                int i24 = tp.m.f118757k;
                f1 f1Var3 = ((ServerError) ((Throwable) obj)).f45043a;
                if (f1Var3 != null) {
                    String string3 = new JSONObject(new String((byte[]) f1Var3.f123451d, "utf-8")).getString("message");
                    Context context7 = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(string3);
                    break;
                }
                break;
            case 10:
                int i25 = tp.m.f118757k;
                f1 f1Var4 = ((ServerError) ((Throwable) obj)).f45043a;
                if (f1Var4 != null) {
                    String string4 = new JSONObject(new String((byte[]) f1Var4.f123451d, "utf-8")).getString("message");
                    Context context8 = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(string4);
                    break;
                }
                break;
            case 11:
                int i26 = tp.m.f118757k;
                Context context9 = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(((Throwable) obj).getMessage());
                break;
            case 12:
                Log.e("PincodePresenter", "something went wrong with the Pincode board image request");
                break;
            case 13:
                int i27 = dr.k.H;
                HashSet hashSet2 = tb0.h.f117076w;
                tb0.g.f117075a.q((Throwable) obj, "SendShareService Fail: inviteUserExternalSent", tb0.p.SHARING);
                break;
            case 14:
                int i28 = dr.k.H;
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                ha2.a0 a0Var = o0.f134258e0;
                ((Throwable) obj).getMessage();
                break;
            case 25:
                ((Throwable) obj).getMessage();
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                ((Throwable) obj).getMessage();
                break;
        }
    }
}
