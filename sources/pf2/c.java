package pf2;

import android.os.Debug;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class c extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        a aVar = (a) this.receiver;
        aVar.f100015d.f100032c = longValue;
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && aVar.f100015d.f100034e) {
            aVar.f100015d.f100034e = false;
            of2.e eVar = aVar.f100014c;
            if (eVar != null) {
                eVar.h(aVar.f100016e, longValue);
            }
        }
        return Unit.f80348a;
    }
}
