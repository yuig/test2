package aw0;

import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.f0;

/* loaded from: classes5.dex */
public final class l implements jg1.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f20566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdeaPinVideoExportWorker f20567b;

    public l(f0 f0Var, IdeaPinVideoExportWorker ideaPinVideoExportWorker) {
        this.f20566a = f0Var;
        this.f20567b = ideaPinVideoExportWorker;
    }

    @Override // jg1.r
    public final void a(Exception exc) {
        IdeaPinVideoExportWorker ideaPinVideoExportWorker = this.f20567b;
        ideaPinVideoExportWorker.getClass();
        boolean z13 = false;
        if (mg1.b.g(exc.getMessage())) {
            int i13 = ideaPinVideoExportWorker.O + 1;
            ideaPinVideoExportWorker.O = i13;
            if (i13 <= 3) {
                z13 = true;
            }
        }
        this.f20566a.f80424a = z13;
        if (!z13) {
            throw exc;
        }
    }

    @Override // jg1.r
    public final void b() {
    }

    @Override // jg1.r
    public final void onCanceled() {
        throw new CancellationException("Composer Cancelled");
    }
}
