package ap;

import com.pinterest.api.model.ew0;
import com.pinterest.api.model.fw0;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import java.util.Calendar;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import wr0.w;
import wr0.y;
import x02.x2;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20270c;

    public /* synthetic */ i(Object obj, int i13, int i14) {
        this.f20268a = i14;
        this.f20270c = obj;
        this.f20269b = i13;
    }

    @Override // ak2.a
    public final void run() {
        String str;
        String uid;
        int i13 = this.f20268a;
        int i14 = this.f20269b;
        Object obj = this.f20270c;
        switch (i13) {
            case 0:
                o this$0 = (o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((pb0.g) this$0.f20282b).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                LinkedHashSet b13 = this$0.b();
                if (b13 != null) {
                    wy0 f13 = ((b60.d) this$0.f20288h).f();
                    String str2 = "";
                    if (f13 == null || (str = f13.getUid()) == null) {
                        str = "";
                    }
                    if (dl2.b.s(b13).remove(o.a(str, b13))) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(currentTimeMillis);
                        calendar.add(5, 7);
                        if (f13 != null && (uid = f13.getUid()) != null) {
                            str2 = uid;
                        }
                        b13.add(str2 + ":" + calendar.getTimeInMillis() + ":" + i14);
                        this$0.f20289i.j("PREF_ACCOUNTS_STORED_CONTACTS", b13);
                        break;
                    }
                }
                break;
            case 1:
                lu.f this$02 = (lu.f) obj;
                int i15 = lu.f.M;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.A = i14;
                this$02.C(i14);
                break;
            case 2:
                w this$03 = (w) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                y yVar = this$03.f130930d;
                Object obj2 = yVar.d().get(i14);
                fw0 fw0Var = obj2 instanceof fw0 ? (fw0) obj2 : null;
                if (fw0Var != null) {
                    ew0 ew0Var = new ew0(fw0Var, 0);
                    ew0Var.f37381g = Boolean.TRUE;
                    boolean[] zArr = ew0Var.f37388n;
                    if (zArr.length > 6) {
                        zArr[6] = true;
                    }
                    fw0 a13 = ew0Var.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                    yVar.u1(i14, a13);
                    break;
                }
                break;
            default:
                x2 this$04 = (x2) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                wy0 f14 = ((b60.d) this$04.K).f();
                if (f14 != null) {
                    vy0 H4 = f14.H4();
                    int intValue = f14.b4().intValue() + i14;
                    H4.f43040f1 = Integer.valueOf(intValue >= 0 ? intValue : 0);
                    boolean[] zArr2 = H4.V1;
                    if (zArr2.length > 109) {
                        zArr2[109] = true;
                    }
                    wy0 a14 = H4.a();
                    this$04.W(a14);
                    ((b60.d) this$04.K).k(a14);
                    break;
                }
                break;
        }
    }
}
