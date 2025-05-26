package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes3.dex */
final class az implements StandardIntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final bn f33440a;

    /* renamed from: b, reason: collision with root package name */
    private final bt f33441b;

    public az(bn bnVar, bt btVar) {
        this.f33440a = bnVar;
        this.f33441b = btVar;
    }

    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l13) {
        final long b13 = prepareIntegrityTokenRequest.b();
        final long longValue = l13.longValue();
        prepareIntegrityTokenRequest.a();
        final bt btVar = this.f33441b;
        final int i13 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(b13, longValue, i13) { // from class: com.google.android.play.core.integrity.bs

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f33486b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f33487c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return bt.this.a(this.f33486b, this.f33487c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long b13 = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f33440a.e(b13, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return az.this.a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
