package aw0;

import com.pinterest.feature.ideaPinCreation.worker.UploadIdeaPinImageMediaWorker;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ UploadIdeaPinImageMediaWorker f20586i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f20587j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f20588k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker, long j13, long j14) {
        super(1);
        this.f20586i = uploadIdeaPinImageMediaWorker;
        this.f20587j = j13;
        this.f20588k = j14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xu1.i iVar = (xu1.i) obj;
        UploadIdeaPinImageMediaWorker uploadIdeaPinImageMediaWorker = this.f20586i;
        fe0.b bVar = uploadIdeaPinImageMediaWorker.f46698s;
        String E = uploadIdeaPinImageMediaWorker.E();
        ex0.e i03 = g3.i0(this.f20587j, System.currentTimeMillis(), this.f20588k);
        long currentTimeMillis = System.currentTimeMillis();
        ex0.g gVar = ex0.g.IN_PROGRESS;
        String C = uploadIdeaPinImageMediaWorker.C();
        Intrinsics.f(iVar);
        bVar.a(new ex0.a(E, i03, Long.valueOf(this.f20588k), currentTimeMillis, g3.A2(iVar), gVar, C, false));
        return Unit.f80348a;
    }
}
