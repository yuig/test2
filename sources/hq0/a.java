package hq0;

import com.pinterest.framework.multisection.datasource.pagedlist.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.h;
import pc.n0;
import x40.jg;
import x40.kg;
import x40.mh;
import x40.nh;
import x40.oh;
import x40.ph;
import x40.qh;
import x40.rh;
import x40.sh;
import z40.b0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f69898j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f69899k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69900i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f69900i = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ph phVar;
        ?? r33;
        oh ohVar;
        oh ohVar2;
        List<nh> list;
        mh mhVar;
        jg jgVar;
        kg kgVar;
        switch (this.f69900i) {
            case 0:
                h response = (h) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                n0 n0Var = response.f99563c;
                String str = null;
                sh shVar = n0Var instanceof sh ? (sh) n0Var : null;
                if (shVar != null && (jgVar = shVar.f133277a) != null) {
                    Intrinsics.checkNotNullParameter(jgVar, "<this>");
                    rh rhVar = jgVar instanceof rh ? (rh) jgVar : null;
                    if (rhVar != null && (kgVar = rhVar.f133217e) != null) {
                        Intrinsics.checkNotNullParameter(kgVar, "<this>");
                        qh qhVar = kgVar instanceof qh ? (qh) kgVar : null;
                        if (qhVar != null) {
                            phVar = qhVar.f133128e;
                            if (phVar != null || (list = phVar.f133050a) == null) {
                                r33 = q0.f80391a;
                            } else {
                                r33 = new ArrayList();
                                for (nh nhVar : list) {
                                    if (nhVar == null || (mhVar = nhVar.f132900a) == null) {
                                        mhVar = null;
                                    } else {
                                        Intrinsics.checkNotNullParameter(mhVar, "<this>");
                                    }
                                    if (mhVar != null) {
                                        r33.add(mhVar);
                                    }
                                }
                            }
                            if (phVar != null && (ohVar2 = phVar.f133051b) != null) {
                                str = ohVar2.f132996a;
                            }
                            return new l(str, r33, (phVar != null || (ohVar = phVar.f133051b) == null) ? false : ohVar.f132998c);
                        }
                    }
                }
                phVar = null;
                if (phVar != null) {
                }
                r33 = q0.f80391a;
                if (phVar != null) {
                    str = ohVar2.f132996a;
                }
                return new l(str, r33, (phVar != null || (ohVar = phVar.f133051b) == null) ? false : ohVar.f132998c);
            default:
                b0 item = (b0) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                return item.getId();
        }
    }
}
