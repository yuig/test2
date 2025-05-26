package mh2;

import g72.c0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements bj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final dj2.a f87169a;

    public b(a logRecordExporter) {
        Intrinsics.checkNotNullParameter(logRecordExporter, "logRecordExporter");
        this.f87169a = logRecordExporter;
    }

    @Override // bj2.c
    public final void U0(vi2.b context, bj2.l logRecord) {
        qi2.e eVar;
        String str;
        si2.g gVar;
        qi2.a aVar;
        bj2.b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logRecord, "logRecord");
        dj2.a aVar2 = this.f87169a;
        bj2.h[] hVarArr = new bj2.h[1];
        synchronized (logRecord.f23016i) {
            mj2.a aVar3 = logRecord.f23008a;
            zi2.a aVar4 = logRecord.f23009b;
            long j13 = logRecord.f23010c;
            long j14 = logRecord.f23011d;
            ui2.l lVar = logRecord.f23012e;
            si2.g gVar2 = logRecord.f23013f;
            String str2 = logRecord.f23014g;
            qi2.e eVar2 = logRecord.f23015h;
            synchronized (logRecord.f23016i) {
                try {
                    aj2.b bVar2 = logRecord.f23017j;
                    if (bVar2 == null || bVar2.isEmpty()) {
                        eVar = eVar2;
                        str = str2;
                        gVar = gVar2;
                        aVar = qi2.a.f104005d;
                    } else {
                        aj2.b bVar3 = logRecord.f23017j;
                        bVar3.getClass();
                        eVar = eVar2;
                        qi2.b bVar4 = new qi2.b();
                        str = str2;
                        gVar = gVar2;
                        bVar3.forEach(new c0(bVar4, 1));
                        aVar = bVar4.a();
                    }
                } finally {
                }
            }
            qi2.a aVar5 = aVar;
            aj2.b bVar5 = logRecord.f23017j;
            bVar = new bj2.b(bVar5 == null ? 0 : bVar5.f15432c, j13, j14, aVar5, eVar, gVar, lVar, aVar4, aVar3, str);
        }
        hVarArr[0] = bVar;
        aVar2.b(f0.l(hVarArr));
    }
}
