package sq;

import android.content.res.ColorStateList;
import bk.l;
import bk.o;
import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import xk2.m;
import xk2.v;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final v f114975a = m.b(h.f114974i);

    public static final bk.i a(int i13) {
        l lVar = new l();
        l lVar2 = new l();
        l lVar3 = new l();
        l lVar4 = new l();
        bk.a aVar = new bk.a(0.0f);
        bk.a aVar2 = new bk.a(0.0f);
        bk.a aVar3 = new bk.a(0.0f);
        bk.a aVar4 = new bk.a(0.0f);
        bk.f fVar = new bk.f();
        bk.f fVar2 = new bk.f();
        bk.f fVar3 = new bk.f();
        bk.f fVar4 = new bk.f();
        bk.m mVar = new bk.m();
        mVar.f23078a = lVar;
        mVar.f23079b = lVar2;
        mVar.f23080c = lVar3;
        mVar.f23081d = lVar4;
        mVar.f23082e = aVar;
        mVar.f23083f = aVar2;
        mVar.f23084g = aVar3;
        mVar.f23085h = aVar4;
        mVar.f23086i = fVar;
        mVar.f23087j = fVar2;
        mVar.f23088k = fVar3;
        mVar.f23089l = fVar4;
        mVar.d(i13);
        o a13 = mVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        bk.i iVar = new bk.i(a13);
        iVar.t(ColorStateList.valueOf(0));
        return iVar;
    }

    public static final String b(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String z63 = f30Var.z6();
        if (z63 != null && !z.j(z63)) {
            return z63;
        }
        String r43 = f30Var.r4();
        return r43 == null ? "" : r43;
    }

    public static final boolean c(f30 f30Var, String str) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        if (str != null) {
            if (com.bumptech.glide.d.o0(((b60.d) ((b60.b) f114975a.getValue())).f() != null ? Boolean.valueOf(!dl2.b.S1(r1, str)) : null)) {
                return true;
            }
        }
        return false;
    }
}
