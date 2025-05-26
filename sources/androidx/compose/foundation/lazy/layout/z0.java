package androidx.compose.foundation.lazy.layout;

import ao2.i1;
import com.pinterest.api.model.VTOPinFeed;
import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;
import s3.i2;
import s3.j2;

/* loaded from: classes2.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i */
    public final /* synthetic */ int f17334i;

    /* renamed from: j */
    public final /* synthetic */ kotlin.jvm.internal.j0 f17335j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i13, kotlin.jvm.internal.j0 j0Var) {
        super(1);
        this.f17334i = i13;
        this.f17335j = j0Var;
    }

    public final Boolean b(n3.l lVar) {
        int i13 = this.f17334i;
        kotlin.jvm.internal.j0 j0Var = this.f17335j;
        switch (i13) {
            case 1:
                Object obj = j0Var.f80434a;
                if (obj == null && lVar.f89082p) {
                    j0Var.f80434a = lVar;
                } else if (obj != null && lVar.f89081o && lVar.f89082p) {
                    j0Var.f80434a = lVar;
                }
                break;
            default:
                if (lVar.f89081o && lVar.f89082p) {
                    j0Var.f80434a = lVar;
                }
                break;
        }
        return Boolean.TRUE;
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f17334i;
        kotlin.jvm.internal.j0 j0Var = this.f17335j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence string = (CharSequence) j0Var.f80434a;
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2((CharSequence) j0Var.f80434a), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f17334i;
        boolean z13 = false;
        kotlin.jvm.internal.j0 j0Var = this.f17335j;
        switch (i13) {
            case 0:
                j2 j2Var = (j2) obj;
                Intrinsics.g(j2Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                l0 l0Var = ((f1) j2Var).f17239n;
                List list = (List) j0Var.f80434a;
                if (list != null) {
                    list.add(l0Var);
                } else {
                    list = kotlin.collections.f0.l(l0Var);
                }
                j0Var.f80434a = list;
                break;
            case 1:
                break;
            case 2:
                n3.l lVar = (n3.l) obj;
                i2 i2Var = i2.ContinueTraversal;
                if (lVar.f89082p) {
                    j0Var.f80434a = lVar;
                    if (lVar.f89081o) {
                        break;
                    }
                }
                break;
            case 3:
                break;
            case 4:
                wm1.k0 bind = (wm1.k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i14 = xc0.i.view_all_requests;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                u50.k0 k0Var = new u50.k0(i14, new ArrayList(0));
                CharSequence string = (CharSequence) j0Var.f80434a;
                Intrinsics.checkNotNullParameter(string, "string");
                wm1.q middleItem = new wm1.q(k0Var, new u50.f0(string), z13, 4);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                break;
            case 5:
                break;
            case 6:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                j0Var.f80434a = it;
                break;
            case 7:
                yl1.b displayState = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(displayState, "state");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                u50.i0 i0Var = displayState.f139300a;
                u50.f0 text = bs1.c.h2((CharSequence) j0Var.f80434a);
                Intrinsics.checkNotNullParameter(text, "text");
                break;
            case 8:
                f31.y it2 = (f31.y) obj;
                switch (i13) {
                    case 8:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        j0Var.f80434a = it2;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        j0Var.f80434a = it2;
                        break;
                }
                break;
            case 9:
                f31.y it3 = (f31.y) obj;
                switch (i13) {
                    case 8:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        j0Var.f80434a = it3;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        j0Var.f80434a = it3;
                        break;
                }
                break;
            case 10:
                Intrinsics.checkNotNullParameter((i51.g) obj, "it");
                break;
            case 11:
                VTOPinFeed productFiltersPinFeed = (VTOPinFeed) obj;
                Intrinsics.checkNotNullParameter(productFiltersPinFeed, "productFiltersPinFeed");
                j0Var.f80434a = productFiltersPinFeed;
                break;
            case 12:
                List pins = (List) obj;
                Intrinsics.checkNotNullParameter(pins, "pins");
                VTOPinFeed vTOPinFeed = (VTOPinFeed) j0Var.f80434a;
                if (vTOPinFeed != null) {
                    vTOPinFeed.H(pins);
                    break;
                }
                break;
            case 13:
                break;
            case 14:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                break;
            case 15:
                cn0.u uVar = (cn0.u) j0Var.f80434a;
                if (uVar != null) {
                    cn0.i iVar = uVar.f28108a;
                    AtomicBoolean atomicBoolean = iVar.f28079l;
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        i1 i1Var = iVar.f28077j;
                        i1Var.f20164c.execute(new c2(iVar, 18));
                        i1Var.close();
                    }
                }
                break;
            default:
                ro2.n it4 = (ro2.n) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                j0Var.f80434a = it4;
                break;
        }
        return Unit.f80348a;
    }
}
