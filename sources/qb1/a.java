package qb1;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.widget.x;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.o2;
import dl1.q0;
import dl1.u;
import h32.f1;
import hk2.h;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jc0.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.p;
import lb2.q;
import m60.w;
import oh1.m;
import or1.i;
import pb1.n;
import pb1.s;
import qr1.t;
import u50.r;
import wb1.l;
import x02.d0;
import x02.e0;
import x02.h0;
import x02.i2;
import x02.p2;
import x02.v0;
import x02.x0;
import x02.z1;
import xb1.f;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f103411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f103412c;

    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        this.f103410a = i13;
        this.f103411b = obj;
        this.f103412c = obj2;
    }

    @Override // ak2.a
    public final void run() {
        String uid;
        f1 f1Var;
        int i13 = 1;
        int i14 = this.f103410a;
        int i15 = 0;
        Object obj = this.f103412c;
        Object obj2 = this.f103411b;
        switch (i14) {
            case 0:
                r eventIntake = (r) obj2;
                s request = (s) obj;
                Intrinsics.checkNotNullParameter(eventIntake, "$eventIntake");
                Intrinsics.checkNotNullParameter(request, "$request");
                n nVar = (n) request;
                eventIntake.a(new pb1.e(nVar.f99473b, nVar.f99472a));
                return;
            case 1:
                f this$0 = (f) obj2;
                l item = (l) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                this$0.f134512a.d(new xb1.e(item.f129032h, item.f129033i));
                this$0.f134514c.k(g52.c.settings_updated);
                return;
            case 2:
                m this$02 = (m) obj2;
                az0 didIt = (az0) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(didIt, "$didIt");
                this$02.x3().removeItem(this$02.x3().d().indexOf(didIt));
                String uid2 = didIt.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                this$02.U3(uid2);
                this$02.N3();
                f30 f30Var = this$02.f94537s;
                if (f30Var != null) {
                    this$02.f94524f.W(b40.d(f30Var, false));
                }
                this$02.z3().b(new rp0.c(didIt));
                return;
            case 3:
                q0 this$03 = (q0) obj2;
                dl1.m params = (dl1.m) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(params, "$params");
                this$03.getClass();
                this$03.f55274g.f55284a.remove(params);
                this$03.f55268a.g(params);
                return;
            case 4:
                i authLoggingUtils = (i) obj2;
                or1.f mode = (or1.f) obj;
                Intrinsics.checkNotNullParameter(authLoggingUtils, "$authLoggingUtils");
                Intrinsics.checkNotNullParameter(mode, "$mode");
                authLoggingUtils.g(or1.e.SUCCESS, mode, null);
                return;
            case 5:
                mw0.a locationRequestExperience = (mw0.a) obj2;
                w eventManager = (w) obj;
                Intrinsics.checkNotNullParameter(locationRequestExperience, "$locationRequestExperience");
                Intrinsics.checkNotNullParameter(eventManager, "$eventManager");
                NavigationImpl w13 = Navigation.w1(o2.a());
                w13.y0(locationRequestExperience, "LOCATION_REQUEST_DATA_KEY");
                eventManager.d(w13);
                return;
            case 6:
                d0 this$04 = (d0) obj2;
                u params2 = (u) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(params2, "$params");
                int i16 = ((h0) params2).f131403e;
                wy0 f13 = ((b60.d) this$04.f131316c).f();
                if (f13 != null) {
                    int max = Math.max(f13.t2().intValue() - 1, 0);
                    int max2 = Math.max(f13.b4().intValue() - i16, 0);
                    vy0 H4 = f13.H4();
                    H4.f43068p = Integer.valueOf(max);
                    boolean[] zArr = H4.V1;
                    if (zArr.length > 15) {
                        zArr[15] = true;
                    }
                    H4.f43040f1 = Integer.valueOf(max2);
                    boolean[] zArr2 = H4.V1;
                    if (zArr2.length > 109) {
                        zArr2[109] = true;
                    }
                    wy0 a13 = H4.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                    this$04.f131315b.W(a13);
                    ((b60.d) this$04.f131316c).k(a13);
                    return;
                }
                return;
            case 7:
                x0 this$05 = (x0) obj2;
                v7 originBoard = (v7) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(originBoard, "$originBoard");
                String uid3 = originBoard.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                this$05.j(new u(uid3));
                return;
            case 8:
                String key = (String) obj2;
                z1 this$06 = (z1) obj;
                gi2.b bVar = z1.f131544c;
                Intrinsics.checkNotNullParameter(key, "$key");
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                ReentrantReadWriteLock Q = gi2.b.Q(key);
                ReentrantReadWriteLock.ReadLock readLock = Q.readLock();
                int readHoldCount = Q.getWriteHoldCount() == 0 ? Q.getReadHoldCount() : 0;
                for (int i17 = 0; i17 < readHoldCount; i17++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = Q.writeLock();
                writeLock.lock();
                try {
                    this$06.f131549a.remove(key);
                    this$06.f131550b.k(key);
                    Unit unit = Unit.f80348a;
                    return;
                } finally {
                    while (i15 < readHoldCount) {
                        readLock.lock();
                        i15++;
                    }
                    writeLock.unlock();
                }
            case 9:
                az0 didItData = (az0) obj2;
                p2 this$07 = (p2) obj;
                Intrinsics.checkNotNullParameter(didItData, "$didItData");
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                f30 O = didItData.O();
                if (O == null || (uid = O.getUid()) == null) {
                    return;
                }
                i2 i2Var = (i2) ((bf2.b) this$07.f131465v).get();
                new h(i2Var.M(uid), new jr1.a(22, v0.f131506k), i13).f(new hk2.b(new e0(12, new x02.o2(i2Var, i15)), new e0(13, v0.f131507l), ck2.i.f27923c));
                return;
            case 10:
                lb2.d this$08 = (lb2.d) obj2;
                String userName = (String) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(userName, "$userName");
                nx.d0.v(this$08.f82749d, f1.USER_PASSWORD_RESET_COMPLETED, null, false, 12);
                this$08.f82750e.d(new v(new ji0.b(new hi0.a(userName)), false, 0L, 30));
                return;
            case 11:
                lb2.n this$09 = (lb2.n) obj2;
                or1.b accountType = (or1.b) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(accountType, "$accountType");
                this$09.h(or1.c.DELETE_ACCOUNT, or1.e.SUCCESS, accountType, null);
                return;
            case 12:
                q this$010 = (q) obj2;
                t authResult = (t) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(authResult, "$authResult");
                x xVar = this$010.f82803c;
                authResult.getClass();
                int i18 = qr1.s.f105028a[authResult.f105031c.ordinal()];
                if (i18 == 1) {
                    f1Var = f1.REFERRER_APP_LOGIN;
                } else {
                    if (i18 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f1Var = f1.REFERRER_APP_SIGNUP;
                }
                xVar.getClass();
                p pVar = lb0.n.f82724c;
                if (((lb0.b) pVar.a()).e("PREF_FIRST_AUTH", true)) {
                    xVar.f16712e = ((je0.b) xVar.f16708a).a();
                    if (((HashMap) xVar.f16709b).containsKey("mweb_unauth_id")) {
                        xVar.u();
                        nm.u uVar = (nm.u) xVar.f16712e;
                        if (uVar != null) {
                            if (uVar.v("deeplink_path") != null) {
                                ((HashMap) xVar.f16709b).put("full_url", "pinterest://" + ((nm.u) xVar.f16712e).v("deeplink_path").p());
                            } else if (((nm.u) xVar.f16712e).v("$android_deeplink_path") != null) {
                                ((HashMap) xVar.f16709b).put("full_url", "pinterest://" + ((nm.u) xVar.f16712e).v("$android_deeplink_path").p());
                            } else if (((nm.u) xVar.f16712e).v("android_deeplink_path") != null) {
                                ((HashMap) xVar.f16709b).put("full_url", "pinterest://" + ((nm.u) xVar.f16712e).v("android_deeplink_path").p());
                            }
                        }
                        ((nx.d0) xVar.f16710c).g(f1Var, null, (HashMap) xVar.f16709b, false);
                        ((vy.m) xVar.f16711d).k(f1Var.name().toLowerCase(), new HashMap());
                    }
                    ((lb0.b) pVar.a()).o("PREF_FIRST_AUTH", false);
                    return;
                }
                return;
            default:
                lb2.x this$011 = (lb2.x) obj2;
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(activity, "$activity");
                this$011.getClass();
                Intent intent = new Intent("com.pinterest.unauth.ACTION_USER_LOG_OUT_SUCCESS");
                intent.setPackage(activity.getPackageName());
                activity.sendBroadcast(intent);
                return;
        }
    }
}
