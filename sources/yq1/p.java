package yq1;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f139933r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f139934s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f139935t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f139935t = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        p pVar = new p(this.f139935t, cVar);
        pVar.f139934s = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String string;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f139933r;
        q qVar = this.f139935t;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f139934s;
            ao2.k2 z13 = kotlin.jvm.internal.j.z(j0Var, null, null, new n(qVar, null), 3);
            qVar.f139954k0 = z13;
            Unit unit = Unit.f80348a;
            ao2.o1[] o1VarArr = {z13, kotlin.jvm.internal.j.z(j0Var, null, null, new o(qVar, null), 3)};
            this.f139933r = 1;
            if (com.bumptech.glide.c.F0(o1VarArr, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        Bundle bundle = qVar.f139953j0;
        if (bundle == null || (string = bundle.getString("com.pinterest.EXTRA_SIGNUP_INVITE_URL", null)) == null) {
            Bundle bundle2 = qVar.f139953j0;
            boolean z14 = bundle2 != null ? bundle2.getBoolean("com.pinterest.EXTRA_CREATE_PASSWORD", false) : false;
            if (z14) {
                androidx.fragment.app.w0 supportFragmentManager = qVar.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                int i14 = vq1.b.fragment_wrapper;
                il1.a aVar2 = qVar.f139947d0;
                if (aVar2 == null) {
                    Intrinsics.r("fragmentFactory");
                    throw null;
                }
                nl1.d dVar = (nl1.d) aVar2.e(com.pinterest.screens.j2.a());
                dVar.setArguments(qVar.f139953j0);
                Unit unit2 = Unit.f80348a;
                mo1.c.c(supportFragmentManager, i14, dVar, false, mo1.a.FADE, 32);
            }
            if (!z14) {
                je0.b bVar = qVar.f139948e0;
                if (bVar == null) {
                    Intrinsics.r("deepLinkManager");
                    throw null;
                }
                String j13 = ((lb0.b) bVar.f75835a.f75839a).j("PREF_INSTALL_REFERRER_LATEST", null);
                nm.u i15 = j13 != null ? df.j1.p1(j13).i() : new nm.u();
                Intrinsics.checkNotNullExpressionValue(i15, "getCachedMetaData(...)");
                androidx.fragment.app.w0 supportFragmentManager2 = qVar.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                int i16 = vq1.b.fragment_wrapper;
                b20.c cVar = new b20.c(i15);
                Bundle bundle3 = new Bundle();
                bundle3.putAll(qVar.f139953j0);
                nm.s v13 = i15.v("from_play_install_referrer_link");
                if (v13 != null && v13.b()) {
                    if (cVar.l() != null) {
                        bundle3.putString("com.pinterest.EXTRA_PIN_ID", cVar.l());
                    } else if (cVar.i() != null) {
                        bundle3.putString("com.pinterest.EXTRA_BOARD_ID", cVar.i());
                    } else if (!pk.a0.x0(cVar.k())) {
                        bundle3.putString("com.pinterest.EXTRA_KLP_ID", cVar.k());
                    }
                }
                il1.a aVar3 = qVar.f139947d0;
                if (aVar3 == null) {
                    Intrinsics.r("fragmentFactory");
                    throw null;
                }
                nl1.d dVar2 = (nl1.d) aVar3.e((ScreenLocation) com.pinterest.screens.j2.f51010c.getValue());
                dVar2.setArguments(bundle3);
                mo1.c.c(supportFragmentManager2, i16, dVar2, false, mo1.a.FADE, 32);
            }
        } else {
            lu1.b Y7 = qVar.Y7();
            FragmentActivity requireActivity = qVar.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            ((lu1.c) Y7).t(requireActivity, string, false, false);
        }
        return Unit.f80348a;
    }
}
