package kt0;

import com.pinterest.api.model.v7;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80795i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f80796j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(e0 e0Var, int i13) {
        super(1);
        this.f80795i = i13;
        this.f80796j = e0Var;
    }

    public final void b(v7 v7Var) {
        int i13 = this.f80795i;
        Object obj = null;
        e0 e0Var = this.f80796j;
        switch (i13) {
            case 0:
                if (e0Var.isBound()) {
                    String uid = v7Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    Iterator it = e0Var.f80816j.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.d(((lt0.e) next).f84786f, uid)) {
                                obj = next;
                            }
                        }
                    }
                    lt0.e eVar = (lt0.e) obj;
                    if (eVar != null) {
                        String j13 = v7Var.j1();
                        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                        if (!Intrinsics.d(eVar.f84782b, j13)) {
                            Intrinsics.checkNotNullParameter(j13, "<set-?>");
                            eVar.f84782b = j13;
                            e s33 = e0Var.s3();
                            if (s33 != null) {
                                ((q) s33).w8(e0Var.f80819m, e0Var.f80816j, false);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                if (e0Var.isBound()) {
                    String uid2 = v7Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    Iterator it2 = e0Var.f80816j.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (Intrinsics.d(((lt0.e) next2).f84786f, uid2)) {
                                obj = next2;
                            }
                        }
                    }
                    lt0.e eVar2 = (lt0.e) obj;
                    if (eVar2 != null) {
                        e0Var.f80816j.remove(eVar2);
                        e s34 = e0Var.s3();
                        if (s34 != null) {
                            ((q) s34).L0 = e0Var.f80816j.size() > 1;
                        }
                        e s35 = e0Var.s3();
                        if (s35 != null) {
                            ((q) s35).w8(e0Var.f80819m, e0Var.f80816j, false);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f80795i) {
            case 0:
                b((v7) obj);
                break;
            default:
                b((v7) obj);
                break;
        }
        return Unit.f80348a;
    }
}
