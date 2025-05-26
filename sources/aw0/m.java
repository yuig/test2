package aw0;

import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class m extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Function0 f20568r;

    /* renamed from: s, reason: collision with root package name */
    public long f20569s;

    /* renamed from: t, reason: collision with root package name */
    public long f20570t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f20571u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ IdeaPinVideoExportWorker f20572v;

    /* renamed from: w, reason: collision with root package name */
    public int f20573w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(IdeaPinVideoExportWorker ideaPinVideoExportWorker, bl2.c cVar) {
        super(cVar);
        this.f20572v = ideaPinVideoExportWorker;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f20571u = obj;
        this.f20573w |= Integer.MIN_VALUE;
        return this.f20572v.z(null, 0L, 0L, this);
    }
}
