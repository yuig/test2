package ug0;

import com.pinterest.experience.api.internal.ExperienceNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nm.q;

/* loaded from: classes.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122129i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f122130j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, int i13) {
        super(1);
        this.f122129i = i13;
        this.f122130j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f122129i;
        int i14 = 0;
        switch (i13) {
            case 0:
                vd0.c cVar = (vd0.c) obj;
                Intrinsics.f(cVar);
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                vd0.c m13 = cVar.m("data");
                HashMap l13 = m13 != null ? m13.l() : null;
                if (l13 != null) {
                    for (Map.Entry entry : l13.entrySet()) {
                        vd0.c cVar2 = (vd0.c) entry.getValue();
                        i iVar = this.f122130j;
                        if (cVar2 == null || cVar2.j(0, "code") != 12) {
                            String str = (String) entry.getKey();
                            vd0.c cVar3 = (vd0.c) entry.getValue();
                            iVar.getClass();
                            iVar.f122142g.c(new b(str, cVar3));
                        } else {
                            i.a(iVar, (String) entry.getKey(), new ExperienceNotFoundException());
                        }
                    }
                }
                return Unit.f80348a;
            case 1:
                Throwable th3 = (Throwable) obj;
                i iVar2 = this.f122130j;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th3);
                        i.a(iVar2, null, th3);
                        break;
                    default:
                        Intrinsics.f(th3);
                        i.a(iVar2, null, th3);
                        break;
                }
                return Unit.f80348a;
            case 2:
                i iVar3 = this.f122130j;
                iVar3.getClass();
                q qVar = new q();
                synchronized (iVar3.f122141f) {
                    try {
                        Iterator it = iVar3.f122141f.iterator();
                        while (it.hasNext()) {
                            qVar.t(((tg0.a) it.next()).a().f125623a);
                        }
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                synchronized (iVar3.f122141f) {
                    iVar3.f122141f.clear();
                }
                tg0.b bVar = iVar3.f122136a;
                String replace = qVar.toString().replace("\\\\", "");
                Intrinsics.checkNotNullExpressionValue(replace, "toFormEncodedString(...)");
                bVar.c(replace).r(tk2.e.f118017c).o(new d(2, new e(iVar3, i14)), new d(3, new e(iVar3, 1)));
                return Unit.f80348a;
            default:
                Throwable th5 = (Throwable) obj;
                i iVar4 = this.f122130j;
                switch (i13) {
                    case 1:
                        Intrinsics.f(th5);
                        i.a(iVar4, null, th5);
                        break;
                    default:
                        Intrinsics.f(th5);
                        i.a(iVar4, null, th5);
                        break;
                }
                return Unit.f80348a;
        }
    }
}
