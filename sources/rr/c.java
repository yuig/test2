package rr;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f109713b;

    public c(int i13, Function1 function) {
        this.f109712a = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f109713b = function;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f109713b = function;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f109713b = function;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f109713b = function;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f109713b = function;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f109713b = function;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f109713b = function;
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f109713b = function;
                break;
        }
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f109712a;
        Object obj2 = this.f109713b;
        switch (i13) {
            case 0:
                ((Function1) obj2).invoke(obj);
                break;
            case 1:
                ((Function1) obj2).invoke(obj);
                break;
            case 2:
                ((Function1) obj2).invoke(obj);
                break;
            case 3:
                ((Function1) obj2).invoke(obj);
                break;
            case 4:
                ((Function1) obj2).invoke(obj);
                break;
            case 5:
                ((Function1) obj2).invoke(obj);
                break;
            case 6:
                ((Function1) obj2).invoke(obj);
                break;
            case 7:
                ((Function1) obj2).invoke(obj);
                break;
            default:
                ba baVar = (ba) obj;
                if (baVar != null) {
                    mn0.e eVar = (mn0.e) obj2;
                    if (eVar.isBound()) {
                        eVar.getPinalytics().a(h32.f1.BOARD_SECTION_CREATE, baVar.getUid(), false, true);
                        if (!eVar.f87764c) {
                            eVar.f87774m.f(new ls1.n(eVar.f87765d, eVar.f87766e));
                            ((rn0.e) ((ln0.b) eVar.getView())).setLoadState(yk1.i.LOADED);
                            ((rn0.e) ((ln0.b) eVar.getView())).Y7();
                            break;
                        } else {
                            ((rn0.e) ((ln0.b) eVar.getView())).setLoadState(yk1.i.LOADING);
                            v7 v7Var = eVar.f87783v;
                            if (v7Var != null) {
                                String uid = baVar.getUid();
                                List list = eVar.f87768g;
                                if (list == null) {
                                    list = kotlin.collections.q0.f80391a;
                                }
                                eVar.f87772k.e0(v7Var, eVar.f87766e, eVar.f87763b, uid, list).i(new xo.c(eVar, v7Var, baVar, 8), new xl0.a(17, new mn0.b(eVar, 7)));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public c(mn0.e eVar) {
        this.f109712a = 8;
        this.f109713b = eVar;
    }
}
