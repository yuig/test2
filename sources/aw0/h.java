package aw0;

import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20555i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinVideoExportWorker f20556j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(IdeaPinVideoExportWorker ideaPinVideoExportWorker, int i13) {
        super(1);
        this.f20555i = i13;
        this.f20556j = ideaPinVideoExportWorker;
    }

    public final void b(Throwable th3) {
        int i13 = this.f20555i;
        IdeaPinVideoExportWorker ideaPinVideoExportWorker = this.f20556j;
        switch (i13) {
            case 0:
                ideaPinVideoExportWorker.f46658o.q(th3, "IdeaPinVideoExportWorker: S3 Params Data prefetch error", tb0.p.IDEA_PINS_CREATION);
                break;
            case 1:
                ideaPinVideoExportWorker.f46658o.q(th3, "IdeaPinVideoExportWorker No Bitmap Loaded while generating Board Sticker Bitmap", tb0.p.IDEA_PINS_CREATION);
                break;
            default:
                ideaPinVideoExportWorker.f46658o.q(th3, "IdeaPinVideoExportWorker No Bitmap Loaded while generating Product Sticker Bitmap", tb0.p.IDEA_PINS_CREATION);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f20555i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
