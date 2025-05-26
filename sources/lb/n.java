package lb;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f82629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f82630c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f82631d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i13) {
        this.f82628a = i13;
        this.f82629b = obj;
        this.f82630c = obj2;
        this.f82631d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f82628a;
        int i14 = 1;
        Object obj = this.f82631d;
        Object obj2 = this.f82630c;
        Object obj3 = this.f82629b;
        switch (i13) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                String str = (String) obj;
                WorkDatabase workDatabase = ((o) obj3).f82641e;
                tb.a0 z13 = workDatabase.z();
                z13.getClass();
                ja.f0 d2 = ja.f0.d(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                d2.c1(1, str);
                ja.d0 d0Var = z13.f116950a;
                d0Var.b();
                Cursor m03 = d7.b.m0(d0Var, d2, false);
                try {
                    ArrayList arrayList2 = new ArrayList(m03.getCount());
                    while (m03.moveToNext()) {
                        arrayList2.add(m03.getString(0));
                    }
                    m03.close();
                    d2.e();
                    arrayList.addAll(arrayList2);
                    return workDatabase.y().j(str);
                } catch (Throwable th3) {
                    m03.close();
                    d2.e();
                    throw th3;
                }
            case 1:
                dl1.q0 this$0 = (dl1.q0) obj3;
                dl1.m params = (dl1.m) obj2;
                ep.b.A(obj);
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(params, "$params");
                uj2.q qVar = (uj2.q) this$0.f55282o.get(params);
                if (qVar != null) {
                    return qVar;
                }
                uj2.b0 p03 = this$0.f55269b.b(params);
                int i15 = 4;
                dl1.h tmp0 = new dl1.h(this$0.f55271d, 4);
                p03.getClass();
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                Intrinsics.checkNotNullParameter(p03, "p0");
                uj2.f0 f0Var = (uj2.f0) tmp0.invoke(p03);
                ck2.i.b(f0Var, "source is null");
                int i16 = 2;
                jk2.a0 q13 = new jk2.x(new kk2.m(new kk2.g(f0Var instanceof uj2.b0 ? (uj2.b0) f0Var : new kk2.c(f0Var, 1), new com.pinterest.feature.home.model.h(13, new dl1.f0(this$0, params, i14)), 3), new dl1.b0(6, new dl1.f0(this$0, params, i16)), 2).u().i(pn.f.f100725a), new com.pinterest.feature.home.model.d(this$0, params, i15), i14).q(new com.pinterest.feature.home.model.h(14, new hk1.t(null, i16)));
                Intrinsics.checkNotNullExpressionValue(q13, "doOnError(...)");
                this$0.f55282o.put(params, q13);
                return q13;
            default:
                c60.a accessToken = (c60.a) obj3;
                lb2.n this$02 = (lb2.n) obj2;
                wy0 loggedInUser = (wy0) obj;
                Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(loggedInUser, "$loggedInUser");
                c60.d dVar = c60.d.f26513a;
                c60.d.d(accessToken);
                ((b60.d) this$02.f82791i).j(loggedInUser);
                String activeUserUid = loggedInUser.getUid();
                Intrinsics.checkNotNullExpressionValue(activeUserUid, "getUid(...)");
                cy.k kVar = this$02.f82792j;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(activeUserUid, "activeUserUid");
                kVar.f53412c = activeUserUid;
                this$02.f82793k.f60525f = loggedInUser.getUid();
                if (!dl2.b.L1(loggedInUser)) {
                    a60.a aVar = a60.a.f905a;
                    String uid = loggedInUser.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    aVar.e(accessToken, uid, dl2.b.S2(loggedInUser));
                }
                return loggedInUser;
        }
    }
}
